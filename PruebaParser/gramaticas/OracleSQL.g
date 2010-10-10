/*******************************************************************************

DESCRIPTION:
		Grammar for Oracle's SELECT statement for ANTLR v3, target C language
AUTHOR:
		Ivan.Brezina (ibre5041@ibrezina.net)

DATE:
		AUG 2010
BASED ON:
		PLSQL3.g Andrey Kharitonkin (thikone@gmail.com)
		PLSQLGrammar.g for ANTLR v2
		Qazi Firdous Ahmed (qazif_ahmed@infosys.com) 
		Krupa Benhur (krupa_bg@infosys.com)
		Manojaba Banerjee (manojaba_banerjee@infosys.com)
		Infosys Technologies Ltd., Bangalore, India
		Sept 18, 2002
		This grammar is for PL/SQL.
COMMENT:
		This grammar file is based on freely downloadable
		file PLSQL3.g. I extracted only those rules that
		are mandatory for SELECT statement - no PL/SQL support.
		Column list was partialy rewritten. These features were added:
		- support for analytic queries
		- list of reserved words and keywords
		- query factoring
		- model
		- perl style string notation 
ORIGINAL COMMENT:
		The grammar has been mostly re-written for ANTLR v3,
		using Oracle 10g Release 2 documentation and ANTLR book.
		New SQL and PL/SQL expression rules, SQL statments
		SELECT, INSERT, UPDATE, DELETE are fully supported.
		Generated parser can parse most of valid PL/SQL and 
		it was tested with over 10 Mb of test source code.
		Let me know if something cannot be parsed by this grammar.
KNOWN ISSUES:
		XQUERIES are unsupported. List of reserved words/keywords
		needs to be amended. PL/SQL support was removed.
		Some reserved words are treaded like keywords('JOIN', 'MODEL', 'PARTITION', ...)
*******************************************************************************/

grammar OracleSQL;

options {
//	language=Java;
	language=C;
	backtrack=true;
	memoize=true;
	output=AST;
//	ASTLabelType=CommonTree;
}

tokens {
    T_RESERVED = 'reserved';
    T_ALIAS = 'alias';
    T_TABLE_NAME = 'table_name';
    
    T_WITH = 't_with';
    T_SELECT = 't_select';
    T_COLUMN_LIST = 't_column_list';
    T_SELECT_COLUMN = 't_select_column';
    T_FROM = 't_from';
    T_SELECTED_TABLE = 'selected_table';
    T_WHERE = 't_where';
    T_HIERARCHICAL = 't_hierarchical';
    T_GROUP_BY = 't_group_by';
    T_HAVING = 't_having';
    T_MODEL = 't_model';
    T_UNION = 't_union';
    T_ORDER_BY_CLAUSE='t_order_by';
    T_FOR_UPDATE_CLAUSE='t_for_update';

    T_COND_OR='t_cond_or';
    T_COND_AND='t_cond_and';
    T_COND_NOT='t_cond_not';
    T_COND_exists='t_cond_exists';
    T_COND_is='t_cond_is';
    T_COND_comparison='t_cond_comparison';
    T_COND_group_comparison='t_cond_group_comparison';
    T_COND_in='t_cond_in';
    T_COND_is_a_set='t_cond_is_a_set';
    T_COND_is_any='t_cond_is_any';
    T_COND_is_empty='t_cond_is_empty';
    T_COND_is_of_type='t_cond_is_of_type';
    T_COND_is_present='t_cond_is_present';
    T_COND_like='t_cond_like';
    T_COND_memeber='t_cond_memeber';
    T_COND_between='t_cond_between';
    T_COND_regexp_like='t_cond_regexp_like';
    T_COND_submultiset='t_cond_submultiset';
    T_COND_equals_path='t_cond_equals_path';
    T_COND_under_path='t_cond_under_path';
    T_COND_paren='t_cond_paren';
}

// @members {
//     private boolean is_sql = false;
// }

// @header {
//   package org.tora;
// }

// @lexer::header {
//   package org.tora;
// }

//@parser::includes {
//  #include "expr.h"
//}

// @lexer::includes {
// #include "error_handler.h"
// }

// @parser::includes {
// #include "error_handler.h"
// }

// @lexer::apifuncs {
//             RECOGNIZER->displayRecognitionError = myDisplayRecognitionLexerError;
// }

// @parser::apifuncs {
//             RECOGNIZER->displayRecognitionError = myDisplayRecognitionParserError;
// }
        
//@members {
//  ExprFactory *exprFactory;
//	unsigned _class;
//}

start_rule
	: (
            select_statement
        |	update_statement
        |	insert_statement
        |	merge_statement
        |	delete_statement            
        )            
        SEMI
        ;      
/* ================================================================================
   DELETE Statement
   ================================================================================ */
delete_statement
    : k_delete k_from?
        (
            dml_table_expression_clause
        |      k_only LPAREN dml_table_expression_clause RPAREN
        )
        t_alias? where_clause? returning_clause? error_logging_clause?
    ;

/* ================================================================================
   MERGE Statement
   ================================================================================ */
merge_statement
	: k_merge k_into (schema_name DOT)? table_name t_alias?
        k_using
        (
            subquery
        |	(schema_name DOT)? table_name
        )
        t_alias? k_on LPAREN sql_condition RPAREN
        merge_update_clause? merge_insert_clause? error_logging_clause?
    ;

merge_update_clause
	: k_when k_matched k_then k_update k_set column_spec EQ (k_default | sql_expression)
        (COMMA column_spec EQ (k_default | sql_expression))*
        where_clause? (k_delete where_clause)?
    ;

merge_insert_clause
	: k_when k_not k_matched k_then k_insert LPAREN column_spec (COMMA column_spec)* RPAREN
        k_values LPAREN (k_default | sql_expression) (COMMA (k_default | sql_expression))* RPAREN
        where_clause? 
    ;

/* ================================================================================
   INSERT Statement
   ================================================================================ */
insert_statement
	: k_insert (single_table_insert | multi_table_insert) SEMI
    ;
single_table_insert
	: insert_into_clause ( values_clause returning_clause? | subquery ) error_logging_clause?
    ;
insert_into_clause
	: k_into dml_table_expression_clause t_alias? ( LPAREN column_name ( COMMA column_name)* RPAREN )?
	;
values_clause
	: k_values LPAREN ( k_default | sql_expression) ( COMMA k_default | sql_expression)* RPAREN
    ;
returning_clause
    : ( k_return | k_returning ) sql_expression (COMMA sql_expression)* k_into data_item (COMMA data_item)*
    ;
multi_table_insert
	: (
            k_all ( insert_into_clause values_clause? error_logging_clause? )+
        |   conditional_insert_clause
        )
        subquery
    ;
conditional_insert_clause
	: ( k_all | k_first )?
        ( k_when sql_condition k_then ( insert_into_clause values_clause? )+ )+
        k_else ( insert_into_clause values_clause? )+
    ;
dml_table_expression_clause
	:	
		( schema_name DOT)? table_name ( partition_extension_clause | AT_SIGN sql_identifier/*TODO dblink*/)?
	|	subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)?
	|	LPAREN subquery subquery_restricrion_clause? RPAREN
	|	table_collection_clause
	;
error_logging_clause
	: k_log k_errors ( k_into (schema_name DOT)? table_name)? (LPAREN simple_expression RPAREN)? (k_reject k_limit (NUMBER | k_unlimited))?
    ;
data_item
	: sql_identifier
    ;

/* ================================================================================
   UPDATE Statement
   ================================================================================ */
update_statement
	: k_update ( k_only LPAREN dml_table_expression_clause RPAREN | dml_table_expression_clause) t_alias?
		update_set_clause where_clause? returning_clause? error_logging_clause?;

update_set_clause
	: k_set
        (
            k_value LPAREN t_alias RPAREN EQ ( simple_expression | LPAREN subquery RPAREN)
        |	(
                column_name EQ ( k_default | LPAREN subquery RPAREN | simple_expression)
            |	LPAREN column_name (COMMA column_name)* RPAREN EQ LPAREN subquery RPAREN
                (COMMA LPAREN column_name (COMMA column_name)* RPAREN EQ LPAREN subquery RPAREN)*
            )
        )
    ;
/* ================================================================================
   SELECT Statement
   ================================================================================ */
select_statement
	:
	subquery_factoring_clause?
	sel=k_select /*( hint )?*/ ( k_distinct | k_union | k_all )? select_list
	k_from
//        ( table_reference_list | join_clause | LPAREN join_clause RPAREN )
	table_reference_list        
	( where_clause )?
	( hierarchical_query_clause )?
	( group_by_clause )?
	( k_having sql_condition )?
	( model_clause )?
	( union_clause )?
	( order_by_clause )?
	( for_update_clause )?
	->	^('t_select'
		subquery_factoring_clause?
		$sel k_distinct? k_union? k_all?            
		select_list
		^('t_from' k_from table_reference_list/*? join_clause?*/)
		where_clause?
		hierarchical_query_clause?
		model_clause?
		union_clause?
		order_by_clause?
        for_update_clause?
		)
	;
/* ================================================================================
   subquery factoring
   ================================================================================ */
subquery_factoring_clause
	:
	with=k_with
// NOTE: these two lines were commented out just to preserve COMMAs in parse tree        
//	si1=sql_identifier (lp1=LPAREN sl1=select_list rp1=RPAREN)? as1=k_as sq1=subquery  
//	(COMMA si2=sql_identifier (lp2=LPAREN sl2=select_list rp2=RPAREN)? as2=k_as sq2=subquery)*
	subquery_factoring_clause_part_first subquery_factoring_clause_part_next*
	search_clause?
	cycle_clause?
		->^('t_with' $with subquery_factoring_clause_part_first subquery_factoring_clause_part_next* search_clause? cycle_clause?)
    ;
subquery_factoring_clause_part_first
	:	sql_identifier (LPAREN select_list RPAREN)? k_as subquery
    ;
subquery_factoring_clause_part_next
	:	COMMA sql_identifier (LPAREN select_list RPAREN)? k_as subquery
    ;

search_clause
	: k_search ( k_depth | k_breadth ) k_first k_by
 	( c_alias k_asc ? k_desc ? (k_nulls k_first)? (k_nulls k_last)? )
 	( COMMA c_alias k_asc ? k_desc ? (k_nulls k_first)? (k_nulls k_last)? )*
	k_set sql_identifier
	;

cycle_clause
	: k_cycle c_alias ( COMMA c_alias)* k_set sql_identifier k_to literal k_default literal
	;

/* ================================================================================
   Query column list specs (ie. everything between "SELECT" ... "FROM"
   ================================================================================ */
select_list
//	: displayed_column (COMMA displayed_column)*
	: displayed_column_part_first displayed_column_part_next*
		-> ^('t_column_list' displayed_column_part_first displayed_column_part_next*)
	;
displayed_column_part_first
	: displayed_column
    ;
displayed_column_part_next options { backtrack=false; }
	: c=COMMA displayed_column {$c->setChannel($c, 30); }
    ;        
displayed_column
	: (
        asterisk1=ASTERISK
		| schema=sql_identifier DOT asterisk2=ASTERISK
		| sql_expression
		)   
		(alias|alias_name=sql_identifier)?
        -> ^('t_select_column' $asterisk1? $schema? DOT? $asterisk2? sql_expression? alias? $alias_name? )
    ;
sql_expression
	:	expr_add
	;
expr_add
	:	expr_mul ( ( PLUS | MINUS | DOUBLEVERTBAR ) expr_mul )*
	;
expr_mul
	:	expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )*
	;
