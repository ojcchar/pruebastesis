/*
Oracle PL/SQL grammar built with ANTLR v3.2 and v3.1.3. I only vouch that it works for v3.2, though.

Author: Patrick Higgins
License: GNU Lesser General Public License, version 2.1 or (at your option) any later version.

I have used a swallow_to_semi trick to avoid parsing SQL statements and other statements that were not of value to me.
The idea was that a separate parser for SQL would be created (I believe this is what Oracle itself does).

Nearly all of the PL/SQL language from 11g is in this grammar, though. It works on all files in a fairly large code
base.

This has some limited support for parsing SQL*Plus files, which turns out to be pretty hard to work into ANTLR.

It works for my usage, but I think doing it properly would mean writing a Java class to parse the SQL*Plus language
(which is pretty simple and shouldn't need ANTLR) and another adapter for ANTLR which enables tracking back to the
original source line numbers. This PL/SQL parser might be invoked many times for each SQL*Plus file.
*/

grammar PLSQLTree;

options {
  output=AST;
}

tokens {
    PROC;
    DECL;
    PROC_CALL;    
    DEFCURSOR;
    PARAMS;
    PARAM;
    BODY;
    VARDECL;
    PROCNAME;
    PACKCALL;
    STRING;
    PACKNAME;
    PACK;
}

@header {
package org.plsql;
}

@members {

public String getErrorHeader(RecognitionException e) {
    return getSourceName()+":"+e.line+":"+(e.charPositionInLine+1)+":";
}

public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    List stack = getRuleInvocationStack(e, this.getClass().getName());
    String msg = null;
    if (e instanceof NoViableAltException) {
        NoViableAltException nvae = (NoViableAltException) e;
        msg = " no viable alt; token="+e.token+
              " (decision="+nvae.decisionNumber+
              " state "+nvae.stateNumber+")"+
              " decision=<<"+nvae.grammarDecisionDescription+">>";
    }
    else {
        msg = super.getErrorMessage(e, tokenNames);
    }
    return stack+" "+msg;
}
    
public String getTokenErrorDisplay(Token t) {
    return t.toString();
}

}

@lexer::header {
package org.plsql;
}

@lexer::members {
public String getErrorHeader(RecognitionException e) {
    return getSourceName()+":"+e.line+":"+(e.charPositionInLine+1)+":";
}

// needed for things like BETWEEN 1..2 where 1. would be treated as a literal
private boolean numberDotValid() {
    int i = 1;
    while (input.LA(i) >= '0' && input.LA(i) <= '9') {
        i++;
    }
    return input.LA(i) == '.' && input.LA(i+1) != '.';
}
}


sqlplus_file
    : ( create_object ( DIVIDE show_errors )? DIVIDE? )+ EOF
    ;
    
show_errors
    : kSHOW kERRORS SEMI?
    ;

create_object
    : create_package
    | create_package_body
    | create_function
    | create_procedure
    ;

procedure_heading :
        PROCEDURE procedure_nam parameter_declarations? 
    ;

procedure_nam 
	:
	ID -> ^(PROCNAME ID)	
	;

function_heading :
        FUNCTION ID parameter_declarations? RETURN datatype
    ;

parameter_declarations :
        (   LPAREN  parameter_declaration ( COMMA  parameter_declaration )* RPAREN ) 
        -> ^(PARAMS LPAREN  parameter_declaration ( COMMA  parameter_declaration )* RPAREN)
    ;

parameter_declaration :
       parameter_declaration_spec -> ^(PARAM parameter_declaration_spec  )
    ;	
    
parameter_declaration_spec
	:	 ID ( IN | ( ( OUT | IN OUT ) NOCOPY? ) )? datatype
        ( ( ASSIGN | DEFAULT ) expression )?;

declare_section : 
    ( 
    declare_section_items
    )+ -> ^(DECL (declare_section_items)+)
    ;
    
declare_section_items :
    type_definition SEMI 
    | subtype_definition SEMI 
    | cursor_definition SEMI 
    | item_declaration SEMI 
    | function_declaration_or_definition SEMI 
    | procedure_declaration_or_definition SEMI 
    | pragma SEMI 
	; 

cursor_definition :
        CURSOR ID parameter_declarations? IS select_statement -> ^(DEFCURSOR CURSOR ID parameter_declarations? IS select_statement)
    ;

item_declaration
    : 
    item_declaration_items ->^(VARDECL item_declaration_items)
    ;

