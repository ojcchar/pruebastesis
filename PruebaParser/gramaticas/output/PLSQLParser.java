// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g 2010-10-10 00:38:26

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class PLSQLParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROC_CALL", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "IN", "OUT", "NOCOPY", "ASSIGN", "DEFAULT", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "SUBTYPE", "RECORD", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "AS", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "BODY", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "N", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT"
    };
    public static final int PACKAGE=116;
    public static final int FUNCTION=9;
    public static final int EXTERNAL=118;
    public static final int EXPONENT=100;
    public static final int WHILE=88;
    public static final int DETERMINISTIC=37;
    public static final int VARYING=27;
    public static final int CASE=51;
    public static final int DOUBLEDOT=67;
    public static final int NOT=21;
    public static final int SUBTYPE=25;
    public static final int EOF=-1;
    public static final int SQL=101;
    public static final int RPAREN=13;
    public static final int CREATE=115;
    public static final int INSERT=80;
    public static final int USING=63;
    public static final int RETURNING=64;
    public static final int BEGIN=42;
    public static final int LOOP=50;
    public static final int SAVEPOINT=83;
    public static final int RETURN=10;
    public static final int BODY=117;
    public static final int RAISE=75;
    public static final int GEQ=94;
    public static final int GOTO=70;
    public static final int EQ=89;
    public static final int SELECT=84;
    public static final int ISOPEN=103;
    public static final int INTO=60;
    public static final int ARRAY=28;
    public static final int DIVIDE=5;
    public static final int EXCEPTION=24;
    public static final int RBRACK=126;
    public static final int EXIT=57;
    public static final int RECORD=26;
    public static final int N=129;
    public static final int TRANSACTION=86;
    public static final int NULL=22;
    public static final int ELSE=52;
    public static final int AT_SIGN=125;
    public static final int DEFINER=121;
    public static final int DELETE=49;
    public static final int DOUBLEVERTBAR=98;
    public static final int ROLLBACK=82;
    public static final int AUTHID=119;
    public static final int NOCOPY=16;
    public static final int WS=131;
    public static final int LANGUAGE=122;
    public static final int FETCH=58;
    public static final int OUT=15;
    public static final int REAL_NUMBER=106;
    public static final int PIPELINED=38;
    public static final int SL_COMMENT=132;
    public static final int OR=45;
    public static final int CONSTANT=23;
    public static final int ELSIF=72;
    public static final int END=43;
    public static final int FALSE=108;
    public static final int COLLECT=62;
    public static final int CURSOR=19;
    public static final int OTHERS=46;
    public static final int LBRACK=127;
    public static final int PROC_CALL=4;
    public static final int POINT=124;
    public static final int CURRENT_USER=120;
    public static final int LIMIT=59;
    public static final int EXECUTE=55;
    public static final int INSERTING=111;
    public static final int GTH=93;
    public static final int NOTFOUND=104;
    public static final int PRAGMA=74;
    public static final int RESULT_CACHE=40;
    public static final int TABLE=30;
    public static final int LLABEL=77;
    public static final int UPDATE=87;
    public static final int FOR=65;
    public static final int ID=8;
    public static final int AND=69;
    public static final int ASTERISK=99;
    public static final int LPAREN=11;
    public static final int LOCK=81;
    public static final int UPDATING=112;
    public static final int IF=71;
    public static final int RLABEL=78;
    public static final int ML_COMMENT=133;
    public static final int AS=41;
    public static final int INDEX=31;
    public static final int ROWTYPE=36;
    public static final int IN=14;
    public static final int THEN=47;
    public static final int CONTINUE=54;
    public static final int COMMA=12;
    public static final int IS=20;
    public static final int QUOTED_STRING=109;
    public static final int PLUS=97;
    public static final int EXISTS=110;
    public static final int DOT=34;
    public static final int LIKE=95;
    public static final int INTEGER=105;
    public static final int BY=32;
    public static final int VARRAY=29;
    public static final int PARALLEL_ENABLE=39;
    public static final int PERCENT=35;
    public static final int DOUBLEQUOTED_STRING=123;
    public static final int DEFAULT=18;
    public static final int FORALL=66;
    public static final int SET=85;
    public static final int MINUS=96;
    public static final int TRUE=107;
    public static final int SEMI=6;
    public static final int PROCEDURE=7;
    public static final int NOT_EQ=90;
    public static final int REF=33;
    public static final int VERTBAR=128;
    public static final int COLON=48;
    public static final int OPEN=73;
    public static final int LTH=91;
    public static final int BULK_ROWCOUNT=102;
    public static final int COMMIT=79;
    public static final int CLOSE=53;
    public static final int WHEN=44;
    public static final int ASSIGN=17;
    public static final int NUMBER_VALUE=130;
    public static final int IMMEDIATE=56;
    public static final int ARROW=114;
    public static final int DECLARE=76;
    public static final int DELETING=113;
    public static final int BULK=61;
    public static final int BETWEEN=68;
    public static final int LEQ=92;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "procedure_declaration", "delete_statement", "exception_declaration", 
        "constant_declaration", "update_statement", "kROWCOUNT", "kFOUND", 
        "datatype", "parameter", "function_definition", "kMOD", "pragma", 
        "match_parens", "like_expr", "create_object", "swallow_to_semi", 
        "kINDICES", "for_loop_statement", "bounds_clause", "create_procedure", 
        "param_modifiers", "plsql_block", "fetch_statement", "raise_statement", 
        "call", "or_expr", "kERRORS", "numeric_literal", "cursor_definition", 
        "commit_statement", "bulk_collect_into_clause", "create_function", 
        "mul_expr", "using_clause", "exit_statement", "numeric_atom", "kEXCEPTIONS", 
        "record_field_declaration", "close_statement", "forall_statement", 
        "sqlplus_file", "not_expr", "collection_exists", "item_declaration", 
        "kNAME", "execute_immediate_statement", "statement", "basic_loop_statement", 
        "lock_table_statement", "index", "kOF", "kVALUES", "dynamic_returning_clause", 
        "function_declaration_or_definition", "kSAVE", "conditional_predicate", 
        "and_expr", "assign_or_call_statement", "sql_statement", "parameter_declaration", 
        "insert_statement", "compare_expr", "add_expr", "continue_statement", 
        "set_transaction_statement", "numeric_expression", "goto_statement", 
        "qual_id", "function_declaration", "variable_declaration", "declare_section", 
        "create_package_body", "procedure_declaration_or_definition", "into_clause", 
        "function_heading", "exponent_expr", "label", "nested_table_type_definition", 
        "select_statement", "parameter_declarations", "while_loop_statement", 
        "kSHOW", "in_expr", "case_statement", "varray_type_definition", 
        "kREPLACE", "associative_index_type", "type_definition", "null_statement", 
        "open_statement", "body", "exception_handler", "record_type_definition", 
        "return_statement", "label_name", "delete_call", "create_package", 
        "kTYPE", "show_errors", "call_args", "subtype_definition", "expression", 
        "boolean_literal", "savepoint_statement", "atom", "boolean_atom", 
        "procedure_heading", "collection_type_definition", "invoker_rights_clause", 
        "variable_or_function_call", "lvalue", "unary_sign_expr", "if_statement", 
        "between_expr", "rollback_statement", "ref_cursor_type_definition", 
        "procedure_definition", "attribute", "call_spec", "string_literal", 
        "is_null_expr"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public PLSQLParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public PLSQLParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public PLSQLParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return PLSQLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g"; }



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



    public static class sqlplus_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlplus_file"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:82:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
    public final PLSQLParser.sqlplus_file_return sqlplus_file() throws RecognitionException {
        PLSQLParser.sqlplus_file_return retval = new PLSQLParser.sqlplus_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIVIDE2=null;
        Token DIVIDE4=null;
        Token EOF5=null;
        PLSQLParser.create_object_return create_object1 = null;

        PLSQLParser.show_errors_return show_errors3 = null;


        Object DIVIDE2_tree=null;
        Object DIVIDE4_tree=null;
        Object EOF5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sqlplus_file");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(83,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==CREATE) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    dbg.location(83,9);
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file78);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    dbg.location(83,23);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:23: ( DIVIDE show_errors )?
            	    int alt1=2;
            	    try { dbg.enterSubRule(1);
            	    try { dbg.enterDecision(1);

            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==DIVIDE) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==ID) ) {
            	            alt1=1;
            	        }
            	    }
            	    } finally {dbg.exitDecision(1);}

            	    switch (alt1) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:25: DIVIDE show_errors
            	            {
            	            dbg.location(83,25);
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file82); 
            	            DIVIDE2_tree = (Object)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            dbg.location(83,32);
            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file84);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(83,47);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:47: ( DIVIDE )?
            	    int alt2=2;
            	    try { dbg.enterSubRule(2);
            	    try { dbg.enterDecision(2);

            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    } finally {dbg.exitDecision(2);}

            	    switch (alt2) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:47: DIVIDE
            	            {
            	            dbg.location(83,47);
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file89); 
            	            DIVIDE4_tree = (Object)adaptor.create(DIVIDE4);
            	            adaptor.addChild(root_0, DIVIDE4_tree);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(2);}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(83,58);
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file95); 
            EOF5_tree = (Object)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(84, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sqlplus_file");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sqlplus_file"

    public static class show_errors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "show_errors"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:86:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQLParser.show_errors_return show_errors() throws RecognitionException {
        PLSQLParser.show_errors_return retval = new PLSQLParser.show_errors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI8=null;
        PLSQLParser.kSHOW_return kSHOW6 = null;

        PLSQLParser.kERRORS_return kERRORS7 = null;


        Object SEMI8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "show_errors");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:87:5: ( kSHOW kERRORS ( SEMI )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:87:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(87,7);
            pushFollow(FOLLOW_kSHOW_in_show_errors116);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            dbg.location(87,13);
            pushFollow(FOLLOW_kERRORS_in_show_errors118);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            dbg.location(87,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:87:21: ( SEMI )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:87:21: SEMI
                    {
                    dbg.location(87,21);
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors120); 
                    SEMI8_tree = (Object)adaptor.create(SEMI8);
                    adaptor.addChild(root_0, SEMI8_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "show_errors");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "show_errors"

    public static class create_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_object"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:90:1: create_object : ( create_package | create_package_body | create_function | create_procedure );
    public final PLSQLParser.create_object_return create_object() throws RecognitionException {
        PLSQLParser.create_object_return retval = new PLSQLParser.create_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.create_package_return create_package9 = null;

        PLSQLParser.create_package_body_return create_package_body10 = null;

        PLSQLParser.create_function_return create_function11 = null;

        PLSQLParser.create_procedure_return create_procedure12 = null;



        try { dbg.enterRule(getGrammarFileName(), "create_object");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:91:5: ( create_package | create_package_body | create_function | create_procedure )
            int alt5=4;
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case OR:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case PROCEDURE:
                            {
                            alt5=4;
                            }
                            break;
                        case PACKAGE:
                            {
                            int LA5_3 = input.LA(5);

                            if ( (LA5_3==BODY) ) {
                                alt5=2;
                            }
                            else if ( (LA5_3==ID) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 3, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case FUNCTION:
                            {
                            alt5=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 6, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case PACKAGE:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==BODY) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==ID) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case FUNCTION:
                    {
                    alt5=3;
                    }
                    break;
                case PROCEDURE:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:91:7: create_package
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(91,7);
                    pushFollow(FOLLOW_create_package_in_create_object138);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:92:7: create_package_body
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(92,7);
                    pushFollow(FOLLOW_create_package_body_in_create_object146);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:93:7: create_function
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(93,7);
                    pushFollow(FOLLOW_create_function_in_create_object154);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:94:7: create_procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(94,7);
                    pushFollow(FOLLOW_create_procedure_in_create_object162);
                    create_procedure12=create_procedure();

                    state._fsp--;

                    adaptor.addChild(root_0, create_procedure12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(95, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "create_object");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "create_object"

    public static class procedure_heading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:97:1: procedure_heading : PROCEDURE ID ( parameter_declarations )? ;
    public final PLSQLParser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQLParser.procedure_heading_return retval = new PLSQLParser.procedure_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE13=null;
        Token ID14=null;
        PLSQLParser.parameter_declarations_return parameter_declarations15 = null;


        Object PROCEDURE13_tree=null;
        Object ID14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedure_heading");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:97:19: ( PROCEDURE ID ( parameter_declarations )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:98:9: PROCEDURE ID ( parameter_declarations )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(98,9);
            PROCEDURE13=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading183); 
            PROCEDURE13_tree = (Object)adaptor.create(PROCEDURE13);
            adaptor.addChild(root_0, PROCEDURE13_tree);

            dbg.location(98,19);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_procedure_heading185); 
            ID14_tree = (Object)adaptor.create(ID14);
            adaptor.addChild(root_0, ID14_tree);

            dbg.location(98,22);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:98:22: ( parameter_declarations )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:98:22: parameter_declarations
                    {
                    dbg.location(98,22);
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading187);
                    parameter_declarations15=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(99, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedure_heading");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedure_heading"

    public static class function_heading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:101:1: function_heading : FUNCTION ID ( parameter_declarations )? RETURN datatype ;
    public final PLSQLParser.function_heading_return function_heading() throws RecognitionException {
        PLSQLParser.function_heading_return retval = new PLSQLParser.function_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION16=null;
        Token ID17=null;
        Token RETURN19=null;
        PLSQLParser.parameter_declarations_return parameter_declarations18 = null;

        PLSQLParser.datatype_return datatype20 = null;


        Object FUNCTION16_tree=null;
        Object ID17_tree=null;
        Object RETURN19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_heading");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:101:18: ( FUNCTION ID ( parameter_declarations )? RETURN datatype )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:102:9: FUNCTION ID ( parameter_declarations )? RETURN datatype
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,9);
            FUNCTION16=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading209); 
            FUNCTION16_tree = (Object)adaptor.create(FUNCTION16);
            adaptor.addChild(root_0, FUNCTION16_tree);

            dbg.location(102,18);
            ID17=(Token)match(input,ID,FOLLOW_ID_in_function_heading211); 
            ID17_tree = (Object)adaptor.create(ID17);
            adaptor.addChild(root_0, ID17_tree);

            dbg.location(102,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:102:21: ( parameter_declarations )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:102:21: parameter_declarations
                    {
                    dbg.location(102,21);
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading213);
                    parameter_declarations18=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations18.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(102,45);
            RETURN19=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading216); 
            RETURN19_tree = (Object)adaptor.create(RETURN19);
            adaptor.addChild(root_0, RETURN19_tree);

            dbg.location(102,52);
            pushFollow(FOLLOW_datatype_in_function_heading218);
            datatype20=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype20.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(103, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_heading");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_heading"

    public static class parameter_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declarations"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:105:1: parameter_declarations : ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) ;
    public final PLSQLParser.parameter_declarations_return parameter_declarations() throws RecognitionException {
        PLSQLParser.parameter_declarations_return retval = new PLSQLParser.parameter_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN21=null;
        Token COMMA23=null;
        Token RPAREN25=null;
        PLSQLParser.parameter_declaration_return parameter_declaration22 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration24 = null;


        Object LPAREN21_tree=null;
        Object COMMA23_tree=null;
        Object RPAREN25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameter_declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:105:24: ( ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:13: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
            {
            dbg.location(106,13);
            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations243); 
            LPAREN21_tree = (Object)adaptor.create(LPAREN21);
            adaptor.addChild(root_0, LPAREN21_tree);

            dbg.location(106,21);
            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations246);
            parameter_declaration22=parameter_declaration();

            state._fsp--;

            adaptor.addChild(root_0, parameter_declaration22.getTree());
            dbg.location(106,43);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:43: ( COMMA parameter_declaration )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:45: COMMA parameter_declaration
            	    {
            	    dbg.location(106,45);
            	    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations250); 
            	    COMMA23_tree = (Object)adaptor.create(COMMA23);
            	    adaptor.addChild(root_0, COMMA23_tree);

            	    dbg.location(106,52);
            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations253);
            	    parameter_declaration24=parameter_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter_declaration24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(106,77);
            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations258); 
            RPAREN25_tree = (Object)adaptor.create(RPAREN25);
            adaptor.addChild(root_0, RPAREN25_tree);


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(107, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameter_declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameter_declarations"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:109:1: parameter_declaration : ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQLParser.parameter_declaration_return retval = new PLSQLParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID26=null;
        Token IN27=null;
        Token OUT28=null;
        Token IN29=null;
        Token OUT30=null;
        Token NOCOPY31=null;
        Token set33=null;
        PLSQLParser.datatype_return datatype32 = null;

        PLSQLParser.expression_return expression34 = null;


        Object ID26_tree=null;
        Object IN27_tree=null;
        Object OUT28_tree=null;
        Object IN29_tree=null;
        Object OUT30_tree=null;
        Object NOCOPY31_tree=null;
        Object set33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameter_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:109:23: ( ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:9: ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,9);
            ID26=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration281); 
            ID26_tree = (Object)adaptor.create(ID26);
            adaptor.addChild(root_0, ID26_tree);

            dbg.location(110,12);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:12: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )?
            int alt11=3;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==IN) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==OUT) ) {
                    alt11=2;
                }
                else if ( (LA11_1==ID||LA11_1==REF) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==OUT) ) {
                alt11=2;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:14: IN
                    {
                    dbg.location(110,14);
                    IN27=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration285); 
                    IN27_tree = (Object)adaptor.create(IN27);
                    adaptor.addChild(root_0, IN27_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    dbg.location(110,19);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:21: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    dbg.location(110,21);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:21: ( OUT | IN OUT )
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==OUT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==IN) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:23: OUT
                            {
                            dbg.location(110,23);
                            OUT28=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration293); 
                            OUT28_tree = (Object)adaptor.create(OUT28);
                            adaptor.addChild(root_0, OUT28_tree);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:29: IN OUT
                            {
                            dbg.location(110,29);
                            IN29=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration297); 
                            IN29_tree = (Object)adaptor.create(IN29);
                            adaptor.addChild(root_0, IN29_tree);

                            dbg.location(110,32);
                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration299); 
                            OUT30_tree = (Object)adaptor.create(OUT30);
                            adaptor.addChild(root_0, OUT30_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(110,38);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:38: ( NOCOPY )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOCOPY) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:110:38: NOCOPY
                            {
                            dbg.location(110,38);
                            NOCOPY31=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_parameter_declaration303); 
                            NOCOPY31_tree = (Object)adaptor.create(NOCOPY31);
                            adaptor.addChild(root_0, NOCOPY31_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(110,51);
            pushFollow(FOLLOW_datatype_in_parameter_declaration311);
            datatype32=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype32.getTree());
            dbg.location(111,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:111:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ASSIGN && LA12_0<=DEFAULT)) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:111:11: ( ASSIGN | DEFAULT ) expression
                    {
                    dbg.location(111,11);
                    set33=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set33));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(111,32);
                    pushFollow(FOLLOW_expression_in_parameter_declaration333);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameter_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class declare_section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:114:1: declare_section : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ ;
    public final PLSQLParser.declare_section_return declare_section() throws RecognitionException {
        PLSQLParser.declare_section_return retval = new PLSQLParser.declare_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI36=null;
        Token SEMI38=null;
        Token SEMI40=null;
        Token SEMI42=null;
        Token SEMI44=null;
        Token SEMI46=null;
        Token SEMI48=null;
        PLSQLParser.type_definition_return type_definition35 = null;

        PLSQLParser.subtype_definition_return subtype_definition37 = null;

        PLSQLParser.cursor_definition_return cursor_definition39 = null;

        PLSQLParser.item_declaration_return item_declaration41 = null;

        PLSQLParser.function_declaration_or_definition_return function_declaration_or_definition43 = null;

        PLSQLParser.procedure_declaration_or_definition_return procedure_declaration_or_definition45 = null;

        PLSQLParser.pragma_return pragma47 = null;


        Object SEMI36_tree=null;
        Object SEMI38_tree=null;
        Object SEMI40_tree=null;
        Object SEMI42_tree=null;
        Object SEMI44_tree=null;
        Object SEMI46_tree=null;
        Object SEMI48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declare_section");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:114:17: ( ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:115:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,5);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:115:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            int cnt13=0;
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=8;
                try { dbg.enterDecision(13);

                try {
                    isCyclicDecision = true;
                    alt13 = dfa13.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:115:7: type_definition SEMI
            	    {
            	    dbg.location(115,7);
            	    pushFollow(FOLLOW_type_definition_in_declare_section355);
            	    type_definition35=type_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_definition35.getTree());
            	    dbg.location(115,23);
            	    SEMI36=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section357); 
            	    SEMI36_tree = (Object)adaptor.create(SEMI36);
            	    adaptor.addChild(root_0, SEMI36_tree);


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:116:7: subtype_definition SEMI
            	    {
            	    dbg.location(116,7);
            	    pushFollow(FOLLOW_subtype_definition_in_declare_section365);
            	    subtype_definition37=subtype_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subtype_definition37.getTree());
            	    dbg.location(116,26);
            	    SEMI38=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section367); 
            	    SEMI38_tree = (Object)adaptor.create(SEMI38);
            	    adaptor.addChild(root_0, SEMI38_tree);


            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:117:7: cursor_definition SEMI
            	    {
            	    dbg.location(117,7);
            	    pushFollow(FOLLOW_cursor_definition_in_declare_section375);
            	    cursor_definition39=cursor_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cursor_definition39.getTree());
            	    dbg.location(117,25);
            	    SEMI40=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section377); 
            	    SEMI40_tree = (Object)adaptor.create(SEMI40);
            	    adaptor.addChild(root_0, SEMI40_tree);


            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:118:7: item_declaration SEMI
            	    {
            	    dbg.location(118,7);
            	    pushFollow(FOLLOW_item_declaration_in_declare_section385);
            	    item_declaration41=item_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_declaration41.getTree());
            	    dbg.location(118,24);
            	    SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section387); 
            	    SEMI42_tree = (Object)adaptor.create(SEMI42);
            	    adaptor.addChild(root_0, SEMI42_tree);


            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:119:7: function_declaration_or_definition SEMI
            	    {
            	    dbg.location(119,7);
            	    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section395);
            	    function_declaration_or_definition43=function_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_declaration_or_definition43.getTree());
            	    dbg.location(119,42);
            	    SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section397); 
            	    SEMI44_tree = (Object)adaptor.create(SEMI44);
            	    adaptor.addChild(root_0, SEMI44_tree);


            	    }
            	    break;
            	case 6 :
            	    dbg.enterAlt(6);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:120:7: procedure_declaration_or_definition SEMI
            	    {
            	    dbg.location(120,7);
            	    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section405);
            	    procedure_declaration_or_definition45=procedure_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedure_declaration_or_definition45.getTree());
            	    dbg.location(120,43);
            	    SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section407); 
            	    SEMI46_tree = (Object)adaptor.create(SEMI46);
            	    adaptor.addChild(root_0, SEMI46_tree);


            	    }
            	    break;
            	case 7 :
            	    dbg.enterAlt(7);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:121:7: pragma SEMI
            	    {
            	    dbg.location(121,7);
            	    pushFollow(FOLLOW_pragma_in_declare_section415);
            	    pragma47=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma47.getTree());
            	    dbg.location(121,14);
            	    SEMI48=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section417); 
            	    SEMI48_tree = (Object)adaptor.create(SEMI48);
            	    adaptor.addChild(root_0, SEMI48_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt13++;
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(123, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declare_section");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declare_section"

    public static class cursor_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:125:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement ;
    public final PLSQLParser.cursor_definition_return cursor_definition() throws RecognitionException {
        PLSQLParser.cursor_definition_return retval = new PLSQLParser.cursor_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CURSOR49=null;
        Token ID50=null;
        Token IS52=null;
        PLSQLParser.parameter_declarations_return parameter_declarations51 = null;

        PLSQLParser.select_statement_return select_statement53 = null;


        Object CURSOR49_tree=null;
        Object ID50_tree=null;
        Object IS52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cursor_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:125:19: ( CURSOR ID ( parameter_declarations )? IS select_statement )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:126:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,9);
            CURSOR49=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition445); 
            CURSOR49_tree = (Object)adaptor.create(CURSOR49);
            adaptor.addChild(root_0, CURSOR49_tree);

            dbg.location(126,16);
            ID50=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition447); 
            ID50_tree = (Object)adaptor.create(ID50);
            adaptor.addChild(root_0, ID50_tree);

            dbg.location(126,19);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:126:19: ( parameter_declarations )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==LPAREN) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:126:19: parameter_declarations
                    {
                    dbg.location(126,19);
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition449);
                    parameter_declarations51=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations51.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(126,43);
            IS52=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition452); 
            IS52_tree = (Object)adaptor.create(IS52);
            adaptor.addChild(root_0, IS52_tree);

            dbg.location(126,46);
            pushFollow(FOLLOW_select_statement_in_cursor_definition454);
            select_statement53=select_statement();

            state._fsp--;

            adaptor.addChild(root_0, select_statement53.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(127, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cursor_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cursor_definition"

    public static class item_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:129:1: item_declaration : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQLParser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQLParser.item_declaration_return retval = new PLSQLParser.item_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.variable_declaration_return variable_declaration54 = null;

        PLSQLParser.constant_declaration_return constant_declaration55 = null;

        PLSQLParser.exception_declaration_return exception_declaration56 = null;



        try { dbg.enterRule(getGrammarFileName(), "item_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:130:5: ( variable_declaration | constant_declaration | exception_declaration )
            int alt15=3;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                switch ( input.LA(2) ) {
                case CONSTANT:
                    {
                    alt15=2;
                    }
                    break;
                case EXCEPTION:
                    {
                    alt15=3;
                    }
                    break;
                case ID:
                case REF:
                    {
                    alt15=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:130:7: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(130,7);
                    pushFollow(FOLLOW_variable_declaration_in_item_declaration471);
                    variable_declaration54=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration54.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:131:7: constant_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(131,7);
                    pushFollow(FOLLOW_constant_declaration_in_item_declaration479);
                    constant_declaration55=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration55.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:132:7: exception_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(132,7);
                    pushFollow(FOLLOW_exception_declaration_in_item_declaration487);
                    exception_declaration56=exception_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, exception_declaration56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(133, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "item_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "item_declaration"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:135:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.variable_declaration_return variable_declaration() throws RecognitionException {
        PLSQLParser.variable_declaration_return retval = new PLSQLParser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID57=null;
        Token NOT59=null;
        Token NULL60=null;
        Token set61=null;
        PLSQLParser.datatype_return datatype58 = null;

        PLSQLParser.expression_return expression62 = null;


        Object ID57_tree=null;
        Object NOT59_tree=null;
        Object NULL60_tree=null;
        Object set61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:135:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,9);
            ID57=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration508); 
            ID57_tree = (Object)adaptor.create(ID57);
            adaptor.addChild(root_0, ID57_tree);

            dbg.location(136,12);
            pushFollow(FOLLOW_datatype_in_variable_declaration510);
            datatype58=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype58.getTree());
            dbg.location(136,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=ASSIGN && LA17_0<=DEFAULT)||LA17_0==NOT) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    dbg.location(136,24);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:24: ( NOT NULL )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NOT) ) {
                        alt16=1;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:27: NOT NULL
                            {
                            dbg.location(136,27);
                            NOT59=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration518); 
                            NOT59_tree = (Object)adaptor.create(NOT59);
                            adaptor.addChild(root_0, NOT59_tree);

                            dbg.location(136,31);
                            NULL60=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration520); 
                            NULL60_tree = (Object)adaptor.create(NULL60);
                            adaptor.addChild(root_0, NULL60_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(136,39);
                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set61));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(136,62);
                    pushFollow(FOLLOW_expression_in_variable_declaration537);
                    expression62=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression62.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(137, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable_declaration"

    public static class constant_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:139:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
    public final PLSQLParser.constant_declaration_return constant_declaration() throws RecognitionException {
        PLSQLParser.constant_declaration_return retval = new PLSQLParser.constant_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID63=null;
        Token CONSTANT64=null;
        Token NOT66=null;
        Token NULL67=null;
        Token set68=null;
        PLSQLParser.datatype_return datatype65 = null;

        PLSQLParser.expression_return expression69 = null;


        Object ID63_tree=null;
        Object CONSTANT64_tree=null;
        Object NOT66_tree=null;
        Object NULL67_tree=null;
        Object set68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constant_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:139:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:140:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,9);
            ID63=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration562); 
            ID63_tree = (Object)adaptor.create(ID63);
            adaptor.addChild(root_0, ID63_tree);

            dbg.location(140,12);
            CONSTANT64=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration564); 
            CONSTANT64_tree = (Object)adaptor.create(CONSTANT64);
            adaptor.addChild(root_0, CONSTANT64_tree);

            dbg.location(140,21);
            pushFollow(FOLLOW_datatype_in_constant_declaration566);
            datatype65=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype65.getTree());
            dbg.location(140,30);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:140:30: ( NOT NULL )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==NOT) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:140:32: NOT NULL
                    {
                    dbg.location(140,32);
                    NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration570); 
                    NOT66_tree = (Object)adaptor.create(NOT66);
                    adaptor.addChild(root_0, NOT66_tree);

                    dbg.location(140,36);
                    NULL67=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration572); 
                    NULL67_tree = (Object)adaptor.create(NULL67);
                    adaptor.addChild(root_0, NULL67_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(140,44);
            set68=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set68));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(140,69);
            pushFollow(FOLLOW_expression_in_constant_declaration591);
            expression69=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression69.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(141, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constant_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constant_declaration"

    public static class exception_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:143:1: exception_declaration : ID EXCEPTION ;
    public final PLSQLParser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQLParser.exception_declaration_return retval = new PLSQLParser.exception_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID70=null;
        Token EXCEPTION71=null;

        Object ID70_tree=null;
        Object EXCEPTION71_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exception_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:143:23: ( ID EXCEPTION )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:144:9: ID EXCEPTION
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,9);
            ID70=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration612); 
            ID70_tree = (Object)adaptor.create(ID70);
            adaptor.addChild(root_0, ID70_tree);

            dbg.location(144,12);
            EXCEPTION71=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration614); 
            EXCEPTION71_tree = (Object)adaptor.create(EXCEPTION71);
            adaptor.addChild(root_0, EXCEPTION71_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(145, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exception_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exception_declaration"

    public static class type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:147:1: type_definition : kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) ;
    public final PLSQLParser.type_definition_return type_definition() throws RecognitionException {
        PLSQLParser.type_definition_return retval = new PLSQLParser.type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID73=null;
        Token IS74=null;
        PLSQLParser.kTYPE_return kTYPE72 = null;

        PLSQLParser.record_type_definition_return record_type_definition75 = null;

        PLSQLParser.collection_type_definition_return collection_type_definition76 = null;

        PLSQLParser.ref_cursor_type_definition_return ref_cursor_type_definition77 = null;


        Object ID73_tree=null;
        Object IS74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:147:17: ( kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:9: kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,9);
            pushFollow(FOLLOW_kTYPE_in_type_definition635);
            kTYPE72=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE72.getTree());
            dbg.location(148,15);
            ID73=(Token)match(input,ID,FOLLOW_ID_in_type_definition637); 
            ID73_tree = (Object)adaptor.create(ID73);
            adaptor.addChild(root_0, ID73_tree);

            dbg.location(148,18);
            IS74=(Token)match(input,IS,FOLLOW_IS_in_type_definition639); 
            IS74_tree = (Object)adaptor.create(IS74);
            adaptor.addChild(root_0, IS74_tree);

            dbg.location(148,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:21: ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            int alt19=3;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case RECORD:
                {
                alt19=1;
                }
                break;
            case VARYING:
            case VARRAY:
            case TABLE:
                {
                alt19=2;
                }
                break;
            case REF:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:23: record_type_definition
                    {
                    dbg.location(148,23);
                    pushFollow(FOLLOW_record_type_definition_in_type_definition643);
                    record_type_definition75=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:48: collection_type_definition
                    {
                    dbg.location(148,48);
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition647);
                    collection_type_definition76=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition76.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:77: ref_cursor_type_definition
                    {
                    dbg.location(148,77);
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition651);
                    ref_cursor_type_definition77=ref_cursor_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_cursor_type_definition77.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(149, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type_definition"

    public static class subtype_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subtype_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:151:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
    public final PLSQLParser.subtype_definition_return subtype_definition() throws RecognitionException {
        PLSQLParser.subtype_definition_return retval = new PLSQLParser.subtype_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUBTYPE78=null;
        Token ID79=null;
        Token IS80=null;
        Token NOT82=null;
        Token NULL83=null;
        PLSQLParser.datatype_return datatype81 = null;


        Object SUBTYPE78_tree=null;
        Object ID79_tree=null;
        Object IS80_tree=null;
        Object NOT82_tree=null;
        Object NULL83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "subtype_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:151:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:152:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,9);
            SUBTYPE78=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition674); 
            SUBTYPE78_tree = (Object)adaptor.create(SUBTYPE78);
            adaptor.addChild(root_0, SUBTYPE78_tree);

            dbg.location(152,17);
            ID79=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition676); 
            ID79_tree = (Object)adaptor.create(ID79);
            adaptor.addChild(root_0, ID79_tree);

            dbg.location(152,20);
            IS80=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition678); 
            IS80_tree = (Object)adaptor.create(IS80);
            adaptor.addChild(root_0, IS80_tree);

            dbg.location(152,23);
            pushFollow(FOLLOW_datatype_in_subtype_definition680);
            datatype81=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype81.getTree());
            dbg.location(152,32);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:152:32: ( NOT NULL )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==NOT) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:152:34: NOT NULL
                    {
                    dbg.location(152,34);
                    NOT82=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition684); 
                    NOT82_tree = (Object)adaptor.create(NOT82);
                    adaptor.addChild(root_0, NOT82_tree);

                    dbg.location(152,38);
                    NULL83=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition686); 
                    NULL83_tree = (Object)adaptor.create(NULL83);
                    adaptor.addChild(root_0, NULL83_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(153, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "subtype_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "subtype_definition"

    public static class record_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:155:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
    public final PLSQLParser.record_type_definition_return record_type_definition() throws RecognitionException {
        PLSQLParser.record_type_definition_return retval = new PLSQLParser.record_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECORD84=null;
        Token LPAREN85=null;
        Token COMMA87=null;
        Token RPAREN89=null;
        PLSQLParser.record_field_declaration_return record_field_declaration86 = null;

        PLSQLParser.record_field_declaration_return record_field_declaration88 = null;


        Object RECORD84_tree=null;
        Object LPAREN85_tree=null;
        Object COMMA87_tree=null;
        Object RPAREN89_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "record_type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:155:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:156:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,2);
            RECORD84=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition707); 
            RECORD84_tree = (Object)adaptor.create(RECORD84);
            adaptor.addChild(root_0, RECORD84_tree);

            dbg.location(156,9);
            LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition709); 
            LPAREN85_tree = (Object)adaptor.create(LPAREN85);
            adaptor.addChild(root_0, LPAREN85_tree);

            dbg.location(156,16);
            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition711);
            record_field_declaration86=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration86.getTree());
            dbg.location(156,41);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:156:41: ( COMMA record_field_declaration )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:156:43: COMMA record_field_declaration
            	    {
            	    dbg.location(156,43);
            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition715); 
            	    COMMA87_tree = (Object)adaptor.create(COMMA87);
            	    adaptor.addChild(root_0, COMMA87_tree);

            	    dbg.location(156,49);
            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition717);
            	    record_field_declaration88=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration88.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(156,77);
            RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition722); 
            RPAREN89_tree = (Object)adaptor.create(RPAREN89);
            adaptor.addChild(root_0, RPAREN89_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(157, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "record_type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "record_type_definition"

    public static class record_field_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_field_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:159:1: record_field_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.record_field_declaration_return record_field_declaration() throws RecognitionException {
        PLSQLParser.record_field_declaration_return retval = new PLSQLParser.record_field_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID90=null;
        Token NOT92=null;
        Token NULL93=null;
        Token set94=null;
        PLSQLParser.datatype_return datatype91 = null;

        PLSQLParser.expression_return expression95 = null;


        Object ID90_tree=null;
        Object NOT92_tree=null;
        Object NULL93_tree=null;
        Object set94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "record_field_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:159:26: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,2);
            ID90=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration736); 
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);

            dbg.location(160,5);
            pushFollow(FOLLOW_datatype_in_record_field_declaration738);
            datatype91=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype91.getTree());
            dbg.location(160,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:14: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ASSIGN && LA23_0<=DEFAULT)||LA23_0==NOT) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:16: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    dbg.location(160,16);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:16: ( NOT NULL )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NOT) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:18: NOT NULL
                            {
                            dbg.location(160,18);
                            NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration744); 
                            NOT92_tree = (Object)adaptor.create(NOT92);
                            adaptor.addChild(root_0, NOT92_tree);

                            dbg.location(160,22);
                            NULL93=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration746); 
                            NULL93_tree = (Object)adaptor.create(NULL93);
                            adaptor.addChild(root_0, NULL93_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(160,30);
                    set94=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set94));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(160,51);
                    pushFollow(FOLLOW_expression_in_record_field_declaration761);
                    expression95=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression95.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(161, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "record_field_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "record_field_declaration"

    public static class collection_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:163:1: collection_type_definition : ( varray_type_definition | nested_table_type_definition );
    public final PLSQLParser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQLParser.collection_type_definition_return retval = new PLSQLParser.collection_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.varray_type_definition_return varray_type_definition96 = null;

        PLSQLParser.nested_table_type_definition_return nested_table_type_definition97 = null;



        try { dbg.enterRule(getGrammarFileName(), "collection_type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:164:2: ( varray_type_definition | nested_table_type_definition )
            int alt24=2;
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==VARYING||LA24_0==VARRAY) ) {
                alt24=1;
            }
            else if ( (LA24_0==TABLE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:164:4: varray_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(164,4);
                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition778);
                    varray_type_definition96=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition96.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:165:4: nested_table_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(165,4);
                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition783);
                    nested_table_type_definition97=nested_table_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, nested_table_type_definition97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(166, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "collection_type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "collection_type_definition"

    public static class varray_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varray_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:168:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
    public final PLSQLParser.varray_type_definition_return varray_type_definition() throws RecognitionException {
        PLSQLParser.varray_type_definition_return retval = new PLSQLParser.varray_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARYING98=null;
        Token ARRAY99=null;
        Token VARRAY100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        Token NOT106=null;
        Token NULL107=null;
        PLSQLParser.numeric_literal_return numeric_literal102 = null;

        PLSQLParser.kOF_return kOF104 = null;

        PLSQLParser.datatype_return datatype105 = null;


        Object VARYING98_tree=null;
        Object ARRAY99_tree=null;
        Object VARRAY100_tree=null;
        Object LPAREN101_tree=null;
        Object RPAREN103_tree=null;
        Object NOT106_tree=null;
        Object NULL107_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "varray_type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,4);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:4: ( VARYING ( ARRAY )? | VARRAY )
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==VARYING) ) {
                alt26=1;
            }
            else if ( (LA26_0==VARRAY) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:6: VARYING ( ARRAY )?
                    {
                    dbg.location(169,6);
                    VARYING98=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition796); 
                    VARYING98_tree = (Object)adaptor.create(VARYING98);
                    adaptor.addChild(root_0, VARYING98_tree);

                    dbg.location(169,14);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:14: ( ARRAY )?
                    int alt25=2;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25);

                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ARRAY) ) {
                        alt25=1;
                    }
                    } finally {dbg.exitDecision(25);}

                    switch (alt25) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:14: ARRAY
                            {
                            dbg.location(169,14);
                            ARRAY99=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition798); 
                            ARRAY99_tree = (Object)adaptor.create(ARRAY99);
                            adaptor.addChild(root_0, ARRAY99_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:23: VARRAY
                    {
                    dbg.location(169,23);
                    VARRAY100=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition803); 
                    VARRAY100_tree = (Object)adaptor.create(VARRAY100);
                    adaptor.addChild(root_0, VARRAY100_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(169,32);
            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition807); 
            LPAREN101_tree = (Object)adaptor.create(LPAREN101);
            adaptor.addChild(root_0, LPAREN101_tree);

            dbg.location(169,39);
            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition809);
            numeric_literal102=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal102.getTree());
            dbg.location(169,55);
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition811); 
            RPAREN103_tree = (Object)adaptor.create(RPAREN103);
            adaptor.addChild(root_0, RPAREN103_tree);

            dbg.location(169,62);
            pushFollow(FOLLOW_kOF_in_varray_type_definition813);
            kOF104=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF104.getTree());
            dbg.location(169,66);
            pushFollow(FOLLOW_datatype_in_varray_type_definition815);
            datatype105=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype105.getTree());
            dbg.location(169,75);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:75: ( NOT NULL )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:77: NOT NULL
                    {
                    dbg.location(169,77);
                    NOT106=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition819); 
                    NOT106_tree = (Object)adaptor.create(NOT106);
                    adaptor.addChild(root_0, NOT106_tree);

                    dbg.location(169,81);
                    NULL107=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition821); 
                    NULL107_tree = (Object)adaptor.create(NULL107);
                    adaptor.addChild(root_0, NULL107_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(170, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varray_type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varray_type_definition"

    public static class nested_table_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_table_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:172:1: nested_table_type_definition : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
    public final PLSQLParser.nested_table_type_definition_return nested_table_type_definition() throws RecognitionException {
        PLSQLParser.nested_table_type_definition_return retval = new PLSQLParser.nested_table_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TABLE108=null;
        Token NOT111=null;
        Token NULL112=null;
        Token INDEX113=null;
        Token BY114=null;
        PLSQLParser.kOF_return kOF109 = null;

        PLSQLParser.datatype_return datatype110 = null;

        PLSQLParser.associative_index_type_return associative_index_type115 = null;


        Object TABLE108_tree=null;
        Object NOT111_tree=null;
        Object NULL112_tree=null;
        Object INDEX113_tree=null;
        Object BY114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nested_table_type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:2: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:4: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(173,4);
            TABLE108=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition835); 
            TABLE108_tree = (Object)adaptor.create(TABLE108);
            adaptor.addChild(root_0, TABLE108_tree);

            dbg.location(173,10);
            pushFollow(FOLLOW_kOF_in_nested_table_type_definition837);
            kOF109=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF109.getTree());
            dbg.location(173,14);
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition839);
            datatype110=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype110.getTree());
            dbg.location(173,23);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:23: ( NOT NULL )?
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOT) ) {
                alt28=1;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:25: NOT NULL
                    {
                    dbg.location(173,25);
                    NOT111=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition843); 
                    NOT111_tree = (Object)adaptor.create(NOT111);
                    adaptor.addChild(root_0, NOT111_tree);

                    dbg.location(173,29);
                    NULL112=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition845); 
                    NULL112_tree = (Object)adaptor.create(NULL112);
                    adaptor.addChild(root_0, NULL112_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(173,37);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:37: ( INDEX BY associative_index_type )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==INDEX) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:39: INDEX BY associative_index_type
                    {
                    dbg.location(173,39);
                    INDEX113=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition852); 
                    INDEX113_tree = (Object)adaptor.create(INDEX113);
                    adaptor.addChild(root_0, INDEX113_tree);

                    dbg.location(173,45);
                    BY114=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition854); 
                    BY114_tree = (Object)adaptor.create(BY114);
                    adaptor.addChild(root_0, BY114_tree);

                    dbg.location(173,48);
                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition856);
                    associative_index_type115=associative_index_type();

                    state._fsp--;

                    adaptor.addChild(root_0, associative_index_type115.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(174, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nested_table_type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nested_table_type_definition"

    public static class associative_index_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "associative_index_type"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:176:1: associative_index_type : datatype ;
    public final PLSQLParser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQLParser.associative_index_type_return retval = new PLSQLParser.associative_index_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.datatype_return datatype116 = null;



        try { dbg.enterRule(getGrammarFileName(), "associative_index_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:177:2: ( datatype )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:177:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,4);
            pushFollow(FOLLOW_datatype_in_associative_index_type870);
            datatype116=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype116.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(178, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "associative_index_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "associative_index_type"

    public static class ref_cursor_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ref_cursor_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:180:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
    public final PLSQLParser.ref_cursor_type_definition_return ref_cursor_type_definition() throws RecognitionException {
        PLSQLParser.ref_cursor_type_definition_return retval = new PLSQLParser.ref_cursor_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF117=null;
        Token CURSOR118=null;
        Token RETURN119=null;
        PLSQLParser.datatype_return datatype120 = null;


        Object REF117_tree=null;
        Object CURSOR118_tree=null;
        Object RETURN119_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ref_cursor_type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:181:2: ( REF CURSOR ( RETURN datatype )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:181:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(181,4);
            REF117=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition881); 
            REF117_tree = (Object)adaptor.create(REF117);
            adaptor.addChild(root_0, REF117_tree);

            dbg.location(181,8);
            CURSOR118=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition883); 
            CURSOR118_tree = (Object)adaptor.create(CURSOR118);
            adaptor.addChild(root_0, CURSOR118_tree);

            dbg.location(181,15);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:181:15: ( RETURN datatype )?
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==RETURN) ) {
                alt30=1;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:181:17: RETURN datatype
                    {
                    dbg.location(181,17);
                    RETURN119=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition887); 
                    RETURN119_tree = (Object)adaptor.create(RETURN119);
                    adaptor.addChild(root_0, RETURN119_tree);

                    dbg.location(181,24);
                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition889);
                    datatype120=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype120.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(182, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ref_cursor_type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ref_cursor_type_definition"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:184:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
    public final PLSQLParser.datatype_return datatype() throws RecognitionException {
        PLSQLParser.datatype_return retval = new PLSQLParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF121=null;
        Token ID122=null;
        Token DOT123=null;
        Token ID124=null;
        Token LPAREN125=null;
        Token COMMA127=null;
        Token RPAREN129=null;
        Token PERCENT130=null;
        Token ROWTYPE132=null;
        PLSQLParser.numeric_literal_return numeric_literal126 = null;

        PLSQLParser.numeric_literal_return numeric_literal128 = null;

        PLSQLParser.kTYPE_return kTYPE131 = null;


        Object REF121_tree=null;
        Object ID122_tree=null;
        Object DOT123_tree=null;
        Object ID124_tree=null;
        Object LPAREN125_tree=null;
        Object COMMA127_tree=null;
        Object RPAREN129_tree=null;
        Object PERCENT130_tree=null;
        Object ROWTYPE132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(185,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:7: ( REF )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==REF) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:9: REF
                    {
                    dbg.location(185,9);
                    REF121=(Token)match(input,REF,FOLLOW_REF_in_datatype908); 
                    REF121_tree = (Object)adaptor.create(REF121);
                    adaptor.addChild(root_0, REF121_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(185,16);
            ID122=(Token)match(input,ID,FOLLOW_ID_in_datatype913); 
            ID122_tree = (Object)adaptor.create(ID122);
            adaptor.addChild(root_0, ID122_tree);

            dbg.location(185,19);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:19: ( DOT ID )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==DOT) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:21: DOT ID
                    {
                    dbg.location(185,21);
                    DOT123=(Token)match(input,DOT,FOLLOW_DOT_in_datatype917); 
                    DOT123_tree = (Object)adaptor.create(DOT123);
                    adaptor.addChild(root_0, DOT123_tree);

                    dbg.location(185,25);
                    ID124=(Token)match(input,ID,FOLLOW_ID_in_datatype919); 
                    ID124_tree = (Object)adaptor.create(ID124);
                    adaptor.addChild(root_0, ID124_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}

            dbg.location(185,31);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            int alt35=3;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==LPAREN) ) {
                alt35=1;
            }
            else if ( (LA35_0==PERCENT) ) {
                alt35=2;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    dbg.location(185,33);
                    LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype926); 
                    LPAREN125_tree = (Object)adaptor.create(LPAREN125);
                    adaptor.addChild(root_0, LPAREN125_tree);

                    dbg.location(185,40);
                    pushFollow(FOLLOW_numeric_literal_in_datatype928);
                    numeric_literal126=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal126.getTree());
                    dbg.location(185,56);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:56: ( COMMA numeric_literal )*
                    try { dbg.enterSubRule(33);

                    loop33:
                    do {
                        int alt33=2;
                        try { dbg.enterDecision(33);

                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        } finally {dbg.exitDecision(33);}

                        switch (alt33) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:58: COMMA numeric_literal
                    	    {
                    	    dbg.location(185,58);
                    	    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype932); 
                    	    COMMA127_tree = (Object)adaptor.create(COMMA127);
                    	    adaptor.addChild(root_0, COMMA127_tree);

                    	    dbg.location(185,64);
                    	    pushFollow(FOLLOW_numeric_literal_in_datatype934);
                    	    numeric_literal128=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(185,83);
                    RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype939); 
                    RPAREN129_tree = (Object)adaptor.create(RPAREN129);
                    adaptor.addChild(root_0, RPAREN129_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    dbg.location(185,92);
                    PERCENT130=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype943); 
                    PERCENT130_tree = (Object)adaptor.create(PERCENT130);
                    adaptor.addChild(root_0, PERCENT130_tree);

                    dbg.location(185,100);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:100: ( kTYPE | ROWTYPE )
                    int alt34=2;
                    try { dbg.enterSubRule(34);
                    try { dbg.enterDecision(34);

                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ID) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==ROWTYPE) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(34);}

                    switch (alt34) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:102: kTYPE
                            {
                            dbg.location(185,102);
                            pushFollow(FOLLOW_kTYPE_in_datatype947);
                            kTYPE131=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE131.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:110: ROWTYPE
                            {
                            dbg.location(185,110);
                            ROWTYPE132=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype951); 
                            ROWTYPE132_tree = (Object)adaptor.create(ROWTYPE132);
                            adaptor.addChild(root_0, ROWTYPE132_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(34);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(186, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datatype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "datatype"

    public static class function_declaration_or_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:1: function_declaration_or_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLParser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQLParser.function_declaration_or_definition_return retval = new PLSQLParser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set134=null;
        Token set135=null;
        PLSQLParser.function_heading_return function_heading133 = null;

        PLSQLParser.declare_section_return declare_section136 = null;

        PLSQLParser.body_return body137 = null;


        Object set134_tree=null;
        Object set135_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_declaration_or_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:36: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:189:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(189,9);
            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition977);
            function_heading133=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading133.getTree());
            dbg.location(190,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:190:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            try { dbg.enterSubRule(36);

            loop36:
            do {
                int alt36=2;
                try { dbg.enterDecision(36);

                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=DETERMINISTIC && LA36_0<=RESULT_CACHE)) ) {
                    alt36=1;
                }


                } finally {dbg.exitDecision(36);}

                switch (alt36) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    dbg.location(190,9);
            	    set134=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set134));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);
            } finally {dbg.exitSubRule(36);}

            dbg.location(191,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt38=2;
            try { dbg.enterSubRule(38);
            try { dbg.enterDecision(38);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==IS||LA38_0==AS) ) {
                alt38=1;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:11: ( IS | AS ) ( declare_section )? body
                    {
                    dbg.location(191,11);
                    set135=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set135));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(191,23);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:23: ( declare_section )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37);

                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=PROCEDURE && LA37_0<=FUNCTION)||LA37_0==CURSOR||LA37_0==SUBTYPE||LA37_0==PRAGMA) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:23: declare_section
                            {
                            dbg.location(191,23);
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1026);
                            declare_section136=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section136.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(191,40);
                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1029);
                    body137=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body137.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(38);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(192, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_declaration_or_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_declaration_or_definition"

    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:194:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQLParser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQLParser.function_declaration_return retval = new PLSQLParser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set139=null;
        PLSQLParser.function_heading_return function_heading138 = null;


        Object set139_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:194:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:195:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,9);
            pushFollow(FOLLOW_function_heading_in_function_declaration1050);
            function_heading138=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading138.getTree());
            dbg.location(196,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:196:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=DETERMINISTIC && LA39_0<=RESULT_CACHE)) ) {
                    alt39=1;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    dbg.location(196,9);
            	    set139=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set139));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(197, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_declaration"

    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:199:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body ;
    public final PLSQLParser.function_definition_return function_definition() throws RecognitionException {
        PLSQLParser.function_definition_return retval = new PLSQLParser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set141=null;
        Token set142=null;
        PLSQLParser.function_heading_return function_heading140 = null;

        PLSQLParser.declare_section_return declare_section143 = null;

        PLSQLParser.body_return body144 = null;


        Object set141_tree=null;
        Object set142_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:199:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:200:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,9);
            pushFollow(FOLLOW_function_heading_in_function_definition1098);
            function_heading140=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading140.getTree());
            dbg.location(201,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:201:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=DETERMINISTIC && LA40_0<=RESULT_CACHE)) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    dbg.location(201,9);
            	    set141=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set141));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);
            } finally {dbg.exitSubRule(40);}

            dbg.location(202,9);
            set142=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set142));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(202,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:202:21: ( declare_section )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41);

            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=PROCEDURE && LA41_0<=FUNCTION)||LA41_0==CURSOR||LA41_0==SUBTYPE||LA41_0==PRAGMA) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:202:21: declare_section
                    {
                    dbg.location(202,21);
                    pushFollow(FOLLOW_declare_section_in_function_definition1145);
                    declare_section143=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section143.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(202,38);
            pushFollow(FOLLOW_body_in_function_definition1148);
            body144=body();

            state._fsp--;

            adaptor.addChild(root_0, body144.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(203, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_definition"

    public static class procedure_declaration_or_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:205:1: procedure_declaration_or_definition : procedure_heading ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLParser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQLParser.procedure_declaration_or_definition_return retval = new PLSQLParser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set146=null;
        PLSQLParser.procedure_heading_return procedure_heading145 = null;

        PLSQLParser.declare_section_return declare_section147 = null;

        PLSQLParser.body_return body148 = null;


        Object set146_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedure_declaration_or_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:205:37: ( procedure_heading ( ( IS | AS ) ( declare_section )? body )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:206:9: procedure_heading ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,9);
            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1166);
            procedure_heading145=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading145.getTree());
            dbg.location(207,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt43=2;
            try { dbg.enterSubRule(43);
            try { dbg.enterDecision(43);

            int LA43_0 = input.LA(1);

            if ( (LA43_0==IS||LA43_0==AS) ) {
                alt43=1;
            }
            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:11: ( IS | AS ) ( declare_section )? body
                    {
                    dbg.location(207,11);
                    set146=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set146));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(207,23);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:23: ( declare_section )?
                    int alt42=2;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42);

                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=PROCEDURE && LA42_0<=FUNCTION)||LA42_0==CURSOR||LA42_0==SUBTYPE||LA42_0==PRAGMA) ) {
                        alt42=1;
                    }
                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:23: declare_section
                            {
                            dbg.location(207,23);
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1188);
                            declare_section147=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section147.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}

                    dbg.location(207,40);
                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1191);
                    body148=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body148.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(43);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(208, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedure_declaration_or_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedure_declaration_or_definition"

    public static class procedure_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:210:1: procedure_declaration : procedure_heading ;
    public final PLSQLParser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQLParser.procedure_declaration_return retval = new PLSQLParser.procedure_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.procedure_heading_return procedure_heading149 = null;



        try { dbg.enterRule(getGrammarFileName(), "procedure_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:210:23: ( procedure_heading )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:211:2: procedure_heading
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,2);
            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1208);
            procedure_heading149=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading149.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(212, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedure_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedure_declaration"

    public static class procedure_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:214:1: procedure_definition : procedure_heading ( IS | AS ) ( declare_section )? body ;
    public final PLSQLParser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQLParser.procedure_definition_return retval = new PLSQLParser.procedure_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set151=null;
        PLSQLParser.procedure_heading_return procedure_heading150 = null;

        PLSQLParser.declare_section_return declare_section152 = null;

        PLSQLParser.body_return body153 = null;


        Object set151_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedure_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:214:22: ( procedure_heading ( IS | AS ) ( declare_section )? body )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:215:2: procedure_heading ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,2);
            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1219);
            procedure_heading150=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading150.getTree());
            dbg.location(216,2);
            set151=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set151));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(216,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:216:14: ( declare_section )?
            int alt44=2;
            try { dbg.enterSubRule(44);
            try { dbg.enterDecision(44);

            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=PROCEDURE && LA44_0<=FUNCTION)||LA44_0==CURSOR||LA44_0==SUBTYPE||LA44_0==PRAGMA) ) {
                alt44=1;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:216:14: declare_section
                    {
                    dbg.location(216,14);
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1232);
                    declare_section152=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section152.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(44);}

            dbg.location(216,31);
            pushFollow(FOLLOW_body_in_procedure_definition1235);
            body153=body();

            state._fsp--;

            adaptor.addChild(root_0, body153.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(217, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedure_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedure_definition"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:219:1: body : BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? ;
    public final PLSQLParser.body_return body() throws RecognitionException {
        PLSQLParser.body_return retval = new PLSQLParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN154=null;
        Token SEMI156=null;
        Token SEMI158=null;
        Token SEMI160=null;
        Token EXCEPTION161=null;
        Token END163=null;
        Token ID164=null;
        PLSQLParser.statement_return statement155 = null;

        PLSQLParser.statement_return statement157 = null;

        PLSQLParser.pragma_return pragma159 = null;

        PLSQLParser.exception_handler_return exception_handler162 = null;


        Object BEGIN154_tree=null;
        Object SEMI156_tree=null;
        Object SEMI158_tree=null;
        Object SEMI160_tree=null;
        Object EXCEPTION161_tree=null;
        Object END163_tree=null;
        Object ID164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:219:7: ( BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:220:2: BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(220,2);
            BEGIN154=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1249); 
            BEGIN154_tree = (Object)adaptor.create(BEGIN154);
            adaptor.addChild(root_0, BEGIN154_tree);

            dbg.location(220,8);
            pushFollow(FOLLOW_statement_in_body1251);
            statement155=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement155.getTree());
            dbg.location(220,18);
            SEMI156=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1253); 
            SEMI156_tree = (Object)adaptor.create(SEMI156);
            adaptor.addChild(root_0, SEMI156_tree);

            dbg.location(220,23);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:220:23: ( statement SEMI | pragma SEMI )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=3;
                try { dbg.enterDecision(45);

                int LA45_0 = input.LA(1);

                if ( (LA45_0==ID||LA45_0==RETURN||LA45_0==NULL||LA45_0==BEGIN||(LA45_0>=COLON && LA45_0<=CASE)||(LA45_0>=CLOSE && LA45_0<=EXECUTE)||(LA45_0>=EXIT && LA45_0<=FETCH)||(LA45_0>=FOR && LA45_0<=FORALL)||(LA45_0>=GOTO && LA45_0<=IF)||LA45_0==OPEN||(LA45_0>=RAISE && LA45_0<=LLABEL)||(LA45_0>=COMMIT && LA45_0<=SET)||(LA45_0>=UPDATE && LA45_0<=WHILE)) ) {
                    alt45=1;
                }
                else if ( (LA45_0==PRAGMA) ) {
                    alt45=2;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:220:25: statement SEMI
            	    {
            	    dbg.location(220,25);
            	    pushFollow(FOLLOW_statement_in_body1257);
            	    statement157=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement157.getTree());
            	    dbg.location(220,35);
            	    SEMI158=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1259); 
            	    SEMI158_tree = (Object)adaptor.create(SEMI158);
            	    adaptor.addChild(root_0, SEMI158_tree);


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:220:42: pragma SEMI
            	    {
            	    dbg.location(220,42);
            	    pushFollow(FOLLOW_pragma_in_body1263);
            	    pragma159=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma159.getTree());
            	    dbg.location(220,49);
            	    SEMI160=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1265); 
            	    SEMI160_tree = (Object)adaptor.create(SEMI160);
            	    adaptor.addChild(root_0, SEMI160_tree);


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}

            dbg.location(221,2);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:2: ( EXCEPTION ( exception_handler )+ )?
            int alt47=2;
            try { dbg.enterSubRule(47);
            try { dbg.enterDecision(47);

            int LA47_0 = input.LA(1);

            if ( (LA47_0==EXCEPTION) ) {
                alt47=1;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:4: EXCEPTION ( exception_handler )+
                    {
                    dbg.location(221,4);
                    EXCEPTION161=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body1273); 
                    EXCEPTION161_tree = (Object)adaptor.create(EXCEPTION161);
                    adaptor.addChild(root_0, EXCEPTION161_tree);

                    dbg.location(221,14);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:14: ( exception_handler )+
                    int cnt46=0;
                    try { dbg.enterSubRule(46);

                    loop46:
                    do {
                        int alt46=2;
                        try { dbg.enterDecision(46);

                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==WHEN) ) {
                            alt46=1;
                        }


                        } finally {dbg.exitDecision(46);}

                        switch (alt46) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:14: exception_handler
                    	    {
                    	    dbg.location(221,14);
                    	    pushFollow(FOLLOW_exception_handler_in_body1275);
                    	    exception_handler162=exception_handler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exception_handler162.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt46++;
                    } while (true);
                    } finally {dbg.exitSubRule(46);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(47);}

            dbg.location(221,36);
            END163=(Token)match(input,END,FOLLOW_END_in_body1281); 
            END163_tree = (Object)adaptor.create(END163);
            adaptor.addChild(root_0, END163_tree);

            dbg.location(221,40);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:40: ( ID )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:40: ID
                    {
                    dbg.location(221,40);
                    ID164=(Token)match(input,ID,FOLLOW_ID_in_body1283); 
                    ID164_tree = (Object)adaptor.create(ID164);
                    adaptor.addChild(root_0, ID164_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(222, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "body"

    public static class exception_handler_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_handler"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:224:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQLParser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQLParser.exception_handler_return retval = new PLSQLParser.exception_handler_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN165=null;
        Token OR167=null;
        Token OTHERS169=null;
        Token THEN170=null;
        Token SEMI172=null;
        PLSQLParser.qual_id_return qual_id166 = null;

        PLSQLParser.qual_id_return qual_id168 = null;

        PLSQLParser.statement_return statement171 = null;


        Object WHEN165_tree=null;
        Object OR167_tree=null;
        Object OTHERS169_tree=null;
        Object THEN170_tree=null;
        Object SEMI172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exception_handler");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(224, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(225,4);
            WHEN165=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1295); 
            WHEN165_tree = (Object)adaptor.create(WHEN165);
            adaptor.addChild(root_0, WHEN165_tree);

            dbg.location(225,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:9: ( qual_id ( OR qual_id )* | OTHERS )
            int alt50=2;
            try { dbg.enterSubRule(50);
            try { dbg.enterDecision(50);

            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID||LA50_0==COLON) ) {
                alt50=1;
            }
            else if ( (LA50_0==OTHERS) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(50);}

            switch (alt50) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:11: qual_id ( OR qual_id )*
                    {
                    dbg.location(225,11);
                    pushFollow(FOLLOW_qual_id_in_exception_handler1299);
                    qual_id166=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id166.getTree());
                    dbg.location(225,19);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:19: ( OR qual_id )*
                    try { dbg.enterSubRule(49);

                    loop49:
                    do {
                        int alt49=2;
                        try { dbg.enterDecision(49);

                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==OR) ) {
                            alt49=1;
                        }


                        } finally {dbg.exitDecision(49);}

                        switch (alt49) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:21: OR qual_id
                    	    {
                    	    dbg.location(225,21);
                    	    OR167=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1303); 
                    	    OR167_tree = (Object)adaptor.create(OR167);
                    	    adaptor.addChild(root_0, OR167_tree);

                    	    dbg.location(225,24);
                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1305);
                    	    qual_id168=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(49);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:225:37: OTHERS
                    {
                    dbg.location(225,37);
                    OTHERS169=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1312); 
                    OTHERS169_tree = (Object)adaptor.create(OTHERS169);
                    adaptor.addChild(root_0, OTHERS169_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(50);}

            dbg.location(226,3);
            THEN170=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1318); 
            THEN170_tree = (Object)adaptor.create(THEN170);
            adaptor.addChild(root_0, THEN170_tree);

            dbg.location(226,8);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:226:8: ( statement SEMI )+
            int cnt51=0;
            try { dbg.enterSubRule(51);

            loop51:
            do {
                int alt51=2;
                try { dbg.enterDecision(51);

                int LA51_0 = input.LA(1);

                if ( (LA51_0==ID||LA51_0==RETURN||LA51_0==NULL||LA51_0==BEGIN||(LA51_0>=COLON && LA51_0<=CASE)||(LA51_0>=CLOSE && LA51_0<=EXECUTE)||(LA51_0>=EXIT && LA51_0<=FETCH)||(LA51_0>=FOR && LA51_0<=FORALL)||(LA51_0>=GOTO && LA51_0<=IF)||LA51_0==OPEN||(LA51_0>=RAISE && LA51_0<=LLABEL)||(LA51_0>=COMMIT && LA51_0<=SET)||(LA51_0>=UPDATE && LA51_0<=WHILE)) ) {
                    alt51=1;
                }


                } finally {dbg.exitDecision(51);}

                switch (alt51) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:226:10: statement SEMI
            	    {
            	    dbg.location(226,10);
            	    pushFollow(FOLLOW_statement_in_exception_handler1322);
            	    statement171=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement171.getTree());
            	    dbg.location(226,20);
            	    SEMI172=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1324); 
            	    SEMI172_tree = (Object)adaptor.create(SEMI172);
            	    adaptor.addChild(root_0, SEMI172_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt51++;
            } while (true);
            } finally {dbg.exitSubRule(51);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(227, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exception_handler");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exception_handler"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:229:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQLParser.statement_return statement() throws RecognitionException {
        PLSQLParser.statement_return retval = new PLSQLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.label_return label173 = null;

        PLSQLParser.assign_or_call_statement_return assign_or_call_statement174 = null;

        PLSQLParser.case_statement_return case_statement175 = null;

        PLSQLParser.close_statement_return close_statement176 = null;

        PLSQLParser.continue_statement_return continue_statement177 = null;

        PLSQLParser.basic_loop_statement_return basic_loop_statement178 = null;

        PLSQLParser.execute_immediate_statement_return execute_immediate_statement179 = null;

        PLSQLParser.exit_statement_return exit_statement180 = null;

        PLSQLParser.fetch_statement_return fetch_statement181 = null;

        PLSQLParser.for_loop_statement_return for_loop_statement182 = null;

        PLSQLParser.forall_statement_return forall_statement183 = null;

        PLSQLParser.goto_statement_return goto_statement184 = null;

        PLSQLParser.if_statement_return if_statement185 = null;

        PLSQLParser.null_statement_return null_statement186 = null;

        PLSQLParser.open_statement_return open_statement187 = null;

        PLSQLParser.plsql_block_return plsql_block188 = null;

        PLSQLParser.raise_statement_return raise_statement189 = null;

        PLSQLParser.return_statement_return return_statement190 = null;

        PLSQLParser.sql_statement_return sql_statement191 = null;

        PLSQLParser.while_loop_statement_return while_loop_statement192 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:229:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:230:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(230,5);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:230:5: ( label )*
            try { dbg.enterSubRule(52);

            loop52:
            do {
                int alt52=2;
                try { dbg.enterDecision(52);

                int LA52_0 = input.LA(1);

                if ( (LA52_0==LLABEL) ) {
                    alt52=1;
                }


                } finally {dbg.exitDecision(52);}

                switch (alt52) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:230:5: label
            	    {
            	    dbg.location(230,5);
            	    pushFollow(FOLLOW_label_in_statement1342);
            	    label173=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label173.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);
            } finally {dbg.exitSubRule(52);}

            dbg.location(231,5);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:231:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            int alt53=19;
            try { dbg.enterSubRule(53);
            try { dbg.enterDecision(53);

            switch ( input.LA(1) ) {
            case ID:
            case COLON:
                {
                alt53=1;
                }
                break;
            case CASE:
                {
                alt53=2;
                }
                break;
            case CLOSE:
                {
                alt53=3;
                }
                break;
            case CONTINUE:
                {
                alt53=4;
                }
                break;
            case LOOP:
                {
                alt53=5;
                }
                break;
            case EXECUTE:
                {
                alt53=6;
                }
                break;
            case EXIT:
                {
                alt53=7;
                }
                break;
            case FETCH:
                {
                alt53=8;
                }
                break;
            case FOR:
                {
                alt53=9;
                }
                break;
            case FORALL:
                {
                alt53=10;
                }
                break;
            case GOTO:
                {
                alt53=11;
                }
                break;
            case IF:
                {
                alt53=12;
                }
                break;
            case NULL:
                {
                alt53=13;
                }
                break;
            case OPEN:
                {
                alt53=14;
                }
                break;
            case BEGIN:
            case DECLARE:
                {
                alt53=15;
                }
                break;
            case RAISE:
                {
                alt53=16;
                }
                break;
            case RETURN:
                {
                alt53=17;
                }
                break;
            case DELETE:
            case COMMIT:
            case INSERT:
            case LOCK:
            case ROLLBACK:
            case SAVEPOINT:
            case SELECT:
            case SET:
            case UPDATE:
                {
                alt53=18;
                }
                break;
            case WHILE:
                {
                alt53=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:231:7: assign_or_call_statement
                    {
                    dbg.location(231,7);
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1351);
                    assign_or_call_statement174=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement174.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:232:7: case_statement
                    {
                    dbg.location(232,7);
                    pushFollow(FOLLOW_case_statement_in_statement1359);
                    case_statement175=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement175.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:233:7: close_statement
                    {
                    dbg.location(233,7);
                    pushFollow(FOLLOW_close_statement_in_statement1367);
                    close_statement176=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement176.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:234:7: continue_statement
                    {
                    dbg.location(234,7);
                    pushFollow(FOLLOW_continue_statement_in_statement1375);
                    continue_statement177=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement177.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:235:7: basic_loop_statement
                    {
                    dbg.location(235,7);
                    pushFollow(FOLLOW_basic_loop_statement_in_statement1383);
                    basic_loop_statement178=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement178.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:236:7: execute_immediate_statement
                    {
                    dbg.location(236,7);
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement1391);
                    execute_immediate_statement179=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement179.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:237:7: exit_statement
                    {
                    dbg.location(237,7);
                    pushFollow(FOLLOW_exit_statement_in_statement1399);
                    exit_statement180=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement180.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:238:7: fetch_statement
                    {
                    dbg.location(238,7);
                    pushFollow(FOLLOW_fetch_statement_in_statement1407);
                    fetch_statement181=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement181.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:239:7: for_loop_statement
                    {
                    dbg.location(239,7);
                    pushFollow(FOLLOW_for_loop_statement_in_statement1415);
                    for_loop_statement182=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement182.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:240:7: forall_statement
                    {
                    dbg.location(240,7);
                    pushFollow(FOLLOW_forall_statement_in_statement1423);
                    forall_statement183=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement183.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:241:7: goto_statement
                    {
                    dbg.location(241,7);
                    pushFollow(FOLLOW_goto_statement_in_statement1431);
                    goto_statement184=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement184.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:242:7: if_statement
                    {
                    dbg.location(242,7);
                    pushFollow(FOLLOW_if_statement_in_statement1439);
                    if_statement185=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement185.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:243:7: null_statement
                    {
                    dbg.location(243,7);
                    pushFollow(FOLLOW_null_statement_in_statement1447);
                    null_statement186=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement186.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:244:7: open_statement
                    {
                    dbg.location(244,7);
                    pushFollow(FOLLOW_open_statement_in_statement1455);
                    open_statement187=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement187.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:245:7: plsql_block
                    {
                    dbg.location(245,7);
                    pushFollow(FOLLOW_plsql_block_in_statement1463);
                    plsql_block188=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block188.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:246:7: raise_statement
                    {
                    dbg.location(246,7);
                    pushFollow(FOLLOW_raise_statement_in_statement1471);
                    raise_statement189=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement189.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:247:7: return_statement
                    {
                    dbg.location(247,7);
                    pushFollow(FOLLOW_return_statement_in_statement1479);
                    return_statement190=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement190.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:248:7: sql_statement
                    {
                    dbg.location(248,7);
                    pushFollow(FOLLOW_sql_statement_in_statement1487);
                    sql_statement191=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement191.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:249:7: while_loop_statement
                    {
                    dbg.location(249,7);
                    pushFollow(FOLLOW_while_loop_statement_in_statement1495);
                    while_loop_statement192=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement192.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(53);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(251, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:253:1: lvalue : call ( DOT call )* ;
    public final PLSQLParser.lvalue_return lvalue() throws RecognitionException {
        PLSQLParser.lvalue_return retval = new PLSQLParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT194=null;
        PLSQLParser.call_return call193 = null;

        PLSQLParser.call_return call195 = null;


        Object DOT194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lvalue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:254:5: ( call ( DOT call )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:254:7: call ( DOT call )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(254,7);
            pushFollow(FOLLOW_call_in_lvalue1518);
            call193=call();

            state._fsp--;

            adaptor.addChild(root_0, call193.getTree());
            dbg.location(254,12);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:254:12: ( DOT call )*
            try { dbg.enterSubRule(54);

            loop54:
            do {
                int alt54=2;
                try { dbg.enterDecision(54);

                int LA54_0 = input.LA(1);

                if ( (LA54_0==DOT) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==ID||LA54_1==COLON) ) {
                        alt54=1;
                    }


                }


                } finally {dbg.exitDecision(54);}

                switch (alt54) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:254:14: DOT call
            	    {
            	    dbg.location(254,14);
            	    DOT194=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1522); 
            	    DOT194_tree = (Object)adaptor.create(DOT194);
            	    adaptor.addChild(root_0, DOT194_tree);

            	    dbg.location(254,18);
            	    pushFollow(FOLLOW_call_in_lvalue1524);
            	    call195=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call195.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);
            } finally {dbg.exitSubRule(54);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(255, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lvalue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lvalue"

    public static class assign_or_call_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_or_call_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:257:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQLParser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQLParser.assign_or_call_statement_return retval = new PLSQLParser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT197=null;
        Token ASSIGN199=null;
        PLSQLParser.lvalue_return lvalue196 = null;

        PLSQLParser.delete_call_return delete_call198 = null;

        PLSQLParser.expression_return expression200 = null;


        Object DOT197_tree=null;
        Object ASSIGN199_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assign_or_call_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,7);
            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement1544);
            lvalue196=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue196.getTree());
            dbg.location(258,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:14: ( DOT delete_call | ASSIGN expression )?
            int alt55=3;
            try { dbg.enterSubRule(55);
            try { dbg.enterDecision(55);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOT) ) {
                alt55=1;
            }
            else if ( (LA55_0==ASSIGN) ) {
                alt55=2;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:16: DOT delete_call
                    {
                    dbg.location(258,16);
                    DOT197=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement1548); 
                    DOT197_tree = (Object)adaptor.create(DOT197);
                    adaptor.addChild(root_0, DOT197_tree);

                    dbg.location(258,20);
                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement1550);
                    delete_call198=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call198.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:34: ASSIGN expression
                    {
                    dbg.location(258,34);
                    ASSIGN199=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement1554); 
                    ASSIGN199_tree = (Object)adaptor.create(ASSIGN199);
                    adaptor.addChild(root_0, ASSIGN199_tree);

                    dbg.location(258,41);
                    pushFollow(FOLLOW_expression_in_assign_or_call_statement1556);
                    expression200=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression200.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(55);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(259, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign_or_call_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assign_or_call_statement"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:261:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ;
    public final PLSQLParser.call_return call() throws RecognitionException {
        PLSQLParser.call_return retval = new PLSQLParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON201=null;
        Token ID202=null;
        Token LPAREN203=null;
        Token COMMA205=null;
        Token RPAREN207=null;
        PLSQLParser.parameter_return parameter204 = null;

        PLSQLParser.parameter_return parameter206 = null;


        Object COLON201_tree=null;
        Object ID202_tree=null;
        Object LPAREN203_tree=null;
        Object COMMA205_tree=null;
        Object RPAREN207_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:7: ( COLON )?
            int alt56=2;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON) ) {
                alt56=1;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:7: COLON
                    {
                    dbg.location(262,7);
                    COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_call1576); 
                    COLON201_tree = (Object)adaptor.create(COLON201);
                    adaptor.addChild(root_0, COLON201_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}

            dbg.location(262,14);
            ID202=(Token)match(input,ID,FOLLOW_ID_in_call1579); 
            ID202_tree = (Object)adaptor.create(ID202);
            adaptor.addChild(root_0, ID202_tree);

            dbg.location(262,17);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt59=2;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==LPAREN) ) {
                alt59=1;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    dbg.location(262,19);
                    LPAREN203=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call1583); 
                    LPAREN203_tree = (Object)adaptor.create(LPAREN203);
                    adaptor.addChild(root_0, LPAREN203_tree);

                    dbg.location(262,26);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:26: ( parameter ( COMMA parameter )* )?
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58);

                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ID||LA58_0==LPAREN||(LA58_0>=NOT && LA58_0<=NULL)||LA58_0==COLON||(LA58_0>=MINUS && LA58_0<=PLUS)||LA58_0==SQL||(LA58_0>=INTEGER && LA58_0<=QUOTED_STRING)||(LA58_0>=INSERTING && LA58_0<=DELETING)) ) {
                        alt58=1;
                    }
                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:28: parameter ( COMMA parameter )*
                            {
                            dbg.location(262,28);
                            pushFollow(FOLLOW_parameter_in_call1587);
                            parameter204=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter204.getTree());
                            dbg.location(262,38);
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:38: ( COMMA parameter )*
                            try { dbg.enterSubRule(57);

                            loop57:
                            do {
                                int alt57=2;
                                try { dbg.enterDecision(57);

                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==COMMA) ) {
                                    alt57=1;
                                }


                                } finally {dbg.exitDecision(57);}

                                switch (alt57) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:40: COMMA parameter
                            	    {
                            	    dbg.location(262,40);
                            	    COMMA205=(Token)match(input,COMMA,FOLLOW_COMMA_in_call1591); 
                            	    COMMA205_tree = (Object)adaptor.create(COMMA205);
                            	    adaptor.addChild(root_0, COMMA205_tree);

                            	    dbg.location(262,46);
                            	    pushFollow(FOLLOW_parameter_in_call1593);
                            	    parameter206=parameter();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, parameter206.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(57);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}

                    dbg.location(262,62);
                    RPAREN207=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call1601); 
                    RPAREN207_tree = (Object)adaptor.create(RPAREN207);
                    adaptor.addChild(root_0, RPAREN207_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(263, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "call"

    public static class delete_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:265:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQLParser.delete_call_return delete_call() throws RecognitionException {
        PLSQLParser.delete_call_return retval = new PLSQLParser.delete_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE208=null;
        Token LPAREN209=null;
        Token RPAREN211=null;
        PLSQLParser.parameter_return parameter210 = null;


        Object DELETE208_tree=null;
        Object LPAREN209_tree=null;
        Object RPAREN211_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "delete_call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,7);
            DELETE208=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call1621); 
            DELETE208_tree = (Object)adaptor.create(DELETE208);
            adaptor.addChild(root_0, DELETE208_tree);

            dbg.location(266,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:14: ( LPAREN ( parameter )? RPAREN )?
            int alt61=2;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==LPAREN) ) {
                alt61=1;
            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:16: LPAREN ( parameter )? RPAREN
                    {
                    dbg.location(266,16);
                    LPAREN209=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call1625); 
                    LPAREN209_tree = (Object)adaptor.create(LPAREN209);
                    adaptor.addChild(root_0, LPAREN209_tree);

                    dbg.location(266,23);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:23: ( parameter )?
                    int alt60=2;
                    try { dbg.enterSubRule(60);
                    try { dbg.enterDecision(60);

                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ID||LA60_0==LPAREN||(LA60_0>=NOT && LA60_0<=NULL)||LA60_0==COLON||(LA60_0>=MINUS && LA60_0<=PLUS)||LA60_0==SQL||(LA60_0>=INTEGER && LA60_0<=QUOTED_STRING)||(LA60_0>=INSERTING && LA60_0<=DELETING)) ) {
                        alt60=1;
                    }
                    } finally {dbg.exitDecision(60);}

                    switch (alt60) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:23: parameter
                            {
                            dbg.location(266,23);
                            pushFollow(FOLLOW_parameter_in_delete_call1627);
                            parameter210=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter210.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(60);}

                    dbg.location(266,34);
                    RPAREN211=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call1630); 
                    RPAREN211_tree = (Object)adaptor.create(RPAREN211);
                    adaptor.addChild(root_0, RPAREN211_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(267, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "delete_call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "delete_call"

    public static class basic_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:269:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQLParser.basic_loop_statement_return retval = new PLSQLParser.basic_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP212=null;
        Token SEMI214=null;
        Token END215=null;
        Token LOOP216=null;
        PLSQLParser.statement_return statement213 = null;

        PLSQLParser.label_name_return label_name217 = null;


        Object LOOP212_tree=null;
        Object SEMI214_tree=null;
        Object END215_tree=null;
        Object LOOP216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "basic_loop_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:269:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,9);
            LOOP212=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1654); 
            LOOP212_tree = (Object)adaptor.create(LOOP212);
            adaptor.addChild(root_0, LOOP212_tree);

            dbg.location(270,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:14: ( statement SEMI )+
            int cnt62=0;
            try { dbg.enterSubRule(62);

            loop62:
            do {
                int alt62=2;
                try { dbg.enterDecision(62);

                int LA62_0 = input.LA(1);

                if ( (LA62_0==ID||LA62_0==RETURN||LA62_0==NULL||LA62_0==BEGIN||(LA62_0>=COLON && LA62_0<=CASE)||(LA62_0>=CLOSE && LA62_0<=EXECUTE)||(LA62_0>=EXIT && LA62_0<=FETCH)||(LA62_0>=FOR && LA62_0<=FORALL)||(LA62_0>=GOTO && LA62_0<=IF)||LA62_0==OPEN||(LA62_0>=RAISE && LA62_0<=LLABEL)||(LA62_0>=COMMIT && LA62_0<=SET)||(LA62_0>=UPDATE && LA62_0<=WHILE)) ) {
                    alt62=1;
                }


                } finally {dbg.exitDecision(62);}

                switch (alt62) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:16: statement SEMI
            	    {
            	    dbg.location(270,16);
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement1658);
            	    statement213=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement213.getTree());
            	    dbg.location(270,26);
            	    SEMI214=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement1660); 
            	    SEMI214_tree = (Object)adaptor.create(SEMI214);
            	    adaptor.addChild(root_0, SEMI214_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt62++;
            } while (true);
            } finally {dbg.exitSubRule(62);}

            dbg.location(270,34);
            END215=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement1665); 
            END215_tree = (Object)adaptor.create(END215);
            adaptor.addChild(root_0, END215_tree);

            dbg.location(270,38);
            LOOP216=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1667); 
            LOOP216_tree = (Object)adaptor.create(LOOP216);
            adaptor.addChild(root_0, LOOP216_tree);

            dbg.location(270,43);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:43: ( label_name )?
            int alt63=2;
            try { dbg.enterSubRule(63);
            try { dbg.enterDecision(63);

            int LA63_0 = input.LA(1);

            if ( (LA63_0==ID) ) {
                alt63=1;
            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:43: label_name
                    {
                    dbg.location(270,43);
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement1669);
                    label_name217=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name217.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(63);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(271, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "basic_loop_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "basic_loop_statement"

    public static class case_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:273:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQLParser.case_statement_return case_statement() throws RecognitionException {
        PLSQLParser.case_statement_return retval = new PLSQLParser.case_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE218=null;
        Token WHEN220=null;
        Token THEN222=null;
        Token SEMI224=null;
        Token ELSE225=null;
        Token SEMI227=null;
        Token END228=null;
        Token CASE229=null;
        PLSQLParser.expression_return expression219 = null;

        PLSQLParser.expression_return expression221 = null;

        PLSQLParser.statement_return statement223 = null;

        PLSQLParser.statement_return statement226 = null;

        PLSQLParser.label_name_return label_name230 = null;


        Object CASE218_tree=null;
        Object WHEN220_tree=null;
        Object THEN222_tree=null;
        Object SEMI224_tree=null;
        Object ELSE225_tree=null;
        Object SEMI227_tree=null;
        Object END228_tree=null;
        Object CASE229_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "case_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:273:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:274:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(274,9);
            CASE218=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement1691); 
            CASE218_tree = (Object)adaptor.create(CASE218);
            adaptor.addChild(root_0, CASE218_tree);

            dbg.location(274,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:274:14: ( expression )?
            int alt64=2;
            try { dbg.enterSubRule(64);
            try { dbg.enterDecision(64);

            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID||LA64_0==LPAREN||(LA64_0>=NOT && LA64_0<=NULL)||LA64_0==COLON||(LA64_0>=MINUS && LA64_0<=PLUS)||LA64_0==SQL||(LA64_0>=INTEGER && LA64_0<=QUOTED_STRING)||(LA64_0>=INSERTING && LA64_0<=DELETING)) ) {
                alt64=1;
            }
            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:274:14: expression
                    {
                    dbg.location(274,14);
                    pushFollow(FOLLOW_expression_in_case_statement1693);
                    expression219=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression219.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(64);}

            dbg.location(275,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:275:9: ( WHEN expression THEN ( statement SEMI )+ )+
            int cnt66=0;
            try { dbg.enterSubRule(66);

            loop66:
            do {
                int alt66=2;
                try { dbg.enterDecision(66);

                int LA66_0 = input.LA(1);

                if ( (LA66_0==WHEN) ) {
                    alt66=1;
                }


                } finally {dbg.exitDecision(66);}

                switch (alt66) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:275:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    dbg.location(275,11);
            	    WHEN220=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement1706); 
            	    WHEN220_tree = (Object)adaptor.create(WHEN220);
            	    adaptor.addChild(root_0, WHEN220_tree);

            	    dbg.location(275,16);
            	    pushFollow(FOLLOW_expression_in_case_statement1708);
            	    expression221=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression221.getTree());
            	    dbg.location(275,27);
            	    THEN222=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement1710); 
            	    THEN222_tree = (Object)adaptor.create(THEN222);
            	    adaptor.addChild(root_0, THEN222_tree);

            	    dbg.location(275,32);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:275:32: ( statement SEMI )+
            	    int cnt65=0;
            	    try { dbg.enterSubRule(65);

            	    loop65:
            	    do {
            	        int alt65=2;
            	        try { dbg.enterDecision(65);

            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==ID||LA65_0==RETURN||LA65_0==NULL||LA65_0==BEGIN||(LA65_0>=COLON && LA65_0<=CASE)||(LA65_0>=CLOSE && LA65_0<=EXECUTE)||(LA65_0>=EXIT && LA65_0<=FETCH)||(LA65_0>=FOR && LA65_0<=FORALL)||(LA65_0>=GOTO && LA65_0<=IF)||LA65_0==OPEN||(LA65_0>=RAISE && LA65_0<=LLABEL)||(LA65_0>=COMMIT && LA65_0<=SET)||(LA65_0>=UPDATE && LA65_0<=WHILE)) ) {
            	            alt65=1;
            	        }


            	        } finally {dbg.exitDecision(65);}

            	        switch (alt65) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:275:34: statement SEMI
            	    	    {
            	    	    dbg.location(275,34);
            	    	    pushFollow(FOLLOW_statement_in_case_statement1714);
            	    	    statement223=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement223.getTree());
            	    	    dbg.location(275,44);
            	    	    SEMI224=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1716); 
            	    	    SEMI224_tree = (Object)adaptor.create(SEMI224);
            	    	    adaptor.addChild(root_0, SEMI224_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt65 >= 1 ) break loop65;
            	                EarlyExitException eee =
            	                    new EarlyExitException(65, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt65++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(65);}


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt66++;
            } while (true);
            } finally {dbg.exitSubRule(66);}

            dbg.location(276,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:276:9: ( ELSE statement SEMI )?
            int alt67=2;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67);

            int LA67_0 = input.LA(1);

            if ( (LA67_0==ELSE) ) {
                alt67=1;
            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:276:11: ELSE statement SEMI
                    {
                    dbg.location(276,11);
                    ELSE225=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement1734); 
                    ELSE225_tree = (Object)adaptor.create(ELSE225);
                    adaptor.addChild(root_0, ELSE225_tree);

                    dbg.location(276,16);
                    pushFollow(FOLLOW_statement_in_case_statement1736);
                    statement226=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement226.getTree());
                    dbg.location(276,26);
                    SEMI227=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1738); 
                    SEMI227_tree = (Object)adaptor.create(SEMI227);
                    adaptor.addChild(root_0, SEMI227_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(67);}

            dbg.location(277,9);
            END228=(Token)match(input,END,FOLLOW_END_in_case_statement1751); 
            END228_tree = (Object)adaptor.create(END228);
            adaptor.addChild(root_0, END228_tree);

            dbg.location(277,13);
            CASE229=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement1753); 
            CASE229_tree = (Object)adaptor.create(CASE229);
            adaptor.addChild(root_0, CASE229_tree);

            dbg.location(277,18);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:277:18: ( label_name )?
            int alt68=2;
            try { dbg.enterSubRule(68);
            try { dbg.enterDecision(68);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==ID) ) {
                alt68=1;
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:277:18: label_name
                    {
                    dbg.location(277,18);
                    pushFollow(FOLLOW_label_name_in_case_statement1755);
                    label_name230=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name230.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(68);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(278, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "case_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "case_statement"

    public static class close_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "close_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:280:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQLParser.close_statement_return close_statement() throws RecognitionException {
        PLSQLParser.close_statement_return retval = new PLSQLParser.close_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE231=null;
        Token ID232=null;
        Token DOT233=null;
        Token ID234=null;

        Object CLOSE231_tree=null;
        Object ID232_tree=null;
        Object DOT233_tree=null;
        Object ID234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "close_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:280:17: ( CLOSE ID ( DOT ID )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:281:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(281,9);
            CLOSE231=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement1777); 
            CLOSE231_tree = (Object)adaptor.create(CLOSE231);
            adaptor.addChild(root_0, CLOSE231_tree);

            dbg.location(281,15);
            ID232=(Token)match(input,ID,FOLLOW_ID_in_close_statement1779); 
            ID232_tree = (Object)adaptor.create(ID232);
            adaptor.addChild(root_0, ID232_tree);

            dbg.location(281,18);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:281:18: ( DOT ID )?
            int alt69=2;
            try { dbg.enterSubRule(69);
            try { dbg.enterDecision(69);

            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:281:20: DOT ID
                    {
                    dbg.location(281,20);
                    DOT233=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement1783); 
                    DOT233_tree = (Object)adaptor.create(DOT233);
                    adaptor.addChild(root_0, DOT233_tree);

                    dbg.location(281,24);
                    ID234=(Token)match(input,ID,FOLLOW_ID_in_close_statement1785); 
                    ID234_tree = (Object)adaptor.create(ID234);
                    adaptor.addChild(root_0, ID234_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(69);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(282, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "close_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "close_statement"

    public static class continue_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continue_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:284:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLParser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQLParser.continue_statement_return retval = new PLSQLParser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token CONTINUE235=null;
        Token WHEN236=null;
        PLSQLParser.expression_return expression237 = null;


        Object lbl_tree=null;
        Object CONTINUE235_tree=null;
        Object WHEN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "continue_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:284:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(285,9);
            CONTINUE235=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement1809); 
            CONTINUE235_tree = (Object)adaptor.create(CONTINUE235);
            adaptor.addChild(root_0, CONTINUE235_tree);

            dbg.location(285,18);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:18: (lbl= ID )?
            int alt70=2;
            try { dbg.enterSubRule(70);
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID) ) {
                alt70=1;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:20: lbl= ID
                    {
                    dbg.location(285,23);
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement1815); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(70);}

            dbg.location(285,30);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:30: ( WHEN expression )?
            int alt71=2;
            try { dbg.enterSubRule(71);
            try { dbg.enterDecision(71);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==WHEN) ) {
                alt71=1;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:32: WHEN expression
                    {
                    dbg.location(285,32);
                    WHEN236=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement1822); 
                    WHEN236_tree = (Object)adaptor.create(WHEN236);
                    adaptor.addChild(root_0, WHEN236_tree);

                    dbg.location(285,37);
                    pushFollow(FOLLOW_expression_in_continue_statement1824);
                    expression237=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression237.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(71);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(286, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "continue_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "continue_statement"

    public static class execute_immediate_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute_immediate_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:288:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQLParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQLParser.execute_immediate_statement_return retval = new PLSQLParser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXECUTE238=null;
        Token IMMEDIATE239=null;
        PLSQLParser.expression_return expression240 = null;

        PLSQLParser.into_clause_return into_clause241 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause242 = null;

        PLSQLParser.using_clause_return using_clause243 = null;

        PLSQLParser.using_clause_return using_clause244 = null;

        PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause245 = null;

        PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause246 = null;


        Object EXECUTE238_tree=null;
        Object IMMEDIATE239_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "execute_immediate_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(288, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:288:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:289:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(289,9);
            EXECUTE238=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement1848); 
            EXECUTE238_tree = (Object)adaptor.create(EXECUTE238);
            adaptor.addChild(root_0, EXECUTE238_tree);

            dbg.location(289,17);
            IMMEDIATE239=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement1850); 
            IMMEDIATE239_tree = (Object)adaptor.create(IMMEDIATE239);
            adaptor.addChild(root_0, IMMEDIATE239_tree);

            dbg.location(289,27);
            pushFollow(FOLLOW_expression_in_execute_immediate_statement1852);
            expression240=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression240.getTree());
            dbg.location(289,38);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:289:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            int alt75=4;
            try { dbg.enterSubRule(75);
            try { dbg.enterDecision(75);

            switch ( input.LA(1) ) {
                case INTO:
                case BULK:
                    {
                    alt75=1;
                    }
                    break;
                case USING:
                    {
                    alt75=2;
                    }
                    break;
                case RETURN:
                case RETURNING:
                    {
                    alt75=3;
                    }
                    break;
            }

            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    dbg.location(290,9);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:9: ( into_clause | bulk_collect_into_clause )
                    int alt72=2;
                    try { dbg.enterSubRule(72);
                    try { dbg.enterDecision(72);

                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==INTO) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==BULK) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(72);}

                    switch (alt72) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:11: into_clause
                            {
                            dbg.location(290,11);
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement1866);
                            into_clause241=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause241.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:25: bulk_collect_into_clause
                            {
                            dbg.location(290,25);
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement1870);
                            bulk_collect_into_clause242=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause242.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}

                    dbg.location(290,51);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:51: ( using_clause )?
                    int alt73=2;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==USING) ) {
                        alt73=1;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:290:51: using_clause
                            {
                            dbg.location(290,51);
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement1873);
                            using_clause243=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause243.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:291:11: using_clause ( dynamic_returning_clause )?
                    {
                    dbg.location(291,11);
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement1886);
                    using_clause244=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause244.getTree());
                    dbg.location(291,24);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:291:24: ( dynamic_returning_clause )?
                    int alt74=2;
                    try { dbg.enterSubRule(74);
                    try { dbg.enterDecision(74);

                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RETURN||LA74_0==RETURNING) ) {
                        alt74=1;
                    }
                    } finally {dbg.exitDecision(74);}

                    switch (alt74) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:291:24: dynamic_returning_clause
                            {
                            dbg.location(291,24);
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1888);
                            dynamic_returning_clause245=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause245.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(74);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:292:11: dynamic_returning_clause
                    {
                    dbg.location(292,11);
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1901);
                    dynamic_returning_clause246=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause246.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(294, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "execute_immediate_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "execute_immediate_statement"

    public static class exit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:296:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLParser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQLParser.exit_statement_return retval = new PLSQLParser.exit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token EXIT247=null;
        Token WHEN248=null;
        PLSQLParser.expression_return expression249 = null;


        Object lbl_tree=null;
        Object EXIT247_tree=null;
        Object WHEN248_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exit_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:296:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,9);
            EXIT247=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement1933); 
            EXIT247_tree = (Object)adaptor.create(EXIT247);
            adaptor.addChild(root_0, EXIT247_tree);

            dbg.location(297,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:14: (lbl= ID )?
            int alt76=2;
            try { dbg.enterSubRule(76);
            try { dbg.enterDecision(76);

            int LA76_0 = input.LA(1);

            if ( (LA76_0==ID) ) {
                alt76=1;
            }
            } finally {dbg.exitDecision(76);}

            switch (alt76) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:16: lbl= ID
                    {
                    dbg.location(297,19);
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement1939); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(76);}

            dbg.location(297,26);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:26: ( WHEN expression )?
            int alt77=2;
            try { dbg.enterSubRule(77);
            try { dbg.enterDecision(77);

            int LA77_0 = input.LA(1);

            if ( (LA77_0==WHEN) ) {
                alt77=1;
            }
            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:28: WHEN expression
                    {
                    dbg.location(297,28);
                    WHEN248=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement1946); 
                    WHEN248_tree = (Object)adaptor.create(WHEN248);
                    adaptor.addChild(root_0, WHEN248_tree);

                    dbg.location(297,33);
                    pushFollow(FOLLOW_expression_in_exit_statement1948);
                    expression249=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression249.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(77);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(298, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exit_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exit_statement"

    public static class fetch_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fetch_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:300:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQLParser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQLParser.fetch_statement_return retval = new PLSQLParser.fetch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FETCH250=null;
        Token LIMIT254=null;
        PLSQLParser.qual_id_return qual_id251 = null;

        PLSQLParser.into_clause_return into_clause252 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause253 = null;

        PLSQLParser.numeric_expression_return numeric_expression255 = null;


        Object FETCH250_tree=null;
        Object LIMIT254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fetch_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:300:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,9);
            FETCH250=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement1972); 
            FETCH250_tree = (Object)adaptor.create(FETCH250);
            adaptor.addChild(root_0, FETCH250_tree);

            dbg.location(301,15);
            pushFollow(FOLLOW_qual_id_in_fetch_statement1974);
            qual_id251=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id251.getTree());
            dbg.location(301,23);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            int alt79=2;
            try { dbg.enterSubRule(79);
            try { dbg.enterDecision(79);

            int LA79_0 = input.LA(1);

            if ( (LA79_0==INTO) ) {
                alt79=1;
            }
            else if ( (LA79_0==BULK) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:25: into_clause
                    {
                    dbg.location(301,25);
                    pushFollow(FOLLOW_into_clause_in_fetch_statement1978);
                    into_clause252=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause252.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    dbg.location(301,39);
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement1982);
                    bulk_collect_into_clause253=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause253.getTree());
                    dbg.location(301,64);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:64: ( LIMIT numeric_expression )?
                    int alt78=2;
                    try { dbg.enterSubRule(78);
                    try { dbg.enterDecision(78);

                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==LIMIT) ) {
                        alt78=1;
                    }
                    } finally {dbg.exitDecision(78);}

                    switch (alt78) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:66: LIMIT numeric_expression
                            {
                            dbg.location(301,66);
                            LIMIT254=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement1986); 
                            LIMIT254_tree = (Object)adaptor.create(LIMIT254);
                            adaptor.addChild(root_0, LIMIT254_tree);

                            dbg.location(301,72);
                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement1988);
                            numeric_expression255=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression255.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(78);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(79);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(302, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fetch_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fetch_statement"

    public static class into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:304:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLParser.into_clause_return into_clause() throws RecognitionException {
        PLSQLParser.into_clause_return retval = new PLSQLParser.into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTO256=null;
        Token COMMA258=null;
        PLSQLParser.lvalue_return lvalue257 = null;

        PLSQLParser.lvalue_return lvalue259 = null;


        Object INTO256_tree=null;
        Object COMMA258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "into_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:304:13: ( INTO lvalue ( COMMA lvalue )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:305:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(305,9);
            INTO256=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2018); 
            INTO256_tree = (Object)adaptor.create(INTO256);
            adaptor.addChild(root_0, INTO256_tree);

            dbg.location(305,14);
            pushFollow(FOLLOW_lvalue_in_into_clause2020);
            lvalue257=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue257.getTree());
            dbg.location(305,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:305:21: ( COMMA lvalue )*
            try { dbg.enterSubRule(80);

            loop80:
            do {
                int alt80=2;
                try { dbg.enterDecision(80);

                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                } finally {dbg.exitDecision(80);}

                switch (alt80) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:305:23: COMMA lvalue
            	    {
            	    dbg.location(305,23);
            	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2024); 
            	    COMMA258_tree = (Object)adaptor.create(COMMA258);
            	    adaptor.addChild(root_0, COMMA258_tree);

            	    dbg.location(305,29);
            	    pushFollow(FOLLOW_lvalue_in_into_clause2026);
            	    lvalue259=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue259.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);
            } finally {dbg.exitSubRule(80);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(306, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "into_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "into_clause"

    public static class bulk_collect_into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bulk_collect_into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:308:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQLParser.bulk_collect_into_clause_return retval = new PLSQLParser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK260=null;
        Token COLLECT261=null;
        Token INTO262=null;
        Token COMMA264=null;
        PLSQLParser.lvalue_return lvalue263 = null;

        PLSQLParser.lvalue_return lvalue265 = null;


        Object BULK260_tree=null;
        Object COLLECT261_tree=null;
        Object INTO262_tree=null;
        Object COMMA264_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bulk_collect_into_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:308:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:309:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(309,9);
            BULK260=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2054); 
            BULK260_tree = (Object)adaptor.create(BULK260);
            adaptor.addChild(root_0, BULK260_tree);

            dbg.location(309,14);
            COLLECT261=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2056); 
            COLLECT261_tree = (Object)adaptor.create(COLLECT261);
            adaptor.addChild(root_0, COLLECT261_tree);

            dbg.location(309,22);
            INTO262=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2058); 
            INTO262_tree = (Object)adaptor.create(INTO262);
            adaptor.addChild(root_0, INTO262_tree);

            dbg.location(309,27);
            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2060);
            lvalue263=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue263.getTree());
            dbg.location(309,34);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:309:34: ( COMMA lvalue )*
            try { dbg.enterSubRule(81);

            loop81:
            do {
                int alt81=2;
                try { dbg.enterDecision(81);

                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                } finally {dbg.exitDecision(81);}

                switch (alt81) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:309:36: COMMA lvalue
            	    {
            	    dbg.location(309,36);
            	    COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2064); 
            	    COMMA264_tree = (Object)adaptor.create(COMMA264);
            	    adaptor.addChild(root_0, COMMA264_tree);

            	    dbg.location(309,42);
            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2066);
            	    lvalue265=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue265.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);
            } finally {dbg.exitSubRule(81);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(310, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bulk_collect_into_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bulk_collect_into_clause"

    public static class using_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:312:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQLParser.using_clause_return using_clause() throws RecognitionException {
        PLSQLParser.using_clause_return retval = new PLSQLParser.using_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING266=null;
        Token COMMA269=null;
        PLSQLParser.param_modifiers_return param_modifiers267 = null;

        PLSQLParser.expression_return expression268 = null;

        PLSQLParser.param_modifiers_return param_modifiers270 = null;

        PLSQLParser.expression_return expression271 = null;


        Object USING266_tree=null;
        Object COMMA269_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "using_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:312:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(313,9);
            USING266=(Token)match(input,USING,FOLLOW_USING_in_using_clause2090); 
            USING266_tree = (Object)adaptor.create(USING266);
            adaptor.addChild(root_0, USING266_tree);

            dbg.location(313,15);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:15: ( param_modifiers )?
            int alt82=2;
            try { dbg.enterSubRule(82);
            try { dbg.enterDecision(82);

            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=IN && LA82_0<=OUT)) ) {
                alt82=1;
            }
            } finally {dbg.exitDecision(82);}

            switch (alt82) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:15: param_modifiers
                    {
                    dbg.location(313,15);
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2092);
                    param_modifiers267=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers267.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(82);}

            dbg.location(313,32);
            pushFollow(FOLLOW_expression_in_using_clause2095);
            expression268=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression268.getTree());
            dbg.location(313,43);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:43: ( COMMA ( param_modifiers )? expression )*
            try { dbg.enterSubRule(84);

            loop84:
            do {
                int alt84=2;
                try { dbg.enterDecision(84);

                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                } finally {dbg.exitDecision(84);}

                switch (alt84) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:45: COMMA ( param_modifiers )? expression
            	    {
            	    dbg.location(313,45);
            	    COMMA269=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2099); 
            	    COMMA269_tree = (Object)adaptor.create(COMMA269);
            	    adaptor.addChild(root_0, COMMA269_tree);

            	    dbg.location(313,51);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:51: ( param_modifiers )?
            	    int alt83=2;
            	    try { dbg.enterSubRule(83);
            	    try { dbg.enterDecision(83);

            	    int LA83_0 = input.LA(1);

            	    if ( ((LA83_0>=IN && LA83_0<=OUT)) ) {
            	        alt83=1;
            	    }
            	    } finally {dbg.exitDecision(83);}

            	    switch (alt83) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:51: param_modifiers
            	            {
            	            dbg.location(313,51);
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2101);
            	            param_modifiers270=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers270.getTree());

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(83);}

            	    dbg.location(313,68);
            	    pushFollow(FOLLOW_expression_in_using_clause2104);
            	    expression271=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression271.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);
            } finally {dbg.exitSubRule(84);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(314, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "using_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "using_clause"

    public static class param_modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_modifiers"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:316:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQLParser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQLParser.param_modifiers_return retval = new PLSQLParser.param_modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN272=null;
        Token OUT273=null;
        Token OUT274=null;

        Object IN272_tree=null;
        Object OUT273_tree=null;
        Object OUT274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "param_modifiers");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:2: ( IN ( OUT )? | OUT )
            int alt86=2;
            try { dbg.enterDecision(86);

            int LA86_0 = input.LA(1);

            if ( (LA86_0==IN) ) {
                alt86=1;
            }
            else if ( (LA86_0==OUT) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(86);}

            switch (alt86) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:4: IN ( OUT )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(317,4);
                    IN272=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2121); 
                    IN272_tree = (Object)adaptor.create(IN272);
                    adaptor.addChild(root_0, IN272_tree);

                    dbg.location(317,7);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:7: ( OUT )?
                    int alt85=2;
                    try { dbg.enterSubRule(85);
                    try { dbg.enterDecision(85);

                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OUT) ) {
                        alt85=1;
                    }
                    } finally {dbg.exitDecision(85);}

                    switch (alt85) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:7: OUT
                            {
                            dbg.location(317,7);
                            OUT273=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2123); 
                            OUT273_tree = (Object)adaptor.create(OUT273);
                            adaptor.addChild(root_0, OUT273_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(85);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:14: OUT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(317,14);
                    OUT274=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2128); 
                    OUT274_tree = (Object)adaptor.create(OUT274);
                    adaptor.addChild(root_0, OUT274_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(318, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_modifiers");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "param_modifiers"

    public static class dynamic_returning_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_returning_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:320:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQLParser.dynamic_returning_clause_return retval = new PLSQLParser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set275=null;
        PLSQLParser.into_clause_return into_clause276 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause277 = null;


        Object set275_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dynamic_returning_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:320:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,9);
            set275=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set275));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(321,32);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:32: ( into_clause | bulk_collect_into_clause )
            int alt87=2;
            try { dbg.enterSubRule(87);
            try { dbg.enterDecision(87);

            int LA87_0 = input.LA(1);

            if ( (LA87_0==INTO) ) {
                alt87=1;
            }
            else if ( (LA87_0==BULK) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(87);}

            switch (alt87) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:34: into_clause
                    {
                    dbg.location(321,34);
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2158);
                    into_clause276=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause276.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:48: bulk_collect_into_clause
                    {
                    dbg.location(321,48);
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2162);
                    bulk_collect_into_clause277=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause277.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(87);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(322, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dynamic_returning_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dynamic_returning_clause"

    public static class for_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:324:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQLParser.for_loop_statement_return retval = new PLSQLParser.for_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR278=null;
        Token ID279=null;
        Token IN280=null;
        Token set281=null;
        Token LOOP282=null;
        Token SEMI284=null;
        Token END285=null;
        Token LOOP286=null;
        PLSQLParser.statement_return statement283 = null;

        PLSQLParser.label_name_return label_name287 = null;


        Object FOR278_tree=null;
        Object ID279_tree=null;
        Object IN280_tree=null;
        Object set281_tree=null;
        Object LOOP282_tree=null;
        Object SEMI284_tree=null;
        Object END285_tree=null;
        Object LOOP286_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "for_loop_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:324:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(325,9);
            FOR278=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2185); 
            FOR278_tree = (Object)adaptor.create(FOR278);
            adaptor.addChild(root_0, FOR278_tree);

            dbg.location(325,13);
            ID279=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2187); 
            ID279_tree = (Object)adaptor.create(ID279);
            adaptor.addChild(root_0, ID279_tree);

            dbg.location(325,16);
            IN280=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2189); 
            IN280_tree = (Object)adaptor.create(IN280);
            adaptor.addChild(root_0, IN280_tree);

            dbg.location(325,19);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:19: (~ ( LOOP ) )+
            int cnt88=0;
            try { dbg.enterSubRule(88);

            loop88:
            do {
                int alt88=2;
                try { dbg.enterDecision(88);

                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=PROC_CALL && LA88_0<=DELETE)||(LA88_0>=CASE && LA88_0<=ML_COMMENT)) ) {
                    alt88=1;
                }


                } finally {dbg.exitDecision(88);}

                switch (alt88) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:21: ~ ( LOOP )
            	    {
            	    dbg.location(325,21);
            	    set281=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC_CALL && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set281));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt88++;
            } while (true);
            } finally {dbg.exitSubRule(88);}

            dbg.location(325,32);
            LOOP282=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2201); 
            LOOP282_tree = (Object)adaptor.create(LOOP282);
            adaptor.addChild(root_0, LOOP282_tree);

            dbg.location(325,37);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:37: ( statement SEMI )+
            int cnt89=0;
            try { dbg.enterSubRule(89);

            loop89:
            do {
                int alt89=2;
                try { dbg.enterDecision(89);

                int LA89_0 = input.LA(1);

                if ( (LA89_0==ID||LA89_0==RETURN||LA89_0==NULL||LA89_0==BEGIN||(LA89_0>=COLON && LA89_0<=CASE)||(LA89_0>=CLOSE && LA89_0<=EXECUTE)||(LA89_0>=EXIT && LA89_0<=FETCH)||(LA89_0>=FOR && LA89_0<=FORALL)||(LA89_0>=GOTO && LA89_0<=IF)||LA89_0==OPEN||(LA89_0>=RAISE && LA89_0<=LLABEL)||(LA89_0>=COMMIT && LA89_0<=SET)||(LA89_0>=UPDATE && LA89_0<=WHILE)) ) {
                    alt89=1;
                }


                } finally {dbg.exitDecision(89);}

                switch (alt89) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:39: statement SEMI
            	    {
            	    dbg.location(325,39);
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2205);
            	    statement283=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement283.getTree());
            	    dbg.location(325,49);
            	    SEMI284=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2207); 
            	    SEMI284_tree = (Object)adaptor.create(SEMI284);
            	    adaptor.addChild(root_0, SEMI284_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt89++;
            } while (true);
            } finally {dbg.exitSubRule(89);}

            dbg.location(325,57);
            END285=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2212); 
            END285_tree = (Object)adaptor.create(END285);
            adaptor.addChild(root_0, END285_tree);

            dbg.location(325,61);
            LOOP286=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2214); 
            LOOP286_tree = (Object)adaptor.create(LOOP286);
            adaptor.addChild(root_0, LOOP286_tree);

            dbg.location(325,66);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:66: ( label_name )?
            int alt90=2;
            try { dbg.enterSubRule(90);
            try { dbg.enterDecision(90);

            int LA90_0 = input.LA(1);

            if ( (LA90_0==ID) ) {
                alt90=1;
            }
            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:66: label_name
                    {
                    dbg.location(325,66);
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2216);
                    label_name287=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name287.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(90);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(326, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "for_loop_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "for_loop_statement"

    public static class forall_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forall_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:328:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQLParser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQLParser.forall_statement_return retval = new PLSQLParser.forall_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORALL288=null;
        Token ID289=null;
        Token IN290=null;
        PLSQLParser.bounds_clause_return bounds_clause291 = null;

        PLSQLParser.sql_statement_return sql_statement292 = null;

        PLSQLParser.kSAVE_return kSAVE293 = null;

        PLSQLParser.kEXCEPTIONS_return kEXCEPTIONS294 = null;


        Object FORALL288_tree=null;
        Object ID289_tree=null;
        Object IN290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "forall_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:328:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:329:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(329,9);
            FORALL288=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2238); 
            FORALL288_tree = (Object)adaptor.create(FORALL288);
            adaptor.addChild(root_0, FORALL288_tree);

            dbg.location(329,16);
            ID289=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2240); 
            ID289_tree = (Object)adaptor.create(ID289);
            adaptor.addChild(root_0, ID289_tree);

            dbg.location(329,19);
            IN290=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2242); 
            IN290_tree = (Object)adaptor.create(IN290);
            adaptor.addChild(root_0, IN290_tree);

            dbg.location(329,22);
            pushFollow(FOLLOW_bounds_clause_in_forall_statement2244);
            bounds_clause291=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause291.getTree());
            dbg.location(329,36);
            pushFollow(FOLLOW_sql_statement_in_forall_statement2246);
            sql_statement292=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement292.getTree());
            dbg.location(329,50);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:329:50: ( kSAVE kEXCEPTIONS )?
            int alt91=2;
            try { dbg.enterSubRule(91);
            try { dbg.enterDecision(91);

            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            } finally {dbg.exitDecision(91);}

            switch (alt91) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:329:52: kSAVE kEXCEPTIONS
                    {
                    dbg.location(329,52);
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2250);
                    kSAVE293=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE293.getTree());
                    dbg.location(329,58);
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2252);
                    kEXCEPTIONS294=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS294.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(91);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(330, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forall_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forall_statement"

    public static class bounds_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:332:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQLParser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQLParser.bounds_clause_return retval = new PLSQLParser.bounds_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLEDOT296=null;
        Token BETWEEN301=null;
        Token AND303=null;
        PLSQLParser.numeric_expression_return numeric_expression295 = null;

        PLSQLParser.numeric_expression_return numeric_expression297 = null;

        PLSQLParser.kINDICES_return kINDICES298 = null;

        PLSQLParser.kOF_return kOF299 = null;

        PLSQLParser.atom_return atom300 = null;

        PLSQLParser.numeric_expression_return numeric_expression302 = null;

        PLSQLParser.numeric_expression_return numeric_expression304 = null;

        PLSQLParser.kVALUES_return kVALUES305 = null;

        PLSQLParser.kOF_return kOF306 = null;

        PLSQLParser.atom_return atom307 = null;


        Object DOUBLEDOT296_tree=null;
        Object BETWEEN301_tree=null;
        Object AND303_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bounds_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:333:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt93=3;
            try { dbg.enterDecision(93);

            try {
                isCyclicDecision = true;
                alt93 = dfa93.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(93);}

            switch (alt93) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:333:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(333,7);
                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2274);
                    numeric_expression295=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression295.getTree());
                    dbg.location(333,26);
                    DOUBLEDOT296=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2276); 
                    DOUBLEDOT296_tree = (Object)adaptor.create(DOUBLEDOT296);
                    adaptor.addChild(root_0, DOUBLEDOT296_tree);

                    dbg.location(333,36);
                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2278);
                    numeric_expression297=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression297.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:334:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(334,7);
                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2286);
                    kINDICES298=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES298.getTree());
                    dbg.location(334,16);
                    pushFollow(FOLLOW_kOF_in_bounds_clause2288);
                    kOF299=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF299.getTree());
                    dbg.location(334,20);
                    pushFollow(FOLLOW_atom_in_bounds_clause2290);
                    atom300=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom300.getTree());
                    dbg.location(334,25);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:334:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt92=2;
                    try { dbg.enterSubRule(92);
                    try { dbg.enterDecision(92);

                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==BETWEEN) ) {
                        alt92=1;
                    }
                    } finally {dbg.exitDecision(92);}

                    switch (alt92) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:334:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            dbg.location(334,27);
                            BETWEEN301=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2294); 
                            BETWEEN301_tree = (Object)adaptor.create(BETWEEN301);
                            adaptor.addChild(root_0, BETWEEN301_tree);

                            dbg.location(334,35);
                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2296);
                            numeric_expression302=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression302.getTree());
                            dbg.location(334,54);
                            AND303=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2298); 
                            AND303_tree = (Object)adaptor.create(AND303);
                            adaptor.addChild(root_0, AND303_tree);

                            dbg.location(334,58);
                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2300);
                            numeric_expression304=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression304.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(92);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:335:7: kVALUES kOF atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(335,7);
                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2311);
                    kVALUES305=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES305.getTree());
                    dbg.location(335,15);
                    pushFollow(FOLLOW_kOF_in_bounds_clause2313);
                    kOF306=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF306.getTree());
                    dbg.location(335,19);
                    pushFollow(FOLLOW_atom_in_bounds_clause2315);
                    atom307=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom307.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(336, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bounds_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bounds_clause"

    public static class goto_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goto_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:338:1: goto_statement : GOTO label_name ;
    public final PLSQLParser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQLParser.goto_statement_return retval = new PLSQLParser.goto_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GOTO308=null;
        PLSQLParser.label_name_return label_name309 = null;


        Object GOTO308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "goto_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:338:16: ( GOTO label_name )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:339:9: GOTO label_name
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(339,9);
            GOTO308=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2336); 
            GOTO308_tree = (Object)adaptor.create(GOTO308);
            adaptor.addChild(root_0, GOTO308_tree);

            dbg.location(339,14);
            pushFollow(FOLLOW_label_name_in_goto_statement2338);
            label_name309=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name309.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(340, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "goto_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "goto_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQLParser.if_statement_return if_statement() throws RecognitionException {
        PLSQLParser.if_statement_return retval = new PLSQLParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF310=null;
        Token THEN312=null;
        Token SEMI314=null;
        Token ELSIF315=null;
        Token THEN317=null;
        Token SEMI319=null;
        Token ELSE320=null;
        Token SEMI322=null;
        Token END323=null;
        Token IF324=null;
        PLSQLParser.expression_return expression311 = null;

        PLSQLParser.statement_return statement313 = null;

        PLSQLParser.expression_return expression316 = null;

        PLSQLParser.statement_return statement318 = null;

        PLSQLParser.statement_return statement321 = null;


        Object IF310_tree=null;
        Object THEN312_tree=null;
        Object SEMI314_tree=null;
        Object ELSIF315_tree=null;
        Object THEN317_tree=null;
        Object SEMI319_tree=null;
        Object ELSE320_tree=null;
        Object SEMI322_tree=null;
        Object END323_tree=null;
        Object IF324_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "if_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:343:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(343,9);
            IF310=(Token)match(input,IF,FOLLOW_IF_in_if_statement2359); 
            IF310_tree = (Object)adaptor.create(IF310);
            adaptor.addChild(root_0, IF310_tree);

            dbg.location(343,12);
            pushFollow(FOLLOW_expression_in_if_statement2361);
            expression311=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression311.getTree());
            dbg.location(343,23);
            THEN312=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2363); 
            THEN312_tree = (Object)adaptor.create(THEN312);
            adaptor.addChild(root_0, THEN312_tree);

            dbg.location(343,28);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:343:28: ( statement SEMI )+
            int cnt94=0;
            try { dbg.enterSubRule(94);

            loop94:
            do {
                int alt94=2;
                try { dbg.enterDecision(94);

                int LA94_0 = input.LA(1);

                if ( (LA94_0==ID||LA94_0==RETURN||LA94_0==NULL||LA94_0==BEGIN||(LA94_0>=COLON && LA94_0<=CASE)||(LA94_0>=CLOSE && LA94_0<=EXECUTE)||(LA94_0>=EXIT && LA94_0<=FETCH)||(LA94_0>=FOR && LA94_0<=FORALL)||(LA94_0>=GOTO && LA94_0<=IF)||LA94_0==OPEN||(LA94_0>=RAISE && LA94_0<=LLABEL)||(LA94_0>=COMMIT && LA94_0<=SET)||(LA94_0>=UPDATE && LA94_0<=WHILE)) ) {
                    alt94=1;
                }


                } finally {dbg.exitDecision(94);}

                switch (alt94) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:343:30: statement SEMI
            	    {
            	    dbg.location(343,30);
            	    pushFollow(FOLLOW_statement_in_if_statement2367);
            	    statement313=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement313.getTree());
            	    dbg.location(343,40);
            	    SEMI314=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2369); 
            	    SEMI314_tree = (Object)adaptor.create(SEMI314);
            	    adaptor.addChild(root_0, SEMI314_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt94++;
            } while (true);
            } finally {dbg.exitSubRule(94);}

            dbg.location(344,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:344:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            try { dbg.enterSubRule(96);

            loop96:
            do {
                int alt96=2;
                try { dbg.enterDecision(96);

                int LA96_0 = input.LA(1);

                if ( (LA96_0==ELSIF) ) {
                    alt96=1;
                }


                } finally {dbg.exitDecision(96);}

                switch (alt96) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:344:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    dbg.location(344,11);
            	    ELSIF315=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement2384); 
            	    ELSIF315_tree = (Object)adaptor.create(ELSIF315);
            	    adaptor.addChild(root_0, ELSIF315_tree);

            	    dbg.location(344,17);
            	    pushFollow(FOLLOW_expression_in_if_statement2386);
            	    expression316=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression316.getTree());
            	    dbg.location(344,28);
            	    THEN317=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2388); 
            	    THEN317_tree = (Object)adaptor.create(THEN317);
            	    adaptor.addChild(root_0, THEN317_tree);

            	    dbg.location(344,33);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:344:33: ( statement SEMI )+
            	    int cnt95=0;
            	    try { dbg.enterSubRule(95);

            	    loop95:
            	    do {
            	        int alt95=2;
            	        try { dbg.enterDecision(95);

            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==ID||LA95_0==RETURN||LA95_0==NULL||LA95_0==BEGIN||(LA95_0>=COLON && LA95_0<=CASE)||(LA95_0>=CLOSE && LA95_0<=EXECUTE)||(LA95_0>=EXIT && LA95_0<=FETCH)||(LA95_0>=FOR && LA95_0<=FORALL)||(LA95_0>=GOTO && LA95_0<=IF)||LA95_0==OPEN||(LA95_0>=RAISE && LA95_0<=LLABEL)||(LA95_0>=COMMIT && LA95_0<=SET)||(LA95_0>=UPDATE && LA95_0<=WHILE)) ) {
            	            alt95=1;
            	        }


            	        } finally {dbg.exitDecision(95);}

            	        switch (alt95) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:344:35: statement SEMI
            	    	    {
            	    	    dbg.location(344,35);
            	    	    pushFollow(FOLLOW_statement_in_if_statement2392);
            	    	    statement318=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement318.getTree());
            	    	    dbg.location(344,45);
            	    	    SEMI319=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2394); 
            	    	    SEMI319_tree = (Object)adaptor.create(SEMI319);
            	    	    adaptor.addChild(root_0, SEMI319_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt95 >= 1 ) break loop95;
            	                EarlyExitException eee =
            	                    new EarlyExitException(95, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt95++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(95);}


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);
            } finally {dbg.exitSubRule(96);}

            dbg.location(345,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:345:9: ( ELSE ( statement SEMI )+ )?
            int alt98=2;
            try { dbg.enterSubRule(98);
            try { dbg.enterDecision(98);

            int LA98_0 = input.LA(1);

            if ( (LA98_0==ELSE) ) {
                alt98=1;
            }
            } finally {dbg.exitDecision(98);}

            switch (alt98) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:345:11: ELSE ( statement SEMI )+
                    {
                    dbg.location(345,11);
                    ELSE320=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement2412); 
                    ELSE320_tree = (Object)adaptor.create(ELSE320);
                    adaptor.addChild(root_0, ELSE320_tree);

                    dbg.location(345,16);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:345:16: ( statement SEMI )+
                    int cnt97=0;
                    try { dbg.enterSubRule(97);

                    loop97:
                    do {
                        int alt97=2;
                        try { dbg.enterDecision(97);

                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==ID||LA97_0==RETURN||LA97_0==NULL||LA97_0==BEGIN||(LA97_0>=COLON && LA97_0<=CASE)||(LA97_0>=CLOSE && LA97_0<=EXECUTE)||(LA97_0>=EXIT && LA97_0<=FETCH)||(LA97_0>=FOR && LA97_0<=FORALL)||(LA97_0>=GOTO && LA97_0<=IF)||LA97_0==OPEN||(LA97_0>=RAISE && LA97_0<=LLABEL)||(LA97_0>=COMMIT && LA97_0<=SET)||(LA97_0>=UPDATE && LA97_0<=WHILE)) ) {
                            alt97=1;
                        }


                        } finally {dbg.exitDecision(97);}

                        switch (alt97) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:345:18: statement SEMI
                    	    {
                    	    dbg.location(345,18);
                    	    pushFollow(FOLLOW_statement_in_if_statement2416);
                    	    statement321=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement321.getTree());
                    	    dbg.location(345,28);
                    	    SEMI322=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2418); 
                    	    SEMI322_tree = (Object)adaptor.create(SEMI322);
                    	    adaptor.addChild(root_0, SEMI322_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt97++;
                    } while (true);
                    } finally {dbg.exitSubRule(97);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(98);}

            dbg.location(346,9);
            END323=(Token)match(input,END,FOLLOW_END_in_if_statement2434); 
            END323_tree = (Object)adaptor.create(END323);
            adaptor.addChild(root_0, END323_tree);

            dbg.location(346,13);
            IF324=(Token)match(input,IF,FOLLOW_IF_in_if_statement2436); 
            IF324_tree = (Object)adaptor.create(IF324);
            adaptor.addChild(root_0, IF324_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(347, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "if_statement"

    public static class null_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "null_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:349:1: null_statement : NULL ;
    public final PLSQLParser.null_statement_return null_statement() throws RecognitionException {
        PLSQLParser.null_statement_return retval = new PLSQLParser.null_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL325=null;

        Object NULL325_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "null_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:349:16: ( NULL )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:350:9: NULL
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(350,9);
            NULL325=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement2457); 
            NULL325_tree = (Object)adaptor.create(NULL325);
            adaptor.addChild(root_0, NULL325_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(351, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "null_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "null_statement"

    public static class open_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "open_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:353:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQLParser.open_statement_return open_statement() throws RecognitionException {
        PLSQLParser.open_statement_return retval = new PLSQLParser.open_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN326=null;
        Token ID327=null;
        Token DOT328=null;
        Token ID329=null;
        Token FOR331=null;
        PLSQLParser.call_args_return call_args330 = null;

        PLSQLParser.select_statement_return select_statement332 = null;


        Object OPEN326_tree=null;
        Object ID327_tree=null;
        Object DOT328_tree=null;
        Object ID329_tree=null;
        Object FOR331_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "open_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:353:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(354,9);
            OPEN326=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement2478); 
            OPEN326_tree = (Object)adaptor.create(OPEN326);
            adaptor.addChild(root_0, OPEN326_tree);

            dbg.location(354,14);
            ID327=(Token)match(input,ID,FOLLOW_ID_in_open_statement2480); 
            ID327_tree = (Object)adaptor.create(ID327);
            adaptor.addChild(root_0, ID327_tree);

            dbg.location(354,17);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:17: ( DOT ID )*
            try { dbg.enterSubRule(99);

            loop99:
            do {
                int alt99=2;
                try { dbg.enterDecision(99);

                int LA99_0 = input.LA(1);

                if ( (LA99_0==DOT) ) {
                    alt99=1;
                }


                } finally {dbg.exitDecision(99);}

                switch (alt99) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:19: DOT ID
            	    {
            	    dbg.location(354,19);
            	    DOT328=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement2484); 
            	    DOT328_tree = (Object)adaptor.create(DOT328);
            	    adaptor.addChild(root_0, DOT328_tree);

            	    dbg.location(354,23);
            	    ID329=(Token)match(input,ID,FOLLOW_ID_in_open_statement2486); 
            	    ID329_tree = (Object)adaptor.create(ID329);
            	    adaptor.addChild(root_0, ID329_tree);


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);
            } finally {dbg.exitSubRule(99);}

            dbg.location(354,29);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:29: ( call_args )?
            int alt100=2;
            try { dbg.enterSubRule(100);
            try { dbg.enterDecision(100);

            int LA100_0 = input.LA(1);

            if ( (LA100_0==LPAREN) ) {
                alt100=1;
            }
            } finally {dbg.exitDecision(100);}

            switch (alt100) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:29: call_args
                    {
                    dbg.location(354,29);
                    pushFollow(FOLLOW_call_args_in_open_statement2491);
                    call_args330=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args330.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(100);}

            dbg.location(354,40);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:40: ( FOR select_statement )?
            int alt101=2;
            try { dbg.enterSubRule(101);
            try { dbg.enterDecision(101);

            int LA101_0 = input.LA(1);

            if ( (LA101_0==FOR) ) {
                alt101=1;
            }
            } finally {dbg.exitDecision(101);}

            switch (alt101) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:42: FOR select_statement
                    {
                    dbg.location(354,42);
                    FOR331=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement2496); 
                    FOR331_tree = (Object)adaptor.create(FOR331);
                    adaptor.addChild(root_0, FOR331_tree);

                    dbg.location(354,46);
                    pushFollow(FOLLOW_select_statement_in_open_statement2498);
                    select_statement332=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement332.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(101);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(355, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "open_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "open_statement"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:357:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQLParser.pragma_return pragma() throws RecognitionException {
        PLSQLParser.pragma_return retval = new PLSQLParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA333=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi334 = null;


        Object PRAGMA333_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:357:8: ( PRAGMA swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:358:9: PRAGMA swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(358,9);
            PRAGMA333=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma2522); 
            PRAGMA333_tree = (Object)adaptor.create(PRAGMA333);
            adaptor.addChild(root_0, PRAGMA333_tree);

            dbg.location(358,16);
            pushFollow(FOLLOW_swallow_to_semi_in_pragma2524);
            swallow_to_semi334=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi334.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(359, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pragma"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:361:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQLParser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQLParser.raise_statement_return retval = new PLSQLParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RAISE335=null;
        Token ID336=null;
        Token DOT337=null;
        Token ID338=null;

        Object RAISE335_tree=null;
        Object ID336_tree=null;
        Object DOT337_tree=null;
        Object ID338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "raise_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(361, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:361:17: ( RAISE ( ID ( DOT ID )* )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(362,9);
            RAISE335=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement2545); 
            RAISE335_tree = (Object)adaptor.create(RAISE335);
            adaptor.addChild(root_0, RAISE335_tree);

            dbg.location(362,15);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:15: ( ID ( DOT ID )* )?
            int alt103=2;
            try { dbg.enterSubRule(103);
            try { dbg.enterDecision(103);

            int LA103_0 = input.LA(1);

            if ( (LA103_0==ID) ) {
                alt103=1;
            }
            } finally {dbg.exitDecision(103);}

            switch (alt103) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:17: ID ( DOT ID )*
                    {
                    dbg.location(362,17);
                    ID336=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2549); 
                    ID336_tree = (Object)adaptor.create(ID336);
                    adaptor.addChild(root_0, ID336_tree);

                    dbg.location(362,20);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:20: ( DOT ID )*
                    try { dbg.enterSubRule(102);

                    loop102:
                    do {
                        int alt102=2;
                        try { dbg.enterDecision(102);

                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==DOT) ) {
                            alt102=1;
                        }


                        } finally {dbg.exitDecision(102);}

                        switch (alt102) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:22: DOT ID
                    	    {
                    	    dbg.location(362,22);
                    	    DOT337=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement2553); 
                    	    DOT337_tree = (Object)adaptor.create(DOT337);
                    	    adaptor.addChild(root_0, DOT337_tree);

                    	    dbg.location(362,26);
                    	    ID338=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2555); 
                    	    ID338_tree = (Object)adaptor.create(ID338);
                    	    adaptor.addChild(root_0, ID338_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(102);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(103);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(363, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "raise_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class return_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:365:1: return_statement : RETURN ( expression )? ;
    public final PLSQLParser.return_statement_return return_statement() throws RecognitionException {
        PLSQLParser.return_statement_return retval = new PLSQLParser.return_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN339=null;
        PLSQLParser.expression_return expression340 = null;


        Object RETURN339_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "return_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:365:18: ( RETURN ( expression )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:366:9: RETURN ( expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(366,9);
            RETURN339=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement2582); 
            RETURN339_tree = (Object)adaptor.create(RETURN339);
            adaptor.addChild(root_0, RETURN339_tree);

            dbg.location(366,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:366:16: ( expression )?
            int alt104=2;
            try { dbg.enterSubRule(104);
            try { dbg.enterDecision(104);

            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID||LA104_0==LPAREN||(LA104_0>=NOT && LA104_0<=NULL)||LA104_0==COLON||(LA104_0>=MINUS && LA104_0<=PLUS)||LA104_0==SQL||(LA104_0>=INTEGER && LA104_0<=QUOTED_STRING)||(LA104_0>=INSERTING && LA104_0<=DELETING)) ) {
                alt104=1;
            }
            } finally {dbg.exitDecision(104);}

            switch (alt104) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:366:16: expression
                    {
                    dbg.location(366,16);
                    pushFollow(FOLLOW_expression_in_return_statement2584);
                    expression340=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression340.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(104);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(367, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "return_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "return_statement"

    public static class plsql_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plsql_block"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:369:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQLParser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQLParser.plsql_block_return retval = new PLSQLParser.plsql_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DECLARE341=null;
        PLSQLParser.declare_section_return declare_section342 = null;

        PLSQLParser.body_return body343 = null;


        Object DECLARE341_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "plsql_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(369, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:369:13: ( ( DECLARE declare_section )? body )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:370:9: ( DECLARE declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(370,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:370:9: ( DECLARE declare_section )?
            int alt105=2;
            try { dbg.enterSubRule(105);
            try { dbg.enterDecision(105);

            int LA105_0 = input.LA(1);

            if ( (LA105_0==DECLARE) ) {
                alt105=1;
            }
            } finally {dbg.exitDecision(105);}

            switch (alt105) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:370:11: DECLARE declare_section
                    {
                    dbg.location(370,11);
                    DECLARE341=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block2608); 
                    DECLARE341_tree = (Object)adaptor.create(DECLARE341);
                    adaptor.addChild(root_0, DECLARE341_tree);

                    dbg.location(370,19);
                    pushFollow(FOLLOW_declare_section_in_plsql_block2610);
                    declare_section342=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section342.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(105);}

            dbg.location(370,38);
            pushFollow(FOLLOW_body_in_plsql_block2615);
            body343=body();

            state._fsp--;

            adaptor.addChild(root_0, body343.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(371, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "plsql_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "plsql_block"

    public static class label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:373:1: label : LLABEL label RLABEL ;
    public final PLSQLParser.label_return label() throws RecognitionException {
        PLSQLParser.label_return retval = new PLSQLParser.label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LLABEL344=null;
        Token RLABEL346=null;
        PLSQLParser.label_return label345 = null;


        Object LLABEL344_tree=null;
        Object RLABEL346_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "label");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:373:7: ( LLABEL label RLABEL )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:374:9: LLABEL label RLABEL
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(374,9);
            LLABEL344=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label2636); 
            LLABEL344_tree = (Object)adaptor.create(LLABEL344);
            adaptor.addChild(root_0, LLABEL344_tree);

            dbg.location(374,16);
            pushFollow(FOLLOW_label_in_label2638);
            label345=label();

            state._fsp--;

            adaptor.addChild(root_0, label345.getTree());
            dbg.location(374,22);
            RLABEL346=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label2640); 
            RLABEL346_tree = (Object)adaptor.create(RLABEL346);
            adaptor.addChild(root_0, RLABEL346_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(375, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "label");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "label"

    public static class qual_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qual_id"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:377:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQLParser.qual_id_return qual_id() throws RecognitionException {
        PLSQLParser.qual_id_return retval = new PLSQLParser.qual_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON347=null;
        Token ID348=null;
        Token DOT349=null;
        Token COLON350=null;
        Token ID351=null;

        Object COLON347_tree=null;
        Object ID348_tree=null;
        Object DOT349_tree=null;
        Object COLON350_tree=null;
        Object ID351_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qual_id");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:377:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(378,2);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:2: ( COLON )?
            int alt106=2;
            try { dbg.enterSubRule(106);
            try { dbg.enterDecision(106);

            int LA106_0 = input.LA(1);

            if ( (LA106_0==COLON) ) {
                alt106=1;
            }
            } finally {dbg.exitDecision(106);}

            switch (alt106) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:2: COLON
                    {
                    dbg.location(378,2);
                    COLON347=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2654); 
                    COLON347_tree = (Object)adaptor.create(COLON347);
                    adaptor.addChild(root_0, COLON347_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(106);}

            dbg.location(378,9);
            ID348=(Token)match(input,ID,FOLLOW_ID_in_qual_id2657); 
            ID348_tree = (Object)adaptor.create(ID348);
            adaptor.addChild(root_0, ID348_tree);

            dbg.location(378,12);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:12: ( DOT ( COLON )? ID )*
            try { dbg.enterSubRule(108);

            loop108:
            do {
                int alt108=2;
                try { dbg.enterDecision(108);

                int LA108_0 = input.LA(1);

                if ( (LA108_0==DOT) ) {
                    alt108=1;
                }


                } finally {dbg.exitDecision(108);}

                switch (alt108) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:14: DOT ( COLON )? ID
            	    {
            	    dbg.location(378,14);
            	    DOT349=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id2661); 
            	    DOT349_tree = (Object)adaptor.create(DOT349);
            	    adaptor.addChild(root_0, DOT349_tree);

            	    dbg.location(378,18);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:18: ( COLON )?
            	    int alt107=2;
            	    try { dbg.enterSubRule(107);
            	    try { dbg.enterDecision(107);

            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==COLON) ) {
            	        alt107=1;
            	    }
            	    } finally {dbg.exitDecision(107);}

            	    switch (alt107) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:18: COLON
            	            {
            	            dbg.location(378,18);
            	            COLON350=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2663); 
            	            COLON350_tree = (Object)adaptor.create(COLON350);
            	            adaptor.addChild(root_0, COLON350_tree);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(107);}

            	    dbg.location(378,25);
            	    ID351=(Token)match(input,ID,FOLLOW_ID_in_qual_id2666); 
            	    ID351_tree = (Object)adaptor.create(ID351);
            	    adaptor.addChild(root_0, ID351_tree);


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);
            } finally {dbg.exitSubRule(108);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(379, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qual_id");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qual_id"

    public static class sql_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:381:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQLParser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQLParser.sql_statement_return retval = new PLSQLParser.sql_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.commit_statement_return commit_statement352 = null;

        PLSQLParser.delete_statement_return delete_statement353 = null;

        PLSQLParser.insert_statement_return insert_statement354 = null;

        PLSQLParser.lock_table_statement_return lock_table_statement355 = null;

        PLSQLParser.rollback_statement_return rollback_statement356 = null;

        PLSQLParser.savepoint_statement_return savepoint_statement357 = null;

        PLSQLParser.select_statement_return select_statement358 = null;

        PLSQLParser.set_transaction_statement_return set_transaction_statement359 = null;

        PLSQLParser.update_statement_return update_statement360 = null;



        try { dbg.enterRule(getGrammarFileName(), "sql_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:382:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
            int alt109=9;
            try { dbg.enterDecision(109);

            switch ( input.LA(1) ) {
            case COMMIT:
                {
                alt109=1;
                }
                break;
            case DELETE:
                {
                alt109=2;
                }
                break;
            case INSERT:
                {
                alt109=3;
                }
                break;
            case LOCK:
                {
                alt109=4;
                }
                break;
            case ROLLBACK:
                {
                alt109=5;
                }
                break;
            case SAVEPOINT:
                {
                alt109=6;
                }
                break;
            case SELECT:
                {
                alt109=7;
                }
                break;
            case SET:
                {
                alt109=8;
                }
                break;
            case UPDATE:
                {
                alt109=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(109);}

            switch (alt109) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:382:7: commit_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(382,7);
                    pushFollow(FOLLOW_commit_statement_in_sql_statement2686);
                    commit_statement352=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement352.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:383:7: delete_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(383,7);
                    pushFollow(FOLLOW_delete_statement_in_sql_statement2694);
                    delete_statement353=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement353.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:384:7: insert_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(384,7);
                    pushFollow(FOLLOW_insert_statement_in_sql_statement2702);
                    insert_statement354=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement354.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:385:7: lock_table_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(385,7);
                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement2710);
                    lock_table_statement355=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement355.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:386:7: rollback_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(386,7);
                    pushFollow(FOLLOW_rollback_statement_in_sql_statement2718);
                    rollback_statement356=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement356.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:387:7: savepoint_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(387,7);
                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement2726);
                    savepoint_statement357=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement357.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:388:7: select_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(388,7);
                    pushFollow(FOLLOW_select_statement_in_sql_statement2734);
                    select_statement358=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement358.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:389:7: set_transaction_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(389,7);
                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement2742);
                    set_transaction_statement359=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement359.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:390:7: update_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(390,7);
                    pushFollow(FOLLOW_update_statement_in_sql_statement2750);
                    update_statement360=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement360.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(391, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sql_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sql_statement"

    public static class commit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:393:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQLParser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQLParser.commit_statement_return retval = new PLSQLParser.commit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT361=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi362 = null;


        Object COMMIT361_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "commit_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:393:18: ( COMMIT ( swallow_to_semi )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:394:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(394,9);
            COMMIT361=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement2771); 
            COMMIT361_tree = (Object)adaptor.create(COMMIT361);
            adaptor.addChild(root_0, COMMIT361_tree);

            dbg.location(394,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:394:16: ( swallow_to_semi )?
            int alt110=2;
            try { dbg.enterSubRule(110);
            try { dbg.enterDecision(110);

            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                int LA110_1 = input.LA(2);

                if ( ((LA110_1>=PROC_CALL && LA110_1<=PROCEDURE)||(LA110_1>=FUNCTION && LA110_1<=ML_COMMENT)) ) {
                    alt110=1;
                }
                else if ( (LA110_1==ID) ) {
                    int LA110_4 = input.LA(3);

                    if ( (!(evalPredicate(evalPredicate(input.LT(1).getText().equalsIgnoreCase("save"),"input.LT(1).getText().equalsIgnoreCase(\"save\")"),""))) ) {
                        alt110=1;
                    }
                }
            }
            else if ( ((LA110_0>=PROC_CALL && LA110_0<=DIVIDE)||LA110_0==PROCEDURE||(LA110_0>=FUNCTION && LA110_0<=ML_COMMENT)) ) {
                alt110=1;
            }
            } finally {dbg.exitDecision(110);}

            switch (alt110) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:394:16: swallow_to_semi
                    {
                    dbg.location(394,16);
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement2773);
                    swallow_to_semi362=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi362.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(110);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(395, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commit_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "commit_statement"

    public static class delete_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:397:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQLParser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQLParser.delete_statement_return retval = new PLSQLParser.delete_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE363=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi364 = null;


        Object DELETE363_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "delete_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:397:18: ( DELETE swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:398:9: DELETE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(398,9);
            DELETE363=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement2795); 
            DELETE363_tree = (Object)adaptor.create(DELETE363);
            adaptor.addChild(root_0, DELETE363_tree);

            dbg.location(398,16);
            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement2797);
            swallow_to_semi364=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi364.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(399, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "delete_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "delete_statement"

    public static class insert_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:401:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQLParser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQLParser.insert_statement_return retval = new PLSQLParser.insert_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT365=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi366 = null;


        Object INSERT365_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "insert_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:401:18: ( INSERT swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:402:9: INSERT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(402,9);
            INSERT365=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement2818); 
            INSERT365_tree = (Object)adaptor.create(INSERT365);
            adaptor.addChild(root_0, INSERT365_tree);

            dbg.location(402,16);
            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement2820);
            swallow_to_semi366=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi366.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(403, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "insert_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "insert_statement"

    public static class lock_table_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lock_table_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:405:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQLParser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQLParser.lock_table_statement_return retval = new PLSQLParser.lock_table_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOCK367=null;
        Token TABLE368=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi369 = null;


        Object LOCK367_tree=null;
        Object TABLE368_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lock_table_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(405, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:405:22: ( LOCK TABLE swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:406:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(406,9);
            LOCK367=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement2841); 
            LOCK367_tree = (Object)adaptor.create(LOCK367);
            adaptor.addChild(root_0, LOCK367_tree);

            dbg.location(406,14);
            TABLE368=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement2843); 
            TABLE368_tree = (Object)adaptor.create(TABLE368);
            adaptor.addChild(root_0, TABLE368_tree);

            dbg.location(406,20);
            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement2845);
            swallow_to_semi369=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi369.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(407, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lock_table_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lock_table_statement"

    public static class rollback_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:409:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQLParser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQLParser.rollback_statement_return retval = new PLSQLParser.rollback_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK370=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi371 = null;


        Object ROLLBACK370_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rollback_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(409, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:409:20: ( ROLLBACK ( swallow_to_semi )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:410:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(410,9);
            ROLLBACK370=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement2866); 
            ROLLBACK370_tree = (Object)adaptor.create(ROLLBACK370);
            adaptor.addChild(root_0, ROLLBACK370_tree);

            dbg.location(410,18);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:410:18: ( swallow_to_semi )?
            int alt111=2;
            try { dbg.enterSubRule(111);
            try { dbg.enterDecision(111);

            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=PROC_CALL && LA111_1<=PROCEDURE)||(LA111_1>=FUNCTION && LA111_1<=ML_COMMENT)) ) {
                    alt111=1;
                }
                else if ( (LA111_1==ID) ) {
                    int LA111_4 = input.LA(3);

                    if ( (!(evalPredicate(evalPredicate(input.LT(1).getText().equalsIgnoreCase("save"),"input.LT(1).getText().equalsIgnoreCase(\"save\")"),""))) ) {
                        alt111=1;
                    }
                }
            }
            else if ( ((LA111_0>=PROC_CALL && LA111_0<=DIVIDE)||LA111_0==PROCEDURE||(LA111_0>=FUNCTION && LA111_0<=ML_COMMENT)) ) {
                alt111=1;
            }
            } finally {dbg.exitDecision(111);}

            switch (alt111) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:410:18: swallow_to_semi
                    {
                    dbg.location(410,18);
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement2868);
                    swallow_to_semi371=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi371.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(111);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(411, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rollback_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rollback_statement"

    public static class savepoint_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:413:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQLParser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQLParser.savepoint_statement_return retval = new PLSQLParser.savepoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT372=null;
        Token ID373=null;

        Object SAVEPOINT372_tree=null;
        Object ID373_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "savepoint_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(413, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:413:21: ( SAVEPOINT ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:414:9: SAVEPOINT ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(414,9);
            SAVEPOINT372=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement2890); 
            SAVEPOINT372_tree = (Object)adaptor.create(SAVEPOINT372);
            adaptor.addChild(root_0, SAVEPOINT372_tree);

            dbg.location(414,19);
            ID373=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement2892); 
            ID373_tree = (Object)adaptor.create(ID373);
            adaptor.addChild(root_0, ID373_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(415, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "savepoint_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "savepoint_statement"

    public static class select_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:417:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQLParser.select_statement_return select_statement() throws RecognitionException {
        PLSQLParser.select_statement_return retval = new PLSQLParser.select_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT374=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi375 = null;


        Object SELECT374_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "select_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(417, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:417:18: ( SELECT swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:418:9: SELECT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(418,9);
            SELECT374=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement2913); 
            SELECT374_tree = (Object)adaptor.create(SELECT374);
            adaptor.addChild(root_0, SELECT374_tree);

            dbg.location(418,16);
            pushFollow(FOLLOW_swallow_to_semi_in_select_statement2915);
            swallow_to_semi375=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi375.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(419, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "select_statement"

    public static class set_transaction_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_transaction_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:421:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQLParser.set_transaction_statement_return retval = new PLSQLParser.set_transaction_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET376=null;
        Token TRANSACTION377=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi378 = null;


        Object SET376_tree=null;
        Object TRANSACTION377_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "set_transaction_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(421, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:421:27: ( SET TRANSACTION swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:422:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(422,9);
            SET376=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement2936); 
            SET376_tree = (Object)adaptor.create(SET376);
            adaptor.addChild(root_0, SET376_tree);

            dbg.location(422,13);
            TRANSACTION377=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement2938); 
            TRANSACTION377_tree = (Object)adaptor.create(TRANSACTION377);
            adaptor.addChild(root_0, TRANSACTION377_tree);

            dbg.location(422,25);
            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement2940);
            swallow_to_semi378=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi378.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(423, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "set_transaction_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "set_transaction_statement"

    public static class update_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:425:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQLParser.update_statement_return update_statement() throws RecognitionException {
        PLSQLParser.update_statement_return retval = new PLSQLParser.update_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE379=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi380 = null;


        Object UPDATE379_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "update_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(425, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:425:18: ( UPDATE swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:426:9: UPDATE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(426,9);
            UPDATE379=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement2961); 
            UPDATE379_tree = (Object)adaptor.create(UPDATE379);
            adaptor.addChild(root_0, UPDATE379_tree);

            dbg.location(426,16);
            pushFollow(FOLLOW_swallow_to_semi_in_update_statement2963);
            swallow_to_semi380=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi380.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(427, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "update_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "update_statement"

    public static class swallow_to_semi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "swallow_to_semi"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:429:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQLParser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQLParser.swallow_to_semi_return retval = new PLSQLParser.swallow_to_semi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set381=null;

        Object set381_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "swallow_to_semi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:429:17: ( (~ ( SEMI ) )+ )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:430:9: (~ ( SEMI ) )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(430,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:430:9: (~ ( SEMI ) )+
            int cnt112=0;
            try { dbg.enterSubRule(112);

            loop112:
            do {
                int alt112=2;
                try { dbg.enterDecision(112);

                int LA112_0 = input.LA(1);

                if ( (LA112_0==ID) ) {
                    int LA112_2 = input.LA(2);

                    if ( ((LA112_2>=PROC_CALL && LA112_2<=PROCEDURE)||(LA112_2>=FUNCTION && LA112_2<=ML_COMMENT)) ) {
                        alt112=1;
                    }
                    else if ( (LA112_2==ID) ) {
                        int LA112_4 = input.LA(3);

                        if ( (!(evalPredicate(evalPredicate(input.LT(1).getText().equalsIgnoreCase("save"),"input.LT(1).getText().equalsIgnoreCase(\"save\")"),""))) ) {
                            alt112=1;
                        }


                    }


                }
                else if ( ((LA112_0>=PROC_CALL && LA112_0<=DIVIDE)||LA112_0==PROCEDURE||(LA112_0>=FUNCTION && LA112_0<=ML_COMMENT)) ) {
                    alt112=1;
                }


                } finally {dbg.exitDecision(112);}

                switch (alt112) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:430:9: ~ ( SEMI )
            	    {
            	    dbg.location(430,9);
            	    set381=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC_CALL && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set381));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt112++;
            } while (true);
            } finally {dbg.exitSubRule(112);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(431, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "swallow_to_semi");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "swallow_to_semi"

    public static class while_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:433:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQLParser.while_loop_statement_return retval = new PLSQLParser.while_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE382=null;
        Token LOOP384=null;
        Token SEMI386=null;
        Token END387=null;
        Token LOOP388=null;
        PLSQLParser.expression_return expression383 = null;

        PLSQLParser.statement_return statement385 = null;

        PLSQLParser.label_name_return label_name389 = null;


        Object WHILE382_tree=null;
        Object LOOP384_tree=null;
        Object SEMI386_tree=null;
        Object END387_tree=null;
        Object LOOP388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "while_loop_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:433:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(434,9);
            WHILE382=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3011); 
            WHILE382_tree = (Object)adaptor.create(WHILE382);
            adaptor.addChild(root_0, WHILE382_tree);

            dbg.location(434,15);
            pushFollow(FOLLOW_expression_in_while_loop_statement3013);
            expression383=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression383.getTree());
            dbg.location(434,26);
            LOOP384=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3015); 
            LOOP384_tree = (Object)adaptor.create(LOOP384);
            adaptor.addChild(root_0, LOOP384_tree);

            dbg.location(434,31);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:31: ( statement SEMI )+
            int cnt113=0;
            try { dbg.enterSubRule(113);

            loop113:
            do {
                int alt113=2;
                try { dbg.enterDecision(113);

                int LA113_0 = input.LA(1);

                if ( (LA113_0==ID||LA113_0==RETURN||LA113_0==NULL||LA113_0==BEGIN||(LA113_0>=COLON && LA113_0<=CASE)||(LA113_0>=CLOSE && LA113_0<=EXECUTE)||(LA113_0>=EXIT && LA113_0<=FETCH)||(LA113_0>=FOR && LA113_0<=FORALL)||(LA113_0>=GOTO && LA113_0<=IF)||LA113_0==OPEN||(LA113_0>=RAISE && LA113_0<=LLABEL)||(LA113_0>=COMMIT && LA113_0<=SET)||(LA113_0>=UPDATE && LA113_0<=WHILE)) ) {
                    alt113=1;
                }


                } finally {dbg.exitDecision(113);}

                switch (alt113) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:33: statement SEMI
            	    {
            	    dbg.location(434,33);
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3019);
            	    statement385=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement385.getTree());
            	    dbg.location(434,43);
            	    SEMI386=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3021); 
            	    SEMI386_tree = (Object)adaptor.create(SEMI386);
            	    adaptor.addChild(root_0, SEMI386_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt113++;
            } while (true);
            } finally {dbg.exitSubRule(113);}

            dbg.location(434,51);
            END387=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3026); 
            END387_tree = (Object)adaptor.create(END387);
            adaptor.addChild(root_0, END387_tree);

            dbg.location(434,55);
            LOOP388=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3028); 
            LOOP388_tree = (Object)adaptor.create(LOOP388);
            adaptor.addChild(root_0, LOOP388_tree);

            dbg.location(434,60);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:60: ( label_name )?
            int alt114=2;
            try { dbg.enterSubRule(114);
            try { dbg.enterDecision(114);

            int LA114_0 = input.LA(1);

            if ( (LA114_0==ID) ) {
                alt114=1;
            }
            } finally {dbg.exitDecision(114);}

            switch (alt114) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:60: label_name
                    {
                    dbg.location(434,60);
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3030);
                    label_name389=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name389.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(114);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(435, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_loop_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "while_loop_statement"

    public static class match_parens_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_parens"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:437:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQLParser.match_parens_return match_parens() throws RecognitionException {
        PLSQLParser.match_parens_return retval = new PLSQLParser.match_parens_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set390=null;
        Token RPAREN391=null;
        Token LPAREN393=null;
        PLSQLParser.match_parens_return match_parens392 = null;


        Object set390_tree=null;
        Object RPAREN391_tree=null;
        Object LPAREN393_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "match_parens");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(437, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:438:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
            int alt116=2;
            try { dbg.enterDecision(116);

            int LA116_0 = input.LA(1);

            if ( ((LA116_0>=PROC_CALL && LA116_0<=DIVIDE)||(LA116_0>=PROCEDURE && LA116_0<=COMMA)||(LA116_0>=NOCOPY && LA116_0<=CURSOR)||(LA116_0>=NOT && LA116_0<=RESULT_CACHE)||(LA116_0>=BEGIN && LA116_0<=ML_COMMENT)) ) {
                alt116=1;
            }
            else if ( (LA116_0==RPAREN) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(116);}

            switch (alt116) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:438:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(438,7);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:438:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    try { dbg.enterSubRule(115);

                    loop115:
                    do {
                        int alt115=2;
                        try { dbg.enterDecision(115);

                        int LA115_0 = input.LA(1);

                        if ( ((LA115_0>=PROC_CALL && LA115_0<=DIVIDE)||(LA115_0>=PROCEDURE && LA115_0<=RETURN)||LA115_0==COMMA||(LA115_0>=NOCOPY && LA115_0<=CURSOR)||(LA115_0>=NOT && LA115_0<=RESULT_CACHE)||(LA115_0>=BEGIN && LA115_0<=ML_COMMENT)) ) {
                            alt115=1;
                        }
                        else if ( (LA115_0==LPAREN) ) {
                            alt115=2;
                        }


                        } finally {dbg.exitDecision(115);}

                        switch (alt115) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:438:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    dbg.location(438,35);
                    	    set390=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=PROC_CALL && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=RESULT_CACHE)||(input.LA(1)>=BEGIN && input.LA(1)<=ML_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set390));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        dbg.recognitionException(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(115);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:439:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(439,7);
                    RPAREN391=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3099); 
                    RPAREN391_tree = (Object)adaptor.create(RPAREN391);
                    adaptor.addChild(root_0, RPAREN391_tree);

                    dbg.location(439,14);
                    pushFollow(FOLLOW_match_parens_in_match_parens3101);
                    match_parens392=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens392.getTree());
                    dbg.location(439,27);
                    LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3103); 
                    LPAREN393_tree = (Object)adaptor.create(LPAREN393);
                    adaptor.addChild(root_0, LPAREN393_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(440, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "match_parens");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "match_parens"

    public static class label_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label_name"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:442:1: label_name : ID ;
    public final PLSQLParser.label_name_return label_name() throws RecognitionException {
        PLSQLParser.label_name_return retval = new PLSQLParser.label_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID394=null;

        Object ID394_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "label_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(442, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:442:11: ( ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:442:13: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(442,13);
            ID394=(Token)match(input,ID,FOLLOW_ID_in_label_name3115); 
            ID394_tree = (Object)adaptor.create(ID394);
            adaptor.addChild(root_0, ID394_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(442, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "label_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "label_name"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:444:1: expression : or_expr ;
    public final PLSQLParser.expression_return expression() throws RecognitionException {
        PLSQLParser.expression_return retval = new PLSQLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.or_expr_return or_expr395 = null;



        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:445:5: ( or_expr )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:445:7: or_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(445,7);
            pushFollow(FOLLOW_or_expr_in_expression3127);
            or_expr395=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr395.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(446, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class or_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:448:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQLParser.or_expr_return or_expr() throws RecognitionException {
        PLSQLParser.or_expr_return retval = new PLSQLParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR397=null;
        PLSQLParser.and_expr_return and_expr396 = null;

        PLSQLParser.and_expr_return and_expr398 = null;


        Object OR397_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "or_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(448, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:449:5: ( and_expr ( OR and_expr )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:449:7: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(449,7);
            pushFollow(FOLLOW_and_expr_in_or_expr3144);
            and_expr396=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr396.getTree());
            dbg.location(449,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:449:16: ( OR and_expr )*
            try { dbg.enterSubRule(117);

            loop117:
            do {
                int alt117=2;
                try { dbg.enterDecision(117);

                int LA117_0 = input.LA(1);

                if ( (LA117_0==OR) ) {
                    alt117=1;
                }


                } finally {dbg.exitDecision(117);}

                switch (alt117) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:449:18: OR and_expr
            	    {
            	    dbg.location(449,18);
            	    OR397=(Token)match(input,OR,FOLLOW_OR_in_or_expr3148); 
            	    OR397_tree = (Object)adaptor.create(OR397);
            	    adaptor.addChild(root_0, OR397_tree);

            	    dbg.location(449,21);
            	    pushFollow(FOLLOW_and_expr_in_or_expr3150);
            	    and_expr398=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr398.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);
            } finally {dbg.exitSubRule(117);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(450, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "or_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:452:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQLParser.and_expr_return and_expr() throws RecognitionException {
        PLSQLParser.and_expr_return retval = new PLSQLParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND400=null;
        PLSQLParser.not_expr_return not_expr399 = null;

        PLSQLParser.not_expr_return not_expr401 = null;


        Object AND400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "and_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:453:5: ( not_expr ( AND not_expr )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:453:7: not_expr ( AND not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(453,7);
            pushFollow(FOLLOW_not_expr_in_and_expr3170);
            not_expr399=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr399.getTree());
            dbg.location(453,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:453:16: ( AND not_expr )*
            try { dbg.enterSubRule(118);

            loop118:
            do {
                int alt118=2;
                try { dbg.enterDecision(118);

                int LA118_0 = input.LA(1);

                if ( (LA118_0==AND) ) {
                    alt118=1;
                }


                } finally {dbg.exitDecision(118);}

                switch (alt118) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:453:18: AND not_expr
            	    {
            	    dbg.location(453,18);
            	    AND400=(Token)match(input,AND,FOLLOW_AND_in_and_expr3174); 
            	    AND400_tree = (Object)adaptor.create(AND400);
            	    adaptor.addChild(root_0, AND400_tree);

            	    dbg.location(453,22);
            	    pushFollow(FOLLOW_not_expr_in_and_expr3176);
            	    not_expr401=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr401.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);
            } finally {dbg.exitSubRule(118);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(454, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "and_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:456:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQLParser.not_expr_return not_expr() throws RecognitionException {
        PLSQLParser.not_expr_return retval = new PLSQLParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT402=null;
        PLSQLParser.compare_expr_return compare_expr403 = null;


        Object NOT402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "not_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(456, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:457:5: ( ( NOT )? compare_expr )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:457:7: ( NOT )? compare_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(457,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:457:7: ( NOT )?
            int alt119=2;
            try { dbg.enterSubRule(119);
            try { dbg.enterDecision(119);

            int LA119_0 = input.LA(1);

            if ( (LA119_0==NOT) ) {
                alt119=1;
            }
            } finally {dbg.exitDecision(119);}

            switch (alt119) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:457:7: NOT
                    {
                    dbg.location(457,7);
                    NOT402=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3196); 
                    NOT402_tree = (Object)adaptor.create(NOT402);
                    adaptor.addChild(root_0, NOT402_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(119);}

            dbg.location(457,12);
            pushFollow(FOLLOW_compare_expr_in_not_expr3199);
            compare_expr403=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr403.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(458, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "not_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "not_expr"

    public static class compare_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:460:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQLParser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQLParser.compare_expr_return retval = new PLSQLParser.compare_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set405=null;
        PLSQLParser.is_null_expr_return is_null_expr404 = null;

        PLSQLParser.is_null_expr_return is_null_expr406 = null;


        Object set405_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "compare_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(460, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:461:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:461:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(461,7);
            pushFollow(FOLLOW_is_null_expr_in_compare_expr3216);
            is_null_expr404=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr404.getTree());
            dbg.location(461,20);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:461:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt120=2;
            try { dbg.enterSubRule(120);
            try { dbg.enterDecision(120);

            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=EQ && LA120_0<=GEQ)) ) {
                alt120=1;
            }
            } finally {dbg.exitDecision(120);}

            switch (alt120) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:461:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    dbg.location(461,22);
                    set405=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set405));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(461,62);
                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3246);
                    is_null_expr406=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr406.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(120);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(462, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compare_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compare_expr"

    public static class is_null_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "is_null_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:464:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQLParser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQLParser.is_null_expr_return retval = new PLSQLParser.is_null_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IS408=null;
        Token NOT409=null;
        Token NULL410=null;
        PLSQLParser.like_expr_return like_expr407 = null;


        Object IS408_tree=null;
        Object NOT409_tree=null;
        Object NULL410_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "is_null_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(464, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:5: ( like_expr ( IS ( NOT )? NULL )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(465,7);
            pushFollow(FOLLOW_like_expr_in_is_null_expr3266);
            like_expr407=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr407.getTree());
            dbg.location(465,17);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:17: ( IS ( NOT )? NULL )?
            int alt122=2;
            try { dbg.enterSubRule(122);
            try { dbg.enterDecision(122);

            int LA122_0 = input.LA(1);

            if ( (LA122_0==IS) ) {
                alt122=1;
            }
            } finally {dbg.exitDecision(122);}

            switch (alt122) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:19: IS ( NOT )? NULL
                    {
                    dbg.location(465,19);
                    IS408=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3270); 
                    IS408_tree = (Object)adaptor.create(IS408);
                    adaptor.addChild(root_0, IS408_tree);

                    dbg.location(465,22);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:22: ( NOT )?
                    int alt121=2;
                    try { dbg.enterSubRule(121);
                    try { dbg.enterDecision(121);

                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==NOT) ) {
                        alt121=1;
                    }
                    } finally {dbg.exitDecision(121);}

                    switch (alt121) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:22: NOT
                            {
                            dbg.location(465,22);
                            NOT409=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3272); 
                            NOT409_tree = (Object)adaptor.create(NOT409);
                            adaptor.addChild(root_0, NOT409_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(121);}

                    dbg.location(465,27);
                    NULL410=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3275); 
                    NULL410_tree = (Object)adaptor.create(NULL410);
                    adaptor.addChild(root_0, NULL410_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(122);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(466, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "is_null_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "is_null_expr"

    public static class like_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "like_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:468:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQLParser.like_expr_return like_expr() throws RecognitionException {
        PLSQLParser.like_expr_return retval = new PLSQLParser.like_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT412=null;
        Token LIKE413=null;
        PLSQLParser.between_expr_return between_expr411 = null;

        PLSQLParser.between_expr_return between_expr414 = null;


        Object NOT412_tree=null;
        Object LIKE413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "like_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(469,7);
            pushFollow(FOLLOW_between_expr_in_like_expr3294);
            between_expr411=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr411.getTree());
            dbg.location(469,20);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:20: ( ( NOT )? LIKE between_expr )?
            int alt124=2;
            try { dbg.enterSubRule(124);
            try { dbg.enterDecision(124);

            int LA124_0 = input.LA(1);

            if ( (LA124_0==NOT||LA124_0==LIKE) ) {
                alt124=1;
            }
            } finally {dbg.exitDecision(124);}

            switch (alt124) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:22: ( NOT )? LIKE between_expr
                    {
                    dbg.location(469,22);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:22: ( NOT )?
                    int alt123=2;
                    try { dbg.enterSubRule(123);
                    try { dbg.enterDecision(123);

                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==NOT) ) {
                        alt123=1;
                    }
                    } finally {dbg.exitDecision(123);}

                    switch (alt123) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:22: NOT
                            {
                            dbg.location(469,22);
                            NOT412=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3298); 
                            NOT412_tree = (Object)adaptor.create(NOT412);
                            adaptor.addChild(root_0, NOT412_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(123);}

                    dbg.location(469,27);
                    LIKE413=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3301); 
                    LIKE413_tree = (Object)adaptor.create(LIKE413);
                    adaptor.addChild(root_0, LIKE413_tree);

                    dbg.location(469,32);
                    pushFollow(FOLLOW_between_expr_in_like_expr3303);
                    between_expr414=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr414.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(124);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(470, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "like_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "like_expr"

    public static class between_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:472:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQLParser.between_expr_return between_expr() throws RecognitionException {
        PLSQLParser.between_expr_return retval = new PLSQLParser.between_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT416=null;
        Token BETWEEN417=null;
        Token AND419=null;
        PLSQLParser.in_expr_return in_expr415 = null;

        PLSQLParser.in_expr_return in_expr418 = null;

        PLSQLParser.in_expr_return in_expr420 = null;


        Object NOT416_tree=null;
        Object BETWEEN417_tree=null;
        Object AND419_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "between_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(473,7);
            pushFollow(FOLLOW_in_expr_in_between_expr3323);
            in_expr415=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr415.getTree());
            dbg.location(473,15);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
            int alt126=2;
            try { dbg.enterSubRule(126);
            try { dbg.enterDecision(126);

            int LA126_0 = input.LA(1);

            if ( (LA126_0==NOT) ) {
                int LA126_1 = input.LA(2);

                if ( (LA126_1==BETWEEN) ) {
                    alt126=1;
                }
            }
            else if ( (LA126_0==BETWEEN) ) {
                alt126=1;
            }
            } finally {dbg.exitDecision(126);}

            switch (alt126) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    dbg.location(473,17);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:17: ( NOT )?
                    int alt125=2;
                    try { dbg.enterSubRule(125);
                    try { dbg.enterDecision(125);

                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==NOT) ) {
                        alt125=1;
                    }
                    } finally {dbg.exitDecision(125);}

                    switch (alt125) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:17: NOT
                            {
                            dbg.location(473,17);
                            NOT416=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3327); 
                            NOT416_tree = (Object)adaptor.create(NOT416);
                            adaptor.addChild(root_0, NOT416_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(125);}

                    dbg.location(473,22);
                    BETWEEN417=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3330); 
                    BETWEEN417_tree = (Object)adaptor.create(BETWEEN417);
                    adaptor.addChild(root_0, BETWEEN417_tree);

                    dbg.location(473,30);
                    pushFollow(FOLLOW_in_expr_in_between_expr3332);
                    in_expr418=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr418.getTree());
                    dbg.location(473,38);
                    AND419=(Token)match(input,AND,FOLLOW_AND_in_between_expr3334); 
                    AND419_tree = (Object)adaptor.create(AND419);
                    adaptor.addChild(root_0, AND419_tree);

                    dbg.location(473,42);
                    pushFollow(FOLLOW_in_expr_in_between_expr3336);
                    in_expr420=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr420.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(126);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(474, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "between_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "between_expr"

    public static class in_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:476:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQLParser.in_expr_return in_expr() throws RecognitionException {
        PLSQLParser.in_expr_return retval = new PLSQLParser.in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT422=null;
        Token IN423=null;
        Token LPAREN424=null;
        Token COMMA426=null;
        Token RPAREN428=null;
        PLSQLParser.add_expr_return add_expr421 = null;

        PLSQLParser.add_expr_return add_expr425 = null;

        PLSQLParser.add_expr_return add_expr427 = null;


        Object NOT422_tree=null;
        Object IN423_tree=null;
        Object LPAREN424_tree=null;
        Object COMMA426_tree=null;
        Object RPAREN428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(476, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(477,7);
            pushFollow(FOLLOW_add_expr_in_in_expr3356);
            add_expr421=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr421.getTree());
            dbg.location(477,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            int alt129=2;
            try { dbg.enterSubRule(129);
            try { dbg.enterDecision(129);

            int LA129_0 = input.LA(1);

            if ( (LA129_0==NOT) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==IN) ) {
                    alt129=1;
                }
            }
            else if ( (LA129_0==IN) ) {
                alt129=1;
            }
            } finally {dbg.exitDecision(129);}

            switch (alt129) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    dbg.location(477,18);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:18: ( NOT )?
                    int alt127=2;
                    try { dbg.enterSubRule(127);
                    try { dbg.enterDecision(127);

                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==NOT) ) {
                        alt127=1;
                    }
                    } finally {dbg.exitDecision(127);}

                    switch (alt127) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:18: NOT
                            {
                            dbg.location(477,18);
                            NOT422=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr3360); 
                            NOT422_tree = (Object)adaptor.create(NOT422);
                            adaptor.addChild(root_0, NOT422_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(127);}

                    dbg.location(477,23);
                    IN423=(Token)match(input,IN,FOLLOW_IN_in_in_expr3363); 
                    IN423_tree = (Object)adaptor.create(IN423);
                    adaptor.addChild(root_0, IN423_tree);

                    dbg.location(477,26);
                    LPAREN424=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr3365); 
                    LPAREN424_tree = (Object)adaptor.create(LPAREN424);
                    adaptor.addChild(root_0, LPAREN424_tree);

                    dbg.location(477,33);
                    pushFollow(FOLLOW_add_expr_in_in_expr3367);
                    add_expr425=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr425.getTree());
                    dbg.location(477,42);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:42: ( COMMA add_expr )*
                    try { dbg.enterSubRule(128);

                    loop128:
                    do {
                        int alt128=2;
                        try { dbg.enterDecision(128);

                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==COMMA) ) {
                            alt128=1;
                        }


                        } finally {dbg.exitDecision(128);}

                        switch (alt128) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:44: COMMA add_expr
                    	    {
                    	    dbg.location(477,44);
                    	    COMMA426=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr3371); 
                    	    COMMA426_tree = (Object)adaptor.create(COMMA426);
                    	    adaptor.addChild(root_0, COMMA426_tree);

                    	    dbg.location(477,50);
                    	    pushFollow(FOLLOW_add_expr_in_in_expr3373);
                    	    add_expr427=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr427.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(128);}

                    dbg.location(477,62);
                    RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr3378); 
                    RPAREN428_tree = (Object)adaptor.create(RPAREN428);
                    adaptor.addChild(root_0, RPAREN428_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(129);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(478, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "in_expr"

    public static class numeric_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:480:1: numeric_expression : add_expr ;
    public final PLSQLParser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQLParser.numeric_expression_return retval = new PLSQLParser.numeric_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.add_expr_return add_expr429 = null;



        try { dbg.enterRule(getGrammarFileName(), "numeric_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(480, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:481:5: ( add_expr )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:481:7: add_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(481,7);
            pushFollow(FOLLOW_add_expr_in_numeric_expression3398);
            add_expr429=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr429.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(482, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numeric_expression"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:484:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQLParser.add_expr_return add_expr() throws RecognitionException {
        PLSQLParser.add_expr_return retval = new PLSQLParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set431=null;
        PLSQLParser.mul_expr_return mul_expr430 = null;

        PLSQLParser.mul_expr_return mul_expr432 = null;


        Object set431_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(484, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:485:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:485:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(485,7);
            pushFollow(FOLLOW_mul_expr_in_add_expr3415);
            mul_expr430=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr430.getTree());
            dbg.location(485,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:485:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            try { dbg.enterSubRule(130);

            loop130:
            do {
                int alt130=2;
                try { dbg.enterDecision(130);

                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=MINUS && LA130_0<=DOUBLEVERTBAR)) ) {
                    alt130=1;
                }


                } finally {dbg.exitDecision(130);}

                switch (alt130) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:485:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    dbg.location(485,18);
            	    set431=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set431));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(485,51);
            	    pushFollow(FOLLOW_mul_expr_in_add_expr3433);
            	    mul_expr432=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr432.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);
            } finally {dbg.exitSubRule(130);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(486, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mul_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:488:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQLParser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQLParser.mul_expr_return retval = new PLSQLParser.mul_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK434=null;
        Token DIVIDE435=null;
        PLSQLParser.unary_sign_expr_return unary_sign_expr433 = null;

        PLSQLParser.kMOD_return kMOD436 = null;

        PLSQLParser.unary_sign_expr_return unary_sign_expr437 = null;


        Object ASTERISK434_tree=null;
        Object DIVIDE435_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mul_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(488, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(489,7);
            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3453);
            unary_sign_expr433=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr433.getTree());
            dbg.location(489,23);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            try { dbg.enterSubRule(132);

            loop132:
            do {
                int alt132=2;
                try { dbg.enterDecision(132);

                int LA132_0 = input.LA(1);

                if ( (LA132_0==DIVIDE||LA132_0==ID||LA132_0==ASTERISK) ) {
                    alt132=1;
                }


                } finally {dbg.exitDecision(132);}

                switch (alt132) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    dbg.location(489,25);
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:25: ( ASTERISK | DIVIDE | kMOD )
            	    int alt131=3;
            	    try { dbg.enterSubRule(131);
            	    try { dbg.enterDecision(131);

            	    switch ( input.LA(1) ) {
            	    case ASTERISK:
            	        {
            	        alt131=1;
            	        }
            	        break;
            	    case DIVIDE:
            	        {
            	        alt131=2;
            	        }
            	        break;
            	    case ID:
            	        {
            	        alt131=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 131, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(131);}

            	    switch (alt131) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:27: ASTERISK
            	            {
            	            dbg.location(489,27);
            	            ASTERISK434=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr3459); 
            	            ASTERISK434_tree = (Object)adaptor.create(ASTERISK434);
            	            adaptor.addChild(root_0, ASTERISK434_tree);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:38: DIVIDE
            	            {
            	            dbg.location(489,38);
            	            DIVIDE435=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr3463); 
            	            DIVIDE435_tree = (Object)adaptor.create(DIVIDE435);
            	            adaptor.addChild(root_0, DIVIDE435_tree);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:47: kMOD
            	            {
            	            dbg.location(489,47);
            	            pushFollow(FOLLOW_kMOD_in_mul_expr3467);
            	            kMOD436=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD436.getTree());

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(131);}

            	    dbg.location(489,54);
            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3471);
            	    unary_sign_expr437=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr437.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);
            } finally {dbg.exitSubRule(132);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(490, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mul_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mul_expr"

    public static class unary_sign_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_sign_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:492:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQLParser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQLParser.unary_sign_expr_return retval = new PLSQLParser.unary_sign_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set438=null;
        PLSQLParser.exponent_expr_return exponent_expr439 = null;


        Object set438_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_sign_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(492, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:493:5: ( ( MINUS | PLUS )? exponent_expr )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:493:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(493,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:493:7: ( MINUS | PLUS )?
            int alt133=2;
            try { dbg.enterSubRule(133);
            try { dbg.enterDecision(133);

            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=MINUS && LA133_0<=PLUS)) ) {
                alt133=1;
            }
            } finally {dbg.exitDecision(133);}

            switch (alt133) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
                    {
                    dbg.location(493,7);
                    set438=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set438));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(133);}

            dbg.location(493,25);
            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr3502);
            exponent_expr439=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr439.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(494, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_sign_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_sign_expr"

    public static class exponent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exponent_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:496:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQLParser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQLParser.exponent_expr_return retval = new PLSQLParser.exponent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPONENT441=null;
        PLSQLParser.atom_return atom440 = null;

        PLSQLParser.atom_return atom442 = null;


        Object EXPONENT441_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exponent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(496, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:497:5: ( atom ( EXPONENT atom )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:497:7: atom ( EXPONENT atom )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(497,7);
            pushFollow(FOLLOW_atom_in_exponent_expr3519);
            atom440=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom440.getTree());
            dbg.location(497,12);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:497:12: ( EXPONENT atom )?
            int alt134=2;
            try { dbg.enterSubRule(134);
            try { dbg.enterDecision(134);

            int LA134_0 = input.LA(1);

            if ( (LA134_0==EXPONENT) ) {
                alt134=1;
            }
            } finally {dbg.exitDecision(134);}

            switch (alt134) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:497:14: EXPONENT atom
                    {
                    dbg.location(497,14);
                    EXPONENT441=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr3523); 
                    EXPONENT441_tree = (Object)adaptor.create(EXPONENT441);
                    adaptor.addChild(root_0, EXPONENT441_tree);

                    dbg.location(497,23);
                    pushFollow(FOLLOW_atom_in_exponent_expr3525);
                    atom442=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom442.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(134);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(498, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exponent_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exponent_expr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:500:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQLParser.atom_return atom() throws RecognitionException {
        PLSQLParser.atom_return retval = new PLSQLParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PERCENT444=null;
        Token SQL446=null;
        Token PERCENT447=null;
        Token NULL452=null;
        Token LPAREN453=null;
        Token RPAREN455=null;
        PLSQLParser.variable_or_function_call_return variable_or_function_call443 = null;

        PLSQLParser.attribute_return attribute445 = null;

        PLSQLParser.attribute_return attribute448 = null;

        PLSQLParser.string_literal_return string_literal449 = null;

        PLSQLParser.numeric_atom_return numeric_atom450 = null;

        PLSQLParser.boolean_atom_return boolean_atom451 = null;

        PLSQLParser.expression_return expression454 = null;


        Object PERCENT444_tree=null;
        Object SQL446_tree=null;
        Object PERCENT447_tree=null;
        Object NULL452_tree=null;
        Object LPAREN453_tree=null;
        Object RPAREN455_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(500, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:501:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt136=7;
            try { dbg.enterDecision(136);

            try {
                isCyclicDecision = true;
                alt136 = dfa136.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(136);}

            switch (alt136) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:501:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(501,7);
                    pushFollow(FOLLOW_variable_or_function_call_in_atom3545);
                    variable_or_function_call443=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call443.getTree());
                    dbg.location(501,33);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:501:33: ( PERCENT attribute )?
                    int alt135=2;
                    try { dbg.enterSubRule(135);
                    try { dbg.enterDecision(135);

                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==PERCENT) ) {
                        alt135=1;
                    }
                    } finally {dbg.exitDecision(135);}

                    switch (alt135) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:501:35: PERCENT attribute
                            {
                            dbg.location(501,35);
                            PERCENT444=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3549); 
                            PERCENT444_tree = (Object)adaptor.create(PERCENT444);
                            adaptor.addChild(root_0, PERCENT444_tree);

                            dbg.location(501,43);
                            pushFollow(FOLLOW_attribute_in_atom3551);
                            attribute445=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute445.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(135);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:502:7: SQL PERCENT attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(502,7);
                    SQL446=(Token)match(input,SQL,FOLLOW_SQL_in_atom3562); 
                    SQL446_tree = (Object)adaptor.create(SQL446);
                    adaptor.addChild(root_0, SQL446_tree);

                    dbg.location(502,11);
                    PERCENT447=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3564); 
                    PERCENT447_tree = (Object)adaptor.create(PERCENT447);
                    adaptor.addChild(root_0, PERCENT447_tree);

                    dbg.location(502,19);
                    pushFollow(FOLLOW_attribute_in_atom3566);
                    attribute448=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute448.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:503:7: string_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(503,7);
                    pushFollow(FOLLOW_string_literal_in_atom3574);
                    string_literal449=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal449.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:504:7: numeric_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(504,7);
                    pushFollow(FOLLOW_numeric_atom_in_atom3582);
                    numeric_atom450=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom450.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:505:7: boolean_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(505,7);
                    pushFollow(FOLLOW_boolean_atom_in_atom3590);
                    boolean_atom451=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom451.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:506:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(506,7);
                    NULL452=(Token)match(input,NULL,FOLLOW_NULL_in_atom3598); 
                    NULL452_tree = (Object)adaptor.create(NULL452);
                    adaptor.addChild(root_0, NULL452_tree);


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:507:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(507,7);
                    LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3606); 
                    LPAREN453_tree = (Object)adaptor.create(LPAREN453);
                    adaptor.addChild(root_0, LPAREN453_tree);

                    dbg.location(507,14);
                    pushFollow(FOLLOW_expression_in_atom3608);
                    expression454=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression454.getTree());
                    dbg.location(507,25);
                    RPAREN455=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3610); 
                    RPAREN455_tree = (Object)adaptor.create(RPAREN455);
                    adaptor.addChild(root_0, RPAREN455_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(508, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    public static class variable_or_function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_function_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:510:1: variable_or_function_call : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQLParser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQLParser.variable_or_function_call_return retval = new PLSQLParser.variable_or_function_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT457=null;
        Token DOT459=null;
        PLSQLParser.call_return call456 = null;

        PLSQLParser.call_return call458 = null;

        PLSQLParser.delete_call_return delete_call460 = null;


        Object DOT457_tree=null;
        Object DOT459_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_or_function_call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(510, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:5: ( call ( DOT call )* ( DOT delete_call )? )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:7: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(511,7);
            pushFollow(FOLLOW_call_in_variable_or_function_call3631);
            call456=call();

            state._fsp--;

            adaptor.addChild(root_0, call456.getTree());
            dbg.location(511,12);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:12: ( DOT call )*
            try { dbg.enterSubRule(137);

            loop137:
            do {
                int alt137=2;
                try { dbg.enterDecision(137);

                int LA137_0 = input.LA(1);

                if ( (LA137_0==DOT) ) {
                    int LA137_1 = input.LA(2);

                    if ( (LA137_1==ID||LA137_1==COLON) ) {
                        alt137=1;
                    }


                }


                } finally {dbg.exitDecision(137);}

                switch (alt137) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:14: DOT call
            	    {
            	    dbg.location(511,14);
            	    DOT457=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3635); 
            	    DOT457_tree = (Object)adaptor.create(DOT457);
            	    adaptor.addChild(root_0, DOT457_tree);

            	    dbg.location(511,18);
            	    pushFollow(FOLLOW_call_in_variable_or_function_call3637);
            	    call458=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call458.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);
            } finally {dbg.exitSubRule(137);}

            dbg.location(511,26);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:26: ( DOT delete_call )?
            int alt138=2;
            try { dbg.enterSubRule(138);
            try { dbg.enterDecision(138);

            int LA138_0 = input.LA(1);

            if ( (LA138_0==DOT) ) {
                alt138=1;
            }
            } finally {dbg.exitDecision(138);}

            switch (alt138) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:28: DOT delete_call
                    {
                    dbg.location(511,28);
                    DOT459=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3644); 
                    DOT459_tree = (Object)adaptor.create(DOT459);
                    adaptor.addChild(root_0, DOT459_tree);

                    dbg.location(511,32);
                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call3646);
                    delete_call460=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call460.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(138);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(512, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_or_function_call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable_or_function_call"

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:514:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQLParser.attribute_return attribute() throws RecognitionException {
        PLSQLParser.attribute_return retval = new PLSQLParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK_ROWCOUNT461=null;
        Token LPAREN462=null;
        Token RPAREN464=null;
        Token ISOPEN466=null;
        Token NOTFOUND467=null;
        PLSQLParser.expression_return expression463 = null;

        PLSQLParser.kFOUND_return kFOUND465 = null;

        PLSQLParser.kROWCOUNT_return kROWCOUNT468 = null;


        Object BULK_ROWCOUNT461_tree=null;
        Object LPAREN462_tree=null;
        Object RPAREN464_tree=null;
        Object ISOPEN466_tree=null;
        Object NOTFOUND467_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(514, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:515:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
            int alt139=5;
            try { dbg.enterDecision(139);

            switch ( input.LA(1) ) {
            case BULK_ROWCOUNT:
                {
                alt139=1;
                }
                break;
            case ID:
                {
                int LA139_2 = input.LA(2);

                if ( (evalPredicate(input.LT(1).getText().equalsIgnoreCase("found"),"input.LT(1).getText().equalsIgnoreCase(\"found\")")) ) {
                    alt139=2;
                }
                else if ( (evalPredicate(input.LT(1).getText().equalsIgnoreCase("rowcount"),"input.LT(1).getText().equalsIgnoreCase(\"rowcount\")")) ) {
                    alt139=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ISOPEN:
                {
                alt139=3;
                }
                break;
            case NOTFOUND:
                {
                alt139=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(139);}

            switch (alt139) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:515:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(515,7);
                    BULK_ROWCOUNT461=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute3666); 
                    BULK_ROWCOUNT461_tree = (Object)adaptor.create(BULK_ROWCOUNT461);
                    adaptor.addChild(root_0, BULK_ROWCOUNT461_tree);

                    dbg.location(515,21);
                    LPAREN462=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute3668); 
                    LPAREN462_tree = (Object)adaptor.create(LPAREN462);
                    adaptor.addChild(root_0, LPAREN462_tree);

                    dbg.location(515,28);
                    pushFollow(FOLLOW_expression_in_attribute3670);
                    expression463=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression463.getTree());
                    dbg.location(515,39);
                    RPAREN464=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute3672); 
                    RPAREN464_tree = (Object)adaptor.create(RPAREN464);
                    adaptor.addChild(root_0, RPAREN464_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:516:7: kFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(516,7);
                    pushFollow(FOLLOW_kFOUND_in_attribute3680);
                    kFOUND465=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND465.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:517:7: ISOPEN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(517,7);
                    ISOPEN466=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute3688); 
                    ISOPEN466_tree = (Object)adaptor.create(ISOPEN466);
                    adaptor.addChild(root_0, ISOPEN466_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:518:7: NOTFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(518,7);
                    NOTFOUND467=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute3696); 
                    NOTFOUND467_tree = (Object)adaptor.create(NOTFOUND467);
                    adaptor.addChild(root_0, NOTFOUND467_tree);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:519:7: kROWCOUNT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(519,7);
                    pushFollow(FOLLOW_kROWCOUNT_in_attribute3704);
                    kROWCOUNT468=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT468.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(520, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attribute"

    public static class call_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_args"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:522:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQLParser.call_args_return call_args() throws RecognitionException {
        PLSQLParser.call_args_return retval = new PLSQLParser.call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN469=null;
        Token COMMA471=null;
        Token RPAREN473=null;
        PLSQLParser.parameter_return parameter470 = null;

        PLSQLParser.parameter_return parameter472 = null;


        Object LPAREN469_tree=null;
        Object COMMA471_tree=null;
        Object RPAREN473_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "call_args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(522, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(523,7);
            LPAREN469=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args3721); 
            LPAREN469_tree = (Object)adaptor.create(LPAREN469);
            adaptor.addChild(root_0, LPAREN469_tree);

            dbg.location(523,14);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:14: ( parameter ( COMMA parameter )* )?
            int alt141=2;
            try { dbg.enterSubRule(141);
            try { dbg.enterDecision(141);

            int LA141_0 = input.LA(1);

            if ( (LA141_0==ID||LA141_0==LPAREN||(LA141_0>=NOT && LA141_0<=NULL)||LA141_0==COLON||(LA141_0>=MINUS && LA141_0<=PLUS)||LA141_0==SQL||(LA141_0>=INTEGER && LA141_0<=QUOTED_STRING)||(LA141_0>=INSERTING && LA141_0<=DELETING)) ) {
                alt141=1;
            }
            } finally {dbg.exitDecision(141);}

            switch (alt141) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:16: parameter ( COMMA parameter )*
                    {
                    dbg.location(523,16);
                    pushFollow(FOLLOW_parameter_in_call_args3725);
                    parameter470=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter470.getTree());
                    dbg.location(523,26);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:26: ( COMMA parameter )*
                    try { dbg.enterSubRule(140);

                    loop140:
                    do {
                        int alt140=2;
                        try { dbg.enterDecision(140);

                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==COMMA) ) {
                            alt140=1;
                        }


                        } finally {dbg.exitDecision(140);}

                        switch (alt140) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:28: COMMA parameter
                    	    {
                    	    dbg.location(523,28);
                    	    COMMA471=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args3729); 
                    	    COMMA471_tree = (Object)adaptor.create(COMMA471);
                    	    adaptor.addChild(root_0, COMMA471_tree);

                    	    dbg.location(523,34);
                    	    pushFollow(FOLLOW_parameter_in_call_args3731);
                    	    parameter472=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter472.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(140);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(141);}

            dbg.location(523,50);
            RPAREN473=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args3739); 
            RPAREN473_tree = (Object)adaptor.create(RPAREN473);
            adaptor.addChild(root_0, RPAREN473_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(524, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call_args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "call_args"

    public static class boolean_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:526:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQLParser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQLParser.boolean_atom_return retval = new PLSQLParser.boolean_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.boolean_literal_return boolean_literal474 = null;

        PLSQLParser.collection_exists_return collection_exists475 = null;

        PLSQLParser.conditional_predicate_return conditional_predicate476 = null;



        try { dbg.enterRule(getGrammarFileName(), "boolean_atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(526, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:527:5: ( boolean_literal | collection_exists | conditional_predicate )
            int alt142=3;
            try { dbg.enterDecision(142);

            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt142=1;
                }
                break;
            case ID:
                {
                alt142=2;
                }
                break;
            case INSERTING:
            case UPDATING:
            case DELETING:
                {
                alt142=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(142);}

            switch (alt142) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:527:7: boolean_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(527,7);
                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom3756);
                    boolean_literal474=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal474.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:528:7: collection_exists
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(528,7);
                    pushFollow(FOLLOW_collection_exists_in_boolean_atom3764);
                    collection_exists475=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists475.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:529:7: conditional_predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(529,7);
                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom3772);
                    conditional_predicate476=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate476.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(530, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boolean_atom"

    public static class numeric_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:532:1: numeric_atom : numeric_literal ;
    public final PLSQLParser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQLParser.numeric_atom_return retval = new PLSQLParser.numeric_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.numeric_literal_return numeric_literal477 = null;



        try { dbg.enterRule(getGrammarFileName(), "numeric_atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(532, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:533:5: ( numeric_literal )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:533:7: numeric_literal
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(533,7);
            pushFollow(FOLLOW_numeric_literal_in_numeric_atom3789);
            numeric_literal477=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal477.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(534, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numeric_atom"

    public static class numeric_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:536:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQLParser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQLParser.numeric_literal_return retval = new PLSQLParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set478=null;

        Object set478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "numeric_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(536, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:537:5: ( INTEGER | REAL_NUMBER )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(537,5);
            set478=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set478));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(539, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numeric_literal"

    public static class boolean_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:541:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQLParser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQLParser.boolean_literal_return retval = new PLSQLParser.boolean_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set479=null;

        Object set479_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "boolean_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(541, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:542:5: ( TRUE | FALSE )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(542,5);
            set479=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set479));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(544, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:546:1: string_literal : QUOTED_STRING ;
    public final PLSQLParser.string_literal_return string_literal() throws RecognitionException {
        PLSQLParser.string_literal_return retval = new PLSQLParser.string_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTED_STRING480=null;

        Object QUOTED_STRING480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(546, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:547:5: ( QUOTED_STRING )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:547:7: QUOTED_STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(547,7);
            QUOTED_STRING480=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal3856); 
            QUOTED_STRING480_tree = (Object)adaptor.create(QUOTED_STRING480);
            adaptor.addChild(root_0, QUOTED_STRING480_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(548, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "string_literal"

    public static class collection_exists_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_exists"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:550:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQLParser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQLParser.collection_exists_return retval = new PLSQLParser.collection_exists_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID481=null;
        Token DOT482=null;
        Token EXISTS483=null;
        Token LPAREN484=null;
        Token RPAREN486=null;
        PLSQLParser.expression_return expression485 = null;


        Object ID481_tree=null;
        Object DOT482_tree=null;
        Object EXISTS483_tree=null;
        Object LPAREN484_tree=null;
        Object RPAREN486_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "collection_exists");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(550, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:551:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:551:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(551,7);
            ID481=(Token)match(input,ID,FOLLOW_ID_in_collection_exists3873); 
            ID481_tree = (Object)adaptor.create(ID481);
            adaptor.addChild(root_0, ID481_tree);

            dbg.location(551,10);
            DOT482=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists3875); 
            DOT482_tree = (Object)adaptor.create(DOT482);
            adaptor.addChild(root_0, DOT482_tree);

            dbg.location(551,14);
            EXISTS483=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists3877); 
            EXISTS483_tree = (Object)adaptor.create(EXISTS483);
            adaptor.addChild(root_0, EXISTS483_tree);

            dbg.location(551,21);
            LPAREN484=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists3879); 
            LPAREN484_tree = (Object)adaptor.create(LPAREN484);
            adaptor.addChild(root_0, LPAREN484_tree);

            dbg.location(551,28);
            pushFollow(FOLLOW_expression_in_collection_exists3881);
            expression485=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression485.getTree());
            dbg.location(551,39);
            RPAREN486=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists3883); 
            RPAREN486_tree = (Object)adaptor.create(RPAREN486);
            adaptor.addChild(root_0, RPAREN486_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(552, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "collection_exists");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "collection_exists"

    public static class conditional_predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_predicate"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:554:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQLParser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQLParser.conditional_predicate_return retval = new PLSQLParser.conditional_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERTING487=null;
        Token UPDATING488=null;
        Token LPAREN489=null;
        Token QUOTED_STRING490=null;
        Token RPAREN491=null;
        Token DELETING492=null;

        Object INSERTING487_tree=null;
        Object UPDATING488_tree=null;
        Object LPAREN489_tree=null;
        Object QUOTED_STRING490_tree=null;
        Object RPAREN491_tree=null;
        Object DELETING492_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(554, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:555:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
            int alt144=3;
            try { dbg.enterDecision(144);

            switch ( input.LA(1) ) {
            case INSERTING:
                {
                alt144=1;
                }
                break;
            case UPDATING:
                {
                alt144=2;
                }
                break;
            case DELETING:
                {
                alt144=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(144);}

            switch (alt144) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:555:7: INSERTING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(555,7);
                    INSERTING487=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate3900); 
                    INSERTING487_tree = (Object)adaptor.create(INSERTING487);
                    adaptor.addChild(root_0, INSERTING487_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:556:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(556,7);
                    UPDATING488=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate3908); 
                    UPDATING488_tree = (Object)adaptor.create(UPDATING488);
                    adaptor.addChild(root_0, UPDATING488_tree);

                    dbg.location(556,16);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:556:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt143=2;
                    try { dbg.enterSubRule(143);
                    try { dbg.enterDecision(143);

                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==LPAREN) ) {
                        alt143=1;
                    }
                    } finally {dbg.exitDecision(143);}

                    switch (alt143) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:556:18: LPAREN QUOTED_STRING RPAREN
                            {
                            dbg.location(556,18);
                            LPAREN489=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate3912); 
                            LPAREN489_tree = (Object)adaptor.create(LPAREN489);
                            adaptor.addChild(root_0, LPAREN489_tree);

                            dbg.location(556,25);
                            QUOTED_STRING490=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate3914); 
                            QUOTED_STRING490_tree = (Object)adaptor.create(QUOTED_STRING490);
                            adaptor.addChild(root_0, QUOTED_STRING490_tree);

                            dbg.location(556,39);
                            RPAREN491=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate3916); 
                            RPAREN491_tree = (Object)adaptor.create(RPAREN491);
                            adaptor.addChild(root_0, RPAREN491_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(143);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:557:7: DELETING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(557,7);
                    DELETING492=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate3927); 
                    DELETING492_tree = (Object)adaptor.create(DELETING492);
                    adaptor.addChild(root_0, DELETING492_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(558, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditional_predicate"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:560:1: parameter : ( ID ARROW )? expression ;
    public final PLSQLParser.parameter_return parameter() throws RecognitionException {
        PLSQLParser.parameter_return retval = new PLSQLParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID493=null;
        Token ARROW494=null;
        PLSQLParser.expression_return expression495 = null;


        Object ID493_tree=null;
        Object ARROW494_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(560, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:561:5: ( ( ID ARROW )? expression )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:561:7: ( ID ARROW )? expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(561,7);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:561:7: ( ID ARROW )?
            int alt145=2;
            try { dbg.enterSubRule(145);
            try { dbg.enterDecision(145);

            int LA145_0 = input.LA(1);

            if ( (LA145_0==ID) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==ARROW) ) {
                    alt145=1;
                }
            }
            } finally {dbg.exitDecision(145);}

            switch (alt145) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:561:9: ID ARROW
                    {
                    dbg.location(561,9);
                    ID493=(Token)match(input,ID,FOLLOW_ID_in_parameter3946); 
                    ID493_tree = (Object)adaptor.create(ID493);
                    adaptor.addChild(root_0, ID493_tree);

                    dbg.location(561,12);
                    ARROW494=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter3948); 
                    ARROW494_tree = (Object)adaptor.create(ARROW494);
                    adaptor.addChild(root_0, ARROW494_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(145);}

            dbg.location(561,21);
            pushFollow(FOLLOW_expression_in_parameter3953);
            expression495=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression495.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(562, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameter"

    public static class index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:564:1: index : expression ;
    public final PLSQLParser.index_return index() throws RecognitionException {
        PLSQLParser.index_return retval = new PLSQLParser.index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLParser.expression_return expression496 = null;



        try { dbg.enterRule(getGrammarFileName(), "index");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(564, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:565:5: ( expression )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:565:7: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(565,7);
            pushFollow(FOLLOW_expression_in_index3970);
            expression496=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression496.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(566, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "index");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "index"

    public static class create_package_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:1: create_package : CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI ;
    public final PLSQLParser.create_package_return create_package() throws RecognitionException {
        PLSQLParser.create_package_return retval = new PLSQLParser.create_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token CREATE497=null;
        Token OR498=null;
        Token PACKAGE500=null;
        Token DOT501=null;
        Token set503=null;
        Token END505=null;
        Token ID506=null;
        Token SEMI507=null;
        PLSQLParser.kREPLACE_return kREPLACE499 = null;

        PLSQLParser.invoker_rights_clause_return invoker_rights_clause502 = null;

        PLSQLParser.declare_section_return declare_section504 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object CREATE497_tree=null;
        Object OR498_tree=null;
        Object PACKAGE500_tree=null;
        Object DOT501_tree=null;
        Object set503_tree=null;
        Object END505_tree=null;
        Object ID506_tree=null;
        Object SEMI507_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "create_package");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(568, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:16: ( CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:569:9: CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(569,9);
            CREATE497=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package3991); 
            CREATE497_tree = (Object)adaptor.create(CREATE497);
            adaptor.addChild(root_0, CREATE497_tree);

            dbg.location(569,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:569:16: ( OR kREPLACE )?
            int alt146=2;
            try { dbg.enterSubRule(146);
            try { dbg.enterDecision(146);

            int LA146_0 = input.LA(1);

            if ( (LA146_0==OR) ) {
                alt146=1;
            }
            } finally {dbg.exitDecision(146);}

            switch (alt146) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:569:18: OR kREPLACE
                    {
                    dbg.location(569,18);
                    OR498=(Token)match(input,OR,FOLLOW_OR_in_create_package3995); 
                    OR498_tree = (Object)adaptor.create(OR498);
                    adaptor.addChild(root_0, OR498_tree);

                    dbg.location(569,21);
                    pushFollow(FOLLOW_kREPLACE_in_create_package3997);
                    kREPLACE499=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE499.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(146);}

            dbg.location(569,33);
            PACKAGE500=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package4002); 
            PACKAGE500_tree = (Object)adaptor.create(PACKAGE500);
            adaptor.addChild(root_0, PACKAGE500_tree);

            dbg.location(569,41);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:569:41: (schema_name= ID DOT )?
            int alt147=2;
            try { dbg.enterSubRule(147);
            try { dbg.enterDecision(147);

            int LA147_0 = input.LA(1);

            if ( (LA147_0==ID) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==DOT) ) {
                    alt147=1;
                }
            }
            } finally {dbg.exitDecision(147);}

            switch (alt147) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:569:43: schema_name= ID DOT
                    {
                    dbg.location(569,54);
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4008); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    dbg.location(569,58);
                    DOT501=(Token)match(input,DOT,FOLLOW_DOT_in_create_package4010); 
                    DOT501_tree = (Object)adaptor.create(DOT501);
                    adaptor.addChild(root_0, DOT501_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(147);}

            dbg.location(569,77);
            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4017); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            dbg.location(570,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:570:9: ( invoker_rights_clause )?
            int alt148=2;
            try { dbg.enterSubRule(148);
            try { dbg.enterDecision(148);

            int LA148_0 = input.LA(1);

            if ( (LA148_0==AUTHID) ) {
                alt148=1;
            }
            } finally {dbg.exitDecision(148);}

            switch (alt148) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:570:11: invoker_rights_clause
                    {
                    dbg.location(570,11);
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4029);
                    invoker_rights_clause502=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause502.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(148);}

            dbg.location(571,9);
            set503=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set503));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(571,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:21: ( declare_section )?
            int alt149=2;
            try { dbg.enterSubRule(149);
            try { dbg.enterDecision(149);

            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=PROCEDURE && LA149_0<=FUNCTION)||LA149_0==CURSOR||LA149_0==SUBTYPE||LA149_0==PRAGMA) ) {
                alt149=1;
            }
            } finally {dbg.exitDecision(149);}

            switch (alt149) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:23: declare_section
                    {
                    dbg.location(571,23);
                    pushFollow(FOLLOW_declare_section_in_create_package4054);
                    declare_section504=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section504.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(149);}

            dbg.location(571,42);
            END505=(Token)match(input,END,FOLLOW_END_in_create_package4059); 
            END505_tree = (Object)adaptor.create(END505);
            adaptor.addChild(root_0, END505_tree);

            dbg.location(571,46);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:46: ( ID )?
            int alt150=2;
            try { dbg.enterSubRule(150);
            try { dbg.enterDecision(150);

            int LA150_0 = input.LA(1);

            if ( (LA150_0==ID) ) {
                alt150=1;
            }
            } finally {dbg.exitDecision(150);}

            switch (alt150) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:48: ID
                    {
                    dbg.location(571,48);
                    ID506=(Token)match(input,ID,FOLLOW_ID_in_create_package4063); 
                    ID506_tree = (Object)adaptor.create(ID506);
                    adaptor.addChild(root_0, ID506_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(150);}

            dbg.location(571,54);
            SEMI507=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4068); 
            SEMI507_tree = (Object)adaptor.create(SEMI507);
            adaptor.addChild(root_0, SEMI507_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(572, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "create_package");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "create_package"

    public static class create_package_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package_body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLParser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQLParser.create_package_body_return retval = new PLSQLParser.create_package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token package_name2=null;
        Token CREATE508=null;
        Token OR509=null;
        Token PACKAGE511=null;
        Token BODY512=null;
        Token DOT513=null;
        Token set514=null;
        Token END516=null;
        Token SEMI517=null;
        PLSQLParser.body_return initialize_section = null;

        PLSQLParser.kREPLACE_return kREPLACE510 = null;

        PLSQLParser.declare_section_return declare_section515 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object package_name2_tree=null;
        Object CREATE508_tree=null;
        Object OR509_tree=null;
        Object PACKAGE511_tree=null;
        Object BODY512_tree=null;
        Object DOT513_tree=null;
        Object set514_tree=null;
        Object END516_tree=null;
        Object SEMI517_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "create_package_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(574, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:575:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(575,9);
            CREATE508=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4089); 
            CREATE508_tree = (Object)adaptor.create(CREATE508);
            adaptor.addChild(root_0, CREATE508_tree);

            dbg.location(575,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:575:16: ( OR kREPLACE )?
            int alt151=2;
            try { dbg.enterSubRule(151);
            try { dbg.enterDecision(151);

            int LA151_0 = input.LA(1);

            if ( (LA151_0==OR) ) {
                alt151=1;
            }
            } finally {dbg.exitDecision(151);}

            switch (alt151) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:575:18: OR kREPLACE
                    {
                    dbg.location(575,18);
                    OR509=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4093); 
                    OR509_tree = (Object)adaptor.create(OR509);
                    adaptor.addChild(root_0, OR509_tree);

                    dbg.location(575,21);
                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4095);
                    kREPLACE510=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE510.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(151);}

            dbg.location(575,33);
            PACKAGE511=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4100); 
            PACKAGE511_tree = (Object)adaptor.create(PACKAGE511);
            adaptor.addChild(root_0, PACKAGE511_tree);

            dbg.location(575,41);
            BODY512=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4102); 
            BODY512_tree = (Object)adaptor.create(BODY512);
            adaptor.addChild(root_0, BODY512_tree);

            dbg.location(575,46);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:575:46: (schema_name= ID DOT )?
            int alt152=2;
            try { dbg.enterSubRule(152);
            try { dbg.enterDecision(152);

            int LA152_0 = input.LA(1);

            if ( (LA152_0==ID) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==DOT) ) {
                    alt152=1;
                }
            }
            } finally {dbg.exitDecision(152);}

            switch (alt152) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:575:48: schema_name= ID DOT
                    {
                    dbg.location(575,59);
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4108); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    dbg.location(575,63);
                    DOT513=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4110); 
                    DOT513_tree = (Object)adaptor.create(DOT513);
                    adaptor.addChild(root_0, DOT513_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(152);}

            dbg.location(575,82);
            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4117); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            dbg.location(576,9);
            set514=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set514));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(576,21);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:576:21: ( declare_section )?
            int alt153=2;
            try { dbg.enterSubRule(153);
            try { dbg.enterDecision(153);

            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=PROCEDURE && LA153_0<=FUNCTION)||LA153_0==CURSOR||LA153_0==SUBTYPE||LA153_0==PRAGMA) ) {
                alt153=1;
            }
            } finally {dbg.exitDecision(153);}

            switch (alt153) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:576:23: declare_section
                    {
                    dbg.location(576,23);
                    pushFollow(FOLLOW_declare_section_in_create_package_body4139);
                    declare_section515=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section515.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(153);}

            dbg.location(577,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:577:9: (initialize_section= body | END (package_name2= ID )? )
            int alt155=2;
            try { dbg.enterSubRule(155);
            try { dbg.enterDecision(155);

            int LA155_0 = input.LA(1);

            if ( (LA155_0==BEGIN) ) {
                alt155=1;
            }
            else if ( (LA155_0==END) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(155);}

            switch (alt155) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:577:11: initialize_section= body
                    {
                    dbg.location(577,29);
                    pushFollow(FOLLOW_body_in_create_package_body4156);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:577:37: END (package_name2= ID )?
                    {
                    dbg.location(577,37);
                    END516=(Token)match(input,END,FOLLOW_END_in_create_package_body4160); 
                    END516_tree = (Object)adaptor.create(END516);
                    adaptor.addChild(root_0, END516_tree);

                    dbg.location(577,41);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:577:41: (package_name2= ID )?
                    int alt154=2;
                    try { dbg.enterSubRule(154);
                    try { dbg.enterDecision(154);

                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==ID) ) {
                        alt154=1;
                    }
                    } finally {dbg.exitDecision(154);}

                    switch (alt154) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:577:43: package_name2= ID
                            {
                            dbg.location(577,56);
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4166); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(154);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(155);}

            dbg.location(578,9);
            SEMI517=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4181); 
            SEMI517_tree = (Object)adaptor.create(SEMI517);
            adaptor.addChild(root_0, SEMI517_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(579, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "create_package_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "create_package_body"

    public static class create_procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_procedure"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:581:1: create_procedure : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLParser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQLParser.create_procedure_return retval = new PLSQLParser.create_procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token procedure_name=null;
        Token CREATE518=null;
        Token OR519=null;
        Token PROCEDURE521=null;
        Token DOT522=null;
        Token LPAREN523=null;
        Token COMMA525=null;
        Token RPAREN527=null;
        Token set529=null;
        Token EXTERNAL533=null;
        Token SEMI534=null;
        PLSQLParser.kREPLACE_return kREPLACE520 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration524 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration526 = null;

        PLSQLParser.invoker_rights_clause_return invoker_rights_clause528 = null;

        PLSQLParser.declare_section_return declare_section530 = null;

        PLSQLParser.body_return body531 = null;

        PLSQLParser.call_spec_return call_spec532 = null;


        Object schema_name_tree=null;
        Object procedure_name_tree=null;
        Object CREATE518_tree=null;
        Object OR519_tree=null;
        Object PROCEDURE521_tree=null;
        Object DOT522_tree=null;
        Object LPAREN523_tree=null;
        Object COMMA525_tree=null;
        Object RPAREN527_tree=null;
        Object set529_tree=null;
        Object EXTERNAL533_tree=null;
        Object SEMI534_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "create_procedure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(581, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:581:18: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:582:9: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(582,9);
            CREATE518=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4202); 
            CREATE518_tree = (Object)adaptor.create(CREATE518);
            adaptor.addChild(root_0, CREATE518_tree);

            dbg.location(582,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:582:16: ( OR kREPLACE )?
            int alt156=2;
            try { dbg.enterSubRule(156);
            try { dbg.enterDecision(156);

            int LA156_0 = input.LA(1);

            if ( (LA156_0==OR) ) {
                alt156=1;
            }
            } finally {dbg.exitDecision(156);}

            switch (alt156) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:582:18: OR kREPLACE
                    {
                    dbg.location(582,18);
                    OR519=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4206); 
                    OR519_tree = (Object)adaptor.create(OR519);
                    adaptor.addChild(root_0, OR519_tree);

                    dbg.location(582,21);
                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4208);
                    kREPLACE520=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE520.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(156);}

            dbg.location(582,33);
            PROCEDURE521=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4213); 
            PROCEDURE521_tree = (Object)adaptor.create(PROCEDURE521);
            adaptor.addChild(root_0, PROCEDURE521_tree);

            dbg.location(582,43);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:582:43: (schema_name= ID DOT )?
            int alt157=2;
            try { dbg.enterSubRule(157);
            try { dbg.enterDecision(157);

            int LA157_0 = input.LA(1);

            if ( (LA157_0==ID) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==DOT) ) {
                    alt157=1;
                }
            }
            } finally {dbg.exitDecision(157);}

            switch (alt157) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:582:45: schema_name= ID DOT
                    {
                    dbg.location(582,56);
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4219); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    dbg.location(582,60);
                    DOT522=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4221); 
                    DOT522_tree = (Object)adaptor.create(DOT522);
                    adaptor.addChild(root_0, DOT522_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(157);}

            dbg.location(582,81);
            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4228); 
            procedure_name_tree = (Object)adaptor.create(procedure_name);
            adaptor.addChild(root_0, procedure_name_tree);

            dbg.location(583,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt159=2;
            try { dbg.enterSubRule(159);
            try { dbg.enterDecision(159);

            int LA159_0 = input.LA(1);

            if ( (LA159_0==LPAREN) ) {
                alt159=1;
            }
            } finally {dbg.exitDecision(159);}

            switch (alt159) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    dbg.location(583,11);
                    LPAREN523=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_procedure4240); 
                    LPAREN523_tree = (Object)adaptor.create(LPAREN523);
                    adaptor.addChild(root_0, LPAREN523_tree);

                    dbg.location(583,18);
                    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4242);
                    parameter_declaration524=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration524.getTree());
                    dbg.location(583,40);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:40: ( COMMA parameter_declaration )*
                    try { dbg.enterSubRule(158);

                    loop158:
                    do {
                        int alt158=2;
                        try { dbg.enterDecision(158);

                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==COMMA) ) {
                            alt158=1;
                        }


                        } finally {dbg.exitDecision(158);}

                        switch (alt158) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:42: COMMA parameter_declaration
                    	    {
                    	    dbg.location(583,42);
                    	    COMMA525=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_procedure4246); 
                    	    COMMA525_tree = (Object)adaptor.create(COMMA525);
                    	    adaptor.addChild(root_0, COMMA525_tree);

                    	    dbg.location(583,48);
                    	    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4248);
                    	    parameter_declaration526=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration526.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(158);}

                    dbg.location(583,73);
                    RPAREN527=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_procedure4253); 
                    RPAREN527_tree = (Object)adaptor.create(RPAREN527);
                    adaptor.addChild(root_0, RPAREN527_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(159);}

            dbg.location(584,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:584:9: ( invoker_rights_clause )?
            int alt160=2;
            try { dbg.enterSubRule(160);
            try { dbg.enterDecision(160);

            int LA160_0 = input.LA(1);

            if ( (LA160_0==AUTHID) ) {
                alt160=1;
            }
            } finally {dbg.exitDecision(160);}

            switch (alt160) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:584:9: invoker_rights_clause
                    {
                    dbg.location(584,9);
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4266);
                    invoker_rights_clause528=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause528.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(160);}

            dbg.location(585,9);
            set529=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set529));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(586,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:586:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt162=3;
            try { dbg.enterSubRule(162);
            try { dbg.enterDecision(162);

            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt162=1;
                }
                break;
            case LANGUAGE:
                {
                alt162=2;
                }
                break;
            case EXTERNAL:
                {
                alt162=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(162);}

            switch (alt162) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:586:11: ( declare_section )? body
                    {
                    dbg.location(586,11);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:586:11: ( declare_section )?
                    int alt161=2;
                    try { dbg.enterSubRule(161);
                    try { dbg.enterDecision(161);

                    int LA161_0 = input.LA(1);

                    if ( ((LA161_0>=PROCEDURE && LA161_0<=FUNCTION)||LA161_0==CURSOR||LA161_0==SUBTYPE||LA161_0==PRAGMA) ) {
                        alt161=1;
                    }
                    } finally {dbg.exitDecision(161);}

                    switch (alt161) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:586:11: declare_section
                            {
                            dbg.location(586,11);
                            pushFollow(FOLLOW_declare_section_in_create_procedure4297);
                            declare_section530=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section530.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(161);}

                    dbg.location(586,28);
                    pushFollow(FOLLOW_body_in_create_procedure4300);
                    body531=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body531.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:587:11: call_spec
                    {
                    dbg.location(587,11);
                    pushFollow(FOLLOW_call_spec_in_create_procedure4312);
                    call_spec532=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec532.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:588:11: EXTERNAL
                    {
                    dbg.location(588,11);
                    EXTERNAL533=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure4324); 
                    EXTERNAL533_tree = (Object)adaptor.create(EXTERNAL533);
                    adaptor.addChild(root_0, EXTERNAL533_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(162);}

            dbg.location(589,11);
            SEMI534=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure4336); 
            SEMI534_tree = (Object)adaptor.create(SEMI534);
            adaptor.addChild(root_0, SEMI534_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(590, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "create_procedure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "create_procedure"

    public static class create_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_function"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:592:1: create_function : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLParser.create_function_return create_function() throws RecognitionException {
        PLSQLParser.create_function_return retval = new PLSQLParser.create_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token function_name=null;
        Token CREATE535=null;
        Token OR536=null;
        Token FUNCTION538=null;
        Token DOT539=null;
        Token LPAREN540=null;
        Token COMMA542=null;
        Token RPAREN544=null;
        Token RETURN545=null;
        Token set548=null;
        Token EXTERNAL552=null;
        Token SEMI553=null;
        PLSQLParser.kREPLACE_return kREPLACE537 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration541 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration543 = null;

        PLSQLParser.datatype_return datatype546 = null;

        PLSQLParser.invoker_rights_clause_return invoker_rights_clause547 = null;

        PLSQLParser.declare_section_return declare_section549 = null;

        PLSQLParser.body_return body550 = null;

        PLSQLParser.call_spec_return call_spec551 = null;


        Object schema_name_tree=null;
        Object function_name_tree=null;
        Object CREATE535_tree=null;
        Object OR536_tree=null;
        Object FUNCTION538_tree=null;
        Object DOT539_tree=null;
        Object LPAREN540_tree=null;
        Object COMMA542_tree=null;
        Object RPAREN544_tree=null;
        Object RETURN545_tree=null;
        Object set548_tree=null;
        Object EXTERNAL552_tree=null;
        Object SEMI553_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "create_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(592, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:592:17: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:9: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(593,9);
            CREATE535=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function4357); 
            CREATE535_tree = (Object)adaptor.create(CREATE535);
            adaptor.addChild(root_0, CREATE535_tree);

            dbg.location(593,16);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:16: ( OR kREPLACE )?
            int alt163=2;
            try { dbg.enterSubRule(163);
            try { dbg.enterDecision(163);

            int LA163_0 = input.LA(1);

            if ( (LA163_0==OR) ) {
                alt163=1;
            }
            } finally {dbg.exitDecision(163);}

            switch (alt163) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:18: OR kREPLACE
                    {
                    dbg.location(593,18);
                    OR536=(Token)match(input,OR,FOLLOW_OR_in_create_function4361); 
                    OR536_tree = (Object)adaptor.create(OR536);
                    adaptor.addChild(root_0, OR536_tree);

                    dbg.location(593,21);
                    pushFollow(FOLLOW_kREPLACE_in_create_function4363);
                    kREPLACE537=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE537.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(163);}

            dbg.location(593,33);
            FUNCTION538=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function4368); 
            FUNCTION538_tree = (Object)adaptor.create(FUNCTION538);
            adaptor.addChild(root_0, FUNCTION538_tree);

            dbg.location(593,42);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:42: (schema_name= ID DOT )?
            int alt164=2;
            try { dbg.enterSubRule(164);
            try { dbg.enterDecision(164);

            int LA164_0 = input.LA(1);

            if ( (LA164_0==ID) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==DOT) ) {
                    alt164=1;
                }
            }
            } finally {dbg.exitDecision(164);}

            switch (alt164) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:44: schema_name= ID DOT
                    {
                    dbg.location(593,55);
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4374); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    dbg.location(593,59);
                    DOT539=(Token)match(input,DOT,FOLLOW_DOT_in_create_function4376); 
                    DOT539_tree = (Object)adaptor.create(DOT539);
                    adaptor.addChild(root_0, DOT539_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(164);}

            dbg.location(593,79);
            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4383); 
            function_name_tree = (Object)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);

            dbg.location(594,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:594:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt166=2;
            try { dbg.enterSubRule(166);
            try { dbg.enterDecision(166);

            int LA166_0 = input.LA(1);

            if ( (LA166_0==LPAREN) ) {
                alt166=1;
            }
            } finally {dbg.exitDecision(166);}

            switch (alt166) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:594:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    dbg.location(594,11);
                    LPAREN540=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_function4395); 
                    LPAREN540_tree = (Object)adaptor.create(LPAREN540);
                    adaptor.addChild(root_0, LPAREN540_tree);

                    dbg.location(594,18);
                    pushFollow(FOLLOW_parameter_declaration_in_create_function4397);
                    parameter_declaration541=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration541.getTree());
                    dbg.location(594,40);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:594:40: ( COMMA parameter_declaration )*
                    try { dbg.enterSubRule(165);

                    loop165:
                    do {
                        int alt165=2;
                        try { dbg.enterDecision(165);

                        int LA165_0 = input.LA(1);

                        if ( (LA165_0==COMMA) ) {
                            alt165=1;
                        }


                        } finally {dbg.exitDecision(165);}

                        switch (alt165) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:594:42: COMMA parameter_declaration
                    	    {
                    	    dbg.location(594,42);
                    	    COMMA542=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_function4401); 
                    	    COMMA542_tree = (Object)adaptor.create(COMMA542);
                    	    adaptor.addChild(root_0, COMMA542_tree);

                    	    dbg.location(594,48);
                    	    pushFollow(FOLLOW_parameter_declaration_in_create_function4403);
                    	    parameter_declaration543=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration543.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop165;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(165);}

                    dbg.location(594,73);
                    RPAREN544=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_function4408); 
                    RPAREN544_tree = (Object)adaptor.create(RPAREN544);
                    adaptor.addChild(root_0, RPAREN544_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(166);}

            dbg.location(595,9);
            RETURN545=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function4421); 
            RETURN545_tree = (Object)adaptor.create(RETURN545);
            adaptor.addChild(root_0, RETURN545_tree);

            dbg.location(595,16);
            pushFollow(FOLLOW_datatype_in_create_function4423);
            datatype546=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype546.getTree());
            dbg.location(596,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:596:9: ( invoker_rights_clause )?
            int alt167=2;
            try { dbg.enterSubRule(167);
            try { dbg.enterDecision(167);

            int LA167_0 = input.LA(1);

            if ( (LA167_0==AUTHID) ) {
                alt167=1;
            }
            } finally {dbg.exitDecision(167);}

            switch (alt167) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:596:9: invoker_rights_clause
                    {
                    dbg.location(596,9);
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function4433);
                    invoker_rights_clause547=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause547.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(167);}

            dbg.location(597,9);
            set548=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set548));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(598,9);
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:598:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt169=3;
            try { dbg.enterSubRule(169);
            try { dbg.enterDecision(169);

            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt169=1;
                }
                break;
            case LANGUAGE:
                {
                alt169=2;
                }
                break;
            case EXTERNAL:
                {
                alt169=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(169);}

            switch (alt169) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:598:11: ( declare_section )? body
                    {
                    dbg.location(598,11);
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:598:11: ( declare_section )?
                    int alt168=2;
                    try { dbg.enterSubRule(168);
                    try { dbg.enterDecision(168);

                    int LA168_0 = input.LA(1);

                    if ( ((LA168_0>=PROCEDURE && LA168_0<=FUNCTION)||LA168_0==CURSOR||LA168_0==SUBTYPE||LA168_0==PRAGMA) ) {
                        alt168=1;
                    }
                    } finally {dbg.exitDecision(168);}

                    switch (alt168) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:598:11: declare_section
                            {
                            dbg.location(598,11);
                            pushFollow(FOLLOW_declare_section_in_create_function4464);
                            declare_section549=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section549.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(168);}

                    dbg.location(598,28);
                    pushFollow(FOLLOW_body_in_create_function4467);
                    body550=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body550.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:599:11: call_spec
                    {
                    dbg.location(599,11);
                    pushFollow(FOLLOW_call_spec_in_create_function4479);
                    call_spec551=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec551.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:600:11: EXTERNAL
                    {
                    dbg.location(600,11);
                    EXTERNAL552=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function4491); 
                    EXTERNAL552_tree = (Object)adaptor.create(EXTERNAL552);
                    adaptor.addChild(root_0, EXTERNAL552_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(169);}

            dbg.location(601,11);
            SEMI553=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function4503); 
            SEMI553_tree = (Object)adaptor.create(SEMI553);
            adaptor.addChild(root_0, SEMI553_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(602, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "create_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "create_function"

    public static class invoker_rights_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoker_rights_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:604:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQLParser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQLParser.invoker_rights_clause_return retval = new PLSQLParser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AUTHID554=null;
        Token set555=null;

        Object AUTHID554_tree=null;
        Object set555_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invoker_rights_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(604, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:604:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:605:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(605,9);
            AUTHID554=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause4524); 
            AUTHID554_tree = (Object)adaptor.create(AUTHID554);
            adaptor.addChild(root_0, AUTHID554_tree);

            dbg.location(605,16);
            set555=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set555));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(606, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "invoker_rights_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "invoker_rights_clause"

    public static class call_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_spec"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:608:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQLParser.call_spec_return call_spec() throws RecognitionException {
        PLSQLParser.call_spec_return retval = new PLSQLParser.call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGUAGE556=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi557 = null;


        Object LANGUAGE556_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "call_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(608, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:609:5: ( LANGUAGE swallow_to_semi )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:609:7: LANGUAGE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(609,7);
            LANGUAGE556=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec4551); 
            LANGUAGE556_tree = (Object)adaptor.create(LANGUAGE556);
            adaptor.addChild(root_0, LANGUAGE556_tree);

            dbg.location(609,16);
            pushFollow(FOLLOW_swallow_to_semi_in_call_spec4553);
            swallow_to_semi557=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi557.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(610, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "call_spec"

    public static class kERRORS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kERRORS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:1: kERRORS : {...}? ID ;
    public final PLSQLParser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQLParser.kERRORS_return retval = new PLSQLParser.kERRORS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID558=null;

        Object ID558_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kERRORS");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(612, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:9: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(612,11);
            if ( !(evalPredicate(input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()),"input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())")) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            dbg.location(612,110);
            ID558=(Token)match(input,ID,FOLLOW_ID_in_kERRORS4568); 
            ID558_tree = (Object)adaptor.create(ID558);
            adaptor.addChild(root_0, ID558_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(612, 112);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kERRORS");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kERRORS"

    public static class kEXCEPTIONS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kEXCEPTIONS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQLParser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQLParser.kEXCEPTIONS_return retval = new PLSQLParser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID559=null;

        Object ID559_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kEXCEPTIONS");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(613, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:13: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:15: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(613,15);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("exceptions"),"input.LT(1).getText().equalsIgnoreCase(\"exceptions\")")) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            dbg.location(613,71);
            ID559=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS4577); 
            ID559_tree = (Object)adaptor.create(ID559);
            adaptor.addChild(root_0, ID559_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(613, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kEXCEPTIONS");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kEXCEPTIONS"

    public static class kFOUND_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kFOUND"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:1: kFOUND : {...}? ID ;
    public final PLSQLParser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQLParser.kFOUND_return retval = new PLSQLParser.kFOUND_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID560=null;

        Object ID560_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kFOUND");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(614, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:8: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:10: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(614,10);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("found"),"input.LT(1).getText().equalsIgnoreCase(\"found\")")) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            dbg.location(614,61);
            ID560=(Token)match(input,ID,FOLLOW_ID_in_kFOUND4586); 
            ID560_tree = (Object)adaptor.create(ID560);
            adaptor.addChild(root_0, ID560_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(614, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kFOUND");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kFOUND"

    public static class kINDICES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kINDICES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:1: kINDICES : {...}? ID ;
    public final PLSQLParser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQLParser.kINDICES_return retval = new PLSQLParser.kINDICES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID561=null;

        Object ID561_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kINDICES");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(615, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:10: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(615,12);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("indices"),"input.LT(1).getText().equalsIgnoreCase(\"indices\")")) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            dbg.location(615,65);
            ID561=(Token)match(input,ID,FOLLOW_ID_in_kINDICES4595); 
            ID561_tree = (Object)adaptor.create(ID561);
            adaptor.addChild(root_0, ID561_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(615, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kINDICES");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kINDICES"

    public static class kMOD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kMOD"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:1: kMOD : {...}? ID ;
    public final PLSQLParser.kMOD_return kMOD() throws RecognitionException {
        PLSQLParser.kMOD_return retval = new PLSQLParser.kMOD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID562=null;

        Object ID562_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kMOD");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(616, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:6: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:8: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(616,8);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("mod"),"input.LT(1).getText().equalsIgnoreCase(\"mod\")")) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            dbg.location(616,57);
            ID562=(Token)match(input,ID,FOLLOW_ID_in_kMOD4604); 
            ID562_tree = (Object)adaptor.create(ID562);
            adaptor.addChild(root_0, ID562_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(616, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kMOD");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kMOD"

    public static class kNAME_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kNAME"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:1: kNAME : {...}? ID ;
    public final PLSQLParser.kNAME_return kNAME() throws RecognitionException {
        PLSQLParser.kNAME_return retval = new PLSQLParser.kNAME_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID563=null;

        Object ID563_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kNAME");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(617, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:7: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(617,9);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("name"),"input.LT(1).getText().equalsIgnoreCase(\"name\")")) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            dbg.location(617,59);
            ID563=(Token)match(input,ID,FOLLOW_ID_in_kNAME4613); 
            ID563_tree = (Object)adaptor.create(ID563);
            adaptor.addChild(root_0, ID563_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(617, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kNAME");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kNAME"

    public static class kOF_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kOF"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:1: kOF : {...}? ID ;
    public final PLSQLParser.kOF_return kOF() throws RecognitionException {
        PLSQLParser.kOF_return retval = new PLSQLParser.kOF_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID564=null;

        Object ID564_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kOF");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(618, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:5: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:7: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(618,7);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("of"),"input.LT(1).getText().equalsIgnoreCase(\"of\")")) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            dbg.location(618,55);
            ID564=(Token)match(input,ID,FOLLOW_ID_in_kOF4622); 
            ID564_tree = (Object)adaptor.create(ID564);
            adaptor.addChild(root_0, ID564_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(618, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kOF");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kOF"

    public static class kREPLACE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kREPLACE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:1: kREPLACE : {...}? ID ;
    public final PLSQLParser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQLParser.kREPLACE_return retval = new PLSQLParser.kREPLACE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID565=null;

        Object ID565_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kREPLACE");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(619, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:10: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(619,12);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("replace"),"input.LT(1).getText().equalsIgnoreCase(\"replace\")")) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            dbg.location(619,65);
            ID565=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE4631); 
            ID565_tree = (Object)adaptor.create(ID565);
            adaptor.addChild(root_0, ID565_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(619, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kREPLACE");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kREPLACE"

    public static class kROWCOUNT_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kROWCOUNT"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:1: kROWCOUNT : {...}? ID ;
    public final PLSQLParser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQLParser.kROWCOUNT_return retval = new PLSQLParser.kROWCOUNT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID566=null;

        Object ID566_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kROWCOUNT");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(620, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:11: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:13: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(620,13);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("rowcount"),"input.LT(1).getText().equalsIgnoreCase(\"rowcount\")")) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            dbg.location(620,67);
            ID566=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT4640); 
            ID566_tree = (Object)adaptor.create(ID566);
            adaptor.addChild(root_0, ID566_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(620, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kROWCOUNT");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kROWCOUNT"

    public static class kSAVE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSAVE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:1: kSAVE : {...}? ID ;
    public final PLSQLParser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQLParser.kSAVE_return retval = new PLSQLParser.kSAVE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID567=null;

        Object ID567_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kSAVE");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(621, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:7: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(621,9);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("save"),"input.LT(1).getText().equalsIgnoreCase(\"save\")")) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            dbg.location(621,59);
            ID567=(Token)match(input,ID,FOLLOW_ID_in_kSAVE4649); 
            ID567_tree = (Object)adaptor.create(ID567);
            adaptor.addChild(root_0, ID567_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(621, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kSAVE");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kSAVE"

    public static class kSHOW_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSHOW"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:622:1: kSHOW : {...}? ID ;
    public final PLSQLParser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQLParser.kSHOW_return retval = new PLSQLParser.kSHOW_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID568=null;

        Object ID568_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kSHOW");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(622, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:622:7: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:622:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(622,9);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("show"),"input.LT(1).getText().equalsIgnoreCase(\"show\")")) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            dbg.location(622,59);
            ID568=(Token)match(input,ID,FOLLOW_ID_in_kSHOW4658); 
            ID568_tree = (Object)adaptor.create(ID568);
            adaptor.addChild(root_0, ID568_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(622, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kSHOW");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kSHOW"

    public static class kTYPE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kTYPE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:623:1: kTYPE : {...}? ID ;
    public final PLSQLParser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQLParser.kTYPE_return retval = new PLSQLParser.kTYPE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID569=null;

        Object ID569_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kTYPE");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(623, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:623:7: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:623:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(623,9);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("type"),"input.LT(1).getText().equalsIgnoreCase(\"type\")")) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            dbg.location(623,59);
            ID569=(Token)match(input,ID,FOLLOW_ID_in_kTYPE4667); 
            ID569_tree = (Object)adaptor.create(ID569);
            adaptor.addChild(root_0, ID569_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(623, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kTYPE");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kTYPE"

    public static class kVALUES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kVALUES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:624:1: kVALUES : {...}? ID ;
    public final PLSQLParser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQLParser.kVALUES_return retval = new PLSQLParser.kVALUES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID570=null;

        Object ID570_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "kVALUES");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(624, 1);

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:624:9: ({...}? ID )
            dbg.enterAlt(1);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:624:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(624,11);
            if ( !(evalPredicate(input.LT(1).getText().equalsIgnoreCase("values"),"input.LT(1).getText().equalsIgnoreCase(\"values\")")) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            dbg.location(624,63);
            ID570=(Token)match(input,ID,FOLLOW_ID_in_kVALUES4676); 
            ID570_tree = (Object)adaptor.create(ID570);
            adaptor.addChild(root_0, ID570_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(624, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "kVALUES");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "kVALUES"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA136 dfa136 = new DFA136(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\7\1\uffff\1\10\6\uffff\1\6\1\uffff";
    static final String DFA13_maxS =
        "\1\112\1\uffff\1\41\6\uffff\1\43\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\10\1\uffff\1\2\1\3\1\5\1\6\1\7\1\4\1\uffff\1\1";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\1\2\1\5\11\uffff\1\4\5\uffff\1\3\20\uffff\2\1\36\uffff"+
            "\1\7",
            "",
            "\1\11\16\uffff\2\10\10\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\4\uffff\1\10\5\uffff\2\10\1\uffff\1\12\1\10\14\uffff"+
            "\2\10",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()+ loopback of 115:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA93_eotS =
        "\17\uffff";
    static final String DFA93_eofS =
        "\17\uffff";
    static final String DFA93_minS =
        "\1\10\2\uffff\1\0\13\uffff";
    static final String DFA93_maxS =
        "\1\161\2\uffff\1\0\13\uffff";
    static final String DFA93_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\1\3";
    static final String DFA93_specialS =
        "\3\uffff\1\0\13\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\3\2\uffff\1\1\12\uffff\1\1\31\uffff\1\1\57\uffff\2\1\3\uffff"+
            "\1\1\3\uffff\5\1\1\uffff\3\1",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "332:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(evalPredicate((evalPredicate(input.LT(1).getText().equalsIgnoreCase("indices"),"input.LT(1).getText().equalsIgnoreCase(\"indices\")")||evalPredicate(input.LT(1).getText().equalsIgnoreCase("values"),"input.LT(1).getText().equalsIgnoreCase(\"values\")")),""))) ) {s = 1;}

                        else if ( (evalPredicate(input.LT(1).getText().equalsIgnoreCase("indices"),"input.LT(1).getText().equalsIgnoreCase(\"indices\")")) ) {s = 13;}

                        else if ( (evalPredicate(input.LT(1).getText().equalsIgnoreCase("values"),"input.LT(1).getText().equalsIgnoreCase(\"values\")")) ) {s = 14;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA136_eotS =
        "\12\uffff";
    static final String DFA136_eofS =
        "\2\uffff\1\1\7\uffff";
    static final String DFA136_minS =
        "\1\10\1\uffff\1\5\6\uffff\1\10";
    static final String DFA136_maxS =
        "\1\161\1\uffff\1\144\6\uffff\1\156";
    static final String DFA136_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA136_specialS =
        "\12\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\2\2\uffff\1\10\12\uffff\1\7\31\uffff\1\1\64\uffff\1\3\3\uffff"+
            "\2\5\2\6\1\4\1\uffff\3\6",
            "",
            "\2\1\1\uffff\1\1\1\uffff\5\1\5\uffff\2\1\14\uffff\1\11\1\1"+
            "\10\uffff\2\1\1\uffff\1\1\1\uffff\2\1\11\uffff\2\1\1\uffff\2"+
            "\1\2\uffff\3\1\11\uffff\7\1\1\uffff\1\1\1\uffff\14\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\47\uffff\2\1\74\uffff\1\6"
    };

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "500:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file78 = new BitSet(new long[]{0x0000000000000020L,0x0008000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file82 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file84 = new BitSet(new long[]{0x0000000000000020L,0x0008000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file89 = new BitSet(new long[]{0x0000000000000020L,0x0008000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors118 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_SEMI_in_show_errors120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_procedure_heading185 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading209 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_function_heading211 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading213 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RETURN_in_function_heading216 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_function_heading218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations246 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations253 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration281 = new BitSet(new long[]{0x000000020000C100L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration285 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration293 = new BitSet(new long[]{0x0000000200010100L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration297 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration299 = new BitSet(new long[]{0x0000000200010100L});
    public static final BitSet FOLLOW_NOCOPY_in_parameter_declaration303 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration311 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_parameter_declaration323 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_definition_in_declare_section355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section357 = new BitSet(new long[]{0x0000000002080382L,0x0000000000000400L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section367 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section377 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section385 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section387 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section397 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section407 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_pragma_in_declare_section415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_declare_section417 = new BitSet(new long[]{0x00000000020803C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_cursor_definition447 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration508 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration510 = new BitSet(new long[]{0x0000000000260002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration518 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration520 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_variable_declaration525 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration562 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration564 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration566 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration570 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration572 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_constant_declaration577 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration612 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition635 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_type_definition637 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IS_in_type_definition639 = new BitSet(new long[]{0x000000026C000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition674 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_subtype_definition676 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition678 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition680 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition707 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition709 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition711 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition715 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition717 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration736 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration738 = new BitSet(new long[]{0x0000000000260002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration744 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration746 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration751 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition796 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition798 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition803 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition807 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition809 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition811 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition813 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition815 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition819 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition835 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition837 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition839 = new BitSet(new long[]{0x0000000080200002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition843 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition845 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition854 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition883 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition887 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype908 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_datatype913 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_DOT_in_datatype917 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_datatype919 = new BitSet(new long[]{0x0000000800000802L});
    public static final BitSet FOLLOW_LPAREN_in_datatype926 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype928 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_datatype932 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype934 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_datatype939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype943 = new BitSet(new long[]{0x0000001000000100L});
    public static final BitSet FOLLOW_kTYPE_in_datatype947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition977 = new BitSet(new long[]{0x000003E000100002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition987 = new BitSet(new long[]{0x000003E000100002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1016 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1026 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1050 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1060 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1098 = new BitSet(new long[]{0x000003E000100000L});
    public static final BitSet FOLLOW_set_in_function_definition1108 = new BitSet(new long[]{0x000003E000100000L});
    public static final BitSet FOLLOW_set_in_function_definition1135 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1145 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_function_definition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1166 = new BitSet(new long[]{0x0000020000100002L});
    public static final BitSet FOLLOW_set_in_procedure_declaration_or_definition1178 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1188 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1219 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_set_in_procedure_definition1222 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1232 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_procedure_definition1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1249 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_body1251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_body1253 = new BitSet(new long[]{0x06EF0C00034807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_body1257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_body1259 = new BitSet(new long[]{0x06EF0C00034807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_pragma_in_body1263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_body1265 = new BitSet(new long[]{0x06EF0C00034807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_EXCEPTION_in_body1273 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body1275 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_END_in_body1281 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ID_in_body1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1295 = new BitSet(new long[]{0x0001400000000100L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1299 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1303 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1305 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1312 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1318 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_exception_handler1322 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1324 = new BitSet(new long[]{0x06EF0400024807C2L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_label_in_statement1342 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue1518 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue1522 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_call_in_lvalue1524 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement1544 = new BitSet(new long[]{0x0000000400020002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement1548 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement1554 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call1576 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_call1579 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_LPAREN_in_call1583 = new BitSet(new long[]{0x0001000000602900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call1587 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_call1591 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call1593 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_call1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call1621 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call1625 = new BitSet(new long[]{0x0001000000602900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call1627 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1654 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement1658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement1660 = new BitSet(new long[]{0x06EF0C00024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_basic_loop_statement1665 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1667 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement1691 = new BitSet(new long[]{0x0001100000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1693 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement1706 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1708 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement1710 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_case_statement1714 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1716 = new BitSet(new long[]{0x06FF1C00024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_ELSE_in_case_statement1734 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_case_statement1736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1738 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_case_statement1751 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement1753 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_label_name_in_case_statement1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement1777 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_close_statement1779 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement1783 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_close_statement1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement1809 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_ID_in_continue_statement1815 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement1822 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement1848 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement1850 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement1852 = new BitSet(new long[]{0xB000000000000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement1866 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement1870 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement1886 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement1933 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_ID_in_exit_statement1939 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement1946 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement1972 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement1974 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement1982 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement1986 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2018 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2020 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2024 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2026 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2054 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2056 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2058 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2060 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2064 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2066 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_USING_in_using_clause2090 = new BitSet(new long[]{0x000100000060C900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2092 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2095 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2099 = new BitSet(new long[]{0x000100000060C900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2101 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2104 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2121 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2146 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2187 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2189 = new BitSet(new long[]{0xFFFBFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2193 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2201 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2207 = new BitSet(new long[]{0x06EF0C00024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_for_loop_statement2212 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2214 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2238 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_forall_statement2240 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2242 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2244 = new BitSet(new long[]{0x0002000000000000L,0x0000000000BF8000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2246 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2276 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2288 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2294 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2298 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2311 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2313 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2336 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2359 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2361 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2363 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement2367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2369 = new BitSet(new long[]{0x06FF0C00024807C0L,0x0000000001BFBFC6L});
    public static final BitSet FOLLOW_ELSIF_in_if_statement2384 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2386 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2388 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement2392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2394 = new BitSet(new long[]{0x06FF0C00024807C0L,0x0000000001BFBFC6L});
    public static final BitSet FOLLOW_ELSE_in_if_statement2412 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement2416 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2418 = new BitSet(new long[]{0x06EF0C00024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_if_statement2434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IF_in_if_statement2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement2478 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_open_statement2480 = new BitSet(new long[]{0x0000000400000802L,0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_open_statement2484 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_open_statement2486 = new BitSet(new long[]{0x0000000400000802L,0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_statement2491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_open_statement2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma2522 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement2545 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ID_in_raise_statement2549 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement2553 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_raise_statement2555 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement2582 = new BitSet(new long[]{0x0001000000600902L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_return_statement2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block2608 = new BitSet(new long[]{0x00000000020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block2610 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_plsql_block2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_label_in_label2638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RLABEL_in_label2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id2654 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_qual_id2657 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id2661 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_COLON_in_qual_id2663 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_qual_id2666 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement2771 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement2795 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement2818 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement2841 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement2843 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement2866 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement2890 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement2913 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement2936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement2938 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement2961 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi2984 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3011 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3013 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3015 = new BitSet(new long[]{0x06EF0400024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3021 = new BitSet(new long[]{0x06EF0C00024807C0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_while_loop_statement3026 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3028 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3059 = new BitSet(new long[]{0xFFFFFDFFFFEF17B2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3099 = new BitSet(new long[]{0xFFFFFDFFFFEF3FB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3101 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3144 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3148 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3150 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_and_expr3174 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NOT_in_not_expr3196 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3216 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3220 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3266 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3270 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3272 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3294 = new BitSet(new long[]{0x0000000000200002L,0x0000000080000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3301 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3323 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_between_expr3327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3330 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_between_expr3334 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3356 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_NOT_in_in_expr3360 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IN_in_in_expr3363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr3365 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3367 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_in_expr3371 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3373 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3415 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_set_in_add_expr3419 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3433 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3453 = new BitSet(new long[]{0x0000000000000122L,0x0000000800000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr3459 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr3463 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr3467 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3471 = new BitSet(new long[]{0x0000000000000122L,0x0000000800000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr3491 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3519 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr3523 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom3545 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom3549 = new BitSet(new long[]{0x0000000000000100L,0x000001C000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom3562 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3564 = new BitSet(new long[]{0x0000000000000100L,0x000001C000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3606 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_atom3608 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3631 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3635 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3637 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3644 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute3666 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_attribute3668 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_attribute3670 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args3721 = new BitSet(new long[]{0x0001000000602900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3725 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_call_args3729 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3731 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_call_args3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists3873 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists3875 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists3877 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists3879 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists3881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate3908 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate3912 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate3914 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter3946 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter3948 = new BitSet(new long[]{0x0001000000600900L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_parameter3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package3991 = new BitSet(new long[]{0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package3995 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package3997 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package4002 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_package4008 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_create_package4010 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_package4017 = new BitSet(new long[]{0x0000020000100000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4029 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_set_in_create_package4042 = new BitSet(new long[]{0x00000800020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_package4054 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_create_package4059 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_create_package4063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_create_package4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4089 = new BitSet(new long[]{0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package_body4093 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4095 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4100 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_package_body4108 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4110 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_package_body4117 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_set_in_create_package_body4127 = new BitSet(new long[]{0x00000C00020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4139 = new BitSet(new long[]{0x00000C00020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_package_body4156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_create_package_body4160 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_create_package_body4166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4202 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_OR_in_create_procedure4206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4208 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4213 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_procedure4219 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4221 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_procedure4228 = new BitSet(new long[]{0x0000020000100800L,0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_procedure4240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4242 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_create_procedure4246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4248 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_create_procedure4253 = new BitSet(new long[]{0x0000020000100000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4266 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_set_in_create_procedure4277 = new BitSet(new long[]{0x00000400020803C0L,0x0440000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4297 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_procedure4300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure4312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure4324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function4357 = new BitSet(new long[]{0x0000200000000200L});
    public static final BitSet FOLLOW_OR_in_create_function4361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function4363 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function4368 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_function4374 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_create_function4376 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_create_function4383 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_LPAREN_in_create_function4395 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4397 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_create_function4401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4403 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RPAREN_in_create_function4408 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RETURN_in_create_function4421 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_datatype_in_create_function4423 = new BitSet(new long[]{0x0000020000100000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function4433 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_set_in_create_function4444 = new BitSet(new long[]{0x00000400020803C0L,0x0440000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_function4464 = new BitSet(new long[]{0x00000400020803C0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_function4467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_call_spec_in_create_function4479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function4491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_create_function4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause4524 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec4551 = new BitSet(new long[]{0xFFFFFFFFFFFFFFB0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES4676 = new BitSet(new long[]{0x0000000000000002L});

}