expr_sign // in fact this is not "sign" but unary operator
	:	( PLUS | MINUS | k_prior | k_connect_by_root )? expr_pow
	;
expr_pow
	:	expr_expr ( EXPONENT expr_expr )*
	;
expr_expr
	:	datetime_expression
	|	interval_expression        
	|	( expr_paren ) => expr_paren
	|	( cast_expression) => cast_expression
	|	( special_expression ) => special_expression
	|	( analytic_function ) => analytic_function
	|	( function_expression ) => function_expression
//	|	( compound_expression ) => compound_expression
	|	( case_expression ) => case_expression
//	|	( cursor_expression ) => cursor_expression
	|	( simple_expression ) => simple_expression
//	|	( select_expression ) => select_expression replaced with subquery
//	|	object_access_expression
//	|	scalar_subquery_expression
//	|	model_expression
//	|	type_constructor_expression
//	|	variable_expression
//	:	k_null | NUMBER | QUOTED_STRING | IDENTIFIER
	|	( subquery ) => subquery
	;
expr_paren
	:	LPAREN nested_expression RPAREN
	;
nested_expression
	:	sql_expression
	;
function_expression
 	:	(function_name|analytic_function_name) LPAREN call_parameters RPAREN
	;

call_parameters
	: ASTERISK
	| call_parameter ( COMMA call_parameter )*
	;
call_parameter
	:	 ( parameter_name ARROW )? nested_expression
	;
parameter_name
	:	identifier
	;
case_expression
	:	k_case ( simple_case_expression | searched_case_expression ) ( else_case_expression )? k_end
	;
simple_case_expression
	:	nested_expression ( k_when nested_expression k_then nested_expression )+
	;
searched_case_expression
	:	( k_when sql_condition k_then nested_expression )+
	;
else_case_expression
	:	k_else nested_expression
	;

simple_expression
	:	boolean_literal
	|	k_sql ( FOUND_ATTR | NOTFOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR )
	|	( cell_assignment ) => cell_assignment // this is used only in model_clause s[PROD= k_a ] = S[ 'a' ] + 1
	|	( column_spec ) => column_spec
	|	quoted_string
	|	NUMBER
	;        
query_block
	:	k_select /*( hint )?*/ ( k_distinct | k_unique | k_all )? select_list
		k_from table_reference_list
		( where_clause )?
		( hierarchical_query_clause )?
		( group_by_clause )?
		( k_having sql_condition )?
		( model_clause )?
	;

subquery
	:	LPAREN select_statement RPAREN
	|	LPAREN subquery RPAREN
	;

datetime_expression
	:
        ( function_expression | cast_expression | simple_expression )
        k_at (k_local | k_time k_zone ( quoted_string | k_dbtimezone | k_sessiontimezone | sql_expression ));

interval_expression
	:
		LPAREN ( function_expression | cast_expression | simple_expression ) MINUS ( function_expression | cast_expression | simple_expression ) RPAREN
		(	k_day (LPAREN NUMBER RPAREN)? k_to k_second (LPAREN NUMBER RPAREN)?
		|	k_year (LPAREN NUMBER RPAREN)? k_to k_month (LPAREN NUMBER RPAREN)?
		)
	;
/* ================================================================================
   Special expressions
   ================================================================================ */
special_expression
	:	cluster_set_clause
	;        
cluster_set_clause
	: k_cluster_set LPAREN column_spec (COMMA column_spec)? (COMMA NUMBER)? k_using (column_specs|ASTERISK) RPAREN
	;

cast_expression
	:	k_cast LPAREN (sql_expression | k_multiset subquery) k_as (datatype|sql_identifier) RPAREN
	;	
datatype
	:	k_binary_integer 
	|	k_binary_float
	|	k_binary_double
	|	k_natural
	|	k_positive
	|	( k_number | k_numeric | k_decimal | k_dec ) ( LPAREN NUMBER ( COMMA NUMBER )? RPAREN )?
	|	k_long ( k_raw)? ( LPAREN NUMBER RPAREN )?
	|	k_raw ( LPAREN NUMBER RPAREN )?
	|	k_boolean
	|	k_date
	|	k_interval k_day ( LPAREN NUMBER RPAREN )? k_to k_second ( LPAREN NUMBER RPAREN )?
	|	k_interval k_year ( LPAREN NUMBER RPAREN )? k_to k_month
	|	( k_time | k_timestamp ) ( LPAREN NUMBER RPAREN )? ( k_with ( k_local )? k_time k_zone )?
	|	k_integer
	|	k_int
	|	k_smallint
	|	k_float ( LPAREN NUMBER RPAREN )?
	|	k_real
	|	k_double k_precision
	|	k_char      ( k_varying )? ( LPAREN NUMBER ( k_byte | k_char )? RPAREN )? ( k_character k_set ( identifier | column_spec CHARSET_ATTR ) )?
	|	k_varchar                  ( LPAREN NUMBER ( k_byte | k_char )? RPAREN )? ( k_character k_set ( identifier | column_spec CHARSET_ATTR ) )?
	|	k_varchar2                 ( LPAREN NUMBER ( k_byte | k_char )? RPAREN )? ( k_character k_set ( identifier | column_spec CHARSET_ATTR ) )?
	|	k_character ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_nchar     ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_nvarchar  ( LPAREN NUMBER RPAREN )?
	|	k_nvarchar2 ( LPAREN NUMBER RPAREN )?
	|	k_national  ( k_character | k_char ) ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_mlslabel
	|	k_pls_integer
	|	k_blob
	|	k_clob ( k_character k_set ( identifier | column_spec CHARSET_ATTR ) )?
	|	k_nclob
	|	k_bfile
	|	k_rowid 
	|	k_urowid ( LPAREN NUMBER RPAREN )?
	;

boolean_literal
	:	k_true | k_false
	;

t_alias
	: alias_name=sql_identifier //{ $alias_name->setType($alias_name, T_ALIAS); }
//        { $type = T_ALIAS; }
	;

c_alias
	: (k_as? sql_identifier) //{ $alias_name->setType($alias_name, T_ALIAS); }
	| k_as
	;

alias
	:	k_as sql_identifier?
	;

column_spec
	: sql_identifier DOT sql_identifier DOT sql_identifier
	| sql_identifier DOT sql_identifier
	| sql_identifier
	| pseudo_column
	;
//TODO more pseudocolumns here - especially those who are reserved words
pseudo_column
	: k_null
    | k_sysdate
	| k_rowid
	| k_rownum
	| k_level				// hierarchical query
	| k_connect_by_isleaf
	| k_connect_by_iscycle
	| k_versions_starttime	// flashback query
	| k_versions_starscn
	| k_versions_endtime
	| k_versions_endscn 
	| k_versions_xid 
	| k_versions_operation
	| k_column_value	// XMLTABLE query
	| k_object_id		// 
	| k_object_value	//
	| k_ora_rowscn		//
	| k_xmldata
	;

function_name
	: sql_identifier DOT sql_identifier DOT sql_identifier
	| sql_identifier DOT sql_identifier
	| sql_identifier
	;

identifier
	:	ID
	|	DOUBLEQUOTED_STRING 
   	;

sql_identifier
	:	identifier
    |	keyword
	|	k_rowid
	|	k_rownum
	;

/* ================================================================================
   Query tables specs (ie. everything between "FROM" ... "WHERE"
   ================================================================================ */
table_reference_list
	:	(
			(join_clause|(LPAREN join_clause RPAREN)|table_reference)
			(COMMA (join_clause|(LPAREN join_clause RPAREN)|table_reference))*
		)
//	->('t_from' join_clause? LPAREN? join_clause? RPAREN? table_reference?
//                (COMMA (join_clause|(LPAREN join_clause RPAREN)|table_reference))*
//	)   
	;            
table_reference
	:	((k_only LPAREN query_table_expression RPAREN)
	|	query_table_expression /*( pivot_clause | unpivot_clause )?*/) flashback_query_clause? t_alias?
	;
query_table_expression
	:	//query_name
		( schema_name DOT)? table_name ( partition_extension_clause | AT_SIGN sql_identifier/*TODO dblink*/)? sample_clause? (pivot_clause|unpivot_clause)?
	|	subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)?
	|	LPAREN subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)? RPAREN
//TODO add subquery_restricrion_clause into subquery
	|	table_collection_clause (pivot_clause|unpivot_clause)?
	;
flashback_query_clause
	:	( k_versions k_between ( k_scn |k_timestamp) (sql_expression| k_mivalue ) k_and (sql_expression| k_maxvalue ))?
		k_as k_of ( k_scn |k_timestamp) sql_expression
	;
sample_clause
	:	k_sample k_block ? LPAREN sample_percent RPAREN ( k_seed LPAREN seed_value RPAREN)?
	;
partition_extension_clause
	:	k_partition (( LPAREN partition RPAREN ) | ( k_for LPAREN partition_key_value (COMMA partition_key_value)* RPAREN))
    |	k_subpartition (( LPAREN partition RPAREN ) | ( k_for LPAREN subpartition_key_value (COMMA subpartition_key_value)* RPAREN))
	;
subquery_restricrion_clause
	:	k_with ((k_read k_only) | (k_check k_option ( k_constraint constraint)?))
	;
table_collection_clause
	:	k_table /*LPAREN*/ collection_expression /*RPAREN*/ (LPAREN PLUS RPAREN)?
    ;
join_clause
	:	table_reference (inner_cross_join_clause|outer_join_clause)+
	;
inner_cross_join_clause
	:	k_inner? k_join table_reference ((k_on sql_condition)|(k_using LPAREN column_specs RPAREN))
    |	(k_cross | k_natural k_inner?) (k_join table_reference)
	;        
outer_join_clause
	:	( query_partition_clause )?
		(	outer_join_type k_join
		|	k_natural ( outer_join_type )? k_join
		)
		table_reference ( query_partition_clause )? ( k_on sql_condition | k_using LPAREN column_specs RPAREN )?
	;
query_partition_clause
	:	k_partition k_by expression_list
	;
outer_join_type
 	:	( k_full | k_left | k_right ) ( k_outer )?
	;        

sample_percent
	:	NUMBER
	;
seed_value
	:	NUMBER
	;
outer_join_sign
	:	LPAREN PLUS RPAREN
	;
table_name
	:	sql_identifier
	;
schema_name
	:	sql_identifier
	;
column_specs
	:	column_spec ( COMMA column_spec )*
	;
partition
	:	identifier        
	;
partition_key_value
	: identifier | NUMBER
	;
subpartition_key_value
	: identifier | NUMBER
	;
constraint
	:	sql_identifier
	;
collection_expression
	: subquery | LPAREN (cast_expression|function_expression) RPAREN | LPAREN column_spec RPAREN /* TODO collection constructor (+) */
	;

// table_reference_list
// 	:	selected_table ( COMMA selected_table )* (pivot_clause|unpivot_clause)?
// 	;
// join_clause
// 	:	table_name c_alias? ( inner_cross_join_clause | outer_join_clause )+
// 	;
// inner_cross_join_clause
// 	:	( k_inner )? k_join table_name c_alias? ( k_on sql_condition | k_using LPAREN column_specs RPAREN )
// 	|	( k_cross | k_natural ( k_inner ) ) k_join table_name c_alias?
// 	;
// outer_join_clause
// 	:	( query_partition_clause )?
// 		(	outer_join_type k_join
// 		|	k_natural ( outer_join_type )? k_join
// 		)
// 		table_name c_alias? ( query_partition_clause )?
// 		( k_on sql_condition | k_using LPAREN column_specs RPAREN )?
// 	;
// column_specs
// 	:	column_spec ( COMMA column_spec )*
// 	;
// query_partition_clause
// 	:	k_partition k_by expression_list
// 	;
// outer_join_type
// 	:	( k_full | k_left | k_right ) ( k_outer )?
// 	;
// outer_join_sign
// 	:	LPAREN PLUS RPAREN
// 	;
// selected_table
// 	:	( table_spec | ( k_table | k_the )? subquery ) (alias|alias_name=sql_identifier)?
//         -> ^('selected_table' table_spec? k_table? k_the? subquery? alias? $alias_name? )
// 	;