item_declaration_items
	:	
	variable_declaration
    | constant_declaration
    | exception_declaration
	;

variable_declaration :
        ID datatype (  (  NOT NULL )? (  ASSIGN  | DEFAULT ) expression  )?
    ;

constant_declaration :
        ID CONSTANT datatype ( NOT NULL )? (   ASSIGN  | DEFAULT  ) expression
    ;

exception_declaration :
        ID EXCEPTION
    ;

type_definition :
        kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
    ;

subtype_definition :
        SUBTYPE ID IS datatype ( NOT NULL )?
    ;
    
record_type_definition :
	RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
    ;

record_field_declaration :
	ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
    ;

collection_type_definition
	:	varray_type_definition
	|	nested_table_type_definition
	;

varray_type_definition
	:	( VARYING ARRAY? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
	;

nested_table_type_definition
	:	TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
	;

associative_index_type
	:	datatype
	;

ref_cursor_type_definition
	:	REF CURSOR ( RETURN datatype )?
	;

datatype
    : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
    ;

function_declaration_or_definition :
        function_heading
        ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
        ( is_as declare_section? body )?
	;

function_declaration :
        function_heading
        ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
    ;

function_definition :
        function_heading
        ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
        is_as declare_section? body
	;

procedure_declaration_or_definition :
        procedure_heading
        ( is_as declare_section? body )? -> ^(PROC procedure_heading
        ( is_as declare_section? body )?)
    ;

is_as	:	( IS | AS )
	;

procedure_declaration :
	procedure_heading
	;

procedure_definition :
	procedure_heading
	procedure_is_as declare_section
	? body -> ^(PROC procedure_heading
	procedure_is_as declare_section
	? body)
	;

procedure_is_as
	:	
	is_as
	;	
	
body 	:	
	BEGIN body_spec END ID? -> ^(BODY BEGIN body_spec END ID?)
	;
body_spec
	:	
	statement SEMI st_pragma
	( EXCEPTION exception_handler+ )? 
	;	
	
st_pragma 
	:
	( statement SEMI | pragma SEMI )*	
	;

exception_handler
	:	WHEN ( qual_id ( OR qual_id )* | OTHERS )
		THEN ( statement SEMI )+
	;
	
statement :
    label*
    ( assign_or_call_statement
    | case_statement
    | close_statement
    | continue_statement
    | basic_loop_statement
    | execute_immediate_statement
    | exit_statement
    | fetch_statement
    | for_loop_statement
    | forall_statement
    | goto_statement
    | if_statement
    | null_statement
    | open_statement
    | plsql_block
    | raise_statement
    | return_statement
    | sql_statement
    | while_loop_statement
    )
    ;

lvalue
    : call ( DOT call )* -> ^(PACKCALL call ( DOT call )*)
    ;

assign_or_call_statement
    : lvalue ( DOT delete_call | ASSIGN expression )?
    ;

call
    : COLON? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? 
    ;

delete_call
    : DELETE ( LPAREN parameter? RPAREN )?
    ;

basic_loop_statement :
        LOOP ( statement SEMI )+ END LOOP label_name?
    ;

case_statement :
        CASE expression?
        ( WHEN expression THEN ( statement SEMI )+ )+
        ( ELSE statement SEMI )?
        END CASE label_name?
    ;

close_statement :
        CLOSE ID ( DOT ID )?
    ;

continue_statement :
        CONTINUE ( lbl=ID )? ( WHEN expression )?
    ;

execute_immediate_statement :
        EXECUTE IMMEDIATE expression (
        ( into_clause | bulk_collect_into_clause) using_clause?
        | using_clause dynamic_returning_clause?
        | dynamic_returning_clause
        )?
    ;

exit_statement :
        EXIT ( lbl=ID )? ( WHEN expression )?
    ;

fetch_statement :
        FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
    ;
    
into_clause :
        INTO lvalue ( COMMA lvalue )*
    ;
    
bulk_collect_into_clause :
        BULK COLLECT INTO lvalue ( COMMA lvalue )*
    ;

using_clause :
        USING param_modifiers? expression ( COMMA param_modifiers? expression )*
    ;

param_modifiers
	: IN OUT? | OUT
	;

dynamic_returning_clause :
        ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
    ;

for_loop_statement :
        FOR ID IN ( ~(LOOP) )+ LOOP ( statement SEMI )+ END LOOP label_name?
    ;

forall_statement :
        FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
    ; 

bounds_clause 
    : numeric_expression DOUBLEDOT numeric_expression
    | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
    | kVALUES kOF atom
    ;

goto_statement :
        GOTO label_name
    ;

if_statement :
        IF expression THEN ( statement SEMI )+
        ( ELSIF expression THEN ( statement SEMI )+ )*
        ( ELSE ( statement SEMI )+ )?
        END IF
    ;

null_statement :
        NULL
    ;

open_statement :
        OPEN ID ( DOT ID )* call_args? ( FOR select_statement )?
    ;

pragma :
        PRAGMA swallow_to_semi
    ;

raise_statement :
        RAISE ( ID ( DOT ID )* )?
    ;

return_statement :
        RETURN expression?
    ;

plsql_block :
        ( DECLARE declare_section )? body
    ;

label :
        LLABEL label RLABEL
    ;

qual_id :
	COLON? ID ( DOT COLON? ID )*
    ;

sql_statement
    : commit_statement
    | delete_statement
    | insert_statement
    | lock_table_statement
    | rollback_statement
    | savepoint_statement
    | select_statement
    | set_transaction_statement
    | update_statement
    ;

commit_statement :
        COMMIT swallow_to_semi?
    ;

delete_statement :
        DELETE swallow_to_semi
    ;

insert_statement :
        INSERT swallow_to_semi
    ;

lock_table_statement :
        LOCK TABLE swallow_to_semi
    ;

rollback_statement :
        ROLLBACK swallow_to_semi?
    ;

savepoint_statement :
        SAVEPOINT ID
    ;

select_statement :
        SELECT swallow_to_semi
    ;

set_transaction_statement :
        SET TRANSACTION swallow_to_semi
    ;

update_statement :
        UPDATE swallow_to_semi
    ;

swallow_to_semi :
        ~( SEMI )+
    ;

while_loop_statement :
        WHILE expression LOOP ( statement SEMI )+ END LOOP label_name?
    ;

match_parens
    : ( options {greedy=false;} : ~( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
    | RPAREN match_parens LPAREN
    ;

label_name:	ID;

expression
    : or_expr
    ;

or_expr
    : and_expr ( OR and_expr )*
    ;

and_expr
    : not_expr ( AND not_expr )*
    ;

not_expr
    : NOT? compare_expr
    ;

compare_expr
    : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
    ;

is_null_expr
    : like_expr ( IS NOT? NULL)?
    ;

like_expr
    : between_expr ( NOT? LIKE between_expr )?
    ;

between_expr
    : in_expr ( NOT? BETWEEN in_expr AND in_expr )?
    ;

in_expr
    : add_expr ( NOT? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
    ;

numeric_expression
    : add_expr
    ;

add_expr
    : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
    ;

mul_expr
    : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
    ;

unary_sign_expr
    : ( MINUS | PLUS )? exponent_expr
    ;

exponent_expr
    : atom ( EXPONENT atom )?
    ;

atom
    : variable_or_function_call ( PERCENT attribute )?
    | SQL PERCENT attribute
    | string_literal
    | numeric_atom
    | boolean_atom
    | NULL
    | LPAREN expression RPAREN
    ;
    
variable_or_function_call
    : variable_or_function_call_spec -> ^(PROC_CALL variable_or_function_call_spec)
    
    ;
variable_or_function_call_spec
	:call ( DOT call )* ( DOT delete_call )?	;

attribute
    : BULK_ROWCOUNT LPAREN expression RPAREN
    | kFOUND
    | ISOPEN
    | NOTFOUND
    | kROWCOUNT
    ;

call_args
    : LPAREN ( parameter ( COMMA parameter )* )? RPAREN
    ;

boolean_atom
    : boolean_literal
    | collection_exists
    | conditional_predicate
    ;

numeric_atom
    : numeric_literal
    ;

numeric_literal
    : INTEGER
    | REAL_NUMBER
    ;

boolean_literal
    : TRUE
    | FALSE
    ;

string_literal
    : QUOTED_STRING -> ^(STRING QUOTED_STRING)
    ;

collection_exists
    : ID DOT EXISTS LPAREN expression RPAREN
    ;

conditional_predicate
    : INSERTING
    | UPDATING ( LPAREN QUOTED_STRING RPAREN )?
    | DELETING
    ;

parameter
    : ( ID ARROW )? expression
    ;

index
    : expression
    ;

create_package :
        CREATE ( OR kREPLACE )? PACKAGE ( schema_name=ID DOT )? package_name=ID
        ( invoker_rights_clause )?
        is_as ( declare_section )? END ( ID )? SEMI
    ;

create_package_body :
        CREATE ( OR kREPLACE )? PACKAGE BODY ( schema_name=ID DOT )? package_name=ID
        is_as ( declare_section )?
        ( initialize_section=body | END ( package_name2=ID )? )
        SEMI
    ;

package_body :
        PACKAGE BODY package_body_spec -> ^(PACK  PACKAGE BODY package_body_spec)
    ;

package_body_spec
	:	package_body_name
        is_as ( declare_section )?
        package_body_end
	;

package_body_name
	:	package_body_name_spec -> ^(PACKNAME package_body_name_spec)
	;

package_body_name_spec
	:	( schema_name=ID DOT )? package_name=ID 
	;

package_body_end
	:	( initialize_section=body | END ( package_name2=ID )? )
        SEMI
	;

create_procedure :
        CREATE ( OR kREPLACE )? PROCEDURE ( schema_name=ID DOT )? procedure_name=ID
        ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
        invoker_rights_clause?
        is_as
        ( declare_section? body
        | call_spec
        | EXTERNAL
        ) SEMI
    ;

create_function :
        CREATE ( OR kREPLACE )? FUNCTION ( schema_name=ID DOT )? function_name=ID
        ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
        RETURN datatype
        invoker_rights_clause?
        is_as
        ( declare_section? body
        | call_spec
        | EXTERNAL
        ) SEMI
    ;

invoker_rights_clause :
        AUTHID ( CURRENT_USER | DEFINER )
    ;

call_spec
    : LANGUAGE swallow_to_semi
    ;

kERRORS : {input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase())}? ID;
kEXCEPTIONS : {input.LT(1).getText().equalsIgnoreCase("exceptions")}? ID;
kFOUND : {input.LT(1).getText().equalsIgnoreCase("found")}? ID;
kINDICES : {input.LT(1).getText().equalsIgnoreCase("indices")}? ID;
kMOD : {input.LT(1).getText().equalsIgnoreCase("mod")}? ID;
kNAME : {input.LT(1).getText().equalsIgnoreCase("name")}? ID;
kOF : {input.LT(1).getText().equalsIgnoreCase("of")}? ID;
kREPLACE : {input.LT(1).getText().equalsIgnoreCase("replace")}? ID;
kROWCOUNT : {input.LT(1).getText().equalsIgnoreCase("rowcount")}? ID;
kSAVE : {input.LT(1).getText().equalsIgnoreCase("save")}? ID;
kSHOW : {input.LT(1).getText().equalsIgnoreCase("show")}? ID;
kTYPE : {input.LT(1).getText().equalsIgnoreCase("type")}? ID;
kVALUES : {input.LT(1).getText().equalsIgnoreCase("values")}? ID;


AND	:	A N D 	;
ARRAY : A R R A Y  ;
AS : A S  ;
AUTHID: A U T H I D ;
BETWEEN : B E T W E E N  ;
BODY	:	B O D Y ;
BULK: B U L K ;
BULK_ROWCOUNT:  'bulk_rowcount';
BY	:	B Y ;
CASE: C A S E ;
CREATE: C R E A T E ;
COLLECT:	C O L L E C T ;
COMMIT	:	C O M M I T ;
CURRENT_USER:  'current_user';
DEFAULT : D E F A U L T  ;
DEFINER: D E F I N E R ;
DELETE	:	D E L E T E ;
ELSE : E L S E  ;
ELSIF	:	E L S I F ;
EXTERNAL:	E X T E R N A L ;
FALSE	:	F A L S E ;
FETCH	:	F E T C H ;
FOR : F O R  ;
FORALL : F O R A L L  ;
GOTO	:	G O T O ;
IF	:	I F ;
IN : I N  ;
INDEX : I N D E X  ;
INSERT	:	I N S E R T ;
INTO	:	I N T O ;
IS : I S  ;
LANGUAGE:	L A N G U A G E ;
LIKE : L I K E  ;
LIMIT : L I M I T  ;
LOCK	:	L O C K ;
NOT : N O T  ;
NOTFOUND:	N O T F O U N D ;
NULL : N U L L  ;
OPEN	:	O P E N ;
OR : O R  ;
PACKAGE: P A C K A G E ;
RAISE	:	R A I S E ;
ROLLBACK:	R O L L B A C K ;
SAVEPOINT	:	S A V E P O I N T ;
SELECT	:	S E L E C T ;
SET	:	S E T ;
SQL	:	S Q L ;
TABLE	:	T A B L E ;
TRANSACTION	:	T R A N S A C T I O N ;
TRUE	:	T R U E ;
THEN : T H E N  ;
UPDATE	:	U P D A T E ;
WHILE	:	W H I L E ;
INSERTING
	:	I N S E R T I N G ;
UPDATING:	U P D A T I N G ;
DELETING:	D E L E T I N G ;
ISOPEN	:	I S O P E N ;
EXISTS	:	E X I S T S ;

BEGIN	:	B E G I N 	;
CLOSE	:	C L O S E ;
CONSTANT	:	C O N S T A N T 	;
CONTINUE:	C O N T I N U E ;
CURSOR	:	C U R S O R 	;
DECLARE	:	D E C L A R E 	;
DETERMINISTIC	: D E T E R M I N I S T I C 	;
END	:	E N D 	;
EXCEPTION	:	E X C E P T I O N 	;
EXECUTE	:	E X E C U T E ;
EXIT	:	E X I T ;
FUNCTION	:	F U N C T I O N 	;
IMMEDIATE	:	I M M E D I A T E ;
LOOP	:	L O O P ;
NOCOPY	:	N O C O P Y 	;
OTHERS	:	O T H E R S 	;
OUT	:	O U T 	;
PARALLEL_ENABLE	:	'parallel_enable';
PIPELINED	:	P I P E L I N E D 	;
PRAGMA	:	P R A G M A 	;
PROCEDURE	:	P R O C E D U R E 	;
RECORD	:	R E C O R D 	;
REF	:	R E F 	;
RESULT_CACHE	:	'result_cache'	;
RETURN	:	R E T U R N 	;
RETURNING	:	R E T U R N I N G 	;
ROWTYPE	:	R O W T Y P E 	;
SUBTYPE	:	S U B T Y P E 	;
USING:	U S I N G 	;
VARRAY	:	V A R R A Y 	;
VARYING	:	V A R Y I N G 	;
WHEN	:	W H E N 	;

QUOTED_STRING
	:	( 'N ' )? '\'' ( '\'\'' | ~('\'') )* '\''
	;

ID
	:	(( 'a' .. 'z' )  | ('A' .. 'Z'))
		( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
	|	DOUBLEQUOTED_STRING
	;
SEMI
	:	';'
	;
COLON
	:	':'
	;
DOUBLEDOT
	:	POINT POINT
	;
DOT
	:	POINT
	;

fragment
POINT
	:	'.'
	;
COMMA
	:	','
	;
EXPONENT
	:	'**'
	;
ASTERISK
	:	'*'
	;
AT_SIGN
	:	'@'
	;
RPAREN
	:	')'
	;
LPAREN
	:	'('
	;
RBRACK
	:	']'
	;
LBRACK
	:	'['
	;
PLUS
	:	'+'
	;
MINUS
	:	'-'
	;
DIVIDE
	:	'/'
	;
EQ
	:	'='
	;
PERCENT
	:	'%'
	;
LLABEL
	:	'<<'
	;
RLABEL
	:	'>>'
	;
ASSIGN
	:	':='
	;
ARROW
	:	'=>'
	;
VERTBAR
	:	'|'
	;
DOUBLEVERTBAR
	:	'||'
	;
NOT_EQ
	:	'<>' | '!=' | '~='| '^='
	;
LTH
	:	'<'
	;
LEQ
	:	'<='
	;
GTH
	:	'>'
	;
GEQ
	:	'>='
	;
INTEGER
    :   NUM
    ;
REAL_NUMBER
	:	NUMBER_VALUE	( 'e' ( PLUS | MINUS )? NUM )?
	;
fragment
NUMBER_VALUE
	:	{numberDotValid()}?=> NUM POINT NUM?
	|	POINT NUM
	|	NUM
	;
fragment
NUM
	: '0' .. '9' ( '0' .. '9' )*
	;
fragment
DOUBLEQUOTED_STRING
	:	'"' ( ~('"') )* '"'
	;
WS	:	(' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
	;
SL_COMMENT
	:	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;
ML_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');