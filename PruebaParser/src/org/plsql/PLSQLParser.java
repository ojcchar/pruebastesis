// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g 2010-10-09 23:49:14

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PLSQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "IN", "OUT", "NOCOPY", "ASSIGN", "DEFAULT", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "SUBTYPE", "RECORD", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "AS", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "BODY", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "N", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT"
    };
    public static final int PACKAGE=115;
    public static final int FUNCTION=8;
    public static final int EXTERNAL=117;
    public static final int EXPONENT=99;
    public static final int WHILE=87;
    public static final int DETERMINISTIC=36;
    public static final int VARYING=26;
    public static final int CASE=50;
    public static final int DOUBLEDOT=66;
    public static final int NOT=20;
    public static final int SUBTYPE=24;
    public static final int EOF=-1;
    public static final int SQL=100;
    public static final int RPAREN=12;
    public static final int CREATE=114;
    public static final int INSERT=79;
    public static final int USING=62;
    public static final int RETURNING=63;
    public static final int BEGIN=41;
    public static final int LOOP=49;
    public static final int SAVEPOINT=82;
    public static final int RETURN=9;
    public static final int BODY=116;
    public static final int RAISE=74;
    public static final int GEQ=93;
    public static final int GOTO=69;
    public static final int EQ=88;
    public static final int SELECT=83;
    public static final int ISOPEN=102;
    public static final int INTO=59;
    public static final int ARRAY=27;
    public static final int DIVIDE=4;
    public static final int EXCEPTION=23;
    public static final int RBRACK=125;
    public static final int EXIT=56;
    public static final int RECORD=25;
    public static final int N=128;
    public static final int TRANSACTION=85;
    public static final int NULL=21;
    public static final int ELSE=51;
    public static final int AT_SIGN=124;
    public static final int DEFINER=120;
    public static final int DELETE=48;
    public static final int DOUBLEVERTBAR=97;
    public static final int ROLLBACK=81;
    public static final int AUTHID=118;
    public static final int NOCOPY=15;
    public static final int WS=130;
    public static final int LANGUAGE=121;
    public static final int FETCH=57;
    public static final int OUT=14;
    public static final int REAL_NUMBER=105;
    public static final int PIPELINED=37;
    public static final int SL_COMMENT=131;
    public static final int OR=44;
    public static final int CONSTANT=22;
    public static final int ELSIF=71;
    public static final int END=42;
    public static final int FALSE=107;
    public static final int COLLECT=61;
    public static final int CURSOR=18;
    public static final int OTHERS=45;
    public static final int LBRACK=126;
    public static final int POINT=123;
    public static final int CURRENT_USER=119;
    public static final int LIMIT=58;
    public static final int EXECUTE=54;
    public static final int INSERTING=110;
    public static final int GTH=92;
    public static final int NOTFOUND=103;
    public static final int PRAGMA=73;
    public static final int RESULT_CACHE=39;
    public static final int TABLE=29;
    public static final int LLABEL=76;
    public static final int UPDATE=86;
    public static final int FOR=64;
    public static final int ID=7;
    public static final int AND=68;
    public static final int ASTERISK=98;
    public static final int LPAREN=10;
    public static final int LOCK=80;
    public static final int UPDATING=111;
    public static final int IF=70;
    public static final int RLABEL=77;
    public static final int ML_COMMENT=132;
    public static final int AS=40;
    public static final int INDEX=30;
    public static final int ROWTYPE=35;
    public static final int IN=13;
    public static final int THEN=46;
    public static final int CONTINUE=53;
    public static final int COMMA=11;
    public static final int IS=19;
    public static final int QUOTED_STRING=108;
    public static final int PLUS=96;
    public static final int EXISTS=109;
    public static final int DOT=33;
    public static final int LIKE=94;
    public static final int INTEGER=104;
    public static final int BY=31;
    public static final int VARRAY=28;
    public static final int PARALLEL_ENABLE=38;
    public static final int PERCENT=34;
    public static final int DOUBLEQUOTED_STRING=122;
    public static final int DEFAULT=17;
    public static final int FORALL=65;
    public static final int SET=84;
    public static final int MINUS=95;
    public static final int TRUE=106;
    public static final int SEMI=5;
    public static final int PROCEDURE=6;
    public static final int NOT_EQ=89;
    public static final int REF=32;
    public static final int VERTBAR=127;
    public static final int COLON=47;
    public static final int OPEN=72;
    public static final int LTH=90;
    public static final int BULK_ROWCOUNT=101;
    public static final int COMMIT=78;
    public static final int CLOSE=52;
    public static final int WHEN=43;
    public static final int ASSIGN=16;
    public static final int NUMBER_VALUE=129;
    public static final int IMMEDIATE=55;
    public static final int ARROW=113;
    public static final int DECLARE=75;
    public static final int DELETING=112;
    public static final int BULK=60;
    public static final int BETWEEN=67;
    public static final int LEQ=91;

    // delegates
    // delegators


        public PLSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PLSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlplus_file"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:79:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
    public final PLSQLParser.sqlplus_file_return sqlplus_file() throws RecognitionException {
        PLSQLParser.sqlplus_file_return retval = new PLSQLParser.sqlplus_file_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIVIDE2=null;
        Token DIVIDE4=null;
        Token EOF5=null;
        PLSQLParser.create_object_return create_object1 = null;

        PLSQLParser.show_errors_return show_errors3 = null;


        CommonTree DIVIDE2_tree=null;
        CommonTree DIVIDE4_tree=null;
        CommonTree EOF5_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CREATE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file71);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:23: ( DIVIDE show_errors )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==DIVIDE) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==ID) ) {
            	            alt1=1;
            	        }
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:25: DIVIDE show_errors
            	            {
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file75); 
            	            DIVIDE2_tree = (CommonTree)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file77);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:47: ( DIVIDE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:80:47: DIVIDE
            	            {
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file82); 
            	            DIVIDE4_tree = (CommonTree)adaptor.create(DIVIDE4);
            	            adaptor.addChild(root_0, DIVIDE4_tree);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file88); 
            EOF5_tree = (CommonTree)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlplus_file"

    public static class show_errors_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "show_errors"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:83:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQLParser.show_errors_return show_errors() throws RecognitionException {
        PLSQLParser.show_errors_return retval = new PLSQLParser.show_errors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI8=null;
        PLSQLParser.kSHOW_return kSHOW6 = null;

        PLSQLParser.kERRORS_return kERRORS7 = null;


        CommonTree SEMI8_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:84:5: ( kSHOW kERRORS ( SEMI )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:84:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_kSHOW_in_show_errors109);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            pushFollow(FOLLOW_kERRORS_in_show_errors111);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:84:21: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:84:21: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors113); 
                    SEMI8_tree = (CommonTree)adaptor.create(SEMI8);
                    adaptor.addChild(root_0, SEMI8_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "show_errors"

    public static class create_object_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_object"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:87:1: create_object : ( create_package | create_package_body | create_function | create_procedure );
    public final PLSQLParser.create_object_return create_object() throws RecognitionException {
        PLSQLParser.create_object_return retval = new PLSQLParser.create_object_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.create_package_return create_package9 = null;

        PLSQLParser.create_package_body_return create_package_body10 = null;

        PLSQLParser.create_function_return create_function11 = null;

        PLSQLParser.create_procedure_return create_procedure12 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:88:5: ( create_package | create_package_body | create_function | create_procedure )
            int alt5=4;
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

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

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

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:88:7: create_package
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_create_package_in_create_object131);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:89:7: create_package_body
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_create_package_body_in_create_object139);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:90:7: create_function
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_create_function_in_create_object147);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:91:7: create_procedure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_create_procedure_in_create_object155);
                    create_procedure12=create_procedure();

                    state._fsp--;

                    adaptor.addChild(root_0, create_procedure12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_object"

    public static class procedure_heading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:94:1: procedure_heading : PROCEDURE ID ( parameter_declarations )? ;
    public final PLSQLParser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQLParser.procedure_heading_return retval = new PLSQLParser.procedure_heading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE13=null;
        Token ID14=null;
        PLSQLParser.parameter_declarations_return parameter_declarations15 = null;


        CommonTree PROCEDURE13_tree=null;
        CommonTree ID14_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:94:19: ( PROCEDURE ID ( parameter_declarations )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:95:9: PROCEDURE ID ( parameter_declarations )?
            {
            root_0 = (CommonTree)adaptor.nil();

            PROCEDURE13=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading176); 
            PROCEDURE13_tree = (CommonTree)adaptor.create(PROCEDURE13);
            adaptor.addChild(root_0, PROCEDURE13_tree);

            ID14=(Token)match(input,ID,FOLLOW_ID_in_procedure_heading178); 
            ID14_tree = (CommonTree)adaptor.create(ID14);
            adaptor.addChild(root_0, ID14_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:95:22: ( parameter_declarations )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:95:22: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading180);
                    parameter_declarations15=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations15.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_heading"

    public static class function_heading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:98:1: function_heading : FUNCTION ID ( parameter_declarations )? RETURN datatype ;
    public final PLSQLParser.function_heading_return function_heading() throws RecognitionException {
        PLSQLParser.function_heading_return retval = new PLSQLParser.function_heading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNCTION16=null;
        Token ID17=null;
        Token RETURN19=null;
        PLSQLParser.parameter_declarations_return parameter_declarations18 = null;

        PLSQLParser.datatype_return datatype20 = null;


        CommonTree FUNCTION16_tree=null;
        CommonTree ID17_tree=null;
        CommonTree RETURN19_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:98:18: ( FUNCTION ID ( parameter_declarations )? RETURN datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:99:9: FUNCTION ID ( parameter_declarations )? RETURN datatype
            {
            root_0 = (CommonTree)adaptor.nil();

            FUNCTION16=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading202); 
            FUNCTION16_tree = (CommonTree)adaptor.create(FUNCTION16);
            adaptor.addChild(root_0, FUNCTION16_tree);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_function_heading204); 
            ID17_tree = (CommonTree)adaptor.create(ID17);
            adaptor.addChild(root_0, ID17_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:99:21: ( parameter_declarations )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:99:21: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading206);
                    parameter_declarations18=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations18.getTree());

                    }
                    break;

            }

            RETURN19=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading209); 
            RETURN19_tree = (CommonTree)adaptor.create(RETURN19);
            adaptor.addChild(root_0, RETURN19_tree);

            pushFollow(FOLLOW_datatype_in_function_heading211);
            datatype20=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype20.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_heading"

    public static class parameter_declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declarations"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:102:1: parameter_declarations : ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) ;
    public final PLSQLParser.parameter_declarations_return parameter_declarations() throws RecognitionException {
        PLSQLParser.parameter_declarations_return retval = new PLSQLParser.parameter_declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN21=null;
        Token COMMA23=null;
        Token RPAREN25=null;
        PLSQLParser.parameter_declaration_return parameter_declaration22 = null;

        PLSQLParser.parameter_declaration_return parameter_declaration24 = null;


        CommonTree LPAREN21_tree=null;
        CommonTree COMMA23_tree=null;
        CommonTree RPAREN25_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:102:24: ( ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:103:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:103:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:103:13: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
            {
            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations236); 
            LPAREN21_tree = (CommonTree)adaptor.create(LPAREN21);
            adaptor.addChild(root_0, LPAREN21_tree);

            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations239);
            parameter_declaration22=parameter_declaration();

            state._fsp--;

            adaptor.addChild(root_0, parameter_declaration22.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:103:43: ( COMMA parameter_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:103:45: COMMA parameter_declaration
            	    {
            	    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations243); 
            	    COMMA23_tree = (CommonTree)adaptor.create(COMMA23);
            	    adaptor.addChild(root_0, COMMA23_tree);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations246);
            	    parameter_declaration24=parameter_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter_declaration24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations251); 
            RPAREN25_tree = (CommonTree)adaptor.create(RPAREN25);
            adaptor.addChild(root_0, RPAREN25_tree);


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_declarations"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:1: parameter_declaration : ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQLParser.parameter_declaration_return retval = new PLSQLParser.parameter_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID26=null;
        Token IN27=null;
        Token OUT28=null;
        Token IN29=null;
        Token OUT30=null;
        Token NOCOPY31=null;
        Token set33=null;
        PLSQLParser.datatype_return datatype32 = null;

        PLSQLParser.expression_return expression34 = null;


        CommonTree ID26_tree=null;
        CommonTree IN27_tree=null;
        CommonTree OUT28_tree=null;
        CommonTree IN29_tree=null;
        CommonTree OUT30_tree=null;
        CommonTree NOCOPY31_tree=null;
        CommonTree set33_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:106:23: ( ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:9: ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            ID26=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration274); 
            ID26_tree = (CommonTree)adaptor.create(ID26);
            adaptor.addChild(root_0, ID26_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:12: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )?
            int alt11=3;
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
            switch (alt11) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:14: IN
                    {
                    IN27=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration278); 
                    IN27_tree = (CommonTree)adaptor.create(IN27);
                    adaptor.addChild(root_0, IN27_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:21: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:21: ( OUT | IN OUT )
                    int alt9=2;
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

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:23: OUT
                            {
                            OUT28=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration286); 
                            OUT28_tree = (CommonTree)adaptor.create(OUT28);
                            adaptor.addChild(root_0, OUT28_tree);


                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:29: IN OUT
                            {
                            IN29=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration290); 
                            IN29_tree = (CommonTree)adaptor.create(IN29);
                            adaptor.addChild(root_0, IN29_tree);

                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration292); 
                            OUT30_tree = (CommonTree)adaptor.create(OUT30);
                            adaptor.addChild(root_0, OUT30_tree);


                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:38: ( NOCOPY )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOCOPY) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:107:38: NOCOPY
                            {
                            NOCOPY31=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_parameter_declaration296); 
                            NOCOPY31_tree = (CommonTree)adaptor.create(NOCOPY31);
                            adaptor.addChild(root_0, NOCOPY31_tree);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_parameter_declaration304);
            datatype32=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype32.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:108:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ASSIGN && LA12_0<=DEFAULT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:108:11: ( ASSIGN | DEFAULT ) expression
                    {
                    set33=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set33));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_parameter_declaration326);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class declare_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:111:1: declare_section : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ ;
    public final PLSQLParser.declare_section_return declare_section() throws RecognitionException {
        PLSQLParser.declare_section_return retval = new PLSQLParser.declare_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree SEMI36_tree=null;
        CommonTree SEMI38_tree=null;
        CommonTree SEMI40_tree=null;
        CommonTree SEMI42_tree=null;
        CommonTree SEMI44_tree=null;
        CommonTree SEMI46_tree=null;
        CommonTree SEMI48_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:111:17: ( ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:112:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:112:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            int cnt13=0;
            loop13:
            do {
                int alt13=8;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:112:7: type_definition SEMI
            	    {
            	    pushFollow(FOLLOW_type_definition_in_declare_section348);
            	    type_definition35=type_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_definition35.getTree());
            	    SEMI36=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section350); 
            	    SEMI36_tree = (CommonTree)adaptor.create(SEMI36);
            	    adaptor.addChild(root_0, SEMI36_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:113:7: subtype_definition SEMI
            	    {
            	    pushFollow(FOLLOW_subtype_definition_in_declare_section358);
            	    subtype_definition37=subtype_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subtype_definition37.getTree());
            	    SEMI38=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section360); 
            	    SEMI38_tree = (CommonTree)adaptor.create(SEMI38);
            	    adaptor.addChild(root_0, SEMI38_tree);


            	    }
            	    break;
            	case 3 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:114:7: cursor_definition SEMI
            	    {
            	    pushFollow(FOLLOW_cursor_definition_in_declare_section368);
            	    cursor_definition39=cursor_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cursor_definition39.getTree());
            	    SEMI40=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section370); 
            	    SEMI40_tree = (CommonTree)adaptor.create(SEMI40);
            	    adaptor.addChild(root_0, SEMI40_tree);


            	    }
            	    break;
            	case 4 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:115:7: item_declaration SEMI
            	    {
            	    pushFollow(FOLLOW_item_declaration_in_declare_section378);
            	    item_declaration41=item_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_declaration41.getTree());
            	    SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section380); 
            	    SEMI42_tree = (CommonTree)adaptor.create(SEMI42);
            	    adaptor.addChild(root_0, SEMI42_tree);


            	    }
            	    break;
            	case 5 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:116:7: function_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section388);
            	    function_declaration_or_definition43=function_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_declaration_or_definition43.getTree());
            	    SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section390); 
            	    SEMI44_tree = (CommonTree)adaptor.create(SEMI44);
            	    adaptor.addChild(root_0, SEMI44_tree);


            	    }
            	    break;
            	case 6 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:117:7: procedure_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section398);
            	    procedure_declaration_or_definition45=procedure_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedure_declaration_or_definition45.getTree());
            	    SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section400); 
            	    SEMI46_tree = (CommonTree)adaptor.create(SEMI46);
            	    adaptor.addChild(root_0, SEMI46_tree);


            	    }
            	    break;
            	case 7 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:118:7: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_declare_section408);
            	    pragma47=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma47.getTree());
            	    SEMI48=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section410); 
            	    SEMI48_tree = (CommonTree)adaptor.create(SEMI48);
            	    adaptor.addChild(root_0, SEMI48_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declare_section"

    public static class cursor_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:122:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement ;
    public final PLSQLParser.cursor_definition_return cursor_definition() throws RecognitionException {
        PLSQLParser.cursor_definition_return retval = new PLSQLParser.cursor_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CURSOR49=null;
        Token ID50=null;
        Token IS52=null;
        PLSQLParser.parameter_declarations_return parameter_declarations51 = null;

        PLSQLParser.select_statement_return select_statement53 = null;


        CommonTree CURSOR49_tree=null;
        CommonTree ID50_tree=null;
        CommonTree IS52_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:122:19: ( CURSOR ID ( parameter_declarations )? IS select_statement )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:123:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            root_0 = (CommonTree)adaptor.nil();

            CURSOR49=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition438); 
            CURSOR49_tree = (CommonTree)adaptor.create(CURSOR49);
            adaptor.addChild(root_0, CURSOR49_tree);

            ID50=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition440); 
            ID50_tree = (CommonTree)adaptor.create(ID50);
            adaptor.addChild(root_0, ID50_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:123:19: ( parameter_declarations )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LPAREN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:123:19: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition442);
                    parameter_declarations51=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations51.getTree());

                    }
                    break;

            }

            IS52=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition445); 
            IS52_tree = (CommonTree)adaptor.create(IS52);
            adaptor.addChild(root_0, IS52_tree);

            pushFollow(FOLLOW_select_statement_in_cursor_definition447);
            select_statement53=select_statement();

            state._fsp--;

            adaptor.addChild(root_0, select_statement53.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cursor_definition"

    public static class item_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:126:1: item_declaration : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQLParser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQLParser.item_declaration_return retval = new PLSQLParser.item_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.variable_declaration_return variable_declaration54 = null;

        PLSQLParser.constant_declaration_return constant_declaration55 = null;

        PLSQLParser.exception_declaration_return exception_declaration56 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:127:5: ( variable_declaration | constant_declaration | exception_declaration )
            int alt15=3;
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

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:127:7: variable_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_item_declaration464);
                    variable_declaration54=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration54.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:128:7: constant_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_declaration_in_item_declaration472);
                    constant_declaration55=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration55.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:129:7: exception_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exception_declaration_in_item_declaration480);
                    exception_declaration56=exception_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, exception_declaration56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "item_declaration"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:132:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.variable_declaration_return variable_declaration() throws RecognitionException {
        PLSQLParser.variable_declaration_return retval = new PLSQLParser.variable_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID57=null;
        Token NOT59=null;
        Token NULL60=null;
        Token set61=null;
        PLSQLParser.datatype_return datatype58 = null;

        PLSQLParser.expression_return expression62 = null;


        CommonTree ID57_tree=null;
        CommonTree NOT59_tree=null;
        CommonTree NULL60_tree=null;
        CommonTree set61_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:132:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:133:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            ID57=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration501); 
            ID57_tree = (CommonTree)adaptor.create(ID57);
            adaptor.addChild(root_0, ID57_tree);

            pushFollow(FOLLOW_datatype_in_variable_declaration503);
            datatype58=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype58.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:133:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=ASSIGN && LA17_0<=DEFAULT)||LA17_0==NOT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:133:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:133:24: ( NOT NULL )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NOT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:133:27: NOT NULL
                            {
                            NOT59=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration511); 
                            NOT59_tree = (CommonTree)adaptor.create(NOT59);
                            adaptor.addChild(root_0, NOT59_tree);

                            NULL60=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration513); 
                            NULL60_tree = (CommonTree)adaptor.create(NULL60);
                            adaptor.addChild(root_0, NULL60_tree);


                            }
                            break;

                    }

                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set61));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_variable_declaration530);
                    expression62=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression62.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_declaration"

    public static class constant_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
    public final PLSQLParser.constant_declaration_return constant_declaration() throws RecognitionException {
        PLSQLParser.constant_declaration_return retval = new PLSQLParser.constant_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID63=null;
        Token CONSTANT64=null;
        Token NOT66=null;
        Token NULL67=null;
        Token set68=null;
        PLSQLParser.datatype_return datatype65 = null;

        PLSQLParser.expression_return expression69 = null;


        CommonTree ID63_tree=null;
        CommonTree CONSTANT64_tree=null;
        CommonTree NOT66_tree=null;
        CommonTree NULL67_tree=null;
        CommonTree set68_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:136:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:137:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (CommonTree)adaptor.nil();

            ID63=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration555); 
            ID63_tree = (CommonTree)adaptor.create(ID63);
            adaptor.addChild(root_0, ID63_tree);

            CONSTANT64=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration557); 
            CONSTANT64_tree = (CommonTree)adaptor.create(CONSTANT64);
            adaptor.addChild(root_0, CONSTANT64_tree);

            pushFollow(FOLLOW_datatype_in_constant_declaration559);
            datatype65=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype65.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:137:30: ( NOT NULL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:137:32: NOT NULL
                    {
                    NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration563); 
                    NOT66_tree = (CommonTree)adaptor.create(NOT66);
                    adaptor.addChild(root_0, NOT66_tree);

                    NULL67=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration565); 
                    NULL67_tree = (CommonTree)adaptor.create(NULL67);
                    adaptor.addChild(root_0, NULL67_tree);


                    }
                    break;

            }

            set68=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set68));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_expression_in_constant_declaration584);
            expression69=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression69.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant_declaration"

    public static class exception_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:140:1: exception_declaration : ID EXCEPTION ;
    public final PLSQLParser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQLParser.exception_declaration_return retval = new PLSQLParser.exception_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID70=null;
        Token EXCEPTION71=null;

        CommonTree ID70_tree=null;
        CommonTree EXCEPTION71_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:140:23: ( ID EXCEPTION )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:141:9: ID EXCEPTION
            {
            root_0 = (CommonTree)adaptor.nil();

            ID70=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration605); 
            ID70_tree = (CommonTree)adaptor.create(ID70);
            adaptor.addChild(root_0, ID70_tree);

            EXCEPTION71=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration607); 
            EXCEPTION71_tree = (CommonTree)adaptor.create(EXCEPTION71);
            adaptor.addChild(root_0, EXCEPTION71_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exception_declaration"

    public static class type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:144:1: type_definition : kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) ;
    public final PLSQLParser.type_definition_return type_definition() throws RecognitionException {
        PLSQLParser.type_definition_return retval = new PLSQLParser.type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID73=null;
        Token IS74=null;
        PLSQLParser.kTYPE_return kTYPE72 = null;

        PLSQLParser.record_type_definition_return record_type_definition75 = null;

        PLSQLParser.collection_type_definition_return collection_type_definition76 = null;

        PLSQLParser.ref_cursor_type_definition_return ref_cursor_type_definition77 = null;


        CommonTree ID73_tree=null;
        CommonTree IS74_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:144:17: ( kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:145:9: kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_kTYPE_in_type_definition628);
            kTYPE72=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE72.getTree());
            ID73=(Token)match(input,ID,FOLLOW_ID_in_type_definition630); 
            ID73_tree = (CommonTree)adaptor.create(ID73);
            adaptor.addChild(root_0, ID73_tree);

            IS74=(Token)match(input,IS,FOLLOW_IS_in_type_definition632); 
            IS74_tree = (CommonTree)adaptor.create(IS74);
            adaptor.addChild(root_0, IS74_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:145:21: ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            int alt19=3;
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

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:145:23: record_type_definition
                    {
                    pushFollow(FOLLOW_record_type_definition_in_type_definition636);
                    record_type_definition75=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition75.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:145:48: collection_type_definition
                    {
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition640);
                    collection_type_definition76=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition76.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:145:77: ref_cursor_type_definition
                    {
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition644);
                    ref_cursor_type_definition77=ref_cursor_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_cursor_type_definition77.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_definition"

    public static class subtype_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subtype_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
    public final PLSQLParser.subtype_definition_return subtype_definition() throws RecognitionException {
        PLSQLParser.subtype_definition_return retval = new PLSQLParser.subtype_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SUBTYPE78=null;
        Token ID79=null;
        Token IS80=null;
        Token NOT82=null;
        Token NULL83=null;
        PLSQLParser.datatype_return datatype81 = null;


        CommonTree SUBTYPE78_tree=null;
        CommonTree ID79_tree=null;
        CommonTree IS80_tree=null;
        CommonTree NOT82_tree=null;
        CommonTree NULL83_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:148:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:149:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (CommonTree)adaptor.nil();

            SUBTYPE78=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition667); 
            SUBTYPE78_tree = (CommonTree)adaptor.create(SUBTYPE78);
            adaptor.addChild(root_0, SUBTYPE78_tree);

            ID79=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition669); 
            ID79_tree = (CommonTree)adaptor.create(ID79);
            adaptor.addChild(root_0, ID79_tree);

            IS80=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition671); 
            IS80_tree = (CommonTree)adaptor.create(IS80);
            adaptor.addChild(root_0, IS80_tree);

            pushFollow(FOLLOW_datatype_in_subtype_definition673);
            datatype81=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype81.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:149:32: ( NOT NULL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NOT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:149:34: NOT NULL
                    {
                    NOT82=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition677); 
                    NOT82_tree = (CommonTree)adaptor.create(NOT82);
                    adaptor.addChild(root_0, NOT82_tree);

                    NULL83=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition679); 
                    NULL83_tree = (CommonTree)adaptor.create(NULL83);
                    adaptor.addChild(root_0, NULL83_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subtype_definition"

    public static class record_type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:152:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
    public final PLSQLParser.record_type_definition_return record_type_definition() throws RecognitionException {
        PLSQLParser.record_type_definition_return retval = new PLSQLParser.record_type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD84=null;
        Token LPAREN85=null;
        Token COMMA87=null;
        Token RPAREN89=null;
        PLSQLParser.record_field_declaration_return record_field_declaration86 = null;

        PLSQLParser.record_field_declaration_return record_field_declaration88 = null;


        CommonTree RECORD84_tree=null;
        CommonTree LPAREN85_tree=null;
        CommonTree COMMA87_tree=null;
        CommonTree RPAREN89_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:152:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:153:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            RECORD84=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition700); 
            RECORD84_tree = (CommonTree)adaptor.create(RECORD84);
            adaptor.addChild(root_0, RECORD84_tree);

            LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition702); 
            LPAREN85_tree = (CommonTree)adaptor.create(LPAREN85);
            adaptor.addChild(root_0, LPAREN85_tree);

            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition704);
            record_field_declaration86=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration86.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:153:41: ( COMMA record_field_declaration )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:153:43: COMMA record_field_declaration
            	    {
            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition708); 
            	    COMMA87_tree = (CommonTree)adaptor.create(COMMA87);
            	    adaptor.addChild(root_0, COMMA87_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition710);
            	    record_field_declaration88=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration88.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition715); 
            RPAREN89_tree = (CommonTree)adaptor.create(RPAREN89);
            adaptor.addChild(root_0, RPAREN89_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_type_definition"

    public static class record_field_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_field_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:156:1: record_field_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLParser.record_field_declaration_return record_field_declaration() throws RecognitionException {
        PLSQLParser.record_field_declaration_return retval = new PLSQLParser.record_field_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID90=null;
        Token NOT92=null;
        Token NULL93=null;
        Token set94=null;
        PLSQLParser.datatype_return datatype91 = null;

        PLSQLParser.expression_return expression95 = null;


        CommonTree ID90_tree=null;
        CommonTree NOT92_tree=null;
        CommonTree NULL93_tree=null;
        CommonTree set94_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:156:26: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:157:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            ID90=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration729); 
            ID90_tree = (CommonTree)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);

            pushFollow(FOLLOW_datatype_in_record_field_declaration731);
            datatype91=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype91.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:157:14: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ASSIGN && LA23_0<=DEFAULT)||LA23_0==NOT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:157:16: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:157:16: ( NOT NULL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NOT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:157:18: NOT NULL
                            {
                            NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration737); 
                            NOT92_tree = (CommonTree)adaptor.create(NOT92);
                            adaptor.addChild(root_0, NOT92_tree);

                            NULL93=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration739); 
                            NULL93_tree = (CommonTree)adaptor.create(NULL93);
                            adaptor.addChild(root_0, NULL93_tree);


                            }
                            break;

                    }

                    set94=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set94));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_record_field_declaration754);
                    expression95=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression95.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_field_declaration"

    public static class collection_type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:160:1: collection_type_definition : ( varray_type_definition | nested_table_type_definition );
    public final PLSQLParser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQLParser.collection_type_definition_return retval = new PLSQLParser.collection_type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.varray_type_definition_return varray_type_definition96 = null;

        PLSQLParser.nested_table_type_definition_return nested_table_type_definition97 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:161:2: ( varray_type_definition | nested_table_type_definition )
            int alt24=2;
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

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:161:4: varray_type_definition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition771);
                    varray_type_definition96=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition96.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:162:4: nested_table_type_definition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition776);
                    nested_table_type_definition97=nested_table_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, nested_table_type_definition97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collection_type_definition"

    public static class varray_type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varray_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:165:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
    public final PLSQLParser.varray_type_definition_return varray_type_definition() throws RecognitionException {
        PLSQLParser.varray_type_definition_return retval = new PLSQLParser.varray_type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree VARYING98_tree=null;
        CommonTree ARRAY99_tree=null;
        CommonTree VARRAY100_tree=null;
        CommonTree LPAREN101_tree=null;
        CommonTree RPAREN103_tree=null;
        CommonTree NOT106_tree=null;
        CommonTree NULL107_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:4: ( VARYING ( ARRAY )? | VARRAY )
            int alt26=2;
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

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:6: VARYING ( ARRAY )?
                    {
                    VARYING98=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition789); 
                    VARYING98_tree = (CommonTree)adaptor.create(VARYING98);
                    adaptor.addChild(root_0, VARYING98_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:14: ( ARRAY )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ARRAY) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:14: ARRAY
                            {
                            ARRAY99=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition791); 
                            ARRAY99_tree = (CommonTree)adaptor.create(ARRAY99);
                            adaptor.addChild(root_0, ARRAY99_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:23: VARRAY
                    {
                    VARRAY100=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition796); 
                    VARRAY100_tree = (CommonTree)adaptor.create(VARRAY100);
                    adaptor.addChild(root_0, VARRAY100_tree);


                    }
                    break;

            }

            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition800); 
            LPAREN101_tree = (CommonTree)adaptor.create(LPAREN101);
            adaptor.addChild(root_0, LPAREN101_tree);

            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition802);
            numeric_literal102=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal102.getTree());
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition804); 
            RPAREN103_tree = (CommonTree)adaptor.create(RPAREN103);
            adaptor.addChild(root_0, RPAREN103_tree);

            pushFollow(FOLLOW_kOF_in_varray_type_definition806);
            kOF104=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF104.getTree());
            pushFollow(FOLLOW_datatype_in_varray_type_definition808);
            datatype105=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype105.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:75: ( NOT NULL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:166:77: NOT NULL
                    {
                    NOT106=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition812); 
                    NOT106_tree = (CommonTree)adaptor.create(NOT106);
                    adaptor.addChild(root_0, NOT106_tree);

                    NULL107=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition814); 
                    NULL107_tree = (CommonTree)adaptor.create(NULL107);
                    adaptor.addChild(root_0, NULL107_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varray_type_definition"

    public static class nested_table_type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_table_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:169:1: nested_table_type_definition : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
    public final PLSQLParser.nested_table_type_definition_return nested_table_type_definition() throws RecognitionException {
        PLSQLParser.nested_table_type_definition_return retval = new PLSQLParser.nested_table_type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TABLE108=null;
        Token NOT111=null;
        Token NULL112=null;
        Token INDEX113=null;
        Token BY114=null;
        PLSQLParser.kOF_return kOF109 = null;

        PLSQLParser.datatype_return datatype110 = null;

        PLSQLParser.associative_index_type_return associative_index_type115 = null;


        CommonTree TABLE108_tree=null;
        CommonTree NOT111_tree=null;
        CommonTree NULL112_tree=null;
        CommonTree INDEX113_tree=null;
        CommonTree BY114_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:2: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:4: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            TABLE108=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition828); 
            TABLE108_tree = (CommonTree)adaptor.create(TABLE108);
            adaptor.addChild(root_0, TABLE108_tree);

            pushFollow(FOLLOW_kOF_in_nested_table_type_definition830);
            kOF109=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF109.getTree());
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition832);
            datatype110=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype110.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:23: ( NOT NULL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:25: NOT NULL
                    {
                    NOT111=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition836); 
                    NOT111_tree = (CommonTree)adaptor.create(NOT111);
                    adaptor.addChild(root_0, NOT111_tree);

                    NULL112=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition838); 
                    NULL112_tree = (CommonTree)adaptor.create(NULL112);
                    adaptor.addChild(root_0, NULL112_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:37: ( INDEX BY associative_index_type )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==INDEX) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:170:39: INDEX BY associative_index_type
                    {
                    INDEX113=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition845); 
                    INDEX113_tree = (CommonTree)adaptor.create(INDEX113);
                    adaptor.addChild(root_0, INDEX113_tree);

                    BY114=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition847); 
                    BY114_tree = (CommonTree)adaptor.create(BY114);
                    adaptor.addChild(root_0, BY114_tree);

                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition849);
                    associative_index_type115=associative_index_type();

                    state._fsp--;

                    adaptor.addChild(root_0, associative_index_type115.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nested_table_type_definition"

    public static class associative_index_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "associative_index_type"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:173:1: associative_index_type : datatype ;
    public final PLSQLParser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQLParser.associative_index_type_return retval = new PLSQLParser.associative_index_type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.datatype_return datatype116 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:174:2: ( datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:174:4: datatype
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_associative_index_type863);
            datatype116=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype116.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "associative_index_type"

    public static class ref_cursor_type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ref_cursor_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:177:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
    public final PLSQLParser.ref_cursor_type_definition_return ref_cursor_type_definition() throws RecognitionException {
        PLSQLParser.ref_cursor_type_definition_return retval = new PLSQLParser.ref_cursor_type_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REF117=null;
        Token CURSOR118=null;
        Token RETURN119=null;
        PLSQLParser.datatype_return datatype120 = null;


        CommonTree REF117_tree=null;
        CommonTree CURSOR118_tree=null;
        CommonTree RETURN119_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:178:2: ( REF CURSOR ( RETURN datatype )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:178:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (CommonTree)adaptor.nil();

            REF117=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition874); 
            REF117_tree = (CommonTree)adaptor.create(REF117);
            adaptor.addChild(root_0, REF117_tree);

            CURSOR118=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition876); 
            CURSOR118_tree = (CommonTree)adaptor.create(CURSOR118);
            adaptor.addChild(root_0, CURSOR118_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:178:15: ( RETURN datatype )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RETURN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:178:17: RETURN datatype
                    {
                    RETURN119=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition880); 
                    RETURN119_tree = (CommonTree)adaptor.create(RETURN119);
                    adaptor.addChild(root_0, RETURN119_tree);

                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition882);
                    datatype120=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype120.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ref_cursor_type_definition"

    public static class datatype_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:181:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
    public final PLSQLParser.datatype_return datatype() throws RecognitionException {
        PLSQLParser.datatype_return retval = new PLSQLParser.datatype_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree REF121_tree=null;
        CommonTree ID122_tree=null;
        CommonTree DOT123_tree=null;
        CommonTree ID124_tree=null;
        CommonTree LPAREN125_tree=null;
        CommonTree COMMA127_tree=null;
        CommonTree RPAREN129_tree=null;
        CommonTree PERCENT130_tree=null;
        CommonTree ROWTYPE132_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:7: ( REF )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==REF) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:9: REF
                    {
                    REF121=(Token)match(input,REF,FOLLOW_REF_in_datatype901); 
                    REF121_tree = (CommonTree)adaptor.create(REF121);
                    adaptor.addChild(root_0, REF121_tree);


                    }
                    break;

            }

            ID122=(Token)match(input,ID,FOLLOW_ID_in_datatype906); 
            ID122_tree = (CommonTree)adaptor.create(ID122);
            adaptor.addChild(root_0, ID122_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:19: ( DOT ID )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DOT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:21: DOT ID
                    {
                    DOT123=(Token)match(input,DOT,FOLLOW_DOT_in_datatype910); 
                    DOT123_tree = (CommonTree)adaptor.create(DOT123);
                    adaptor.addChild(root_0, DOT123_tree);

                    ID124=(Token)match(input,ID,FOLLOW_ID_in_datatype912); 
                    ID124_tree = (CommonTree)adaptor.create(ID124);
                    adaptor.addChild(root_0, ID124_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LPAREN) ) {
                alt35=1;
            }
            else if ( (LA35_0==PERCENT) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype919); 
                    LPAREN125_tree = (CommonTree)adaptor.create(LPAREN125);
                    adaptor.addChild(root_0, LPAREN125_tree);

                    pushFollow(FOLLOW_numeric_literal_in_datatype921);
                    numeric_literal126=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal126.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:56: ( COMMA numeric_literal )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:58: COMMA numeric_literal
                    	    {
                    	    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype925); 
                    	    COMMA127_tree = (CommonTree)adaptor.create(COMMA127);
                    	    adaptor.addChild(root_0, COMMA127_tree);

                    	    pushFollow(FOLLOW_numeric_literal_in_datatype927);
                    	    numeric_literal128=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype932); 
                    RPAREN129_tree = (CommonTree)adaptor.create(RPAREN129);
                    adaptor.addChild(root_0, RPAREN129_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    PERCENT130=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype936); 
                    PERCENT130_tree = (CommonTree)adaptor.create(PERCENT130);
                    adaptor.addChild(root_0, PERCENT130_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:100: ( kTYPE | ROWTYPE )
                    int alt34=2;
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

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:102: kTYPE
                            {
                            pushFollow(FOLLOW_kTYPE_in_datatype940);
                            kTYPE131=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE131.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:182:110: ROWTYPE
                            {
                            ROWTYPE132=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype944); 
                            ROWTYPE132_tree = (CommonTree)adaptor.create(ROWTYPE132);
                            adaptor.addChild(root_0, ROWTYPE132_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype"

    public static class function_declaration_or_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:1: function_declaration_or_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLParser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQLParser.function_declaration_or_definition_return retval = new PLSQLParser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set134=null;
        Token set135=null;
        PLSQLParser.function_heading_return function_heading133 = null;

        PLSQLParser.declare_section_return declare_section136 = null;

        PLSQLParser.body_return body137 = null;


        CommonTree set134_tree=null;
        CommonTree set135_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:185:36: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:186:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition970);
            function_heading133=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading133.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:187:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=DETERMINISTIC && LA36_0<=RESULT_CACHE)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    set134=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set134));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IS||LA38_0==AS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:11: ( IS | AS ) ( declare_section )? body
                    {
                    set135=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set135));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:23: ( declare_section )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=PROCEDURE && LA37_0<=FUNCTION)||LA37_0==CURSOR||LA37_0==SUBTYPE||LA37_0==PRAGMA) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:188:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1019);
                            declare_section136=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section136.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1022);
                    body137=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body137.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration_or_definition"

    public static class function_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQLParser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQLParser.function_declaration_return retval = new PLSQLParser.function_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set139=null;
        PLSQLParser.function_heading_return function_heading138 = null;


        CommonTree set139_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:191:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:192:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration1043);
            function_heading138=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading138.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:193:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=DETERMINISTIC && LA39_0<=RESULT_CACHE)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    set139=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set139));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration"

    public static class function_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:196:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body ;
    public final PLSQLParser.function_definition_return function_definition() throws RecognitionException {
        PLSQLParser.function_definition_return retval = new PLSQLParser.function_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set141=null;
        Token set142=null;
        PLSQLParser.function_heading_return function_heading140 = null;

        PLSQLParser.declare_section_return declare_section143 = null;

        PLSQLParser.body_return body144 = null;


        CommonTree set141_tree=null;
        CommonTree set142_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:196:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:197:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_definition1091);
            function_heading140=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading140.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:198:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=DETERMINISTIC && LA40_0<=RESULT_CACHE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            	    {
            	    set141=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set141));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            set142=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set142));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:199:21: ( declare_section )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=PROCEDURE && LA41_0<=FUNCTION)||LA41_0==CURSOR||LA41_0==SUBTYPE||LA41_0==PRAGMA) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:199:21: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_function_definition1138);
                    declare_section143=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section143.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_function_definition1141);
            body144=body();

            state._fsp--;

            adaptor.addChild(root_0, body144.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class procedure_declaration_or_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:202:1: procedure_declaration_or_definition : procedure_heading ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLParser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQLParser.procedure_declaration_or_definition_return retval = new PLSQLParser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set146=null;
        PLSQLParser.procedure_heading_return procedure_heading145 = null;

        PLSQLParser.declare_section_return declare_section147 = null;

        PLSQLParser.body_return body148 = null;


        CommonTree set146_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:202:37: ( procedure_heading ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:203:9: procedure_heading ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1159);
            procedure_heading145=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading145.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:204:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IS||LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:204:11: ( IS | AS ) ( declare_section )? body
                    {
                    set146=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set146));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:204:23: ( declare_section )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=PROCEDURE && LA42_0<=FUNCTION)||LA42_0==CURSOR||LA42_0==SUBTYPE||LA42_0==PRAGMA) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:204:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1181);
                            declare_section147=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section147.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1184);
                    body148=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body148.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_declaration_or_definition"

    public static class procedure_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:1: procedure_declaration : procedure_heading ;
    public final PLSQLParser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQLParser.procedure_declaration_return retval = new PLSQLParser.procedure_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.procedure_heading_return procedure_heading149 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:207:23: ( procedure_heading )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:208:2: procedure_heading
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1201);
            procedure_heading149=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading149.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_declaration"

    public static class procedure_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:211:1: procedure_definition : procedure_heading ( IS | AS ) ( declare_section )? body ;
    public final PLSQLParser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQLParser.procedure_definition_return retval = new PLSQLParser.procedure_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set151=null;
        PLSQLParser.procedure_heading_return procedure_heading150 = null;

        PLSQLParser.declare_section_return declare_section152 = null;

        PLSQLParser.body_return body153 = null;


        CommonTree set151_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:211:22: ( procedure_heading ( IS | AS ) ( declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:212:2: procedure_heading ( IS | AS ) ( declare_section )? body
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1212);
            procedure_heading150=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading150.getTree());
            set151=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set151));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:213:14: ( declare_section )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=PROCEDURE && LA44_0<=FUNCTION)||LA44_0==CURSOR||LA44_0==SUBTYPE||LA44_0==PRAGMA) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:213:14: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1225);
                    declare_section152=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section152.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_procedure_definition1228);
            body153=body();

            state._fsp--;

            adaptor.addChild(root_0, body153.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_definition"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:216:1: body : BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? ;
    public final PLSQLParser.body_return body() throws RecognitionException {
        PLSQLParser.body_return retval = new PLSQLParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree BEGIN154_tree=null;
        CommonTree SEMI156_tree=null;
        CommonTree SEMI158_tree=null;
        CommonTree SEMI160_tree=null;
        CommonTree EXCEPTION161_tree=null;
        CommonTree END163_tree=null;
        CommonTree ID164_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:216:7: ( BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:217:2: BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN154=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1242); 
            BEGIN154_tree = (CommonTree)adaptor.create(BEGIN154);
            adaptor.addChild(root_0, BEGIN154_tree);

            pushFollow(FOLLOW_statement_in_body1244);
            statement155=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement155.getTree());
            SEMI156=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1246); 
            SEMI156_tree = (CommonTree)adaptor.create(SEMI156);
            adaptor.addChild(root_0, SEMI156_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:217:23: ( statement SEMI | pragma SEMI )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ID||LA45_0==RETURN||LA45_0==NULL||LA45_0==BEGIN||(LA45_0>=COLON && LA45_0<=CASE)||(LA45_0>=CLOSE && LA45_0<=EXECUTE)||(LA45_0>=EXIT && LA45_0<=FETCH)||(LA45_0>=FOR && LA45_0<=FORALL)||(LA45_0>=GOTO && LA45_0<=IF)||LA45_0==OPEN||(LA45_0>=RAISE && LA45_0<=LLABEL)||(LA45_0>=COMMIT && LA45_0<=SET)||(LA45_0>=UPDATE && LA45_0<=WHILE)) ) {
                    alt45=1;
                }
                else if ( (LA45_0==PRAGMA) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:217:25: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_body1250);
            	    statement157=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement157.getTree());
            	    SEMI158=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1252); 
            	    SEMI158_tree = (CommonTree)adaptor.create(SEMI158);
            	    adaptor.addChild(root_0, SEMI158_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:217:42: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_body1256);
            	    pragma159=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma159.getTree());
            	    SEMI160=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1258); 
            	    SEMI160_tree = (CommonTree)adaptor.create(SEMI160);
            	    adaptor.addChild(root_0, SEMI160_tree);


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:2: ( EXCEPTION ( exception_handler )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EXCEPTION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:4: EXCEPTION ( exception_handler )+
                    {
                    EXCEPTION161=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body1266); 
                    EXCEPTION161_tree = (CommonTree)adaptor.create(EXCEPTION161);
                    adaptor.addChild(root_0, EXCEPTION161_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:14: ( exception_handler )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==WHEN) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:14: exception_handler
                    	    {
                    	    pushFollow(FOLLOW_exception_handler_in_body1268);
                    	    exception_handler162=exception_handler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exception_handler162.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;

            }

            END163=(Token)match(input,END,FOLLOW_END_in_body1274); 
            END163_tree = (CommonTree)adaptor.create(END163);
            adaptor.addChild(root_0, END163_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:40: ( ID )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:218:40: ID
                    {
                    ID164=(Token)match(input,ID,FOLLOW_ID_in_body1276); 
                    ID164_tree = (CommonTree)adaptor.create(ID164);
                    adaptor.addChild(root_0, ID164_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class exception_handler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_handler"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:221:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQLParser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQLParser.exception_handler_return retval = new PLSQLParser.exception_handler_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN165=null;
        Token OR167=null;
        Token OTHERS169=null;
        Token THEN170=null;
        Token SEMI172=null;
        PLSQLParser.qual_id_return qual_id166 = null;

        PLSQLParser.qual_id_return qual_id168 = null;

        PLSQLParser.statement_return statement171 = null;


        CommonTree WHEN165_tree=null;
        CommonTree OR167_tree=null;
        CommonTree OTHERS169_tree=null;
        CommonTree THEN170_tree=null;
        CommonTree SEMI172_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (CommonTree)adaptor.nil();

            WHEN165=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1288); 
            WHEN165_tree = (CommonTree)adaptor.create(WHEN165);
            adaptor.addChild(root_0, WHEN165_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:9: ( qual_id ( OR qual_id )* | OTHERS )
            int alt50=2;
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

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:11: qual_id ( OR qual_id )*
                    {
                    pushFollow(FOLLOW_qual_id_in_exception_handler1292);
                    qual_id166=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id166.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:19: ( OR qual_id )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==OR) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:21: OR qual_id
                    	    {
                    	    OR167=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1296); 
                    	    OR167_tree = (CommonTree)adaptor.create(OR167);
                    	    adaptor.addChild(root_0, OR167_tree);

                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1298);
                    	    qual_id168=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:222:37: OTHERS
                    {
                    OTHERS169=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1305); 
                    OTHERS169_tree = (CommonTree)adaptor.create(OTHERS169);
                    adaptor.addChild(root_0, OTHERS169_tree);


                    }
                    break;

            }

            THEN170=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1311); 
            THEN170_tree = (CommonTree)adaptor.create(THEN170);
            adaptor.addChild(root_0, THEN170_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:223:8: ( statement SEMI )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ID||LA51_0==RETURN||LA51_0==NULL||LA51_0==BEGIN||(LA51_0>=COLON && LA51_0<=CASE)||(LA51_0>=CLOSE && LA51_0<=EXECUTE)||(LA51_0>=EXIT && LA51_0<=FETCH)||(LA51_0>=FOR && LA51_0<=FORALL)||(LA51_0>=GOTO && LA51_0<=IF)||LA51_0==OPEN||(LA51_0>=RAISE && LA51_0<=LLABEL)||(LA51_0>=COMMIT && LA51_0<=SET)||(LA51_0>=UPDATE && LA51_0<=WHILE)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:223:10: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_exception_handler1315);
            	    statement171=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement171.getTree());
            	    SEMI172=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1317); 
            	    SEMI172_tree = (CommonTree)adaptor.create(SEMI172);
            	    adaptor.addChild(root_0, SEMI172_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exception_handler"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:226:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQLParser.statement_return statement() throws RecognitionException {
        PLSQLParser.statement_return retval = new PLSQLParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:226:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:227:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:227:5: ( label )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LLABEL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:227:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statement1335);
            	    label173=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label173.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:228:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            int alt53=19;
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

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:228:7: assign_or_call_statement
                    {
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1344);
                    assign_or_call_statement174=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement174.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:229:7: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_statement1352);
                    case_statement175=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement175.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:230:7: close_statement
                    {
                    pushFollow(FOLLOW_close_statement_in_statement1360);
                    close_statement176=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement176.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:231:7: continue_statement
                    {
                    pushFollow(FOLLOW_continue_statement_in_statement1368);
                    continue_statement177=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement177.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:232:7: basic_loop_statement
                    {
                    pushFollow(FOLLOW_basic_loop_statement_in_statement1376);
                    basic_loop_statement178=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement178.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:233:7: execute_immediate_statement
                    {
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement1384);
                    execute_immediate_statement179=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement179.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:234:7: exit_statement
                    {
                    pushFollow(FOLLOW_exit_statement_in_statement1392);
                    exit_statement180=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement180.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:235:7: fetch_statement
                    {
                    pushFollow(FOLLOW_fetch_statement_in_statement1400);
                    fetch_statement181=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement181.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:236:7: for_loop_statement
                    {
                    pushFollow(FOLLOW_for_loop_statement_in_statement1408);
                    for_loop_statement182=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement182.getTree());

                    }
                    break;
                case 10 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:237:7: forall_statement
                    {
                    pushFollow(FOLLOW_forall_statement_in_statement1416);
                    forall_statement183=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement183.getTree());

                    }
                    break;
                case 11 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:238:7: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_statement1424);
                    goto_statement184=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement184.getTree());

                    }
                    break;
                case 12 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:239:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement1432);
                    if_statement185=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement185.getTree());

                    }
                    break;
                case 13 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:240:7: null_statement
                    {
                    pushFollow(FOLLOW_null_statement_in_statement1440);
                    null_statement186=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement186.getTree());

                    }
                    break;
                case 14 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:241:7: open_statement
                    {
                    pushFollow(FOLLOW_open_statement_in_statement1448);
                    open_statement187=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement187.getTree());

                    }
                    break;
                case 15 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:242:7: plsql_block
                    {
                    pushFollow(FOLLOW_plsql_block_in_statement1456);
                    plsql_block188=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block188.getTree());

                    }
                    break;
                case 16 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:243:7: raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_statement1464);
                    raise_statement189=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement189.getTree());

                    }
                    break;
                case 17 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:244:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1472);
                    return_statement190=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement190.getTree());

                    }
                    break;
                case 18 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:245:7: sql_statement
                    {
                    pushFollow(FOLLOW_sql_statement_in_statement1480);
                    sql_statement191=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement191.getTree());

                    }
                    break;
                case 19 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:246:7: while_loop_statement
                    {
                    pushFollow(FOLLOW_while_loop_statement_in_statement1488);
                    while_loop_statement192=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement192.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class lvalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:250:1: lvalue : call ( DOT call )* ;
    public final PLSQLParser.lvalue_return lvalue() throws RecognitionException {
        PLSQLParser.lvalue_return retval = new PLSQLParser.lvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT194=null;
        PLSQLParser.call_return call193 = null;

        PLSQLParser.call_return call195 = null;


        CommonTree DOT194_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:251:5: ( call ( DOT call )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:251:7: call ( DOT call )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_call_in_lvalue1511);
            call193=call();

            state._fsp--;

            adaptor.addChild(root_0, call193.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:251:12: ( DOT call )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==DOT) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==ID||LA54_1==COLON) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:251:14: DOT call
            	    {
            	    DOT194=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1515); 
            	    DOT194_tree = (CommonTree)adaptor.create(DOT194);
            	    adaptor.addChild(root_0, DOT194_tree);

            	    pushFollow(FOLLOW_call_in_lvalue1517);
            	    call195=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call195.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class assign_or_call_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_or_call_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:254:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQLParser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQLParser.assign_or_call_statement_return retval = new PLSQLParser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT197=null;
        Token ASSIGN199=null;
        PLSQLParser.lvalue_return lvalue196 = null;

        PLSQLParser.delete_call_return delete_call198 = null;

        PLSQLParser.expression_return expression200 = null;


        CommonTree DOT197_tree=null;
        CommonTree ASSIGN199_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:255:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:255:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement1537);
            lvalue196=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue196.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:255:14: ( DOT delete_call | ASSIGN expression )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOT) ) {
                alt55=1;
            }
            else if ( (LA55_0==ASSIGN) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:255:16: DOT delete_call
                    {
                    DOT197=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement1541); 
                    DOT197_tree = (CommonTree)adaptor.create(DOT197);
                    adaptor.addChild(root_0, DOT197_tree);

                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement1543);
                    delete_call198=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call198.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:255:34: ASSIGN expression
                    {
                    ASSIGN199=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement1547); 
                    ASSIGN199_tree = (CommonTree)adaptor.create(ASSIGN199);
                    adaptor.addChild(root_0, ASSIGN199_tree);

                    pushFollow(FOLLOW_expression_in_assign_or_call_statement1549);
                    expression200=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression200.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign_or_call_statement"

    public static class call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:258:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ;
    public final PLSQLParser.call_return call() throws RecognitionException {
        PLSQLParser.call_return retval = new PLSQLParser.call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON201=null;
        Token ID202=null;
        Token LPAREN203=null;
        Token COMMA205=null;
        Token RPAREN207=null;
        PLSQLParser.parameter_return parameter204 = null;

        PLSQLParser.parameter_return parameter206 = null;


        CommonTree COLON201_tree=null;
        CommonTree ID202_tree=null;
        CommonTree LPAREN203_tree=null;
        CommonTree COMMA205_tree=null;
        CommonTree RPAREN207_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:7: ( COLON )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:7: COLON
                    {
                    COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_call1569); 
                    COLON201_tree = (CommonTree)adaptor.create(COLON201);
                    adaptor.addChild(root_0, COLON201_tree);


                    }
                    break;

            }

            ID202=(Token)match(input,ID,FOLLOW_ID_in_call1572); 
            ID202_tree = (CommonTree)adaptor.create(ID202);
            adaptor.addChild(root_0, ID202_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LPAREN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    LPAREN203=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call1576); 
                    LPAREN203_tree = (CommonTree)adaptor.create(LPAREN203);
                    adaptor.addChild(root_0, LPAREN203_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:26: ( parameter ( COMMA parameter )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ID||LA58_0==LPAREN||(LA58_0>=NOT && LA58_0<=NULL)||LA58_0==COLON||(LA58_0>=MINUS && LA58_0<=PLUS)||LA58_0==SQL||(LA58_0>=INTEGER && LA58_0<=QUOTED_STRING)||(LA58_0>=INSERTING && LA58_0<=DELETING)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:28: parameter ( COMMA parameter )*
                            {
                            pushFollow(FOLLOW_parameter_in_call1580);
                            parameter204=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter204.getTree());
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:38: ( COMMA parameter )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==COMMA) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:259:40: COMMA parameter
                            	    {
                            	    COMMA205=(Token)match(input,COMMA,FOLLOW_COMMA_in_call1584); 
                            	    COMMA205_tree = (CommonTree)adaptor.create(COMMA205);
                            	    adaptor.addChild(root_0, COMMA205_tree);

                            	    pushFollow(FOLLOW_parameter_in_call1586);
                            	    parameter206=parameter();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, parameter206.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN207=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call1594); 
                    RPAREN207_tree = (CommonTree)adaptor.create(RPAREN207);
                    adaptor.addChild(root_0, RPAREN207_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class delete_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:262:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQLParser.delete_call_return delete_call() throws RecognitionException {
        PLSQLParser.delete_call_return retval = new PLSQLParser.delete_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DELETE208=null;
        Token LPAREN209=null;
        Token RPAREN211=null;
        PLSQLParser.parameter_return parameter210 = null;


        CommonTree DELETE208_tree=null;
        CommonTree LPAREN209_tree=null;
        CommonTree RPAREN211_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (CommonTree)adaptor.nil();

            DELETE208=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call1614); 
            DELETE208_tree = (CommonTree)adaptor.create(DELETE208);
            adaptor.addChild(root_0, DELETE208_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:14: ( LPAREN ( parameter )? RPAREN )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LPAREN) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:16: LPAREN ( parameter )? RPAREN
                    {
                    LPAREN209=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call1618); 
                    LPAREN209_tree = (CommonTree)adaptor.create(LPAREN209);
                    adaptor.addChild(root_0, LPAREN209_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:23: ( parameter )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ID||LA60_0==LPAREN||(LA60_0>=NOT && LA60_0<=NULL)||LA60_0==COLON||(LA60_0>=MINUS && LA60_0<=PLUS)||LA60_0==SQL||(LA60_0>=INTEGER && LA60_0<=QUOTED_STRING)||(LA60_0>=INSERTING && LA60_0<=DELETING)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:263:23: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_delete_call1620);
                            parameter210=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter210.getTree());

                            }
                            break;

                    }

                    RPAREN211=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call1623); 
                    RPAREN211_tree = (CommonTree)adaptor.create(RPAREN211);
                    adaptor.addChild(root_0, RPAREN211_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_call"

    public static class basic_loop_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQLParser.basic_loop_statement_return retval = new PLSQLParser.basic_loop_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOOP212=null;
        Token SEMI214=null;
        Token END215=null;
        Token LOOP216=null;
        PLSQLParser.statement_return statement213 = null;

        PLSQLParser.label_name_return label_name217 = null;


        CommonTree LOOP212_tree=null;
        CommonTree SEMI214_tree=null;
        CommonTree END215_tree=null;
        CommonTree LOOP216_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:266:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:267:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (CommonTree)adaptor.nil();

            LOOP212=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1647); 
            LOOP212_tree = (CommonTree)adaptor.create(LOOP212);
            adaptor.addChild(root_0, LOOP212_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:267:14: ( statement SEMI )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==ID||LA62_0==RETURN||LA62_0==NULL||LA62_0==BEGIN||(LA62_0>=COLON && LA62_0<=CASE)||(LA62_0>=CLOSE && LA62_0<=EXECUTE)||(LA62_0>=EXIT && LA62_0<=FETCH)||(LA62_0>=FOR && LA62_0<=FORALL)||(LA62_0>=GOTO && LA62_0<=IF)||LA62_0==OPEN||(LA62_0>=RAISE && LA62_0<=LLABEL)||(LA62_0>=COMMIT && LA62_0<=SET)||(LA62_0>=UPDATE && LA62_0<=WHILE)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:267:16: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement1651);
            	    statement213=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement213.getTree());
            	    SEMI214=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement1653); 
            	    SEMI214_tree = (CommonTree)adaptor.create(SEMI214);
            	    adaptor.addChild(root_0, SEMI214_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            END215=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement1658); 
            END215_tree = (CommonTree)adaptor.create(END215);
            adaptor.addChild(root_0, END215_tree);

            LOOP216=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1660); 
            LOOP216_tree = (CommonTree)adaptor.create(LOOP216);
            adaptor.addChild(root_0, LOOP216_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:267:43: ( label_name )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:267:43: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement1662);
                    label_name217=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name217.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basic_loop_statement"

    public static class case_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQLParser.case_statement_return case_statement() throws RecognitionException {
        PLSQLParser.case_statement_return retval = new PLSQLParser.case_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree CASE218_tree=null;
        CommonTree WHEN220_tree=null;
        CommonTree THEN222_tree=null;
        CommonTree SEMI224_tree=null;
        CommonTree ELSE225_tree=null;
        CommonTree SEMI227_tree=null;
        CommonTree END228_tree=null;
        CommonTree CASE229_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:270:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:271:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (CommonTree)adaptor.nil();

            CASE218=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement1684); 
            CASE218_tree = (CommonTree)adaptor.create(CASE218);
            adaptor.addChild(root_0, CASE218_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:271:14: ( expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID||LA64_0==LPAREN||(LA64_0>=NOT && LA64_0<=NULL)||LA64_0==COLON||(LA64_0>=MINUS && LA64_0<=PLUS)||LA64_0==SQL||(LA64_0>=INTEGER && LA64_0<=QUOTED_STRING)||(LA64_0>=INSERTING && LA64_0<=DELETING)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:271:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_case_statement1686);
                    expression219=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression219.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:272:9: ( WHEN expression THEN ( statement SEMI )+ )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==WHEN) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:272:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    WHEN220=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement1699); 
            	    WHEN220_tree = (CommonTree)adaptor.create(WHEN220);
            	    adaptor.addChild(root_0, WHEN220_tree);

            	    pushFollow(FOLLOW_expression_in_case_statement1701);
            	    expression221=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression221.getTree());
            	    THEN222=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement1703); 
            	    THEN222_tree = (CommonTree)adaptor.create(THEN222);
            	    adaptor.addChild(root_0, THEN222_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:272:32: ( statement SEMI )+
            	    int cnt65=0;
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==ID||LA65_0==RETURN||LA65_0==NULL||LA65_0==BEGIN||(LA65_0>=COLON && LA65_0<=CASE)||(LA65_0>=CLOSE && LA65_0<=EXECUTE)||(LA65_0>=EXIT && LA65_0<=FETCH)||(LA65_0>=FOR && LA65_0<=FORALL)||(LA65_0>=GOTO && LA65_0<=IF)||LA65_0==OPEN||(LA65_0>=RAISE && LA65_0<=LLABEL)||(LA65_0>=COMMIT && LA65_0<=SET)||(LA65_0>=UPDATE && LA65_0<=WHILE)) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:272:34: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_case_statement1707);
            	    	    statement223=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement223.getTree());
            	    	    SEMI224=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1709); 
            	    	    SEMI224_tree = (CommonTree)adaptor.create(SEMI224);
            	    	    adaptor.addChild(root_0, SEMI224_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt65 >= 1 ) break loop65;
            	                EarlyExitException eee =
            	                    new EarlyExitException(65, input);
            	                throw eee;
            	        }
            	        cnt65++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:273:9: ( ELSE statement SEMI )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ELSE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:273:11: ELSE statement SEMI
                    {
                    ELSE225=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement1727); 
                    ELSE225_tree = (CommonTree)adaptor.create(ELSE225);
                    adaptor.addChild(root_0, ELSE225_tree);

                    pushFollow(FOLLOW_statement_in_case_statement1729);
                    statement226=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement226.getTree());
                    SEMI227=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1731); 
                    SEMI227_tree = (CommonTree)adaptor.create(SEMI227);
                    adaptor.addChild(root_0, SEMI227_tree);


                    }
                    break;

            }

            END228=(Token)match(input,END,FOLLOW_END_in_case_statement1744); 
            END228_tree = (CommonTree)adaptor.create(END228);
            adaptor.addChild(root_0, END228_tree);

            CASE229=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement1746); 
            CASE229_tree = (CommonTree)adaptor.create(CASE229);
            adaptor.addChild(root_0, CASE229_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:274:18: ( label_name )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:274:18: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_case_statement1748);
                    label_name230=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name230.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "case_statement"

    public static class close_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "close_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:277:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQLParser.close_statement_return close_statement() throws RecognitionException {
        PLSQLParser.close_statement_return retval = new PLSQLParser.close_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLOSE231=null;
        Token ID232=null;
        Token DOT233=null;
        Token ID234=null;

        CommonTree CLOSE231_tree=null;
        CommonTree ID232_tree=null;
        CommonTree DOT233_tree=null;
        CommonTree ID234_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:277:17: ( CLOSE ID ( DOT ID )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:278:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            CLOSE231=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement1770); 
            CLOSE231_tree = (CommonTree)adaptor.create(CLOSE231);
            adaptor.addChild(root_0, CLOSE231_tree);

            ID232=(Token)match(input,ID,FOLLOW_ID_in_close_statement1772); 
            ID232_tree = (CommonTree)adaptor.create(ID232);
            adaptor.addChild(root_0, ID232_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:278:18: ( DOT ID )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:278:20: DOT ID
                    {
                    DOT233=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement1776); 
                    DOT233_tree = (CommonTree)adaptor.create(DOT233);
                    adaptor.addChild(root_0, DOT233_tree);

                    ID234=(Token)match(input,ID,FOLLOW_ID_in_close_statement1778); 
                    ID234_tree = (CommonTree)adaptor.create(ID234);
                    adaptor.addChild(root_0, ID234_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "close_statement"

    public static class continue_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continue_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:281:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLParser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQLParser.continue_statement_return retval = new PLSQLParser.continue_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lbl=null;
        Token CONTINUE235=null;
        Token WHEN236=null;
        PLSQLParser.expression_return expression237 = null;


        CommonTree lbl_tree=null;
        CommonTree CONTINUE235_tree=null;
        CommonTree WHEN236_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:281:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:282:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            CONTINUE235=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement1802); 
            CONTINUE235_tree = (CommonTree)adaptor.create(CONTINUE235);
            adaptor.addChild(root_0, CONTINUE235_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:282:18: (lbl= ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:282:20: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement1808); 
                    lbl_tree = (CommonTree)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:282:30: ( WHEN expression )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==WHEN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:282:32: WHEN expression
                    {
                    WHEN236=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement1815); 
                    WHEN236_tree = (CommonTree)adaptor.create(WHEN236);
                    adaptor.addChild(root_0, WHEN236_tree);

                    pushFollow(FOLLOW_expression_in_continue_statement1817);
                    expression237=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression237.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continue_statement"

    public static class execute_immediate_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute_immediate_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQLParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQLParser.execute_immediate_statement_return retval = new PLSQLParser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXECUTE238=null;
        Token IMMEDIATE239=null;
        PLSQLParser.expression_return expression240 = null;

        PLSQLParser.into_clause_return into_clause241 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause242 = null;

        PLSQLParser.using_clause_return using_clause243 = null;

        PLSQLParser.using_clause_return using_clause244 = null;

        PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause245 = null;

        PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause246 = null;


        CommonTree EXECUTE238_tree=null;
        CommonTree IMMEDIATE239_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:285:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:286:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (CommonTree)adaptor.nil();

            EXECUTE238=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement1841); 
            EXECUTE238_tree = (CommonTree)adaptor.create(EXECUTE238);
            adaptor.addChild(root_0, EXECUTE238_tree);

            IMMEDIATE239=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement1843); 
            IMMEDIATE239_tree = (CommonTree)adaptor.create(IMMEDIATE239);
            adaptor.addChild(root_0, IMMEDIATE239_tree);

            pushFollow(FOLLOW_expression_in_execute_immediate_statement1845);
            expression240=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression240.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:286:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            int alt75=4;
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

            switch (alt75) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:9: ( into_clause | bulk_collect_into_clause )
                    int alt72=2;
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

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:11: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement1859);
                            into_clause241=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause241.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:25: bulk_collect_into_clause
                            {
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement1863);
                            bulk_collect_into_clause242=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause242.getTree());

                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:51: ( using_clause )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==USING) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:287:51: using_clause
                            {
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement1866);
                            using_clause243=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause243.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:288:11: using_clause ( dynamic_returning_clause )?
                    {
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement1879);
                    using_clause244=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause244.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:288:24: ( dynamic_returning_clause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RETURN||LA74_0==RETURNING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:288:24: dynamic_returning_clause
                            {
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1881);
                            dynamic_returning_clause245=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause245.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:289:11: dynamic_returning_clause
                    {
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1894);
                    dynamic_returning_clause246=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause246.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "execute_immediate_statement"

    public static class exit_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:293:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLParser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQLParser.exit_statement_return retval = new PLSQLParser.exit_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lbl=null;
        Token EXIT247=null;
        Token WHEN248=null;
        PLSQLParser.expression_return expression249 = null;


        CommonTree lbl_tree=null;
        CommonTree EXIT247_tree=null;
        CommonTree WHEN248_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:293:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:294:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            EXIT247=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement1926); 
            EXIT247_tree = (CommonTree)adaptor.create(EXIT247);
            adaptor.addChild(root_0, EXIT247_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:294:14: (lbl= ID )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:294:16: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement1932); 
                    lbl_tree = (CommonTree)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:294:26: ( WHEN expression )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==WHEN) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:294:28: WHEN expression
                    {
                    WHEN248=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement1939); 
                    WHEN248_tree = (CommonTree)adaptor.create(WHEN248);
                    adaptor.addChild(root_0, WHEN248_tree);

                    pushFollow(FOLLOW_expression_in_exit_statement1941);
                    expression249=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression249.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exit_statement"

    public static class fetch_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fetch_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQLParser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQLParser.fetch_statement_return retval = new PLSQLParser.fetch_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FETCH250=null;
        Token LIMIT254=null;
        PLSQLParser.qual_id_return qual_id251 = null;

        PLSQLParser.into_clause_return into_clause252 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause253 = null;

        PLSQLParser.numeric_expression_return numeric_expression255 = null;


        CommonTree FETCH250_tree=null;
        CommonTree LIMIT254_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:297:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            FETCH250=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement1965); 
            FETCH250_tree = (CommonTree)adaptor.create(FETCH250);
            adaptor.addChild(root_0, FETCH250_tree);

            pushFollow(FOLLOW_qual_id_in_fetch_statement1967);
            qual_id251=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id251.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            int alt79=2;
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

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:25: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_fetch_statement1971);
                    into_clause252=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause252.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement1975);
                    bulk_collect_into_clause253=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause253.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:64: ( LIMIT numeric_expression )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==LIMIT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:298:66: LIMIT numeric_expression
                            {
                            LIMIT254=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement1979); 
                            LIMIT254_tree = (CommonTree)adaptor.create(LIMIT254);
                            adaptor.addChild(root_0, LIMIT254_tree);

                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement1981);
                            numeric_expression255=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression255.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fetch_statement"

    public static class into_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLParser.into_clause_return into_clause() throws RecognitionException {
        PLSQLParser.into_clause_return retval = new PLSQLParser.into_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTO256=null;
        Token COMMA258=null;
        PLSQLParser.lvalue_return lvalue257 = null;

        PLSQLParser.lvalue_return lvalue259 = null;


        CommonTree INTO256_tree=null;
        CommonTree COMMA258_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:301:13: ( INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:302:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (CommonTree)adaptor.nil();

            INTO256=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2011); 
            INTO256_tree = (CommonTree)adaptor.create(INTO256);
            adaptor.addChild(root_0, INTO256_tree);

            pushFollow(FOLLOW_lvalue_in_into_clause2013);
            lvalue257=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue257.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:302:21: ( COMMA lvalue )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:302:23: COMMA lvalue
            	    {
            	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2017); 
            	    COMMA258_tree = (CommonTree)adaptor.create(COMMA258);
            	    adaptor.addChild(root_0, COMMA258_tree);

            	    pushFollow(FOLLOW_lvalue_in_into_clause2019);
            	    lvalue259=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue259.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "into_clause"

    public static class bulk_collect_into_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bulk_collect_into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:305:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQLParser.bulk_collect_into_clause_return retval = new PLSQLParser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BULK260=null;
        Token COLLECT261=null;
        Token INTO262=null;
        Token COMMA264=null;
        PLSQLParser.lvalue_return lvalue263 = null;

        PLSQLParser.lvalue_return lvalue265 = null;


        CommonTree BULK260_tree=null;
        CommonTree COLLECT261_tree=null;
        CommonTree INTO262_tree=null;
        CommonTree COMMA264_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:305:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:306:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (CommonTree)adaptor.nil();

            BULK260=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2047); 
            BULK260_tree = (CommonTree)adaptor.create(BULK260);
            adaptor.addChild(root_0, BULK260_tree);

            COLLECT261=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2049); 
            COLLECT261_tree = (CommonTree)adaptor.create(COLLECT261);
            adaptor.addChild(root_0, COLLECT261_tree);

            INTO262=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2051); 
            INTO262_tree = (CommonTree)adaptor.create(INTO262);
            adaptor.addChild(root_0, INTO262_tree);

            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2053);
            lvalue263=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue263.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:306:34: ( COMMA lvalue )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:306:36: COMMA lvalue
            	    {
            	    COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2057); 
            	    COMMA264_tree = (CommonTree)adaptor.create(COMMA264);
            	    adaptor.addChild(root_0, COMMA264_tree);

            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2059);
            	    lvalue265=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue265.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bulk_collect_into_clause"

    public static class using_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:309:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQLParser.using_clause_return using_clause() throws RecognitionException {
        PLSQLParser.using_clause_return retval = new PLSQLParser.using_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USING266=null;
        Token COMMA269=null;
        PLSQLParser.param_modifiers_return param_modifiers267 = null;

        PLSQLParser.expression_return expression268 = null;

        PLSQLParser.param_modifiers_return param_modifiers270 = null;

        PLSQLParser.expression_return expression271 = null;


        CommonTree USING266_tree=null;
        CommonTree COMMA269_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:309:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            USING266=(Token)match(input,USING,FOLLOW_USING_in_using_clause2083); 
            USING266_tree = (CommonTree)adaptor.create(USING266);
            adaptor.addChild(root_0, USING266_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:15: ( param_modifiers )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=IN && LA82_0<=OUT)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:15: param_modifiers
                    {
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2085);
                    param_modifiers267=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers267.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_using_clause2088);
            expression268=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression268.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:43: ( COMMA ( param_modifiers )? expression )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:45: COMMA ( param_modifiers )? expression
            	    {
            	    COMMA269=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2092); 
            	    COMMA269_tree = (CommonTree)adaptor.create(COMMA269);
            	    adaptor.addChild(root_0, COMMA269_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:51: ( param_modifiers )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( ((LA83_0>=IN && LA83_0<=OUT)) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:310:51: param_modifiers
            	            {
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2094);
            	            param_modifiers270=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers270.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_using_clause2097);
            	    expression271=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression271.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "using_clause"

    public static class param_modifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_modifiers"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:313:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQLParser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQLParser.param_modifiers_return retval = new PLSQLParser.param_modifiers_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN272=null;
        Token OUT273=null;
        Token OUT274=null;

        CommonTree IN272_tree=null;
        CommonTree OUT273_tree=null;
        CommonTree OUT274_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:314:2: ( IN ( OUT )? | OUT )
            int alt86=2;
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

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:314:4: IN ( OUT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IN272=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2114); 
                    IN272_tree = (CommonTree)adaptor.create(IN272);
                    adaptor.addChild(root_0, IN272_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:314:7: ( OUT )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OUT) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:314:7: OUT
                            {
                            OUT273=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2116); 
                            OUT273_tree = (CommonTree)adaptor.create(OUT273);
                            adaptor.addChild(root_0, OUT273_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:314:14: OUT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OUT274=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2121); 
                    OUT274_tree = (CommonTree)adaptor.create(OUT274);
                    adaptor.addChild(root_0, OUT274_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_modifiers"

    public static class dynamic_returning_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_returning_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQLParser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQLParser.dynamic_returning_clause_return retval = new PLSQLParser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set275=null;
        PLSQLParser.into_clause_return into_clause276 = null;

        PLSQLParser.bulk_collect_into_clause_return bulk_collect_into_clause277 = null;


        CommonTree set275_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:317:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:318:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (CommonTree)adaptor.nil();

            set275=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set275));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:318:32: ( into_clause | bulk_collect_into_clause )
            int alt87=2;
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

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:318:34: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2151);
                    into_clause276=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause276.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:318:48: bulk_collect_into_clause
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2155);
                    bulk_collect_into_clause277=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause277.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dynamic_returning_clause"

    public static class for_loop_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQLParser.for_loop_statement_return retval = new PLSQLParser.for_loop_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree FOR278_tree=null;
        CommonTree ID279_tree=null;
        CommonTree IN280_tree=null;
        CommonTree set281_tree=null;
        CommonTree LOOP282_tree=null;
        CommonTree SEMI284_tree=null;
        CommonTree END285_tree=null;
        CommonTree LOOP286_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:321:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR278=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2178); 
            FOR278_tree = (CommonTree)adaptor.create(FOR278);
            adaptor.addChild(root_0, FOR278_tree);

            ID279=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2180); 
            ID279_tree = (CommonTree)adaptor.create(ID279);
            adaptor.addChild(root_0, ID279_tree);

            IN280=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2182); 
            IN280_tree = (CommonTree)adaptor.create(IN280);
            adaptor.addChild(root_0, IN280_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:19: (~ ( LOOP ) )+
            int cnt88=0;
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=DIVIDE && LA88_0<=DELETE)||(LA88_0>=CASE && LA88_0<=ML_COMMENT)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:21: ~ ( LOOP )
            	    {
            	    set281=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIVIDE && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set281));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);

            LOOP282=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2194); 
            LOOP282_tree = (CommonTree)adaptor.create(LOOP282);
            adaptor.addChild(root_0, LOOP282_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:37: ( statement SEMI )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==ID||LA89_0==RETURN||LA89_0==NULL||LA89_0==BEGIN||(LA89_0>=COLON && LA89_0<=CASE)||(LA89_0>=CLOSE && LA89_0<=EXECUTE)||(LA89_0>=EXIT && LA89_0<=FETCH)||(LA89_0>=FOR && LA89_0<=FORALL)||(LA89_0>=GOTO && LA89_0<=IF)||LA89_0==OPEN||(LA89_0>=RAISE && LA89_0<=LLABEL)||(LA89_0>=COMMIT && LA89_0<=SET)||(LA89_0>=UPDATE && LA89_0<=WHILE)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:39: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2198);
            	    statement283=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement283.getTree());
            	    SEMI284=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2200); 
            	    SEMI284_tree = (CommonTree)adaptor.create(SEMI284);
            	    adaptor.addChild(root_0, SEMI284_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);

            END285=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2205); 
            END285_tree = (CommonTree)adaptor.create(END285);
            adaptor.addChild(root_0, END285_tree);

            LOOP286=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2207); 
            LOOP286_tree = (CommonTree)adaptor.create(LOOP286);
            adaptor.addChild(root_0, LOOP286_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:66: ( label_name )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ID) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:322:66: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2209);
                    label_name287=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name287.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_loop_statement"

    public static class forall_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forall_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQLParser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQLParser.forall_statement_return retval = new PLSQLParser.forall_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FORALL288=null;
        Token ID289=null;
        Token IN290=null;
        PLSQLParser.bounds_clause_return bounds_clause291 = null;

        PLSQLParser.sql_statement_return sql_statement292 = null;

        PLSQLParser.kSAVE_return kSAVE293 = null;

        PLSQLParser.kEXCEPTIONS_return kEXCEPTIONS294 = null;


        CommonTree FORALL288_tree=null;
        CommonTree ID289_tree=null;
        CommonTree IN290_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:325:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:326:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (CommonTree)adaptor.nil();

            FORALL288=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2231); 
            FORALL288_tree = (CommonTree)adaptor.create(FORALL288);
            adaptor.addChild(root_0, FORALL288_tree);

            ID289=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2233); 
            ID289_tree = (CommonTree)adaptor.create(ID289);
            adaptor.addChild(root_0, ID289_tree);

            IN290=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2235); 
            IN290_tree = (CommonTree)adaptor.create(IN290);
            adaptor.addChild(root_0, IN290_tree);

            pushFollow(FOLLOW_bounds_clause_in_forall_statement2237);
            bounds_clause291=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause291.getTree());
            pushFollow(FOLLOW_sql_statement_in_forall_statement2239);
            sql_statement292=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement292.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:326:50: ( kSAVE kEXCEPTIONS )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:326:52: kSAVE kEXCEPTIONS
                    {
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2243);
                    kSAVE293=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE293.getTree());
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2245);
                    kEXCEPTIONS294=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS294.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forall_statement"

    public static class bounds_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:329:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQLParser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQLParser.bounds_clause_return retval = new PLSQLParser.bounds_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree DOUBLEDOT296_tree=null;
        CommonTree BETWEEN301_tree=null;
        CommonTree AND303_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:330:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt93=3;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:330:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2267);
                    numeric_expression295=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression295.getTree());
                    DOUBLEDOT296=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2269); 
                    DOUBLEDOT296_tree = (CommonTree)adaptor.create(DOUBLEDOT296);
                    adaptor.addChild(root_0, DOUBLEDOT296_tree);

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2271);
                    numeric_expression297=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression297.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:331:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2279);
                    kINDICES298=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES298.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2281);
                    kOF299=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF299.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2283);
                    atom300=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom300.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:331:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==BETWEEN) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:331:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            BETWEEN301=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2287); 
                            BETWEEN301_tree = (CommonTree)adaptor.create(BETWEEN301);
                            adaptor.addChild(root_0, BETWEEN301_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2289);
                            numeric_expression302=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression302.getTree());
                            AND303=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2291); 
                            AND303_tree = (CommonTree)adaptor.create(AND303);
                            adaptor.addChild(root_0, AND303_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2293);
                            numeric_expression304=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression304.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:332:7: kVALUES kOF atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2304);
                    kVALUES305=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES305.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2306);
                    kOF306=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF306.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2308);
                    atom307=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom307.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bounds_clause"

    public static class goto_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goto_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:335:1: goto_statement : GOTO label_name ;
    public final PLSQLParser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQLParser.goto_statement_return retval = new PLSQLParser.goto_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GOTO308=null;
        PLSQLParser.label_name_return label_name309 = null;


        CommonTree GOTO308_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:335:16: ( GOTO label_name )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:336:9: GOTO label_name
            {
            root_0 = (CommonTree)adaptor.nil();

            GOTO308=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2329); 
            GOTO308_tree = (CommonTree)adaptor.create(GOTO308);
            adaptor.addChild(root_0, GOTO308_tree);

            pushFollow(FOLLOW_label_name_in_goto_statement2331);
            label_name309=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name309.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goto_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:339:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQLParser.if_statement_return if_statement() throws RecognitionException {
        PLSQLParser.if_statement_return retval = new PLSQLParser.if_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree IF310_tree=null;
        CommonTree THEN312_tree=null;
        CommonTree SEMI314_tree=null;
        CommonTree ELSIF315_tree=null;
        CommonTree THEN317_tree=null;
        CommonTree SEMI319_tree=null;
        CommonTree ELSE320_tree=null;
        CommonTree SEMI322_tree=null;
        CommonTree END323_tree=null;
        CommonTree IF324_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:339:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:340:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF310=(Token)match(input,IF,FOLLOW_IF_in_if_statement2352); 
            IF310_tree = (CommonTree)adaptor.create(IF310);
            adaptor.addChild(root_0, IF310_tree);

            pushFollow(FOLLOW_expression_in_if_statement2354);
            expression311=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression311.getTree());
            THEN312=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2356); 
            THEN312_tree = (CommonTree)adaptor.create(THEN312);
            adaptor.addChild(root_0, THEN312_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:340:28: ( statement SEMI )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==ID||LA94_0==RETURN||LA94_0==NULL||LA94_0==BEGIN||(LA94_0>=COLON && LA94_0<=CASE)||(LA94_0>=CLOSE && LA94_0<=EXECUTE)||(LA94_0>=EXIT && LA94_0<=FETCH)||(LA94_0>=FOR && LA94_0<=FORALL)||(LA94_0>=GOTO && LA94_0<=IF)||LA94_0==OPEN||(LA94_0>=RAISE && LA94_0<=LLABEL)||(LA94_0>=COMMIT && LA94_0<=SET)||(LA94_0>=UPDATE && LA94_0<=WHILE)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:340:30: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement2360);
            	    statement313=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement313.getTree());
            	    SEMI314=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2362); 
            	    SEMI314_tree = (CommonTree)adaptor.create(SEMI314);
            	    adaptor.addChild(root_0, SEMI314_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:341:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==ELSIF) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:341:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    ELSIF315=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement2377); 
            	    ELSIF315_tree = (CommonTree)adaptor.create(ELSIF315);
            	    adaptor.addChild(root_0, ELSIF315_tree);

            	    pushFollow(FOLLOW_expression_in_if_statement2379);
            	    expression316=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression316.getTree());
            	    THEN317=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2381); 
            	    THEN317_tree = (CommonTree)adaptor.create(THEN317);
            	    adaptor.addChild(root_0, THEN317_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:341:33: ( statement SEMI )+
            	    int cnt95=0;
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==ID||LA95_0==RETURN||LA95_0==NULL||LA95_0==BEGIN||(LA95_0>=COLON && LA95_0<=CASE)||(LA95_0>=CLOSE && LA95_0<=EXECUTE)||(LA95_0>=EXIT && LA95_0<=FETCH)||(LA95_0>=FOR && LA95_0<=FORALL)||(LA95_0>=GOTO && LA95_0<=IF)||LA95_0==OPEN||(LA95_0>=RAISE && LA95_0<=LLABEL)||(LA95_0>=COMMIT && LA95_0<=SET)||(LA95_0>=UPDATE && LA95_0<=WHILE)) ) {
            	            alt95=1;
            	        }


            	        switch (alt95) {
            	    	case 1 :
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:341:35: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement2385);
            	    	    statement318=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement318.getTree());
            	    	    SEMI319=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2387); 
            	    	    SEMI319_tree = (CommonTree)adaptor.create(SEMI319);
            	    	    adaptor.addChild(root_0, SEMI319_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt95 >= 1 ) break loop95;
            	                EarlyExitException eee =
            	                    new EarlyExitException(95, input);
            	                throw eee;
            	        }
            	        cnt95++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:9: ( ELSE ( statement SEMI )+ )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ELSE) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:11: ELSE ( statement SEMI )+
                    {
                    ELSE320=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement2405); 
                    ELSE320_tree = (CommonTree)adaptor.create(ELSE320);
                    adaptor.addChild(root_0, ELSE320_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:16: ( statement SEMI )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==ID||LA97_0==RETURN||LA97_0==NULL||LA97_0==BEGIN||(LA97_0>=COLON && LA97_0<=CASE)||(LA97_0>=CLOSE && LA97_0<=EXECUTE)||(LA97_0>=EXIT && LA97_0<=FETCH)||(LA97_0>=FOR && LA97_0<=FORALL)||(LA97_0>=GOTO && LA97_0<=IF)||LA97_0==OPEN||(LA97_0>=RAISE && LA97_0<=LLABEL)||(LA97_0>=COMMIT && LA97_0<=SET)||(LA97_0>=UPDATE && LA97_0<=WHILE)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:342:18: statement SEMI
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement2409);
                    	    statement321=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement321.getTree());
                    	    SEMI322=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2411); 
                    	    SEMI322_tree = (CommonTree)adaptor.create(SEMI322);
                    	    adaptor.addChild(root_0, SEMI322_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);


                    }
                    break;

            }

            END323=(Token)match(input,END,FOLLOW_END_in_if_statement2427); 
            END323_tree = (CommonTree)adaptor.create(END323);
            adaptor.addChild(root_0, END323_tree);

            IF324=(Token)match(input,IF,FOLLOW_IF_in_if_statement2429); 
            IF324_tree = (CommonTree)adaptor.create(IF324);
            adaptor.addChild(root_0, IF324_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class null_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "null_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:346:1: null_statement : NULL ;
    public final PLSQLParser.null_statement_return null_statement() throws RecognitionException {
        PLSQLParser.null_statement_return retval = new PLSQLParser.null_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NULL325=null;

        CommonTree NULL325_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:346:16: ( NULL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:347:9: NULL
            {
            root_0 = (CommonTree)adaptor.nil();

            NULL325=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement2450); 
            NULL325_tree = (CommonTree)adaptor.create(NULL325);
            adaptor.addChild(root_0, NULL325_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "null_statement"

    public static class open_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "open_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:350:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQLParser.open_statement_return open_statement() throws RecognitionException {
        PLSQLParser.open_statement_return retval = new PLSQLParser.open_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPEN326=null;
        Token ID327=null;
        Token DOT328=null;
        Token ID329=null;
        Token FOR331=null;
        PLSQLParser.call_args_return call_args330 = null;

        PLSQLParser.select_statement_return select_statement332 = null;


        CommonTree OPEN326_tree=null;
        CommonTree ID327_tree=null;
        CommonTree DOT328_tree=null;
        CommonTree ID329_tree=null;
        CommonTree FOR331_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:350:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            OPEN326=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement2471); 
            OPEN326_tree = (CommonTree)adaptor.create(OPEN326);
            adaptor.addChild(root_0, OPEN326_tree);

            ID327=(Token)match(input,ID,FOLLOW_ID_in_open_statement2473); 
            ID327_tree = (CommonTree)adaptor.create(ID327);
            adaptor.addChild(root_0, ID327_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:17: ( DOT ID )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==DOT) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:19: DOT ID
            	    {
            	    DOT328=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement2477); 
            	    DOT328_tree = (CommonTree)adaptor.create(DOT328);
            	    adaptor.addChild(root_0, DOT328_tree);

            	    ID329=(Token)match(input,ID,FOLLOW_ID_in_open_statement2479); 
            	    ID329_tree = (CommonTree)adaptor.create(ID329);
            	    adaptor.addChild(root_0, ID329_tree);


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:29: ( call_args )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==LPAREN) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:29: call_args
                    {
                    pushFollow(FOLLOW_call_args_in_open_statement2484);
                    call_args330=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args330.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:40: ( FOR select_statement )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==FOR) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:351:42: FOR select_statement
                    {
                    FOR331=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement2489); 
                    FOR331_tree = (CommonTree)adaptor.create(FOR331);
                    adaptor.addChild(root_0, FOR331_tree);

                    pushFollow(FOLLOW_select_statement_in_open_statement2491);
                    select_statement332=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement332.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "open_statement"

    public static class pragma_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQLParser.pragma_return pragma() throws RecognitionException {
        PLSQLParser.pragma_return retval = new PLSQLParser.pragma_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA333=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi334 = null;


        CommonTree PRAGMA333_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:354:8: ( PRAGMA swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:355:9: PRAGMA swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            PRAGMA333=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma2515); 
            PRAGMA333_tree = (CommonTree)adaptor.create(PRAGMA333);
            adaptor.addChild(root_0, PRAGMA333_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_pragma2517);
            swallow_to_semi334=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi334.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma"

    public static class raise_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:358:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQLParser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQLParser.raise_statement_return retval = new PLSQLParser.raise_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RAISE335=null;
        Token ID336=null;
        Token DOT337=null;
        Token ID338=null;

        CommonTree RAISE335_tree=null;
        CommonTree ID336_tree=null;
        CommonTree DOT337_tree=null;
        CommonTree ID338_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:358:17: ( RAISE ( ID ( DOT ID )* )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:359:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            RAISE335=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement2538); 
            RAISE335_tree = (CommonTree)adaptor.create(RAISE335);
            adaptor.addChild(root_0, RAISE335_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:359:15: ( ID ( DOT ID )* )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ID) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:359:17: ID ( DOT ID )*
                    {
                    ID336=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2542); 
                    ID336_tree = (CommonTree)adaptor.create(ID336);
                    adaptor.addChild(root_0, ID336_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:359:20: ( DOT ID )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==DOT) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:359:22: DOT ID
                    	    {
                    	    DOT337=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement2546); 
                    	    DOT337_tree = (CommonTree)adaptor.create(DOT337);
                    	    adaptor.addChild(root_0, DOT337_tree);

                    	    ID338=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2548); 
                    	    ID338_tree = (CommonTree)adaptor.create(ID338);
                    	    adaptor.addChild(root_0, ID338_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class return_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:1: return_statement : RETURN ( expression )? ;
    public final PLSQLParser.return_statement_return return_statement() throws RecognitionException {
        PLSQLParser.return_statement_return retval = new PLSQLParser.return_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN339=null;
        PLSQLParser.expression_return expression340 = null;


        CommonTree RETURN339_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:362:18: ( RETURN ( expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:363:9: RETURN ( expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            RETURN339=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement2575); 
            RETURN339_tree = (CommonTree)adaptor.create(RETURN339);
            adaptor.addChild(root_0, RETURN339_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:363:16: ( expression )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID||LA104_0==LPAREN||(LA104_0>=NOT && LA104_0<=NULL)||LA104_0==COLON||(LA104_0>=MINUS && LA104_0<=PLUS)||LA104_0==SQL||(LA104_0>=INTEGER && LA104_0<=QUOTED_STRING)||(LA104_0>=INSERTING && LA104_0<=DELETING)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:363:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement2577);
                    expression340=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression340.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_statement"

    public static class plsql_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plsql_block"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:366:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQLParser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQLParser.plsql_block_return retval = new PLSQLParser.plsql_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DECLARE341=null;
        PLSQLParser.declare_section_return declare_section342 = null;

        PLSQLParser.body_return body343 = null;


        CommonTree DECLARE341_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:366:13: ( ( DECLARE declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:367:9: ( DECLARE declare_section )? body
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:367:9: ( DECLARE declare_section )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==DECLARE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:367:11: DECLARE declare_section
                    {
                    DECLARE341=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block2601); 
                    DECLARE341_tree = (CommonTree)adaptor.create(DECLARE341);
                    adaptor.addChild(root_0, DECLARE341_tree);

                    pushFollow(FOLLOW_declare_section_in_plsql_block2603);
                    declare_section342=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section342.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_plsql_block2608);
            body343=body();

            state._fsp--;

            adaptor.addChild(root_0, body343.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "plsql_block"

    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:370:1: label : LLABEL label RLABEL ;
    public final PLSQLParser.label_return label() throws RecognitionException {
        PLSQLParser.label_return retval = new PLSQLParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LLABEL344=null;
        Token RLABEL346=null;
        PLSQLParser.label_return label345 = null;


        CommonTree LLABEL344_tree=null;
        CommonTree RLABEL346_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:370:7: ( LLABEL label RLABEL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:371:9: LLABEL label RLABEL
            {
            root_0 = (CommonTree)adaptor.nil();

            LLABEL344=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label2629); 
            LLABEL344_tree = (CommonTree)adaptor.create(LLABEL344);
            adaptor.addChild(root_0, LLABEL344_tree);

            pushFollow(FOLLOW_label_in_label2631);
            label345=label();

            state._fsp--;

            adaptor.addChild(root_0, label345.getTree());
            RLABEL346=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label2633); 
            RLABEL346_tree = (CommonTree)adaptor.create(RLABEL346);
            adaptor.addChild(root_0, RLABEL346_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label"

    public static class qual_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qual_id"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:374:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQLParser.qual_id_return qual_id() throws RecognitionException {
        PLSQLParser.qual_id_return retval = new PLSQLParser.qual_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON347=null;
        Token ID348=null;
        Token DOT349=null;
        Token COLON350=null;
        Token ID351=null;

        CommonTree COLON347_tree=null;
        CommonTree ID348_tree=null;
        CommonTree DOT349_tree=null;
        CommonTree COLON350_tree=null;
        CommonTree ID351_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:374:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:2: ( COLON )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==COLON) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:2: COLON
                    {
                    COLON347=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2647); 
                    COLON347_tree = (CommonTree)adaptor.create(COLON347);
                    adaptor.addChild(root_0, COLON347_tree);


                    }
                    break;

            }

            ID348=(Token)match(input,ID,FOLLOW_ID_in_qual_id2650); 
            ID348_tree = (CommonTree)adaptor.create(ID348);
            adaptor.addChild(root_0, ID348_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:12: ( DOT ( COLON )? ID )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==DOT) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:14: DOT ( COLON )? ID
            	    {
            	    DOT349=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id2654); 
            	    DOT349_tree = (CommonTree)adaptor.create(DOT349);
            	    adaptor.addChild(root_0, DOT349_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:18: ( COLON )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==COLON) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:375:18: COLON
            	            {
            	            COLON350=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2656); 
            	            COLON350_tree = (CommonTree)adaptor.create(COLON350);
            	            adaptor.addChild(root_0, COLON350_tree);


            	            }
            	            break;

            	    }

            	    ID351=(Token)match(input,ID,FOLLOW_ID_in_qual_id2659); 
            	    ID351_tree = (CommonTree)adaptor.create(ID351);
            	    adaptor.addChild(root_0, ID351_tree);


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qual_id"

    public static class sql_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:378:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQLParser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQLParser.sql_statement_return retval = new PLSQLParser.sql_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.commit_statement_return commit_statement352 = null;

        PLSQLParser.delete_statement_return delete_statement353 = null;

        PLSQLParser.insert_statement_return insert_statement354 = null;

        PLSQLParser.lock_table_statement_return lock_table_statement355 = null;

        PLSQLParser.rollback_statement_return rollback_statement356 = null;

        PLSQLParser.savepoint_statement_return savepoint_statement357 = null;

        PLSQLParser.select_statement_return select_statement358 = null;

        PLSQLParser.set_transaction_statement_return set_transaction_statement359 = null;

        PLSQLParser.update_statement_return update_statement360 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:379:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
            int alt109=9;
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

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:379:7: commit_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_commit_statement_in_sql_statement2679);
                    commit_statement352=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement352.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:380:7: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delete_statement_in_sql_statement2687);
                    delete_statement353=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement353.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:381:7: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_insert_statement_in_sql_statement2695);
                    insert_statement354=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement354.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:382:7: lock_table_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement2703);
                    lock_table_statement355=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement355.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:383:7: rollback_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rollback_statement_in_sql_statement2711);
                    rollback_statement356=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement356.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:384:7: savepoint_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement2719);
                    savepoint_statement357=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement357.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:385:7: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_select_statement_in_sql_statement2727);
                    select_statement358=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement358.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:386:7: set_transaction_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement2735);
                    set_transaction_statement359=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement359.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:387:7: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_update_statement_in_sql_statement2743);
                    update_statement360=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement360.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_statement"

    public static class commit_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:390:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQLParser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQLParser.commit_statement_return retval = new PLSQLParser.commit_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMIT361=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi362 = null;


        CommonTree COMMIT361_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:390:18: ( COMMIT ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:391:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMIT361=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement2764); 
            COMMIT361_tree = (CommonTree)adaptor.create(COMMIT361);
            adaptor.addChild(root_0, COMMIT361_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:391:16: ( swallow_to_semi )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                int LA110_1 = input.LA(2);

                if ( ((LA110_1>=DIVIDE && LA110_1<=PROCEDURE)||(LA110_1>=FUNCTION && LA110_1<=ML_COMMENT)) ) {
                    alt110=1;
                }
                else if ( (LA110_1==ID) ) {
                    int LA110_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt110=1;
                    }
                }
            }
            else if ( (LA110_0==DIVIDE||LA110_0==PROCEDURE||(LA110_0>=FUNCTION && LA110_0<=ML_COMMENT)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:391:16: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement2766);
                    swallow_to_semi362=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi362.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commit_statement"

    public static class delete_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:394:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQLParser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQLParser.delete_statement_return retval = new PLSQLParser.delete_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DELETE363=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi364 = null;


        CommonTree DELETE363_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:394:18: ( DELETE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:395:9: DELETE swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            DELETE363=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement2788); 
            DELETE363_tree = (CommonTree)adaptor.create(DELETE363);
            adaptor.addChild(root_0, DELETE363_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement2790);
            swallow_to_semi364=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi364.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_statement"

    public static class insert_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:398:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQLParser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQLParser.insert_statement_return retval = new PLSQLParser.insert_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSERT365=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi366 = null;


        CommonTree INSERT365_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:398:18: ( INSERT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:399:9: INSERT swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            INSERT365=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement2811); 
            INSERT365_tree = (CommonTree)adaptor.create(INSERT365);
            adaptor.addChild(root_0, INSERT365_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement2813);
            swallow_to_semi366=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi366.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_statement"

    public static class lock_table_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lock_table_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:402:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQLParser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQLParser.lock_table_statement_return retval = new PLSQLParser.lock_table_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOCK367=null;
        Token TABLE368=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi369 = null;


        CommonTree LOCK367_tree=null;
        CommonTree TABLE368_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:402:22: ( LOCK TABLE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:403:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            LOCK367=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement2834); 
            LOCK367_tree = (CommonTree)adaptor.create(LOCK367);
            adaptor.addChild(root_0, LOCK367_tree);

            TABLE368=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement2836); 
            TABLE368_tree = (CommonTree)adaptor.create(TABLE368);
            adaptor.addChild(root_0, TABLE368_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement2838);
            swallow_to_semi369=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi369.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lock_table_statement"

    public static class rollback_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:406:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQLParser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQLParser.rollback_statement_return retval = new PLSQLParser.rollback_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ROLLBACK370=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi371 = null;


        CommonTree ROLLBACK370_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:406:20: ( ROLLBACK ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:407:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (CommonTree)adaptor.nil();

            ROLLBACK370=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement2859); 
            ROLLBACK370_tree = (CommonTree)adaptor.create(ROLLBACK370);
            adaptor.addChild(root_0, ROLLBACK370_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:407:18: ( swallow_to_semi )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=DIVIDE && LA111_1<=PROCEDURE)||(LA111_1>=FUNCTION && LA111_1<=ML_COMMENT)) ) {
                    alt111=1;
                }
                else if ( (LA111_1==ID) ) {
                    int LA111_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt111=1;
                    }
                }
            }
            else if ( (LA111_0==DIVIDE||LA111_0==PROCEDURE||(LA111_0>=FUNCTION && LA111_0<=ML_COMMENT)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:407:18: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement2861);
                    swallow_to_semi371=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi371.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rollback_statement"

    public static class savepoint_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:410:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQLParser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQLParser.savepoint_statement_return retval = new PLSQLParser.savepoint_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SAVEPOINT372=null;
        Token ID373=null;

        CommonTree SAVEPOINT372_tree=null;
        CommonTree ID373_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:410:21: ( SAVEPOINT ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:411:9: SAVEPOINT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            SAVEPOINT372=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement2883); 
            SAVEPOINT372_tree = (CommonTree)adaptor.create(SAVEPOINT372);
            adaptor.addChild(root_0, SAVEPOINT372_tree);

            ID373=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement2885); 
            ID373_tree = (CommonTree)adaptor.create(ID373);
            adaptor.addChild(root_0, ID373_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "savepoint_statement"

    public static class select_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:414:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQLParser.select_statement_return select_statement() throws RecognitionException {
        PLSQLParser.select_statement_return retval = new PLSQLParser.select_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SELECT374=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi375 = null;


        CommonTree SELECT374_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:414:18: ( SELECT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:415:9: SELECT swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            SELECT374=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement2906); 
            SELECT374_tree = (CommonTree)adaptor.create(SELECT374);
            adaptor.addChild(root_0, SELECT374_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_select_statement2908);
            swallow_to_semi375=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi375.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_statement"

    public static class set_transaction_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_transaction_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:418:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQLParser.set_transaction_statement_return retval = new PLSQLParser.set_transaction_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET376=null;
        Token TRANSACTION377=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi378 = null;


        CommonTree SET376_tree=null;
        CommonTree TRANSACTION377_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:418:27: ( SET TRANSACTION swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:419:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            SET376=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement2929); 
            SET376_tree = (CommonTree)adaptor.create(SET376);
            adaptor.addChild(root_0, SET376_tree);

            TRANSACTION377=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement2931); 
            TRANSACTION377_tree = (CommonTree)adaptor.create(TRANSACTION377);
            adaptor.addChild(root_0, TRANSACTION377_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement2933);
            swallow_to_semi378=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi378.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set_transaction_statement"

    public static class update_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:422:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQLParser.update_statement_return update_statement() throws RecognitionException {
        PLSQLParser.update_statement_return retval = new PLSQLParser.update_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE379=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi380 = null;


        CommonTree UPDATE379_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:422:18: ( UPDATE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:423:9: UPDATE swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            UPDATE379=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement2954); 
            UPDATE379_tree = (CommonTree)adaptor.create(UPDATE379);
            adaptor.addChild(root_0, UPDATE379_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_update_statement2956);
            swallow_to_semi380=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi380.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_statement"

    public static class swallow_to_semi_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "swallow_to_semi"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:426:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQLParser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQLParser.swallow_to_semi_return retval = new PLSQLParser.swallow_to_semi_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set381=null;

        CommonTree set381_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:426:17: ( (~ ( SEMI ) )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:427:9: (~ ( SEMI ) )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:427:9: (~ ( SEMI ) )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==ID) ) {
                    int LA112_2 = input.LA(2);

                    if ( ((LA112_2>=DIVIDE && LA112_2<=PROCEDURE)||(LA112_2>=FUNCTION && LA112_2<=ML_COMMENT)) ) {
                        alt112=1;
                    }
                    else if ( (LA112_2==ID) ) {
                        int LA112_4 = input.LA(3);

                        if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                            alt112=1;
                        }


                    }


                }
                else if ( (LA112_0==DIVIDE||LA112_0==PROCEDURE||(LA112_0>=FUNCTION && LA112_0<=ML_COMMENT)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:427:9: ~ ( SEMI )
            	    {
            	    set381=(Token)input.LT(1);
            	    if ( input.LA(1)==DIVIDE||(input.LA(1)>=PROCEDURE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set381));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "swallow_to_semi"

    public static class while_loop_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:430:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLParser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQLParser.while_loop_statement_return retval = new PLSQLParser.while_loop_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE382=null;
        Token LOOP384=null;
        Token SEMI386=null;
        Token END387=null;
        Token LOOP388=null;
        PLSQLParser.expression_return expression383 = null;

        PLSQLParser.statement_return statement385 = null;

        PLSQLParser.label_name_return label_name389 = null;


        CommonTree WHILE382_tree=null;
        CommonTree LOOP384_tree=null;
        CommonTree SEMI386_tree=null;
        CommonTree END387_tree=null;
        CommonTree LOOP388_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:430:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:431:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE382=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3004); 
            WHILE382_tree = (CommonTree)adaptor.create(WHILE382);
            adaptor.addChild(root_0, WHILE382_tree);

            pushFollow(FOLLOW_expression_in_while_loop_statement3006);
            expression383=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression383.getTree());
            LOOP384=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3008); 
            LOOP384_tree = (CommonTree)adaptor.create(LOOP384);
            adaptor.addChild(root_0, LOOP384_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:431:31: ( statement SEMI )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==ID||LA113_0==RETURN||LA113_0==NULL||LA113_0==BEGIN||(LA113_0>=COLON && LA113_0<=CASE)||(LA113_0>=CLOSE && LA113_0<=EXECUTE)||(LA113_0>=EXIT && LA113_0<=FETCH)||(LA113_0>=FOR && LA113_0<=FORALL)||(LA113_0>=GOTO && LA113_0<=IF)||LA113_0==OPEN||(LA113_0>=RAISE && LA113_0<=LLABEL)||(LA113_0>=COMMIT && LA113_0<=SET)||(LA113_0>=UPDATE && LA113_0<=WHILE)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:431:33: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3012);
            	    statement385=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement385.getTree());
            	    SEMI386=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3014); 
            	    SEMI386_tree = (CommonTree)adaptor.create(SEMI386);
            	    adaptor.addChild(root_0, SEMI386_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);

            END387=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3019); 
            END387_tree = (CommonTree)adaptor.create(END387);
            adaptor.addChild(root_0, END387_tree);

            LOOP388=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3021); 
            LOOP388_tree = (CommonTree)adaptor.create(LOOP388);
            adaptor.addChild(root_0, LOOP388_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:431:60: ( label_name )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ID) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:431:60: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3023);
                    label_name389=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name389.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_loop_statement"

    public static class match_parens_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_parens"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:434:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQLParser.match_parens_return match_parens() throws RecognitionException {
        PLSQLParser.match_parens_return retval = new PLSQLParser.match_parens_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set390=null;
        Token RPAREN391=null;
        Token LPAREN393=null;
        PLSQLParser.match_parens_return match_parens392 = null;


        CommonTree set390_tree=null;
        CommonTree RPAREN391_tree=null;
        CommonTree LPAREN393_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:435:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==DIVIDE||(LA116_0>=PROCEDURE && LA116_0<=COMMA)||(LA116_0>=NOCOPY && LA116_0<=CURSOR)||(LA116_0>=NOT && LA116_0<=RESULT_CACHE)||(LA116_0>=BEGIN && LA116_0<=ML_COMMENT)) ) {
                alt116=1;
            }
            else if ( (LA116_0==RPAREN) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:435:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:435:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==DIVIDE||(LA115_0>=PROCEDURE && LA115_0<=RETURN)||LA115_0==COMMA||(LA115_0>=NOCOPY && LA115_0<=CURSOR)||(LA115_0>=NOT && LA115_0<=RESULT_CACHE)||(LA115_0>=BEGIN && LA115_0<=ML_COMMENT)) ) {
                            alt115=1;
                        }
                        else if ( (LA115_0==LPAREN) ) {
                            alt115=2;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:435:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    set390=(Token)input.LT(1);
                    	    if ( input.LA(1)==DIVIDE||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=RESULT_CACHE)||(input.LA(1)>=BEGIN && input.LA(1)<=ML_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set390));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:436:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RPAREN391=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3092); 
                    RPAREN391_tree = (CommonTree)adaptor.create(RPAREN391);
                    adaptor.addChild(root_0, RPAREN391_tree);

                    pushFollow(FOLLOW_match_parens_in_match_parens3094);
                    match_parens392=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens392.getTree());
                    LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3096); 
                    LPAREN393_tree = (CommonTree)adaptor.create(LPAREN393);
                    adaptor.addChild(root_0, LPAREN393_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "match_parens"

    public static class label_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label_name"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:439:1: label_name : ID ;
    public final PLSQLParser.label_name_return label_name() throws RecognitionException {
        PLSQLParser.label_name_return retval = new PLSQLParser.label_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID394=null;

        CommonTree ID394_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:439:11: ( ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:439:13: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID394=(Token)match(input,ID,FOLLOW_ID_in_label_name3108); 
            ID394_tree = (CommonTree)adaptor.create(ID394);
            adaptor.addChild(root_0, ID394_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label_name"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:441:1: expression : or_expr ;
    public final PLSQLParser.expression_return expression() throws RecognitionException {
        PLSQLParser.expression_return retval = new PLSQLParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.or_expr_return or_expr395 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:442:5: ( or_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:442:7: or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_expression3120);
            or_expr395=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr395.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:445:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQLParser.or_expr_return or_expr() throws RecognitionException {
        PLSQLParser.or_expr_return retval = new PLSQLParser.or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR397=null;
        PLSQLParser.and_expr_return and_expr396 = null;

        PLSQLParser.and_expr_return and_expr398 = null;


        CommonTree OR397_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:446:5: ( and_expr ( OR and_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:446:7: and_expr ( OR and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr3137);
            and_expr396=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr396.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:446:16: ( OR and_expr )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==OR) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:446:18: OR and_expr
            	    {
            	    OR397=(Token)match(input,OR,FOLLOW_OR_in_or_expr3141); 
            	    OR397_tree = (CommonTree)adaptor.create(OR397);
            	    adaptor.addChild(root_0, OR397_tree);

            	    pushFollow(FOLLOW_and_expr_in_or_expr3143);
            	    and_expr398=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr398.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:449:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQLParser.and_expr_return and_expr() throws RecognitionException {
        PLSQLParser.and_expr_return retval = new PLSQLParser.and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND400=null;
        PLSQLParser.not_expr_return not_expr399 = null;

        PLSQLParser.not_expr_return not_expr401 = null;


        CommonTree AND400_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:450:5: ( not_expr ( AND not_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:450:7: not_expr ( AND not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr3163);
            not_expr399=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr399.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:450:16: ( AND not_expr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==AND) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:450:18: AND not_expr
            	    {
            	    AND400=(Token)match(input,AND,FOLLOW_AND_in_and_expr3167); 
            	    AND400_tree = (CommonTree)adaptor.create(AND400);
            	    adaptor.addChild(root_0, AND400_tree);

            	    pushFollow(FOLLOW_not_expr_in_and_expr3169);
            	    not_expr401=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr401.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:453:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQLParser.not_expr_return not_expr() throws RecognitionException {
        PLSQLParser.not_expr_return retval = new PLSQLParser.not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT402=null;
        PLSQLParser.compare_expr_return compare_expr403 = null;


        CommonTree NOT402_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:454:5: ( ( NOT )? compare_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:454:7: ( NOT )? compare_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:454:7: ( NOT )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==NOT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:454:7: NOT
                    {
                    NOT402=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3189); 
                    NOT402_tree = (CommonTree)adaptor.create(NOT402);
                    adaptor.addChild(root_0, NOT402_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_compare_expr_in_not_expr3192);
            compare_expr403=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr403.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_expr"

    public static class compare_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:457:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQLParser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQLParser.compare_expr_return retval = new PLSQLParser.compare_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set405=null;
        PLSQLParser.is_null_expr_return is_null_expr404 = null;

        PLSQLParser.is_null_expr_return is_null_expr406 = null;


        CommonTree set405_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:458:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:458:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_is_null_expr_in_compare_expr3209);
            is_null_expr404=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr404.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:458:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=EQ && LA120_0<=GEQ)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:458:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    set405=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set405));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3239);
                    is_null_expr406=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr406.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compare_expr"

    public static class is_null_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "is_null_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:461:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQLParser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQLParser.is_null_expr_return retval = new PLSQLParser.is_null_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS408=null;
        Token NOT409=null;
        Token NULL410=null;
        PLSQLParser.like_expr_return like_expr407 = null;


        CommonTree IS408_tree=null;
        CommonTree NOT409_tree=null;
        CommonTree NULL410_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:5: ( like_expr ( IS ( NOT )? NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_like_expr_in_is_null_expr3259);
            like_expr407=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr407.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:17: ( IS ( NOT )? NULL )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==IS) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:19: IS ( NOT )? NULL
                    {
                    IS408=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3263); 
                    IS408_tree = (CommonTree)adaptor.create(IS408);
                    adaptor.addChild(root_0, IS408_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:22: ( NOT )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==NOT) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:462:22: NOT
                            {
                            NOT409=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3265); 
                            NOT409_tree = (CommonTree)adaptor.create(NOT409);
                            adaptor.addChild(root_0, NOT409_tree);


                            }
                            break;

                    }

                    NULL410=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3268); 
                    NULL410_tree = (CommonTree)adaptor.create(NULL410);
                    adaptor.addChild(root_0, NULL410_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "is_null_expr"

    public static class like_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "like_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:465:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQLParser.like_expr_return like_expr() throws RecognitionException {
        PLSQLParser.like_expr_return retval = new PLSQLParser.like_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT412=null;
        Token LIKE413=null;
        PLSQLParser.between_expr_return between_expr411 = null;

        PLSQLParser.between_expr_return between_expr414 = null;


        CommonTree NOT412_tree=null;
        CommonTree LIKE413_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_between_expr_in_like_expr3287);
            between_expr411=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr411.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:20: ( ( NOT )? LIKE between_expr )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==NOT||LA124_0==LIKE) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:22: ( NOT )? LIKE between_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:22: ( NOT )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==NOT) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:466:22: NOT
                            {
                            NOT412=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3291); 
                            NOT412_tree = (CommonTree)adaptor.create(NOT412);
                            adaptor.addChild(root_0, NOT412_tree);


                            }
                            break;

                    }

                    LIKE413=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3294); 
                    LIKE413_tree = (CommonTree)adaptor.create(LIKE413);
                    adaptor.addChild(root_0, LIKE413_tree);

                    pushFollow(FOLLOW_between_expr_in_like_expr3296);
                    between_expr414=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr414.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "like_expr"

    public static class between_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:469:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQLParser.between_expr_return between_expr() throws RecognitionException {
        PLSQLParser.between_expr_return retval = new PLSQLParser.between_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT416=null;
        Token BETWEEN417=null;
        Token AND419=null;
        PLSQLParser.in_expr_return in_expr415 = null;

        PLSQLParser.in_expr_return in_expr418 = null;

        PLSQLParser.in_expr_return in_expr420 = null;


        CommonTree NOT416_tree=null;
        CommonTree BETWEEN417_tree=null;
        CommonTree AND419_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_between_expr3316);
            in_expr415=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr415.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
            int alt126=2;
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
            switch (alt126) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:17: ( NOT )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==NOT) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:470:17: NOT
                            {
                            NOT416=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3320); 
                            NOT416_tree = (CommonTree)adaptor.create(NOT416);
                            adaptor.addChild(root_0, NOT416_tree);


                            }
                            break;

                    }

                    BETWEEN417=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3323); 
                    BETWEEN417_tree = (CommonTree)adaptor.create(BETWEEN417);
                    adaptor.addChild(root_0, BETWEEN417_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3325);
                    in_expr418=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr418.getTree());
                    AND419=(Token)match(input,AND,FOLLOW_AND_in_between_expr3327); 
                    AND419_tree = (CommonTree)adaptor.create(AND419);
                    adaptor.addChild(root_0, AND419_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3329);
                    in_expr420=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr420.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "between_expr"

    public static class in_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:473:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQLParser.in_expr_return in_expr() throws RecognitionException {
        PLSQLParser.in_expr_return retval = new PLSQLParser.in_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT422=null;
        Token IN423=null;
        Token LPAREN424=null;
        Token COMMA426=null;
        Token RPAREN428=null;
        PLSQLParser.add_expr_return add_expr421 = null;

        PLSQLParser.add_expr_return add_expr425 = null;

        PLSQLParser.add_expr_return add_expr427 = null;


        CommonTree NOT422_tree=null;
        CommonTree IN423_tree=null;
        CommonTree LPAREN424_tree=null;
        CommonTree COMMA426_tree=null;
        CommonTree RPAREN428_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_in_expr3349);
            add_expr421=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr421.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            int alt129=2;
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
            switch (alt129) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:18: ( NOT )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==NOT) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:18: NOT
                            {
                            NOT422=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr3353); 
                            NOT422_tree = (CommonTree)adaptor.create(NOT422);
                            adaptor.addChild(root_0, NOT422_tree);


                            }
                            break;

                    }

                    IN423=(Token)match(input,IN,FOLLOW_IN_in_in_expr3356); 
                    IN423_tree = (CommonTree)adaptor.create(IN423);
                    adaptor.addChild(root_0, IN423_tree);

                    LPAREN424=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr3358); 
                    LPAREN424_tree = (CommonTree)adaptor.create(LPAREN424);
                    adaptor.addChild(root_0, LPAREN424_tree);

                    pushFollow(FOLLOW_add_expr_in_in_expr3360);
                    add_expr425=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr425.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:42: ( COMMA add_expr )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==COMMA) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:474:44: COMMA add_expr
                    	    {
                    	    COMMA426=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr3364); 
                    	    COMMA426_tree = (CommonTree)adaptor.create(COMMA426);
                    	    adaptor.addChild(root_0, COMMA426_tree);

                    	    pushFollow(FOLLOW_add_expr_in_in_expr3366);
                    	    add_expr427=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr427.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr3371); 
                    RPAREN428_tree = (CommonTree)adaptor.create(RPAREN428);
                    adaptor.addChild(root_0, RPAREN428_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "in_expr"

    public static class numeric_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:477:1: numeric_expression : add_expr ;
    public final PLSQLParser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQLParser.numeric_expression_return retval = new PLSQLParser.numeric_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.add_expr_return add_expr429 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:478:5: ( add_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:478:7: add_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_numeric_expression3391);
            add_expr429=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr429.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_expression"

    public static class add_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:481:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQLParser.add_expr_return add_expr() throws RecognitionException {
        PLSQLParser.add_expr_return retval = new PLSQLParser.add_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set431=null;
        PLSQLParser.mul_expr_return mul_expr430 = null;

        PLSQLParser.mul_expr_return mul_expr432 = null;


        CommonTree set431_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:482:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:482:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mul_expr_in_add_expr3408);
            mul_expr430=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr430.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:482:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=MINUS && LA130_0<=DOUBLEVERTBAR)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:482:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    set431=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set431));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_expr_in_add_expr3426);
            	    mul_expr432=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr432.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mul_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:485:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQLParser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQLParser.mul_expr_return retval = new PLSQLParser.mul_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK434=null;
        Token DIVIDE435=null;
        PLSQLParser.unary_sign_expr_return unary_sign_expr433 = null;

        PLSQLParser.kMOD_return kMOD436 = null;

        PLSQLParser.unary_sign_expr_return unary_sign_expr437 = null;


        CommonTree ASTERISK434_tree=null;
        CommonTree DIVIDE435_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3446);
            unary_sign_expr433=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr433.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==DIVIDE||LA132_0==ID||LA132_0==ASTERISK) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:25: ( ASTERISK | DIVIDE | kMOD )
            	    int alt131=3;
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

            	        throw nvae;
            	    }

            	    switch (alt131) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:27: ASTERISK
            	            {
            	            ASTERISK434=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr3452); 
            	            ASTERISK434_tree = (CommonTree)adaptor.create(ASTERISK434);
            	            adaptor.addChild(root_0, ASTERISK434_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:38: DIVIDE
            	            {
            	            DIVIDE435=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr3456); 
            	            DIVIDE435_tree = (CommonTree)adaptor.create(DIVIDE435);
            	            adaptor.addChild(root_0, DIVIDE435_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:486:47: kMOD
            	            {
            	            pushFollow(FOLLOW_kMOD_in_mul_expr3460);
            	            kMOD436=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD436.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3464);
            	    unary_sign_expr437=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr437.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_expr"

    public static class unary_sign_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_sign_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:489:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQLParser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQLParser.unary_sign_expr_return retval = new PLSQLParser.unary_sign_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set438=null;
        PLSQLParser.exponent_expr_return exponent_expr439 = null;


        CommonTree set438_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:490:5: ( ( MINUS | PLUS )? exponent_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:490:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:490:7: ( MINUS | PLUS )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=MINUS && LA133_0<=PLUS)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
                    {
                    set438=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set438));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr3495);
            exponent_expr439=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr439.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_sign_expr"

    public static class exponent_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exponent_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:493:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQLParser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQLParser.exponent_expr_return retval = new PLSQLParser.exponent_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXPONENT441=null;
        PLSQLParser.atom_return atom440 = null;

        PLSQLParser.atom_return atom442 = null;


        CommonTree EXPONENT441_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:494:5: ( atom ( EXPONENT atom )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:494:7: atom ( EXPONENT atom )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_atom_in_exponent_expr3512);
            atom440=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom440.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:494:12: ( EXPONENT atom )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==EXPONENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:494:14: EXPONENT atom
                    {
                    EXPONENT441=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr3516); 
                    EXPONENT441_tree = (CommonTree)adaptor.create(EXPONENT441);
                    adaptor.addChild(root_0, EXPONENT441_tree);

                    pushFollow(FOLLOW_atom_in_exponent_expr3518);
                    atom442=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom442.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exponent_expr"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:497:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQLParser.atom_return atom() throws RecognitionException {
        PLSQLParser.atom_return retval = new PLSQLParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree PERCENT444_tree=null;
        CommonTree SQL446_tree=null;
        CommonTree PERCENT447_tree=null;
        CommonTree NULL452_tree=null;
        CommonTree LPAREN453_tree=null;
        CommonTree RPAREN455_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:498:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt136=7;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:498:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_or_function_call_in_atom3538);
                    variable_or_function_call443=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call443.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:498:33: ( PERCENT attribute )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==PERCENT) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:498:35: PERCENT attribute
                            {
                            PERCENT444=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3542); 
                            PERCENT444_tree = (CommonTree)adaptor.create(PERCENT444);
                            adaptor.addChild(root_0, PERCENT444_tree);

                            pushFollow(FOLLOW_attribute_in_atom3544);
                            attribute445=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute445.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:499:7: SQL PERCENT attribute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQL446=(Token)match(input,SQL,FOLLOW_SQL_in_atom3555); 
                    SQL446_tree = (CommonTree)adaptor.create(SQL446);
                    adaptor.addChild(root_0, SQL446_tree);

                    PERCENT447=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3557); 
                    PERCENT447_tree = (CommonTree)adaptor.create(PERCENT447);
                    adaptor.addChild(root_0, PERCENT447_tree);

                    pushFollow(FOLLOW_attribute_in_atom3559);
                    attribute448=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute448.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:500:7: string_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_string_literal_in_atom3567);
                    string_literal449=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal449.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:501:7: numeric_atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numeric_atom_in_atom3575);
                    numeric_atom450=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom450.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:502:7: boolean_atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_boolean_atom_in_atom3583);
                    boolean_atom451=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom451.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:503:7: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NULL452=(Token)match(input,NULL,FOLLOW_NULL_in_atom3591); 
                    NULL452_tree = (CommonTree)adaptor.create(NULL452);
                    adaptor.addChild(root_0, NULL452_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:504:7: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3599); 
                    LPAREN453_tree = (CommonTree)adaptor.create(LPAREN453);
                    adaptor.addChild(root_0, LPAREN453_tree);

                    pushFollow(FOLLOW_expression_in_atom3601);
                    expression454=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression454.getTree());
                    RPAREN455=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3603); 
                    RPAREN455_tree = (CommonTree)adaptor.create(RPAREN455);
                    adaptor.addChild(root_0, RPAREN455_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class variable_or_function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_function_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:507:1: variable_or_function_call : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQLParser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQLParser.variable_or_function_call_return retval = new PLSQLParser.variable_or_function_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT457=null;
        Token DOT459=null;
        PLSQLParser.call_return call456 = null;

        PLSQLParser.call_return call458 = null;

        PLSQLParser.delete_call_return delete_call460 = null;


        CommonTree DOT457_tree=null;
        CommonTree DOT459_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:5: ( call ( DOT call )* ( DOT delete_call )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:7: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_call_in_variable_or_function_call3624);
            call456=call();

            state._fsp--;

            adaptor.addChild(root_0, call456.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:12: ( DOT call )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==DOT) ) {
                    int LA137_1 = input.LA(2);

                    if ( (LA137_1==ID||LA137_1==COLON) ) {
                        alt137=1;
                    }


                }


                switch (alt137) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:14: DOT call
            	    {
            	    DOT457=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3628); 
            	    DOT457_tree = (CommonTree)adaptor.create(DOT457);
            	    adaptor.addChild(root_0, DOT457_tree);

            	    pushFollow(FOLLOW_call_in_variable_or_function_call3630);
            	    call458=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call458.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:26: ( DOT delete_call )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==DOT) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:508:28: DOT delete_call
                    {
                    DOT459=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3637); 
                    DOT459_tree = (CommonTree)adaptor.create(DOT459);
                    adaptor.addChild(root_0, DOT459_tree);

                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call3639);
                    delete_call460=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call460.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_or_function_call"

    public static class attribute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:511:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQLParser.attribute_return attribute() throws RecognitionException {
        PLSQLParser.attribute_return retval = new PLSQLParser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BULK_ROWCOUNT461=null;
        Token LPAREN462=null;
        Token RPAREN464=null;
        Token ISOPEN466=null;
        Token NOTFOUND467=null;
        PLSQLParser.expression_return expression463 = null;

        PLSQLParser.kFOUND_return kFOUND465 = null;

        PLSQLParser.kROWCOUNT_return kROWCOUNT468 = null;


        CommonTree BULK_ROWCOUNT461_tree=null;
        CommonTree LPAREN462_tree=null;
        CommonTree RPAREN464_tree=null;
        CommonTree ISOPEN466_tree=null;
        CommonTree NOTFOUND467_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:512:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
            int alt139=5;
            switch ( input.LA(1) ) {
            case BULK_ROWCOUNT:
                {
                alt139=1;
                }
                break;
            case ID:
                {
                int LA139_2 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                    alt139=2;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                    alt139=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

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

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:512:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BULK_ROWCOUNT461=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute3659); 
                    BULK_ROWCOUNT461_tree = (CommonTree)adaptor.create(BULK_ROWCOUNT461);
                    adaptor.addChild(root_0, BULK_ROWCOUNT461_tree);

                    LPAREN462=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute3661); 
                    LPAREN462_tree = (CommonTree)adaptor.create(LPAREN462);
                    adaptor.addChild(root_0, LPAREN462_tree);

                    pushFollow(FOLLOW_expression_in_attribute3663);
                    expression463=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression463.getTree());
                    RPAREN464=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute3665); 
                    RPAREN464_tree = (CommonTree)adaptor.create(RPAREN464);
                    adaptor.addChild(root_0, RPAREN464_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:513:7: kFOUND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_kFOUND_in_attribute3673);
                    kFOUND465=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND465.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:514:7: ISOPEN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ISOPEN466=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute3681); 
                    ISOPEN466_tree = (CommonTree)adaptor.create(ISOPEN466);
                    adaptor.addChild(root_0, ISOPEN466_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:515:7: NOTFOUND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOTFOUND467=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute3689); 
                    NOTFOUND467_tree = (CommonTree)adaptor.create(NOTFOUND467);
                    adaptor.addChild(root_0, NOTFOUND467_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:516:7: kROWCOUNT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_kROWCOUNT_in_attribute3697);
                    kROWCOUNT468=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT468.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class call_args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_args"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:519:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQLParser.call_args_return call_args() throws RecognitionException {
        PLSQLParser.call_args_return retval = new PLSQLParser.call_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN469=null;
        Token COMMA471=null;
        Token RPAREN473=null;
        PLSQLParser.parameter_return parameter470 = null;

        PLSQLParser.parameter_return parameter472 = null;


        CommonTree LPAREN469_tree=null;
        CommonTree COMMA471_tree=null;
        CommonTree RPAREN473_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN469=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args3714); 
            LPAREN469_tree = (CommonTree)adaptor.create(LPAREN469);
            adaptor.addChild(root_0, LPAREN469_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:14: ( parameter ( COMMA parameter )* )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==ID||LA141_0==LPAREN||(LA141_0>=NOT && LA141_0<=NULL)||LA141_0==COLON||(LA141_0>=MINUS && LA141_0<=PLUS)||LA141_0==SQL||(LA141_0>=INTEGER && LA141_0<=QUOTED_STRING)||(LA141_0>=INSERTING && LA141_0<=DELETING)) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:16: parameter ( COMMA parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_call_args3718);
                    parameter470=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter470.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:26: ( COMMA parameter )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==COMMA) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:520:28: COMMA parameter
                    	    {
                    	    COMMA471=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args3722); 
                    	    COMMA471_tree = (CommonTree)adaptor.create(COMMA471);
                    	    adaptor.addChild(root_0, COMMA471_tree);

                    	    pushFollow(FOLLOW_parameter_in_call_args3724);
                    	    parameter472=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter472.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN473=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args3732); 
            RPAREN473_tree = (CommonTree)adaptor.create(RPAREN473);
            adaptor.addChild(root_0, RPAREN473_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_args"

    public static class boolean_atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:523:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQLParser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQLParser.boolean_atom_return retval = new PLSQLParser.boolean_atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.boolean_literal_return boolean_literal474 = null;

        PLSQLParser.collection_exists_return collection_exists475 = null;

        PLSQLParser.conditional_predicate_return conditional_predicate476 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:524:5: ( boolean_literal | collection_exists | conditional_predicate )
            int alt142=3;
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

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:524:7: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom3749);
                    boolean_literal474=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal474.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:525:7: collection_exists
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_collection_exists_in_boolean_atom3757);
                    collection_exists475=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists475.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:526:7: conditional_predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom3765);
                    conditional_predicate476=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate476.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_atom"

    public static class numeric_atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:529:1: numeric_atom : numeric_literal ;
    public final PLSQLParser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQLParser.numeric_atom_return retval = new PLSQLParser.numeric_atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.numeric_literal_return numeric_literal477 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:530:5: ( numeric_literal )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:530:7: numeric_literal
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numeric_literal_in_numeric_atom3782);
            numeric_literal477=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal477.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_atom"

    public static class numeric_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:533:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQLParser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQLParser.numeric_literal_return retval = new PLSQLParser.numeric_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set478=null;

        CommonTree set478_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:534:5: ( INTEGER | REAL_NUMBER )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set478=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set478));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_literal"

    public static class boolean_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:538:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQLParser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQLParser.boolean_literal_return retval = new PLSQLParser.boolean_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set479=null;

        CommonTree set479_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:539:5: ( TRUE | FALSE )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set479=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set479));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class string_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:543:1: string_literal : QUOTED_STRING ;
    public final PLSQLParser.string_literal_return string_literal() throws RecognitionException {
        PLSQLParser.string_literal_return retval = new PLSQLParser.string_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUOTED_STRING480=null;

        CommonTree QUOTED_STRING480_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:544:5: ( QUOTED_STRING )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:544:7: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            QUOTED_STRING480=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal3849); 
            QUOTED_STRING480_tree = (CommonTree)adaptor.create(QUOTED_STRING480);
            adaptor.addChild(root_0, QUOTED_STRING480_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string_literal"

    public static class collection_exists_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_exists"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:547:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQLParser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQLParser.collection_exists_return retval = new PLSQLParser.collection_exists_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID481=null;
        Token DOT482=null;
        Token EXISTS483=null;
        Token LPAREN484=null;
        Token RPAREN486=null;
        PLSQLParser.expression_return expression485 = null;


        CommonTree ID481_tree=null;
        CommonTree DOT482_tree=null;
        CommonTree EXISTS483_tree=null;
        CommonTree LPAREN484_tree=null;
        CommonTree RPAREN486_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:548:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:548:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            ID481=(Token)match(input,ID,FOLLOW_ID_in_collection_exists3866); 
            ID481_tree = (CommonTree)adaptor.create(ID481);
            adaptor.addChild(root_0, ID481_tree);

            DOT482=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists3868); 
            DOT482_tree = (CommonTree)adaptor.create(DOT482);
            adaptor.addChild(root_0, DOT482_tree);

            EXISTS483=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists3870); 
            EXISTS483_tree = (CommonTree)adaptor.create(EXISTS483);
            adaptor.addChild(root_0, EXISTS483_tree);

            LPAREN484=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists3872); 
            LPAREN484_tree = (CommonTree)adaptor.create(LPAREN484);
            adaptor.addChild(root_0, LPAREN484_tree);

            pushFollow(FOLLOW_expression_in_collection_exists3874);
            expression485=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression485.getTree());
            RPAREN486=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists3876); 
            RPAREN486_tree = (CommonTree)adaptor.create(RPAREN486);
            adaptor.addChild(root_0, RPAREN486_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collection_exists"

    public static class conditional_predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_predicate"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:551:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQLParser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQLParser.conditional_predicate_return retval = new PLSQLParser.conditional_predicate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSERTING487=null;
        Token UPDATING488=null;
        Token LPAREN489=null;
        Token QUOTED_STRING490=null;
        Token RPAREN491=null;
        Token DELETING492=null;

        CommonTree INSERTING487_tree=null;
        CommonTree UPDATING488_tree=null;
        CommonTree LPAREN489_tree=null;
        CommonTree QUOTED_STRING490_tree=null;
        CommonTree RPAREN491_tree=null;
        CommonTree DELETING492_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:552:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
            int alt144=3;
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

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:552:7: INSERTING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSERTING487=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate3893); 
                    INSERTING487_tree = (CommonTree)adaptor.create(INSERTING487);
                    adaptor.addChild(root_0, INSERTING487_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:553:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UPDATING488=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate3901); 
                    UPDATING488_tree = (CommonTree)adaptor.create(UPDATING488);
                    adaptor.addChild(root_0, UPDATING488_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:553:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==LPAREN) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:553:18: LPAREN QUOTED_STRING RPAREN
                            {
                            LPAREN489=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate3905); 
                            LPAREN489_tree = (CommonTree)adaptor.create(LPAREN489);
                            adaptor.addChild(root_0, LPAREN489_tree);

                            QUOTED_STRING490=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate3907); 
                            QUOTED_STRING490_tree = (CommonTree)adaptor.create(QUOTED_STRING490);
                            adaptor.addChild(root_0, QUOTED_STRING490_tree);

                            RPAREN491=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate3909); 
                            RPAREN491_tree = (CommonTree)adaptor.create(RPAREN491);
                            adaptor.addChild(root_0, RPAREN491_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:554:7: DELETING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETING492=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate3920); 
                    DELETING492_tree = (CommonTree)adaptor.create(DELETING492);
                    adaptor.addChild(root_0, DELETING492_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional_predicate"

    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:557:1: parameter : ( ID ARROW )? expression ;
    public final PLSQLParser.parameter_return parameter() throws RecognitionException {
        PLSQLParser.parameter_return retval = new PLSQLParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID493=null;
        Token ARROW494=null;
        PLSQLParser.expression_return expression495 = null;


        CommonTree ID493_tree=null;
        CommonTree ARROW494_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:558:5: ( ( ID ARROW )? expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:558:7: ( ID ARROW )? expression
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:558:7: ( ID ARROW )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==ID) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==ARROW) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:558:9: ID ARROW
                    {
                    ID493=(Token)match(input,ID,FOLLOW_ID_in_parameter3939); 
                    ID493_tree = (CommonTree)adaptor.create(ID493);
                    adaptor.addChild(root_0, ID493_tree);

                    ARROW494=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter3941); 
                    ARROW494_tree = (CommonTree)adaptor.create(ARROW494);
                    adaptor.addChild(root_0, ARROW494_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_parameter3946);
            expression495=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression495.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class index_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:561:1: index : expression ;
    public final PLSQLParser.index_return index() throws RecognitionException {
        PLSQLParser.index_return retval = new PLSQLParser.index_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        PLSQLParser.expression_return expression496 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:562:5: ( expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:562:7: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_index3963);
            expression496=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression496.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index"

    public static class create_package_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:565:1: create_package : CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI ;
    public final PLSQLParser.create_package_return create_package() throws RecognitionException {
        PLSQLParser.create_package_return retval = new PLSQLParser.create_package_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree schema_name_tree=null;
        CommonTree package_name_tree=null;
        CommonTree CREATE497_tree=null;
        CommonTree OR498_tree=null;
        CommonTree PACKAGE500_tree=null;
        CommonTree DOT501_tree=null;
        CommonTree set503_tree=null;
        CommonTree END505_tree=null;
        CommonTree ID506_tree=null;
        CommonTree SEMI507_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:565:16: ( CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:566:9: CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            CREATE497=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package3984); 
            CREATE497_tree = (CommonTree)adaptor.create(CREATE497);
            adaptor.addChild(root_0, CREATE497_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:566:16: ( OR kREPLACE )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==OR) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:566:18: OR kREPLACE
                    {
                    OR498=(Token)match(input,OR,FOLLOW_OR_in_create_package3988); 
                    OR498_tree = (CommonTree)adaptor.create(OR498);
                    adaptor.addChild(root_0, OR498_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package3990);
                    kREPLACE499=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE499.getTree());

                    }
                    break;

            }

            PACKAGE500=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package3995); 
            PACKAGE500_tree = (CommonTree)adaptor.create(PACKAGE500);
            adaptor.addChild(root_0, PACKAGE500_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:566:41: (schema_name= ID DOT )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==ID) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==DOT) ) {
                    alt147=1;
                }
            }
            switch (alt147) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:566:43: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4001); 
                    schema_name_tree = (CommonTree)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT501=(Token)match(input,DOT,FOLLOW_DOT_in_create_package4003); 
                    DOT501_tree = (CommonTree)adaptor.create(DOT501);
                    adaptor.addChild(root_0, DOT501_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4010); 
            package_name_tree = (CommonTree)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:567:9: ( invoker_rights_clause )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==AUTHID) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:567:11: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4022);
                    invoker_rights_clause502=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause502.getTree());

                    }
                    break;

            }

            set503=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set503));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:21: ( declare_section )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=PROCEDURE && LA149_0<=FUNCTION)||LA149_0==CURSOR||LA149_0==SUBTYPE||LA149_0==PRAGMA) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package4047);
                    declare_section504=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section504.getTree());

                    }
                    break;

            }

            END505=(Token)match(input,END,FOLLOW_END_in_create_package4052); 
            END505_tree = (CommonTree)adaptor.create(END505);
            adaptor.addChild(root_0, END505_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:46: ( ID )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==ID) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:568:48: ID
                    {
                    ID506=(Token)match(input,ID,FOLLOW_ID_in_create_package4056); 
                    ID506_tree = (CommonTree)adaptor.create(ID506);
                    adaptor.addChild(root_0, ID506_tree);


                    }
                    break;

            }

            SEMI507=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4061); 
            SEMI507_tree = (CommonTree)adaptor.create(SEMI507);
            adaptor.addChild(root_0, SEMI507_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_package"

    public static class create_package_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package_body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLParser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQLParser.create_package_body_return retval = new PLSQLParser.create_package_body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree schema_name_tree=null;
        CommonTree package_name_tree=null;
        CommonTree package_name2_tree=null;
        CommonTree CREATE508_tree=null;
        CommonTree OR509_tree=null;
        CommonTree PACKAGE511_tree=null;
        CommonTree BODY512_tree=null;
        CommonTree DOT513_tree=null;
        CommonTree set514_tree=null;
        CommonTree END516_tree=null;
        CommonTree SEMI517_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:571:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:572:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            CREATE508=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4082); 
            CREATE508_tree = (CommonTree)adaptor.create(CREATE508);
            adaptor.addChild(root_0, CREATE508_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:572:16: ( OR kREPLACE )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==OR) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:572:18: OR kREPLACE
                    {
                    OR509=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4086); 
                    OR509_tree = (CommonTree)adaptor.create(OR509);
                    adaptor.addChild(root_0, OR509_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4088);
                    kREPLACE510=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE510.getTree());

                    }
                    break;

            }

            PACKAGE511=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4093); 
            PACKAGE511_tree = (CommonTree)adaptor.create(PACKAGE511);
            adaptor.addChild(root_0, PACKAGE511_tree);

            BODY512=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4095); 
            BODY512_tree = (CommonTree)adaptor.create(BODY512);
            adaptor.addChild(root_0, BODY512_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:572:46: (schema_name= ID DOT )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==ID) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==DOT) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:572:48: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4101); 
                    schema_name_tree = (CommonTree)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT513=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4103); 
                    DOT513_tree = (CommonTree)adaptor.create(DOT513);
                    adaptor.addChild(root_0, DOT513_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4110); 
            package_name_tree = (CommonTree)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            set514=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set514));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:573:21: ( declare_section )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=PROCEDURE && LA153_0<=FUNCTION)||LA153_0==CURSOR||LA153_0==SUBTYPE||LA153_0==PRAGMA) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:573:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package_body4132);
                    declare_section515=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section515.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:9: (initialize_section= body | END (package_name2= ID )? )
            int alt155=2;
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

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:11: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_create_package_body4149);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:37: END (package_name2= ID )?
                    {
                    END516=(Token)match(input,END,FOLLOW_END_in_create_package_body4153); 
                    END516_tree = (CommonTree)adaptor.create(END516);
                    adaptor.addChild(root_0, END516_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:41: (package_name2= ID )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==ID) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:574:43: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4159); 
                            package_name2_tree = (CommonTree)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI517=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4174); 
            SEMI517_tree = (CommonTree)adaptor.create(SEMI517);
            adaptor.addChild(root_0, SEMI517_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_package_body"

    public static class create_procedure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_procedure"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:578:1: create_procedure : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLParser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQLParser.create_procedure_return retval = new PLSQLParser.create_procedure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree schema_name_tree=null;
        CommonTree procedure_name_tree=null;
        CommonTree CREATE518_tree=null;
        CommonTree OR519_tree=null;
        CommonTree PROCEDURE521_tree=null;
        CommonTree DOT522_tree=null;
        CommonTree LPAREN523_tree=null;
        CommonTree COMMA525_tree=null;
        CommonTree RPAREN527_tree=null;
        CommonTree set529_tree=null;
        CommonTree EXTERNAL533_tree=null;
        CommonTree SEMI534_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:578:18: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:579:9: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            CREATE518=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4195); 
            CREATE518_tree = (CommonTree)adaptor.create(CREATE518);
            adaptor.addChild(root_0, CREATE518_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:579:16: ( OR kREPLACE )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==OR) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:579:18: OR kREPLACE
                    {
                    OR519=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4199); 
                    OR519_tree = (CommonTree)adaptor.create(OR519);
                    adaptor.addChild(root_0, OR519_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4201);
                    kREPLACE520=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE520.getTree());

                    }
                    break;

            }

            PROCEDURE521=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4206); 
            PROCEDURE521_tree = (CommonTree)adaptor.create(PROCEDURE521);
            adaptor.addChild(root_0, PROCEDURE521_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:579:43: (schema_name= ID DOT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==ID) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==DOT) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:579:45: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4212); 
                    schema_name_tree = (CommonTree)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT522=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4214); 
                    DOT522_tree = (CommonTree)adaptor.create(DOT522);
                    adaptor.addChild(root_0, DOT522_tree);


                    }
                    break;

            }

            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4221); 
            procedure_name_tree = (CommonTree)adaptor.create(procedure_name);
            adaptor.addChild(root_0, procedure_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:580:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==LPAREN) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:580:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN523=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_procedure4233); 
                    LPAREN523_tree = (CommonTree)adaptor.create(LPAREN523);
                    adaptor.addChild(root_0, LPAREN523_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4235);
                    parameter_declaration524=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration524.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:580:40: ( COMMA parameter_declaration )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==COMMA) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:580:42: COMMA parameter_declaration
                    	    {
                    	    COMMA525=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_procedure4239); 
                    	    COMMA525_tree = (CommonTree)adaptor.create(COMMA525);
                    	    adaptor.addChild(root_0, COMMA525_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4241);
                    	    parameter_declaration526=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration526.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);

                    RPAREN527=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_procedure4246); 
                    RPAREN527_tree = (CommonTree)adaptor.create(RPAREN527);
                    adaptor.addChild(root_0, RPAREN527_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:581:9: ( invoker_rights_clause )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==AUTHID) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:581:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4259);
                    invoker_rights_clause528=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause528.getTree());

                    }
                    break;

            }

            set529=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set529));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt162=3;
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

                throw nvae;
            }

            switch (alt162) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:11: ( declare_section )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( ((LA161_0>=PROCEDURE && LA161_0<=FUNCTION)||LA161_0==CURSOR||LA161_0==SUBTYPE||LA161_0==PRAGMA) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:583:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_procedure4290);
                            declare_section530=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section530.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_procedure4293);
                    body531=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body531.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:584:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_procedure4305);
                    call_spec532=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec532.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:585:11: EXTERNAL
                    {
                    EXTERNAL533=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure4317); 
                    EXTERNAL533_tree = (CommonTree)adaptor.create(EXTERNAL533);
                    adaptor.addChild(root_0, EXTERNAL533_tree);


                    }
                    break;

            }

            SEMI534=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure4329); 
            SEMI534_tree = (CommonTree)adaptor.create(SEMI534);
            adaptor.addChild(root_0, SEMI534_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_procedure"

    public static class create_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_function"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:589:1: create_function : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLParser.create_function_return create_function() throws RecognitionException {
        PLSQLParser.create_function_return retval = new PLSQLParser.create_function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree schema_name_tree=null;
        CommonTree function_name_tree=null;
        CommonTree CREATE535_tree=null;
        CommonTree OR536_tree=null;
        CommonTree FUNCTION538_tree=null;
        CommonTree DOT539_tree=null;
        CommonTree LPAREN540_tree=null;
        CommonTree COMMA542_tree=null;
        CommonTree RPAREN544_tree=null;
        CommonTree RETURN545_tree=null;
        CommonTree set548_tree=null;
        CommonTree EXTERNAL552_tree=null;
        CommonTree SEMI553_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:589:17: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:590:9: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            CREATE535=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function4350); 
            CREATE535_tree = (CommonTree)adaptor.create(CREATE535);
            adaptor.addChild(root_0, CREATE535_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:590:16: ( OR kREPLACE )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==OR) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:590:18: OR kREPLACE
                    {
                    OR536=(Token)match(input,OR,FOLLOW_OR_in_create_function4354); 
                    OR536_tree = (CommonTree)adaptor.create(OR536);
                    adaptor.addChild(root_0, OR536_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_function4356);
                    kREPLACE537=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE537.getTree());

                    }
                    break;

            }

            FUNCTION538=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function4361); 
            FUNCTION538_tree = (CommonTree)adaptor.create(FUNCTION538);
            adaptor.addChild(root_0, FUNCTION538_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:590:42: (schema_name= ID DOT )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==ID) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==DOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:590:44: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4367); 
                    schema_name_tree = (CommonTree)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT539=(Token)match(input,DOT,FOLLOW_DOT_in_create_function4369); 
                    DOT539_tree = (CommonTree)adaptor.create(DOT539);
                    adaptor.addChild(root_0, DOT539_tree);


                    }
                    break;

            }

            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4376); 
            function_name_tree = (CommonTree)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:591:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==LPAREN) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:591:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN540=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_function4388); 
                    LPAREN540_tree = (CommonTree)adaptor.create(LPAREN540);
                    adaptor.addChild(root_0, LPAREN540_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_function4390);
                    parameter_declaration541=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration541.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:591:40: ( COMMA parameter_declaration )*
                    loop165:
                    do {
                        int alt165=2;
                        int LA165_0 = input.LA(1);

                        if ( (LA165_0==COMMA) ) {
                            alt165=1;
                        }


                        switch (alt165) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:591:42: COMMA parameter_declaration
                    	    {
                    	    COMMA542=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_function4394); 
                    	    COMMA542_tree = (CommonTree)adaptor.create(COMMA542);
                    	    adaptor.addChild(root_0, COMMA542_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_function4396);
                    	    parameter_declaration543=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration543.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop165;
                        }
                    } while (true);

                    RPAREN544=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_function4401); 
                    RPAREN544_tree = (CommonTree)adaptor.create(RPAREN544);
                    adaptor.addChild(root_0, RPAREN544_tree);


                    }
                    break;

            }

            RETURN545=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function4414); 
            RETURN545_tree = (CommonTree)adaptor.create(RETURN545);
            adaptor.addChild(root_0, RETURN545_tree);

            pushFollow(FOLLOW_datatype_in_create_function4416);
            datatype546=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype546.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:9: ( invoker_rights_clause )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==AUTHID) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:593:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function4426);
                    invoker_rights_clause547=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause547.getTree());

                    }
                    break;

            }

            set548=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set548));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:595:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt169=3;
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

                throw nvae;
            }

            switch (alt169) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:595:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:595:11: ( declare_section )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( ((LA168_0>=PROCEDURE && LA168_0<=FUNCTION)||LA168_0==CURSOR||LA168_0==SUBTYPE||LA168_0==PRAGMA) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:595:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_function4457);
                            declare_section549=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section549.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_function4460);
                    body550=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body550.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:596:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_function4472);
                    call_spec551=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec551.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:597:11: EXTERNAL
                    {
                    EXTERNAL552=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function4484); 
                    EXTERNAL552_tree = (CommonTree)adaptor.create(EXTERNAL552);
                    adaptor.addChild(root_0, EXTERNAL552_tree);


                    }
                    break;

            }

            SEMI553=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function4496); 
            SEMI553_tree = (CommonTree)adaptor.create(SEMI553);
            adaptor.addChild(root_0, SEMI553_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_function"

    public static class invoker_rights_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoker_rights_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:601:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQLParser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQLParser.invoker_rights_clause_return retval = new PLSQLParser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AUTHID554=null;
        Token set555=null;

        CommonTree AUTHID554_tree=null;
        CommonTree set555_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:601:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:602:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (CommonTree)adaptor.nil();

            AUTHID554=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause4517); 
            AUTHID554_tree = (CommonTree)adaptor.create(AUTHID554);
            adaptor.addChild(root_0, AUTHID554_tree);

            set555=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set555));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invoker_rights_clause"

    public static class call_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_spec"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:605:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQLParser.call_spec_return call_spec() throws RecognitionException {
        PLSQLParser.call_spec_return retval = new PLSQLParser.call_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LANGUAGE556=null;
        PLSQLParser.swallow_to_semi_return swallow_to_semi557 = null;


        CommonTree LANGUAGE556_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:606:5: ( LANGUAGE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:606:7: LANGUAGE swallow_to_semi
            {
            root_0 = (CommonTree)adaptor.nil();

            LANGUAGE556=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec4544); 
            LANGUAGE556_tree = (CommonTree)adaptor.create(LANGUAGE556);
            adaptor.addChild(root_0, LANGUAGE556_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_call_spec4546);
            swallow_to_semi557=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi557.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_spec"

    public static class kERRORS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kERRORS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:609:1: kERRORS : {...}? ID ;
    public final PLSQLParser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQLParser.kERRORS_return retval = new PLSQLParser.kERRORS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID558=null;

        CommonTree ID558_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:609:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:609:11: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()))) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            ID558=(Token)match(input,ID,FOLLOW_ID_in_kERRORS4561); 
            ID558_tree = (CommonTree)adaptor.create(ID558);
            adaptor.addChild(root_0, ID558_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kERRORS"

    public static class kEXCEPTIONS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kEXCEPTIONS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:610:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQLParser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQLParser.kEXCEPTIONS_return retval = new PLSQLParser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID559=null;

        CommonTree ID559_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:610:13: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:610:15: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("exceptions"))) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            ID559=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS4570); 
            ID559_tree = (CommonTree)adaptor.create(ID559);
            adaptor.addChild(root_0, ID559_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kEXCEPTIONS"

    public static class kFOUND_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kFOUND"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:611:1: kFOUND : {...}? ID ;
    public final PLSQLParser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQLParser.kFOUND_return retval = new PLSQLParser.kFOUND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID560=null;

        CommonTree ID560_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:611:8: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:611:10: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            ID560=(Token)match(input,ID,FOLLOW_ID_in_kFOUND4579); 
            ID560_tree = (CommonTree)adaptor.create(ID560);
            adaptor.addChild(root_0, ID560_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kFOUND"

    public static class kINDICES_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kINDICES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:1: kINDICES : {...}? ID ;
    public final PLSQLParser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQLParser.kINDICES_return retval = new PLSQLParser.kINDICES_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID561=null;

        CommonTree ID561_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:612:12: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            ID561=(Token)match(input,ID,FOLLOW_ID_in_kINDICES4588); 
            ID561_tree = (CommonTree)adaptor.create(ID561);
            adaptor.addChild(root_0, ID561_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kINDICES"

    public static class kMOD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kMOD"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:1: kMOD : {...}? ID ;
    public final PLSQLParser.kMOD_return kMOD() throws RecognitionException {
        PLSQLParser.kMOD_return retval = new PLSQLParser.kMOD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID562=null;

        CommonTree ID562_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:6: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:613:8: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("mod"))) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            ID562=(Token)match(input,ID,FOLLOW_ID_in_kMOD4597); 
            ID562_tree = (CommonTree)adaptor.create(ID562);
            adaptor.addChild(root_0, ID562_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kMOD"

    public static class kNAME_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kNAME"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:1: kNAME : {...}? ID ;
    public final PLSQLParser.kNAME_return kNAME() throws RecognitionException {
        PLSQLParser.kNAME_return retval = new PLSQLParser.kNAME_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID563=null;

        CommonTree ID563_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:614:9: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("name"))) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            ID563=(Token)match(input,ID,FOLLOW_ID_in_kNAME4606); 
            ID563_tree = (CommonTree)adaptor.create(ID563);
            adaptor.addChild(root_0, ID563_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kNAME"

    public static class kOF_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kOF"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:1: kOF : {...}? ID ;
    public final PLSQLParser.kOF_return kOF() throws RecognitionException {
        PLSQLParser.kOF_return retval = new PLSQLParser.kOF_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID564=null;

        CommonTree ID564_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:5: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:615:7: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("of"))) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            ID564=(Token)match(input,ID,FOLLOW_ID_in_kOF4615); 
            ID564_tree = (CommonTree)adaptor.create(ID564);
            adaptor.addChild(root_0, ID564_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kOF"

    public static class kREPLACE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kREPLACE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:1: kREPLACE : {...}? ID ;
    public final PLSQLParser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQLParser.kREPLACE_return retval = new PLSQLParser.kREPLACE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID565=null;

        CommonTree ID565_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:616:12: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("replace"))) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            ID565=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE4624); 
            ID565_tree = (CommonTree)adaptor.create(ID565);
            adaptor.addChild(root_0, ID565_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kREPLACE"

    public static class kROWCOUNT_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kROWCOUNT"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:1: kROWCOUNT : {...}? ID ;
    public final PLSQLParser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQLParser.kROWCOUNT_return retval = new PLSQLParser.kROWCOUNT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID566=null;

        CommonTree ID566_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:11: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:617:13: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            ID566=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT4633); 
            ID566_tree = (CommonTree)adaptor.create(ID566);
            adaptor.addChild(root_0, ID566_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kROWCOUNT"

    public static class kSAVE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSAVE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:1: kSAVE : {...}? ID ;
    public final PLSQLParser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQLParser.kSAVE_return retval = new PLSQLParser.kSAVE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID567=null;

        CommonTree ID567_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:618:9: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("save"))) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            ID567=(Token)match(input,ID,FOLLOW_ID_in_kSAVE4642); 
            ID567_tree = (CommonTree)adaptor.create(ID567);
            adaptor.addChild(root_0, ID567_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kSAVE"

    public static class kSHOW_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSHOW"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:1: kSHOW : {...}? ID ;
    public final PLSQLParser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQLParser.kSHOW_return retval = new PLSQLParser.kSHOW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID568=null;

        CommonTree ID568_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:619:9: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("show"))) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            ID568=(Token)match(input,ID,FOLLOW_ID_in_kSHOW4651); 
            ID568_tree = (CommonTree)adaptor.create(ID568);
            adaptor.addChild(root_0, ID568_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kSHOW"

    public static class kTYPE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kTYPE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:1: kTYPE : {...}? ID ;
    public final PLSQLParser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQLParser.kTYPE_return retval = new PLSQLParser.kTYPE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID569=null;

        CommonTree ID569_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:620:9: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("type"))) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            ID569=(Token)match(input,ID,FOLLOW_ID_in_kTYPE4660); 
            ID569_tree = (CommonTree)adaptor.create(ID569);
            adaptor.addChild(root_0, ID569_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kTYPE"

    public static class kVALUES_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kVALUES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:1: kVALUES : {...}? ID ;
    public final PLSQLParser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQLParser.kVALUES_return retval = new PLSQLParser.kVALUES_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID570=null;

        CommonTree ID570_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQL.g:621:11: {...}? ID
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("values"))) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            ID570=(Token)match(input,ID,FOLLOW_ID_in_kVALUES4669); 
            ID570_tree = (CommonTree)adaptor.create(ID570);
            adaptor.addChild(root_0, ID570_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
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
        "\1\6\1\uffff\1\7\6\uffff\1\5\1\uffff";
    static final String DFA13_maxS =
        "\1\111\1\uffff\1\40\6\uffff\1\42\1\uffff";
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
            return "()+ loopback of 112:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+";
        }
    }
    static final String DFA93_eotS =
        "\17\uffff";
    static final String DFA93_eofS =
        "\17\uffff";
    static final String DFA93_minS =
        "\1\7\2\uffff\1\0\13\uffff";
    static final String DFA93_maxS =
        "\1\160\2\uffff\1\0\13\uffff";
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
            return "329:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
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
                        if ( (!((((input.LT(1).getText().equalsIgnoreCase("indices"))||(input.LT(1).getText().equalsIgnoreCase("values")))))) ) {s = 1;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {s = 13;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("values"))) ) {s = 14;}

                         
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
        "\1\7\1\uffff\1\4\6\uffff\1\7";
    static final String DFA136_maxS =
        "\1\160\1\uffff\1\143\6\uffff\1\155";
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
            return "497:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file71 = new BitSet(new long[]{0x0000000000000010L,0x0004000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file75 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file77 = new BitSet(new long[]{0x0000000000000010L,0x0004000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file82 = new BitSet(new long[]{0x0000000000000010L,0x0004000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors111 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_SEMI_in_show_errors113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_procedure_heading178 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading202 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_function_heading204 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading206 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RETURN_in_function_heading209 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_function_heading211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations236 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations239 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations243 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations246 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration274 = new BitSet(new long[]{0x0000000100006080L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration278 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration286 = new BitSet(new long[]{0x0000000100008080L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration290 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration292 = new BitSet(new long[]{0x0000000100008080L});
    public static final BitSet FOLLOW_NOCOPY_in_parameter_declaration296 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration304 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_set_in_parameter_declaration316 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_definition_in_declare_section348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section350 = new BitSet(new long[]{0x00000000010401C2L,0x0000000000000200L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section360 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section370 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section380 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section390 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section400 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_pragma_in_declare_section408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section410 = new BitSet(new long[]{0x00000000010401E2L,0x0000000000000200L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_cursor_definition440 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition442 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration501 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration503 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration511 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration513 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_variable_declaration518 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration555 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration557 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration559 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration563 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration565 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_constant_declaration570 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration605 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition628 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_type_definition630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IS_in_type_definition632 = new BitSet(new long[]{0x0000000136000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition667 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_subtype_definition669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition671 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition673 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition677 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition700 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition702 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition704 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition708 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition710 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration729 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration731 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration737 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration739 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration744 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition789 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition791 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition796 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition800 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition802 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition804 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition806 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition808 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition812 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition828 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition830 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition832 = new BitSet(new long[]{0x0000000040100002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition838 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition845 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition847 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition874 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition876 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition880 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype901 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_datatype906 = new BitSet(new long[]{0x0000000600000402L});
    public static final BitSet FOLLOW_DOT_in_datatype910 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_datatype912 = new BitSet(new long[]{0x0000000400000402L});
    public static final BitSet FOLLOW_LPAREN_in_datatype919 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype921 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_datatype925 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype927 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_datatype932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype936 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_kTYPE_in_datatype940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition970 = new BitSet(new long[]{0x000001F000080002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition980 = new BitSet(new long[]{0x000001F000080002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1009 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1019 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1043 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1053 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1091 = new BitSet(new long[]{0x000001F000080000L});
    public static final BitSet FOLLOW_set_in_function_definition1101 = new BitSet(new long[]{0x000001F000080000L});
    public static final BitSet FOLLOW_set_in_function_definition1128 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1138 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_function_definition1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1159 = new BitSet(new long[]{0x0000010000080002L});
    public static final BitSet FOLLOW_set_in_procedure_declaration_or_definition1171 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1181 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1212 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_procedure_definition1215 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1225 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_procedure_definition1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1242 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_body1244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1246 = new BitSet(new long[]{0x0377860001A403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_body1250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1252 = new BitSet(new long[]{0x0377860001A403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_pragma_in_body1256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1258 = new BitSet(new long[]{0x0377860001A403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_EXCEPTION_in_body1266 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body1268 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_END_in_body1274 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_body1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1288 = new BitSet(new long[]{0x0000A00000000080L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1292 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1296 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1298 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1305 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1311 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_exception_handler1315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1317 = new BitSet(new long[]{0x03778200012403E2L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_label_in_statement1335 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue1511 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue1515 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_call_in_lvalue1517 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement1537 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement1541 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement1547 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call1569 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_call1572 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_call1576 = new BitSet(new long[]{0x0000800000301480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_parameter_in_call1580 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_call1584 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_parameter_in_call1586 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_call1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call1614 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call1618 = new BitSet(new long[]{0x0000800000301480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call1620 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1647 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement1651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement1653 = new BitSet(new long[]{0x03778600012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_END_in_basic_loop_statement1658 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1660 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement1684 = new BitSet(new long[]{0x0000880000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1686 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement1699 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1701 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement1703 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_case_statement1707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1709 = new BitSet(new long[]{0x037F8E00012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_ELSE_in_case_statement1727 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_case_statement1729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_END_in_case_statement1744 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement1746 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_case_statement1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement1770 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_close_statement1772 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement1776 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_close_statement1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement1802 = new BitSet(new long[]{0x0000080000000082L});
    public static final BitSet FOLLOW_ID_in_continue_statement1808 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement1815 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement1841 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement1843 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement1845 = new BitSet(new long[]{0xD800000000000202L});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement1859 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement1863 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement1879 = new BitSet(new long[]{0x8000000000000202L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement1926 = new BitSet(new long[]{0x0000080000000082L});
    public static final BitSet FOLLOW_ID_in_exit_statement1932 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement1939 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement1965 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement1967 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement1975 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement1979 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2011 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2013 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2017 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2019 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2047 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2049 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2051 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2053 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2057 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2059 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_USING_in_using_clause2083 = new BitSet(new long[]{0x0000800000306480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2085 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2088 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2092 = new BitSet(new long[]{0x0000800000306480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2094 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2097 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2114 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2139 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2180 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2182 = new BitSet(new long[]{0xFFFDFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2186 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2194 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2200 = new BitSet(new long[]{0x03778600012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_END_in_for_loop_statement2205 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2207 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2231 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_forall_statement2233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2235 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2237 = new BitSet(new long[]{0x0001000000000000L,0x00000000005FC000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2239 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2243 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2269 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2279 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2281 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2283 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2287 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2291 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2304 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2306 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2329 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2352 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2354 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2356 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_if_statement2360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2362 = new BitSet(new long[]{0x037F8600012403E0L,0x0000000000DFDFE3L});
    public static final BitSet FOLLOW_ELSIF_in_if_statement2377 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2379 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2381 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_if_statement2385 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2387 = new BitSet(new long[]{0x037F8600012403E0L,0x0000000000DFDFE3L});
    public static final BitSet FOLLOW_ELSE_in_if_statement2405 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_if_statement2409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2411 = new BitSet(new long[]{0x03778600012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_END_in_if_statement2427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IF_in_if_statement2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement2471 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_open_statement2473 = new BitSet(new long[]{0x0000000200000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_open_statement2477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_open_statement2479 = new BitSet(new long[]{0x0000000200000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_call_args_in_open_statement2484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_FOR_in_open_statement2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma2515 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement2538 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_raise_statement2542 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement2546 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_raise_statement2548 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement2575 = new BitSet(new long[]{0x0000800000300482L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_return_statement2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block2601 = new BitSet(new long[]{0x00000000010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block2603 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_plsql_block2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_label_in_label2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RLABEL_in_label2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id2647 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_qual_id2650 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id2654 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_COLON_in_qual_id2656 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_qual_id2659 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement2764 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement2788 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement2811 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement2834 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement2836 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement2859 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement2883 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement2906 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement2931 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement2954 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi2977 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3004 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3006 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3008 = new BitSet(new long[]{0x03778200012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3014 = new BitSet(new long[]{0x03778600012403E0L,0x0000000000DFDF63L});
    public static final BitSet FOLLOW_END_in_while_loop_statement3019 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3021 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3052 = new BitSet(new long[]{0xFFFFFEFFFFF78BD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3092 = new BitSet(new long[]{0xFFFFFEFFFFF79FD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3094 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3137 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3141 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3143 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_and_expr3167 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_not_expr3189 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3209 = new BitSet(new long[]{0x0000000000000002L,0x000000003F000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3213 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3259 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3263 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3265 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3287 = new BitSet(new long[]{0x0000000000100002L,0x0000000040000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3291 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3294 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3316 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_between_expr3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3323 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_between_expr3327 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3349 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_NOT_in_in_expr3353 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_in_expr3356 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr3358 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3360 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_in_expr3364 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3366 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3408 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_set_in_add_expr3412 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3426 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3446 = new BitSet(new long[]{0x0000000000000092L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr3452 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr3456 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr3460 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3464 = new BitSet(new long[]{0x0000000000000092L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr3484 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3512 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr3516 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom3538 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom3542 = new BitSet(new long[]{0x0000000000000080L,0x000000E000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom3555 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3557 = new BitSet(new long[]{0x0000000000000080L,0x000000E000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3599 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_atom3601 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3624 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3628 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3630 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3637 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute3659 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_attribute3661 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_attribute3663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args3714 = new BitSet(new long[]{0x0000800000301480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3718 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_call_args3722 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3724 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_call_args3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists3866 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists3868 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists3870 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists3872 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists3874 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate3901 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate3905 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate3907 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter3939 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter3941 = new BitSet(new long[]{0x0000800000300480L,0x0001DF1180000000L});
    public static final BitSet FOLLOW_expression_in_parameter3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package3984 = new BitSet(new long[]{0x0000100000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package3988 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package3990 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package3995 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package4001 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_create_package4003 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package4010 = new BitSet(new long[]{0x0000010000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4022 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_create_package4035 = new BitSet(new long[]{0x00000400010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_create_package4047 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_END_in_create_package4052 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ID_in_create_package4056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_package4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4082 = new BitSet(new long[]{0x0000100000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package_body4086 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4088 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4093 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4095 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package_body4101 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package_body4110 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_create_package_body4120 = new BitSet(new long[]{0x00000600010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4132 = new BitSet(new long[]{0x00000600010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_create_package_body4149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_END_in_create_package_body4153 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ID_in_create_package_body4159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4195 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_OR_in_create_procedure4199 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4206 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_procedure4212 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4214 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_procedure4221 = new BitSet(new long[]{0x0000010000080400L,0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_procedure4233 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4235 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_create_procedure4239 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4241 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_create_procedure4246 = new BitSet(new long[]{0x0000010000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4259 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_create_procedure4270 = new BitSet(new long[]{0x00000200010401E0L,0x0220000000000200L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4290 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_create_procedure4293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure4305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure4317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function4350 = new BitSet(new long[]{0x0000100000000100L});
    public static final BitSet FOLLOW_OR_in_create_function4354 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function4356 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function4361 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_function4367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_create_function4369 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_function4376 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_LPAREN_in_create_function4388 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4390 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_create_function4394 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4396 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_create_function4401 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RETURN_in_create_function4414 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_datatype_in_create_function4416 = new BitSet(new long[]{0x0000010000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function4426 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_create_function4437 = new BitSet(new long[]{0x00000200010401E0L,0x0220000000000200L});
    public static final BitSet FOLLOW_declare_section_in_create_function4457 = new BitSet(new long[]{0x00000200010401E0L,0x0000000000000200L});
    public static final BitSet FOLLOW_body_in_create_function4460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_call_spec_in_create_function4472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function4484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_function4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause4517 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec4544 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES4669 = new BitSet(new long[]{0x0000000000000002L});

}