// table_spec
// 	:	( schema_name DOT )? table_name ( AT_SIGN link_name )?
// 		-> ^('selected_table' schema_name? DOT? table_name? AT_SIGN? link_name?)
// 	|	table_cast
// 		-> ^('selected_table' table_cast)
// 	;

// schema_name
// 	:	sql_identifier
// 	;
// table_name
// 	:	sql_identifier
// 	;
// table_alias
// 	:	( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
// 	;
// link_name
// 	:	sql_identifier
// 	;
// table_cast
// 	:	k_table LPAREN (simple_expression | select_expression | cast_expression) RPAREN
//     ;

/* ================================================================================
   where clause
   ================================================================================ */
where_clause
	:	k_where sql_condition
        -> ^( 't_where' k_where sql_condition)
	;
/* ================================================================================
   hierarchical query clause
   ================================================================================ */
hierarchical_query_clause
	:	k_connect k_by ( k_nocycle )? connect1=sql_condition ( k_start k_with start1=sql_condition )?
	-> ^('t_hierarchical' k_connect k_by k_nocycle? $connect1 k_start? k_with? $start1?)
	|	( k_start k_with start2=sql_condition ) k_connect k_by ( k_nocycle )? connect2=sql_condition
	-> ^('t_hierarchical' k_start k_with $start2 k_connect k_by k_nocycle? $connect2)
	;

/* ================================================================================
   group by clause
   ================================================================================ */
group_by_clause
	:	k_group k_by group_by_exprs
	-> ^('t_group_by' k_group k_by group_by_exprs)
	;
group_by_exprs
	:	group_by_expr ( COMMA group_by_expr )*
	;
group_by_expr
	:	rollup_cube_clause
	|	grouping_sets_clause
	|	grouping_expression_list
	;
rollup_cube_clause
	:	( k_rollup | k_cube ) LPAREN grouping_expression_list RPAREN
	;
grouping_sets_clause
	:	k_grouping k_sets LPAREN grouping_expression_list RPAREN
	;
grouping_sets_exprs
	:	grouping_sets_expr ( COMMA grouping_sets_expr )*
	;
grouping_sets_expr
	:	rollup_cube_clause | grouping_expression_list
	;
sql_condition
	:	condition_or
	;
condition_or
//	:	condition_and ( k_or condition_and )*
	:	(condition_or_part_first condition_or_part_next+ -> ^(T_COND_OR ^(T_COND_OR condition_or_part_first) condition_or_part_next*))
	|	condition_or_part_first
	;
condition_or_part_first
	:	condition_and
    ;
condition_or_part_next
	:	k_or condition_and -> ^(T_COND_OR k_or condition_and)
    ;
condition_and
//	:	condition_not ( k_and condition_not )*
    :	(condition_and_part_first condition_and_part_next+ -> ^(T_COND_AND ^(T_COND_AND condition_and_part_first) condition_and_part_next*))
	|	condition_and_part_first 
	;
condition_and_part_first
	:	condition_not
    ;
condition_and_part_next
	:	k_and condition_not -> ^(T_COND_AND k_and condition_not)
    ;
condition_not
	:	(k_not condition_expr -> ^(T_COND_NOT k_not condition_expr))
	|	condition_expr
	;
condition_expr
	:	condition_exists
	|	condition_is
	|	condition_comparison
	|	condition_group_comparison
	|	condition_in
	|	condition_is_a_set
	|	condition_is_any
	|	condition_is_empty
	|	condition_is_of_type
	|	condition_is_present
	|	condition_like
	|	condition_memeber
	|	condition_between
	|	condition_regexp_like
	|	condition_submultiset
	|	condition_equals_path
	|	condition_under_path
	|	condition_paren
	;

condition_exists
	:	k_exists subquery
	;
condition_is
	:	sql_expression k_is ( k_not )? ( k_nan | k_infinite | k_null )
	;
condition_comparison
	:	LPAREN sql_expressions RPAREN ( outer_join_sign )? ( EQ | NOT_EQ ) subquery ( outer_join_sign )?
	|	( k_prior )? sql_expression ( outer_join_sign )? ( EQ | NOT_EQ | GTH | GEQ | LTH | LEQ ) ( k_prior )? ( sql_expression | LPAREN select_statement RPAREN ) ( outer_join_sign )?
	;
condition_group_comparison
	:	LPAREN sql_expressions RPAREN ( EQ | NOT_EQ ) ( k_any | k_some | k_all ) LPAREN ( grouping_expression_list | select_statement ) RPAREN
	|	sql_expression ( EQ | NOT_EQ | GTH | GEQ | LTH | LEQ ) ( k_any | k_some | k_all ) LPAREN ( sql_expressions | select_statement ) RPAREN
	;
condition_in
	:	LPAREN sql_expressions RPAREN ( k_not )? k_in LPAREN ( grouping_expression_list | select_statement ) RPAREN
	|	sql_expression ( k_not )? k_in LPAREN ( expression_list | select_statement ) RPAREN
	;
condition_is_a_set
	:	nested_table_column_name k_is ( k_not )? k_a k_set
	;
condition_is_any
	:	( column_name k_is )? k_any
	;
condition_is_empty
	:	nested_table_column_name k_is ( k_not )? k_empty
	;
condition_is_of_type
	:	sql_expression k_is (k_not)? k_of ( k_type )? LPAREN type_name RPAREN
	;
condition_is_of_type_names
	:	condition_is_of_type_name ( COMMA condition_is_of_type_name )*
	;
condition_is_of_type_name
	:	( k_only )? type_name
	;
condition_is_present
	:	cell_reference k_is k_present
	;
condition_like
	:	sql_expression ( k_not )? ( k_like | k_likec | k_like2 | k_like4 ) sql_expression ( k_escape sql_expression )?
	;
condition_memeber
	:	sql_expression ( k_not )? k_member ( k_of )? nested_table_column_name
	;
condition_between
	:	sql_expression ( k_not )? k_between sql_expression k_and sql_expression
	;
condition_regexp_like
	:	k_regexp_like LPAREN call_parameters RPAREN
	;
condition_submultiset
	:	nested_table_column_name ( k_not )? k_submultiset ( k_of )? nested_table_column_name
	;
condition_equals_path
	:	k_equals_path LPAREN column_name COMMA path_string ( COMMA correlation_integer )? RPAREN
	;
condition_under_path
	:	k_under_path LPAREN column_name ( COMMA levels )? COMMA path_string ( COMMA correlation_integer )? RPAREN
	;
levels
	:	integer
	;
correlation_integer
	:	integer
	;
path_string
	:	quoted_string
	;
type_name
	:	identifier ( DOT identifier )*
	;
integer
	:	NUMBER
	;
column_name
	:	sql_identifier
	;
nested_table
	:	sql_identifier
	;
nested_table_column_name
	:	( schema_name DOT )? (table_name DOT)? (nested_table DOT)? column_name
	;
sql_expressions
	:	sql_expression ( COMMA sql_expression )*
	;
grouping_expression_list
	:	expression_list ( COMMA expression_list )*
	;
expression_list
	:	LPAREN sql_expressions RPAREN
	|	sql_expressions
	;
cell_reference
	:	sql_identifier
	;

condition_paren
	:	LPAREN sql_condition RPAREN
	;

/* ================================================================================
   MODEL clause
   ================================================================================ */
model_clause
	:	k_model main_model
        ( cell_reference_options )?
		( return_rows_clause )?
		( reference_model )* //main_model
	-> ^( 't_model' k_model main_model cell_reference_options? return_rows_clause? reference_model* )
	;
cell_reference_options
	:	( ( k_ignore | k_keep ) k_nav )?
		( k_unique ( k_dimension | k_single k_reference ) )?
	;
return_rows_clause
	:	k_return ( k_updated | k_all ) k_rows
	;
reference_model
	:	k_reference reference_model_name k_on LPAREN subquery RPAREN
		model_column_clauses ( cell_reference_options )
	;
reference_model_name
	:	identifier
	;
main_model
	:	( k_main main_model_name )? model_column_clauses
		( cell_reference_options ) model_rules_clause
	;
main_model_name
	:	identifier
	;
model_column_clauses
	:	( query_partition_clause ( column_spec )? )?
		k_dimension k_by LPAREN model_columns RPAREN
		k_measures LPAREN model_columns RPAREN
	;
model_columns
	:	model_column ( COMMA model_column )*
	;
model_column
	:	sql_expression ( ( k_as )? column_spec )?
	;
model_rules_clause
	:	( k_rules ( k_update | k_upsert ( k_all )? )? ( ( k_automatic | k_sequential ) k_order )? )?
		( k_iterate LPAREN NUMBER RPAREN ( k_until LPAREN sql_condition RPAREN )? )?
		LPAREN model_rules_exprs RPAREN
	;
model_rules_exprs
	:	model_rules_expr ( COMMA model_rules_expr )*
	;
model_rules_expr
	:	( k_update | k_upsert ( k_all )? )? cell_assignment ( order_by_clause )? EQ sql_expression
	;
cell_assignment
	:	measure_column LBRACK ( multi_column_for_loop | cell_assignment_exprs ) RBRACK
	;
cell_assignment_exprs
	:	cell_assignment_expr ( COMMA cell_assignment_expr )*
	;
cell_assignment_expr
	:	sql_condition | sql_expression | single_column_for_loop
	;
measure_column
	:	column_name
	;
single_column_for_loop
	:	k_for column_name
		(	k_in LPAREN ( literals | subquery ) RPAREN
		|	( k_like pattern )? k_from literal k_to literal ( k_increment | k_decrement ) literal
		)
	;
pattern
	:	quoted_string
	;
literal
	:	( PLUS | MINUS )? NUMBER
	|	quoted_string
	;
literals
	:	literal ( COMMA literal )*
	;
multi_column_for_loop
	:	k_for LPAREN column_specs RPAREN k_in LPAREN ( bracket_literals_list | subquery ) RPAREN
	;
bracket_literals
	:	LPAREN literals RPAREN
	;
bracket_literals_list
	:	bracket_literals ( COMMA bracket_literals )*
	;

/* ================================================================================
   UNION clause
   ================================================================================ */
union_clause
    :
	(	k_union ( k_all )?
 	|	k_intersect
 	|	k_minus
 	)
 	(	select_statement |	subquery )
	-> ^('t_union' k_union? k_all? k_intersect? k_minus? select_statement? subquery?)
	;
	
/* ================================================================================
   ORDER BY clause
   ================================================================================ */
order_by_clause
//TODO use search_clause here
	:	k_order k_siblings ? k_by order_by_clause_part_first order_by_clause_part_next*
	-> ^('t_order_by' k_order k_siblings ? k_by order_by_clause_part_first order_by_clause_part_next*)
	;
// NOTE: these two here here only to preserve COMMAs in parse tree
order_by_clause_part_first
	:	sql_expression k_asc ? k_desc ? (k_nulls k_first)? (k_nulls k_last)?
	;        
order_by_clause_part_next
	:	COMMA sql_expression k_asc ? k_desc ? (k_nulls k_first)? (k_nulls k_last)?
	;        

/* ================================================================================
   Analytic query part
   ================================================================================ */
