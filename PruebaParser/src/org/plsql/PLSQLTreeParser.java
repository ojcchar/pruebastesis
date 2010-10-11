// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g 2010-10-11 12:09:32

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PLSQLTreeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROC", "DECL", "PROC_CALL", "DEFCURSOR", "PARAMS", "PARAM", "BODY", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "IN", "OUT", "NOCOPY", "ASSIGN", "DEFAULT", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "SUBTYPE", "RECORD", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "AS", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "N", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT"
    };
    public static final int PACKAGE=122;
    public static final int FUNCTION=15;
    public static final int EXTERNAL=123;
    public static final int EXPONENT=106;
    public static final int WHILE=94;
    public static final int DETERMINISTIC=43;
    public static final int VARYING=33;
    public static final int CASE=57;
    public static final int DEFCURSOR=7;
    public static final int PARAM=9;
    public static final int DOUBLEDOT=73;
    public static final int NOT=27;
    public static final int SUBTYPE=31;
    public static final int EOF=-1;
    public static final int SQL=107;
    public static final int RPAREN=19;
    public static final int CREATE=121;
    public static final int INSERT=86;
    public static final int USING=69;
    public static final int RETURNING=70;
    public static final int BEGIN=48;
    public static final int LOOP=56;
    public static final int SAVEPOINT=89;
    public static final int RETURN=16;
    public static final int BODY=10;
    public static final int RAISE=81;
    public static final int GEQ=100;
    public static final int EQ=95;
    public static final int GOTO=76;
    public static final int SELECT=90;
    public static final int ISOPEN=109;
    public static final int INTO=66;
    public static final int ARRAY=34;
    public static final int DIVIDE=11;
    public static final int EXCEPTION=30;
    public static final int RBRACK=131;
    public static final int EXIT=63;
    public static final int RECORD=32;
    public static final int N=134;
    public static final int TRANSACTION=92;
    public static final int NULL=28;
    public static final int ELSE=58;
    public static final int AT_SIGN=130;
    public static final int DEFINER=126;
    public static final int DELETE=55;
    public static final int DOUBLEVERTBAR=104;
    public static final int ROLLBACK=88;
    public static final int AUTHID=124;
    public static final int NOCOPY=22;
    public static final int WS=136;
    public static final int LANGUAGE=127;
    public static final int FETCH=64;
    public static final int OUT=21;
    public static final int REAL_NUMBER=112;
    public static final int PIPELINED=44;
    public static final int SL_COMMENT=137;
    public static final int OR=51;
    public static final int CONSTANT=29;
    public static final int ELSIF=78;
    public static final int END=49;
    public static final int FALSE=114;
    public static final int COLLECT=68;
    public static final int CURSOR=25;
    public static final int OTHERS=52;
    public static final int LBRACK=132;
    public static final int PROC_CALL=6;
    public static final int POINT=129;
    public static final int CURRENT_USER=125;
    public static final int LIMIT=65;
    public static final int EXECUTE=61;
    public static final int INSERTING=117;
    public static final int GTH=99;
    public static final int NOTFOUND=110;
    public static final int PRAGMA=80;
    public static final int RESULT_CACHE=46;
    public static final int UPDATE=93;
    public static final int TABLE=36;
    public static final int LLABEL=83;
    public static final int FOR=71;
    public static final int ID=14;
    public static final int AND=75;
    public static final int ASTERISK=105;
    public static final int LPAREN=17;
    public static final int LOCK=87;
    public static final int UPDATING=118;
    public static final int IF=77;
    public static final int RLABEL=84;
    public static final int ML_COMMENT=138;
    public static final int INDEX=37;
    public static final int AS=47;
    public static final int ROWTYPE=42;
    public static final int IN=20;
    public static final int THEN=53;
    public static final int CONTINUE=60;
    public static final int COMMA=18;
    public static final int IS=26;
    public static final int PROC=4;
    public static final int QUOTED_STRING=115;
    public static final int PLUS=103;
    public static final int EXISTS=116;
    public static final int DOT=40;
    public static final int LIKE=101;
    public static final int PARAMS=8;
    public static final int INTEGER=111;
    public static final int BY=38;
    public static final int VARRAY=35;
    public static final int PERCENT=41;
    public static final int PARALLEL_ENABLE=45;
    public static final int DOUBLEQUOTED_STRING=128;
    public static final int DEFAULT=24;
    public static final int FORALL=72;
    public static final int SET=91;
    public static final int MINUS=102;
    public static final int TRUE=113;
    public static final int SEMI=12;
    public static final int PROCEDURE=13;
    public static final int NOT_EQ=96;
    public static final int REF=39;
    public static final int VERTBAR=133;
    public static final int LTH=97;
    public static final int COLON=54;
    public static final int OPEN=79;
    public static final int BULK_ROWCOUNT=108;
    public static final int COMMIT=85;
    public static final int CLOSE=59;
    public static final int WHEN=50;
    public static final int DECL=5;
    public static final int ASSIGN=23;
    public static final int NUMBER_VALUE=135;
    public static final int IMMEDIATE=62;
    public static final int ARROW=120;
    public static final int DECLARE=82;
    public static final int DELETING=119;
    public static final int BULK=67;
    public static final int BETWEEN=74;
    public static final int LEQ=98;

    // delegates
    // delegators


        public PLSQLTreeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PLSQLTreeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PLSQLTreeParser.tokenNames; }
    public String getGrammarFileName() { return "/home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g"; }



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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:88:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
    public final PLSQLTreeParser.sqlplus_file_return sqlplus_file() throws RecognitionException {
        PLSQLTreeParser.sqlplus_file_return retval = new PLSQLTreeParser.sqlplus_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIVIDE2=null;
        Token DIVIDE4=null;
        Token EOF5=null;
        PLSQLTreeParser.create_object_return create_object1 = null;

        PLSQLTreeParser.show_errors_return show_errors3 = null;


        Object DIVIDE2_tree=null;
        Object DIVIDE4_tree=null;
        Object EOF5_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file120);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:23: ( DIVIDE show_errors )?
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
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:25: DIVIDE show_errors
            	            {
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file124); 
            	            DIVIDE2_tree = (Object)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file126);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:47: ( DIVIDE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:89:47: DIVIDE
            	            {
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file131); 
            	            DIVIDE4_tree = (Object)adaptor.create(DIVIDE4);
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

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file137); 
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
        return retval;
    }
    // $ANTLR end "sqlplus_file"

    public static class show_errors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "show_errors"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:92:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQLTreeParser.show_errors_return show_errors() throws RecognitionException {
        PLSQLTreeParser.show_errors_return retval = new PLSQLTreeParser.show_errors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI8=null;
        PLSQLTreeParser.kSHOW_return kSHOW6 = null;

        PLSQLTreeParser.kERRORS_return kERRORS7 = null;


        Object SEMI8_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:5: ( kSHOW kERRORS ( SEMI )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kSHOW_in_show_errors158);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            pushFollow(FOLLOW_kERRORS_in_show_errors160);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:21: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:21: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors162); 
                    SEMI8_tree = (Object)adaptor.create(SEMI8);
                    adaptor.addChild(root_0, SEMI8_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "show_errors"

    public static class create_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_object"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:96:1: create_object : ( create_package | create_package_body | create_function | create_procedure );
    public final PLSQLTreeParser.create_object_return create_object() throws RecognitionException {
        PLSQLTreeParser.create_object_return retval = new PLSQLTreeParser.create_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.create_package_return create_package9 = null;

        PLSQLTreeParser.create_package_body_return create_package_body10 = null;

        PLSQLTreeParser.create_function_return create_function11 = null;

        PLSQLTreeParser.create_procedure_return create_procedure12 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:5: ( create_package | create_package_body | create_function | create_procedure )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case OR:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        switch ( input.LA(4) ) {
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
                        case PROCEDURE:
                            {
                            alt5=4;
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
                case PROCEDURE:
                    {
                    alt5=4;
                    }
                    break;
                case FUNCTION:
                    {
                    alt5=3;
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:7: create_package
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_in_create_object180);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:98:7: create_package_body
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_body_in_create_object188);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:99:7: create_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_function_in_create_object196);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:100:7: create_procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_procedure_in_create_object204);
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
        return retval;
    }
    // $ANTLR end "create_object"

    public static class procedure_heading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:103:1: procedure_heading : PROCEDURE ID ( parameter_declarations )? -> ^( PROC ID ( parameter_declarations )? ) ;
    public final PLSQLTreeParser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQLTreeParser.procedure_heading_return retval = new PLSQLTreeParser.procedure_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE13=null;
        Token ID14=null;
        PLSQLTreeParser.parameter_declarations_return parameter_declarations15 = null;


        Object PROCEDURE13_tree=null;
        Object ID14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:103:19: ( PROCEDURE ID ( parameter_declarations )? -> ^( PROC ID ( parameter_declarations )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:9: PROCEDURE ID ( parameter_declarations )?
            {
            PROCEDURE13=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading225);  
            stream_PROCEDURE.add(PROCEDURE13);

            ID14=(Token)match(input,ID,FOLLOW_ID_in_procedure_heading227);  
            stream_ID.add(ID14);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:22: ( parameter_declarations )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:22: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading229);
                    parameter_declarations15=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(parameter_declarations15.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: parameter_declarations, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:46: -> ^( PROC ID ( parameter_declarations )? )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:49: ^( PROC ID ( parameter_declarations )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC, "PROC"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:59: ( parameter_declarations )?
                if ( stream_parameter_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declarations.nextTree());

                }
                stream_parameter_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "procedure_heading"

    public static class function_heading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_heading"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:107:1: function_heading : FUNCTION ID ( parameter_declarations )? RETURN datatype ;
    public final PLSQLTreeParser.function_heading_return function_heading() throws RecognitionException {
        PLSQLTreeParser.function_heading_return retval = new PLSQLTreeParser.function_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION16=null;
        Token ID17=null;
        Token RETURN19=null;
        PLSQLTreeParser.parameter_declarations_return parameter_declarations18 = null;

        PLSQLTreeParser.datatype_return datatype20 = null;


        Object FUNCTION16_tree=null;
        Object ID17_tree=null;
        Object RETURN19_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:107:18: ( FUNCTION ID ( parameter_declarations )? RETURN datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:9: FUNCTION ID ( parameter_declarations )? RETURN datatype
            {
            root_0 = (Object)adaptor.nil();

            FUNCTION16=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading262); 
            FUNCTION16_tree = (Object)adaptor.create(FUNCTION16);
            adaptor.addChild(root_0, FUNCTION16_tree);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_function_heading264); 
            ID17_tree = (Object)adaptor.create(ID17);
            adaptor.addChild(root_0, ID17_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:21: ( parameter_declarations )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:21: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading266);
                    parameter_declarations18=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations18.getTree());

                    }
                    break;

            }

            RETURN19=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading269); 
            RETURN19_tree = (Object)adaptor.create(RETURN19);
            adaptor.addChild(root_0, RETURN19_tree);

            pushFollow(FOLLOW_datatype_in_function_heading271);
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
        return retval;
    }
    // $ANTLR end "function_heading"

    public static class parameter_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declarations"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:111:1: parameter_declarations : ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) ;
    public final PLSQLTreeParser.parameter_declarations_return parameter_declarations() throws RecognitionException {
        PLSQLTreeParser.parameter_declarations_return retval = new PLSQLTreeParser.parameter_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN21=null;
        Token COMMA23=null;
        Token RPAREN25=null;
        PLSQLTreeParser.parameter_declaration_return parameter_declaration22 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration24 = null;


        Object LPAREN21_tree=null;
        Object COMMA23_tree=null;
        Object RPAREN25_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:111:24: ( ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:13: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
            {
            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations296);  
            stream_LPAREN.add(LPAREN21);

            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations299);
            parameter_declaration22=parameter_declaration();

            state._fsp--;

            stream_parameter_declaration.add(parameter_declaration22.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:43: ( COMMA parameter_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:45: COMMA parameter_declaration
            	    {
            	    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations303);  
            	    stream_COMMA.add(COMMA23);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations306);
            	    parameter_declaration24=parameter_declaration();

            	    state._fsp--;

            	    stream_parameter_declaration.add(parameter_declaration24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations311);  
            stream_RPAREN.add(RPAREN25);


            }



            // AST REWRITE
            // elements: parameter_declaration, RPAREN, COMMA, LPAREN, parameter_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:9: -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:113:12: ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                adaptor.addChild(root_1, stream_LPAREN.nextNode());
                adaptor.addChild(root_1, stream_parameter_declaration.nextTree());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:113:51: ( COMMA parameter_declaration )*
                while ( stream_parameter_declaration.hasNext()||stream_COMMA.hasNext() ) {
                    adaptor.addChild(root_1, stream_COMMA.nextNode());
                    adaptor.addChild(root_1, stream_parameter_declaration.nextTree());

                }
                stream_parameter_declaration.reset();
                stream_COMMA.reset();
                adaptor.addChild(root_1, stream_RPAREN.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "parameter_declarations"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:116:1: parameter_declaration : ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? -> ^( PARAM ID datatype ) ;
    public final PLSQLTreeParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQLTreeParser.parameter_declaration_return retval = new PLSQLTreeParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID26=null;
        Token IN27=null;
        Token OUT28=null;
        Token IN29=null;
        Token OUT30=null;
        Token NOCOPY31=null;
        Token ASSIGN33=null;
        Token DEFAULT34=null;
        PLSQLTreeParser.datatype_return datatype32 = null;

        PLSQLTreeParser.expression_return expression35 = null;


        Object ID26_tree=null;
        Object IN27_tree=null;
        Object OUT28_tree=null;
        Object IN29_tree=null;
        Object OUT30_tree=null;
        Object NOCOPY31_tree=null;
        Object ASSIGN33_tree=null;
        Object DEFAULT34_tree=null;
        RewriteRuleTokenStream stream_NOCOPY=new RewriteRuleTokenStream(adaptor,"token NOCOPY");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OUT=new RewriteRuleTokenStream(adaptor,"token OUT");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:116:23: ( ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? -> ^( PARAM ID datatype ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:9: ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {
            ID26=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration366);  
            stream_ID.add(ID26);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:12: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:14: IN
                    {
                    IN27=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration370);  
                    stream_IN.add(IN27);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:19: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:21: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:21: ( OUT | IN OUT )
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
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:23: OUT
                            {
                            OUT28=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration378);  
                            stream_OUT.add(OUT28);


                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:29: IN OUT
                            {
                            IN29=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration382);  
                            stream_IN.add(IN29);

                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration384);  
                            stream_OUT.add(OUT30);


                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:38: ( NOCOPY )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOCOPY) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:38: NOCOPY
                            {
                            NOCOPY31=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_parameter_declaration388);  
                            stream_NOCOPY.add(NOCOPY31);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_parameter_declaration396);
            datatype32=datatype();

            state._fsp--;

            stream_datatype.add(datatype32.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=ASSIGN && LA13_0<=DEFAULT)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:11: ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:11: ( ASSIGN | DEFAULT )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSIGN) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==DEFAULT) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:13: ASSIGN
                            {
                            ASSIGN33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_parameter_declaration410);  
                            stream_ASSIGN.add(ASSIGN33);


                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:22: DEFAULT
                            {
                            DEFAULT34=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter_declaration414);  
                            stream_DEFAULT.add(DEFAULT34);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_parameter_declaration418);
                    expression35=expression();

                    state._fsp--;

                    stream_expression.add(expression35.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: datatype, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:46: -> ^( PARAM ID datatype )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:49: ^( PARAM ID datatype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_datatype.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class declare_section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:1: declare_section : ( type_definition SEMI -> ^( DECL ) | subtype_definition SEMI -> ^( DECL ) | cursor_definition SEMI -> ^( DECL ) | item_declaration SEMI -> ^( DECL ) | function_declaration_or_definition SEMI -> ^( DECL ) | procedure_declaration_or_definition SEMI -> ^( DECL ) | pragma SEMI -> ^( DECL ) )+ ;
    public final PLSQLTreeParser.declare_section_return declare_section() throws RecognitionException {
        PLSQLTreeParser.declare_section_return retval = new PLSQLTreeParser.declare_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI37=null;
        Token SEMI39=null;
        Token SEMI41=null;
        Token SEMI43=null;
        Token SEMI45=null;
        Token SEMI47=null;
        Token SEMI49=null;
        PLSQLTreeParser.type_definition_return type_definition36 = null;

        PLSQLTreeParser.subtype_definition_return subtype_definition38 = null;

        PLSQLTreeParser.cursor_definition_return cursor_definition40 = null;

        PLSQLTreeParser.item_declaration_return item_declaration42 = null;

        PLSQLTreeParser.function_declaration_or_definition_return function_declaration_or_definition44 = null;

        PLSQLTreeParser.procedure_declaration_or_definition_return procedure_declaration_or_definition46 = null;

        PLSQLTreeParser.pragma_return pragma48 = null;


        Object SEMI37_tree=null;
        Object SEMI39_tree=null;
        Object SEMI41_tree=null;
        Object SEMI43_tree=null;
        Object SEMI45_tree=null;
        Object SEMI47_tree=null;
        Object SEMI49_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_procedure_declaration_or_definition=new RewriteRuleSubtreeStream(adaptor,"rule procedure_declaration_or_definition");
        RewriteRuleSubtreeStream stream_type_definition=new RewriteRuleSubtreeStream(adaptor,"rule type_definition");
        RewriteRuleSubtreeStream stream_subtype_definition=new RewriteRuleSubtreeStream(adaptor,"rule subtype_definition");
        RewriteRuleSubtreeStream stream_cursor_definition=new RewriteRuleSubtreeStream(adaptor,"rule cursor_definition");
        RewriteRuleSubtreeStream stream_item_declaration=new RewriteRuleSubtreeStream(adaptor,"rule item_declaration");
        RewriteRuleSubtreeStream stream_function_declaration_or_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_or_definition");
        RewriteRuleSubtreeStream stream_pragma=new RewriteRuleSubtreeStream(adaptor,"rule pragma");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:17: ( ( type_definition SEMI -> ^( DECL ) | subtype_definition SEMI -> ^( DECL ) | cursor_definition SEMI -> ^( DECL ) | item_declaration SEMI -> ^( DECL ) | function_declaration_or_definition SEMI -> ^( DECL ) | procedure_declaration_or_definition SEMI -> ^( DECL ) | pragma SEMI -> ^( DECL ) )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:5: ( type_definition SEMI -> ^( DECL ) | subtype_definition SEMI -> ^( DECL ) | cursor_definition SEMI -> ^( DECL ) | item_declaration SEMI -> ^( DECL ) | function_declaration_or_definition SEMI -> ^( DECL ) | procedure_declaration_or_definition SEMI -> ^( DECL ) | pragma SEMI -> ^( DECL ) )+
            {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:5: ( type_definition SEMI -> ^( DECL ) | subtype_definition SEMI -> ^( DECL ) | cursor_definition SEMI -> ^( DECL ) | item_declaration SEMI -> ^( DECL ) | function_declaration_or_definition SEMI -> ^( DECL ) | procedure_declaration_or_definition SEMI -> ^( DECL ) | pragma SEMI -> ^( DECL ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=8;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:7: type_definition SEMI
            	    {
            	    pushFollow(FOLLOW_type_definition_in_declare_section452);
            	    type_definition36=type_definition();

            	    state._fsp--;

            	    stream_type_definition.add(type_definition36.getTree());
            	    SEMI37=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section454);  
            	    stream_SEMI.add(SEMI37);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 122:28: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:31: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:7: subtype_definition SEMI
            	    {
            	    pushFollow(FOLLOW_subtype_definition_in_declare_section469);
            	    subtype_definition38=subtype_definition();

            	    state._fsp--;

            	    stream_subtype_definition.add(subtype_definition38.getTree());
            	    SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section471);  
            	    stream_SEMI.add(SEMI39);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 123:31: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:34: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:124:7: cursor_definition SEMI
            	    {
            	    pushFollow(FOLLOW_cursor_definition_in_declare_section486);
            	    cursor_definition40=cursor_definition();

            	    state._fsp--;

            	    stream_cursor_definition.add(cursor_definition40.getTree());
            	    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section488);  
            	    stream_SEMI.add(SEMI41);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 124:30: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:124:33: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 4 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:125:7: item_declaration SEMI
            	    {
            	    pushFollow(FOLLOW_item_declaration_in_declare_section503);
            	    item_declaration42=item_declaration();

            	    state._fsp--;

            	    stream_item_declaration.add(item_declaration42.getTree());
            	    SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section505);  
            	    stream_SEMI.add(SEMI43);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 125:29: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:125:32: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 5 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:126:7: function_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section520);
            	    function_declaration_or_definition44=function_declaration_or_definition();

            	    state._fsp--;

            	    stream_function_declaration_or_definition.add(function_declaration_or_definition44.getTree());
            	    SEMI45=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section522);  
            	    stream_SEMI.add(SEMI45);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 126:47: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:126:50: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 6 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:127:7: procedure_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section537);
            	    procedure_declaration_or_definition46=procedure_declaration_or_definition();

            	    state._fsp--;

            	    stream_procedure_declaration_or_definition.add(procedure_declaration_or_definition46.getTree());
            	    SEMI47=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section539);  
            	    stream_SEMI.add(SEMI47);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 127:48: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:127:51: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 7 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:128:7: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_declare_section554);
            	    pragma48=pragma();

            	    state._fsp--;

            	    stream_pragma.add(pragma48.getTree());
            	    SEMI49=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section556);  
            	    stream_SEMI.add(SEMI49);



            	    // AST REWRITE
            	    // elements: 
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 128:19: -> ^( DECL )
            	    {
            	        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:128:22: ^( DECL )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


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
        return retval;
    }
    // $ANTLR end "declare_section"

    public static class cursor_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) ;
    public final PLSQLTreeParser.cursor_definition_return cursor_definition() throws RecognitionException {
        PLSQLTreeParser.cursor_definition_return retval = new PLSQLTreeParser.cursor_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CURSOR50=null;
        Token ID51=null;
        Token IS53=null;
        PLSQLTreeParser.parameter_declarations_return parameter_declarations52 = null;

        PLSQLTreeParser.select_statement_return select_statement54 = null;


        Object CURSOR50_tree=null;
        Object ID51_tree=null;
        Object IS53_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        RewriteRuleSubtreeStream stream_select_statement=new RewriteRuleSubtreeStream(adaptor,"rule select_statement");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:19: ( CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            CURSOR50=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition592);  
            stream_CURSOR.add(CURSOR50);

            ID51=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition594);  
            stream_ID.add(ID51);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:19: ( parameter_declarations )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LPAREN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:19: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition596);
                    parameter_declarations52=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(parameter_declarations52.getTree());

                    }
                    break;

            }

            IS53=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition599);  
            stream_IS.add(IS53);

            pushFollow(FOLLOW_select_statement_in_cursor_definition601);
            select_statement54=select_statement();

            state._fsp--;

            stream_select_statement.add(select_statement54.getTree());


            // AST REWRITE
            // elements: CURSOR, IS, select_statement, ID, parameter_declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 133:63: -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:66: ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFCURSOR, "DEFCURSOR"), root_1);

                adaptor.addChild(root_1, stream_CURSOR.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:88: ( parameter_declarations )?
                if ( stream_parameter_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declarations.nextTree());

                }
                stream_parameter_declarations.reset();
                adaptor.addChild(root_1, stream_IS.nextNode());
                adaptor.addChild(root_1, stream_select_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "cursor_definition"

    public static class item_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:136:1: item_declaration : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQLTreeParser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQLTreeParser.item_declaration_return retval = new PLSQLTreeParser.item_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.variable_declaration_return variable_declaration55 = null;

        PLSQLTreeParser.constant_declaration_return constant_declaration56 = null;

        PLSQLTreeParser.exception_declaration_return exception_declaration57 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:137:5: ( variable_declaration | constant_declaration | exception_declaration )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                switch ( input.LA(2) ) {
                case CONSTANT:
                    {
                    alt16=2;
                    }
                    break;
                case EXCEPTION:
                    {
                    alt16=3;
                    }
                    break;
                case ID:
                case REF:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:137:7: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_item_declaration635);
                    variable_declaration55=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration55.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:138:7: constant_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_declaration_in_item_declaration643);
                    constant_declaration56=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration56.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:139:7: exception_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exception_declaration_in_item_declaration651);
                    exception_declaration57=exception_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, exception_declaration57.getTree());

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
        return retval;
    }
    // $ANTLR end "item_declaration"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:142:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLTreeParser.variable_declaration_return variable_declaration() throws RecognitionException {
        PLSQLTreeParser.variable_declaration_return retval = new PLSQLTreeParser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID58=null;
        Token NOT60=null;
        Token NULL61=null;
        Token set62=null;
        PLSQLTreeParser.datatype_return datatype59 = null;

        PLSQLTreeParser.expression_return expression63 = null;


        Object ID58_tree=null;
        Object NOT60_tree=null;
        Object NULL61_tree=null;
        Object set62_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:142:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID58=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration672); 
            ID58_tree = (Object)adaptor.create(ID58);
            adaptor.addChild(root_0, ID58_tree);

            pushFollow(FOLLOW_datatype_in_variable_declaration674);
            datatype59=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype59.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ASSIGN && LA18_0<=DEFAULT)||LA18_0==NOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:24: ( NOT NULL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:27: NOT NULL
                            {
                            NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration682); 
                            NOT60_tree = (Object)adaptor.create(NOT60);
                            adaptor.addChild(root_0, NOT60_tree);

                            NULL61=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration684); 
                            NULL61_tree = (Object)adaptor.create(NULL61);
                            adaptor.addChild(root_0, NULL61_tree);


                            }
                            break;

                    }

                    set62=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set62));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_variable_declaration701);
                    expression63=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression63.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "variable_declaration"

    public static class constant_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:146:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
    public final PLSQLTreeParser.constant_declaration_return constant_declaration() throws RecognitionException {
        PLSQLTreeParser.constant_declaration_return retval = new PLSQLTreeParser.constant_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID64=null;
        Token CONSTANT65=null;
        Token NOT67=null;
        Token NULL68=null;
        Token set69=null;
        PLSQLTreeParser.datatype_return datatype66 = null;

        PLSQLTreeParser.expression_return expression70 = null;


        Object ID64_tree=null;
        Object CONSTANT65_tree=null;
        Object NOT67_tree=null;
        Object NULL68_tree=null;
        Object set69_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:146:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:147:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (Object)adaptor.nil();

            ID64=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration726); 
            ID64_tree = (Object)adaptor.create(ID64);
            adaptor.addChild(root_0, ID64_tree);

            CONSTANT65=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration728); 
            CONSTANT65_tree = (Object)adaptor.create(CONSTANT65);
            adaptor.addChild(root_0, CONSTANT65_tree);

            pushFollow(FOLLOW_datatype_in_constant_declaration730);
            datatype66=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype66.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:147:30: ( NOT NULL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:147:32: NOT NULL
                    {
                    NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration734); 
                    NOT67_tree = (Object)adaptor.create(NOT67);
                    adaptor.addChild(root_0, NOT67_tree);

                    NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration736); 
                    NULL68_tree = (Object)adaptor.create(NULL68);
                    adaptor.addChild(root_0, NULL68_tree);


                    }
                    break;

            }

            set69=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set69));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_expression_in_constant_declaration755);
            expression70=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression70.getTree());

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
        return retval;
    }
    // $ANTLR end "constant_declaration"

    public static class exception_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:1: exception_declaration : ID EXCEPTION ;
    public final PLSQLTreeParser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQLTreeParser.exception_declaration_return retval = new PLSQLTreeParser.exception_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID71=null;
        Token EXCEPTION72=null;

        Object ID71_tree=null;
        Object EXCEPTION72_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:23: ( ID EXCEPTION )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:151:9: ID EXCEPTION
            {
            root_0 = (Object)adaptor.nil();

            ID71=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration776); 
            ID71_tree = (Object)adaptor.create(ID71);
            adaptor.addChild(root_0, ID71_tree);

            EXCEPTION72=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration778); 
            EXCEPTION72_tree = (Object)adaptor.create(EXCEPTION72);
            adaptor.addChild(root_0, EXCEPTION72_tree);


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
        return retval;
    }
    // $ANTLR end "exception_declaration"

    public static class type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:154:1: type_definition : kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) ;
    public final PLSQLTreeParser.type_definition_return type_definition() throws RecognitionException {
        PLSQLTreeParser.type_definition_return retval = new PLSQLTreeParser.type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID74=null;
        Token IS75=null;
        PLSQLTreeParser.kTYPE_return kTYPE73 = null;

        PLSQLTreeParser.record_type_definition_return record_type_definition76 = null;

        PLSQLTreeParser.collection_type_definition_return collection_type_definition77 = null;

        PLSQLTreeParser.ref_cursor_type_definition_return ref_cursor_type_definition78 = null;


        Object ID74_tree=null;
        Object IS75_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:154:17: ( kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:9: kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kTYPE_in_type_definition799);
            kTYPE73=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE73.getTree());
            ID74=(Token)match(input,ID,FOLLOW_ID_in_type_definition801); 
            ID74_tree = (Object)adaptor.create(ID74);
            adaptor.addChild(root_0, ID74_tree);

            IS75=(Token)match(input,IS,FOLLOW_IS_in_type_definition803); 
            IS75_tree = (Object)adaptor.create(IS75);
            adaptor.addChild(root_0, IS75_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:21: ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RECORD:
                {
                alt20=1;
                }
                break;
            case VARYING:
            case VARRAY:
            case TABLE:
                {
                alt20=2;
                }
                break;
            case REF:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:23: record_type_definition
                    {
                    pushFollow(FOLLOW_record_type_definition_in_type_definition807);
                    record_type_definition76=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition76.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:48: collection_type_definition
                    {
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition811);
                    collection_type_definition77=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition77.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:77: ref_cursor_type_definition
                    {
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition815);
                    ref_cursor_type_definition78=ref_cursor_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_cursor_type_definition78.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "type_definition"

    public static class subtype_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subtype_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:158:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
    public final PLSQLTreeParser.subtype_definition_return subtype_definition() throws RecognitionException {
        PLSQLTreeParser.subtype_definition_return retval = new PLSQLTreeParser.subtype_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUBTYPE79=null;
        Token ID80=null;
        Token IS81=null;
        Token NOT83=null;
        Token NULL84=null;
        PLSQLTreeParser.datatype_return datatype82 = null;


        Object SUBTYPE79_tree=null;
        Object ID80_tree=null;
        Object IS81_tree=null;
        Object NOT83_tree=null;
        Object NULL84_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:158:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:159:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            SUBTYPE79=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition838); 
            SUBTYPE79_tree = (Object)adaptor.create(SUBTYPE79);
            adaptor.addChild(root_0, SUBTYPE79_tree);

            ID80=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition840); 
            ID80_tree = (Object)adaptor.create(ID80);
            adaptor.addChild(root_0, ID80_tree);

            IS81=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition842); 
            IS81_tree = (Object)adaptor.create(IS81);
            adaptor.addChild(root_0, IS81_tree);

            pushFollow(FOLLOW_datatype_in_subtype_definition844);
            datatype82=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype82.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:159:32: ( NOT NULL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:159:34: NOT NULL
                    {
                    NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition848); 
                    NOT83_tree = (Object)adaptor.create(NOT83);
                    adaptor.addChild(root_0, NOT83_tree);

                    NULL84=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition850); 
                    NULL84_tree = (Object)adaptor.create(NULL84);
                    adaptor.addChild(root_0, NULL84_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "subtype_definition"

    public static class record_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:162:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
    public final PLSQLTreeParser.record_type_definition_return record_type_definition() throws RecognitionException {
        PLSQLTreeParser.record_type_definition_return retval = new PLSQLTreeParser.record_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECORD85=null;
        Token LPAREN86=null;
        Token COMMA88=null;
        Token RPAREN90=null;
        PLSQLTreeParser.record_field_declaration_return record_field_declaration87 = null;

        PLSQLTreeParser.record_field_declaration_return record_field_declaration89 = null;


        Object RECORD85_tree=null;
        Object LPAREN86_tree=null;
        Object COMMA88_tree=null;
        Object RPAREN90_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:162:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:163:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RECORD85=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition871); 
            RECORD85_tree = (Object)adaptor.create(RECORD85);
            adaptor.addChild(root_0, RECORD85_tree);

            LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition873); 
            LPAREN86_tree = (Object)adaptor.create(LPAREN86);
            adaptor.addChild(root_0, LPAREN86_tree);

            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition875);
            record_field_declaration87=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration87.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:163:41: ( COMMA record_field_declaration )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:163:43: COMMA record_field_declaration
            	    {
            	    COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition879); 
            	    COMMA88_tree = (Object)adaptor.create(COMMA88);
            	    adaptor.addChild(root_0, COMMA88_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition881);
            	    record_field_declaration89=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration89.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition886); 
            RPAREN90_tree = (Object)adaptor.create(RPAREN90);
            adaptor.addChild(root_0, RPAREN90_tree);


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
        return retval;
    }
    // $ANTLR end "record_type_definition"

    public static class record_field_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_field_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:1: record_field_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLTreeParser.record_field_declaration_return record_field_declaration() throws RecognitionException {
        PLSQLTreeParser.record_field_declaration_return retval = new PLSQLTreeParser.record_field_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID91=null;
        Token NOT93=null;
        Token NULL94=null;
        Token set95=null;
        PLSQLTreeParser.datatype_return datatype92 = null;

        PLSQLTreeParser.expression_return expression96 = null;


        Object ID91_tree=null;
        Object NOT93_tree=null;
        Object NULL94_tree=null;
        Object set95_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:26: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID91=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration900); 
            ID91_tree = (Object)adaptor.create(ID91);
            adaptor.addChild(root_0, ID91_tree);

            pushFollow(FOLLOW_datatype_in_record_field_declaration902);
            datatype92=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype92.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:14: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ASSIGN && LA24_0<=DEFAULT)||LA24_0==NOT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:16: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:16: ( NOT NULL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NOT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:18: NOT NULL
                            {
                            NOT93=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration908); 
                            NOT93_tree = (Object)adaptor.create(NOT93);
                            adaptor.addChild(root_0, NOT93_tree);

                            NULL94=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration910); 
                            NULL94_tree = (Object)adaptor.create(NULL94);
                            adaptor.addChild(root_0, NULL94_tree);


                            }
                            break;

                    }

                    set95=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set95));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_record_field_declaration925);
                    expression96=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression96.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "record_field_declaration"

    public static class collection_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:170:1: collection_type_definition : ( varray_type_definition | nested_table_type_definition );
    public final PLSQLTreeParser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQLTreeParser.collection_type_definition_return retval = new PLSQLTreeParser.collection_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.varray_type_definition_return varray_type_definition97 = null;

        PLSQLTreeParser.nested_table_type_definition_return nested_table_type_definition98 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:171:2: ( varray_type_definition | nested_table_type_definition )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VARYING||LA25_0==VARRAY) ) {
                alt25=1;
            }
            else if ( (LA25_0==TABLE) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:171:4: varray_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition942);
                    varray_type_definition97=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition97.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:172:4: nested_table_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition947);
                    nested_table_type_definition98=nested_table_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, nested_table_type_definition98.getTree());

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
        return retval;
    }
    // $ANTLR end "collection_type_definition"

    public static class varray_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varray_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:175:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
    public final PLSQLTreeParser.varray_type_definition_return varray_type_definition() throws RecognitionException {
        PLSQLTreeParser.varray_type_definition_return retval = new PLSQLTreeParser.varray_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARYING99=null;
        Token ARRAY100=null;
        Token VARRAY101=null;
        Token LPAREN102=null;
        Token RPAREN104=null;
        Token NOT107=null;
        Token NULL108=null;
        PLSQLTreeParser.numeric_literal_return numeric_literal103 = null;

        PLSQLTreeParser.kOF_return kOF105 = null;

        PLSQLTreeParser.datatype_return datatype106 = null;


        Object VARYING99_tree=null;
        Object ARRAY100_tree=null;
        Object VARRAY101_tree=null;
        Object LPAREN102_tree=null;
        Object RPAREN104_tree=null;
        Object NOT107_tree=null;
        Object NULL108_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:4: ( VARYING ( ARRAY )? | VARRAY )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VARYING) ) {
                alt27=1;
            }
            else if ( (LA27_0==VARRAY) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:6: VARYING ( ARRAY )?
                    {
                    VARYING99=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition960); 
                    VARYING99_tree = (Object)adaptor.create(VARYING99);
                    adaptor.addChild(root_0, VARYING99_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:14: ( ARRAY )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ARRAY) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:14: ARRAY
                            {
                            ARRAY100=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition962); 
                            ARRAY100_tree = (Object)adaptor.create(ARRAY100);
                            adaptor.addChild(root_0, ARRAY100_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:23: VARRAY
                    {
                    VARRAY101=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition967); 
                    VARRAY101_tree = (Object)adaptor.create(VARRAY101);
                    adaptor.addChild(root_0, VARRAY101_tree);


                    }
                    break;

            }

            LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition971); 
            LPAREN102_tree = (Object)adaptor.create(LPAREN102);
            adaptor.addChild(root_0, LPAREN102_tree);

            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition973);
            numeric_literal103=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal103.getTree());
            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition975); 
            RPAREN104_tree = (Object)adaptor.create(RPAREN104);
            adaptor.addChild(root_0, RPAREN104_tree);

            pushFollow(FOLLOW_kOF_in_varray_type_definition977);
            kOF105=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF105.getTree());
            pushFollow(FOLLOW_datatype_in_varray_type_definition979);
            datatype106=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype106.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:75: ( NOT NULL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:77: NOT NULL
                    {
                    NOT107=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition983); 
                    NOT107_tree = (Object)adaptor.create(NOT107);
                    adaptor.addChild(root_0, NOT107_tree);

                    NULL108=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition985); 
                    NULL108_tree = (Object)adaptor.create(NULL108);
                    adaptor.addChild(root_0, NULL108_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "varray_type_definition"

    public static class nested_table_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_table_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:179:1: nested_table_type_definition : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
    public final PLSQLTreeParser.nested_table_type_definition_return nested_table_type_definition() throws RecognitionException {
        PLSQLTreeParser.nested_table_type_definition_return retval = new PLSQLTreeParser.nested_table_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TABLE109=null;
        Token NOT112=null;
        Token NULL113=null;
        Token INDEX114=null;
        Token BY115=null;
        PLSQLTreeParser.kOF_return kOF110 = null;

        PLSQLTreeParser.datatype_return datatype111 = null;

        PLSQLTreeParser.associative_index_type_return associative_index_type116 = null;


        Object TABLE109_tree=null;
        Object NOT112_tree=null;
        Object NULL113_tree=null;
        Object INDEX114_tree=null;
        Object BY115_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:2: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:4: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (Object)adaptor.nil();

            TABLE109=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition999); 
            TABLE109_tree = (Object)adaptor.create(TABLE109);
            adaptor.addChild(root_0, TABLE109_tree);

            pushFollow(FOLLOW_kOF_in_nested_table_type_definition1001);
            kOF110=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF110.getTree());
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition1003);
            datatype111=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype111.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:23: ( NOT NULL )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:25: NOT NULL
                    {
                    NOT112=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition1007); 
                    NOT112_tree = (Object)adaptor.create(NOT112);
                    adaptor.addChild(root_0, NOT112_tree);

                    NULL113=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition1009); 
                    NULL113_tree = (Object)adaptor.create(NULL113);
                    adaptor.addChild(root_0, NULL113_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:37: ( INDEX BY associative_index_type )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INDEX) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:39: INDEX BY associative_index_type
                    {
                    INDEX114=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition1016); 
                    INDEX114_tree = (Object)adaptor.create(INDEX114);
                    adaptor.addChild(root_0, INDEX114_tree);

                    BY115=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition1018); 
                    BY115_tree = (Object)adaptor.create(BY115);
                    adaptor.addChild(root_0, BY115_tree);

                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition1020);
                    associative_index_type116=associative_index_type();

                    state._fsp--;

                    adaptor.addChild(root_0, associative_index_type116.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "nested_table_type_definition"

    public static class associative_index_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "associative_index_type"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:183:1: associative_index_type : datatype ;
    public final PLSQLTreeParser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQLTreeParser.associative_index_type_return retval = new PLSQLTreeParser.associative_index_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.datatype_return datatype117 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:184:2: ( datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:184:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_associative_index_type1034);
            datatype117=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype117.getTree());

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
        return retval;
    }
    // $ANTLR end "associative_index_type"

    public static class ref_cursor_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ref_cursor_type_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:187:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
    public final PLSQLTreeParser.ref_cursor_type_definition_return ref_cursor_type_definition() throws RecognitionException {
        PLSQLTreeParser.ref_cursor_type_definition_return retval = new PLSQLTreeParser.ref_cursor_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF118=null;
        Token CURSOR119=null;
        Token RETURN120=null;
        PLSQLTreeParser.datatype_return datatype121 = null;


        Object REF118_tree=null;
        Object CURSOR119_tree=null;
        Object RETURN120_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:2: ( REF CURSOR ( RETURN datatype )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (Object)adaptor.nil();

            REF118=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition1045); 
            REF118_tree = (Object)adaptor.create(REF118);
            adaptor.addChild(root_0, REF118_tree);

            CURSOR119=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition1047); 
            CURSOR119_tree = (Object)adaptor.create(CURSOR119);
            adaptor.addChild(root_0, CURSOR119_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:15: ( RETURN datatype )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RETURN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:17: RETURN datatype
                    {
                    RETURN120=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition1051); 
                    RETURN120_tree = (Object)adaptor.create(RETURN120);
                    adaptor.addChild(root_0, RETURN120_tree);

                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition1053);
                    datatype121=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype121.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "ref_cursor_type_definition"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:191:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
    public final PLSQLTreeParser.datatype_return datatype() throws RecognitionException {
        PLSQLTreeParser.datatype_return retval = new PLSQLTreeParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF122=null;
        Token ID123=null;
        Token DOT124=null;
        Token ID125=null;
        Token LPAREN126=null;
        Token COMMA128=null;
        Token RPAREN130=null;
        Token PERCENT131=null;
        Token ROWTYPE133=null;
        PLSQLTreeParser.numeric_literal_return numeric_literal127 = null;

        PLSQLTreeParser.numeric_literal_return numeric_literal129 = null;

        PLSQLTreeParser.kTYPE_return kTYPE132 = null;


        Object REF122_tree=null;
        Object ID123_tree=null;
        Object DOT124_tree=null;
        Object ID125_tree=null;
        Object LPAREN126_tree=null;
        Object COMMA128_tree=null;
        Object RPAREN130_tree=null;
        Object PERCENT131_tree=null;
        Object ROWTYPE133_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:7: ( REF )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==REF) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:9: REF
                    {
                    REF122=(Token)match(input,REF,FOLLOW_REF_in_datatype1072); 
                    REF122_tree = (Object)adaptor.create(REF122);
                    adaptor.addChild(root_0, REF122_tree);


                    }
                    break;

            }

            ID123=(Token)match(input,ID,FOLLOW_ID_in_datatype1077); 
            ID123_tree = (Object)adaptor.create(ID123);
            adaptor.addChild(root_0, ID123_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:19: ( DOT ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DOT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:21: DOT ID
                    {
                    DOT124=(Token)match(input,DOT,FOLLOW_DOT_in_datatype1081); 
                    DOT124_tree = (Object)adaptor.create(DOT124);
                    adaptor.addChild(root_0, DOT124_tree);

                    ID125=(Token)match(input,ID,FOLLOW_ID_in_datatype1083); 
                    ID125_tree = (Object)adaptor.create(ID125);
                    adaptor.addChild(root_0, ID125_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN) ) {
                alt36=1;
            }
            else if ( (LA36_0==PERCENT) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype1090); 
                    LPAREN126_tree = (Object)adaptor.create(LPAREN126);
                    adaptor.addChild(root_0, LPAREN126_tree);

                    pushFollow(FOLLOW_numeric_literal_in_datatype1092);
                    numeric_literal127=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal127.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:56: ( COMMA numeric_literal )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:58: COMMA numeric_literal
                    	    {
                    	    COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype1096); 
                    	    COMMA128_tree = (Object)adaptor.create(COMMA128);
                    	    adaptor.addChild(root_0, COMMA128_tree);

                    	    pushFollow(FOLLOW_numeric_literal_in_datatype1098);
                    	    numeric_literal129=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal129.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype1103); 
                    RPAREN130_tree = (Object)adaptor.create(RPAREN130);
                    adaptor.addChild(root_0, RPAREN130_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    PERCENT131=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype1107); 
                    PERCENT131_tree = (Object)adaptor.create(PERCENT131);
                    adaptor.addChild(root_0, PERCENT131_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:100: ( kTYPE | ROWTYPE )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==ROWTYPE) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:102: kTYPE
                            {
                            pushFollow(FOLLOW_kTYPE_in_datatype1111);
                            kTYPE132=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE132.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:110: ROWTYPE
                            {
                            ROWTYPE133=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype1115); 
                            ROWTYPE133_tree = (Object)adaptor.create(ROWTYPE133);
                            adaptor.addChild(root_0, ROWTYPE133_tree);


                            }
                            break;

                    }


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "datatype"

    public static class function_declaration_or_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:195:1: function_declaration_or_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLTreeParser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.function_declaration_or_definition_return retval = new PLSQLTreeParser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;
        Token set136=null;
        PLSQLTreeParser.function_heading_return function_heading134 = null;

        PLSQLTreeParser.declare_section_return declare_section137 = null;

        PLSQLTreeParser.body_return body138 = null;


        Object set135_tree=null;
        Object set136_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:195:36: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:196:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition1141);
            function_heading134=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading134.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:197:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=DETERMINISTIC && LA37_0<=RESULT_CACHE)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set135=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set135));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:198:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IS||LA39_0==AS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:198:11: ( IS | AS ) ( declare_section )? body
                    {
                    set136=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set136));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:198:23: ( declare_section )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=PROCEDURE && LA38_0<=FUNCTION)||LA38_0==CURSOR||LA38_0==SUBTYPE||LA38_0==PRAGMA) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:198:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1190);
                            declare_section137=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section137.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1193);
                    body138=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body138.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "function_declaration_or_definition"

    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQLTreeParser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQLTreeParser.function_declaration_return retval = new PLSQLTreeParser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set140=null;
        PLSQLTreeParser.function_heading_return function_heading139 = null;


        Object set140_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:202:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration1214);
            function_heading139=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading139.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=DETERMINISTIC && LA40_0<=RESULT_CACHE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set140=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set140));
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
        return retval;
    }
    // $ANTLR end "function_declaration"

    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:206:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body ;
    public final PLSQLTreeParser.function_definition_return function_definition() throws RecognitionException {
        PLSQLTreeParser.function_definition_return retval = new PLSQLTreeParser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set142=null;
        Token set143=null;
        PLSQLTreeParser.function_heading_return function_heading141 = null;

        PLSQLTreeParser.declare_section_return declare_section144 = null;

        PLSQLTreeParser.body_return body145 = null;


        Object set142_tree=null;
        Object set143_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:206:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:207:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_definition1262);
            function_heading141=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading141.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:208:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=DETERMINISTIC && LA41_0<=RESULT_CACHE)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set142=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set142));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            set143=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set143));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:209:21: ( declare_section )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PROCEDURE && LA42_0<=FUNCTION)||LA42_0==CURSOR||LA42_0==SUBTYPE||LA42_0==PRAGMA) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:209:21: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_function_definition1309);
                    declare_section144=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section144.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_function_definition1312);
            body145=body();

            state._fsp--;

            adaptor.addChild(root_0, body145.getTree());

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
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class procedure_declaration_or_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration_or_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:212:1: procedure_declaration_or_definition : procedure_heading ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLTreeParser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_or_definition_return retval = new PLSQLTreeParser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set147=null;
        PLSQLTreeParser.procedure_heading_return procedure_heading146 = null;

        PLSQLTreeParser.declare_section_return declare_section148 = null;

        PLSQLTreeParser.body_return body149 = null;


        Object set147_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:212:37: ( procedure_heading ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:213:9: procedure_heading ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1330);
            procedure_heading146=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading146.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:214:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IS||LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:214:11: ( IS | AS ) ( declare_section )? body
                    {
                    set147=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set147));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:214:23: ( declare_section )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=PROCEDURE && LA43_0<=FUNCTION)||LA43_0==CURSOR||LA43_0==SUBTYPE||LA43_0==PRAGMA) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:214:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1352);
                            declare_section148=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section148.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1355);
                    body149=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body149.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "procedure_declaration_or_definition"

    public static class procedure_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:1: procedure_declaration : procedure_heading ;
    public final PLSQLTreeParser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_return retval = new PLSQLTreeParser.procedure_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading150 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:23: ( procedure_heading )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:218:2: procedure_heading
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1372);
            procedure_heading150=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading150.getTree());

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
        return retval;
    }
    // $ANTLR end "procedure_declaration"

    public static class procedure_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_definition"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:1: procedure_definition : procedure_heading ( IS | AS ) ( declare_section )? body ;
    public final PLSQLTreeParser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_definition_return retval = new PLSQLTreeParser.procedure_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set152=null;
        PLSQLTreeParser.procedure_heading_return procedure_heading151 = null;

        PLSQLTreeParser.declare_section_return declare_section153 = null;

        PLSQLTreeParser.body_return body154 = null;


        Object set152_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:22: ( procedure_heading ( IS | AS ) ( declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:222:2: procedure_heading ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1383);
            procedure_heading151=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading151.getTree());
            set152=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set152));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:14: ( declare_section )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=PROCEDURE && LA45_0<=FUNCTION)||LA45_0==CURSOR||LA45_0==SUBTYPE||LA45_0==PRAGMA) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:14: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1396);
                    declare_section153=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section153.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_procedure_definition1401);
            body154=body();

            state._fsp--;

            adaptor.addChild(root_0, body154.getTree());

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
        return retval;
    }
    // $ANTLR end "procedure_definition"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:227:1: body : BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? -> ^( BODY BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? ) ;
    public final PLSQLTreeParser.body_return body() throws RecognitionException {
        PLSQLTreeParser.body_return retval = new PLSQLTreeParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN155=null;
        Token SEMI157=null;
        Token EXCEPTION159=null;
        Token END161=null;
        Token ID162=null;
        PLSQLTreeParser.statement_return statement156 = null;

        PLSQLTreeParser.st_pragma_return st_pragma158 = null;

        PLSQLTreeParser.exception_handler_return exception_handler160 = null;


        Object BEGIN155_tree=null;
        Object SEMI157_tree=null;
        Object EXCEPTION159_tree=null;
        Object END161_tree=null;
        Object ID162_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_EXCEPTION=new RewriteRuleTokenStream(adaptor,"token EXCEPTION");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_st_pragma=new RewriteRuleSubtreeStream(adaptor,"rule st_pragma");
        RewriteRuleSubtreeStream stream_exception_handler=new RewriteRuleSubtreeStream(adaptor,"rule exception_handler");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:227:7: ( BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? -> ^( BODY BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:228:2: BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )?
            {
            BEGIN155=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1416);  
            stream_BEGIN.add(BEGIN155);

            pushFollow(FOLLOW_statement_in_body1418);
            statement156=statement();

            state._fsp--;

            stream_statement.add(statement156.getTree());
            SEMI157=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1420);  
            stream_SEMI.add(SEMI157);

            pushFollow(FOLLOW_st_pragma_in_body1422);
            st_pragma158=st_pragma();

            state._fsp--;

            stream_st_pragma.add(st_pragma158.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:2: ( EXCEPTION ( exception_handler )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EXCEPTION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:4: EXCEPTION ( exception_handler )+
                    {
                    EXCEPTION159=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body1427);  
                    stream_EXCEPTION.add(EXCEPTION159);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:14: ( exception_handler )+
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
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:14: exception_handler
                    	    {
                    	    pushFollow(FOLLOW_exception_handler_in_body1429);
                    	    exception_handler160=exception_handler();

                    	    state._fsp--;

                    	    stream_exception_handler.add(exception_handler160.getTree());

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

            END161=(Token)match(input,END,FOLLOW_END_in_body1435);  
            stream_END.add(END161);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:40: ( ID )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:40: ID
                    {
                    ID162=(Token)match(input,ID,FOLLOW_ID_in_body1437);  
                    stream_ID.add(ID162);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, BEGIN, st_pragma, EXCEPTION, SEMI, exception_handler, END, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:44: -> ^( BODY BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:47: ^( BODY BEGIN statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? END ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_BEGIN.nextNode());
                adaptor.addChild(root_1, stream_statement.nextTree());
                adaptor.addChild(root_1, stream_SEMI.nextNode());
                adaptor.addChild(root_1, stream_st_pragma.nextTree());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:230:2: ( EXCEPTION ( exception_handler )+ )?
                if ( stream_EXCEPTION.hasNext()||stream_exception_handler.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXCEPTION.nextNode());
                    if ( !(stream_exception_handler.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_exception_handler.hasNext() ) {
                        adaptor.addChild(root_1, stream_exception_handler.nextTree());

                    }
                    stream_exception_handler.reset();

                }
                stream_EXCEPTION.reset();
                stream_exception_handler.reset();
                adaptor.addChild(root_1, stream_END.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:230:40: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "body"

    public static class st_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_pragma"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:233:1: st_pragma : ( statement SEMI | pragma SEMI )* ;
    public final PLSQLTreeParser.st_pragma_return st_pragma() throws RecognitionException {
        PLSQLTreeParser.st_pragma_return retval = new PLSQLTreeParser.st_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI164=null;
        Token SEMI166=null;
        PLSQLTreeParser.statement_return statement163 = null;

        PLSQLTreeParser.pragma_return pragma165 = null;


        Object SEMI164_tree=null;
        Object SEMI166_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:234:2: ( ( statement SEMI | pragma SEMI )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:2: ( statement SEMI | pragma SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:2: ( statement SEMI | pragma SEMI )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ID||LA49_0==RETURN||LA49_0==NULL||LA49_0==BEGIN||(LA49_0>=COLON && LA49_0<=CASE)||(LA49_0>=CLOSE && LA49_0<=EXECUTE)||(LA49_0>=EXIT && LA49_0<=FETCH)||(LA49_0>=FOR && LA49_0<=FORALL)||(LA49_0>=GOTO && LA49_0<=IF)||LA49_0==OPEN||(LA49_0>=RAISE && LA49_0<=LLABEL)||(LA49_0>=COMMIT && LA49_0<=SET)||(LA49_0>=UPDATE && LA49_0<=WHILE)) ) {
                    alt49=1;
                }
                else if ( (LA49_0==PRAGMA) ) {
                    alt49=2;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:4: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_st_pragma1484);
            	    statement163=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement163.getTree());
            	    SEMI164=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1486); 
            	    SEMI164_tree = (Object)adaptor.create(SEMI164);
            	    adaptor.addChild(root_0, SEMI164_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:21: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_st_pragma1490);
            	    pragma165=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma165.getTree());
            	    SEMI166=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1492); 
            	    SEMI166_tree = (Object)adaptor.create(SEMI166);
            	    adaptor.addChild(root_0, SEMI166_tree);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "st_pragma"

    public static class exception_handler_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_handler"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:238:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQLTreeParser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQLTreeParser.exception_handler_return retval = new PLSQLTreeParser.exception_handler_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN167=null;
        Token OR169=null;
        Token OTHERS171=null;
        Token THEN172=null;
        Token SEMI174=null;
        PLSQLTreeParser.qual_id_return qual_id168 = null;

        PLSQLTreeParser.qual_id_return qual_id170 = null;

        PLSQLTreeParser.statement_return statement173 = null;


        Object WHEN167_tree=null;
        Object OR169_tree=null;
        Object OTHERS171_tree=null;
        Object THEN172_tree=null;
        Object SEMI174_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            WHEN167=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1507); 
            WHEN167_tree = (Object)adaptor.create(WHEN167);
            adaptor.addChild(root_0, WHEN167_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:9: ( qual_id ( OR qual_id )* | OTHERS )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID||LA51_0==COLON) ) {
                alt51=1;
            }
            else if ( (LA51_0==OTHERS) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:11: qual_id ( OR qual_id )*
                    {
                    pushFollow(FOLLOW_qual_id_in_exception_handler1511);
                    qual_id168=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id168.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:19: ( OR qual_id )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==OR) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:21: OR qual_id
                    	    {
                    	    OR169=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1515); 
                    	    OR169_tree = (Object)adaptor.create(OR169);
                    	    adaptor.addChild(root_0, OR169_tree);

                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1517);
                    	    qual_id170=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:37: OTHERS
                    {
                    OTHERS171=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1524); 
                    OTHERS171_tree = (Object)adaptor.create(OTHERS171);
                    adaptor.addChild(root_0, OTHERS171_tree);


                    }
                    break;

            }

            THEN172=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1530); 
            THEN172_tree = (Object)adaptor.create(THEN172);
            adaptor.addChild(root_0, THEN172_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:8: ( statement SEMI )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==ID||LA52_0==RETURN||LA52_0==NULL||LA52_0==BEGIN||(LA52_0>=COLON && LA52_0<=CASE)||(LA52_0>=CLOSE && LA52_0<=EXECUTE)||(LA52_0>=EXIT && LA52_0<=FETCH)||(LA52_0>=FOR && LA52_0<=FORALL)||(LA52_0>=GOTO && LA52_0<=IF)||LA52_0==OPEN||(LA52_0>=RAISE && LA52_0<=LLABEL)||(LA52_0>=COMMIT && LA52_0<=SET)||(LA52_0>=UPDATE && LA52_0<=WHILE)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:10: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_exception_handler1534);
            	    statement173=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement173.getTree());
            	    SEMI174=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1536); 
            	    SEMI174_tree = (Object)adaptor.create(SEMI174);
            	    adaptor.addChild(root_0, SEMI174_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


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
        return retval;
    }
    // $ANTLR end "exception_handler"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:243:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQLTreeParser.statement_return statement() throws RecognitionException {
        PLSQLTreeParser.statement_return retval = new PLSQLTreeParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.label_return label175 = null;

        PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement176 = null;

        PLSQLTreeParser.case_statement_return case_statement177 = null;

        PLSQLTreeParser.close_statement_return close_statement178 = null;

        PLSQLTreeParser.continue_statement_return continue_statement179 = null;

        PLSQLTreeParser.basic_loop_statement_return basic_loop_statement180 = null;

        PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement181 = null;

        PLSQLTreeParser.exit_statement_return exit_statement182 = null;

        PLSQLTreeParser.fetch_statement_return fetch_statement183 = null;

        PLSQLTreeParser.for_loop_statement_return for_loop_statement184 = null;

        PLSQLTreeParser.forall_statement_return forall_statement185 = null;

        PLSQLTreeParser.goto_statement_return goto_statement186 = null;

        PLSQLTreeParser.if_statement_return if_statement187 = null;

        PLSQLTreeParser.null_statement_return null_statement188 = null;

        PLSQLTreeParser.open_statement_return open_statement189 = null;

        PLSQLTreeParser.plsql_block_return plsql_block190 = null;

        PLSQLTreeParser.raise_statement_return raise_statement191 = null;

        PLSQLTreeParser.return_statement_return return_statement192 = null;

        PLSQLTreeParser.sql_statement_return sql_statement193 = null;

        PLSQLTreeParser.while_loop_statement_return while_loop_statement194 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:243:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:244:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:244:5: ( label )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LLABEL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:244:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statement1554);
            	    label175=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label175.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:245:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            int alt54=19;
            switch ( input.LA(1) ) {
            case ID:
            case COLON:
                {
                alt54=1;
                }
                break;
            case CASE:
                {
                alt54=2;
                }
                break;
            case CLOSE:
                {
                alt54=3;
                }
                break;
            case CONTINUE:
                {
                alt54=4;
                }
                break;
            case LOOP:
                {
                alt54=5;
                }
                break;
            case EXECUTE:
                {
                alt54=6;
                }
                break;
            case EXIT:
                {
                alt54=7;
                }
                break;
            case FETCH:
                {
                alt54=8;
                }
                break;
            case FOR:
                {
                alt54=9;
                }
                break;
            case FORALL:
                {
                alt54=10;
                }
                break;
            case GOTO:
                {
                alt54=11;
                }
                break;
            case IF:
                {
                alt54=12;
                }
                break;
            case NULL:
                {
                alt54=13;
                }
                break;
            case OPEN:
                {
                alt54=14;
                }
                break;
            case BEGIN:
            case DECLARE:
                {
                alt54=15;
                }
                break;
            case RAISE:
                {
                alt54=16;
                }
                break;
            case RETURN:
                {
                alt54=17;
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
                alt54=18;
                }
                break;
            case WHILE:
                {
                alt54=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:245:7: assign_or_call_statement
                    {
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1563);
                    assign_or_call_statement176=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement176.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:246:7: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_statement1571);
                    case_statement177=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement177.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:247:7: close_statement
                    {
                    pushFollow(FOLLOW_close_statement_in_statement1579);
                    close_statement178=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement178.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:248:7: continue_statement
                    {
                    pushFollow(FOLLOW_continue_statement_in_statement1587);
                    continue_statement179=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement179.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:249:7: basic_loop_statement
                    {
                    pushFollow(FOLLOW_basic_loop_statement_in_statement1595);
                    basic_loop_statement180=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement180.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:250:7: execute_immediate_statement
                    {
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement1603);
                    execute_immediate_statement181=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement181.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:251:7: exit_statement
                    {
                    pushFollow(FOLLOW_exit_statement_in_statement1611);
                    exit_statement182=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement182.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:252:7: fetch_statement
                    {
                    pushFollow(FOLLOW_fetch_statement_in_statement1619);
                    fetch_statement183=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement183.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:253:7: for_loop_statement
                    {
                    pushFollow(FOLLOW_for_loop_statement_in_statement1627);
                    for_loop_statement184=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement184.getTree());

                    }
                    break;
                case 10 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:254:7: forall_statement
                    {
                    pushFollow(FOLLOW_forall_statement_in_statement1635);
                    forall_statement185=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement185.getTree());

                    }
                    break;
                case 11 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:255:7: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_statement1643);
                    goto_statement186=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement186.getTree());

                    }
                    break;
                case 12 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:256:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement1651);
                    if_statement187=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement187.getTree());

                    }
                    break;
                case 13 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:257:7: null_statement
                    {
                    pushFollow(FOLLOW_null_statement_in_statement1659);
                    null_statement188=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement188.getTree());

                    }
                    break;
                case 14 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:7: open_statement
                    {
                    pushFollow(FOLLOW_open_statement_in_statement1667);
                    open_statement189=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement189.getTree());

                    }
                    break;
                case 15 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:259:7: plsql_block
                    {
                    pushFollow(FOLLOW_plsql_block_in_statement1675);
                    plsql_block190=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block190.getTree());

                    }
                    break;
                case 16 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:260:7: raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_statement1683);
                    raise_statement191=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement191.getTree());

                    }
                    break;
                case 17 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:261:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1691);
                    return_statement192=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement192.getTree());

                    }
                    break;
                case 18 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:262:7: sql_statement
                    {
                    pushFollow(FOLLOW_sql_statement_in_statement1699);
                    sql_statement193=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement193.getTree());

                    }
                    break;
                case 19 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:7: while_loop_statement
                    {
                    pushFollow(FOLLOW_while_loop_statement_in_statement1707);
                    while_loop_statement194=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement194.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "statement"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:267:1: lvalue : call ( DOT call )* ;
    public final PLSQLTreeParser.lvalue_return lvalue() throws RecognitionException {
        PLSQLTreeParser.lvalue_return retval = new PLSQLTreeParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT196=null;
        PLSQLTreeParser.call_return call195 = null;

        PLSQLTreeParser.call_return call197 = null;


        Object DOT196_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:5: ( call ( DOT call )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:7: call ( DOT call )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_lvalue1730);
            call195=call();

            state._fsp--;

            adaptor.addChild(root_0, call195.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:12: ( DOT call )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==DOT) ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1==ID||LA55_1==COLON) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:14: DOT call
            	    {
            	    DOT196=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1734); 
            	    DOT196_tree = (Object)adaptor.create(DOT196);
            	    adaptor.addChild(root_0, DOT196_tree);

            	    pushFollow(FOLLOW_call_in_lvalue1736);
            	    call197=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call197.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class assign_or_call_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_or_call_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:271:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQLTreeParser.assign_or_call_statement_return retval = new PLSQLTreeParser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT199=null;
        Token ASSIGN201=null;
        PLSQLTreeParser.lvalue_return lvalue198 = null;

        PLSQLTreeParser.delete_call_return delete_call200 = null;

        PLSQLTreeParser.expression_return expression202 = null;


        Object DOT199_tree=null;
        Object ASSIGN201_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement1756);
            lvalue198=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue198.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:14: ( DOT delete_call | ASSIGN expression )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==DOT) ) {
                alt56=1;
            }
            else if ( (LA56_0==ASSIGN) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:16: DOT delete_call
                    {
                    DOT199=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement1760); 
                    DOT199_tree = (Object)adaptor.create(DOT199);
                    adaptor.addChild(root_0, DOT199_tree);

                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement1762);
                    delete_call200=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call200.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:34: ASSIGN expression
                    {
                    ASSIGN201=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement1766); 
                    ASSIGN201_tree = (Object)adaptor.create(ASSIGN201);
                    adaptor.addChild(root_0, ASSIGN201_tree);

                    pushFollow(FOLLOW_expression_in_assign_or_call_statement1768);
                    expression202=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression202.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "assign_or_call_statement"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:275:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? -> ^( PROC_CALL ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ) ;
    public final PLSQLTreeParser.call_return call() throws RecognitionException {
        PLSQLTreeParser.call_return retval = new PLSQLTreeParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON203=null;
        Token ID204=null;
        Token LPAREN205=null;
        Token COMMA207=null;
        Token RPAREN209=null;
        PLSQLTreeParser.parameter_return parameter206 = null;

        PLSQLTreeParser.parameter_return parameter208 = null;


        Object COLON203_tree=null;
        Object ID204_tree=null;
        Object LPAREN205_tree=null;
        Object COMMA207_tree=null;
        Object RPAREN209_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? -> ^( PROC_CALL ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:7: ( COLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:7: COLON
                    {
                    COLON203=(Token)match(input,COLON,FOLLOW_COLON_in_call1788);  
                    stream_COLON.add(COLON203);


                    }
                    break;

            }

            ID204=(Token)match(input,ID,FOLLOW_ID_in_call1791);  
            stream_ID.add(ID204);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    LPAREN205=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call1795);  
                    stream_LPAREN.add(LPAREN205);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:26: ( parameter ( COMMA parameter )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ID||LA59_0==LPAREN||(LA59_0>=NOT && LA59_0<=NULL)||LA59_0==COLON||(LA59_0>=MINUS && LA59_0<=PLUS)||LA59_0==SQL||(LA59_0>=INTEGER && LA59_0<=QUOTED_STRING)||(LA59_0>=INSERTING && LA59_0<=DELETING)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:28: parameter ( COMMA parameter )*
                            {
                            pushFollow(FOLLOW_parameter_in_call1799);
                            parameter206=parameter();

                            state._fsp--;

                            stream_parameter.add(parameter206.getTree());
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:38: ( COMMA parameter )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==COMMA) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:40: COMMA parameter
                            	    {
                            	    COMMA207=(Token)match(input,COMMA,FOLLOW_COMMA_in_call1803);  
                            	    stream_COMMA.add(COMMA207);

                            	    pushFollow(FOLLOW_parameter_in_call1805);
                            	    parameter208=parameter();

                            	    state._fsp--;

                            	    stream_parameter.add(parameter208.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN209=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call1813);  
                    stream_RPAREN.add(RPAREN209);


                    }
                    break;

            }



            // AST REWRITE
            // elements: RPAREN, LPAREN, COMMA, parameter, ID, COLON, parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:72: -> ^( PROC_CALL ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:75: ^( PROC_CALL ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC_CALL, "PROC_CALL"), root_1);

                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:87: ( COLON )?
                if ( stream_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_COLON.nextNode());

                }
                stream_COLON.reset();
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:97: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
                if ( stream_RPAREN.hasNext()||stream_LPAREN.hasNext()||stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_LPAREN.nextNode());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:106: ( parameter ( COMMA parameter )* )?
                    if ( stream_COMMA.hasNext()||stream_parameter.hasNext()||stream_parameter.hasNext() ) {
                        adaptor.addChild(root_1, stream_parameter.nextTree());
                        // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:118: ( COMMA parameter )*
                        while ( stream_COMMA.hasNext()||stream_parameter.hasNext() ) {
                            adaptor.addChild(root_1, stream_COMMA.nextNode());
                            adaptor.addChild(root_1, stream_parameter.nextTree());

                        }
                        stream_COMMA.reset();
                        stream_parameter.reset();

                    }
                    stream_COMMA.reset();
                    stream_parameter.reset();
                    stream_parameter.reset();
                    adaptor.addChild(root_1, stream_RPAREN.nextNode());

                }
                stream_RPAREN.reset();
                stream_LPAREN.reset();
                stream_parameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "call"

    public static class delete_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:279:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQLTreeParser.delete_call_return delete_call() throws RecognitionException {
        PLSQLTreeParser.delete_call_return retval = new PLSQLTreeParser.delete_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE210=null;
        Token LPAREN211=null;
        Token RPAREN213=null;
        PLSQLTreeParser.parameter_return parameter212 = null;


        Object DELETE210_tree=null;
        Object LPAREN211_tree=null;
        Object RPAREN213_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE210=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call1869); 
            DELETE210_tree = (Object)adaptor.create(DELETE210);
            adaptor.addChild(root_0, DELETE210_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:14: ( LPAREN ( parameter )? RPAREN )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:16: LPAREN ( parameter )? RPAREN
                    {
                    LPAREN211=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call1873); 
                    LPAREN211_tree = (Object)adaptor.create(LPAREN211);
                    adaptor.addChild(root_0, LPAREN211_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:23: ( parameter )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ID||LA61_0==LPAREN||(LA61_0>=NOT && LA61_0<=NULL)||LA61_0==COLON||(LA61_0>=MINUS && LA61_0<=PLUS)||LA61_0==SQL||(LA61_0>=INTEGER && LA61_0<=QUOTED_STRING)||(LA61_0>=INSERTING && LA61_0<=DELETING)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:23: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_delete_call1875);
                            parameter212=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter212.getTree());

                            }
                            break;

                    }

                    RPAREN213=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call1878); 
                    RPAREN213_tree = (Object)adaptor.create(RPAREN213);
                    adaptor.addChild(root_0, RPAREN213_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "delete_call"

    public static class basic_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQLTreeParser.basic_loop_statement_return retval = new PLSQLTreeParser.basic_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP214=null;
        Token SEMI216=null;
        Token END217=null;
        Token LOOP218=null;
        PLSQLTreeParser.statement_return statement215 = null;

        PLSQLTreeParser.label_name_return label_name219 = null;


        Object LOOP214_tree=null;
        Object SEMI216_tree=null;
        Object END217_tree=null;
        Object LOOP218_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            LOOP214=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1902); 
            LOOP214_tree = (Object)adaptor.create(LOOP214);
            adaptor.addChild(root_0, LOOP214_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:14: ( statement SEMI )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==ID||LA63_0==RETURN||LA63_0==NULL||LA63_0==BEGIN||(LA63_0>=COLON && LA63_0<=CASE)||(LA63_0>=CLOSE && LA63_0<=EXECUTE)||(LA63_0>=EXIT && LA63_0<=FETCH)||(LA63_0>=FOR && LA63_0<=FORALL)||(LA63_0>=GOTO && LA63_0<=IF)||LA63_0==OPEN||(LA63_0>=RAISE && LA63_0<=LLABEL)||(LA63_0>=COMMIT && LA63_0<=SET)||(LA63_0>=UPDATE && LA63_0<=WHILE)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:16: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement1906);
            	    statement215=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement215.getTree());
            	    SEMI216=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement1908); 
            	    SEMI216_tree = (Object)adaptor.create(SEMI216);
            	    adaptor.addChild(root_0, SEMI216_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            END217=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement1913); 
            END217_tree = (Object)adaptor.create(END217);
            adaptor.addChild(root_0, END217_tree);

            LOOP218=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1915); 
            LOOP218_tree = (Object)adaptor.create(LOOP218);
            adaptor.addChild(root_0, LOOP218_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:43: ( label_name )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:43: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement1917);
                    label_name219=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name219.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "basic_loop_statement"

    public static class case_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:287:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQLTreeParser.case_statement_return case_statement() throws RecognitionException {
        PLSQLTreeParser.case_statement_return retval = new PLSQLTreeParser.case_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE220=null;
        Token WHEN222=null;
        Token THEN224=null;
        Token SEMI226=null;
        Token ELSE227=null;
        Token SEMI229=null;
        Token END230=null;
        Token CASE231=null;
        PLSQLTreeParser.expression_return expression221 = null;

        PLSQLTreeParser.expression_return expression223 = null;

        PLSQLTreeParser.statement_return statement225 = null;

        PLSQLTreeParser.statement_return statement228 = null;

        PLSQLTreeParser.label_name_return label_name232 = null;


        Object CASE220_tree=null;
        Object WHEN222_tree=null;
        Object THEN224_tree=null;
        Object SEMI226_tree=null;
        Object ELSE227_tree=null;
        Object SEMI229_tree=null;
        Object END230_tree=null;
        Object CASE231_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:287:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:288:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            CASE220=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement1939); 
            CASE220_tree = (Object)adaptor.create(CASE220);
            adaptor.addChild(root_0, CASE220_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:288:14: ( expression )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID||LA65_0==LPAREN||(LA65_0>=NOT && LA65_0<=NULL)||LA65_0==COLON||(LA65_0>=MINUS && LA65_0<=PLUS)||LA65_0==SQL||(LA65_0>=INTEGER && LA65_0<=QUOTED_STRING)||(LA65_0>=INSERTING && LA65_0<=DELETING)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:288:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_case_statement1941);
                    expression221=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression221.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:9: ( WHEN expression THEN ( statement SEMI )+ )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==WHEN) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    WHEN222=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement1954); 
            	    WHEN222_tree = (Object)adaptor.create(WHEN222);
            	    adaptor.addChild(root_0, WHEN222_tree);

            	    pushFollow(FOLLOW_expression_in_case_statement1956);
            	    expression223=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression223.getTree());
            	    THEN224=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement1958); 
            	    THEN224_tree = (Object)adaptor.create(THEN224);
            	    adaptor.addChild(root_0, THEN224_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:32: ( statement SEMI )+
            	    int cnt66=0;
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==ID||LA66_0==RETURN||LA66_0==NULL||LA66_0==BEGIN||(LA66_0>=COLON && LA66_0<=CASE)||(LA66_0>=CLOSE && LA66_0<=EXECUTE)||(LA66_0>=EXIT && LA66_0<=FETCH)||(LA66_0>=FOR && LA66_0<=FORALL)||(LA66_0>=GOTO && LA66_0<=IF)||LA66_0==OPEN||(LA66_0>=RAISE && LA66_0<=LLABEL)||(LA66_0>=COMMIT && LA66_0<=SET)||(LA66_0>=UPDATE && LA66_0<=WHILE)) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:34: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_case_statement1962);
            	    	    statement225=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement225.getTree());
            	    	    SEMI226=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1964); 
            	    	    SEMI226_tree = (Object)adaptor.create(SEMI226);
            	    	    adaptor.addChild(root_0, SEMI226_tree);


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


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:290:9: ( ELSE statement SEMI )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ELSE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:290:11: ELSE statement SEMI
                    {
                    ELSE227=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement1982); 
                    ELSE227_tree = (Object)adaptor.create(ELSE227);
                    adaptor.addChild(root_0, ELSE227_tree);

                    pushFollow(FOLLOW_statement_in_case_statement1984);
                    statement228=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement228.getTree());
                    SEMI229=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement1986); 
                    SEMI229_tree = (Object)adaptor.create(SEMI229);
                    adaptor.addChild(root_0, SEMI229_tree);


                    }
                    break;

            }

            END230=(Token)match(input,END,FOLLOW_END_in_case_statement1999); 
            END230_tree = (Object)adaptor.create(END230);
            adaptor.addChild(root_0, END230_tree);

            CASE231=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2001); 
            CASE231_tree = (Object)adaptor.create(CASE231);
            adaptor.addChild(root_0, CASE231_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:291:18: ( label_name )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:291:18: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_case_statement2003);
                    label_name232=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name232.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "case_statement"

    public static class close_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "close_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:294:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQLTreeParser.close_statement_return close_statement() throws RecognitionException {
        PLSQLTreeParser.close_statement_return retval = new PLSQLTreeParser.close_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE233=null;
        Token ID234=null;
        Token DOT235=null;
        Token ID236=null;

        Object CLOSE233_tree=null;
        Object ID234_tree=null;
        Object DOT235_tree=null;
        Object ID236_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:294:17: ( CLOSE ID ( DOT ID )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:295:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (Object)adaptor.nil();

            CLOSE233=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement2025); 
            CLOSE233_tree = (Object)adaptor.create(CLOSE233);
            adaptor.addChild(root_0, CLOSE233_tree);

            ID234=(Token)match(input,ID,FOLLOW_ID_in_close_statement2027); 
            ID234_tree = (Object)adaptor.create(ID234);
            adaptor.addChild(root_0, ID234_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:295:18: ( DOT ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==DOT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:295:20: DOT ID
                    {
                    DOT235=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement2031); 
                    DOT235_tree = (Object)adaptor.create(DOT235);
                    adaptor.addChild(root_0, DOT235_tree);

                    ID236=(Token)match(input,ID,FOLLOW_ID_in_close_statement2033); 
                    ID236_tree = (Object)adaptor.create(ID236);
                    adaptor.addChild(root_0, ID236_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "close_statement"

    public static class continue_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continue_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:298:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQLTreeParser.continue_statement_return retval = new PLSQLTreeParser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token CONTINUE237=null;
        Token WHEN238=null;
        PLSQLTreeParser.expression_return expression239 = null;


        Object lbl_tree=null;
        Object CONTINUE237_tree=null;
        Object WHEN238_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:298:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE237=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement2057); 
            CONTINUE237_tree = (Object)adaptor.create(CONTINUE237);
            adaptor.addChild(root_0, CONTINUE237_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:18: (lbl= ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:20: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement2063); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:30: ( WHEN expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WHEN) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:32: WHEN expression
                    {
                    WHEN238=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement2070); 
                    WHEN238_tree = (Object)adaptor.create(WHEN238);
                    adaptor.addChild(root_0, WHEN238_tree);

                    pushFollow(FOLLOW_expression_in_continue_statement2072);
                    expression239=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression239.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "continue_statement"

    public static class execute_immediate_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute_immediate_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:302:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQLTreeParser.execute_immediate_statement_return retval = new PLSQLTreeParser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXECUTE240=null;
        Token IMMEDIATE241=null;
        PLSQLTreeParser.expression_return expression242 = null;

        PLSQLTreeParser.into_clause_return into_clause243 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause244 = null;

        PLSQLTreeParser.using_clause_return using_clause245 = null;

        PLSQLTreeParser.using_clause_return using_clause246 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause247 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause248 = null;


        Object EXECUTE240_tree=null;
        Object IMMEDIATE241_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:302:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:303:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (Object)adaptor.nil();

            EXECUTE240=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement2096); 
            EXECUTE240_tree = (Object)adaptor.create(EXECUTE240);
            adaptor.addChild(root_0, EXECUTE240_tree);

            IMMEDIATE241=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement2098); 
            IMMEDIATE241_tree = (Object)adaptor.create(IMMEDIATE241);
            adaptor.addChild(root_0, IMMEDIATE241_tree);

            pushFollow(FOLLOW_expression_in_execute_immediate_statement2100);
            expression242=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression242.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:303:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            int alt76=4;
            switch ( input.LA(1) ) {
                case INTO:
                case BULK:
                    {
                    alt76=1;
                    }
                    break;
                case USING:
                    {
                    alt76=2;
                    }
                    break;
                case RETURN:
                case RETURNING:
                    {
                    alt76=3;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:9: ( into_clause | bulk_collect_into_clause )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==INTO) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==BULK) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:11: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement2114);
                            into_clause243=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause243.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:25: bulk_collect_into_clause
                            {
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2118);
                            bulk_collect_into_clause244=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause244.getTree());

                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:51: ( using_clause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==USING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:51: using_clause
                            {
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2121);
                            using_clause245=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause245.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:11: using_clause ( dynamic_returning_clause )?
                    {
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2134);
                    using_clause246=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause246.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:24: ( dynamic_returning_clause )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RETURN||LA75_0==RETURNING) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:24: dynamic_returning_clause
                            {
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2136);
                            dynamic_returning_clause247=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause247.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:306:11: dynamic_returning_clause
                    {
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2149);
                    dynamic_returning_clause248=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause248.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "execute_immediate_statement"

    public static class exit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:310:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQLTreeParser.exit_statement_return retval = new PLSQLTreeParser.exit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token EXIT249=null;
        Token WHEN250=null;
        PLSQLTreeParser.expression_return expression251 = null;


        Object lbl_tree=null;
        Object EXIT249_tree=null;
        Object WHEN250_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:310:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            EXIT249=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement2181); 
            EXIT249_tree = (Object)adaptor.create(EXIT249);
            adaptor.addChild(root_0, EXIT249_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:14: (lbl= ID )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:16: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement2187); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:26: ( WHEN expression )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==WHEN) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:28: WHEN expression
                    {
                    WHEN250=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement2194); 
                    WHEN250_tree = (Object)adaptor.create(WHEN250);
                    adaptor.addChild(root_0, WHEN250_tree);

                    pushFollow(FOLLOW_expression_in_exit_statement2196);
                    expression251=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression251.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "exit_statement"

    public static class fetch_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fetch_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:314:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQLTreeParser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQLTreeParser.fetch_statement_return retval = new PLSQLTreeParser.fetch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FETCH252=null;
        Token LIMIT256=null;
        PLSQLTreeParser.qual_id_return qual_id253 = null;

        PLSQLTreeParser.into_clause_return into_clause254 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause255 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression257 = null;


        Object FETCH252_tree=null;
        Object LIMIT256_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:314:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (Object)adaptor.nil();

            FETCH252=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement2220); 
            FETCH252_tree = (Object)adaptor.create(FETCH252);
            adaptor.addChild(root_0, FETCH252_tree);

            pushFollow(FOLLOW_qual_id_in_fetch_statement2222);
            qual_id253=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id253.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==INTO) ) {
                alt80=1;
            }
            else if ( (LA80_0==BULK) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:25: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_fetch_statement2226);
                    into_clause254=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause254.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement2230);
                    bulk_collect_into_clause255=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause255.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:64: ( LIMIT numeric_expression )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==LIMIT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:66: LIMIT numeric_expression
                            {
                            LIMIT256=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement2234); 
                            LIMIT256_tree = (Object)adaptor.create(LIMIT256);
                            adaptor.addChild(root_0, LIMIT256_tree);

                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement2236);
                            numeric_expression257=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression257.getTree());

                            }
                            break;

                    }


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "fetch_statement"

    public static class into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:318:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.into_clause_return into_clause() throws RecognitionException {
        PLSQLTreeParser.into_clause_return retval = new PLSQLTreeParser.into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTO258=null;
        Token COMMA260=null;
        PLSQLTreeParser.lvalue_return lvalue259 = null;

        PLSQLTreeParser.lvalue_return lvalue261 = null;


        Object INTO258_tree=null;
        Object COMMA260_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:318:13: ( INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            INTO258=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2266); 
            INTO258_tree = (Object)adaptor.create(INTO258);
            adaptor.addChild(root_0, INTO258_tree);

            pushFollow(FOLLOW_lvalue_in_into_clause2268);
            lvalue259=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue259.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:21: ( COMMA lvalue )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:23: COMMA lvalue
            	    {
            	    COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2272); 
            	    COMMA260_tree = (Object)adaptor.create(COMMA260);
            	    adaptor.addChild(root_0, COMMA260_tree);

            	    pushFollow(FOLLOW_lvalue_in_into_clause2274);
            	    lvalue261=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue261.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "into_clause"

    public static class bulk_collect_into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bulk_collect_into_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQLTreeParser.bulk_collect_into_clause_return retval = new PLSQLTreeParser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK262=null;
        Token COLLECT263=null;
        Token INTO264=null;
        Token COMMA266=null;
        PLSQLTreeParser.lvalue_return lvalue265 = null;

        PLSQLTreeParser.lvalue_return lvalue267 = null;


        Object BULK262_tree=null;
        Object COLLECT263_tree=null;
        Object INTO264_tree=null;
        Object COMMA266_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            BULK262=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2302); 
            BULK262_tree = (Object)adaptor.create(BULK262);
            adaptor.addChild(root_0, BULK262_tree);

            COLLECT263=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2304); 
            COLLECT263_tree = (Object)adaptor.create(COLLECT263);
            adaptor.addChild(root_0, COLLECT263_tree);

            INTO264=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2306); 
            INTO264_tree = (Object)adaptor.create(INTO264);
            adaptor.addChild(root_0, INTO264_tree);

            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2308);
            lvalue265=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue265.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:34: ( COMMA lvalue )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:36: COMMA lvalue
            	    {
            	    COMMA266=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2312); 
            	    COMMA266_tree = (Object)adaptor.create(COMMA266);
            	    adaptor.addChild(root_0, COMMA266_tree);

            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2314);
            	    lvalue267=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue267.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "bulk_collect_into_clause"

    public static class using_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:326:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQLTreeParser.using_clause_return using_clause() throws RecognitionException {
        PLSQLTreeParser.using_clause_return retval = new PLSQLTreeParser.using_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING268=null;
        Token COMMA271=null;
        PLSQLTreeParser.param_modifiers_return param_modifiers269 = null;

        PLSQLTreeParser.expression_return expression270 = null;

        PLSQLTreeParser.param_modifiers_return param_modifiers272 = null;

        PLSQLTreeParser.expression_return expression273 = null;


        Object USING268_tree=null;
        Object COMMA271_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:326:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (Object)adaptor.nil();

            USING268=(Token)match(input,USING,FOLLOW_USING_in_using_clause2338); 
            USING268_tree = (Object)adaptor.create(USING268);
            adaptor.addChild(root_0, USING268_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:15: ( param_modifiers )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=IN && LA83_0<=OUT)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:15: param_modifiers
                    {
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2340);
                    param_modifiers269=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers269.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_using_clause2343);
            expression270=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression270.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:43: ( COMMA ( param_modifiers )? expression )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:45: COMMA ( param_modifiers )? expression
            	    {
            	    COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2347); 
            	    COMMA271_tree = (Object)adaptor.create(COMMA271);
            	    adaptor.addChild(root_0, COMMA271_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:51: ( param_modifiers )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( ((LA84_0>=IN && LA84_0<=OUT)) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:51: param_modifiers
            	            {
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2349);
            	            param_modifiers272=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers272.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_using_clause2352);
            	    expression273=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression273.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "using_clause"

    public static class param_modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_modifiers"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:330:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQLTreeParser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQLTreeParser.param_modifiers_return retval = new PLSQLTreeParser.param_modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN274=null;
        Token OUT275=null;
        Token OUT276=null;

        Object IN274_tree=null;
        Object OUT275_tree=null;
        Object OUT276_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:2: ( IN ( OUT )? | OUT )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==IN) ) {
                alt87=1;
            }
            else if ( (LA87_0==OUT) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:4: IN ( OUT )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IN274=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2369); 
                    IN274_tree = (Object)adaptor.create(IN274);
                    adaptor.addChild(root_0, IN274_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:7: ( OUT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==OUT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:7: OUT
                            {
                            OUT275=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2371); 
                            OUT275_tree = (Object)adaptor.create(OUT275);
                            adaptor.addChild(root_0, OUT275_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:14: OUT
                    {
                    root_0 = (Object)adaptor.nil();

                    OUT276=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2376); 
                    OUT276_tree = (Object)adaptor.create(OUT276);
                    adaptor.addChild(root_0, OUT276_tree);


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
        return retval;
    }
    // $ANTLR end "param_modifiers"

    public static class dynamic_returning_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_returning_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:334:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQLTreeParser.dynamic_returning_clause_return retval = new PLSQLTreeParser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set277=null;
        PLSQLTreeParser.into_clause_return into_clause278 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause279 = null;


        Object set277_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:334:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (Object)adaptor.nil();

            set277=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set277));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:32: ( into_clause | bulk_collect_into_clause )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==INTO) ) {
                alt88=1;
            }
            else if ( (LA88_0==BULK) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:34: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2406);
                    into_clause278=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause278.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:48: bulk_collect_into_clause
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2410);
                    bulk_collect_into_clause279=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause279.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "dynamic_returning_clause"

    public static class for_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQLTreeParser.for_loop_statement_return retval = new PLSQLTreeParser.for_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR280=null;
        Token ID281=null;
        Token IN282=null;
        Token set283=null;
        Token LOOP284=null;
        Token SEMI286=null;
        Token END287=null;
        Token LOOP288=null;
        PLSQLTreeParser.statement_return statement285 = null;

        PLSQLTreeParser.label_name_return label_name289 = null;


        Object FOR280_tree=null;
        Object ID281_tree=null;
        Object IN282_tree=null;
        Object set283_tree=null;
        Object LOOP284_tree=null;
        Object SEMI286_tree=null;
        Object END287_tree=null;
        Object LOOP288_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            FOR280=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2433); 
            FOR280_tree = (Object)adaptor.create(FOR280);
            adaptor.addChild(root_0, FOR280_tree);

            ID281=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2435); 
            ID281_tree = (Object)adaptor.create(ID281);
            adaptor.addChild(root_0, ID281_tree);

            IN282=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2437); 
            IN282_tree = (Object)adaptor.create(IN282);
            adaptor.addChild(root_0, IN282_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:19: (~ ( LOOP ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=PROC && LA89_0<=DELETE)||(LA89_0>=CASE && LA89_0<=ML_COMMENT)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:21: ~ ( LOOP )
            	    {
            	    set283=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set283));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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

            LOOP284=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2449); 
            LOOP284_tree = (Object)adaptor.create(LOOP284);
            adaptor.addChild(root_0, LOOP284_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:37: ( statement SEMI )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==ID||LA90_0==RETURN||LA90_0==NULL||LA90_0==BEGIN||(LA90_0>=COLON && LA90_0<=CASE)||(LA90_0>=CLOSE && LA90_0<=EXECUTE)||(LA90_0>=EXIT && LA90_0<=FETCH)||(LA90_0>=FOR && LA90_0<=FORALL)||(LA90_0>=GOTO && LA90_0<=IF)||LA90_0==OPEN||(LA90_0>=RAISE && LA90_0<=LLABEL)||(LA90_0>=COMMIT && LA90_0<=SET)||(LA90_0>=UPDATE && LA90_0<=WHILE)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:39: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2453);
            	    statement285=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement285.getTree());
            	    SEMI286=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2455); 
            	    SEMI286_tree = (Object)adaptor.create(SEMI286);
            	    adaptor.addChild(root_0, SEMI286_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);

            END287=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2460); 
            END287_tree = (Object)adaptor.create(END287);
            adaptor.addChild(root_0, END287_tree);

            LOOP288=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2462); 
            LOOP288_tree = (Object)adaptor.create(LOOP288);
            adaptor.addChild(root_0, LOOP288_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:66: ( label_name )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:66: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2464);
                    label_name289=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name289.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "for_loop_statement"

    public static class forall_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forall_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:342:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQLTreeParser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQLTreeParser.forall_statement_return retval = new PLSQLTreeParser.forall_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORALL290=null;
        Token ID291=null;
        Token IN292=null;
        PLSQLTreeParser.bounds_clause_return bounds_clause293 = null;

        PLSQLTreeParser.sql_statement_return sql_statement294 = null;

        PLSQLTreeParser.kSAVE_return kSAVE295 = null;

        PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS296 = null;


        Object FORALL290_tree=null;
        Object ID291_tree=null;
        Object IN292_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:342:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (Object)adaptor.nil();

            FORALL290=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2486); 
            FORALL290_tree = (Object)adaptor.create(FORALL290);
            adaptor.addChild(root_0, FORALL290_tree);

            ID291=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2488); 
            ID291_tree = (Object)adaptor.create(ID291);
            adaptor.addChild(root_0, ID291_tree);

            IN292=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2490); 
            IN292_tree = (Object)adaptor.create(IN292);
            adaptor.addChild(root_0, IN292_tree);

            pushFollow(FOLLOW_bounds_clause_in_forall_statement2492);
            bounds_clause293=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause293.getTree());
            pushFollow(FOLLOW_sql_statement_in_forall_statement2494);
            sql_statement294=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement294.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:50: ( kSAVE kEXCEPTIONS )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:52: kSAVE kEXCEPTIONS
                    {
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2498);
                    kSAVE295=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE295.getTree());
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2500);
                    kEXCEPTIONS296=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS296.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "forall_statement"

    public static class bounds_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:346:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQLTreeParser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQLTreeParser.bounds_clause_return retval = new PLSQLTreeParser.bounds_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLEDOT298=null;
        Token BETWEEN303=null;
        Token AND305=null;
        PLSQLTreeParser.numeric_expression_return numeric_expression297 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression299 = null;

        PLSQLTreeParser.kINDICES_return kINDICES300 = null;

        PLSQLTreeParser.kOF_return kOF301 = null;

        PLSQLTreeParser.atom_return atom302 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression304 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression306 = null;

        PLSQLTreeParser.kVALUES_return kVALUES307 = null;

        PLSQLTreeParser.kOF_return kOF308 = null;

        PLSQLTreeParser.atom_return atom309 = null;


        Object DOUBLEDOT298_tree=null;
        Object BETWEEN303_tree=null;
        Object AND305_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:347:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt94=3;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:347:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2522);
                    numeric_expression297=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression297.getTree());
                    DOUBLEDOT298=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2524); 
                    DOUBLEDOT298_tree = (Object)adaptor.create(DOUBLEDOT298);
                    adaptor.addChild(root_0, DOUBLEDOT298_tree);

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2526);
                    numeric_expression299=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression299.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2534);
                    kINDICES300=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES300.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2536);
                    kOF301=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF301.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2538);
                    atom302=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom302.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==BETWEEN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            BETWEEN303=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2542); 
                            BETWEEN303_tree = (Object)adaptor.create(BETWEEN303);
                            adaptor.addChild(root_0, BETWEEN303_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2544);
                            numeric_expression304=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression304.getTree());
                            AND305=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2546); 
                            AND305_tree = (Object)adaptor.create(AND305);
                            adaptor.addChild(root_0, AND305_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2548);
                            numeric_expression306=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression306.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:349:7: kVALUES kOF atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2559);
                    kVALUES307=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES307.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2561);
                    kOF308=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF308.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2563);
                    atom309=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom309.getTree());

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
        return retval;
    }
    // $ANTLR end "bounds_clause"

    public static class goto_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goto_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:352:1: goto_statement : GOTO label_name ;
    public final PLSQLTreeParser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQLTreeParser.goto_statement_return retval = new PLSQLTreeParser.goto_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GOTO310=null;
        PLSQLTreeParser.label_name_return label_name311 = null;


        Object GOTO310_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:352:16: ( GOTO label_name )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:353:9: GOTO label_name
            {
            root_0 = (Object)adaptor.nil();

            GOTO310=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2584); 
            GOTO310_tree = (Object)adaptor.create(GOTO310);
            adaptor.addChild(root_0, GOTO310_tree);

            pushFollow(FOLLOW_label_name_in_goto_statement2586);
            label_name311=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name311.getTree());

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
        return retval;
    }
    // $ANTLR end "goto_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:356:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQLTreeParser.if_statement_return if_statement() throws RecognitionException {
        PLSQLTreeParser.if_statement_return retval = new PLSQLTreeParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF312=null;
        Token THEN314=null;
        Token SEMI316=null;
        Token ELSIF317=null;
        Token THEN319=null;
        Token SEMI321=null;
        Token ELSE322=null;
        Token SEMI324=null;
        Token END325=null;
        Token IF326=null;
        PLSQLTreeParser.expression_return expression313 = null;

        PLSQLTreeParser.statement_return statement315 = null;

        PLSQLTreeParser.expression_return expression318 = null;

        PLSQLTreeParser.statement_return statement320 = null;

        PLSQLTreeParser.statement_return statement323 = null;


        Object IF312_tree=null;
        Object THEN314_tree=null;
        Object SEMI316_tree=null;
        Object ELSIF317_tree=null;
        Object THEN319_tree=null;
        Object SEMI321_tree=null;
        Object ELSE322_tree=null;
        Object SEMI324_tree=null;
        Object END325_tree=null;
        Object IF326_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:356:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:357:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (Object)adaptor.nil();

            IF312=(Token)match(input,IF,FOLLOW_IF_in_if_statement2607); 
            IF312_tree = (Object)adaptor.create(IF312);
            adaptor.addChild(root_0, IF312_tree);

            pushFollow(FOLLOW_expression_in_if_statement2609);
            expression313=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression313.getTree());
            THEN314=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2611); 
            THEN314_tree = (Object)adaptor.create(THEN314);
            adaptor.addChild(root_0, THEN314_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:357:28: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:357:30: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement2615);
            	    statement315=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement315.getTree());
            	    SEMI316=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2617); 
            	    SEMI316_tree = (Object)adaptor.create(SEMI316);
            	    adaptor.addChild(root_0, SEMI316_tree);


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

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ELSIF) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    ELSIF317=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement2632); 
            	    ELSIF317_tree = (Object)adaptor.create(ELSIF317);
            	    adaptor.addChild(root_0, ELSIF317_tree);

            	    pushFollow(FOLLOW_expression_in_if_statement2634);
            	    expression318=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression318.getTree());
            	    THEN319=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2636); 
            	    THEN319_tree = (Object)adaptor.create(THEN319);
            	    adaptor.addChild(root_0, THEN319_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:33: ( statement SEMI )+
            	    int cnt96=0;
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==ID||LA96_0==RETURN||LA96_0==NULL||LA96_0==BEGIN||(LA96_0>=COLON && LA96_0<=CASE)||(LA96_0>=CLOSE && LA96_0<=EXECUTE)||(LA96_0>=EXIT && LA96_0<=FETCH)||(LA96_0>=FOR && LA96_0<=FORALL)||(LA96_0>=GOTO && LA96_0<=IF)||LA96_0==OPEN||(LA96_0>=RAISE && LA96_0<=LLABEL)||(LA96_0>=COMMIT && LA96_0<=SET)||(LA96_0>=UPDATE && LA96_0<=WHILE)) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:35: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement2640);
            	    	    statement320=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement320.getTree());
            	    	    SEMI321=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2642); 
            	    	    SEMI321_tree = (Object)adaptor.create(SEMI321);
            	    	    adaptor.addChild(root_0, SEMI321_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt96 >= 1 ) break loop96;
            	                EarlyExitException eee =
            	                    new EarlyExitException(96, input);
            	                throw eee;
            	        }
            	        cnt96++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:9: ( ELSE ( statement SEMI )+ )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ELSE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:11: ELSE ( statement SEMI )+
                    {
                    ELSE322=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement2660); 
                    ELSE322_tree = (Object)adaptor.create(ELSE322);
                    adaptor.addChild(root_0, ELSE322_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:16: ( statement SEMI )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==ID||LA98_0==RETURN||LA98_0==NULL||LA98_0==BEGIN||(LA98_0>=COLON && LA98_0<=CASE)||(LA98_0>=CLOSE && LA98_0<=EXECUTE)||(LA98_0>=EXIT && LA98_0<=FETCH)||(LA98_0>=FOR && LA98_0<=FORALL)||(LA98_0>=GOTO && LA98_0<=IF)||LA98_0==OPEN||(LA98_0>=RAISE && LA98_0<=LLABEL)||(LA98_0>=COMMIT && LA98_0<=SET)||(LA98_0>=UPDATE && LA98_0<=WHILE)) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:18: statement SEMI
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement2664);
                    	    statement323=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement323.getTree());
                    	    SEMI324=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2666); 
                    	    SEMI324_tree = (Object)adaptor.create(SEMI324);
                    	    adaptor.addChild(root_0, SEMI324_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt98 >= 1 ) break loop98;
                                EarlyExitException eee =
                                    new EarlyExitException(98, input);
                                throw eee;
                        }
                        cnt98++;
                    } while (true);


                    }
                    break;

            }

            END325=(Token)match(input,END,FOLLOW_END_in_if_statement2682); 
            END325_tree = (Object)adaptor.create(END325);
            adaptor.addChild(root_0, END325_tree);

            IF326=(Token)match(input,IF,FOLLOW_IF_in_if_statement2684); 
            IF326_tree = (Object)adaptor.create(IF326);
            adaptor.addChild(root_0, IF326_tree);


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
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class null_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "null_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:363:1: null_statement : NULL ;
    public final PLSQLTreeParser.null_statement_return null_statement() throws RecognitionException {
        PLSQLTreeParser.null_statement_return retval = new PLSQLTreeParser.null_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL327=null;

        Object NULL327_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:363:16: ( NULL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:9: NULL
            {
            root_0 = (Object)adaptor.nil();

            NULL327=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement2705); 
            NULL327_tree = (Object)adaptor.create(NULL327);
            adaptor.addChild(root_0, NULL327_tree);


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
        return retval;
    }
    // $ANTLR end "null_statement"

    public static class open_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "open_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:367:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQLTreeParser.open_statement_return open_statement() throws RecognitionException {
        PLSQLTreeParser.open_statement_return retval = new PLSQLTreeParser.open_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN328=null;
        Token ID329=null;
        Token DOT330=null;
        Token ID331=null;
        Token FOR333=null;
        PLSQLTreeParser.call_args_return call_args332 = null;

        PLSQLTreeParser.select_statement_return select_statement334 = null;


        Object OPEN328_tree=null;
        Object ID329_tree=null;
        Object DOT330_tree=null;
        Object ID331_tree=null;
        Object FOR333_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:367:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (Object)adaptor.nil();

            OPEN328=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement2726); 
            OPEN328_tree = (Object)adaptor.create(OPEN328);
            adaptor.addChild(root_0, OPEN328_tree);

            ID329=(Token)match(input,ID,FOLLOW_ID_in_open_statement2728); 
            ID329_tree = (Object)adaptor.create(ID329);
            adaptor.addChild(root_0, ID329_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:17: ( DOT ID )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==DOT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:19: DOT ID
            	    {
            	    DOT330=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement2732); 
            	    DOT330_tree = (Object)adaptor.create(DOT330);
            	    adaptor.addChild(root_0, DOT330_tree);

            	    ID331=(Token)match(input,ID,FOLLOW_ID_in_open_statement2734); 
            	    ID331_tree = (Object)adaptor.create(ID331);
            	    adaptor.addChild(root_0, ID331_tree);


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:29: ( call_args )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LPAREN) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:29: call_args
                    {
                    pushFollow(FOLLOW_call_args_in_open_statement2739);
                    call_args332=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args332.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:40: ( FOR select_statement )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FOR) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:42: FOR select_statement
                    {
                    FOR333=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement2744); 
                    FOR333_tree = (Object)adaptor.create(FOR333);
                    adaptor.addChild(root_0, FOR333_tree);

                    pushFollow(FOLLOW_select_statement_in_open_statement2746);
                    select_statement334=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement334.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "open_statement"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:371:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQLTreeParser.pragma_return pragma() throws RecognitionException {
        PLSQLTreeParser.pragma_return retval = new PLSQLTreeParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA335=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi336 = null;


        Object PRAGMA335_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:371:8: ( PRAGMA swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:9: PRAGMA swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA335=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma2770); 
            PRAGMA335_tree = (Object)adaptor.create(PRAGMA335);
            adaptor.addChild(root_0, PRAGMA335_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_pragma2772);
            swallow_to_semi336=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi336.getTree());

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
        return retval;
    }
    // $ANTLR end "pragma"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:375:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQLTreeParser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQLTreeParser.raise_statement_return retval = new PLSQLTreeParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RAISE337=null;
        Token ID338=null;
        Token DOT339=null;
        Token ID340=null;

        Object RAISE337_tree=null;
        Object ID338_tree=null;
        Object DOT339_tree=null;
        Object ID340_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:375:17: ( RAISE ( ID ( DOT ID )* )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (Object)adaptor.nil();

            RAISE337=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement2793); 
            RAISE337_tree = (Object)adaptor.create(RAISE337);
            adaptor.addChild(root_0, RAISE337_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:15: ( ID ( DOT ID )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:17: ID ( DOT ID )*
                    {
                    ID338=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2797); 
                    ID338_tree = (Object)adaptor.create(ID338);
                    adaptor.addChild(root_0, ID338_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:20: ( DOT ID )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==DOT) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:22: DOT ID
                    	    {
                    	    DOT339=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement2801); 
                    	    DOT339_tree = (Object)adaptor.create(DOT339);
                    	    adaptor.addChild(root_0, DOT339_tree);

                    	    ID340=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2803); 
                    	    ID340_tree = (Object)adaptor.create(ID340);
                    	    adaptor.addChild(root_0, ID340_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class return_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:379:1: return_statement : RETURN ( expression )? ;
    public final PLSQLTreeParser.return_statement_return return_statement() throws RecognitionException {
        PLSQLTreeParser.return_statement_return retval = new PLSQLTreeParser.return_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN341=null;
        PLSQLTreeParser.expression_return expression342 = null;


        Object RETURN341_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:379:18: ( RETURN ( expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:380:9: RETURN ( expression )?
            {
            root_0 = (Object)adaptor.nil();

            RETURN341=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement2830); 
            RETURN341_tree = (Object)adaptor.create(RETURN341);
            adaptor.addChild(root_0, RETURN341_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:380:16: ( expression )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ID||LA105_0==LPAREN||(LA105_0>=NOT && LA105_0<=NULL)||LA105_0==COLON||(LA105_0>=MINUS && LA105_0<=PLUS)||LA105_0==SQL||(LA105_0>=INTEGER && LA105_0<=QUOTED_STRING)||(LA105_0>=INSERTING && LA105_0<=DELETING)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:380:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement2832);
                    expression342=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression342.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "return_statement"

    public static class plsql_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plsql_block"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:383:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQLTreeParser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQLTreeParser.plsql_block_return retval = new PLSQLTreeParser.plsql_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DECLARE343=null;
        PLSQLTreeParser.declare_section_return declare_section344 = null;

        PLSQLTreeParser.body_return body345 = null;


        Object DECLARE343_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:383:13: ( ( DECLARE declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:384:9: ( DECLARE declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:384:9: ( DECLARE declare_section )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==DECLARE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:384:11: DECLARE declare_section
                    {
                    DECLARE343=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block2856); 
                    DECLARE343_tree = (Object)adaptor.create(DECLARE343);
                    adaptor.addChild(root_0, DECLARE343_tree);

                    pushFollow(FOLLOW_declare_section_in_plsql_block2858);
                    declare_section344=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section344.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_plsql_block2863);
            body345=body();

            state._fsp--;

            adaptor.addChild(root_0, body345.getTree());

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
        return retval;
    }
    // $ANTLR end "plsql_block"

    public static class label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:387:1: label : LLABEL label RLABEL ;
    public final PLSQLTreeParser.label_return label() throws RecognitionException {
        PLSQLTreeParser.label_return retval = new PLSQLTreeParser.label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LLABEL346=null;
        Token RLABEL348=null;
        PLSQLTreeParser.label_return label347 = null;


        Object LLABEL346_tree=null;
        Object RLABEL348_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:387:7: ( LLABEL label RLABEL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:388:9: LLABEL label RLABEL
            {
            root_0 = (Object)adaptor.nil();

            LLABEL346=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label2884); 
            LLABEL346_tree = (Object)adaptor.create(LLABEL346);
            adaptor.addChild(root_0, LLABEL346_tree);

            pushFollow(FOLLOW_label_in_label2886);
            label347=label();

            state._fsp--;

            adaptor.addChild(root_0, label347.getTree());
            RLABEL348=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label2888); 
            RLABEL348_tree = (Object)adaptor.create(RLABEL348);
            adaptor.addChild(root_0, RLABEL348_tree);


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
        return retval;
    }
    // $ANTLR end "label"

    public static class qual_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qual_id"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQLTreeParser.qual_id_return qual_id() throws RecognitionException {
        PLSQLTreeParser.qual_id_return retval = new PLSQLTreeParser.qual_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON349=null;
        Token ID350=null;
        Token DOT351=null;
        Token COLON352=null;
        Token ID353=null;

        Object COLON349_tree=null;
        Object ID350_tree=null;
        Object DOT351_tree=null;
        Object COLON352_tree=null;
        Object ID353_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:2: ( COLON )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==COLON) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:2: COLON
                    {
                    COLON349=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2902); 
                    COLON349_tree = (Object)adaptor.create(COLON349);
                    adaptor.addChild(root_0, COLON349_tree);


                    }
                    break;

            }

            ID350=(Token)match(input,ID,FOLLOW_ID_in_qual_id2905); 
            ID350_tree = (Object)adaptor.create(ID350);
            adaptor.addChild(root_0, ID350_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:12: ( DOT ( COLON )? ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==DOT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:14: DOT ( COLON )? ID
            	    {
            	    DOT351=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id2909); 
            	    DOT351_tree = (Object)adaptor.create(DOT351);
            	    adaptor.addChild(root_0, DOT351_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:18: ( COLON )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==COLON) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:18: COLON
            	            {
            	            COLON352=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2911); 
            	            COLON352_tree = (Object)adaptor.create(COLON352);
            	            adaptor.addChild(root_0, COLON352_tree);


            	            }
            	            break;

            	    }

            	    ID353=(Token)match(input,ID,FOLLOW_ID_in_qual_id2914); 
            	    ID353_tree = (Object)adaptor.create(ID353);
            	    adaptor.addChild(root_0, ID353_tree);


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "qual_id"

    public static class sql_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:395:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQLTreeParser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQLTreeParser.sql_statement_return retval = new PLSQLTreeParser.sql_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.commit_statement_return commit_statement354 = null;

        PLSQLTreeParser.delete_statement_return delete_statement355 = null;

        PLSQLTreeParser.insert_statement_return insert_statement356 = null;

        PLSQLTreeParser.lock_table_statement_return lock_table_statement357 = null;

        PLSQLTreeParser.rollback_statement_return rollback_statement358 = null;

        PLSQLTreeParser.savepoint_statement_return savepoint_statement359 = null;

        PLSQLTreeParser.select_statement_return select_statement360 = null;

        PLSQLTreeParser.set_transaction_statement_return set_transaction_statement361 = null;

        PLSQLTreeParser.update_statement_return update_statement362 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
            int alt110=9;
            switch ( input.LA(1) ) {
            case COMMIT:
                {
                alt110=1;
                }
                break;
            case DELETE:
                {
                alt110=2;
                }
                break;
            case INSERT:
                {
                alt110=3;
                }
                break;
            case LOCK:
                {
                alt110=4;
                }
                break;
            case ROLLBACK:
                {
                alt110=5;
                }
                break;
            case SAVEPOINT:
                {
                alt110=6;
                }
                break;
            case SELECT:
                {
                alt110=7;
                }
                break;
            case SET:
                {
                alt110=8;
                }
                break;
            case UPDATE:
                {
                alt110=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:7: commit_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_statement_in_sql_statement2934);
                    commit_statement354=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement354.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:7: delete_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_statement_in_sql_statement2942);
                    delete_statement355=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement355.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:398:7: insert_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_statement_in_sql_statement2950);
                    insert_statement356=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement356.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:399:7: lock_table_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement2958);
                    lock_table_statement357=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement357.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:400:7: rollback_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_statement_in_sql_statement2966);
                    rollback_statement358=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement358.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:7: savepoint_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement2974);
                    savepoint_statement359=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement359.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:402:7: select_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_statement_in_sql_statement2982);
                    select_statement360=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement360.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:403:7: set_transaction_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement2990);
                    set_transaction_statement361=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement361.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:404:7: update_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_statement_in_sql_statement2998);
                    update_statement362=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement362.getTree());

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
        return retval;
    }
    // $ANTLR end "sql_statement"

    public static class commit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQLTreeParser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQLTreeParser.commit_statement_return retval = new PLSQLTreeParser.commit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT363=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi364 = null;


        Object COMMIT363_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:18: ( COMMIT ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:408:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            COMMIT363=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement3019); 
            COMMIT363_tree = (Object)adaptor.create(COMMIT363);
            adaptor.addChild(root_0, COMMIT363_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:408:16: ( swallow_to_semi )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=PROC && LA111_1<=PROCEDURE)||(LA111_1>=FUNCTION && LA111_1<=ML_COMMENT)) ) {
                    alt111=1;
                }
                else if ( (LA111_1==ID) ) {
                    int LA111_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt111=1;
                    }
                }
            }
            else if ( ((LA111_0>=PROC && LA111_0<=DIVIDE)||LA111_0==PROCEDURE||(LA111_0>=FUNCTION && LA111_0<=ML_COMMENT)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:408:16: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement3021);
                    swallow_to_semi364=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi364.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "commit_statement"

    public static class delete_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:411:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQLTreeParser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQLTreeParser.delete_statement_return retval = new PLSQLTreeParser.delete_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE365=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi366 = null;


        Object DELETE365_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:411:18: ( DELETE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:412:9: DELETE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            DELETE365=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement3043); 
            DELETE365_tree = (Object)adaptor.create(DELETE365);
            adaptor.addChild(root_0, DELETE365_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement3045);
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
        return retval;
    }
    // $ANTLR end "delete_statement"

    public static class insert_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQLTreeParser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQLTreeParser.insert_statement_return retval = new PLSQLTreeParser.insert_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT367=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi368 = null;


        Object INSERT367_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:18: ( INSERT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:416:9: INSERT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            INSERT367=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement3066); 
            INSERT367_tree = (Object)adaptor.create(INSERT367);
            adaptor.addChild(root_0, INSERT367_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement3068);
            swallow_to_semi368=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi368.getTree());

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
        return retval;
    }
    // $ANTLR end "insert_statement"

    public static class lock_table_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lock_table_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:419:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQLTreeParser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQLTreeParser.lock_table_statement_return retval = new PLSQLTreeParser.lock_table_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOCK369=null;
        Token TABLE370=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi371 = null;


        Object LOCK369_tree=null;
        Object TABLE370_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:419:22: ( LOCK TABLE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:420:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LOCK369=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement3089); 
            LOCK369_tree = (Object)adaptor.create(LOCK369);
            adaptor.addChild(root_0, LOCK369_tree);

            TABLE370=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement3091); 
            TABLE370_tree = (Object)adaptor.create(TABLE370);
            adaptor.addChild(root_0, TABLE370_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement3093);
            swallow_to_semi371=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi371.getTree());

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
        return retval;
    }
    // $ANTLR end "lock_table_statement"

    public static class rollback_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:423:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQLTreeParser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQLTreeParser.rollback_statement_return retval = new PLSQLTreeParser.rollback_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK372=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi373 = null;


        Object ROLLBACK372_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:423:20: ( ROLLBACK ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:424:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK372=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement3114); 
            ROLLBACK372_tree = (Object)adaptor.create(ROLLBACK372);
            adaptor.addChild(root_0, ROLLBACK372_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:424:18: ( swallow_to_semi )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ID) ) {
                int LA112_1 = input.LA(2);

                if ( ((LA112_1>=PROC && LA112_1<=PROCEDURE)||(LA112_1>=FUNCTION && LA112_1<=ML_COMMENT)) ) {
                    alt112=1;
                }
                else if ( (LA112_1==ID) ) {
                    int LA112_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt112=1;
                    }
                }
            }
            else if ( ((LA112_0>=PROC && LA112_0<=DIVIDE)||LA112_0==PROCEDURE||(LA112_0>=FUNCTION && LA112_0<=ML_COMMENT)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:424:18: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement3116);
                    swallow_to_semi373=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi373.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "rollback_statement"

    public static class savepoint_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:427:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQLTreeParser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQLTreeParser.savepoint_statement_return retval = new PLSQLTreeParser.savepoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT374=null;
        Token ID375=null;

        Object SAVEPOINT374_tree=null;
        Object ID375_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:427:21: ( SAVEPOINT ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:428:9: SAVEPOINT ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT374=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement3138); 
            SAVEPOINT374_tree = (Object)adaptor.create(SAVEPOINT374);
            adaptor.addChild(root_0, SAVEPOINT374_tree);

            ID375=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement3140); 
            ID375_tree = (Object)adaptor.create(ID375);
            adaptor.addChild(root_0, ID375_tree);


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
        return retval;
    }
    // $ANTLR end "savepoint_statement"

    public static class select_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQLTreeParser.select_statement_return select_statement() throws RecognitionException {
        PLSQLTreeParser.select_statement_return retval = new PLSQLTreeParser.select_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT376=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi377 = null;


        Object SELECT376_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:18: ( SELECT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:432:9: SELECT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SELECT376=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement3161); 
            SELECT376_tree = (Object)adaptor.create(SELECT376);
            adaptor.addChild(root_0, SELECT376_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_select_statement3163);
            swallow_to_semi377=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi377.getTree());

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
        return retval;
    }
    // $ANTLR end "select_statement"

    public static class set_transaction_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_transaction_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:435:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQLTreeParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQLTreeParser.set_transaction_statement_return retval = new PLSQLTreeParser.set_transaction_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET378=null;
        Token TRANSACTION379=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi380 = null;


        Object SET378_tree=null;
        Object TRANSACTION379_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:435:27: ( SET TRANSACTION swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:436:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SET378=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement3184); 
            SET378_tree = (Object)adaptor.create(SET378);
            adaptor.addChild(root_0, SET378_tree);

            TRANSACTION379=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement3186); 
            TRANSACTION379_tree = (Object)adaptor.create(TRANSACTION379);
            adaptor.addChild(root_0, TRANSACTION379_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement3188);
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
        return retval;
    }
    // $ANTLR end "set_transaction_statement"

    public static class update_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:439:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQLTreeParser.update_statement_return update_statement() throws RecognitionException {
        PLSQLTreeParser.update_statement_return retval = new PLSQLTreeParser.update_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE381=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi382 = null;


        Object UPDATE381_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:439:18: ( UPDATE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:440:9: UPDATE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            UPDATE381=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement3209); 
            UPDATE381_tree = (Object)adaptor.create(UPDATE381);
            adaptor.addChild(root_0, UPDATE381_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_update_statement3211);
            swallow_to_semi382=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi382.getTree());

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
        return retval;
    }
    // $ANTLR end "update_statement"

    public static class swallow_to_semi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "swallow_to_semi"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:443:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQLTreeParser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQLTreeParser.swallow_to_semi_return retval = new PLSQLTreeParser.swallow_to_semi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set383=null;

        Object set383_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:443:17: ( (~ ( SEMI ) )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:444:9: (~ ( SEMI ) )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:444:9: (~ ( SEMI ) )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==ID) ) {
                    int LA113_2 = input.LA(2);

                    if ( ((LA113_2>=PROC && LA113_2<=PROCEDURE)||(LA113_2>=FUNCTION && LA113_2<=ML_COMMENT)) ) {
                        alt113=1;
                    }
                    else if ( (LA113_2==ID) ) {
                        int LA113_4 = input.LA(3);

                        if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                            alt113=1;
                        }


                    }


                }
                else if ( ((LA113_0>=PROC && LA113_0<=DIVIDE)||LA113_0==PROCEDURE||(LA113_0>=FUNCTION && LA113_0<=ML_COMMENT)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:444:9: ~ ( SEMI )
            	    {
            	    set383=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set383));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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
        return retval;
    }
    // $ANTLR end "swallow_to_semi"

    public static class while_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_loop_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:447:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQLTreeParser.while_loop_statement_return retval = new PLSQLTreeParser.while_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE384=null;
        Token LOOP386=null;
        Token SEMI388=null;
        Token END389=null;
        Token LOOP390=null;
        PLSQLTreeParser.expression_return expression385 = null;

        PLSQLTreeParser.statement_return statement387 = null;

        PLSQLTreeParser.label_name_return label_name391 = null;


        Object WHILE384_tree=null;
        Object LOOP386_tree=null;
        Object SEMI388_tree=null;
        Object END389_tree=null;
        Object LOOP390_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:447:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            WHILE384=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3259); 
            WHILE384_tree = (Object)adaptor.create(WHILE384);
            adaptor.addChild(root_0, WHILE384_tree);

            pushFollow(FOLLOW_expression_in_while_loop_statement3261);
            expression385=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression385.getTree());
            LOOP386=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3263); 
            LOOP386_tree = (Object)adaptor.create(LOOP386);
            adaptor.addChild(root_0, LOOP386_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:31: ( statement SEMI )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==ID||LA114_0==RETURN||LA114_0==NULL||LA114_0==BEGIN||(LA114_0>=COLON && LA114_0<=CASE)||(LA114_0>=CLOSE && LA114_0<=EXECUTE)||(LA114_0>=EXIT && LA114_0<=FETCH)||(LA114_0>=FOR && LA114_0<=FORALL)||(LA114_0>=GOTO && LA114_0<=IF)||LA114_0==OPEN||(LA114_0>=RAISE && LA114_0<=LLABEL)||(LA114_0>=COMMIT && LA114_0<=SET)||(LA114_0>=UPDATE && LA114_0<=WHILE)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:33: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3267);
            	    statement387=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement387.getTree());
            	    SEMI388=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3269); 
            	    SEMI388_tree = (Object)adaptor.create(SEMI388);
            	    adaptor.addChild(root_0, SEMI388_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);

            END389=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3274); 
            END389_tree = (Object)adaptor.create(END389);
            adaptor.addChild(root_0, END389_tree);

            LOOP390=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3276); 
            LOOP390_tree = (Object)adaptor.create(LOOP390);
            adaptor.addChild(root_0, LOOP390_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:60: ( label_name )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ID) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:60: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3278);
                    label_name391=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name391.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "while_loop_statement"

    public static class match_parens_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_parens"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:451:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQLTreeParser.match_parens_return match_parens() throws RecognitionException {
        PLSQLTreeParser.match_parens_return retval = new PLSQLTreeParser.match_parens_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set392=null;
        Token RPAREN393=null;
        Token LPAREN395=null;
        PLSQLTreeParser.match_parens_return match_parens394 = null;


        Object set392_tree=null;
        Object RPAREN393_tree=null;
        Object LPAREN395_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=PROC && LA117_0<=DIVIDE)||(LA117_0>=PROCEDURE && LA117_0<=COMMA)||(LA117_0>=NOCOPY && LA117_0<=CURSOR)||(LA117_0>=NOT && LA117_0<=RESULT_CACHE)||(LA117_0>=BEGIN && LA117_0<=ML_COMMENT)) ) {
                alt117=1;
            }
            else if ( (LA117_0==RPAREN) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( ((LA116_0>=PROC && LA116_0<=DIVIDE)||(LA116_0>=PROCEDURE && LA116_0<=RETURN)||LA116_0==COMMA||(LA116_0>=NOCOPY && LA116_0<=CURSOR)||(LA116_0>=NOT && LA116_0<=RESULT_CACHE)||(LA116_0>=BEGIN && LA116_0<=ML_COMMENT)) ) {
                            alt116=1;
                        }
                        else if ( (LA116_0==LPAREN) ) {
                            alt116=2;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    set392=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=RESULT_CACHE)||(input.LA(1)>=BEGIN && input.LA(1)<=ML_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set392));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:453:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    RPAREN393=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3347); 
                    RPAREN393_tree = (Object)adaptor.create(RPAREN393);
                    adaptor.addChild(root_0, RPAREN393_tree);

                    pushFollow(FOLLOW_match_parens_in_match_parens3349);
                    match_parens394=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens394.getTree());
                    LPAREN395=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3351); 
                    LPAREN395_tree = (Object)adaptor.create(LPAREN395);
                    adaptor.addChild(root_0, LPAREN395_tree);


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
        return retval;
    }
    // $ANTLR end "match_parens"

    public static class label_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label_name"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:456:1: label_name : ID ;
    public final PLSQLTreeParser.label_name_return label_name() throws RecognitionException {
        PLSQLTreeParser.label_name_return retval = new PLSQLTreeParser.label_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID396=null;

        Object ID396_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:456:11: ( ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:456:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID396=(Token)match(input,ID,FOLLOW_ID_in_label_name3363); 
            ID396_tree = (Object)adaptor.create(ID396);
            adaptor.addChild(root_0, ID396_tree);


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
        return retval;
    }
    // $ANTLR end "label_name"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:458:1: expression : or_expr ;
    public final PLSQLTreeParser.expression_return expression() throws RecognitionException {
        PLSQLTreeParser.expression_return retval = new PLSQLTreeParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.or_expr_return or_expr397 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:459:5: ( or_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:459:7: or_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_expression3375);
            or_expr397=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr397.getTree());

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
        return retval;
    }
    // $ANTLR end "expression"

    public static class or_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:462:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQLTreeParser.or_expr_return or_expr() throws RecognitionException {
        PLSQLTreeParser.or_expr_return retval = new PLSQLTreeParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR399=null;
        PLSQLTreeParser.and_expr_return and_expr398 = null;

        PLSQLTreeParser.and_expr_return and_expr400 = null;


        Object OR399_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:5: ( and_expr ( OR and_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:7: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr3392);
            and_expr398=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr398.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:16: ( OR and_expr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==OR) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:18: OR and_expr
            	    {
            	    OR399=(Token)match(input,OR,FOLLOW_OR_in_or_expr3396); 
            	    OR399_tree = (Object)adaptor.create(OR399);
            	    adaptor.addChild(root_0, OR399_tree);

            	    pushFollow(FOLLOW_and_expr_in_or_expr3398);
            	    and_expr400=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr400.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:466:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQLTreeParser.and_expr_return and_expr() throws RecognitionException {
        PLSQLTreeParser.and_expr_return retval = new PLSQLTreeParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND402=null;
        PLSQLTreeParser.not_expr_return not_expr401 = null;

        PLSQLTreeParser.not_expr_return not_expr403 = null;


        Object AND402_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:467:5: ( not_expr ( AND not_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:467:7: not_expr ( AND not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr3418);
            not_expr401=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr401.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:467:16: ( AND not_expr )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==AND) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:467:18: AND not_expr
            	    {
            	    AND402=(Token)match(input,AND,FOLLOW_AND_in_and_expr3422); 
            	    AND402_tree = (Object)adaptor.create(AND402);
            	    adaptor.addChild(root_0, AND402_tree);

            	    pushFollow(FOLLOW_not_expr_in_and_expr3424);
            	    not_expr403=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr403.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:470:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQLTreeParser.not_expr_return not_expr() throws RecognitionException {
        PLSQLTreeParser.not_expr_return retval = new PLSQLTreeParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT404=null;
        PLSQLTreeParser.compare_expr_return compare_expr405 = null;


        Object NOT404_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:471:5: ( ( NOT )? compare_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:471:7: ( NOT )? compare_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:471:7: ( NOT )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==NOT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:471:7: NOT
                    {
                    NOT404=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3444); 
                    NOT404_tree = (Object)adaptor.create(NOT404);
                    adaptor.addChild(root_0, NOT404_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_compare_expr_in_not_expr3447);
            compare_expr405=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr405.getTree());

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
        return retval;
    }
    // $ANTLR end "not_expr"

    public static class compare_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:474:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQLTreeParser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQLTreeParser.compare_expr_return retval = new PLSQLTreeParser.compare_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set407=null;
        PLSQLTreeParser.is_null_expr_return is_null_expr406 = null;

        PLSQLTreeParser.is_null_expr_return is_null_expr408 = null;


        Object set407_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:475:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:475:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_is_null_expr_in_compare_expr3464);
            is_null_expr406=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr406.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:475:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=EQ && LA121_0<=GEQ)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:475:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    set407=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set407));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3494);
                    is_null_expr408=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr408.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "compare_expr"

    public static class is_null_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "is_null_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:478:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQLTreeParser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQLTreeParser.is_null_expr_return retval = new PLSQLTreeParser.is_null_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IS410=null;
        Token NOT411=null;
        Token NULL412=null;
        PLSQLTreeParser.like_expr_return like_expr409 = null;


        Object IS410_tree=null;
        Object NOT411_tree=null;
        Object NULL412_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:5: ( like_expr ( IS ( NOT )? NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_like_expr_in_is_null_expr3514);
            like_expr409=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr409.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:17: ( IS ( NOT )? NULL )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IS) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:19: IS ( NOT )? NULL
                    {
                    IS410=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3518); 
                    IS410_tree = (Object)adaptor.create(IS410);
                    adaptor.addChild(root_0, IS410_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:22: ( NOT )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==NOT) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:22: NOT
                            {
                            NOT411=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3520); 
                            NOT411_tree = (Object)adaptor.create(NOT411);
                            adaptor.addChild(root_0, NOT411_tree);


                            }
                            break;

                    }

                    NULL412=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3523); 
                    NULL412_tree = (Object)adaptor.create(NULL412);
                    adaptor.addChild(root_0, NULL412_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "is_null_expr"

    public static class like_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "like_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:482:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQLTreeParser.like_expr_return like_expr() throws RecognitionException {
        PLSQLTreeParser.like_expr_return retval = new PLSQLTreeParser.like_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT414=null;
        Token LIKE415=null;
        PLSQLTreeParser.between_expr_return between_expr413 = null;

        PLSQLTreeParser.between_expr_return between_expr416 = null;


        Object NOT414_tree=null;
        Object LIKE415_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_between_expr_in_like_expr3542);
            between_expr413=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr413.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:20: ( ( NOT )? LIKE between_expr )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NOT||LA125_0==LIKE) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:22: ( NOT )? LIKE between_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:22: ( NOT )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==NOT) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:22: NOT
                            {
                            NOT414=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3546); 
                            NOT414_tree = (Object)adaptor.create(NOT414);
                            adaptor.addChild(root_0, NOT414_tree);


                            }
                            break;

                    }

                    LIKE415=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3549); 
                    LIKE415_tree = (Object)adaptor.create(LIKE415);
                    adaptor.addChild(root_0, LIKE415_tree);

                    pushFollow(FOLLOW_between_expr_in_like_expr3551);
                    between_expr416=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr416.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "like_expr"

    public static class between_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:486:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQLTreeParser.between_expr_return between_expr() throws RecognitionException {
        PLSQLTreeParser.between_expr_return retval = new PLSQLTreeParser.between_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT418=null;
        Token BETWEEN419=null;
        Token AND421=null;
        PLSQLTreeParser.in_expr_return in_expr417 = null;

        PLSQLTreeParser.in_expr_return in_expr420 = null;

        PLSQLTreeParser.in_expr_return in_expr422 = null;


        Object NOT418_tree=null;
        Object BETWEEN419_tree=null;
        Object AND421_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_between_expr3571);
            in_expr417=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr417.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==NOT) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==BETWEEN) ) {
                    alt127=1;
                }
            }
            else if ( (LA127_0==BETWEEN) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:17: ( NOT )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NOT) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:17: NOT
                            {
                            NOT418=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3575); 
                            NOT418_tree = (Object)adaptor.create(NOT418);
                            adaptor.addChild(root_0, NOT418_tree);


                            }
                            break;

                    }

                    BETWEEN419=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3578); 
                    BETWEEN419_tree = (Object)adaptor.create(BETWEEN419);
                    adaptor.addChild(root_0, BETWEEN419_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3580);
                    in_expr420=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr420.getTree());
                    AND421=(Token)match(input,AND,FOLLOW_AND_in_between_expr3582); 
                    AND421_tree = (Object)adaptor.create(AND421);
                    adaptor.addChild(root_0, AND421_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3584);
                    in_expr422=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr422.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "between_expr"

    public static class in_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:490:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQLTreeParser.in_expr_return in_expr() throws RecognitionException {
        PLSQLTreeParser.in_expr_return retval = new PLSQLTreeParser.in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT424=null;
        Token IN425=null;
        Token LPAREN426=null;
        Token COMMA428=null;
        Token RPAREN430=null;
        PLSQLTreeParser.add_expr_return add_expr423 = null;

        PLSQLTreeParser.add_expr_return add_expr427 = null;

        PLSQLTreeParser.add_expr_return add_expr429 = null;


        Object NOT424_tree=null;
        Object IN425_tree=null;
        Object LPAREN426_tree=null;
        Object COMMA428_tree=null;
        Object RPAREN430_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_in_expr3604);
            add_expr423=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr423.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==NOT) ) {
                int LA130_1 = input.LA(2);

                if ( (LA130_1==IN) ) {
                    alt130=1;
                }
            }
            else if ( (LA130_0==IN) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:18: ( NOT )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==NOT) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:18: NOT
                            {
                            NOT424=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr3608); 
                            NOT424_tree = (Object)adaptor.create(NOT424);
                            adaptor.addChild(root_0, NOT424_tree);


                            }
                            break;

                    }

                    IN425=(Token)match(input,IN,FOLLOW_IN_in_in_expr3611); 
                    IN425_tree = (Object)adaptor.create(IN425);
                    adaptor.addChild(root_0, IN425_tree);

                    LPAREN426=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr3613); 
                    LPAREN426_tree = (Object)adaptor.create(LPAREN426);
                    adaptor.addChild(root_0, LPAREN426_tree);

                    pushFollow(FOLLOW_add_expr_in_in_expr3615);
                    add_expr427=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr427.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:42: ( COMMA add_expr )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==COMMA) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:44: COMMA add_expr
                    	    {
                    	    COMMA428=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr3619); 
                    	    COMMA428_tree = (Object)adaptor.create(COMMA428);
                    	    adaptor.addChild(root_0, COMMA428_tree);

                    	    pushFollow(FOLLOW_add_expr_in_in_expr3621);
                    	    add_expr429=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr429.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);

                    RPAREN430=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr3626); 
                    RPAREN430_tree = (Object)adaptor.create(RPAREN430);
                    adaptor.addChild(root_0, RPAREN430_tree);


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "in_expr"

    public static class numeric_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_expression"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:494:1: numeric_expression : add_expr ;
    public final PLSQLTreeParser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQLTreeParser.numeric_expression_return retval = new PLSQLTreeParser.numeric_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.add_expr_return add_expr431 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:5: ( add_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:7: add_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_numeric_expression3646);
            add_expr431=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr431.getTree());

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
        return retval;
    }
    // $ANTLR end "numeric_expression"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:498:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQLTreeParser.add_expr_return add_expr() throws RecognitionException {
        PLSQLTreeParser.add_expr_return retval = new PLSQLTreeParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set433=null;
        PLSQLTreeParser.mul_expr_return mul_expr432 = null;

        PLSQLTreeParser.mul_expr_return mul_expr434 = null;


        Object set433_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:499:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:499:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_expr_in_add_expr3663);
            mul_expr432=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr432.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:499:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( ((LA131_0>=MINUS && LA131_0<=DOUBLEVERTBAR)) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:499:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    set433=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set433));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_expr_in_add_expr3681);
            	    mul_expr434=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr434.getTree());

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mul_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:502:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQLTreeParser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQLTreeParser.mul_expr_return retval = new PLSQLTreeParser.mul_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK436=null;
        Token DIVIDE437=null;
        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr435 = null;

        PLSQLTreeParser.kMOD_return kMOD438 = null;

        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr439 = null;


        Object ASTERISK436_tree=null;
        Object DIVIDE437_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3701);
            unary_sign_expr435=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr435.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==DIVIDE||LA133_0==ID||LA133_0==ASTERISK) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:25: ( ASTERISK | DIVIDE | kMOD )
            	    int alt132=3;
            	    switch ( input.LA(1) ) {
            	    case ASTERISK:
            	        {
            	        alt132=1;
            	        }
            	        break;
            	    case DIVIDE:
            	        {
            	        alt132=2;
            	        }
            	        break;
            	    case ID:
            	        {
            	        alt132=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 132, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt132) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:27: ASTERISK
            	            {
            	            ASTERISK436=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr3707); 
            	            ASTERISK436_tree = (Object)adaptor.create(ASTERISK436);
            	            adaptor.addChild(root_0, ASTERISK436_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:38: DIVIDE
            	            {
            	            DIVIDE437=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr3711); 
            	            DIVIDE437_tree = (Object)adaptor.create(DIVIDE437);
            	            adaptor.addChild(root_0, DIVIDE437_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:47: kMOD
            	            {
            	            pushFollow(FOLLOW_kMOD_in_mul_expr3715);
            	            kMOD438=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD438.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3719);
            	    unary_sign_expr439=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr439.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "mul_expr"

    public static class unary_sign_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_sign_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:506:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQLTreeParser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQLTreeParser.unary_sign_expr_return retval = new PLSQLTreeParser.unary_sign_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set440=null;
        PLSQLTreeParser.exponent_expr_return exponent_expr441 = null;


        Object set440_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:507:5: ( ( MINUS | PLUS )? exponent_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:507:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:507:7: ( MINUS | PLUS )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=MINUS && LA134_0<=PLUS)) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
                    {
                    set440=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set440));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr3750);
            exponent_expr441=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr441.getTree());

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
        return retval;
    }
    // $ANTLR end "unary_sign_expr"

    public static class exponent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exponent_expr"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:510:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQLTreeParser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQLTreeParser.exponent_expr_return retval = new PLSQLTreeParser.exponent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPONENT443=null;
        PLSQLTreeParser.atom_return atom442 = null;

        PLSQLTreeParser.atom_return atom444 = null;


        Object EXPONENT443_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:511:5: ( atom ( EXPONENT atom )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:511:7: atom ( EXPONENT atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_exponent_expr3767);
            atom442=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom442.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:511:12: ( EXPONENT atom )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EXPONENT) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:511:14: EXPONENT atom
                    {
                    EXPONENT443=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr3771); 
                    EXPONENT443_tree = (Object)adaptor.create(EXPONENT443);
                    adaptor.addChild(root_0, EXPONENT443_tree);

                    pushFollow(FOLLOW_atom_in_exponent_expr3773);
                    atom444=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom444.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "exponent_expr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:514:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQLTreeParser.atom_return atom() throws RecognitionException {
        PLSQLTreeParser.atom_return retval = new PLSQLTreeParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PERCENT446=null;
        Token SQL448=null;
        Token PERCENT449=null;
        Token NULL454=null;
        Token LPAREN455=null;
        Token RPAREN457=null;
        PLSQLTreeParser.variable_or_function_call_return variable_or_function_call445 = null;

        PLSQLTreeParser.attribute_return attribute447 = null;

        PLSQLTreeParser.attribute_return attribute450 = null;

        PLSQLTreeParser.string_literal_return string_literal451 = null;

        PLSQLTreeParser.numeric_atom_return numeric_atom452 = null;

        PLSQLTreeParser.boolean_atom_return boolean_atom453 = null;

        PLSQLTreeParser.expression_return expression456 = null;


        Object PERCENT446_tree=null;
        Object SQL448_tree=null;
        Object PERCENT449_tree=null;
        Object NULL454_tree=null;
        Object LPAREN455_tree=null;
        Object RPAREN457_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:515:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt137=7;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:515:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_or_function_call_in_atom3793);
                    variable_or_function_call445=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call445.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:515:33: ( PERCENT attribute )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==PERCENT) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:515:35: PERCENT attribute
                            {
                            PERCENT446=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3797); 
                            PERCENT446_tree = (Object)adaptor.create(PERCENT446);
                            adaptor.addChild(root_0, PERCENT446_tree);

                            pushFollow(FOLLOW_attribute_in_atom3799);
                            attribute447=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute447.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:7: SQL PERCENT attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    SQL448=(Token)match(input,SQL,FOLLOW_SQL_in_atom3810); 
                    SQL448_tree = (Object)adaptor.create(SQL448);
                    adaptor.addChild(root_0, SQL448_tree);

                    PERCENT449=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3812); 
                    PERCENT449_tree = (Object)adaptor.create(PERCENT449);
                    adaptor.addChild(root_0, PERCENT449_tree);

                    pushFollow(FOLLOW_attribute_in_atom3814);
                    attribute450=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute450.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:517:7: string_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_literal_in_atom3822);
                    string_literal451=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal451.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:7: numeric_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_atom_in_atom3830);
                    numeric_atom452=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom452.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:519:7: boolean_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_atom_in_atom3838);
                    boolean_atom453=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom453.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL454=(Token)match(input,NULL,FOLLOW_NULL_in_atom3846); 
                    NULL454_tree = (Object)adaptor.create(NULL454);
                    adaptor.addChild(root_0, NULL454_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:521:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN455=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3854); 
                    LPAREN455_tree = (Object)adaptor.create(LPAREN455);
                    adaptor.addChild(root_0, LPAREN455_tree);

                    pushFollow(FOLLOW_expression_in_atom3856);
                    expression456=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression456.getTree());
                    RPAREN457=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3858); 
                    RPAREN457_tree = (Object)adaptor.create(RPAREN457);
                    adaptor.addChild(root_0, RPAREN457_tree);


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
        return retval;
    }
    // $ANTLR end "atom"

    public static class variable_or_function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_function_call"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:1: variable_or_function_call : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQLTreeParser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQLTreeParser.variable_or_function_call_return retval = new PLSQLTreeParser.variable_or_function_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT459=null;
        Token DOT461=null;
        PLSQLTreeParser.call_return call458 = null;

        PLSQLTreeParser.call_return call460 = null;

        PLSQLTreeParser.delete_call_return delete_call462 = null;


        Object DOT459_tree=null;
        Object DOT461_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:5: ( call ( DOT call )* ( DOT delete_call )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:7: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_variable_or_function_call3879);
            call458=call();

            state._fsp--;

            adaptor.addChild(root_0, call458.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:12: ( DOT call )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==DOT) ) {
                    int LA138_1 = input.LA(2);

                    if ( (LA138_1==ID||LA138_1==COLON) ) {
                        alt138=1;
                    }


                }


                switch (alt138) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:14: DOT call
            	    {
            	    DOT459=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3883); 
            	    DOT459_tree = (Object)adaptor.create(DOT459);
            	    adaptor.addChild(root_0, DOT459_tree);

            	    pushFollow(FOLLOW_call_in_variable_or_function_call3885);
            	    call460=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call460.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:26: ( DOT delete_call )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==DOT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:28: DOT delete_call
                    {
                    DOT461=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call3892); 
                    DOT461_tree = (Object)adaptor.create(DOT461);
                    adaptor.addChild(root_0, DOT461_tree);

                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call3894);
                    delete_call462=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call462.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "variable_or_function_call"

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:528:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQLTreeParser.attribute_return attribute() throws RecognitionException {
        PLSQLTreeParser.attribute_return retval = new PLSQLTreeParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK_ROWCOUNT463=null;
        Token LPAREN464=null;
        Token RPAREN466=null;
        Token ISOPEN468=null;
        Token NOTFOUND469=null;
        PLSQLTreeParser.expression_return expression465 = null;

        PLSQLTreeParser.kFOUND_return kFOUND467 = null;

        PLSQLTreeParser.kROWCOUNT_return kROWCOUNT470 = null;


        Object BULK_ROWCOUNT463_tree=null;
        Object LPAREN464_tree=null;
        Object RPAREN466_tree=null;
        Object ISOPEN468_tree=null;
        Object NOTFOUND469_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:529:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
            int alt140=5;
            switch ( input.LA(1) ) {
            case BULK_ROWCOUNT:
                {
                alt140=1;
                }
                break;
            case ID:
                {
                int LA140_2 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                    alt140=2;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                    alt140=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 2, input);

                    throw nvae;
                }
                }
                break;
            case ISOPEN:
                {
                alt140=3;
                }
                break;
            case NOTFOUND:
                {
                alt140=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:529:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    BULK_ROWCOUNT463=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute3915); 
                    BULK_ROWCOUNT463_tree = (Object)adaptor.create(BULK_ROWCOUNT463);
                    adaptor.addChild(root_0, BULK_ROWCOUNT463_tree);

                    LPAREN464=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute3917); 
                    LPAREN464_tree = (Object)adaptor.create(LPAREN464);
                    adaptor.addChild(root_0, LPAREN464_tree);

                    pushFollow(FOLLOW_expression_in_attribute3919);
                    expression465=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression465.getTree());
                    RPAREN466=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute3921); 
                    RPAREN466_tree = (Object)adaptor.create(RPAREN466);
                    adaptor.addChild(root_0, RPAREN466_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:7: kFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kFOUND_in_attribute3929);
                    kFOUND467=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND467.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:531:7: ISOPEN
                    {
                    root_0 = (Object)adaptor.nil();

                    ISOPEN468=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute3937); 
                    ISOPEN468_tree = (Object)adaptor.create(ISOPEN468);
                    adaptor.addChild(root_0, ISOPEN468_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:532:7: NOTFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTFOUND469=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute3945); 
                    NOTFOUND469_tree = (Object)adaptor.create(NOTFOUND469);
                    adaptor.addChild(root_0, NOTFOUND469_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:533:7: kROWCOUNT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kROWCOUNT_in_attribute3953);
                    kROWCOUNT470=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT470.getTree());

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
        return retval;
    }
    // $ANTLR end "attribute"

    public static class call_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_args"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQLTreeParser.call_args_return call_args() throws RecognitionException {
        PLSQLTreeParser.call_args_return retval = new PLSQLTreeParser.call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN471=null;
        Token COMMA473=null;
        Token RPAREN475=null;
        PLSQLTreeParser.parameter_return parameter472 = null;

        PLSQLTreeParser.parameter_return parameter474 = null;


        Object LPAREN471_tree=null;
        Object COMMA473_tree=null;
        Object RPAREN475_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN471=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args3970); 
            LPAREN471_tree = (Object)adaptor.create(LPAREN471);
            adaptor.addChild(root_0, LPAREN471_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:14: ( parameter ( COMMA parameter )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ID||LA142_0==LPAREN||(LA142_0>=NOT && LA142_0<=NULL)||LA142_0==COLON||(LA142_0>=MINUS && LA142_0<=PLUS)||LA142_0==SQL||(LA142_0>=INTEGER && LA142_0<=QUOTED_STRING)||(LA142_0>=INSERTING && LA142_0<=DELETING)) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:16: parameter ( COMMA parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_call_args3974);
                    parameter472=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter472.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:26: ( COMMA parameter )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==COMMA) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:28: COMMA parameter
                    	    {
                    	    COMMA473=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args3978); 
                    	    COMMA473_tree = (Object)adaptor.create(COMMA473);
                    	    adaptor.addChild(root_0, COMMA473_tree);

                    	    pushFollow(FOLLOW_parameter_in_call_args3980);
                    	    parameter474=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter474.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN475=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args3988); 
            RPAREN475_tree = (Object)adaptor.create(RPAREN475);
            adaptor.addChild(root_0, RPAREN475_tree);


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
        return retval;
    }
    // $ANTLR end "call_args"

    public static class boolean_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:540:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQLTreeParser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQLTreeParser.boolean_atom_return retval = new PLSQLTreeParser.boolean_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.boolean_literal_return boolean_literal476 = null;

        PLSQLTreeParser.collection_exists_return collection_exists477 = null;

        PLSQLTreeParser.conditional_predicate_return conditional_predicate478 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:541:5: ( boolean_literal | collection_exists | conditional_predicate )
            int alt143=3;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt143=1;
                }
                break;
            case ID:
                {
                alt143=2;
                }
                break;
            case INSERTING:
            case UPDATING:
            case DELETING:
                {
                alt143=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:541:7: boolean_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom4005);
                    boolean_literal476=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal476.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:7: collection_exists
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collection_exists_in_boolean_atom4013);
                    collection_exists477=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists477.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:543:7: conditional_predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom4021);
                    conditional_predicate478=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate478.getTree());

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
        return retval;
    }
    // $ANTLR end "boolean_atom"

    public static class numeric_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_atom"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:546:1: numeric_atom : numeric_literal ;
    public final PLSQLTreeParser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQLTreeParser.numeric_atom_return retval = new PLSQLTreeParser.numeric_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.numeric_literal_return numeric_literal479 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:547:5: ( numeric_literal )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:547:7: numeric_literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_numeric_literal_in_numeric_atom4038);
            numeric_literal479=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal479.getTree());

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
        return retval;
    }
    // $ANTLR end "numeric_atom"

    public static class numeric_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQLTreeParser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQLTreeParser.numeric_literal_return retval = new PLSQLTreeParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set480=null;

        Object set480_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:551:5: ( INTEGER | REAL_NUMBER )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set480=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set480));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "numeric_literal"

    public static class boolean_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:555:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQLTreeParser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQLTreeParser.boolean_literal_return retval = new PLSQLTreeParser.boolean_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set481=null;

        Object set481_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:556:5: ( TRUE | FALSE )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set481=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set481));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:560:1: string_literal : QUOTED_STRING ;
    public final PLSQLTreeParser.string_literal_return string_literal() throws RecognitionException {
        PLSQLTreeParser.string_literal_return retval = new PLSQLTreeParser.string_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTED_STRING482=null;

        Object QUOTED_STRING482_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:561:5: ( QUOTED_STRING )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:561:7: QUOTED_STRING
            {
            root_0 = (Object)adaptor.nil();

            QUOTED_STRING482=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal4105); 
            QUOTED_STRING482_tree = (Object)adaptor.create(QUOTED_STRING482);
            adaptor.addChild(root_0, QUOTED_STRING482_tree);


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
        return retval;
    }
    // $ANTLR end "string_literal"

    public static class collection_exists_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_exists"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:564:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQLTreeParser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQLTreeParser.collection_exists_return retval = new PLSQLTreeParser.collection_exists_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID483=null;
        Token DOT484=null;
        Token EXISTS485=null;
        Token LPAREN486=null;
        Token RPAREN488=null;
        PLSQLTreeParser.expression_return expression487 = null;


        Object ID483_tree=null;
        Object DOT484_tree=null;
        Object EXISTS485_tree=null;
        Object LPAREN486_tree=null;
        Object RPAREN488_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:565:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:565:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            ID483=(Token)match(input,ID,FOLLOW_ID_in_collection_exists4122); 
            ID483_tree = (Object)adaptor.create(ID483);
            adaptor.addChild(root_0, ID483_tree);

            DOT484=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists4124); 
            DOT484_tree = (Object)adaptor.create(DOT484);
            adaptor.addChild(root_0, DOT484_tree);

            EXISTS485=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists4126); 
            EXISTS485_tree = (Object)adaptor.create(EXISTS485);
            adaptor.addChild(root_0, EXISTS485_tree);

            LPAREN486=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists4128); 
            LPAREN486_tree = (Object)adaptor.create(LPAREN486);
            adaptor.addChild(root_0, LPAREN486_tree);

            pushFollow(FOLLOW_expression_in_collection_exists4130);
            expression487=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression487.getTree());
            RPAREN488=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists4132); 
            RPAREN488_tree = (Object)adaptor.create(RPAREN488);
            adaptor.addChild(root_0, RPAREN488_tree);


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
        return retval;
    }
    // $ANTLR end "collection_exists"

    public static class conditional_predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_predicate"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQLTreeParser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQLTreeParser.conditional_predicate_return retval = new PLSQLTreeParser.conditional_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERTING489=null;
        Token UPDATING490=null;
        Token LPAREN491=null;
        Token QUOTED_STRING492=null;
        Token RPAREN493=null;
        Token DELETING494=null;

        Object INSERTING489_tree=null;
        Object UPDATING490_tree=null;
        Object LPAREN491_tree=null;
        Object QUOTED_STRING492_tree=null;
        Object RPAREN493_tree=null;
        Object DELETING494_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:569:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
            int alt145=3;
            switch ( input.LA(1) ) {
            case INSERTING:
                {
                alt145=1;
                }
                break;
            case UPDATING:
                {
                alt145=2;
                }
                break;
            case DELETING:
                {
                alt145=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:569:7: INSERTING
                    {
                    root_0 = (Object)adaptor.nil();

                    INSERTING489=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate4149); 
                    INSERTING489_tree = (Object)adaptor.create(INSERTING489);
                    adaptor.addChild(root_0, INSERTING489_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:570:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UPDATING490=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate4157); 
                    UPDATING490_tree = (Object)adaptor.create(UPDATING490);
                    adaptor.addChild(root_0, UPDATING490_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:570:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LPAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:570:18: LPAREN QUOTED_STRING RPAREN
                            {
                            LPAREN491=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate4161); 
                            LPAREN491_tree = (Object)adaptor.create(LPAREN491);
                            adaptor.addChild(root_0, LPAREN491_tree);

                            QUOTED_STRING492=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate4163); 
                            QUOTED_STRING492_tree = (Object)adaptor.create(QUOTED_STRING492);
                            adaptor.addChild(root_0, QUOTED_STRING492_tree);

                            RPAREN493=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate4165); 
                            RPAREN493_tree = (Object)adaptor.create(RPAREN493);
                            adaptor.addChild(root_0, RPAREN493_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:571:7: DELETING
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETING494=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate4176); 
                    DELETING494_tree = (Object)adaptor.create(DELETING494);
                    adaptor.addChild(root_0, DELETING494_tree);


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
        return retval;
    }
    // $ANTLR end "conditional_predicate"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:574:1: parameter : ( ID ARROW )? expression ;
    public final PLSQLTreeParser.parameter_return parameter() throws RecognitionException {
        PLSQLTreeParser.parameter_return retval = new PLSQLTreeParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID495=null;
        Token ARROW496=null;
        PLSQLTreeParser.expression_return expression497 = null;


        Object ID495_tree=null;
        Object ARROW496_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:575:5: ( ( ID ARROW )? expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:575:7: ( ID ARROW )? expression
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:575:7: ( ID ARROW )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ID) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==ARROW) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:575:9: ID ARROW
                    {
                    ID495=(Token)match(input,ID,FOLLOW_ID_in_parameter4195); 
                    ID495_tree = (Object)adaptor.create(ID495);
                    adaptor.addChild(root_0, ID495_tree);

                    ARROW496=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter4197); 
                    ARROW496_tree = (Object)adaptor.create(ARROW496);
                    adaptor.addChild(root_0, ARROW496_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_parameter4202);
            expression497=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression497.getTree());

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
        return retval;
    }
    // $ANTLR end "parameter"

    public static class index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:578:1: index : expression ;
    public final PLSQLTreeParser.index_return index() throws RecognitionException {
        PLSQLTreeParser.index_return retval = new PLSQLTreeParser.index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.expression_return expression498 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:5: ( expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_index4219);
            expression498=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression498.getTree());

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
        return retval;
    }
    // $ANTLR end "index"

    public static class create_package_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:582:1: create_package : CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI ;
    public final PLSQLTreeParser.create_package_return create_package() throws RecognitionException {
        PLSQLTreeParser.create_package_return retval = new PLSQLTreeParser.create_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token CREATE499=null;
        Token OR500=null;
        Token PACKAGE502=null;
        Token DOT503=null;
        Token set505=null;
        Token END507=null;
        Token ID508=null;
        Token SEMI509=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE501 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause504 = null;

        PLSQLTreeParser.declare_section_return declare_section506 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object CREATE499_tree=null;
        Object OR500_tree=null;
        Object PACKAGE502_tree=null;
        Object DOT503_tree=null;
        Object set505_tree=null;
        Object END507_tree=null;
        Object ID508_tree=null;
        Object SEMI509_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:582:16: ( CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:9: CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE499=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package4240); 
            CREATE499_tree = (Object)adaptor.create(CREATE499);
            adaptor.addChild(root_0, CREATE499_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:16: ( OR kREPLACE )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==OR) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:18: OR kREPLACE
                    {
                    OR500=(Token)match(input,OR,FOLLOW_OR_in_create_package4244); 
                    OR500_tree = (Object)adaptor.create(OR500);
                    adaptor.addChild(root_0, OR500_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package4246);
                    kREPLACE501=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE501.getTree());

                    }
                    break;

            }

            PACKAGE502=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package4251); 
            PACKAGE502_tree = (Object)adaptor.create(PACKAGE502);
            adaptor.addChild(root_0, PACKAGE502_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:41: (schema_name= ID DOT )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==ID) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==DOT) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:43: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4257); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT503=(Token)match(input,DOT,FOLLOW_DOT_in_create_package4259); 
                    DOT503_tree = (Object)adaptor.create(DOT503);
                    adaptor.addChild(root_0, DOT503_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4266); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:584:9: ( invoker_rights_clause )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AUTHID) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:584:11: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4278);
                    invoker_rights_clause504=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause504.getTree());

                    }
                    break;

            }

            set505=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set505));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:585:21: ( declare_section )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=PROCEDURE && LA150_0<=FUNCTION)||LA150_0==CURSOR||LA150_0==SUBTYPE||LA150_0==PRAGMA) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:585:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package4303);
                    declare_section506=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section506.getTree());

                    }
                    break;

            }

            END507=(Token)match(input,END,FOLLOW_END_in_create_package4308); 
            END507_tree = (Object)adaptor.create(END507);
            adaptor.addChild(root_0, END507_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:585:46: ( ID )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:585:48: ID
                    {
                    ID508=(Token)match(input,ID,FOLLOW_ID_in_create_package4312); 
                    ID508_tree = (Object)adaptor.create(ID508);
                    adaptor.addChild(root_0, ID508_tree);


                    }
                    break;

            }

            SEMI509=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4317); 
            SEMI509_tree = (Object)adaptor.create(SEMI509);
            adaptor.addChild(root_0, SEMI509_tree);


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
        return retval;
    }
    // $ANTLR end "create_package"

    public static class create_package_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package_body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:588:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLTreeParser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQLTreeParser.create_package_body_return retval = new PLSQLTreeParser.create_package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token package_name2=null;
        Token CREATE510=null;
        Token OR511=null;
        Token PACKAGE513=null;
        Token BODY514=null;
        Token DOT515=null;
        Token set516=null;
        Token END518=null;
        Token SEMI519=null;
        PLSQLTreeParser.body_return initialize_section = null;

        PLSQLTreeParser.kREPLACE_return kREPLACE512 = null;

        PLSQLTreeParser.declare_section_return declare_section517 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object package_name2_tree=null;
        Object CREATE510_tree=null;
        Object OR511_tree=null;
        Object PACKAGE513_tree=null;
        Object BODY514_tree=null;
        Object DOT515_tree=null;
        Object set516_tree=null;
        Object END518_tree=null;
        Object SEMI519_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:588:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE510=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4338); 
            CREATE510_tree = (Object)adaptor.create(CREATE510);
            adaptor.addChild(root_0, CREATE510_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:16: ( OR kREPLACE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==OR) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:18: OR kREPLACE
                    {
                    OR511=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4342); 
                    OR511_tree = (Object)adaptor.create(OR511);
                    adaptor.addChild(root_0, OR511_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4344);
                    kREPLACE512=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE512.getTree());

                    }
                    break;

            }

            PACKAGE513=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4349); 
            PACKAGE513_tree = (Object)adaptor.create(PACKAGE513);
            adaptor.addChild(root_0, PACKAGE513_tree);

            BODY514=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4351); 
            BODY514_tree = (Object)adaptor.create(BODY514);
            adaptor.addChild(root_0, BODY514_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:46: (schema_name= ID DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:48: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4357); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT515=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4359); 
                    DOT515_tree = (Object)adaptor.create(DOT515);
                    adaptor.addChild(root_0, DOT515_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4366); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            set516=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set516));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:590:21: ( declare_section )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=PROCEDURE && LA154_0<=FUNCTION)||LA154_0==CURSOR||LA154_0==SUBTYPE||LA154_0==PRAGMA) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:590:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package_body4388);
                    declare_section517=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section517.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:9: (initialize_section= body | END (package_name2= ID )? )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==BEGIN) ) {
                alt156=1;
            }
            else if ( (LA156_0==END) ) {
                alt156=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:11: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_create_package_body4405);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:37: END (package_name2= ID )?
                    {
                    END518=(Token)match(input,END,FOLLOW_END_in_create_package_body4409); 
                    END518_tree = (Object)adaptor.create(END518);
                    adaptor.addChild(root_0, END518_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:41: (package_name2= ID )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==ID) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:43: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4415); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI519=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4430); 
            SEMI519_tree = (Object)adaptor.create(SEMI519);
            adaptor.addChild(root_0, SEMI519_tree);


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
        return retval;
    }
    // $ANTLR end "create_package_body"

    public static class create_procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_procedure"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:595:1: create_procedure : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQLTreeParser.create_procedure_return retval = new PLSQLTreeParser.create_procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token procedure_name=null;
        Token CREATE520=null;
        Token OR521=null;
        Token PROCEDURE523=null;
        Token DOT524=null;
        Token LPAREN525=null;
        Token COMMA527=null;
        Token RPAREN529=null;
        Token set531=null;
        Token EXTERNAL535=null;
        Token SEMI536=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE522 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration526 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration528 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause530 = null;

        PLSQLTreeParser.declare_section_return declare_section532 = null;

        PLSQLTreeParser.body_return body533 = null;

        PLSQLTreeParser.call_spec_return call_spec534 = null;


        Object schema_name_tree=null;
        Object procedure_name_tree=null;
        Object CREATE520_tree=null;
        Object OR521_tree=null;
        Object PROCEDURE523_tree=null;
        Object DOT524_tree=null;
        Object LPAREN525_tree=null;
        Object COMMA527_tree=null;
        Object RPAREN529_tree=null;
        Object set531_tree=null;
        Object EXTERNAL535_tree=null;
        Object SEMI536_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:595:18: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:9: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE520=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4451); 
            CREATE520_tree = (Object)adaptor.create(CREATE520);
            adaptor.addChild(root_0, CREATE520_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:16: ( OR kREPLACE )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==OR) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:18: OR kREPLACE
                    {
                    OR521=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4455); 
                    OR521_tree = (Object)adaptor.create(OR521);
                    adaptor.addChild(root_0, OR521_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4457);
                    kREPLACE522=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE522.getTree());

                    }
                    break;

            }

            PROCEDURE523=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4462); 
            PROCEDURE523_tree = (Object)adaptor.create(PROCEDURE523);
            adaptor.addChild(root_0, PROCEDURE523_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:43: (schema_name= ID DOT )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ID) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==DOT) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:45: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4468); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT524=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4470); 
                    DOT524_tree = (Object)adaptor.create(DOT524);
                    adaptor.addChild(root_0, DOT524_tree);


                    }
                    break;

            }

            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4477); 
            procedure_name_tree = (Object)adaptor.create(procedure_name);
            adaptor.addChild(root_0, procedure_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==LPAREN) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN525=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_procedure4489); 
                    LPAREN525_tree = (Object)adaptor.create(LPAREN525);
                    adaptor.addChild(root_0, LPAREN525_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4491);
                    parameter_declaration526=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration526.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:40: ( COMMA parameter_declaration )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==COMMA) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:42: COMMA parameter_declaration
                    	    {
                    	    COMMA527=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_procedure4495); 
                    	    COMMA527_tree = (Object)adaptor.create(COMMA527);
                    	    adaptor.addChild(root_0, COMMA527_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4497);
                    	    parameter_declaration528=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration528.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);

                    RPAREN529=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_procedure4502); 
                    RPAREN529_tree = (Object)adaptor.create(RPAREN529);
                    adaptor.addChild(root_0, RPAREN529_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:598:9: ( invoker_rights_clause )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==AUTHID) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:598:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4515);
                    invoker_rights_clause530=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause530.getTree());

                    }
                    break;

            }

            set531=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set531));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:600:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt163=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt163=1;
                }
                break;
            case LANGUAGE:
                {
                alt163=2;
                }
                break;
            case EXTERNAL:
                {
                alt163=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:600:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:600:11: ( declare_section )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( ((LA162_0>=PROCEDURE && LA162_0<=FUNCTION)||LA162_0==CURSOR||LA162_0==SUBTYPE||LA162_0==PRAGMA) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:600:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_procedure4546);
                            declare_section532=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section532.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_procedure4549);
                    body533=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body533.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:601:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_procedure4561);
                    call_spec534=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec534.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:602:11: EXTERNAL
                    {
                    EXTERNAL535=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure4573); 
                    EXTERNAL535_tree = (Object)adaptor.create(EXTERNAL535);
                    adaptor.addChild(root_0, EXTERNAL535_tree);


                    }
                    break;

            }

            SEMI536=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure4585); 
            SEMI536_tree = (Object)adaptor.create(SEMI536);
            adaptor.addChild(root_0, SEMI536_tree);


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
        return retval;
    }
    // $ANTLR end "create_procedure"

    public static class create_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_function"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:1: create_function : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_function_return create_function() throws RecognitionException {
        PLSQLTreeParser.create_function_return retval = new PLSQLTreeParser.create_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token function_name=null;
        Token CREATE537=null;
        Token OR538=null;
        Token FUNCTION540=null;
        Token DOT541=null;
        Token LPAREN542=null;
        Token COMMA544=null;
        Token RPAREN546=null;
        Token RETURN547=null;
        Token set550=null;
        Token EXTERNAL554=null;
        Token SEMI555=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE539 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration543 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration545 = null;

        PLSQLTreeParser.datatype_return datatype548 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause549 = null;

        PLSQLTreeParser.declare_section_return declare_section551 = null;

        PLSQLTreeParser.body_return body552 = null;

        PLSQLTreeParser.call_spec_return call_spec553 = null;


        Object schema_name_tree=null;
        Object function_name_tree=null;
        Object CREATE537_tree=null;
        Object OR538_tree=null;
        Object FUNCTION540_tree=null;
        Object DOT541_tree=null;
        Object LPAREN542_tree=null;
        Object COMMA544_tree=null;
        Object RPAREN546_tree=null;
        Object RETURN547_tree=null;
        Object set550_tree=null;
        Object EXTERNAL554_tree=null;
        Object SEMI555_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:17: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:9: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE537=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function4606); 
            CREATE537_tree = (Object)adaptor.create(CREATE537);
            adaptor.addChild(root_0, CREATE537_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:16: ( OR kREPLACE )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==OR) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:18: OR kREPLACE
                    {
                    OR538=(Token)match(input,OR,FOLLOW_OR_in_create_function4610); 
                    OR538_tree = (Object)adaptor.create(OR538);
                    adaptor.addChild(root_0, OR538_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_function4612);
                    kREPLACE539=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE539.getTree());

                    }
                    break;

            }

            FUNCTION540=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function4617); 
            FUNCTION540_tree = (Object)adaptor.create(FUNCTION540);
            adaptor.addChild(root_0, FUNCTION540_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:42: (schema_name= ID DOT )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==ID) ) {
                int LA165_1 = input.LA(2);

                if ( (LA165_1==DOT) ) {
                    alt165=1;
                }
            }
            switch (alt165) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:44: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4623); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT541=(Token)match(input,DOT,FOLLOW_DOT_in_create_function4625); 
                    DOT541_tree = (Object)adaptor.create(DOT541);
                    adaptor.addChild(root_0, DOT541_tree);


                    }
                    break;

            }

            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4632); 
            function_name_tree = (Object)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:608:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==LPAREN) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:608:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN542=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_function4644); 
                    LPAREN542_tree = (Object)adaptor.create(LPAREN542);
                    adaptor.addChild(root_0, LPAREN542_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_function4646);
                    parameter_declaration543=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration543.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:608:40: ( COMMA parameter_declaration )*
                    loop166:
                    do {
                        int alt166=2;
                        int LA166_0 = input.LA(1);

                        if ( (LA166_0==COMMA) ) {
                            alt166=1;
                        }


                        switch (alt166) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:608:42: COMMA parameter_declaration
                    	    {
                    	    COMMA544=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_function4650); 
                    	    COMMA544_tree = (Object)adaptor.create(COMMA544);
                    	    adaptor.addChild(root_0, COMMA544_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_function4652);
                    	    parameter_declaration545=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration545.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop166;
                        }
                    } while (true);

                    RPAREN546=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_function4657); 
                    RPAREN546_tree = (Object)adaptor.create(RPAREN546);
                    adaptor.addChild(root_0, RPAREN546_tree);


                    }
                    break;

            }

            RETURN547=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function4670); 
            RETURN547_tree = (Object)adaptor.create(RETURN547);
            adaptor.addChild(root_0, RETURN547_tree);

            pushFollow(FOLLOW_datatype_in_create_function4672);
            datatype548=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype548.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:610:9: ( invoker_rights_clause )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==AUTHID) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:610:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function4682);
                    invoker_rights_clause549=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause549.getTree());

                    }
                    break;

            }

            set550=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set550));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt170=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt170=1;
                }
                break;
            case LANGUAGE:
                {
                alt170=2;
                }
                break;
            case EXTERNAL:
                {
                alt170=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }

            switch (alt170) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:11: ( declare_section )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( ((LA169_0>=PROCEDURE && LA169_0<=FUNCTION)||LA169_0==CURSOR||LA169_0==SUBTYPE||LA169_0==PRAGMA) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_function4713);
                            declare_section551=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section551.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_function4716);
                    body552=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body552.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:613:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_function4728);
                    call_spec553=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec553.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:614:11: EXTERNAL
                    {
                    EXTERNAL554=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function4740); 
                    EXTERNAL554_tree = (Object)adaptor.create(EXTERNAL554);
                    adaptor.addChild(root_0, EXTERNAL554_tree);


                    }
                    break;

            }

            SEMI555=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function4752); 
            SEMI555_tree = (Object)adaptor.create(SEMI555);
            adaptor.addChild(root_0, SEMI555_tree);


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
        return retval;
    }
    // $ANTLR end "create_function"

    public static class invoker_rights_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoker_rights_clause"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:618:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQLTreeParser.invoker_rights_clause_return retval = new PLSQLTreeParser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AUTHID556=null;
        Token set557=null;

        Object AUTHID556_tree=null;
        Object set557_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:618:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (Object)adaptor.nil();

            AUTHID556=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause4773); 
            AUTHID556_tree = (Object)adaptor.create(AUTHID556);
            adaptor.addChild(root_0, AUTHID556_tree);

            set557=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set557));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "invoker_rights_clause"

    public static class call_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_spec"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:622:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQLTreeParser.call_spec_return call_spec() throws RecognitionException {
        PLSQLTreeParser.call_spec_return retval = new PLSQLTreeParser.call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGUAGE558=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi559 = null;


        Object LANGUAGE558_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:623:5: ( LANGUAGE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:623:7: LANGUAGE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LANGUAGE558=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec4800); 
            LANGUAGE558_tree = (Object)adaptor.create(LANGUAGE558);
            adaptor.addChild(root_0, LANGUAGE558_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_call_spec4802);
            swallow_to_semi559=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi559.getTree());

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
        return retval;
    }
    // $ANTLR end "call_spec"

    public static class kERRORS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kERRORS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:1: kERRORS : {...}? ID ;
    public final PLSQLTreeParser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQLTreeParser.kERRORS_return retval = new PLSQLTreeParser.kERRORS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID560=null;

        Object ID560_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()))) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            ID560=(Token)match(input,ID,FOLLOW_ID_in_kERRORS4817); 
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
        return retval;
    }
    // $ANTLR end "kERRORS"

    public static class kEXCEPTIONS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kEXCEPTIONS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQLTreeParser.kEXCEPTIONS_return retval = new PLSQLTreeParser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID561=null;

        Object ID561_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:13: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:15: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("exceptions"))) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            ID561=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS4826); 
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
        return retval;
    }
    // $ANTLR end "kEXCEPTIONS"

    public static class kFOUND_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kFOUND"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:628:1: kFOUND : {...}? ID ;
    public final PLSQLTreeParser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQLTreeParser.kFOUND_return retval = new PLSQLTreeParser.kFOUND_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID562=null;

        Object ID562_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:628:8: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:628:10: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            ID562=(Token)match(input,ID,FOLLOW_ID_in_kFOUND4835); 
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
        return retval;
    }
    // $ANTLR end "kFOUND"

    public static class kINDICES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kINDICES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:629:1: kINDICES : {...}? ID ;
    public final PLSQLTreeParser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQLTreeParser.kINDICES_return retval = new PLSQLTreeParser.kINDICES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID563=null;

        Object ID563_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:629:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:629:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            ID563=(Token)match(input,ID,FOLLOW_ID_in_kINDICES4844); 
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
        return retval;
    }
    // $ANTLR end "kINDICES"

    public static class kMOD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kMOD"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:630:1: kMOD : {...}? ID ;
    public final PLSQLTreeParser.kMOD_return kMOD() throws RecognitionException {
        PLSQLTreeParser.kMOD_return retval = new PLSQLTreeParser.kMOD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID564=null;

        Object ID564_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:630:6: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:630:8: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("mod"))) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            ID564=(Token)match(input,ID,FOLLOW_ID_in_kMOD4853); 
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
        return retval;
    }
    // $ANTLR end "kMOD"

    public static class kNAME_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kNAME"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:1: kNAME : {...}? ID ;
    public final PLSQLTreeParser.kNAME_return kNAME() throws RecognitionException {
        PLSQLTreeParser.kNAME_return retval = new PLSQLTreeParser.kNAME_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID565=null;

        Object ID565_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("name"))) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            ID565=(Token)match(input,ID,FOLLOW_ID_in_kNAME4862); 
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
        return retval;
    }
    // $ANTLR end "kNAME"

    public static class kOF_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kOF"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:1: kOF : {...}? ID ;
    public final PLSQLTreeParser.kOF_return kOF() throws RecognitionException {
        PLSQLTreeParser.kOF_return retval = new PLSQLTreeParser.kOF_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID566=null;

        Object ID566_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:5: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:7: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("of"))) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            ID566=(Token)match(input,ID,FOLLOW_ID_in_kOF4871); 
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
        return retval;
    }
    // $ANTLR end "kOF"

    public static class kREPLACE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kREPLACE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:1: kREPLACE : {...}? ID ;
    public final PLSQLTreeParser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQLTreeParser.kREPLACE_return retval = new PLSQLTreeParser.kREPLACE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID567=null;

        Object ID567_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("replace"))) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            ID567=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE4880); 
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
        return retval;
    }
    // $ANTLR end "kREPLACE"

    public static class kROWCOUNT_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kROWCOUNT"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:634:1: kROWCOUNT : {...}? ID ;
    public final PLSQLTreeParser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQLTreeParser.kROWCOUNT_return retval = new PLSQLTreeParser.kROWCOUNT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID568=null;

        Object ID568_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:634:11: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:634:13: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            ID568=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT4889); 
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
        return retval;
    }
    // $ANTLR end "kROWCOUNT"

    public static class kSAVE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSAVE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:635:1: kSAVE : {...}? ID ;
    public final PLSQLTreeParser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQLTreeParser.kSAVE_return retval = new PLSQLTreeParser.kSAVE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID569=null;

        Object ID569_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:635:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:635:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("save"))) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            ID569=(Token)match(input,ID,FOLLOW_ID_in_kSAVE4898); 
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
        return retval;
    }
    // $ANTLR end "kSAVE"

    public static class kSHOW_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSHOW"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:1: kSHOW : {...}? ID ;
    public final PLSQLTreeParser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQLTreeParser.kSHOW_return retval = new PLSQLTreeParser.kSHOW_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID570=null;

        Object ID570_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("show"))) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            ID570=(Token)match(input,ID,FOLLOW_ID_in_kSHOW4907); 
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
        return retval;
    }
    // $ANTLR end "kSHOW"

    public static class kTYPE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kTYPE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:1: kTYPE : {...}? ID ;
    public final PLSQLTreeParser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQLTreeParser.kTYPE_return retval = new PLSQLTreeParser.kTYPE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID571=null;

        Object ID571_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("type"))) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            ID571=(Token)match(input,ID,FOLLOW_ID_in_kTYPE4916); 
            ID571_tree = (Object)adaptor.create(ID571);
            adaptor.addChild(root_0, ID571_tree);


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
        return retval;
    }
    // $ANTLR end "kTYPE"

    public static class kVALUES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kVALUES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:1: kVALUES : {...}? ID ;
    public final PLSQLTreeParser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQLTreeParser.kVALUES_return retval = new PLSQLTreeParser.kVALUES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID572=null;

        Object ID572_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("values"))) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            ID572=(Token)match(input,ID,FOLLOW_ID_in_kVALUES4925); 
            ID572_tree = (Object)adaptor.create(ID572);
            adaptor.addChild(root_0, ID572_tree);


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
        return retval;
    }
    // $ANTLR end "kVALUES"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA137 dfa137 = new DFA137(this);
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\15\1\uffff\1\16\6\uffff\1\14\1\uffff";
    static final String DFA14_maxS =
        "\1\120\1\uffff\1\47\6\uffff\1\51\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\10\1\uffff\1\2\1\3\1\5\1\6\1\7\1\4\1\uffff\1\1";
    static final String DFA14_specialS =
        "\13\uffff}>";
    static final String[] DFA14_transitionS = {
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 122:5: ( type_definition SEMI -> ^( DECL ) | subtype_definition SEMI -> ^( DECL ) | cursor_definition SEMI -> ^( DECL ) | item_declaration SEMI -> ^( DECL ) | function_declaration_or_definition SEMI -> ^( DECL ) | procedure_declaration_or_definition SEMI -> ^( DECL ) | pragma SEMI -> ^( DECL ) )+";
        }
    }
    static final String DFA94_eotS =
        "\17\uffff";
    static final String DFA94_eofS =
        "\17\uffff";
    static final String DFA94_minS =
        "\1\16\2\uffff\1\0\13\uffff";
    static final String DFA94_maxS =
        "\1\167\2\uffff\1\0\13\uffff";
    static final String DFA94_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\1\3";
    static final String DFA94_specialS =
        "\3\uffff\1\0\13\uffff}>";
    static final String[] DFA94_transitionS = {
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "346:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_3 = input.LA(1);

                         
                        int index94_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((((input.LT(1).getText().equalsIgnoreCase("indices"))||(input.LT(1).getText().equalsIgnoreCase("values")))))) ) {s = 1;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {s = 13;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("values"))) ) {s = 14;}

                         
                        input.seek(index94_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA137_eotS =
        "\12\uffff";
    static final String DFA137_eofS =
        "\2\uffff\1\1\7\uffff";
    static final String DFA137_minS =
        "\1\16\1\uffff\1\13\6\uffff\1\16";
    static final String DFA137_maxS =
        "\1\167\1\uffff\1\152\6\uffff\1\164";
    static final String DFA137_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA137_specialS =
        "\12\uffff}>";
    static final String[] DFA137_transitionS = {
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

    static final short[] DFA137_eot = DFA.unpackEncodedString(DFA137_eotS);
    static final short[] DFA137_eof = DFA.unpackEncodedString(DFA137_eofS);
    static final char[] DFA137_min = DFA.unpackEncodedStringToUnsignedChars(DFA137_minS);
    static final char[] DFA137_max = DFA.unpackEncodedStringToUnsignedChars(DFA137_maxS);
    static final short[] DFA137_accept = DFA.unpackEncodedString(DFA137_acceptS);
    static final short[] DFA137_special = DFA.unpackEncodedString(DFA137_specialS);
    static final short[][] DFA137_transition;

    static {
        int numStates = DFA137_transitionS.length;
        DFA137_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA137_transition[i] = DFA.unpackEncodedString(DFA137_transitionS[i]);
        }
    }

    class DFA137 extends DFA {

        public DFA137(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 137;
            this.eot = DFA137_eot;
            this.eof = DFA137_eof;
            this.min = DFA137_min;
            this.max = DFA137_max;
            this.accept = DFA137_accept;
            this.special = DFA137_special;
            this.transition = DFA137_transition;
        }
        public String getDescription() {
            return "514:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file120 = new BitSet(new long[]{0x0000000000000800L,0x0200000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file124 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file126 = new BitSet(new long[]{0x0000000000000800L,0x0200000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file131 = new BitSet(new long[]{0x0000000000000800L,0x0200000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors158 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors160 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_SEMI_in_show_errors162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_procedure_heading227 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_function_heading264 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RETURN_in_function_heading269 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_function_heading271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations296 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations299 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations306 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration366 = new BitSet(new long[]{0x0000008000304000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration370 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration378 = new BitSet(new long[]{0x0000008000404000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration382 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration384 = new BitSet(new long[]{0x0000008000404000L});
    public static final BitSet FOLLOW_NOCOPY_in_parameter_declaration388 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration396 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ASSIGN_in_parameter_declaration410 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter_declaration414 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_definition_in_declare_section452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section454 = new BitSet(new long[]{0x000000008200E002L,0x0000000000010000L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section471 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section486 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section488 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section503 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section505 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section520 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section522 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section539 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_pragma_in_declare_section554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section556 = new BitSet(new long[]{0x000000008200F002L,0x0000000000010000L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition592 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_cursor_definition594 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition596 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition599 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration672 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration674 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration682 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration684 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_variable_declaration689 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration726 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration728 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration730 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration736 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_constant_declaration741 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration776 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition799 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_type_definition801 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IS_in_type_definition803 = new BitSet(new long[]{0x0000009B00000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition838 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_subtype_definition840 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition842 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition844 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition848 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition873 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition875 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition881 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration900 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration902 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration908 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration910 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration915 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition960 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition971 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition973 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition975 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition977 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition979 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition983 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition999 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition1001 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition1003 = new BitSet(new long[]{0x0000002008000002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition1007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition1009 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition1016 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition1018 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition1045 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition1047 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition1051 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype1072 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_datatype1077 = new BitSet(new long[]{0x0000030000020002L});
    public static final BitSet FOLLOW_DOT_in_datatype1081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_datatype1083 = new BitSet(new long[]{0x0000020000020002L});
    public static final BitSet FOLLOW_LPAREN_in_datatype1090 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1092 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_datatype1096 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1098 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_datatype1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype1107 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_kTYPE_in_datatype1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition1141 = new BitSet(new long[]{0x0000F80004000002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1151 = new BitSet(new long[]{0x0000F80004000002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1180 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1190 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1214 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1224 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1262 = new BitSet(new long[]{0x0000F80004000000L});
    public static final BitSet FOLLOW_set_in_function_definition1272 = new BitSet(new long[]{0x0000F80004000000L});
    public static final BitSet FOLLOW_set_in_function_definition1299 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1309 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_function_definition1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1330 = new BitSet(new long[]{0x0000800004000002L});
    public static final BitSet FOLLOW_set_in_procedure_declaration_or_definition1342 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1352 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1383 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_set_in_procedure_definition1386 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1396 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_procedure_definition1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1416 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_body1418 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_body1420 = new BitSet(new long[]{0xBBC30000D201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_st_pragma_in_body1422 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_EXCEPTION_in_body1427 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body1429 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_END_in_body1435 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ID_in_body1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_st_pragma1484 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1486 = new BitSet(new long[]{0xBBC100009201F002L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_pragma_in_st_pragma1490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1492 = new BitSet(new long[]{0xBBC100009201F002L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1507 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1511 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1515 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1517 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1524 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1530 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_exception_handler1534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1536 = new BitSet(new long[]{0xBBC100009201F002L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_label_in_statement1554 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue1730 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue1734 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_call_in_lvalue1736 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement1756 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement1760 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement1766 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call1788 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_call1791 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_LPAREN_in_call1795 = new BitSet(new long[]{0x00400000180A4000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_parameter_in_call1799 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_call1803 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_parameter_in_call1805 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_call1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call1869 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call1873 = new BitSet(new long[]{0x00400000180A4000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call1875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1902 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement1906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement1908 = new BitSet(new long[]{0xBBC300009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_END_in_basic_loop_statement1913 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1915 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement1939 = new BitSet(new long[]{0x0044000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1941 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement1954 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement1956 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement1958 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_case_statement1962 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1964 = new BitSet(new long[]{0xBFC700009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_ELSE_in_case_statement1982 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_case_statement1984 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement1986 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_case_statement1999 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement2001 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_label_name_in_case_statement2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement2025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_close_statement2027 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement2031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_close_statement2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement2057 = new BitSet(new long[]{0x0004000000004002L});
    public static final BitSet FOLLOW_ID_in_continue_statement2063 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement2070 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement2096 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement2098 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement2100 = new BitSet(new long[]{0x0000000000010002L,0x000000000000006CL});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement2114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2134 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000040L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement2181 = new BitSet(new long[]{0x0004000000004002L});
    public static final BitSet FOLLOW_ID_in_exit_statement2187 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement2194 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement2220 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement2222 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement2230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement2234 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2266 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2268 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2272 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2274 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2306 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2308 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2312 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2314 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_USING_in_using_clause2338 = new BitSet(new long[]{0x0040000018324000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2340 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2343 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2347 = new BitSet(new long[]{0x0040000018324000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2349 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2352 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2369 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2394 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2433 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2435 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2437 = new BitSet(new long[]{0xFEFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2441 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2449 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2453 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2455 = new BitSet(new long[]{0xBBC300009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_END_in_for_loop_statement2460 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2462 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2486 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_forall_statement2488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2490 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2492 = new BitSet(new long[]{0x0080000000000000L,0x000000002FE00000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2494 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2524 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2534 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2536 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2542 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2546 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2559 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2561 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2607 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2609 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2611 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_if_statement2615 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2617 = new BitSet(new long[]{0xBFC300009201F000L,0x000000006FEFF181L});
    public static final BitSet FOLLOW_ELSIF_in_if_statement2632 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2634 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2636 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_if_statement2640 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2642 = new BitSet(new long[]{0xBFC300009201F000L,0x000000006FEFF181L});
    public static final BitSet FOLLOW_ELSE_in_if_statement2660 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_if_statement2664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2666 = new BitSet(new long[]{0xBBC300009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_END_in_if_statement2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_IF_in_if_statement2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement2726 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_open_statement2728 = new BitSet(new long[]{0x0000010000020002L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_open_statement2732 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_open_statement2734 = new BitSet(new long[]{0x0000010000020002L,0x0000000000000080L});
    public static final BitSet FOLLOW_call_args_in_open_statement2739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_FOR_in_open_statement2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma2770 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement2793 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ID_in_raise_statement2797 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement2801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_raise_statement2803 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement2830 = new BitSet(new long[]{0x0040000018024002L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_return_statement2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block2856 = new BitSet(new long[]{0x000000008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block2858 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_plsql_block2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_label_in_label2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RLABEL_in_label2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id2902 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_qual_id2905 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id2909 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_COLON_in_qual_id2911 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_qual_id2914 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement3019 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF2L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement3043 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement3066 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement3089 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement3091 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement3114 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF2L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement3138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement3161 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement3184 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement3186 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement3209 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi3232 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF2L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3259 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3261 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3263 = new BitSet(new long[]{0xBBC100009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3269 = new BitSet(new long[]{0xBBC300009201F000L,0x000000006FEFB181L});
    public static final BitSet FOLLOW_END_in_while_loop_statement3274 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3276 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3307 = new BitSet(new long[]{0xFFFF7FFFFBC5EFF2L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3347 = new BitSet(new long[]{0xFFFF7FFFFBCFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3349 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3392 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3396 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3398 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_AND_in_and_expr3422 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_in_not_expr3444 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3464 = new BitSet(new long[]{0x0000000000000002L,0x0000001F80000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3468 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3514 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3518 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3520 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3542 = new BitSet(new long[]{0x0000000008000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3546 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3549 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3571 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_NOT_in_between_expr3575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3578 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_AND_in_between_expr3582 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3604 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_NOT_in_in_expr3608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IN_in_in_expr3611 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr3613 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3615 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_in_expr3619 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3621 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3663 = new BitSet(new long[]{0x0000000000000002L,0x000001C000000000L});
    public static final BitSet FOLLOW_set_in_add_expr3667 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3681 = new BitSet(new long[]{0x0000000000000002L,0x000001C000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3701 = new BitSet(new long[]{0x0000000000004802L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr3707 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr3711 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr3715 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3719 = new BitSet(new long[]{0x0000000000004802L,0x0000020000000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr3739 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3767 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr3771 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom3793 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom3797 = new BitSet(new long[]{0x0000000000004000L,0x0000700000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom3810 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3812 = new BitSet(new long[]{0x0000000000004000L,0x0000700000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3854 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_atom3856 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3879 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3883 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call3885 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call3892 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute3915 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_attribute3917 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_attribute3919 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args3970 = new BitSet(new long[]{0x00400000180A4000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3974 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_call_args3978 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args3980 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_call_args3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists4122 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists4124 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists4126 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists4128 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists4130 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate4157 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate4161 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate4163 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter4195 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter4197 = new BitSet(new long[]{0x0040000018024000L,0x00EF88C000000000L});
    public static final BitSet FOLLOW_expression_in_parameter4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package4240 = new BitSet(new long[]{0x0008000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package4244 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package4246 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package4251 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_package4257 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package4259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_package4266 = new BitSet(new long[]{0x0000800004000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4278 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_set_in_create_package4291 = new BitSet(new long[]{0x000200008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_create_package4303 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_create_package4308 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ID_in_create_package4312 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_create_package4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4338 = new BitSet(new long[]{0x0008000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package_body4342 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4344 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4349 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4357 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4366 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_set_in_create_package_body4376 = new BitSet(new long[]{0x000300008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4388 = new BitSet(new long[]{0x000300008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_create_package_body4405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_create_package_body4409 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4451 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_OR_in_create_procedure4455 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4462 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4468 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4477 = new BitSet(new long[]{0x0000800004020000L,0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_procedure4489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4491 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_create_procedure4495 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4497 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_create_procedure4502 = new BitSet(new long[]{0x0000800004000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4515 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_set_in_create_procedure4526 = new BitSet(new long[]{0x000100008200F000L,0x8800000000010000L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4546 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_create_procedure4549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure4561 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure4573 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function4606 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_OR_in_create_function4610 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function4612 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function4617 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_function4623 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_function4625 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_create_function4632 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_LPAREN_in_create_function4644 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4646 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_create_function4650 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4652 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RPAREN_in_create_function4657 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RETURN_in_create_function4670 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_datatype_in_create_function4672 = new BitSet(new long[]{0x0000800004000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function4682 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_set_in_create_function4693 = new BitSet(new long[]{0x000100008200F000L,0x8800000000010000L});
    public static final BitSet FOLLOW_declare_section_in_create_function4713 = new BitSet(new long[]{0x000100008200F000L,0x0000000000010000L});
    public static final BitSet FOLLOW_body_in_create_function4716 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_call_spec_in_create_function4728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function4740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_create_function4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause4773 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec4800 = new BitSet(new long[]{0xFFFFFFFFFFFFEFF0L,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES4925 = new BitSet(new long[]{0x0000000000000002L});

}