analytic_function_name
	:
	| k_avg	| k_corr	| k_covar_pop	| k_covar_samp	| k_count	| k_cume_dist	| k_dense_rank
	| k_first	| k_first_value	| k_lag	| k_last	| k_last_value	| k_lead	| k_max	| k_min
	| k_ntile	| k_percent_rank	| k_percentile_cont	| k_percentile_disc	| k_rank	| k_ratio_to_report
	| k_regr_slope	| k_regr_intercept	| k_regr_count	| k_regr_r2	| k_regr_avgx	| k_regr_avgy
	| k_regr_sxx	| k_regr_syy	| k_regr_sxy	| k_row_number	| k_stddev	| k_stddev_pop
	| k_stddev_samp	| k_sum	| k_var_pop	| k_var_samp	| k_variance 	;

analytic_function_call
	: analytic_function_name 
	LPAREN ( k_distinct | k_all)? sql_expression? (COMMA sql_expression)* ( ( k_respect | k_ignore) k_nulls )? RPAREN
	;
	
analytic_function
	: analytic_function_call ( ( k_respect | k_ignore) k_nulls )?  k_over LPAREN analytic_clause RPAREN
	;
	
analytic_clause
	: query_partition_clause? (order_by_clause windowing_clause?)?
	;

windowing_clause_part
	: ( k_unbounded ( k_preceding | k_following ))
    | ( k_current k_row )
    | ( sql_expression ( k_preceding | k_following ) )
	;
			
windowing_clause
	: (k_rows | k_range )
	  ( windowing_clause_part | ( k_between windowing_clause_part k_and windowing_clause_part) )
	;

/* ================================================================================
    FOR UPDATE CLAUSE
   ================================================================================ */
for_update_clause
	: k_for k_update ( k_of for_update_clause_part_first for_update_clause_part_next* )? (k_nowait | k_wait NUMBER | k_skip k_locked)?
	-> ^('t_for_update' k_for k_update k_of? for_update_clause_part_first? for_update_clause_part_next* k_nowait? k_wait? NUMBER? k_skip? k_locked?)
	;
for_update_clause_part_first
	: (sch1=schema_name dot1a=DOT)? (tbl1=table_name dot1b=DOT)? col1=column_name
	;
for_update_clause_part_next
	: COMMA (sch1=schema_name dot1a=DOT)? (tbl1=table_name dot1b=DOT)? col1=column_name
	;
	
/* ================================================================================
    PIVOT CLAUSE
   ================================================================================ */
pivot_clause
	:	k_pivot k_xml? LPAREN function_expression c_alias? (COMMA function_expression c_alias?)*
		pivot_for_clause pivot_in_clause RPAREN
	;
pivot_for_clause
	:	k_for column_spec | ( LPAREN column_specs RPAREN )
	;
pivot_in_clause
	:	k_in
        LPAREN
        (
            select_statement
        |	k_any (COMMA k_any)*
        |	expression_list c_alias? (COMMA expression_list c_alias?) /*!!!*/
        )
        RPAREN
	;
unpivot_clause
	:	k_unpivot (( k_exclude | k_include ) k_nulls)?
		LPAREN (column_spec | (LPAREN column_specs RPAREN)) pivot_for_clause unpivot_in_clause RPAREN
	;
unpivot_in_clause
	:	k_in
		LPAREN
		(column_spec | (LPAREN column_specs RPAREN)) (k_as (constant | (LPAREN constant RPAREN)))?
		(COMMA (column_spec | (LPAREN column_specs RPAREN)) (k_as (constant | (LPAREN constant RPAREN)))?)*
		RPAREN
	;
constant
	: NUMBER | quoted_string
	;	// TODO fixme        

/* ================================================================================
   Oracle reserved words
   cannot by used for name database objects such as columns, tables, or indexes.
   ================================================================================ */
k_access : r='ACCESS' { $r->setType($r, T_RESERVED); }  ;
k_add : r='ADD' { $r->setType($r, T_RESERVED); }  ;
k_all : r='ALL' { $r->setType($r, T_RESERVED); }  ;
k_alter : r='ALTER' { $r->setType($r, T_RESERVED); }  ;
k_and : r='AND' { $r->setType($r, T_RESERVED); }  ;
k_any : r='ANY' { $r->setType($r, T_RESERVED); }  ;
k_arraylen : r='ARRAYLEN' { $r->setType($r, T_RESERVED); }  ;
k_as : r='AS' { $r->setType($r, T_RESERVED); }  ;
k_asc : r='ASC' { $r->setType($r, T_RESERVED); }  ;
k_audit : r='AUDIT' { $r->setType($r, T_RESERVED); }  ;
k_between : r='BETWEEN' { $r->setType($r, T_RESERVED); }  ;
k_by : r='BY' { $r->setType($r, T_RESERVED); }  ;
k_case : r='CASE' { $r->setType($r, T_RESERVED); }  ; //PL/SQL
k_char : r='CHAR' { $r->setType($r, T_RESERVED); }  ;
k_check : r='CHECK' { $r->setType($r, T_RESERVED); }  ;
k_cluster : r='CLUSTER' { $r->setType($r, T_RESERVED); }  ;
k_column : r='COLUMN' { $r->setType($r, T_RESERVED); }  ;
k_comment : r='COMMENT' { $r->setType($r, T_RESERVED); }  ;
k_compress : r='COMPRESS' { $r->setType($r, T_RESERVED); }  ;
k_connect : r='CONNECT' { $r->setType($r, T_RESERVED); }  ;
k_create : r='CREATE' { $r->setType($r, T_RESERVED); }  ;
k_current : r='CURRENT' { $r->setType($r, T_RESERVED); }  ;
k_date : r='DATE' { $r->setType($r, T_RESERVED); }  ;
k_decimal : r='DECIMAL' { $r->setType($r, T_RESERVED); }  ;
k_default : r='DEFAULT' { $r->setType($r, T_RESERVED); }  ;
k_delete : r='DELETE' { $r->setType($r, T_RESERVED); }  ;
k_desc : r='DESC' { $r->setType($r, T_RESERVED); }  ;
k_distinct : r='DISTINCT' { $r->setType($r, T_RESERVED); }  ;
k_drop : r='DROP' { $r->setType($r, T_RESERVED); }  ;
k_else : r='ELSE' { $r->setType($r, T_RESERVED); }  ;
k_exclusive : r='EXCLUSIVE' { $r->setType($r, T_RESERVED); }  ;
k_exists : r='EXISTS' { $r->setType($r, T_RESERVED); }  ;
k_false : r='FALSE' { $r->setType($r, T_RESERVED); }  ; //PL/SQL
k_file : r='FILE' { $r->setType($r, T_RESERVED); }  ;
k_float : r='FLOAT' { $r->setType($r, T_RESERVED); }  ;
k_for : r='FOR' { $r->setType($r, T_RESERVED); }  ;
k_from : r='FROM' { $r->setType($r, T_RESERVED); }  ;
k_grant : r='GRANT' { $r->setType($r, T_RESERVED); }  ;
k_group : r='GROUP' { $r->setType($r, T_RESERVED); }  ;
k_having : r='HAVING' { $r->setType($r, T_RESERVED); }  ;
k_identified : r='IDENTIFIED' { $r->setType($r, T_RESERVED); }  ;
k_immediate : r='IMMEDIATE' { $r->setType($r, T_RESERVED); }  ;
k_in : r='IN' { $r->setType($r, T_RESERVED); }  ;
k_increment : r='INCREMENT' { $r->setType($r, T_RESERVED); }  ;
k_index : r='INDEX' { $r->setType($r, T_RESERVED); }  ;
k_initial : r='INITIAL' { $r->setType($r, T_RESERVED); }  ;
k_insert : r='INSERT' { $r->setType($r, T_RESERVED); }  ;
k_integer : r='INTEGER' { $r->setType($r, T_RESERVED); }  ;
k_intersect : r='INTERSECT' { $r->setType($r, T_RESERVED); }  ;
k_into : r='INTO' { $r->setType($r, T_RESERVED); }  ;
k_is : r='IS' { $r->setType($r, T_RESERVED); }  ;
k_level : r='LEVEL' { $r->setType($r, T_RESERVED); }  ;
k_like : r='LIKE' { $r->setType($r, T_RESERVED); }  ;
k_like2 : r='LIKE2' { $r->setType($r, T_RESERVED); }  ;
k_like4 : r='LIKE4' { $r->setType($r, T_RESERVED); }  ;
k_likec : r='LIKEC' { $r->setType($r, T_RESERVED); }  ;
k_lock : r='LOCK' { $r->setType($r, T_RESERVED); }  ;
k_long : r='LONG' { $r->setType($r, T_RESERVED); }  ;
k_maxextents : r='MAXEXTENTS' { $r->setType($r, T_RESERVED); }  ;
k_minus : r='MINUS' { $r->setType($r, T_RESERVED); }  ;
k_mode : r='MODE' { $r->setType($r, T_RESERVED); }  ;
k_modify : r='MODIFY' { $r->setType($r, T_RESERVED); }  ;
k_noaudit : r='NOAUDIT' { $r->setType($r, T_RESERVED); }  ;
k_nocompress : r='NOCOMPRESS' { $r->setType($r, T_RESERVED); }  ;
k_not : r='NOT' { $r->setType($r, T_RESERVED); }  ;
k_notfound : r='NOTFOUND' { $r->setType($r, T_RESERVED); }  ;
k_nowait : r='NOWAIT' { $r->setType($r, T_RESERVED); }  ;
k_null : r='NULL' { $r->setType($r, T_RESERVED); }  ;
k_number : r='NUMBER' { $r->setType($r, T_RESERVED); }  ;
k_of : r='OF' { $r->setType($r, T_RESERVED); }  ;
k_offline : r='OFFLINE' { $r->setType($r, T_RESERVED); }  ;
k_on : r='ON' { $r->setType($r, T_RESERVED); }  ;
k_online : r='ONLINE' { $r->setType($r, T_RESERVED); }  ;
k_option : r='OPTION' { $r->setType($r, T_RESERVED); }  ;
k_or : r='OR' { $r->setType($r, T_RESERVED); }  ;
k_order : r='ORDER' { $r->setType($r, T_RESERVED); }  ;
k_pctfree : r='PCTFREE' { $r->setType($r, T_RESERVED); }  ;
k_prior : r='PRIOR' { $r->setType($r, T_RESERVED); }  ;
k_privileges : r='PRIVILEGES' { $r->setType($r, T_RESERVED); }  ;
k_public : r='PUBLIC' { $r->setType($r, T_RESERVED); }  ;
k_raw : r='RAW' { $r->setType($r, T_RESERVED); }  ;
k_rename : r='RENAME' { $r->setType($r, T_RESERVED); }  ;
k_resource : r='RESOURCE' { $r->setType($r, T_RESERVED); }  ;
k_revoke : r='REVOKE' { $r->setType($r, T_RESERVED); }  ;
k_row : r='ROW' { $r->setType($r, T_RESERVED); }  ;
k_rowid : r='ROWID' { $r->setType($r, T_RESERVED); }  ;
k_rowlabel : r='ROWLABEL' { $r->setType($r, T_RESERVED); }  ;
k_rownum : r='ROWNUM' { $r->setType($r, T_RESERVED); }  ;
k_rows : r='ROWS' { $r->setType($r, T_RESERVED); }  ;
k_select : r='SELECT' { $r->setType($r, T_RESERVED); }  ;
k_session : r='SESSION' { $r->setType($r, T_RESERVED); }  ;
k_set : r='SET' { $r->setType($r, T_RESERVED); }  ;
k_share : r='SHARE' { $r->setType($r, T_RESERVED); }  ;
k_size : r='SIZE' { $r->setType($r, T_RESERVED); }  ;
k_smallint : r='SMALLINT' { $r->setType($r, T_RESERVED); }  ;
k_sqlbuf : r='SQLBUF' { $r->setType($r, T_RESERVED); }  ;
k_start : r='START' { $r->setType($r, T_RESERVED); }  ;
k_successful : r='SUCCESSFUL' { $r->setType($r, T_RESERVED); }  ;
k_synonym : r='SYNONYM' { $r->setType($r, T_RESERVED); }  ;
k_sysdate : r='SYSDATE' { $r->setType($r, T_RESERVED); }  ;
k_table : r='TABLE' { $r->setType($r, T_RESERVED); }  ;
k_then : r='THEN' { $r->setType($r, T_RESERVED); }  ;
k_to : r='TO' { $r->setType($r, T_RESERVED); }  ;
k_trigger  : r='TRIGGER' { $r->setType($r, T_RESERVED); }  ;
k_true  : r='TRUE' { $r->setType($r, T_RESERVED); }  ; // PL/SQL
k_uid : r='UID' { $r->setType($r, T_RESERVED); }  ;
k_union : r='UNION' { $r->setType($r, T_RESERVED); }  ;
k_unique : r='UNIQUE' { $r->setType($r, T_RESERVED); }  ;
k_update : r='UPDATE' { $r->setType($r, T_RESERVED); }  ;
k_user  : r='USER' { $r->setType($r, T_RESERVED); }  ;
k_validate : r='VALIDATE' { $r->setType($r, T_RESERVED); }  ;
k_values : r='VALUES' { $r->setType($r, T_RESERVED); }  ;
k_varchar : r='VARCHAR' { $r->setType($r, T_RESERVED); }  ;
k_varchar2 : r='VARCHAR2' { $r->setType($r, T_RESERVED); }  ;
k_view : r='VIEW' { $r->setType($r, T_RESERVED); }  ;
k_whenever : r='WHENEVER' { $r->setType($r, T_RESERVED); }  ;
k_where : r='WHERE' { $r->setType($r, T_RESERVED); }  ;
k_with : r='WITH' { $r->setType($r, T_RESERVED); }  ;

reserved_word options { backtrack=false; }
	: r=( 'ACCESS'	| 'ADD'	| 'ALL'	| 'ALTER'	| 'AND'	| 'ANY'	| 'ARRAYLEN'	| 'AS'	| 'ASC'	| 'AUDIT'
	| 'BETWEEN'	| 'BY'
	| 'CASE'
	| 'CHAR'	| 'CHECK'	| 'CLUSTER'	| 'COLUMN'	| 'COMMENT'	| 'COMPRESS'	| 'CONNECT'	| 'CREATE'	| 'CURRENT'	
	| 'DATE'	| 'DECIMAL'	| 'DEFAULT'	| 'DELETE'	| 'DESC'	| 'DISTINCT'	| 'DROP'	
	| 'ELSE'	| 'EXCLUSIVE'	| 'EXISTS'	
	| 'FILE'	| 'FLOAT'	| 'FOR'	| 'FROM'	
	| 'GRANT'	| 'GROUP'	
	| 'HAVING'	
	| 'IDENTIFIED'	| 'IMMEDIATE'	| 'IN'	| 'INCREMENT'	| 'INDEX'	| 'INITIAL'	| 'INSERT'	| 'INTEGER'	
	| 'INTERSECT'	| 'INTO'	| 'IS'	
	| 'LEVEL'	| 'LIKE'	| 'LOCK'	| 'LONG'	
	| 'MAXEXTENTS'	| 'MINUS'	| 'MODE'	| 'MODIFY'	
	| 'NOAUDIT'	| 'NOCOMPRESS'	| 'NOT'	| 'NOTFOUND'	| 'NOWAIT'	| 'NULL'	| 'NUMBER'	
	| 'OF'	| 'OFFLINE'	| 'ON'	| 'ONLINE'	| 'OPTION'	| 'OR'	| 'ORDER'	
	| 'PCTFREE'	| 'PRIOR'	| 'PRIVILEGES'	| 'PUBLIC'	
	| 'RAW'	| 'RENAME'	| 'RESOURCE'	| 'REVOKE'	| 'ROW'	| 'ROWID'	| 'ROWLABEL'	| 'ROWNUM'	| 'ROWS'	
	| 'SELECT'	| 'SESSION'	| 'SET'	| 'SHARE'	| 'SIZE'	| 'SMALLINT'	| 'SQLBUF'	
	| 'START'	| 'SUCCESSFUL'	| 'SYNONYM'	| 'SYSDATE'	
	| 'TABLE'	| 'THEN'	| 'TO'	| 'TRIGGER'	
	| 'UID'	| 'UNION'	| 'UNIQUE'	| 'UPDATE'	| 'USER'	
	| 'VALIDATE'	| 'VALUES'	| 'VARCHAR'	| 'VARCHAR2'	| 'VIEW'	
	| 'WHENEVER'	| 'WHERE'	| 'WITH'
	) //{ $r->setType($r, T_RESERVED); }
	  //{ $type = T_RESERVED; }
	// -> ^(T_RESERVED[$r])
	;

/* ================================================================================
   Oracle keywords
   can by used for name database objects such as columns, tables, or indexes.
   ================================================================================ */
k_a  : r='A' { $r->setType($r, T_RESERVED); }  ;
k_at  : r='AT' { $r->setType($r, T_RESERVED); }  ;
k_admin : r='ADMIN' { $r->setType($r, T_RESERVED); }  ;
k_after : r='AFTER' { $r->setType($r, T_RESERVED); }  ;
k_allocate : r='ALLOCATE' { $r->setType($r, T_RESERVED); }  ;
k_analyze : r='ANALYZE' { $r->setType($r, T_RESERVED); }  ;
k_archive : r='ARCHIVE' { $r->setType($r, T_RESERVED); }  ;
k_archivelog : r='ARCHIVELOG' { $r->setType($r, T_RESERVED); }  ;
k_authorization : r='AUTHORIZATION' { $r->setType($r, T_RESERVED); }  ;
k_avg	 : r='AVG' { $r->setType($r, T_RESERVED); }  ;
k_backup : r='BACKUP' { $r->setType($r, T_RESERVED); }  ;
k_become : r='BECOME' { $r->setType($r, T_RESERVED); }  ;
k_before : r='BEFORE' { $r->setType($r, T_RESERVED); }  ;
k_begin : r='BEGIN' { $r->setType($r, T_RESERVED); }  ;
k_block : r='BLOCK' { $r->setType($r, T_RESERVED); }  ;
k_body	 : r='BODY' { $r->setType($r, T_RESERVED); }  ;
k_cache : r='CACHE' { $r->setType($r, T_RESERVED); }  ;
k_cancel : r='CANCEL' { $r->setType($r, T_RESERVED); }  ;
k_cascade : r='CASCADE' { $r->setType($r, T_RESERVED); }  ;
k_change : r='CHANGE' { $r->setType($r, T_RESERVED); }  ;
k_character : r='CHARACTER' { $r->setType($r, T_RESERVED); }  ;
k_checkpoint : r='CHECKPOINT' { $r->setType($r, T_RESERVED); }  ;
k_close	 : r='CLOSE' { $r->setType($r, T_RESERVED); }  ;
k_cobol : r='COBOL' { $r->setType($r, T_RESERVED); }  ;
k_commit : r='COMMIT' { $r->setType($r, T_RESERVED); }  ;
k_compile : r='COMPILE' { $r->setType($r, T_RESERVED); }  ;
k_constraint : r='CONSTRAINT' { $r->setType($r, T_RESERVED); }  ;
k_constraints : r='CONSTRAINTS' { $r->setType($r, T_RESERVED); }  ;
k_contents : r='CONTENTS' { $r->setType($r, T_RESERVED); }  ;
k_continue	 : r='CONTINUE' { $r->setType($r, T_RESERVED); }  ;
k_controlfile : r='CONTROLFILE' { $r->setType($r, T_RESERVED); }  ;
k_count : r='COUNT' { $r->setType($r, T_RESERVED); }  ;
k_cursor : r='CURSOR' { $r->setType($r, T_RESERVED); }  ;
k_cycle	 : r='CYCLE' { $r->setType($r, T_RESERVED); }  ;
k_database : r='DATABASE' { $r->setType($r, T_RESERVED); }  ;
k_datafile : r='DATAFILE' { $r->setType($r, T_RESERVED); }  ;
k_day : r='DAY' { $r->setType($r, T_RESERVED); }  ;
k_dba : r='DBA' { $r->setType($r, T_RESERVED); }  ;
k_dbtimezone : r='DBTIMEZONE' { $r->setType($r, T_RESERVED); }  ;
k_dec : r='DEC' { $r->setType($r, T_RESERVED); }  ;
k_declare : r='DECLARE' { $r->setType($r, T_RESERVED); }  ;
k_disable : r='DISABLE' { $r->setType($r, T_RESERVED); }  ;
k_dismount : r='DISMOUNT' { $r->setType($r, T_RESERVED); }  ;
k_double : r='DOUBLE' { $r->setType($r, T_RESERVED); }  ;
k_dump	 : r='DUMP' { $r->setType($r, T_RESERVED); }  ;
k_each : r='EACH' { $r->setType($r, T_RESERVED); }  ;
k_enable : r='ENABLE' { $r->setType($r, T_RESERVED); }  ;
k_end : r='END' { $r->setType($r, T_RESERVED); }  ;
k_escape : r='ESCAPE' { $r->setType($r, T_RESERVED); }  ;
k_events : r='EVENTS' { $r->setType($r, T_RESERVED); }  ;
k_except : r='EXCEPT' { $r->setType($r, T_RESERVED); }  ;
k_exceptions : r='EXCEPTIONS' { $r->setType($r, T_RESERVED); }  ;
k_exec : r='EXEC' { $r->setType($r, T_RESERVED); }  ;
k_execute	 : r='EXECUTE' { $r->setType($r, T_RESERVED); }  ;
k_explain : r='EXPLAIN' { $r->setType($r, T_RESERVED); }  ;
k_extent : r='EXTENT' { $r->setType($r, T_RESERVED); }  ;
k_externally	 : r='EXTERNALLY' { $r->setType($r, T_RESERVED); }  ;
k_fetch : r='FETCH' { $r->setType($r, T_RESERVED); }  ;
k_flush : r='FLUSH' { $r->setType($r, T_RESERVED); }  ;
k_force : r='FORCE' { $r->setType($r, T_RESERVED); }  ;
k_foreign : r='FOREIGN' { $r->setType($r, T_RESERVED); }  ;
k_fortran : r='FORTRAN' { $r->setType($r, T_RESERVED); }  ;
k_found : r='FOUND' { $r->setType($r, T_RESERVED); }  ;
k_freelist : r='FREELIST' { $r->setType($r, T_RESERVED); }  ;
k_freelists : r='FREELISTS' { $r->setType($r, T_RESERVED); }  ;
k_function	 : r='FUNCTION' { $r->setType($r, T_RESERVED); }  ;
k_go : r='GO' { $r->setType($r, T_RESERVED); }  ;
k_goto : r='GOTO' { $r->setType($r, T_RESERVED); }  ;
k_groups : r='GROUPS' { $r->setType($r, T_RESERVED); }  ;
k_including : r='INCLUDING' { $r->setType($r, T_RESERVED); }  ;
k_indicator : r='INDICATOR' { $r->setType($r, T_RESERVED); }  ;
k_initrans : r='INITRANS' { $r->setType($r, T_RESERVED); }  ;
k_instance : r='INSTANCE' { $r->setType($r, T_RESERVED); }  ;
k_int	 : r='INT' { $r->setType($r, T_RESERVED); }  ;
k_key	 : r='KEY' { $r->setType($r, T_RESERVED); }  ;
k_language : r='LANGUAGE' { $r->setType($r, T_RESERVED); }  ;
k_layer : r='LAYER' { $r->setType($r, T_RESERVED); }  ;
k_link : r='LINK' { $r->setType($r, T_RESERVED); }  ;
k_lists : r='LISTS' { $r->setType($r, T_RESERVED); }  ;
k_logfile	 : r='LOGFILE' { $r->setType($r, T_RESERVED); }  ;
k_local	 : r='LOCAL' { $r->setType($r, T_RESERVED); }  ;
k_locked	 : r='LOCKED' { $r->setType($r, T_RESERVED); }  ;
k_manage : r='MANAGE' { $r->setType($r, T_RESERVED); }  ;
k_manual : r='MANUAL' { $r->setType($r, T_RESERVED); }  ;
k_max : r='MAX' { $r->setType($r, T_RESERVED); }  ;
k_maxdatafiles : r='MAXDATAFILES' { $r->setType($r, T_RESERVED); }  ;
k_maxinstances : r='MAXINSTANCES' { $r->setType($r, T_RESERVED); }  ;
k_maxlogfiles : r='MAXLOGFILES' { $r->setType($r, T_RESERVED); }  ;
k_maxloghistory	 : r='MAXLOGHISTORY' { $r->setType($r, T_RESERVED); }  ;
k_maxlogmembers : r='MAXLOGMEMBERS' { $r->setType($r, T_RESERVED); }  ;
k_maxtrans : r='MAXTRANS' { $r->setType($r, T_RESERVED); }  ;
k_maxvalue : r='MAXVALUE' { $r->setType($r, T_RESERVED); }  ;
k_min : r='MIN' { $r->setType($r, T_RESERVED); }  ;
k_minextents : r='MINEXTENTS' { $r->setType($r, T_RESERVED); }  ;
k_minvalue : r='MINVALUE' { $r->setType($r, T_RESERVED); }  ;
k_module : r='MODULE' { $r->setType($r, T_RESERVED); }  ;
k_month	 : r='MONTH' { $r->setType($r, T_RESERVED); }  ;
k_mount	 : r='MOUNT' { $r->setType($r, T_RESERVED); }  ;
k_new : r='NEW' { $r->setType($r, T_RESERVED); }  ;
k_next : r='NEXT' { $r->setType($r, T_RESERVED); }  ;
k_noarchivelog : r='NOARCHIVELOG' { $r->setType($r, T_RESERVED); }  ;
k_nocache : r='NOCACHE' { $r->setType($r, T_RESERVED); }  ;
k_nocycle : r='NOCYCLE' { $r->setType($r, T_RESERVED); }  ;
k_nomaxvalue : r='NOMAXVALUE' { $r->setType($r, T_RESERVED); }  ;
k_nominvalue : r='NOMINVALUE' { $r->setType($r, T_RESERVED); }  ;
k_none	 : r='NONE' { $r->setType($r, T_RESERVED); }  ;
k_noorder : r='NOORDER' { $r->setType($r, T_RESERVED); }  ;
k_noresetlogs : r='NORESETLOGS' { $r->setType($r, T_RESERVED); }  ;
k_normal : r='NORMAL' { $r->setType($r, T_RESERVED); }  ;
k_nosort : r='NOSORT' { $r->setType($r, T_RESERVED); }  ;
k_numeric	 : r='NUMERIC' { $r->setType($r, T_RESERVED); }  ;
k_off : r='OFF' { $r->setType($r, T_RESERVED); }  ;
k_old : r='OLD' { $r->setType($r, T_RESERVED); }  ;
k_only : r='ONLY' { $r->setType($r, T_RESERVED); }  ;
k_open : r='OPEN' { $r->setType($r, T_RESERVED); }  ;
k_optimal : r='OPTIMAL' { $r->setType($r, T_RESERVED); }  ;
k_own	 : r='OWN' { $r->setType($r, T_RESERVED); }  ;
k_package : r='PACKAGE' { $r->setType($r, T_RESERVED); }  ;
k_parallel : r='PARALLEL' { $r->setType($r, T_RESERVED); }  ;
k_pctincrease : r='PCTINCREASE' { $r->setType($r, T_RESERVED); }  ;
k_pctused : r='PCTUSED' { $r->setType($r, T_RESERVED); }  ;
k_plan : r='PLAN' { $r->setType($r, T_RESERVED); }  ;
k_pli : r='PLI' { $r->setType($r, T_RESERVED); }  ;
k_precision : r='PRECISION' { $r->setType($r, T_RESERVED); }  ;
k_primary : r='PRIMARY' { $r->setType($r, T_RESERVED); }  ;
k_private : r='PRIVATE' { $r->setType($r, T_RESERVED); }  ;
k_procedure : r='PROCEDURE' { $r->setType($r, T_RESERVED); }  ;
k_profile	 : r='PROFILE' { $r->setType($r, T_RESERVED); }  ;
k_quota	 : r='QUOTA' { $r->setType($r, T_RESERVED); }  ;
k_read : r='READ' { $r->setType($r, T_RESERVED); }  ;
k_real : r='REAL' { $r->setType($r, T_RESERVED); }  ;
k_recover : r='RECOVER' { $r->setType($r, T_RESERVED); }  ;
k_references : r='REFERENCES' { $r->setType($r, T_RESERVED); }  ;
k_referencing : r='REFERENCING' { $r->setType($r, T_RESERVED); }  ;
k_resetlogs : r='RESETLOGS' { $r->setType($r, T_RESERVED); }  ;
k_restricted : r='RESTRICTED' { $r->setType($r, T_RESERVED); }  ;
k_reuse	 : r='REUSE' { $r->setType($r, T_RESERVED); }  ;
k_role : r='ROLE' { $r->setType($r, T_RESERVED); }  ;
k_roles : r='ROLES' { $r->setType($r, T_RESERVED); }  ;
k_rollback	 : r='ROLLBACK' { $r->setType($r, T_RESERVED); }  ;
k_savepoint : r='SAVEPOINT' { $r->setType($r, T_RESERVED); }  ;
k_schema : r='SCHEMA' { $r->setType($r, T_RESERVED); }  ;
k_scn : r='SCN' { $r->setType($r, T_RESERVED); }  ;
k_second : r='SECOND' { $r->setType($r, T_RESERVED); }  ;
k_section : r='SECTION' { $r->setType($r, T_RESERVED); }  ;
k_segment : r='SEGMENT' { $r->setType($r, T_RESERVED); }  ;
k_sequence : r='SEQUENCE' { $r->setType($r, T_RESERVED); }  ;
k_sessiontimezone : r='SESSIONTIMEZONE' { $r->setType($r, T_RESERVED); }  ;
k_shared : r='SHARED' { $r->setType($r, T_RESERVED); }  ;
k_snapshot	 : r='SNAPSHOT' { $r->setType($r, T_RESERVED); }  ;
k_skip : r='SKIP' { $r->setType($r, T_RESERVED); }  ;
k_some : r='SOME' { $r->setType($r, T_RESERVED); }  ;
k_sort : r='SORT' { $r->setType($r, T_RESERVED); }  ;
k_sql : r='SQL' { $r->setType($r, T_RESERVED); }  ;
k_sqlcode : r='SQLCODE' { $r->setType($r, T_RESERVED); }  ;
k_sqlerror : r='SQLERROR' { $r->setType($r, T_RESERVED); }  ;
k_sqlstate : r='SQLSTATE' { $r->setType($r, T_RESERVED); }  ;
k_statement_ID : r='STATEMENT' { $r->setType($r, T_RESERVED); }  ;
k_statistics : r='STATISTICS' { $r->setType($r, T_RESERVED); }  ;
k_stop : r='STOP' { $r->setType($r, T_RESERVED); }  ;
k_storage : r='STORAGE' { $r->setType($r, T_RESERVED); }  ;
k_sum : r='SUM' { $r->setType($r, T_RESERVED); }  ;
k_switch : r='SWITCH' { $r->setType($r, T_RESERVED); }  ;
k_system	 : r='SYSTEM' { $r->setType($r, T_RESERVED); }  ;
k_tables : r='TABLES' { $r->setType($r, T_RESERVED); }  ;
k_tablespace : r='TABLESPACE' { $r->setType($r, T_RESERVED); }  ;
k_temporary : r='TEMPORARY' { $r->setType($r, T_RESERVED); }  ;
k_thread : r='THREAD' { $r->setType($r, T_RESERVED); }  ;
k_time : r='TIME' { $r->setType($r, T_RESERVED); }  ;
k_tracing : r='TRACING' { $r->setType($r, T_RESERVED); }  ;
k_transaction : r='TRANSACTION' { $r->setType($r, T_RESERVED); }  ;
k_triggers	 : r='TRIGGERS' { $r->setType($r, T_RESERVED); }  ;
k_truncate	 : r='TRUNCATE' { $r->setType($r, T_RESERVED); }  ;
k_under : r='UNDER' { $r->setType($r, T_RESERVED); }  ;
k_unlimited : r='UNLIMITED' { $r->setType($r, T_RESERVED); }  ;
k_until : r='UNTIL' { $r->setType($r, T_RESERVED); }  ;
k_use : r='USE' { $r->setType($r, T_RESERVED); }  ;
k_using	 : r='USING' { $r->setType($r, T_RESERVED); }  ;
k_wait : r='WAIT' { $r->setType($r, T_RESERVED); }  ;
k_when : r='WHEN' { $r->setType($r, T_RESERVED); }  ;
k_work : r='WORK' { $r->setType($r, T_RESERVED); }  ;
k_write	 : r='WRITE' { $r->setType($r, T_RESERVED); }  ;
k_year	 : r='YEAR' { $r->setType($r, T_RESERVED); }  ;
k_zone	 : r='ZONE' { $r->setType($r, T_RESERVED); }  ;

k_automatic : r='AUTOMATIC' { $r->setType($r, T_RESERVED); }  ;
k_bfile : r='BFILE' { $r->setType($r, T_RESERVED); }  ;
k_binary_double : r='BINARY_DOUBLE' { $r->setType($r, T_RESERVED); }  ;
k_binary_float : r='BINARY_FLOAT' { $r->setType($r, T_RESERVED); }  ;
k_binary_integer : r='BINARY_INTEGER' { $r->setType($r, T_RESERVED); }  ;
k_blob : r='BLOB' { $r->setType($r, T_RESERVED); }  ;
k_boolean : r='BOOLEAN' { $r->setType($r, T_RESERVED); }  ;
k_byte : r='BYTE' { $r->setType($r, T_RESERVED); }  ;
k_cast : r='CAST' { $r->setType($r, T_RESERVED); }  ;
k_clob : r='CLOB' { $r->setType($r, T_RESERVED); }  ;
k_cluster_set : r='CLUSTER_SET' { $r->setType($r, T_RESERVED); }  ;
k_column_value : r='COLUMN_VALUE' { $r->setType($r, T_RESERVED); }  ;
k_connect_by_iscycle : r='CONNECT_BY_ISCYCLE' { $r->setType($r, T_RESERVED); }  ;
k_connect_by_isleaf : r='CONNECT_BY_ISLEAF' { $r->setType($r, T_RESERVED); }  ;
k_connect_by_root : r='CONNECT_BY_ROOT' { $r->setType($r, T_RESERVED); }  ;
k_corr : r='CORR' { $r->setType($r, T_RESERVED); }  ;
k_covar_pop : r='COVAR_POP' { $r->setType($r, T_RESERVED); }  ;
k_covar_samp : r='COVAR_SAMP' { $r->setType($r, T_RESERVED); }  ;
k_cross : r='CROSS' { $r->setType($r, T_RESERVED); }  ;
k_cube : r='CUBE' { $r->setType($r, T_RESERVED); }  ;
k_cume_dist : r='CUME_DIST' { $r->setType($r, T_RESERVED); }  ;
k_decrement : r='DECREMENT' { $r->setType($r, T_RESERVED); }  ;
k_dense_rank : r='DENSE_RANK' { $r->setType($r, T_RESERVED); }  ;
k_dimension : r='DIMENSION' { $r->setType($r, T_RESERVED); }  ;
k_empty : r='EMPTY' { $r->setType($r, T_RESERVED); }  ;
k_equals_path : r='EQUALS_PATH' { $r->setType($r, T_RESERVED); }  ;
k_first_value : r='FIRST_VALUE' { $r->setType($r, T_RESERVED); }  ;
k_full : r='FULL' { $r->setType($r, T_RESERVED); }  ;
k_grouping : r='GROUPING' { $r->setType($r, T_RESERVED); }  ;
k_ignore : r='IGNORE' { $r->setType($r, T_RESERVED); }  ;
k_infinite : r='INFINITE' { $r->setType($r, T_RESERVED); }  ;
k_inner : r='INNER' { $r->setType($r, T_RESERVED); }  ;
k_interval : r='INTERVAL' { $r->setType($r, T_RESERVED); }  ;
k_iterate : r='ITERATE' { $r->setType($r, T_RESERVED); }  ;
k_join : r='JOIN' { $r->setType($r, T_RESERVED); }  ;
k_keep : r='KEEP' { $r->setType($r, T_RESERVED); }  ;
k_lag : r='LAG' { $r->setType($r, T_RESERVED); }  ;
k_last : r='LAST' { $r->setType($r, T_RESERVED); }  ;
k_last_value : r='LAST_VALUE' { $r->setType($r, T_RESERVED); }  ;
k_lead : r='LEAD' { $r->setType($r, T_RESERVED); }  ;
k_left : r='LEFT' { $r->setType($r, T_RESERVED); }  ;
k_main : r='MAIN' { $r->setType($r, T_RESERVED); }  ;
k_measures : r='MEASURES' { $r->setType($r, T_RESERVED); }  ;
k_member : r='MEMBER' { $r->setType($r, T_RESERVED); }  ;
k_mlslabel : r='MLSLABEL' { $r->setType($r, T_RESERVED); }  ;
k_model : r='MODEL' { $r->setType($r, T_RESERVED); }  ;
k_multiset : r='MULTISET' { $r->setType($r, T_RESERVED); }  ;
k_nan : r='NAN' { $r->setType($r, T_RESERVED); }  ;
k_national : r='NATIONAL' { $r->setType($r, T_RESERVED); }  ;
k_natural : r='NATURAL' { $r->setType($r, T_RESERVED); }  ;
k_nav : r='NAV' { $r->setType($r, T_RESERVED); }  ;
k_nchar : r='NCHAR' { $r->setType($r, T_RESERVED); }  ;
k_nclob : r='NCLOB' { $r->setType($r, T_RESERVED); }  ;
k_ntile : r='NTILE' { $r->setType($r, T_RESERVED); }  ;
k_nulls : r='NULLS' { $r->setType($r, T_RESERVED); }  ;
k_nvarchar : r='NVARCHAR' { $r->setType($r, T_RESERVED); }  ;
k_nvarchar2 : r='NVARCHAR2' { $r->setType($r, T_RESERVED); }  ;
k_object_id : r='OBJECT_ID' { $r->setType($r, T_RESERVED); }  ;
k_object_value : r='OBJECT_VALUE' { $r->setType($r, T_RESERVED); }  ;
k_ora_rowscn : r='ORA_ROWSCN' { $r->setType($r, T_RESERVED); }  ;
k_outer : r='OUTER' { $r->setType($r, T_RESERVED); }  ;
k_over : r='OVER' { $r->setType($r, T_RESERVED); }  ;
k_partition : r='PARTITION' { $r->setType($r, T_RESERVED); }  ;
k_percentile_cont : r='PERCENTILE_CONT' { $r->setType($r, T_RESERVED); }  ;
k_percentile_disc : r='PERCENTILE_DISC' { $r->setType($r, T_RESERVED); }  ;
k_percent_rank : r='PERCENT_RANK' { $r->setType($r, T_RESERVED); }  ;
k_pivot : r='PIVOT' { $r->setType($r, T_RESERVED); }  ;
k_pls_integer : r='PLS_INTEGER' { $r->setType($r, T_RESERVED); }  ;
k_positive : r='POSITIVE' { $r->setType($r, T_RESERVED); }  ;
k_present : r='PRESENT' { $r->setType($r, T_RESERVED); }  ;
k_rank : r='RANK' { $r->setType($r, T_RESERVED); }  ;
k_ratio_to_report : r='RATIO_TO_REPORT' { $r->setType($r, T_RESERVED); }  ;
k_reference : r='REFERENCE' { $r->setType($r, T_RESERVED); }  ;
k_regexp_like : r='REGEXP_LIKE' { $r->setType($r, T_RESERVED); }  ;
k_regr_avgx : r='REGR_AVGX' { $r->setType($r, T_RESERVED); }  ;
k_regr_avgy : r='REGR_AVGY' { $r->setType($r, T_RESERVED); }  ;
k_regr_count : r='REGR_COUNT' { $r->setType($r, T_RESERVED); }  ;
k_regr_intercept : r='REGR_INTERCEPT' { $r->setType($r, T_RESERVED); }  ;
k_regr_r2 : r='REGR_R2' { $r->setType($r, T_RESERVED); }  ;
k_regr_slope : r='REGR_SLOPE' { $r->setType($r, T_RESERVED); }  ;
k_regr_sxx : r='REGR_SXX' { $r->setType($r, T_RESERVED); }  ;
k_regr_sxy : r='REGR_SXY' { $r->setType($r, T_RESERVED); }  ;
k_regr_syy : r='REGR_SYY' { $r->setType($r, T_RESERVED); }  ;
k_right : r='RIGHT' { $r->setType($r, T_RESERVED); }  ;
k_rollup : r='ROLLUP' { $r->setType($r, T_RESERVED); }  ;
k_row_number : r='ROW_NUMBER' { $r->setType($r, T_RESERVED); }  ;
k_rules : r='RULES' { $r->setType($r, T_RESERVED); }  ;
k_sample : r='SAMPLE' { $r->setType($r, T_RESERVED); }  ;
k_search : r='SEARCH' { $r->setType($r, T_RESERVED); }  ;
k_sequential : r='SEQUENTIAL' { $r->setType($r, T_RESERVED); }  ;
k_sets : r='SETS' { $r->setType($r, T_RESERVED); }  ;
k_single : r='SINGLE' { $r->setType($r, T_RESERVED); }  ;
k_stddev : r='STDDEV' { $r->setType($r, T_RESERVED); }  ;
k_stddev_pop : r='STDDEV_POP' { $r->setType($r, T_RESERVED); }  ;
k_stddev_samp : r='STDDEV_SAMP' { $r->setType($r, T_RESERVED); }  ;
k_submultiset : r='SUBMULTISET' { $r->setType($r, T_RESERVED); }  ;
k_subpartition : r='SUBPARTITION' { $r->setType($r, T_RESERVED); }  ;
k_the : r='THE' { $r->setType($r, T_RESERVED); }  ;
k_timestamp : r='TIMESTAMP' { $r->setType($r, T_RESERVED); }  ;
k_type : r='TYPE' { $r->setType($r, T_RESERVED); }  ;
k_unbounded : r='UNBOUNDED' { $r->setType($r, T_RESERVED); }  ;
k_under_path : r='UNDER_PATH' { $r->setType($r, T_RESERVED); }  ;
k_updated : r='UPDATED' { $r->setType($r, T_RESERVED); }  ;
k_upsert : r='UPSERT' { $r->setType($r, T_RESERVED); }  ;
k_urowid : r='UROWID' { $r->setType($r, T_RESERVED); }  ;
k_variance : r='VARIANCE' { $r->setType($r, T_RESERVED); }  ;
k_varying : r='VARYING' { $r->setType($r, T_RESERVED); }  ;
k_var_pop : r='VAR_POP' { $r->setType($r, T_RESERVED); }  ;
k_var_samp : r='VAR_SAMP' { $r->setType($r, T_RESERVED); }  ;
k_versions_endscn : r='VERSIONS_ENDSCN' { $r->setType($r, T_RESERVED); }  ;
k_versions_endtime : r='VERSIONS_ENDTIME' { $r->setType($r, T_RESERVED); }  ;
k_versions_operation : r='VERSIONS_OPERATION' { $r->setType($r, T_RESERVED); }  ;
k_versions_starscn : r='VERSIONS_STARSCN' { $r->setType($r, T_RESERVED); }  ;
k_versions_starttime : r='VERSIONS_STARTTIME' { $r->setType($r, T_RESERVED); }  ;
k_versions_xid : r='VERSIONS_XID' { $r->setType($r, T_RESERVED); }  ;
k_xml : r='XML' { $r->setType($r, T_RESERVED); }  ;
k_xmldata : r='XMLDATA' { $r->setType($r, T_RESERVED); }  ;

k_errors : r='ERRORS' { $r->setType($r, T_RESERVED); }  ;
k_first : r='FIRST' { $r->setType($r, T_RESERVED); }  ;
k_limit : r='LIMIT' { $r->setType($r, T_RESERVED); }  ;
k_log : r='LOG' { $r->setType($r, T_RESERVED); }  ;
k_reject : r='REJECT' { $r->setType($r, T_RESERVED); }  ;
k_return : r='RETURN' { $r->setType($r, T_RESERVED); }  ;
k_returning : r='RETURNING' { $r->setType($r, T_RESERVED); }  ;

k_merge : r='MERGE' { $r->setType($r, T_RESERVED); }  ;
k_matched : r='MATCHED' { $r->setType($r, T_RESERVED); }  ;

k_following : r='FOLLOWING' { $r->setType($r, T_RESERVED); }  ;
k_range : r='RANGE' { $r->setType($r, T_RESERVED); }  ;
k_siblings : r='SIBLINGS' { $r->setType($r, T_RESERVED); }  ;
k_unpivot : r='UNPIVOT' { $r->setType($r, T_RESERVED); }  ;

k_value : r= 'VALUE' { $r->setType($r, T_RESERVED); }  ;

k_breadth : r='BREADTH' { $r->setType($r, T_RESERVED); }  ;
k_depth : r='DEPTH' { $r->setType($r, T_RESERVED); }  ;
k_exclude : r='EXCLUDE' { $r->setType($r, T_RESERVED); }  ;
k_include : r='INCLUDE' { $r->setType($r, T_RESERVED); }  ;
k_mivalue : r='MIVALUE' { $r->setType($r, T_RESERVED); }  ;
k_preceding : r='PRECEDING' { $r->setType($r, T_RESERVED); }  ;
k_respect : r='RESPECT' { $r->setType($r, T_RESERVED); }  ;
k_seed : r='SEED' { $r->setType($r, T_RESERVED); }  ;
k_versions : r='VERSIONS' { $r->setType($r, T_RESERVED); }  ;

keyword
	: 'A' // note: this one is not listed in the docs but is a part of "IS A SET" condition clause
	| 'ADMIN'	| 'AFTER'	| 'ALLOCATE'	| 'ANALYZE'	| 'ARCHIVE'	| 'ARCHIVELOG'	| 'AT'	| 'AUTHORIZATION'	| 'AVG'	
	| 'BACKUP'	| 'BECOME'	| 'BEFORE'	| 'BEGIN'	| 'BLOCK'	| 'BODY'	| 'BREADTH'
	| 'CACHE'	| 'CANCEL'	| 'CASCADE'	| 'CHANGE'	| 'CHARACTER'	| 'CHECKPOINT'	| 'CLOSE'	
	| 'COBOL'	| 'COMMIT'	| 'COMPILE'	| 'CONSTRAINT'	| 'CONSTRAINTS'	| 'CONTENTS'	| 'CONTINUE'	
	| 'CONTROLFILE'	| 'COUNT'	| 'CURSOR'	| 'CYCLE'	
	| 'DATABASE'	| 'DATAFILE'	| 'DAY'	| 'DBA'	| 'DBTIMEZONE'	| 'DEC'	| 'DECLARE'	| 'DISABLE'	| 'DISMOUNT'	| 'DOUBLE'	| 'DUMP'
    | 'DEPTH'
	| 'EACH'	| 'ENABLE'	| 'END'	| 'ESCAPE'	| 'EVENTS'	| 'ERRORS'	| 'EXCEPT'	| 'EXCEPTIONS'	| 'EXEC'	| 'EXECUTE'
    | 'EXCLUDE'
	| 'EXPLAIN'	| 'EXTENT'	| 'EXTERNALLY'	
	| 'FETCH'	| 'FIRST'	| 'FLUSH'	| 'FORCE'	| 'FOREIGN'	| 'FORTRAN'	| 'FOUND'
	| 'FOLLOWING'    | 'FREELIST'
	| 'FREELISTS'	| 'FUNCTION'	
	| 'GO'	| 'GOTO'	| 'GROUPS'
	| 'INCLUDE'	| 'INCLUDING'	| 'INDICATOR'	| 'INITRANS'	| 'INSTANCE'	| 'INT'	
	| 'KEY'	
	| 'LANGUAGE'	| 'LAYER'	| 'LIMIT'	| 'LINK'	| 'LISTS'	| 'LOCAL'	| 'LOCKED'	| 'LOG'	| 'LOGFILE'
	| 'MANAGE'	| 'MANUAL'	| 'MATCHED'	| 'MAX'	| 'MAXDATAFILES'	| 'MAXINSTANCES'	| 'MAXLOGFILES'	| 'MAXLOGHISTORY'	
	| 'MAXLOGMEMBERS'	| 'MAXTRANS'	| 'MAXVALUE'	| 'MERGE'	| 'MIN'	| 'MINEXTENTS'	| 'MINVALUE'	| 'MODULE'	| 'MONTH'	| 'MOUNT'
	| 'NEW'	| 'NEXT'	| 'NOARCHIVELOG'	| 'NOCACHE'	| 'NOCYCLE'	| 'NOMAXVALUE'	| 'NOMINVALUE'	| 'NONE' 
	| 'NOORDER'	| 'NORESETLOGS'	| 'NORMAL'	| 'NOSORT'	| 'NUMERIC'	
	| 'OFF'	| 'OLD'	| 'ONLY'	| 'OPEN'	| 'OPTIMAL'	| 'OWN'	
	| 'PACKAGE'	| 'PARALLEL'	| 'PCTINCREASE'	| 'PCTUSED'	| 'PLAN'	| 'PLI'	| 'PRECISION'	| 'PRIMARY'	
	| 'PRIVATE'	| 'PRECEDING'	| 'PROCEDURE'	| 'PROFILE'	
	| 'QUOTA'	
	| 'READ'	| 'REAL'	| 'RECOVER'	| 'REFERENCES'	| 'REFERENCING'	| 'REJECT'	| 'RETURN'	| 'RETURNING'
	| 'RESETLOGS'	| 'RESTRICTED'	| 'REUSE'	| 'ROLE'	| 'ROLES'	| 'ROLLBACK'
    | 'RESPECT'
	| 'SAVEPOINT'	| 'SECOND'	| 'SESSIONTIMEZONE'	| 'SCHEMA'	| 'SCN'	| 'SECTION'	| 'SEGMENT'	| 'SEQUENCE'
	| 'SHARED'	| 'SKIP'	| 'SNAPSHOT'	| 'SOME'	| 'SORT'	| 'SQL'	| 'SQLCODE'	| 'SQLERROR'	| 'SQLSTATE'
	| 'STATEMENT_ID'	| 'STATISTICS'	| 'STOP'	| 'STORAGE'	| 'SUM'	| 'SWITCH'	| 'SYSTEM'
    | 'SEED'
	| 'TABLES'	| 'TABLESPACE'	| 'TEMPORARY'	| 'THREAD'	| 'TIME'	| 'TRACING'	| 'TRANSACTION'	| 'TRIGGERS'	
	| 'TRUNCATE'	
	| 'UNDER'	| 'UNLIMITED'	| 'UNTIL'	| 'USE'
    //| 'USING'
    | 'VALUE'	| 'VERSIONS'
	| 'WHEN'	| 'WORK'	| 'WRITE'
   	| 'YEAR'
	| 'ZONE'
    | 'AUTOMATIC'	| 'BFILE'	| 'BINARY_DOUBLE'
    | 'BINARY_FLOAT'	| 'BINARY_INTEGER'	| 'BLOB'	| 'BOOLEAN'
    | 'BYTE'	| 'CAST'	| 'CLOB'	| 'CLUSTER_SET'
    | 'COLUMN_VALUE'
    | 'CONNECT_BY_ISCYCLE'	| 'CONNECT_BY_ISLEAF'	| 'CONNECT_BY_ROOT'
    | 'CORR'	| 'COVAR_POP'	| 'COVAR_SAMP'	| 'CROSS'
    | 'CUBE'	| 'CUME_DIST'	| 'DECREMENT'	| 'DENSE_RANK'
    | 'DIMENSION'	| 'EMPTY'	|    'EQUALS_PATH'	| 'FIRST_VALUE'
    | 'FULL'	| 'GROUPING'	| 'IGNORE'	| 'INFINITE'
    | 'INNER'
    | 'INTERVAL'	| 'ITERATE'
    //| 'JOIN'
    | 'KEEP'	| 'LAG'	| 'LAST'	| 'LAST_VALUE'
    | 'LEAD'	| 'LEFT'	| 'MAIN'	| 'MEASURES'
    | 'MEMBER'	| 'MLSLABEL'
    //| 'MODEL'
    //| 'MULTISET'
    | 'NAN'	| 'NATIONAL'	| 'NATURAL'	| 'NAV'
    | 'NCHAR'	| 'NCLOB'	| 'NTILE'	| 'NULLS'
    | 'NVARCHAR'	| 'NVARCHAR2'	| 'OBJECT_ID'	|    'OBJECT_VALUE'
    | 'ORA_ROWSCN'
    //| 'OUTER'
    | 'OVER'
    //| 'PARTITION'
    //| 'PERCENTILE_CONT'	| 'PERCENTILE_DISC'	| 'PERCENT_RANK'	|
    | 'PIVOT'
    | 'PLS_INTEGER'	| 'POSITIVE'	| 'PRESENT'
    | 'RANGE'    | 'RANK'
    | 'RATIO_TO_REPORT'	| 'REFERENCE'	| 'REGEXP_LIKE'	| 'REGR_AVGX'
    | 'REGR_AVGY'	| 'REGR_COUNT'	| 'REGR_INTERCEPT'	| 'REGR_R2'
    | 'REGR_SLOPE'	| 'REGR_SXX'	| 'REGR_SXY'	| 'REGR_SYY'
    | 'RIGHT'	| 'ROLLUP'	| 'ROW_NUMBER'	| 'RULES'
    | 'SAMPLE'	| 'SEARCH'	| 'SEQUENTIAL'	| 'SETS'
    | 'SIBLINGS'
    | 'SINGLE'	| 'STDDEV'	| 'STDDEV_POP'	| 'STDDEV_SAMP'
    | 'SUBMULTISET'	| 'SUBPARTITION'	| 'THE'	| 'TIMESTAMP'
    | 'TYPE'	| 'UNBOUNDED'	| 'UNDER_PATH'	| 'UNPIVOT'
    | 'UPDATED'
    | 'UPSERT'	| 'UROWID'	| 'VARIANCE'	| 'VARYING'
    | 'VAR_POP'	| 'VAR_SAMP'
    //| 'VERSIONS_ENDSCN'	| 'VERSIONS_ENDTIME' | 'VERSIONS_OPERATION'	| 'VERSIONS_STARSCN'	| 'VERSIONS_STARTTIME'	|
    | 'VERSIONS_XID'
    | 'XML'        
    | 'XMLDATA'        
	;

quoted_string
	:	QUOTED_STRING | QSTRING
	;

QUOTED_STRING
	:	( 'n'|'N' )? '\'' ( '\'\'' | ~('\'') )* '\''
	;

/* Perl-style quoted string */
QSTRING             : ('q'|'Q') ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER) ;
fragment QS_ANGLE   : QUOTE '<' ( options {greedy=false;} : . )* '>' QUOTE ;
fragment QS_BRACE   : QUOTE '{' ( options {greedy=false;} : . )* '}' QUOTE ;
fragment QS_BRACK   : QUOTE '[' ( options {greedy=false;} : . )* ']' QUOTE ;
fragment QS_PAREN   : QUOTE '(' ( options {greedy=false;} : . )* ')' QUOTE ;

fragment QS_OTHER_CH: ~('<'|'{'|'['|'('|' '|'\t'|'\n'|'\r');
fragment QS_OTHER
		@init {
    		ANTLR3_UINT32 (*oldLA)(struct ANTLR3_INT_STREAM_struct *, ANTLR3_INT32);
			oldLA = INPUT->istream->_LA;
            INPUT->setUcaseLA(INPUT, ANTLR3_FALSE);
		}
		:	
		QUOTE delimiter=QS_OTHER_CH
/* JAVA Syntax */        
// 		( { input.LT(1) != $delimiter.text.charAt(0) || ( input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) != '\'') }? => . )*
// 		( { input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) == '\'' }? => . ) QUOTE
/* C Syntax */ 
		( { LA(1) != $delimiter->getText(delimiter)->chars[0] || LA(2) != '\'' }? => . )*
		( { LA(1) == $delimiter->getText(delimiter)->chars[0] && LA(2) == '\'' }? => . ) QUOTE
 		{ INPUT->istream->_LA = oldLA; }
		;

ID /*options { testLiterals=true; }*/
    :	'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
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
PERCENTAGE
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
	:	'<>' | '!=' | '^='
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
NUMBER
	:	//( PLUS | MINUS )?
		(	( NUM POINT NUM ) => NUM POINT NUM
		|	POINT NUM
		|	NUM
		)
		( 'E' ( PLUS | MINUS )? NUM )?
    ;
fragment
NUM
	: '0' .. '9' ( '0' .. '9' )*
	;
QUOTE
	:	'\''
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
TYPE_ATTR
	:	'%TYPE'
	;
ROWTYPE_ATTR
	:	'%ROWTYPE'
	;
NOTFOUND_ATTR
	:	'%NOTFOUND'
	;
FOUND_ATTR
	:	'%FOUND'
	;
ISOPEN_ATTR
	:	'%ISOPEN'
	;
ROWCOUNT_ATTR
	:	'%ROWCOUNT'
	;
BULK_ROWCOUNT_ATTR
	:	'%BULK_ROWCOUNT'
	;
CHARSET_ATTR
	:	'%CHARSET'
	;

