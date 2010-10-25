// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g 2010-10-25 11:48:01

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PLSQLTreeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROC", "DECL", "PROC_CALL", "DEFCURSOR", "PARAMS", "PARAM", "BODY", "VARDECL", "PROCNAME", "PACKCALL", "STRING", "PACKNAME", "PACK", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "IN", "OUT", "NOCOPY", "ASSIGN", "DEFAULT", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "SUBTYPE", "RECORD", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "AS", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "A", "N", "D", "R", "Y", "S", "U", "T", "H", "I", "B", "E", "W", "O", "L", "K", "C", "M", "F", "X", "G", "P", "V", "Q", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "NUM", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT", "J", "Z"
    };
    public static final int PACKAGE=128;
    public static final int FUNCTION=21;
    public static final int EXTERNAL=129;
    public static final int EXPONENT=112;
    public static final int WHILE=100;
    public static final int DETERMINISTIC=49;
    public static final int VARYING=39;
    public static final int CASE=63;
    public static final int DEFCURSOR=7;
    public static final int PARAM=9;
    public static final int DOUBLEDOT=79;
    public static final int NOT=33;
    public static final int SUBTYPE=37;
    public static final int EOF=-1;
    public static final int SQL=113;
    public static final int RPAREN=25;
    public static final int CREATE=127;
    public static final int INSERT=92;
    public static final int USING=75;
    public static final int RETURNING=76;
    public static final int BEGIN=54;
    public static final int LOOP=62;
    public static final int SAVEPOINT=95;
    public static final int RETURN=22;
    public static final int BODY=10;
    public static final int RAISE=87;
    public static final int GEQ=106;
    public static final int EQ=101;
    public static final int GOTO=82;
    public static final int SELECT=96;
    public static final int ISOPEN=115;
    public static final int INTO=72;
    public static final int ARRAY=40;
    public static final int DIVIDE=17;
    public static final int EXCEPTION=36;
    public static final int RBRACK=161;
    public static final int D=136;
    public static final int EXIT=69;
    public static final int E=145;
    public static final int F=152;
    public static final int G=154;
    public static final int RECORD=38;
    public static final int A=134;
    public static final int B=144;
    public static final int C=150;
    public static final int L=148;
    public static final int M=151;
    public static final int N=135;
    public static final int O=147;
    public static final int TRANSACTION=98;
    public static final int H=142;
    public static final int I=143;
    public static final int NULL=34;
    public static final int J=169;
    public static final int ELSE=64;
    public static final int K=149;
    public static final int U=140;
    public static final int T=141;
    public static final int AT_SIGN=160;
    public static final int W=146;
    public static final int V=156;
    public static final int DEFINER=132;
    public static final int Q=157;
    public static final int P=155;
    public static final int DELETE=61;
    public static final int S=139;
    public static final int DOUBLEVERTBAR=110;
    public static final int R=137;
    public static final int ROLLBACK=94;
    public static final int Y=138;
    public static final int X=153;
    public static final int AUTHID=130;
    public static final int Z=170;
    public static final int NOCOPY=28;
    public static final int WS=166;
    public static final int LANGUAGE=133;
    public static final int FETCH=70;
    public static final int OUT=27;
    public static final int REAL_NUMBER=118;
    public static final int PIPELINED=50;
    public static final int SL_COMMENT=167;
    public static final int OR=57;
    public static final int CONSTANT=35;
    public static final int PROCNAME=12;
    public static final int ELSIF=84;
    public static final int END=55;
    public static final int FALSE=120;
    public static final int COLLECT=74;
    public static final int CURSOR=31;
    public static final int PACK=16;
    public static final int OTHERS=58;
    public static final int LBRACK=162;
    public static final int PROC_CALL=6;
    public static final int POINT=159;
    public static final int CURRENT_USER=131;
    public static final int LIMIT=71;
    public static final int EXECUTE=67;
    public static final int INSERTING=123;
    public static final int GTH=105;
    public static final int NOTFOUND=116;
    public static final int PRAGMA=86;
    public static final int RESULT_CACHE=52;
    public static final int UPDATE=99;
    public static final int TABLE=42;
    public static final int LLABEL=89;
    public static final int FOR=77;
    public static final int VARDECL=11;
    public static final int ID=20;
    public static final int AND=81;
    public static final int ASTERISK=111;
    public static final int LOCK=93;
    public static final int LPAREN=23;
    public static final int UPDATING=124;
    public static final int IF=83;
    public static final int RLABEL=90;
    public static final int ML_COMMENT=168;
    public static final int INDEX=43;
    public static final int PACKNAME=15;
    public static final int AS=53;
    public static final int ROWTYPE=48;
    public static final int IN=26;
    public static final int THEN=59;
    public static final int CONTINUE=66;
    public static final int COMMA=24;
    public static final int IS=32;
    public static final int PROC=4;
    public static final int QUOTED_STRING=121;
    public static final int PLUS=109;
    public static final int EXISTS=122;
    public static final int DOT=46;
    public static final int LIKE=107;
    public static final int PARAMS=8;
    public static final int INTEGER=117;
    public static final int VARRAY=41;
    public static final int BY=44;
    public static final int PACKCALL=13;
    public static final int PERCENT=47;
    public static final int PARALLEL_ENABLE=51;
    public static final int DOUBLEQUOTED_STRING=158;
    public static final int DEFAULT=30;
    public static final int FORALL=78;
    public static final int SET=97;
    public static final int MINUS=108;
    public static final int TRUE=119;
    public static final int SEMI=18;
    public static final int PROCEDURE=19;
    public static final int NUM=164;
    public static final int NOT_EQ=102;
    public static final int REF=45;
    public static final int VERTBAR=163;
    public static final int LTH=103;
    public static final int COLON=60;
    public static final int OPEN=85;
    public static final int BULK_ROWCOUNT=114;
    public static final int COMMIT=91;
    public static final int CLOSE=65;
    public static final int WHEN=56;
    public static final int DECL=5;
    public static final int ASSIGN=29;
    public static final int NUMBER_VALUE=165;
    public static final int IMMEDIATE=68;
    public static final int ARROW=126;
    public static final int DECLARE=88;
    public static final int DELETING=125;
    public static final int BULK=73;
    public static final int BETWEEN=80;
    public static final int STRING=14;
    public static final int LEQ=104;

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
    public String getGrammarFileName() { return "/home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g"; }



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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:94:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
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
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file162);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:23: ( DIVIDE show_errors )?
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
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:25: DIVIDE show_errors
            	            {
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file166); 
            	            DIVIDE2_tree = (Object)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file168);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }

            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:47: ( DIVIDE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:95:47: DIVIDE
            	            {
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file173); 
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

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file179); 
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:98:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQLTreeParser.show_errors_return show_errors() throws RecognitionException {
        PLSQLTreeParser.show_errors_return retval = new PLSQLTreeParser.show_errors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI8=null;
        PLSQLTreeParser.kSHOW_return kSHOW6 = null;

        PLSQLTreeParser.kERRORS_return kERRORS7 = null;


        Object SEMI8_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:99:5: ( kSHOW kERRORS ( SEMI )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:99:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kSHOW_in_show_errors200);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            pushFollow(FOLLOW_kERRORS_in_show_errors202);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:99:21: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:99:21: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors204); 
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:102:1: create_object : ( create_package | create_package_body | create_function | create_procedure );
    public final PLSQLTreeParser.create_object_return create_object() throws RecognitionException {
        PLSQLTreeParser.create_object_return retval = new PLSQLTreeParser.create_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.create_package_return create_package9 = null;

        PLSQLTreeParser.create_package_body_return create_package_body10 = null;

        PLSQLTreeParser.create_function_return create_function11 = null;

        PLSQLTreeParser.create_procedure_return create_procedure12 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:103:5: ( create_package | create_package_body | create_function | create_procedure )
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
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==BODY) ) {
                                alt5=2;
                            }
                            else if ( (LA5_4==ID) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

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
                case FUNCTION:
                    {
                    alt5=3;
                    }
                    break;
                case PACKAGE:
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==BODY) ) {
                        alt5=2;
                    }
                    else if ( (LA5_4==ID) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:103:7: create_package
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_in_create_object222);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:7: create_package_body
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_body_in_create_object230);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:105:7: create_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_function_in_create_object238);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:106:7: create_procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_procedure_in_create_object246);
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:109:1: procedure_heading : PROCEDURE procedure_nam ( parameter_declarations )? ;
    public final PLSQLTreeParser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQLTreeParser.procedure_heading_return retval = new PLSQLTreeParser.procedure_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE13=null;
        PLSQLTreeParser.procedure_nam_return procedure_nam14 = null;

        PLSQLTreeParser.parameter_declarations_return parameter_declarations15 = null;


        Object PROCEDURE13_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:109:19: ( PROCEDURE procedure_nam ( parameter_declarations )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:110:9: PROCEDURE procedure_nam ( parameter_declarations )?
            {
            root_0 = (Object)adaptor.nil();

            PROCEDURE13=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading267); 
            PROCEDURE13_tree = (Object)adaptor.create(PROCEDURE13);
            adaptor.addChild(root_0, PROCEDURE13_tree);

            pushFollow(FOLLOW_procedure_nam_in_procedure_heading269);
            procedure_nam14=procedure_nam();

            state._fsp--;

            adaptor.addChild(root_0, procedure_nam14.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:110:33: ( parameter_declarations )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:110:33: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading271);
                    parameter_declarations15=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations15.getTree());

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
    // $ANTLR end "procedure_heading"

    public static class procedure_nam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_nam"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:113:1: procedure_nam : ID -> ^( PROCNAME ID ) ;
    public final PLSQLTreeParser.procedure_nam_return procedure_nam() throws RecognitionException {
        PLSQLTreeParser.procedure_nam_return retval = new PLSQLTreeParser.procedure_nam_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID16=null;

        Object ID16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:114:2: ( ID -> ^( PROCNAME ID ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:115:2: ID
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_procedure_nam289);  
            stream_ID.add(ID16);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:5: -> ^( PROCNAME ID )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:115:8: ^( PROCNAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCNAME, "PROCNAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

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
    // $ANTLR end "procedure_nam"

    public static class function_heading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_heading"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:1: function_heading : FUNCTION ID ( parameter_declarations )? RETURN datatype ;
    public final PLSQLTreeParser.function_heading_return function_heading() throws RecognitionException {
        PLSQLTreeParser.function_heading_return retval = new PLSQLTreeParser.function_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION17=null;
        Token ID18=null;
        Token RETURN20=null;
        PLSQLTreeParser.parameter_declarations_return parameter_declarations19 = null;

        PLSQLTreeParser.datatype_return datatype21 = null;


        Object FUNCTION17_tree=null;
        Object ID18_tree=null;
        Object RETURN20_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:118:18: ( FUNCTION ID ( parameter_declarations )? RETURN datatype )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:119:9: FUNCTION ID ( parameter_declarations )? RETURN datatype
            {
            root_0 = (Object)adaptor.nil();

            FUNCTION17=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading316); 
            FUNCTION17_tree = (Object)adaptor.create(FUNCTION17);
            adaptor.addChild(root_0, FUNCTION17_tree);

            ID18=(Token)match(input,ID,FOLLOW_ID_in_function_heading318); 
            ID18_tree = (Object)adaptor.create(ID18);
            adaptor.addChild(root_0, ID18_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:119:21: ( parameter_declarations )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:119:21: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading320);
                    parameter_declarations19=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations19.getTree());

                    }
                    break;

            }

            RETURN20=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading323); 
            RETURN20_tree = (Object)adaptor.create(RETURN20);
            adaptor.addChild(root_0, RETURN20_tree);

            pushFollow(FOLLOW_datatype_in_function_heading325);
            datatype21=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype21.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:1: parameter_declarations : ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) ;
    public final PLSQLTreeParser.parameter_declarations_return parameter_declarations() throws RecognitionException {
        PLSQLTreeParser.parameter_declarations_return retval = new PLSQLTreeParser.parameter_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN22=null;
        Token COMMA24=null;
        Token RPAREN26=null;
        PLSQLTreeParser.parameter_declaration_return parameter_declaration23 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration25 = null;


        Object LPAREN22_tree=null;
        Object COMMA24_tree=null;
        Object RPAREN26_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:24: ( ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:13: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
            {
            LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations350);  
            stream_LPAREN.add(LPAREN22);

            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations353);
            parameter_declaration23=parameter_declaration();

            state._fsp--;

            stream_parameter_declaration.add(parameter_declaration23.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:43: ( COMMA parameter_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:123:45: COMMA parameter_declaration
            	    {
            	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations357);  
            	    stream_COMMA.add(COMMA24);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations360);
            	    parameter_declaration25=parameter_declaration();

            	    state._fsp--;

            	    stream_parameter_declaration.add(parameter_declaration25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations365);  
            stream_RPAREN.add(RPAREN26);


            }



            // AST REWRITE
            // elements: parameter_declaration, LPAREN, COMMA, RPAREN, parameter_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:9: -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:124:12: ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                adaptor.addChild(root_1, stream_LPAREN.nextNode());
                adaptor.addChild(root_1, stream_parameter_declaration.nextTree());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:124:51: ( COMMA parameter_declaration )*
                while ( stream_COMMA.hasNext()||stream_parameter_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_COMMA.nextNode());
                    adaptor.addChild(root_1, stream_parameter_declaration.nextTree());

                }
                stream_COMMA.reset();
                stream_parameter_declaration.reset();
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:127:1: parameter_declaration : parameter_declaration_spec -> ^( PARAM parameter_declaration_spec ) ;
    public final PLSQLTreeParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQLTreeParser.parameter_declaration_return retval = new PLSQLTreeParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.parameter_declaration_spec_return parameter_declaration_spec27 = null;


        RewriteRuleSubtreeStream stream_parameter_declaration_spec=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration_spec");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:127:23: ( parameter_declaration_spec -> ^( PARAM parameter_declaration_spec ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:128:8: parameter_declaration_spec
            {
            pushFollow(FOLLOW_parameter_declaration_spec_in_parameter_declaration419);
            parameter_declaration_spec27=parameter_declaration_spec();

            state._fsp--;

            stream_parameter_declaration_spec.add(parameter_declaration_spec27.getTree());


            // AST REWRITE
            // elements: parameter_declaration_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:35: -> ^( PARAM parameter_declaration_spec )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:128:38: ^( PARAM parameter_declaration_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_parameter_declaration_spec.nextTree());

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

    public static class parameter_declaration_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration_spec"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:131:1: parameter_declaration_spec : ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLTreeParser.parameter_declaration_spec_return parameter_declaration_spec() throws RecognitionException {
        PLSQLTreeParser.parameter_declaration_spec_return retval = new PLSQLTreeParser.parameter_declaration_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID28=null;
        Token IN29=null;
        Token OUT30=null;
        Token IN31=null;
        Token OUT32=null;
        Token NOCOPY33=null;
        Token set35=null;
        PLSQLTreeParser.datatype_return datatype34 = null;

        PLSQLTreeParser.expression_return expression36 = null;


        Object ID28_tree=null;
        Object IN29_tree=null;
        Object OUT30_tree=null;
        Object IN31_tree=null;
        Object OUT32_tree=null;
        Object NOCOPY33_tree=null;
        Object set35_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:2: ( ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:5: ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID28=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration_spec449); 
            ID28_tree = (Object)adaptor.create(ID28);
            adaptor.addChild(root_0, ID28_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:8: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:10: IN
                    {
                    IN29=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration_spec453); 
                    IN29_tree = (Object)adaptor.create(IN29);
                    adaptor.addChild(root_0, IN29_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:15: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:15: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:17: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:17: ( OUT | IN OUT )
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
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:19: OUT
                            {
                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration_spec461); 
                            OUT30_tree = (Object)adaptor.create(OUT30);
                            adaptor.addChild(root_0, OUT30_tree);


                            }
                            break;
                        case 2 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:25: IN OUT
                            {
                            IN31=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration_spec465); 
                            IN31_tree = (Object)adaptor.create(IN31);
                            adaptor.addChild(root_0, IN31_tree);

                            OUT32=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration_spec467); 
                            OUT32_tree = (Object)adaptor.create(OUT32);
                            adaptor.addChild(root_0, OUT32_tree);


                            }
                            break;

                    }

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:34: ( NOCOPY )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOCOPY) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:132:34: NOCOPY
                            {
                            NOCOPY33=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_parameter_declaration_spec471); 
                            NOCOPY33_tree = (Object)adaptor.create(NOCOPY33);
                            adaptor.addChild(root_0, NOCOPY33_tree);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_parameter_declaration_spec479);
            datatype34=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype34.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ASSIGN && LA12_0<=DEFAULT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:11: ( ASSIGN | DEFAULT ) expression
                    {
                    set35=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set35));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_parameter_declaration_spec501);
                    expression36=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression36.getTree());

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
    // $ANTLR end "parameter_declaration_spec"

    public static class declare_section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:135:1: declare_section : ( declare_section_items )+ -> ^( DECL ( declare_section_items )+ ) ;
    public final PLSQLTreeParser.declare_section_return declare_section() throws RecognitionException {
        PLSQLTreeParser.declare_section_return retval = new PLSQLTreeParser.declare_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.declare_section_items_return declare_section_items37 = null;


        RewriteRuleSubtreeStream stream_declare_section_items=new RewriteRuleSubtreeStream(adaptor,"rule declare_section_items");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:135:17: ( ( declare_section_items )+ -> ^( DECL ( declare_section_items )+ ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:136:5: ( declare_section_items )+
            {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:136:5: ( declare_section_items )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=PROCEDURE && LA13_0<=FUNCTION)||LA13_0==CURSOR||LA13_0==SUBTYPE||LA13_0==PRAGMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:137:5: declare_section_items
            	    {
            	    pushFollow(FOLLOW_declare_section_items_in_declare_section524);
            	    declare_section_items37=declare_section_items();

            	    state._fsp--;

            	    stream_declare_section_items.add(declare_section_items37.getTree());

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



            // AST REWRITE
            // elements: declare_section_items
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:8: -> ^( DECL ( declare_section_items )+ )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:138:11: ^( DECL ( declare_section_items )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

                if ( !(stream_declare_section_items.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declare_section_items.hasNext() ) {
                    adaptor.addChild(root_1, stream_declare_section_items.nextTree());

                }
                stream_declare_section_items.reset();

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
    // $ANTLR end "declare_section"

    public static class declare_section_items_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section_items"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:141:1: declare_section_items : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI );
    public final PLSQLTreeParser.declare_section_items_return declare_section_items() throws RecognitionException {
        PLSQLTreeParser.declare_section_items_return retval = new PLSQLTreeParser.declare_section_items_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI39=null;
        Token SEMI41=null;
        Token SEMI43=null;
        Token SEMI45=null;
        Token SEMI47=null;
        Token SEMI49=null;
        Token SEMI51=null;
        PLSQLTreeParser.type_definition_return type_definition38 = null;

        PLSQLTreeParser.subtype_definition_return subtype_definition40 = null;

        PLSQLTreeParser.cursor_definition_return cursor_definition42 = null;

        PLSQLTreeParser.item_declaration_return item_declaration44 = null;

        PLSQLTreeParser.function_declaration_or_definition_return function_declaration_or_definition46 = null;

        PLSQLTreeParser.procedure_declaration_or_definition_return procedure_declaration_or_definition48 = null;

        PLSQLTreeParser.pragma_return pragma50 = null;


        Object SEMI39_tree=null;
        Object SEMI41_tree=null;
        Object SEMI43_tree=null;
        Object SEMI45_tree=null;
        Object SEMI47_tree=null;
        Object SEMI49_tree=null;
        Object SEMI51_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:141:23: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:142:5: type_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_definition_in_declare_section_items563);
                    type_definition38=type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, type_definition38.getTree());
                    SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items565); 
                    SEMI39_tree = (Object)adaptor.create(SEMI39);
                    adaptor.addChild(root_0, SEMI39_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:7: subtype_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subtype_definition_in_declare_section_items574);
                    subtype_definition40=subtype_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, subtype_definition40.getTree());
                    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items576); 
                    SEMI41_tree = (Object)adaptor.create(SEMI41);
                    adaptor.addChild(root_0, SEMI41_tree);


                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:144:7: cursor_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cursor_definition_in_declare_section_items585);
                    cursor_definition42=cursor_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, cursor_definition42.getTree());
                    SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items587); 
                    SEMI43_tree = (Object)adaptor.create(SEMI43);
                    adaptor.addChild(root_0, SEMI43_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:145:7: item_declaration SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_item_declaration_in_declare_section_items596);
                    item_declaration44=item_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, item_declaration44.getTree());
                    SEMI45=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items598); 
                    SEMI45_tree = (Object)adaptor.create(SEMI45);
                    adaptor.addChild(root_0, SEMI45_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:146:7: function_declaration_or_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section_items607);
                    function_declaration_or_definition46=function_declaration_or_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_or_definition46.getTree());
                    SEMI47=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items609); 
                    SEMI47_tree = (Object)adaptor.create(SEMI47);
                    adaptor.addChild(root_0, SEMI47_tree);


                    }
                    break;
                case 6 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:147:7: procedure_declaration_or_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section_items618);
                    procedure_declaration_or_definition48=procedure_declaration_or_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, procedure_declaration_or_definition48.getTree());
                    SEMI49=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items620); 
                    SEMI49_tree = (Object)adaptor.create(SEMI49);
                    adaptor.addChild(root_0, SEMI49_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:148:7: pragma SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_in_declare_section_items629);
                    pragma50=pragma();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma50.getTree());
                    SEMI51=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items631); 
                    SEMI51_tree = (Object)adaptor.create(SEMI51);
                    adaptor.addChild(root_0, SEMI51_tree);


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
    // $ANTLR end "declare_section_items"

    public static class cursor_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor_definition"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:151:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) ;
    public final PLSQLTreeParser.cursor_definition_return cursor_definition() throws RecognitionException {
        PLSQLTreeParser.cursor_definition_return retval = new PLSQLTreeParser.cursor_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CURSOR52=null;
        Token ID53=null;
        Token IS55=null;
        PLSQLTreeParser.parameter_declarations_return parameter_declarations54 = null;

        PLSQLTreeParser.select_statement_return select_statement56 = null;


        Object CURSOR52_tree=null;
        Object ID53_tree=null;
        Object IS55_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        RewriteRuleSubtreeStream stream_select_statement=new RewriteRuleSubtreeStream(adaptor,"rule select_statement");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:151:19: ( CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:152:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            CURSOR52=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition651);  
            stream_CURSOR.add(CURSOR52);

            ID53=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition653);  
            stream_ID.add(ID53);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:152:19: ( parameter_declarations )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LPAREN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:152:19: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition655);
                    parameter_declarations54=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(parameter_declarations54.getTree());

                    }
                    break;

            }

            IS55=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition658);  
            stream_IS.add(IS55);

            pushFollow(FOLLOW_select_statement_in_cursor_definition660);
            select_statement56=select_statement();

            state._fsp--;

            stream_select_statement.add(select_statement56.getTree());


            // AST REWRITE
            // elements: ID, parameter_declarations, select_statement, CURSOR, IS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:63: -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:152:66: ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFCURSOR, "DEFCURSOR"), root_1);

                adaptor.addChild(root_1, stream_CURSOR.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:152:88: ( parameter_declarations )?
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:1: item_declaration : item_declaration_items -> ^( VARDECL item_declaration_items ) ;
    public final PLSQLTreeParser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQLTreeParser.item_declaration_return retval = new PLSQLTreeParser.item_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.item_declaration_items_return item_declaration_items57 = null;


        RewriteRuleSubtreeStream stream_item_declaration_items=new RewriteRuleSubtreeStream(adaptor,"rule item_declaration_items");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:156:5: ( item_declaration_items -> ^( VARDECL item_declaration_items ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:157:5: item_declaration_items
            {
            pushFollow(FOLLOW_item_declaration_items_in_item_declaration699);
            item_declaration_items57=item_declaration_items();

            state._fsp--;

            stream_item_declaration_items.add(item_declaration_items57.getTree());


            // AST REWRITE
            // elements: item_declaration_items
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 157:28: -> ^( VARDECL item_declaration_items )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:157:30: ^( VARDECL item_declaration_items )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                adaptor.addChild(root_1, stream_item_declaration_items.nextTree());

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
    // $ANTLR end "item_declaration"

    public static class item_declaration_items_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_declaration_items"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:160:1: item_declaration_items : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQLTreeParser.item_declaration_items_return item_declaration_items() throws RecognitionException {
        PLSQLTreeParser.item_declaration_items_return retval = new PLSQLTreeParser.item_declaration_items_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.variable_declaration_return variable_declaration58 = null;

        PLSQLTreeParser.constant_declaration_return constant_declaration59 = null;

        PLSQLTreeParser.exception_declaration_return exception_declaration60 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:161:2: ( variable_declaration | constant_declaration | exception_declaration )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:162:2: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_item_declaration_items722);
                    variable_declaration58=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration58.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:163:7: constant_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_declaration_in_item_declaration_items730);
                    constant_declaration59=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration59.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:164:7: exception_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exception_declaration_in_item_declaration_items738);
                    exception_declaration60=exception_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, exception_declaration60.getTree());

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
    // $ANTLR end "item_declaration_items"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLTreeParser.variable_declaration_return variable_declaration() throws RecognitionException {
        PLSQLTreeParser.variable_declaration_return retval = new PLSQLTreeParser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID61=null;
        Token NOT63=null;
        Token NULL64=null;
        Token set65=null;
        PLSQLTreeParser.datatype_return datatype62 = null;

        PLSQLTreeParser.expression_return expression66 = null;


        Object ID61_tree=null;
        Object NOT63_tree=null;
        Object NULL64_tree=null;
        Object set65_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:167:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:168:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID61=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration756); 
            ID61_tree = (Object)adaptor.create(ID61);
            adaptor.addChild(root_0, ID61_tree);

            pushFollow(FOLLOW_datatype_in_variable_declaration758);
            datatype62=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype62.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:168:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ASSIGN && LA18_0<=DEFAULT)||LA18_0==NOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:168:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:168:24: ( NOT NULL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:168:27: NOT NULL
                            {
                            NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration766); 
                            NOT63_tree = (Object)adaptor.create(NOT63);
                            adaptor.addChild(root_0, NOT63_tree);

                            NULL64=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration768); 
                            NULL64_tree = (Object)adaptor.create(NULL64);
                            adaptor.addChild(root_0, NULL64_tree);


                            }
                            break;

                    }

                    set65=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set65));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_variable_declaration785);
                    expression66=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression66.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:171:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
    public final PLSQLTreeParser.constant_declaration_return constant_declaration() throws RecognitionException {
        PLSQLTreeParser.constant_declaration_return retval = new PLSQLTreeParser.constant_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID67=null;
        Token CONSTANT68=null;
        Token NOT70=null;
        Token NULL71=null;
        Token set72=null;
        PLSQLTreeParser.datatype_return datatype69 = null;

        PLSQLTreeParser.expression_return expression73 = null;


        Object ID67_tree=null;
        Object CONSTANT68_tree=null;
        Object NOT70_tree=null;
        Object NULL71_tree=null;
        Object set72_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:171:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:172:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (Object)adaptor.nil();

            ID67=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration810); 
            ID67_tree = (Object)adaptor.create(ID67);
            adaptor.addChild(root_0, ID67_tree);

            CONSTANT68=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration812); 
            CONSTANT68_tree = (Object)adaptor.create(CONSTANT68);
            adaptor.addChild(root_0, CONSTANT68_tree);

            pushFollow(FOLLOW_datatype_in_constant_declaration814);
            datatype69=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype69.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:172:30: ( NOT NULL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:172:32: NOT NULL
                    {
                    NOT70=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration818); 
                    NOT70_tree = (Object)adaptor.create(NOT70);
                    adaptor.addChild(root_0, NOT70_tree);

                    NULL71=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration820); 
                    NULL71_tree = (Object)adaptor.create(NULL71);
                    adaptor.addChild(root_0, NULL71_tree);


                    }
                    break;

            }

            set72=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set72));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_expression_in_constant_declaration839);
            expression73=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression73.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:175:1: exception_declaration : ID EXCEPTION ;
    public final PLSQLTreeParser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQLTreeParser.exception_declaration_return retval = new PLSQLTreeParser.exception_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID74=null;
        Token EXCEPTION75=null;

        Object ID74_tree=null;
        Object EXCEPTION75_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:175:23: ( ID EXCEPTION )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:176:9: ID EXCEPTION
            {
            root_0 = (Object)adaptor.nil();

            ID74=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration860); 
            ID74_tree = (Object)adaptor.create(ID74);
            adaptor.addChild(root_0, ID74_tree);

            EXCEPTION75=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration862); 
            EXCEPTION75_tree = (Object)adaptor.create(EXCEPTION75);
            adaptor.addChild(root_0, EXCEPTION75_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:179:1: type_definition : kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) ;
    public final PLSQLTreeParser.type_definition_return type_definition() throws RecognitionException {
        PLSQLTreeParser.type_definition_return retval = new PLSQLTreeParser.type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID77=null;
        Token IS78=null;
        PLSQLTreeParser.kTYPE_return kTYPE76 = null;

        PLSQLTreeParser.record_type_definition_return record_type_definition79 = null;

        PLSQLTreeParser.collection_type_definition_return collection_type_definition80 = null;

        PLSQLTreeParser.ref_cursor_type_definition_return ref_cursor_type_definition81 = null;


        Object ID77_tree=null;
        Object IS78_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:179:17: ( kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:9: kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kTYPE_in_type_definition883);
            kTYPE76=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE76.getTree());
            ID77=(Token)match(input,ID,FOLLOW_ID_in_type_definition885); 
            ID77_tree = (Object)adaptor.create(ID77);
            adaptor.addChild(root_0, ID77_tree);

            IS78=(Token)match(input,IS,FOLLOW_IS_in_type_definition887); 
            IS78_tree = (Object)adaptor.create(IS78);
            adaptor.addChild(root_0, IS78_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:21: ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:23: record_type_definition
                    {
                    pushFollow(FOLLOW_record_type_definition_in_type_definition891);
                    record_type_definition79=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition79.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:48: collection_type_definition
                    {
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition895);
                    collection_type_definition80=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition80.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:180:77: ref_cursor_type_definition
                    {
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition899);
                    ref_cursor_type_definition81=ref_cursor_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_cursor_type_definition81.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:183:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
    public final PLSQLTreeParser.subtype_definition_return subtype_definition() throws RecognitionException {
        PLSQLTreeParser.subtype_definition_return retval = new PLSQLTreeParser.subtype_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUBTYPE82=null;
        Token ID83=null;
        Token IS84=null;
        Token NOT86=null;
        Token NULL87=null;
        PLSQLTreeParser.datatype_return datatype85 = null;


        Object SUBTYPE82_tree=null;
        Object ID83_tree=null;
        Object IS84_tree=null;
        Object NOT86_tree=null;
        Object NULL87_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:183:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:184:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            SUBTYPE82=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition922); 
            SUBTYPE82_tree = (Object)adaptor.create(SUBTYPE82);
            adaptor.addChild(root_0, SUBTYPE82_tree);

            ID83=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition924); 
            ID83_tree = (Object)adaptor.create(ID83);
            adaptor.addChild(root_0, ID83_tree);

            IS84=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition926); 
            IS84_tree = (Object)adaptor.create(IS84);
            adaptor.addChild(root_0, IS84_tree);

            pushFollow(FOLLOW_datatype_in_subtype_definition928);
            datatype85=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype85.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:184:32: ( NOT NULL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:184:34: NOT NULL
                    {
                    NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition932); 
                    NOT86_tree = (Object)adaptor.create(NOT86);
                    adaptor.addChild(root_0, NOT86_tree);

                    NULL87=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition934); 
                    NULL87_tree = (Object)adaptor.create(NULL87);
                    adaptor.addChild(root_0, NULL87_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:187:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
    public final PLSQLTreeParser.record_type_definition_return record_type_definition() throws RecognitionException {
        PLSQLTreeParser.record_type_definition_return retval = new PLSQLTreeParser.record_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECORD88=null;
        Token LPAREN89=null;
        Token COMMA91=null;
        Token RPAREN93=null;
        PLSQLTreeParser.record_field_declaration_return record_field_declaration90 = null;

        PLSQLTreeParser.record_field_declaration_return record_field_declaration92 = null;


        Object RECORD88_tree=null;
        Object LPAREN89_tree=null;
        Object COMMA91_tree=null;
        Object RPAREN93_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:187:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RECORD88=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition955); 
            RECORD88_tree = (Object)adaptor.create(RECORD88);
            adaptor.addChild(root_0, RECORD88_tree);

            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition957); 
            LPAREN89_tree = (Object)adaptor.create(LPAREN89);
            adaptor.addChild(root_0, LPAREN89_tree);

            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition959);
            record_field_declaration90=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration90.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:41: ( COMMA record_field_declaration )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:188:43: COMMA record_field_declaration
            	    {
            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition963); 
            	    COMMA91_tree = (Object)adaptor.create(COMMA91);
            	    adaptor.addChild(root_0, COMMA91_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition965);
            	    record_field_declaration92=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration92.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition970); 
            RPAREN93_tree = (Object)adaptor.create(RPAREN93);
            adaptor.addChild(root_0, RPAREN93_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:191:1: record_field_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQLTreeParser.record_field_declaration_return record_field_declaration() throws RecognitionException {
        PLSQLTreeParser.record_field_declaration_return retval = new PLSQLTreeParser.record_field_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID94=null;
        Token NOT96=null;
        Token NULL97=null;
        Token set98=null;
        PLSQLTreeParser.datatype_return datatype95 = null;

        PLSQLTreeParser.expression_return expression99 = null;


        Object ID94_tree=null;
        Object NOT96_tree=null;
        Object NULL97_tree=null;
        Object set98_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:191:26: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID94=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration984); 
            ID94_tree = (Object)adaptor.create(ID94);
            adaptor.addChild(root_0, ID94_tree);

            pushFollow(FOLLOW_datatype_in_record_field_declaration986);
            datatype95=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype95.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:14: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ASSIGN && LA24_0<=DEFAULT)||LA24_0==NOT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:16: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:16: ( NOT NULL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NOT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:192:18: NOT NULL
                            {
                            NOT96=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration992); 
                            NOT96_tree = (Object)adaptor.create(NOT96);
                            adaptor.addChild(root_0, NOT96_tree);

                            NULL97=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration994); 
                            NULL97_tree = (Object)adaptor.create(NULL97);
                            adaptor.addChild(root_0, NULL97_tree);


                            }
                            break;

                    }

                    set98=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set98));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_record_field_declaration1009);
                    expression99=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression99.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:195:1: collection_type_definition : ( varray_type_definition | nested_table_type_definition );
    public final PLSQLTreeParser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQLTreeParser.collection_type_definition_return retval = new PLSQLTreeParser.collection_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.varray_type_definition_return varray_type_definition100 = null;

        PLSQLTreeParser.nested_table_type_definition_return nested_table_type_definition101 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:196:2: ( varray_type_definition | nested_table_type_definition )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:196:4: varray_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition1026);
                    varray_type_definition100=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition100.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:197:4: nested_table_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition1031);
                    nested_table_type_definition101=nested_table_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, nested_table_type_definition101.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:200:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
    public final PLSQLTreeParser.varray_type_definition_return varray_type_definition() throws RecognitionException {
        PLSQLTreeParser.varray_type_definition_return retval = new PLSQLTreeParser.varray_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARYING102=null;
        Token ARRAY103=null;
        Token VARRAY104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        Token NOT110=null;
        Token NULL111=null;
        PLSQLTreeParser.numeric_literal_return numeric_literal106 = null;

        PLSQLTreeParser.kOF_return kOF108 = null;

        PLSQLTreeParser.datatype_return datatype109 = null;


        Object VARYING102_tree=null;
        Object ARRAY103_tree=null;
        Object VARRAY104_tree=null;
        Object LPAREN105_tree=null;
        Object RPAREN107_tree=null;
        Object NOT110_tree=null;
        Object NULL111_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:4: ( VARYING ( ARRAY )? | VARRAY )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:6: VARYING ( ARRAY )?
                    {
                    VARYING102=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition1044); 
                    VARYING102_tree = (Object)adaptor.create(VARYING102);
                    adaptor.addChild(root_0, VARYING102_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:14: ( ARRAY )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ARRAY) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:14: ARRAY
                            {
                            ARRAY103=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition1046); 
                            ARRAY103_tree = (Object)adaptor.create(ARRAY103);
                            adaptor.addChild(root_0, ARRAY103_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:23: VARRAY
                    {
                    VARRAY104=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition1051); 
                    VARRAY104_tree = (Object)adaptor.create(VARRAY104);
                    adaptor.addChild(root_0, VARRAY104_tree);


                    }
                    break;

            }

            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition1055); 
            LPAREN105_tree = (Object)adaptor.create(LPAREN105);
            adaptor.addChild(root_0, LPAREN105_tree);

            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition1057);
            numeric_literal106=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal106.getTree());
            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition1059); 
            RPAREN107_tree = (Object)adaptor.create(RPAREN107);
            adaptor.addChild(root_0, RPAREN107_tree);

            pushFollow(FOLLOW_kOF_in_varray_type_definition1061);
            kOF108=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF108.getTree());
            pushFollow(FOLLOW_datatype_in_varray_type_definition1063);
            datatype109=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype109.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:75: ( NOT NULL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:201:77: NOT NULL
                    {
                    NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition1067); 
                    NOT110_tree = (Object)adaptor.create(NOT110);
                    adaptor.addChild(root_0, NOT110_tree);

                    NULL111=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition1069); 
                    NULL111_tree = (Object)adaptor.create(NULL111);
                    adaptor.addChild(root_0, NULL111_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:204:1: nested_table_type_definition : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
    public final PLSQLTreeParser.nested_table_type_definition_return nested_table_type_definition() throws RecognitionException {
        PLSQLTreeParser.nested_table_type_definition_return retval = new PLSQLTreeParser.nested_table_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TABLE112=null;
        Token NOT115=null;
        Token NULL116=null;
        Token INDEX117=null;
        Token BY118=null;
        PLSQLTreeParser.kOF_return kOF113 = null;

        PLSQLTreeParser.datatype_return datatype114 = null;

        PLSQLTreeParser.associative_index_type_return associative_index_type119 = null;


        Object TABLE112_tree=null;
        Object NOT115_tree=null;
        Object NULL116_tree=null;
        Object INDEX117_tree=null;
        Object BY118_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:2: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:4: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (Object)adaptor.nil();

            TABLE112=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition1083); 
            TABLE112_tree = (Object)adaptor.create(TABLE112);
            adaptor.addChild(root_0, TABLE112_tree);

            pushFollow(FOLLOW_kOF_in_nested_table_type_definition1085);
            kOF113=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF113.getTree());
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition1087);
            datatype114=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype114.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:23: ( NOT NULL )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:25: NOT NULL
                    {
                    NOT115=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition1091); 
                    NOT115_tree = (Object)adaptor.create(NOT115);
                    adaptor.addChild(root_0, NOT115_tree);

                    NULL116=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition1093); 
                    NULL116_tree = (Object)adaptor.create(NULL116);
                    adaptor.addChild(root_0, NULL116_tree);


                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:37: ( INDEX BY associative_index_type )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INDEX) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:205:39: INDEX BY associative_index_type
                    {
                    INDEX117=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition1100); 
                    INDEX117_tree = (Object)adaptor.create(INDEX117);
                    adaptor.addChild(root_0, INDEX117_tree);

                    BY118=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition1102); 
                    BY118_tree = (Object)adaptor.create(BY118);
                    adaptor.addChild(root_0, BY118_tree);

                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition1104);
                    associative_index_type119=associative_index_type();

                    state._fsp--;

                    adaptor.addChild(root_0, associative_index_type119.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:208:1: associative_index_type : datatype ;
    public final PLSQLTreeParser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQLTreeParser.associative_index_type_return retval = new PLSQLTreeParser.associative_index_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.datatype_return datatype120 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:209:2: ( datatype )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:209:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_associative_index_type1118);
            datatype120=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype120.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:212:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
    public final PLSQLTreeParser.ref_cursor_type_definition_return ref_cursor_type_definition() throws RecognitionException {
        PLSQLTreeParser.ref_cursor_type_definition_return retval = new PLSQLTreeParser.ref_cursor_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF121=null;
        Token CURSOR122=null;
        Token RETURN123=null;
        PLSQLTreeParser.datatype_return datatype124 = null;


        Object REF121_tree=null;
        Object CURSOR122_tree=null;
        Object RETURN123_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:213:2: ( REF CURSOR ( RETURN datatype )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:213:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (Object)adaptor.nil();

            REF121=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition1129); 
            REF121_tree = (Object)adaptor.create(REF121);
            adaptor.addChild(root_0, REF121_tree);

            CURSOR122=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition1131); 
            CURSOR122_tree = (Object)adaptor.create(CURSOR122);
            adaptor.addChild(root_0, CURSOR122_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:213:15: ( RETURN datatype )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RETURN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:213:17: RETURN datatype
                    {
                    RETURN123=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition1135); 
                    RETURN123_tree = (Object)adaptor.create(RETURN123);
                    adaptor.addChild(root_0, RETURN123_tree);

                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition1137);
                    datatype124=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype124.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:216:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
    public final PLSQLTreeParser.datatype_return datatype() throws RecognitionException {
        PLSQLTreeParser.datatype_return retval = new PLSQLTreeParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF125=null;
        Token ID126=null;
        Token DOT127=null;
        Token ID128=null;
        Token LPAREN129=null;
        Token COMMA131=null;
        Token RPAREN133=null;
        Token PERCENT134=null;
        Token ROWTYPE136=null;
        PLSQLTreeParser.numeric_literal_return numeric_literal130 = null;

        PLSQLTreeParser.numeric_literal_return numeric_literal132 = null;

        PLSQLTreeParser.kTYPE_return kTYPE135 = null;


        Object REF125_tree=null;
        Object ID126_tree=null;
        Object DOT127_tree=null;
        Object ID128_tree=null;
        Object LPAREN129_tree=null;
        Object COMMA131_tree=null;
        Object RPAREN133_tree=null;
        Object PERCENT134_tree=null;
        Object ROWTYPE136_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:7: ( REF )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==REF) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:9: REF
                    {
                    REF125=(Token)match(input,REF,FOLLOW_REF_in_datatype1156); 
                    REF125_tree = (Object)adaptor.create(REF125);
                    adaptor.addChild(root_0, REF125_tree);


                    }
                    break;

            }

            ID126=(Token)match(input,ID,FOLLOW_ID_in_datatype1161); 
            ID126_tree = (Object)adaptor.create(ID126);
            adaptor.addChild(root_0, ID126_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:19: ( DOT ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DOT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:21: DOT ID
                    {
                    DOT127=(Token)match(input,DOT,FOLLOW_DOT_in_datatype1165); 
                    DOT127_tree = (Object)adaptor.create(DOT127);
                    adaptor.addChild(root_0, DOT127_tree);

                    ID128=(Token)match(input,ID,FOLLOW_ID_in_datatype1167); 
                    ID128_tree = (Object)adaptor.create(ID128);
                    adaptor.addChild(root_0, ID128_tree);


                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype1174); 
                    LPAREN129_tree = (Object)adaptor.create(LPAREN129);
                    adaptor.addChild(root_0, LPAREN129_tree);

                    pushFollow(FOLLOW_numeric_literal_in_datatype1176);
                    numeric_literal130=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal130.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:56: ( COMMA numeric_literal )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:58: COMMA numeric_literal
                    	    {
                    	    COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype1180); 
                    	    COMMA131_tree = (Object)adaptor.create(COMMA131);
                    	    adaptor.addChild(root_0, COMMA131_tree);

                    	    pushFollow(FOLLOW_numeric_literal_in_datatype1182);
                    	    numeric_literal132=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype1187); 
                    RPAREN133_tree = (Object)adaptor.create(RPAREN133);
                    adaptor.addChild(root_0, RPAREN133_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    PERCENT134=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype1191); 
                    PERCENT134_tree = (Object)adaptor.create(PERCENT134);
                    adaptor.addChild(root_0, PERCENT134_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:100: ( kTYPE | ROWTYPE )
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
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:102: kTYPE
                            {
                            pushFollow(FOLLOW_kTYPE_in_datatype1195);
                            kTYPE135=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE135.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:217:110: ROWTYPE
                            {
                            ROWTYPE136=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype1199); 
                            ROWTYPE136_tree = (Object)adaptor.create(ROWTYPE136);
                            adaptor.addChild(root_0, ROWTYPE136_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:220:1: function_declaration_or_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( is_as ( declare_section )? body )? ;
    public final PLSQLTreeParser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.function_declaration_or_definition_return retval = new PLSQLTreeParser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set138=null;
        PLSQLTreeParser.function_heading_return function_heading137 = null;

        PLSQLTreeParser.is_as_return is_as139 = null;

        PLSQLTreeParser.declare_section_return declare_section140 = null;

        PLSQLTreeParser.body_return body141 = null;


        Object set138_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:220:36: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( is_as ( declare_section )? body )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( is_as ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition1225);
            function_heading137=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading137.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:222:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=DETERMINISTIC && LA37_0<=RESULT_CACHE)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set138=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set138));
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

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:9: ( is_as ( declare_section )? body )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IS||LA39_0==AS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:11: is_as ( declare_section )? body
                    {
                    pushFollow(FOLLOW_is_as_in_function_declaration_or_definition1264);
                    is_as139=is_as();

                    state._fsp--;

                    adaptor.addChild(root_0, is_as139.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:17: ( declare_section )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=PROCEDURE && LA38_0<=FUNCTION)||LA38_0==CURSOR||LA38_0==SUBTYPE||LA38_0==PRAGMA) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:223:17: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1266);
                            declare_section140=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section140.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1269);
                    body141=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body141.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:226:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQLTreeParser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQLTreeParser.function_declaration_return retval = new PLSQLTreeParser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set143=null;
        PLSQLTreeParser.function_heading_return function_heading142 = null;


        Object set143_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:226:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:227:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration1290);
            function_heading142=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading142.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:228:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=DETERMINISTIC && LA40_0<=RESULT_CACHE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set143=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set143));
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:231:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* is_as ( declare_section )? body ;
    public final PLSQLTreeParser.function_definition_return function_definition() throws RecognitionException {
        PLSQLTreeParser.function_definition_return retval = new PLSQLTreeParser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        PLSQLTreeParser.function_heading_return function_heading144 = null;

        PLSQLTreeParser.is_as_return is_as146 = null;

        PLSQLTreeParser.declare_section_return declare_section147 = null;

        PLSQLTreeParser.body_return body148 = null;


        Object set145_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:231:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* is_as ( declare_section )? body )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:232:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* is_as ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_definition1338);
            function_heading144=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading144.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:233:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=DETERMINISTIC && LA41_0<=RESULT_CACHE)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            	    {
            	    set145=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set145));
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

            pushFollow(FOLLOW_is_as_in_function_definition1375);
            is_as146=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as146.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:234:15: ( declare_section )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PROCEDURE && LA42_0<=FUNCTION)||LA42_0==CURSOR||LA42_0==SUBTYPE||LA42_0==PRAGMA) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:234:15: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_function_definition1377);
                    declare_section147=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section147.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_function_definition1380);
            body148=body();

            state._fsp--;

            adaptor.addChild(root_0, body148.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:1: procedure_declaration_or_definition : procedure_heading ( is_as ( declare_section )? body )? -> ^( PROC procedure_heading ( is_as ( declare_section )? body )? ) ;
    public final PLSQLTreeParser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_or_definition_return retval = new PLSQLTreeParser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading149 = null;

        PLSQLTreeParser.is_as_return is_as150 = null;

        PLSQLTreeParser.declare_section_return declare_section151 = null;

        PLSQLTreeParser.body_return body152 = null;


        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_declare_section=new RewriteRuleSubtreeStream(adaptor,"rule declare_section");
        RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
        RewriteRuleSubtreeStream stream_is_as=new RewriteRuleSubtreeStream(adaptor,"rule is_as");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:37: ( procedure_heading ( is_as ( declare_section )? body )? -> ^( PROC procedure_heading ( is_as ( declare_section )? body )? ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:238:9: procedure_heading ( is_as ( declare_section )? body )?
            {
            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1398);
            procedure_heading149=procedure_heading();

            state._fsp--;

            stream_procedure_heading.add(procedure_heading149.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:9: ( is_as ( declare_section )? body )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IS||LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:11: is_as ( declare_section )? body
                    {
                    pushFollow(FOLLOW_is_as_in_procedure_declaration_or_definition1410);
                    is_as150=is_as();

                    state._fsp--;

                    stream_is_as.add(is_as150.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:17: ( declare_section )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=PROCEDURE && LA43_0<=FUNCTION)||LA43_0==CURSOR||LA43_0==SUBTYPE||LA43_0==PRAGMA) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:17: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1412);
                            declare_section151=declare_section();

                            state._fsp--;

                            stream_declare_section.add(declare_section151.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1415);
                    body152=body();

                    state._fsp--;

                    stream_body.add(body152.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: is_as, body, declare_section, procedure_heading
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:42: -> ^( PROC procedure_heading ( is_as ( declare_section )? body )? )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:239:45: ^( PROC procedure_heading ( is_as ( declare_section )? body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC, "PROC"), root_1);

                adaptor.addChild(root_1, stream_procedure_heading.nextTree());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:9: ( is_as ( declare_section )? body )?
                if ( stream_is_as.hasNext()||stream_body.hasNext()||stream_declare_section.hasNext() ) {
                    adaptor.addChild(root_1, stream_is_as.nextTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:17: ( declare_section )?
                    if ( stream_declare_section.hasNext() ) {
                        adaptor.addChild(root_1, stream_declare_section.nextTree());

                    }
                    stream_declare_section.reset();
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_is_as.reset();
                stream_body.reset();
                stream_declare_section.reset();

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
    // $ANTLR end "procedure_declaration_or_definition"

    public static class is_as_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "is_as"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:243:1: is_as : ( IS | AS ) ;
    public final PLSQLTreeParser.is_as_return is_as() throws RecognitionException {
        PLSQLTreeParser.is_as_return retval = new PLSQLTreeParser.is_as_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set153=null;

        Object set153_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:243:7: ( ( IS | AS ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:243:9: ( IS | AS )
            {
            root_0 = (Object)adaptor.nil();

            set153=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set153));
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
    // $ANTLR end "is_as"

    public static class procedure_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:246:1: procedure_declaration : procedure_heading ;
    public final PLSQLTreeParser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_return retval = new PLSQLTreeParser.procedure_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading154 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:246:23: ( procedure_heading )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:247:2: procedure_heading
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1478);
            procedure_heading154=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading154.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:250:1: procedure_definition : procedure_heading procedure_is_as ( declare_section )? body -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body ) ;
    public final PLSQLTreeParser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_definition_return retval = new PLSQLTreeParser.procedure_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading155 = null;

        PLSQLTreeParser.procedure_is_as_return procedure_is_as156 = null;

        PLSQLTreeParser.declare_section_return declare_section157 = null;

        PLSQLTreeParser.body_return body158 = null;


        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_procedure_is_as=new RewriteRuleSubtreeStream(adaptor,"rule procedure_is_as");
        RewriteRuleSubtreeStream stream_declare_section=new RewriteRuleSubtreeStream(adaptor,"rule declare_section");
        RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:250:22: ( procedure_heading procedure_is_as ( declare_section )? body -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:251:2: procedure_heading procedure_is_as ( declare_section )? body
            {
            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1489);
            procedure_heading155=procedure_heading();

            state._fsp--;

            stream_procedure_heading.add(procedure_heading155.getTree());
            pushFollow(FOLLOW_procedure_is_as_in_procedure_definition1492);
            procedure_is_as156=procedure_is_as();

            state._fsp--;

            stream_procedure_is_as.add(procedure_is_as156.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:252:18: ( declare_section )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=PROCEDURE && LA45_0<=FUNCTION)||LA45_0==CURSOR||LA45_0==SUBTYPE||LA45_0==PRAGMA) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:252:18: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1494);
                    declare_section157=declare_section();

                    state._fsp--;

                    stream_declare_section.add(declare_section157.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_procedure_definition1499);
            body158=body();

            state._fsp--;

            stream_body.add(body158.getTree());


            // AST REWRITE
            // elements: procedure_is_as, body, declare_section, procedure_heading
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 253:9: -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:253:12: ^( PROC procedure_heading procedure_is_as ( declare_section )? body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC, "PROC"), root_1);

                adaptor.addChild(root_1, stream_procedure_heading.nextTree());
                adaptor.addChild(root_1, stream_procedure_is_as.nextTree());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:254:18: ( declare_section )?
                if ( stream_declare_section.hasNext() ) {
                    adaptor.addChild(root_1, stream_declare_section.nextTree());

                }
                stream_declare_section.reset();
                adaptor.addChild(root_1, stream_body.nextTree());

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
    // $ANTLR end "procedure_definition"

    public static class procedure_is_as_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_is_as"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:1: procedure_is_as : is_as ;
    public final PLSQLTreeParser.procedure_is_as_return procedure_is_as() throws RecognitionException {
        PLSQLTreeParser.procedure_is_as_return retval = new PLSQLTreeParser.procedure_is_as_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.is_as_return is_as159 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:259:2: ( is_as )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:260:2: is_as
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_is_as_in_procedure_is_as1530);
            is_as159=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as159.getTree());

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
    // $ANTLR end "procedure_is_as"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:1: body : BEGIN body_spec END ( ID )? -> ^( BODY BEGIN body_spec END ( ID )? ) ;
    public final PLSQLTreeParser.body_return body() throws RecognitionException {
        PLSQLTreeParser.body_return retval = new PLSQLTreeParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN160=null;
        Token END162=null;
        Token ID163=null;
        PLSQLTreeParser.body_spec_return body_spec161 = null;


        Object BEGIN160_tree=null;
        Object END162_tree=null;
        Object ID163_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_body_spec=new RewriteRuleSubtreeStream(adaptor,"rule body_spec");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:7: ( BEGIN body_spec END ( ID )? -> ^( BODY BEGIN body_spec END ( ID )? ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:264:2: BEGIN body_spec END ( ID )?
            {
            BEGIN160=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1545);  
            stream_BEGIN.add(BEGIN160);

            pushFollow(FOLLOW_body_spec_in_body1547);
            body_spec161=body_spec();

            state._fsp--;

            stream_body_spec.add(body_spec161.getTree());
            END162=(Token)match(input,END,FOLLOW_END_in_body1549);  
            stream_END.add(END162);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:264:22: ( ID )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:264:22: ID
                    {
                    ID163=(Token)match(input,ID,FOLLOW_ID_in_body1551);  
                    stream_ID.add(ID163);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, BEGIN, END, body_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:26: -> ^( BODY BEGIN body_spec END ( ID )? )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:264:29: ^( BODY BEGIN body_spec END ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_BEGIN.nextNode());
                adaptor.addChild(root_1, stream_body_spec.nextTree());
                adaptor.addChild(root_1, stream_END.nextNode());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:264:56: ( ID )?
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

    public static class body_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body_spec"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:266:1: body_spec : statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? ;
    public final PLSQLTreeParser.body_spec_return body_spec() throws RecognitionException {
        PLSQLTreeParser.body_spec_return retval = new PLSQLTreeParser.body_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI165=null;
        Token EXCEPTION167=null;
        PLSQLTreeParser.statement_return statement164 = null;

        PLSQLTreeParser.st_pragma_return st_pragma166 = null;

        PLSQLTreeParser.exception_handler_return exception_handler168 = null;


        Object SEMI165_tree=null;
        Object EXCEPTION167_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:267:2: ( statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:2: statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_body_spec1579);
            statement164=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement164.getTree());
            SEMI165=(Token)match(input,SEMI,FOLLOW_SEMI_in_body_spec1581); 
            SEMI165_tree = (Object)adaptor.create(SEMI165);
            adaptor.addChild(root_0, SEMI165_tree);

            pushFollow(FOLLOW_st_pragma_in_body_spec1583);
            st_pragma166=st_pragma();

            state._fsp--;

            adaptor.addChild(root_0, st_pragma166.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:269:2: ( EXCEPTION ( exception_handler )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==EXCEPTION) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:269:4: EXCEPTION ( exception_handler )+
                    {
                    EXCEPTION167=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body_spec1588); 
                    EXCEPTION167_tree = (Object)adaptor.create(EXCEPTION167);
                    adaptor.addChild(root_0, EXCEPTION167_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:269:14: ( exception_handler )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==WHEN) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:269:14: exception_handler
                    	    {
                    	    pushFollow(FOLLOW_exception_handler_in_body_spec1590);
                    	    exception_handler168=exception_handler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exception_handler168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
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
    // $ANTLR end "body_spec"

    public static class st_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_pragma"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:1: st_pragma : ( statement SEMI | pragma SEMI )* ;
    public final PLSQLTreeParser.st_pragma_return st_pragma() throws RecognitionException {
        PLSQLTreeParser.st_pragma_return retval = new PLSQLTreeParser.st_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI170=null;
        Token SEMI172=null;
        PLSQLTreeParser.statement_return statement169 = null;

        PLSQLTreeParser.pragma_return pragma171 = null;


        Object SEMI170_tree=null;
        Object SEMI172_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:273:2: ( ( statement SEMI | pragma SEMI )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:274:2: ( statement SEMI | pragma SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:274:2: ( statement SEMI | pragma SEMI )*
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:274:4: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_st_pragma1612);
            	    statement169=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement169.getTree());
            	    SEMI170=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1614); 
            	    SEMI170_tree = (Object)adaptor.create(SEMI170);
            	    adaptor.addChild(root_0, SEMI170_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:274:21: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_st_pragma1618);
            	    pragma171=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma171.getTree());
            	    SEMI172=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1620); 
            	    SEMI172_tree = (Object)adaptor.create(SEMI172);
            	    adaptor.addChild(root_0, SEMI172_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:277:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQLTreeParser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQLTreeParser.exception_handler_return retval = new PLSQLTreeParser.exception_handler_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN173=null;
        Token OR175=null;
        Token OTHERS177=null;
        Token THEN178=null;
        Token SEMI180=null;
        PLSQLTreeParser.qual_id_return qual_id174 = null;

        PLSQLTreeParser.qual_id_return qual_id176 = null;

        PLSQLTreeParser.statement_return statement179 = null;


        Object WHEN173_tree=null;
        Object OR175_tree=null;
        Object OTHERS177_tree=null;
        Object THEN178_tree=null;
        Object SEMI180_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            WHEN173=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1635); 
            WHEN173_tree = (Object)adaptor.create(WHEN173);
            adaptor.addChild(root_0, WHEN173_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:9: ( qual_id ( OR qual_id )* | OTHERS )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:11: qual_id ( OR qual_id )*
                    {
                    pushFollow(FOLLOW_qual_id_in_exception_handler1639);
                    qual_id174=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id174.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:19: ( OR qual_id )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==OR) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:21: OR qual_id
                    	    {
                    	    OR175=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1643); 
                    	    OR175_tree = (Object)adaptor.create(OR175);
                    	    adaptor.addChild(root_0, OR175_tree);

                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1645);
                    	    qual_id176=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id176.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:37: OTHERS
                    {
                    OTHERS177=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1652); 
                    OTHERS177_tree = (Object)adaptor.create(OTHERS177);
                    adaptor.addChild(root_0, OTHERS177_tree);


                    }
                    break;

            }

            THEN178=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1658); 
            THEN178_tree = (Object)adaptor.create(THEN178);
            adaptor.addChild(root_0, THEN178_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:279:8: ( statement SEMI )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:279:10: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_exception_handler1662);
            	    statement179=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement179.getTree());
            	    SEMI180=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1664); 
            	    SEMI180_tree = (Object)adaptor.create(SEMI180);
            	    adaptor.addChild(root_0, SEMI180_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:282:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQLTreeParser.statement_return statement() throws RecognitionException {
        PLSQLTreeParser.statement_return retval = new PLSQLTreeParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.label_return label181 = null;

        PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement182 = null;

        PLSQLTreeParser.case_statement_return case_statement183 = null;

        PLSQLTreeParser.close_statement_return close_statement184 = null;

        PLSQLTreeParser.continue_statement_return continue_statement185 = null;

        PLSQLTreeParser.basic_loop_statement_return basic_loop_statement186 = null;

        PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement187 = null;

        PLSQLTreeParser.exit_statement_return exit_statement188 = null;

        PLSQLTreeParser.fetch_statement_return fetch_statement189 = null;

        PLSQLTreeParser.for_loop_statement_return for_loop_statement190 = null;

        PLSQLTreeParser.forall_statement_return forall_statement191 = null;

        PLSQLTreeParser.goto_statement_return goto_statement192 = null;

        PLSQLTreeParser.if_statement_return if_statement193 = null;

        PLSQLTreeParser.null_statement_return null_statement194 = null;

        PLSQLTreeParser.open_statement_return open_statement195 = null;

        PLSQLTreeParser.plsql_block_return plsql_block196 = null;

        PLSQLTreeParser.raise_statement_return raise_statement197 = null;

        PLSQLTreeParser.return_statement_return return_statement198 = null;

        PLSQLTreeParser.sql_statement_return sql_statement199 = null;

        PLSQLTreeParser.while_loop_statement_return while_loop_statement200 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:282:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:5: ( label )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LLABEL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statement1682);
            	    label181=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label181.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:7: assign_or_call_statement
                    {
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1691);
                    assign_or_call_statement182=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement182.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:285:7: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_statement1699);
                    case_statement183=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement183.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:286:7: close_statement
                    {
                    pushFollow(FOLLOW_close_statement_in_statement1707);
                    close_statement184=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement184.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:287:7: continue_statement
                    {
                    pushFollow(FOLLOW_continue_statement_in_statement1715);
                    continue_statement185=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement185.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:288:7: basic_loop_statement
                    {
                    pushFollow(FOLLOW_basic_loop_statement_in_statement1723);
                    basic_loop_statement186=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement186.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:7: execute_immediate_statement
                    {
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement1731);
                    execute_immediate_statement187=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement187.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:290:7: exit_statement
                    {
                    pushFollow(FOLLOW_exit_statement_in_statement1739);
                    exit_statement188=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement188.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:291:7: fetch_statement
                    {
                    pushFollow(FOLLOW_fetch_statement_in_statement1747);
                    fetch_statement189=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement189.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:292:7: for_loop_statement
                    {
                    pushFollow(FOLLOW_for_loop_statement_in_statement1755);
                    for_loop_statement190=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement190.getTree());

                    }
                    break;
                case 10 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:293:7: forall_statement
                    {
                    pushFollow(FOLLOW_forall_statement_in_statement1763);
                    forall_statement191=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement191.getTree());

                    }
                    break;
                case 11 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:294:7: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_statement1771);
                    goto_statement192=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement192.getTree());

                    }
                    break;
                case 12 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:295:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement1779);
                    if_statement193=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement193.getTree());

                    }
                    break;
                case 13 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:296:7: null_statement
                    {
                    pushFollow(FOLLOW_null_statement_in_statement1787);
                    null_statement194=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement194.getTree());

                    }
                    break;
                case 14 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:297:7: open_statement
                    {
                    pushFollow(FOLLOW_open_statement_in_statement1795);
                    open_statement195=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement195.getTree());

                    }
                    break;
                case 15 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:298:7: plsql_block
                    {
                    pushFollow(FOLLOW_plsql_block_in_statement1803);
                    plsql_block196=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block196.getTree());

                    }
                    break;
                case 16 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:299:7: raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_statement1811);
                    raise_statement197=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement197.getTree());

                    }
                    break;
                case 17 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:300:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1819);
                    return_statement198=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement198.getTree());

                    }
                    break;
                case 18 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:7: sql_statement
                    {
                    pushFollow(FOLLOW_sql_statement_in_statement1827);
                    sql_statement199=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement199.getTree());

                    }
                    break;
                case 19 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:302:7: while_loop_statement
                    {
                    pushFollow(FOLLOW_while_loop_statement_in_statement1835);
                    while_loop_statement200=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement200.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:306:1: lvalue : call ( DOT call )* -> ^( PACKCALL call ( DOT call )* ) ;
    public final PLSQLTreeParser.lvalue_return lvalue() throws RecognitionException {
        PLSQLTreeParser.lvalue_return retval = new PLSQLTreeParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT202=null;
        PLSQLTreeParser.call_return call201 = null;

        PLSQLTreeParser.call_return call203 = null;


        Object DOT202_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:5: ( call ( DOT call )* -> ^( PACKCALL call ( DOT call )* ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:7: call ( DOT call )*
            {
            pushFollow(FOLLOW_call_in_lvalue1858);
            call201=call();

            state._fsp--;

            stream_call.add(call201.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:12: ( DOT call )*
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:14: DOT call
            	    {
            	    DOT202=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1862);  
            	    stream_DOT.add(DOT202);

            	    pushFollow(FOLLOW_call_in_lvalue1864);
            	    call203=call();

            	    state._fsp--;

            	    stream_call.add(call203.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);



            // AST REWRITE
            // elements: DOT, call, call
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:26: -> ^( PACKCALL call ( DOT call )* )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:29: ^( PACKCALL call ( DOT call )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKCALL, "PACKCALL"), root_1);

                adaptor.addChild(root_1, stream_call.nextTree());
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:307:45: ( DOT call )*
                while ( stream_DOT.hasNext()||stream_call.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOT.nextNode());
                    adaptor.addChild(root_1, stream_call.nextTree());

                }
                stream_DOT.reset();
                stream_call.reset();

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
    // $ANTLR end "lvalue"

    public static class assign_or_call_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_or_call_statement"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:310:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQLTreeParser.assign_or_call_statement_return retval = new PLSQLTreeParser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT205=null;
        Token ASSIGN207=null;
        PLSQLTreeParser.lvalue_return lvalue204 = null;

        PLSQLTreeParser.delete_call_return delete_call206 = null;

        PLSQLTreeParser.expression_return expression208 = null;


        Object DOT205_tree=null;
        Object ASSIGN207_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement1901);
            lvalue204=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue204.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:14: ( DOT delete_call | ASSIGN expression )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:16: DOT delete_call
                    {
                    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement1905); 
                    DOT205_tree = (Object)adaptor.create(DOT205);
                    adaptor.addChild(root_0, DOT205_tree);

                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement1907);
                    delete_call206=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call206.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:311:34: ASSIGN expression
                    {
                    ASSIGN207=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement1911); 
                    ASSIGN207_tree = (Object)adaptor.create(ASSIGN207);
                    adaptor.addChild(root_0, ASSIGN207_tree);

                    pushFollow(FOLLOW_expression_in_assign_or_call_statement1913);
                    expression208=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression208.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:314:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ;
    public final PLSQLTreeParser.call_return call() throws RecognitionException {
        PLSQLTreeParser.call_return retval = new PLSQLTreeParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON209=null;
        Token ID210=null;
        Token LPAREN211=null;
        Token COMMA213=null;
        Token RPAREN215=null;
        PLSQLTreeParser.parameter_return parameter212 = null;

        PLSQLTreeParser.parameter_return parameter214 = null;


        Object COLON209_tree=null;
        Object ID210_tree=null;
        Object LPAREN211_tree=null;
        Object COMMA213_tree=null;
        Object RPAREN215_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:7: ( COLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:7: COLON
                    {
                    COLON209=(Token)match(input,COLON,FOLLOW_COLON_in_call1933); 
                    COLON209_tree = (Object)adaptor.create(COLON209);
                    adaptor.addChild(root_0, COLON209_tree);


                    }
                    break;

            }

            ID210=(Token)match(input,ID,FOLLOW_ID_in_call1936); 
            ID210_tree = (Object)adaptor.create(ID210);
            adaptor.addChild(root_0, ID210_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    LPAREN211=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call1940); 
                    LPAREN211_tree = (Object)adaptor.create(LPAREN211);
                    adaptor.addChild(root_0, LPAREN211_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:26: ( parameter ( COMMA parameter )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ID||LA59_0==LPAREN||(LA59_0>=NOT && LA59_0<=NULL)||LA59_0==COLON||(LA59_0>=MINUS && LA59_0<=PLUS)||LA59_0==SQL||(LA59_0>=INTEGER && LA59_0<=QUOTED_STRING)||(LA59_0>=INSERTING && LA59_0<=DELETING)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:28: parameter ( COMMA parameter )*
                            {
                            pushFollow(FOLLOW_parameter_in_call1944);
                            parameter212=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter212.getTree());
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:38: ( COMMA parameter )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==COMMA) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:315:40: COMMA parameter
                            	    {
                            	    COMMA213=(Token)match(input,COMMA,FOLLOW_COMMA_in_call1948); 
                            	    COMMA213_tree = (Object)adaptor.create(COMMA213);
                            	    adaptor.addChild(root_0, COMMA213_tree);

                            	    pushFollow(FOLLOW_parameter_in_call1950);
                            	    parameter214=parameter();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, parameter214.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call1958); 
                    RPAREN215_tree = (Object)adaptor.create(RPAREN215);
                    adaptor.addChild(root_0, RPAREN215_tree);


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
    // $ANTLR end "call"

    public static class delete_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_call"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:318:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQLTreeParser.delete_call_return delete_call() throws RecognitionException {
        PLSQLTreeParser.delete_call_return retval = new PLSQLTreeParser.delete_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE216=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        PLSQLTreeParser.parameter_return parameter218 = null;


        Object DELETE216_tree=null;
        Object LPAREN217_tree=null;
        Object RPAREN219_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE216=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call1979); 
            DELETE216_tree = (Object)adaptor.create(DELETE216);
            adaptor.addChild(root_0, DELETE216_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:14: ( LPAREN ( parameter )? RPAREN )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:16: LPAREN ( parameter )? RPAREN
                    {
                    LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call1983); 
                    LPAREN217_tree = (Object)adaptor.create(LPAREN217);
                    adaptor.addChild(root_0, LPAREN217_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:23: ( parameter )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ID||LA61_0==LPAREN||(LA61_0>=NOT && LA61_0<=NULL)||LA61_0==COLON||(LA61_0>=MINUS && LA61_0<=PLUS)||LA61_0==SQL||(LA61_0>=INTEGER && LA61_0<=QUOTED_STRING)||(LA61_0>=INSERTING && LA61_0<=DELETING)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:319:23: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_delete_call1985);
                            parameter218=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter218.getTree());

                            }
                            break;

                    }

                    RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call1988); 
                    RPAREN219_tree = (Object)adaptor.create(RPAREN219);
                    adaptor.addChild(root_0, RPAREN219_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQLTreeParser.basic_loop_statement_return retval = new PLSQLTreeParser.basic_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP220=null;
        Token SEMI222=null;
        Token END223=null;
        Token LOOP224=null;
        PLSQLTreeParser.statement_return statement221 = null;

        PLSQLTreeParser.label_name_return label_name225 = null;


        Object LOOP220_tree=null;
        Object SEMI222_tree=null;
        Object END223_tree=null;
        Object LOOP224_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            LOOP220=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement2012); 
            LOOP220_tree = (Object)adaptor.create(LOOP220);
            adaptor.addChild(root_0, LOOP220_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:14: ( statement SEMI )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:16: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement2016);
            	    statement221=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement221.getTree());
            	    SEMI222=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement2018); 
            	    SEMI222_tree = (Object)adaptor.create(SEMI222);
            	    adaptor.addChild(root_0, SEMI222_tree);


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

            END223=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement2023); 
            END223_tree = (Object)adaptor.create(END223);
            adaptor.addChild(root_0, END223_tree);

            LOOP224=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement2025); 
            LOOP224_tree = (Object)adaptor.create(LOOP224);
            adaptor.addChild(root_0, LOOP224_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:43: ( label_name )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:43: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement2027);
                    label_name225=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name225.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:326:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQLTreeParser.case_statement_return case_statement() throws RecognitionException {
        PLSQLTreeParser.case_statement_return retval = new PLSQLTreeParser.case_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE226=null;
        Token WHEN228=null;
        Token THEN230=null;
        Token SEMI232=null;
        Token ELSE233=null;
        Token SEMI235=null;
        Token END236=null;
        Token CASE237=null;
        PLSQLTreeParser.expression_return expression227 = null;

        PLSQLTreeParser.expression_return expression229 = null;

        PLSQLTreeParser.statement_return statement231 = null;

        PLSQLTreeParser.statement_return statement234 = null;

        PLSQLTreeParser.label_name_return label_name238 = null;


        Object CASE226_tree=null;
        Object WHEN228_tree=null;
        Object THEN230_tree=null;
        Object SEMI232_tree=null;
        Object ELSE233_tree=null;
        Object SEMI235_tree=null;
        Object END236_tree=null;
        Object CASE237_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:326:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            CASE226=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2049); 
            CASE226_tree = (Object)adaptor.create(CASE226);
            adaptor.addChild(root_0, CASE226_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:14: ( expression )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID||LA65_0==LPAREN||(LA65_0>=NOT && LA65_0<=NULL)||LA65_0==COLON||(LA65_0>=MINUS && LA65_0<=PLUS)||LA65_0==SQL||(LA65_0>=INTEGER && LA65_0<=QUOTED_STRING)||(LA65_0>=INSERTING && LA65_0<=DELETING)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_case_statement2051);
                    expression227=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression227.getTree());

                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:9: ( WHEN expression THEN ( statement SEMI )+ )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    WHEN228=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement2064); 
            	    WHEN228_tree = (Object)adaptor.create(WHEN228);
            	    adaptor.addChild(root_0, WHEN228_tree);

            	    pushFollow(FOLLOW_expression_in_case_statement2066);
            	    expression229=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression229.getTree());
            	    THEN230=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement2068); 
            	    THEN230_tree = (Object)adaptor.create(THEN230);
            	    adaptor.addChild(root_0, THEN230_tree);

            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:32: ( statement SEMI )+
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
            	    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:34: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_case_statement2072);
            	    	    statement231=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement231.getTree());
            	    	    SEMI232=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2074); 
            	    	    SEMI232_tree = (Object)adaptor.create(SEMI232);
            	    	    adaptor.addChild(root_0, SEMI232_tree);


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

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:329:9: ( ELSE statement SEMI )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ELSE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:329:11: ELSE statement SEMI
                    {
                    ELSE233=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement2092); 
                    ELSE233_tree = (Object)adaptor.create(ELSE233);
                    adaptor.addChild(root_0, ELSE233_tree);

                    pushFollow(FOLLOW_statement_in_case_statement2094);
                    statement234=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement234.getTree());
                    SEMI235=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2096); 
                    SEMI235_tree = (Object)adaptor.create(SEMI235);
                    adaptor.addChild(root_0, SEMI235_tree);


                    }
                    break;

            }

            END236=(Token)match(input,END,FOLLOW_END_in_case_statement2109); 
            END236_tree = (Object)adaptor.create(END236);
            adaptor.addChild(root_0, END236_tree);

            CASE237=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2111); 
            CASE237_tree = (Object)adaptor.create(CASE237);
            adaptor.addChild(root_0, CASE237_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:330:18: ( label_name )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:330:18: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_case_statement2113);
                    label_name238=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name238.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:333:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQLTreeParser.close_statement_return close_statement() throws RecognitionException {
        PLSQLTreeParser.close_statement_return retval = new PLSQLTreeParser.close_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE239=null;
        Token ID240=null;
        Token DOT241=null;
        Token ID242=null;

        Object CLOSE239_tree=null;
        Object ID240_tree=null;
        Object DOT241_tree=null;
        Object ID242_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:333:17: ( CLOSE ID ( DOT ID )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:334:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (Object)adaptor.nil();

            CLOSE239=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement2135); 
            CLOSE239_tree = (Object)adaptor.create(CLOSE239);
            adaptor.addChild(root_0, CLOSE239_tree);

            ID240=(Token)match(input,ID,FOLLOW_ID_in_close_statement2137); 
            ID240_tree = (Object)adaptor.create(ID240);
            adaptor.addChild(root_0, ID240_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:334:18: ( DOT ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==DOT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:334:20: DOT ID
                    {
                    DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement2141); 
                    DOT241_tree = (Object)adaptor.create(DOT241);
                    adaptor.addChild(root_0, DOT241_tree);

                    ID242=(Token)match(input,ID,FOLLOW_ID_in_close_statement2143); 
                    ID242_tree = (Object)adaptor.create(ID242);
                    adaptor.addChild(root_0, ID242_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQLTreeParser.continue_statement_return retval = new PLSQLTreeParser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token CONTINUE243=null;
        Token WHEN244=null;
        PLSQLTreeParser.expression_return expression245 = null;


        Object lbl_tree=null;
        Object CONTINUE243_tree=null;
        Object WHEN244_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE243=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement2167); 
            CONTINUE243_tree = (Object)adaptor.create(CONTINUE243);
            adaptor.addChild(root_0, CONTINUE243_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:18: (lbl= ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:20: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement2173); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:30: ( WHEN expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WHEN) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:32: WHEN expression
                    {
                    WHEN244=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement2180); 
                    WHEN244_tree = (Object)adaptor.create(WHEN244);
                    adaptor.addChild(root_0, WHEN244_tree);

                    pushFollow(FOLLOW_expression_in_continue_statement2182);
                    expression245=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression245.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:341:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQLTreeParser.execute_immediate_statement_return retval = new PLSQLTreeParser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXECUTE246=null;
        Token IMMEDIATE247=null;
        PLSQLTreeParser.expression_return expression248 = null;

        PLSQLTreeParser.into_clause_return into_clause249 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause250 = null;

        PLSQLTreeParser.using_clause_return using_clause251 = null;

        PLSQLTreeParser.using_clause_return using_clause252 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause253 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause254 = null;


        Object EXECUTE246_tree=null;
        Object IMMEDIATE247_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:341:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:342:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (Object)adaptor.nil();

            EXECUTE246=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement2206); 
            EXECUTE246_tree = (Object)adaptor.create(EXECUTE246);
            adaptor.addChild(root_0, EXECUTE246_tree);

            IMMEDIATE247=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement2208); 
            IMMEDIATE247_tree = (Object)adaptor.create(IMMEDIATE247);
            adaptor.addChild(root_0, IMMEDIATE247_tree);

            pushFollow(FOLLOW_expression_in_execute_immediate_statement2210);
            expression248=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression248.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:342:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:9: ( into_clause | bulk_collect_into_clause )
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
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:11: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement2224);
                            into_clause249=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause249.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:25: bulk_collect_into_clause
                            {
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2228);
                            bulk_collect_into_clause250=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause250.getTree());

                            }
                            break;

                    }

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:51: ( using_clause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==USING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:51: using_clause
                            {
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2231);
                            using_clause251=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause251.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:11: using_clause ( dynamic_returning_clause )?
                    {
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2244);
                    using_clause252=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause252.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:24: ( dynamic_returning_clause )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RETURN||LA75_0==RETURNING) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:24: dynamic_returning_clause
                            {
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2246);
                            dynamic_returning_clause253=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause253.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:345:11: dynamic_returning_clause
                    {
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2259);
                    dynamic_returning_clause254=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause254.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:349:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQLTreeParser.exit_statement_return retval = new PLSQLTreeParser.exit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token EXIT255=null;
        Token WHEN256=null;
        PLSQLTreeParser.expression_return expression257 = null;


        Object lbl_tree=null;
        Object EXIT255_tree=null;
        Object WHEN256_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:349:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:350:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            EXIT255=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement2291); 
            EXIT255_tree = (Object)adaptor.create(EXIT255);
            adaptor.addChild(root_0, EXIT255_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:350:14: (lbl= ID )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:350:16: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement2297); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:350:26: ( WHEN expression )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==WHEN) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:350:28: WHEN expression
                    {
                    WHEN256=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement2304); 
                    WHEN256_tree = (Object)adaptor.create(WHEN256);
                    adaptor.addChild(root_0, WHEN256_tree);

                    pushFollow(FOLLOW_expression_in_exit_statement2306);
                    expression257=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression257.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:353:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQLTreeParser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQLTreeParser.fetch_statement_return retval = new PLSQLTreeParser.fetch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FETCH258=null;
        Token LIMIT262=null;
        PLSQLTreeParser.qual_id_return qual_id259 = null;

        PLSQLTreeParser.into_clause_return into_clause260 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause261 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression263 = null;


        Object FETCH258_tree=null;
        Object LIMIT262_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:353:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (Object)adaptor.nil();

            FETCH258=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement2330); 
            FETCH258_tree = (Object)adaptor.create(FETCH258);
            adaptor.addChild(root_0, FETCH258_tree);

            pushFollow(FOLLOW_qual_id_in_fetch_statement2332);
            qual_id259=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id259.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:25: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_fetch_statement2336);
                    into_clause260=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause260.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement2340);
                    bulk_collect_into_clause261=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause261.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:64: ( LIMIT numeric_expression )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==LIMIT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:354:66: LIMIT numeric_expression
                            {
                            LIMIT262=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement2344); 
                            LIMIT262_tree = (Object)adaptor.create(LIMIT262);
                            adaptor.addChild(root_0, LIMIT262_tree);

                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement2346);
                            numeric_expression263=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression263.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:357:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.into_clause_return into_clause() throws RecognitionException {
        PLSQLTreeParser.into_clause_return retval = new PLSQLTreeParser.into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTO264=null;
        Token COMMA266=null;
        PLSQLTreeParser.lvalue_return lvalue265 = null;

        PLSQLTreeParser.lvalue_return lvalue267 = null;


        Object INTO264_tree=null;
        Object COMMA266_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:357:13: ( INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            INTO264=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2376); 
            INTO264_tree = (Object)adaptor.create(INTO264);
            adaptor.addChild(root_0, INTO264_tree);

            pushFollow(FOLLOW_lvalue_in_into_clause2378);
            lvalue265=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue265.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:21: ( COMMA lvalue )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:358:23: COMMA lvalue
            	    {
            	    COMMA266=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2382); 
            	    COMMA266_tree = (Object)adaptor.create(COMMA266);
            	    adaptor.addChild(root_0, COMMA266_tree);

            	    pushFollow(FOLLOW_lvalue_in_into_clause2384);
            	    lvalue267=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue267.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:361:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQLTreeParser.bulk_collect_into_clause_return retval = new PLSQLTreeParser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK268=null;
        Token COLLECT269=null;
        Token INTO270=null;
        Token COMMA272=null;
        PLSQLTreeParser.lvalue_return lvalue271 = null;

        PLSQLTreeParser.lvalue_return lvalue273 = null;


        Object BULK268_tree=null;
        Object COLLECT269_tree=null;
        Object INTO270_tree=null;
        Object COMMA272_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:361:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:362:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            BULK268=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2412); 
            BULK268_tree = (Object)adaptor.create(BULK268);
            adaptor.addChild(root_0, BULK268_tree);

            COLLECT269=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2414); 
            COLLECT269_tree = (Object)adaptor.create(COLLECT269);
            adaptor.addChild(root_0, COLLECT269_tree);

            INTO270=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2416); 
            INTO270_tree = (Object)adaptor.create(INTO270);
            adaptor.addChild(root_0, INTO270_tree);

            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2418);
            lvalue271=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue271.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:362:34: ( COMMA lvalue )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:362:36: COMMA lvalue
            	    {
            	    COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2422); 
            	    COMMA272_tree = (Object)adaptor.create(COMMA272);
            	    adaptor.addChild(root_0, COMMA272_tree);

            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2424);
            	    lvalue273=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue273.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:365:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQLTreeParser.using_clause_return using_clause() throws RecognitionException {
        PLSQLTreeParser.using_clause_return retval = new PLSQLTreeParser.using_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING274=null;
        Token COMMA277=null;
        PLSQLTreeParser.param_modifiers_return param_modifiers275 = null;

        PLSQLTreeParser.expression_return expression276 = null;

        PLSQLTreeParser.param_modifiers_return param_modifiers278 = null;

        PLSQLTreeParser.expression_return expression279 = null;


        Object USING274_tree=null;
        Object COMMA277_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:365:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (Object)adaptor.nil();

            USING274=(Token)match(input,USING,FOLLOW_USING_in_using_clause2448); 
            USING274_tree = (Object)adaptor.create(USING274);
            adaptor.addChild(root_0, USING274_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:15: ( param_modifiers )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=IN && LA83_0<=OUT)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:15: param_modifiers
                    {
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2450);
                    param_modifiers275=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers275.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_using_clause2453);
            expression276=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression276.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:43: ( COMMA ( param_modifiers )? expression )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:45: COMMA ( param_modifiers )? expression
            	    {
            	    COMMA277=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2457); 
            	    COMMA277_tree = (Object)adaptor.create(COMMA277);
            	    adaptor.addChild(root_0, COMMA277_tree);

            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:51: ( param_modifiers )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( ((LA84_0>=IN && LA84_0<=OUT)) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:366:51: param_modifiers
            	            {
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2459);
            	            param_modifiers278=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers278.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_using_clause2462);
            	    expression279=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression279.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:369:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQLTreeParser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQLTreeParser.param_modifiers_return retval = new PLSQLTreeParser.param_modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN280=null;
        Token OUT281=null;
        Token OUT282=null;

        Object IN280_tree=null;
        Object OUT281_tree=null;
        Object OUT282_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:370:2: ( IN ( OUT )? | OUT )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:370:4: IN ( OUT )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IN280=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2479); 
                    IN280_tree = (Object)adaptor.create(IN280);
                    adaptor.addChild(root_0, IN280_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:370:7: ( OUT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==OUT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:370:7: OUT
                            {
                            OUT281=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2481); 
                            OUT281_tree = (Object)adaptor.create(OUT281);
                            adaptor.addChild(root_0, OUT281_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:370:14: OUT
                    {
                    root_0 = (Object)adaptor.nil();

                    OUT282=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2486); 
                    OUT282_tree = (Object)adaptor.create(OUT282);
                    adaptor.addChild(root_0, OUT282_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:373:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQLTreeParser.dynamic_returning_clause_return retval = new PLSQLTreeParser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set283=null;
        PLSQLTreeParser.into_clause_return into_clause284 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause285 = null;


        Object set283_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:373:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:374:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (Object)adaptor.nil();

            set283=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set283));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:374:32: ( into_clause | bulk_collect_into_clause )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:374:34: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2516);
                    into_clause284=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause284.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:374:48: bulk_collect_into_clause
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2520);
                    bulk_collect_into_clause285=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause285.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:377:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQLTreeParser.for_loop_statement_return retval = new PLSQLTreeParser.for_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR286=null;
        Token ID287=null;
        Token IN288=null;
        Token set289=null;
        Token LOOP290=null;
        Token SEMI292=null;
        Token END293=null;
        Token LOOP294=null;
        PLSQLTreeParser.statement_return statement291 = null;

        PLSQLTreeParser.label_name_return label_name295 = null;


        Object FOR286_tree=null;
        Object ID287_tree=null;
        Object IN288_tree=null;
        Object set289_tree=null;
        Object LOOP290_tree=null;
        Object SEMI292_tree=null;
        Object END293_tree=null;
        Object LOOP294_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:377:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            FOR286=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2543); 
            FOR286_tree = (Object)adaptor.create(FOR286);
            adaptor.addChild(root_0, FOR286_tree);

            ID287=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2545); 
            ID287_tree = (Object)adaptor.create(ID287);
            adaptor.addChild(root_0, ID287_tree);

            IN288=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2547); 
            IN288_tree = (Object)adaptor.create(IN288);
            adaptor.addChild(root_0, IN288_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:19: (~ ( LOOP ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=PROC && LA89_0<=DELETE)||(LA89_0>=CASE && LA89_0<=Z)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:21: ~ ( LOOP )
            	    {
            	    set289=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=Z) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set289));
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

            LOOP290=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2559); 
            LOOP290_tree = (Object)adaptor.create(LOOP290);
            adaptor.addChild(root_0, LOOP290_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:37: ( statement SEMI )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:39: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2563);
            	    statement291=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement291.getTree());
            	    SEMI292=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2565); 
            	    SEMI292_tree = (Object)adaptor.create(SEMI292);
            	    adaptor.addChild(root_0, SEMI292_tree);


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

            END293=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2570); 
            END293_tree = (Object)adaptor.create(END293);
            adaptor.addChild(root_0, END293_tree);

            LOOP294=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2572); 
            LOOP294_tree = (Object)adaptor.create(LOOP294);
            adaptor.addChild(root_0, LOOP294_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:66: ( label_name )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:378:66: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2574);
                    label_name295=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name295.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:381:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQLTreeParser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQLTreeParser.forall_statement_return retval = new PLSQLTreeParser.forall_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORALL296=null;
        Token ID297=null;
        Token IN298=null;
        PLSQLTreeParser.bounds_clause_return bounds_clause299 = null;

        PLSQLTreeParser.sql_statement_return sql_statement300 = null;

        PLSQLTreeParser.kSAVE_return kSAVE301 = null;

        PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS302 = null;


        Object FORALL296_tree=null;
        Object ID297_tree=null;
        Object IN298_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:381:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:382:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (Object)adaptor.nil();

            FORALL296=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2596); 
            FORALL296_tree = (Object)adaptor.create(FORALL296);
            adaptor.addChild(root_0, FORALL296_tree);

            ID297=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2598); 
            ID297_tree = (Object)adaptor.create(ID297);
            adaptor.addChild(root_0, ID297_tree);

            IN298=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2600); 
            IN298_tree = (Object)adaptor.create(IN298);
            adaptor.addChild(root_0, IN298_tree);

            pushFollow(FOLLOW_bounds_clause_in_forall_statement2602);
            bounds_clause299=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause299.getTree());
            pushFollow(FOLLOW_sql_statement_in_forall_statement2604);
            sql_statement300=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement300.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:382:50: ( kSAVE kEXCEPTIONS )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:382:52: kSAVE kEXCEPTIONS
                    {
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2608);
                    kSAVE301=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE301.getTree());
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2610);
                    kEXCEPTIONS302=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS302.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:385:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQLTreeParser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQLTreeParser.bounds_clause_return retval = new PLSQLTreeParser.bounds_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLEDOT304=null;
        Token BETWEEN309=null;
        Token AND311=null;
        PLSQLTreeParser.numeric_expression_return numeric_expression303 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression305 = null;

        PLSQLTreeParser.kINDICES_return kINDICES306 = null;

        PLSQLTreeParser.kOF_return kOF307 = null;

        PLSQLTreeParser.atom_return atom308 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression310 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression312 = null;

        PLSQLTreeParser.kVALUES_return kVALUES313 = null;

        PLSQLTreeParser.kOF_return kOF314 = null;

        PLSQLTreeParser.atom_return atom315 = null;


        Object DOUBLEDOT304_tree=null;
        Object BETWEEN309_tree=null;
        Object AND311_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:386:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt94=3;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:386:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2632);
                    numeric_expression303=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression303.getTree());
                    DOUBLEDOT304=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2634); 
                    DOUBLEDOT304_tree = (Object)adaptor.create(DOUBLEDOT304);
                    adaptor.addChild(root_0, DOUBLEDOT304_tree);

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2636);
                    numeric_expression305=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression305.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:387:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2644);
                    kINDICES306=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES306.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2646);
                    kOF307=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF307.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2648);
                    atom308=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom308.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:387:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==BETWEEN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:387:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            BETWEEN309=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2652); 
                            BETWEEN309_tree = (Object)adaptor.create(BETWEEN309);
                            adaptor.addChild(root_0, BETWEEN309_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2654);
                            numeric_expression310=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression310.getTree());
                            AND311=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2656); 
                            AND311_tree = (Object)adaptor.create(AND311);
                            adaptor.addChild(root_0, AND311_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2658);
                            numeric_expression312=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression312.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:388:7: kVALUES kOF atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2669);
                    kVALUES313=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES313.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2671);
                    kOF314=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF314.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2673);
                    atom315=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom315.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:1: goto_statement : GOTO label_name ;
    public final PLSQLTreeParser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQLTreeParser.goto_statement_return retval = new PLSQLTreeParser.goto_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GOTO316=null;
        PLSQLTreeParser.label_name_return label_name317 = null;


        Object GOTO316_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:16: ( GOTO label_name )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:9: GOTO label_name
            {
            root_0 = (Object)adaptor.nil();

            GOTO316=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2694); 
            GOTO316_tree = (Object)adaptor.create(GOTO316);
            adaptor.addChild(root_0, GOTO316_tree);

            pushFollow(FOLLOW_label_name_in_goto_statement2696);
            label_name317=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name317.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:395:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQLTreeParser.if_statement_return if_statement() throws RecognitionException {
        PLSQLTreeParser.if_statement_return retval = new PLSQLTreeParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF318=null;
        Token THEN320=null;
        Token SEMI322=null;
        Token ELSIF323=null;
        Token THEN325=null;
        Token SEMI327=null;
        Token ELSE328=null;
        Token SEMI330=null;
        Token END331=null;
        Token IF332=null;
        PLSQLTreeParser.expression_return expression319 = null;

        PLSQLTreeParser.statement_return statement321 = null;

        PLSQLTreeParser.expression_return expression324 = null;

        PLSQLTreeParser.statement_return statement326 = null;

        PLSQLTreeParser.statement_return statement329 = null;


        Object IF318_tree=null;
        Object THEN320_tree=null;
        Object SEMI322_tree=null;
        Object ELSIF323_tree=null;
        Object THEN325_tree=null;
        Object SEMI327_tree=null;
        Object ELSE328_tree=null;
        Object SEMI330_tree=null;
        Object END331_tree=null;
        Object IF332_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:395:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (Object)adaptor.nil();

            IF318=(Token)match(input,IF,FOLLOW_IF_in_if_statement2717); 
            IF318_tree = (Object)adaptor.create(IF318);
            adaptor.addChild(root_0, IF318_tree);

            pushFollow(FOLLOW_expression_in_if_statement2719);
            expression319=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression319.getTree());
            THEN320=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2721); 
            THEN320_tree = (Object)adaptor.create(THEN320);
            adaptor.addChild(root_0, THEN320_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:28: ( statement SEMI )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:30: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement2725);
            	    statement321=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement321.getTree());
            	    SEMI322=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2727); 
            	    SEMI322_tree = (Object)adaptor.create(SEMI322);
            	    adaptor.addChild(root_0, SEMI322_tree);


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

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ELSIF) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    ELSIF323=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement2742); 
            	    ELSIF323_tree = (Object)adaptor.create(ELSIF323);
            	    adaptor.addChild(root_0, ELSIF323_tree);

            	    pushFollow(FOLLOW_expression_in_if_statement2744);
            	    expression324=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression324.getTree());
            	    THEN325=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2746); 
            	    THEN325_tree = (Object)adaptor.create(THEN325);
            	    adaptor.addChild(root_0, THEN325_tree);

            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:33: ( statement SEMI )+
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
            	    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:35: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement2750);
            	    	    statement326=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement326.getTree());
            	    	    SEMI327=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2752); 
            	    	    SEMI327_tree = (Object)adaptor.create(SEMI327);
            	    	    adaptor.addChild(root_0, SEMI327_tree);


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

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:398:9: ( ELSE ( statement SEMI )+ )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ELSE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:398:11: ELSE ( statement SEMI )+
                    {
                    ELSE328=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement2770); 
                    ELSE328_tree = (Object)adaptor.create(ELSE328);
                    adaptor.addChild(root_0, ELSE328_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:398:16: ( statement SEMI )+
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
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:398:18: statement SEMI
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement2774);
                    	    statement329=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement329.getTree());
                    	    SEMI330=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2776); 
                    	    SEMI330_tree = (Object)adaptor.create(SEMI330);
                    	    adaptor.addChild(root_0, SEMI330_tree);


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

            END331=(Token)match(input,END,FOLLOW_END_in_if_statement2792); 
            END331_tree = (Object)adaptor.create(END331);
            adaptor.addChild(root_0, END331_tree);

            IF332=(Token)match(input,IF,FOLLOW_IF_in_if_statement2794); 
            IF332_tree = (Object)adaptor.create(IF332);
            adaptor.addChild(root_0, IF332_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:402:1: null_statement : NULL ;
    public final PLSQLTreeParser.null_statement_return null_statement() throws RecognitionException {
        PLSQLTreeParser.null_statement_return retval = new PLSQLTreeParser.null_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL333=null;

        Object NULL333_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:402:16: ( NULL )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:403:9: NULL
            {
            root_0 = (Object)adaptor.nil();

            NULL333=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement2815); 
            NULL333_tree = (Object)adaptor.create(NULL333);
            adaptor.addChild(root_0, NULL333_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:406:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQLTreeParser.open_statement_return open_statement() throws RecognitionException {
        PLSQLTreeParser.open_statement_return retval = new PLSQLTreeParser.open_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN334=null;
        Token ID335=null;
        Token DOT336=null;
        Token ID337=null;
        Token FOR339=null;
        PLSQLTreeParser.call_args_return call_args338 = null;

        PLSQLTreeParser.select_statement_return select_statement340 = null;


        Object OPEN334_tree=null;
        Object ID335_tree=null;
        Object DOT336_tree=null;
        Object ID337_tree=null;
        Object FOR339_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:406:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (Object)adaptor.nil();

            OPEN334=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement2836); 
            OPEN334_tree = (Object)adaptor.create(OPEN334);
            adaptor.addChild(root_0, OPEN334_tree);

            ID335=(Token)match(input,ID,FOLLOW_ID_in_open_statement2838); 
            ID335_tree = (Object)adaptor.create(ID335);
            adaptor.addChild(root_0, ID335_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:17: ( DOT ID )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==DOT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:19: DOT ID
            	    {
            	    DOT336=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement2842); 
            	    DOT336_tree = (Object)adaptor.create(DOT336);
            	    adaptor.addChild(root_0, DOT336_tree);

            	    ID337=(Token)match(input,ID,FOLLOW_ID_in_open_statement2844); 
            	    ID337_tree = (Object)adaptor.create(ID337);
            	    adaptor.addChild(root_0, ID337_tree);


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:29: ( call_args )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LPAREN) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:29: call_args
                    {
                    pushFollow(FOLLOW_call_args_in_open_statement2849);
                    call_args338=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args338.getTree());

                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:40: ( FOR select_statement )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FOR) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:407:42: FOR select_statement
                    {
                    FOR339=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement2854); 
                    FOR339_tree = (Object)adaptor.create(FOR339);
                    adaptor.addChild(root_0, FOR339_tree);

                    pushFollow(FOLLOW_select_statement_in_open_statement2856);
                    select_statement340=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement340.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:410:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQLTreeParser.pragma_return pragma() throws RecognitionException {
        PLSQLTreeParser.pragma_return retval = new PLSQLTreeParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA341=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi342 = null;


        Object PRAGMA341_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:410:8: ( PRAGMA swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:411:9: PRAGMA swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA341=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma2880); 
            PRAGMA341_tree = (Object)adaptor.create(PRAGMA341);
            adaptor.addChild(root_0, PRAGMA341_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_pragma2882);
            swallow_to_semi342=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi342.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:414:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQLTreeParser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQLTreeParser.raise_statement_return retval = new PLSQLTreeParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RAISE343=null;
        Token ID344=null;
        Token DOT345=null;
        Token ID346=null;

        Object RAISE343_tree=null;
        Object ID344_tree=null;
        Object DOT345_tree=null;
        Object ID346_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:414:17: ( RAISE ( ID ( DOT ID )* )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (Object)adaptor.nil();

            RAISE343=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement2903); 
            RAISE343_tree = (Object)adaptor.create(RAISE343);
            adaptor.addChild(root_0, RAISE343_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:15: ( ID ( DOT ID )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:17: ID ( DOT ID )*
                    {
                    ID344=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2907); 
                    ID344_tree = (Object)adaptor.create(ID344);
                    adaptor.addChild(root_0, ID344_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:20: ( DOT ID )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==DOT) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:415:22: DOT ID
                    	    {
                    	    DOT345=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement2911); 
                    	    DOT345_tree = (Object)adaptor.create(DOT345);
                    	    adaptor.addChild(root_0, DOT345_tree);

                    	    ID346=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2913); 
                    	    ID346_tree = (Object)adaptor.create(ID346);
                    	    adaptor.addChild(root_0, ID346_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:418:1: return_statement : RETURN ( expression )? ;
    public final PLSQLTreeParser.return_statement_return return_statement() throws RecognitionException {
        PLSQLTreeParser.return_statement_return retval = new PLSQLTreeParser.return_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN347=null;
        PLSQLTreeParser.expression_return expression348 = null;


        Object RETURN347_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:418:18: ( RETURN ( expression )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:419:9: RETURN ( expression )?
            {
            root_0 = (Object)adaptor.nil();

            RETURN347=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement2940); 
            RETURN347_tree = (Object)adaptor.create(RETURN347);
            adaptor.addChild(root_0, RETURN347_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:419:16: ( expression )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ID||LA105_0==LPAREN||(LA105_0>=NOT && LA105_0<=NULL)||LA105_0==COLON||(LA105_0>=MINUS && LA105_0<=PLUS)||LA105_0==SQL||(LA105_0>=INTEGER && LA105_0<=QUOTED_STRING)||(LA105_0>=INSERTING && LA105_0<=DELETING)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:419:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement2942);
                    expression348=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression348.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:422:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQLTreeParser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQLTreeParser.plsql_block_return retval = new PLSQLTreeParser.plsql_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DECLARE349=null;
        PLSQLTreeParser.declare_section_return declare_section350 = null;

        PLSQLTreeParser.body_return body351 = null;


        Object DECLARE349_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:422:13: ( ( DECLARE declare_section )? body )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:423:9: ( DECLARE declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:423:9: ( DECLARE declare_section )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==DECLARE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:423:11: DECLARE declare_section
                    {
                    DECLARE349=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block2966); 
                    DECLARE349_tree = (Object)adaptor.create(DECLARE349);
                    adaptor.addChild(root_0, DECLARE349_tree);

                    pushFollow(FOLLOW_declare_section_in_plsql_block2968);
                    declare_section350=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section350.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_plsql_block2973);
            body351=body();

            state._fsp--;

            adaptor.addChild(root_0, body351.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:426:1: label : LLABEL label RLABEL ;
    public final PLSQLTreeParser.label_return label() throws RecognitionException {
        PLSQLTreeParser.label_return retval = new PLSQLTreeParser.label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LLABEL352=null;
        Token RLABEL354=null;
        PLSQLTreeParser.label_return label353 = null;


        Object LLABEL352_tree=null;
        Object RLABEL354_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:426:7: ( LLABEL label RLABEL )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:427:9: LLABEL label RLABEL
            {
            root_0 = (Object)adaptor.nil();

            LLABEL352=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label2994); 
            LLABEL352_tree = (Object)adaptor.create(LLABEL352);
            adaptor.addChild(root_0, LLABEL352_tree);

            pushFollow(FOLLOW_label_in_label2996);
            label353=label();

            state._fsp--;

            adaptor.addChild(root_0, label353.getTree());
            RLABEL354=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label2998); 
            RLABEL354_tree = (Object)adaptor.create(RLABEL354);
            adaptor.addChild(root_0, RLABEL354_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:430:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQLTreeParser.qual_id_return qual_id() throws RecognitionException {
        PLSQLTreeParser.qual_id_return retval = new PLSQLTreeParser.qual_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON355=null;
        Token ID356=null;
        Token DOT357=null;
        Token COLON358=null;
        Token ID359=null;

        Object COLON355_tree=null;
        Object ID356_tree=null;
        Object DOT357_tree=null;
        Object COLON358_tree=null;
        Object ID359_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:430:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:2: ( COLON )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==COLON) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:2: COLON
                    {
                    COLON355=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id3012); 
                    COLON355_tree = (Object)adaptor.create(COLON355);
                    adaptor.addChild(root_0, COLON355_tree);


                    }
                    break;

            }

            ID356=(Token)match(input,ID,FOLLOW_ID_in_qual_id3015); 
            ID356_tree = (Object)adaptor.create(ID356);
            adaptor.addChild(root_0, ID356_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:12: ( DOT ( COLON )? ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==DOT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:14: DOT ( COLON )? ID
            	    {
            	    DOT357=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id3019); 
            	    DOT357_tree = (Object)adaptor.create(DOT357);
            	    adaptor.addChild(root_0, DOT357_tree);

            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:18: ( COLON )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==COLON) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:18: COLON
            	            {
            	            COLON358=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id3021); 
            	            COLON358_tree = (Object)adaptor.create(COLON358);
            	            adaptor.addChild(root_0, COLON358_tree);


            	            }
            	            break;

            	    }

            	    ID359=(Token)match(input,ID,FOLLOW_ID_in_qual_id3024); 
            	    ID359_tree = (Object)adaptor.create(ID359);
            	    adaptor.addChild(root_0, ID359_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:434:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQLTreeParser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQLTreeParser.sql_statement_return retval = new PLSQLTreeParser.sql_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.commit_statement_return commit_statement360 = null;

        PLSQLTreeParser.delete_statement_return delete_statement361 = null;

        PLSQLTreeParser.insert_statement_return insert_statement362 = null;

        PLSQLTreeParser.lock_table_statement_return lock_table_statement363 = null;

        PLSQLTreeParser.rollback_statement_return rollback_statement364 = null;

        PLSQLTreeParser.savepoint_statement_return savepoint_statement365 = null;

        PLSQLTreeParser.select_statement_return select_statement366 = null;

        PLSQLTreeParser.set_transaction_statement_return set_transaction_statement367 = null;

        PLSQLTreeParser.update_statement_return update_statement368 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:435:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:435:7: commit_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_statement_in_sql_statement3044);
                    commit_statement360=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement360.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:436:7: delete_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_statement_in_sql_statement3052);
                    delete_statement361=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement361.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:437:7: insert_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_statement_in_sql_statement3060);
                    insert_statement362=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement362.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:438:7: lock_table_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement3068);
                    lock_table_statement363=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement363.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:439:7: rollback_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_statement_in_sql_statement3076);
                    rollback_statement364=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement364.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:440:7: savepoint_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement3084);
                    savepoint_statement365=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement365.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:441:7: select_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_statement_in_sql_statement3092);
                    select_statement366=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement366.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:442:7: set_transaction_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement3100);
                    set_transaction_statement367=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement367.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:443:7: update_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_statement_in_sql_statement3108);
                    update_statement368=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement368.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:446:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQLTreeParser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQLTreeParser.commit_statement_return retval = new PLSQLTreeParser.commit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT369=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi370 = null;


        Object COMMIT369_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:446:18: ( COMMIT ( swallow_to_semi )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:447:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            COMMIT369=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement3129); 
            COMMIT369_tree = (Object)adaptor.create(COMMIT369);
            adaptor.addChild(root_0, COMMIT369_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:447:16: ( swallow_to_semi )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=PROC && LA111_1<=PROCEDURE)||(LA111_1>=FUNCTION && LA111_1<=Z)) ) {
                    alt111=1;
                }
                else if ( (LA111_1==ID) ) {
                    int LA111_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt111=1;
                    }
                }
            }
            else if ( ((LA111_0>=PROC && LA111_0<=DIVIDE)||LA111_0==PROCEDURE||(LA111_0>=FUNCTION && LA111_0<=Z)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:447:16: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement3131);
                    swallow_to_semi370=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi370.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:450:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQLTreeParser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQLTreeParser.delete_statement_return retval = new PLSQLTreeParser.delete_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE371=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi372 = null;


        Object DELETE371_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:450:18: ( DELETE swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:451:9: DELETE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            DELETE371=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement3153); 
            DELETE371_tree = (Object)adaptor.create(DELETE371);
            adaptor.addChild(root_0, DELETE371_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement3155);
            swallow_to_semi372=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi372.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:454:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQLTreeParser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQLTreeParser.insert_statement_return retval = new PLSQLTreeParser.insert_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT373=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi374 = null;


        Object INSERT373_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:454:18: ( INSERT swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:455:9: INSERT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            INSERT373=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement3176); 
            INSERT373_tree = (Object)adaptor.create(INSERT373);
            adaptor.addChild(root_0, INSERT373_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement3178);
            swallow_to_semi374=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi374.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:458:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQLTreeParser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQLTreeParser.lock_table_statement_return retval = new PLSQLTreeParser.lock_table_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOCK375=null;
        Token TABLE376=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi377 = null;


        Object LOCK375_tree=null;
        Object TABLE376_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:458:22: ( LOCK TABLE swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:459:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LOCK375=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement3199); 
            LOCK375_tree = (Object)adaptor.create(LOCK375);
            adaptor.addChild(root_0, LOCK375_tree);

            TABLE376=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement3201); 
            TABLE376_tree = (Object)adaptor.create(TABLE376);
            adaptor.addChild(root_0, TABLE376_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement3203);
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
    // $ANTLR end "lock_table_statement"

    public static class rollback_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_statement"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:462:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQLTreeParser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQLTreeParser.rollback_statement_return retval = new PLSQLTreeParser.rollback_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK378=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi379 = null;


        Object ROLLBACK378_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:462:20: ( ROLLBACK ( swallow_to_semi )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK378=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement3224); 
            ROLLBACK378_tree = (Object)adaptor.create(ROLLBACK378);
            adaptor.addChild(root_0, ROLLBACK378_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:18: ( swallow_to_semi )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ID) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==ID) ) {
                    int LA112_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt112=1;
                    }
                }
                else if ( ((LA112_1>=PROC && LA112_1<=PROCEDURE)||(LA112_1>=FUNCTION && LA112_1<=Z)) ) {
                    alt112=1;
                }
            }
            else if ( ((LA112_0>=PROC && LA112_0<=DIVIDE)||LA112_0==PROCEDURE||(LA112_0>=FUNCTION && LA112_0<=Z)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:463:18: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement3226);
                    swallow_to_semi379=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi379.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:466:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQLTreeParser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQLTreeParser.savepoint_statement_return retval = new PLSQLTreeParser.savepoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT380=null;
        Token ID381=null;

        Object SAVEPOINT380_tree=null;
        Object ID381_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:466:21: ( SAVEPOINT ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:467:9: SAVEPOINT ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT380=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement3248); 
            SAVEPOINT380_tree = (Object)adaptor.create(SAVEPOINT380);
            adaptor.addChild(root_0, SAVEPOINT380_tree);

            ID381=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement3250); 
            ID381_tree = (Object)adaptor.create(ID381);
            adaptor.addChild(root_0, ID381_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:470:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQLTreeParser.select_statement_return select_statement() throws RecognitionException {
        PLSQLTreeParser.select_statement_return retval = new PLSQLTreeParser.select_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT382=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi383 = null;


        Object SELECT382_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:470:18: ( SELECT swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:471:9: SELECT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SELECT382=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement3271); 
            SELECT382_tree = (Object)adaptor.create(SELECT382);
            adaptor.addChild(root_0, SELECT382_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_select_statement3273);
            swallow_to_semi383=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi383.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:474:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQLTreeParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQLTreeParser.set_transaction_statement_return retval = new PLSQLTreeParser.set_transaction_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET384=null;
        Token TRANSACTION385=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi386 = null;


        Object SET384_tree=null;
        Object TRANSACTION385_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:474:27: ( SET TRANSACTION swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:475:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SET384=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement3294); 
            SET384_tree = (Object)adaptor.create(SET384);
            adaptor.addChild(root_0, SET384_tree);

            TRANSACTION385=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement3296); 
            TRANSACTION385_tree = (Object)adaptor.create(TRANSACTION385);
            adaptor.addChild(root_0, TRANSACTION385_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement3298);
            swallow_to_semi386=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi386.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:478:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQLTreeParser.update_statement_return update_statement() throws RecognitionException {
        PLSQLTreeParser.update_statement_return retval = new PLSQLTreeParser.update_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE387=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi388 = null;


        Object UPDATE387_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:478:18: ( UPDATE swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:479:9: UPDATE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            UPDATE387=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement3319); 
            UPDATE387_tree = (Object)adaptor.create(UPDATE387);
            adaptor.addChild(root_0, UPDATE387_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_update_statement3321);
            swallow_to_semi388=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi388.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:482:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQLTreeParser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQLTreeParser.swallow_to_semi_return retval = new PLSQLTreeParser.swallow_to_semi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set389=null;

        Object set389_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:482:17: ( (~ ( SEMI ) )+ )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:9: (~ ( SEMI ) )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:9: (~ ( SEMI ) )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==ID) ) {
                    int LA113_2 = input.LA(2);

                    if ( (LA113_2==ID) ) {
                        int LA113_4 = input.LA(3);

                        if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                            alt113=1;
                        }


                    }
                    else if ( ((LA113_2>=PROC && LA113_2<=PROCEDURE)||(LA113_2>=FUNCTION && LA113_2<=Z)) ) {
                        alt113=1;
                    }


                }
                else if ( ((LA113_0>=PROC && LA113_0<=DIVIDE)||LA113_0==PROCEDURE||(LA113_0>=FUNCTION && LA113_0<=Z)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:483:9: ~ ( SEMI )
            	    {
            	    set389=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=Z) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set389));
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:486:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQLTreeParser.while_loop_statement_return retval = new PLSQLTreeParser.while_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE390=null;
        Token LOOP392=null;
        Token SEMI394=null;
        Token END395=null;
        Token LOOP396=null;
        PLSQLTreeParser.expression_return expression391 = null;

        PLSQLTreeParser.statement_return statement393 = null;

        PLSQLTreeParser.label_name_return label_name397 = null;


        Object WHILE390_tree=null;
        Object LOOP392_tree=null;
        Object SEMI394_tree=null;
        Object END395_tree=null;
        Object LOOP396_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:486:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            WHILE390=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3369); 
            WHILE390_tree = (Object)adaptor.create(WHILE390);
            adaptor.addChild(root_0, WHILE390_tree);

            pushFollow(FOLLOW_expression_in_while_loop_statement3371);
            expression391=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression391.getTree());
            LOOP392=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3373); 
            LOOP392_tree = (Object)adaptor.create(LOOP392);
            adaptor.addChild(root_0, LOOP392_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:31: ( statement SEMI )+
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:33: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3377);
            	    statement393=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement393.getTree());
            	    SEMI394=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3379); 
            	    SEMI394_tree = (Object)adaptor.create(SEMI394);
            	    adaptor.addChild(root_0, SEMI394_tree);


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

            END395=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3384); 
            END395_tree = (Object)adaptor.create(END395);
            adaptor.addChild(root_0, END395_tree);

            LOOP396=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3386); 
            LOOP396_tree = (Object)adaptor.create(LOOP396);
            adaptor.addChild(root_0, LOOP396_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:60: ( label_name )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ID) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:487:60: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3388);
                    label_name397=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name397.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:490:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQLTreeParser.match_parens_return match_parens() throws RecognitionException {
        PLSQLTreeParser.match_parens_return retval = new PLSQLTreeParser.match_parens_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set398=null;
        Token RPAREN399=null;
        Token LPAREN401=null;
        PLSQLTreeParser.match_parens_return match_parens400 = null;


        Object set398_tree=null;
        Object RPAREN399_tree=null;
        Object LPAREN401_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=PROC && LA117_0<=DIVIDE)||(LA117_0>=PROCEDURE && LA117_0<=COMMA)||(LA117_0>=NOCOPY && LA117_0<=CURSOR)||(LA117_0>=NOT && LA117_0<=RESULT_CACHE)||(LA117_0>=BEGIN && LA117_0<=Z)) ) {
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( ((LA116_0>=PROC && LA116_0<=DIVIDE)||(LA116_0>=PROCEDURE && LA116_0<=RETURN)||LA116_0==COMMA||(LA116_0>=NOCOPY && LA116_0<=CURSOR)||(LA116_0>=NOT && LA116_0<=RESULT_CACHE)||(LA116_0>=BEGIN && LA116_0<=Z)) ) {
                            alt116=1;
                        }
                        else if ( (LA116_0==LPAREN) ) {
                            alt116=2;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    set398=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=RESULT_CACHE)||(input.LA(1)>=BEGIN && input.LA(1)<=Z) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set398));
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:492:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    RPAREN399=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3457); 
                    RPAREN399_tree = (Object)adaptor.create(RPAREN399);
                    adaptor.addChild(root_0, RPAREN399_tree);

                    pushFollow(FOLLOW_match_parens_in_match_parens3459);
                    match_parens400=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens400.getTree());
                    LPAREN401=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3461); 
                    LPAREN401_tree = (Object)adaptor.create(LPAREN401);
                    adaptor.addChild(root_0, LPAREN401_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:1: label_name : ID ;
    public final PLSQLTreeParser.label_name_return label_name() throws RecognitionException {
        PLSQLTreeParser.label_name_return retval = new PLSQLTreeParser.label_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID402=null;

        Object ID402_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:11: ( ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID402=(Token)match(input,ID,FOLLOW_ID_in_label_name3473); 
            ID402_tree = (Object)adaptor.create(ID402);
            adaptor.addChild(root_0, ID402_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:497:1: expression : or_expr ;
    public final PLSQLTreeParser.expression_return expression() throws RecognitionException {
        PLSQLTreeParser.expression_return retval = new PLSQLTreeParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.or_expr_return or_expr403 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:498:5: ( or_expr )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:498:7: or_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_expression3485);
            or_expr403=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr403.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:501:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQLTreeParser.or_expr_return or_expr() throws RecognitionException {
        PLSQLTreeParser.or_expr_return retval = new PLSQLTreeParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR405=null;
        PLSQLTreeParser.and_expr_return and_expr404 = null;

        PLSQLTreeParser.and_expr_return and_expr406 = null;


        Object OR405_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:502:5: ( and_expr ( OR and_expr )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:502:7: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr3502);
            and_expr404=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr404.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:502:16: ( OR and_expr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==OR) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:502:18: OR and_expr
            	    {
            	    OR405=(Token)match(input,OR,FOLLOW_OR_in_or_expr3506); 
            	    OR405_tree = (Object)adaptor.create(OR405);
            	    adaptor.addChild(root_0, OR405_tree);

            	    pushFollow(FOLLOW_and_expr_in_or_expr3508);
            	    and_expr406=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr406.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:505:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQLTreeParser.and_expr_return and_expr() throws RecognitionException {
        PLSQLTreeParser.and_expr_return retval = new PLSQLTreeParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND408=null;
        PLSQLTreeParser.not_expr_return not_expr407 = null;

        PLSQLTreeParser.not_expr_return not_expr409 = null;


        Object AND408_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:506:5: ( not_expr ( AND not_expr )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:506:7: not_expr ( AND not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr3528);
            not_expr407=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr407.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:506:16: ( AND not_expr )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==AND) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:506:18: AND not_expr
            	    {
            	    AND408=(Token)match(input,AND,FOLLOW_AND_in_and_expr3532); 
            	    AND408_tree = (Object)adaptor.create(AND408);
            	    adaptor.addChild(root_0, AND408_tree);

            	    pushFollow(FOLLOW_not_expr_in_and_expr3534);
            	    not_expr409=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr409.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:509:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQLTreeParser.not_expr_return not_expr() throws RecognitionException {
        PLSQLTreeParser.not_expr_return retval = new PLSQLTreeParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT410=null;
        PLSQLTreeParser.compare_expr_return compare_expr411 = null;


        Object NOT410_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:510:5: ( ( NOT )? compare_expr )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:510:7: ( NOT )? compare_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:510:7: ( NOT )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==NOT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:510:7: NOT
                    {
                    NOT410=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3554); 
                    NOT410_tree = (Object)adaptor.create(NOT410);
                    adaptor.addChild(root_0, NOT410_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_compare_expr_in_not_expr3557);
            compare_expr411=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr411.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:513:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQLTreeParser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQLTreeParser.compare_expr_return retval = new PLSQLTreeParser.compare_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set413=null;
        PLSQLTreeParser.is_null_expr_return is_null_expr412 = null;

        PLSQLTreeParser.is_null_expr_return is_null_expr414 = null;


        Object set413_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:514:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:514:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_is_null_expr_in_compare_expr3574);
            is_null_expr412=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr412.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:514:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=EQ && LA121_0<=GEQ)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:514:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    set413=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set413));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3604);
                    is_null_expr414=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr414.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:517:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQLTreeParser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQLTreeParser.is_null_expr_return retval = new PLSQLTreeParser.is_null_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IS416=null;
        Token NOT417=null;
        Token NULL418=null;
        PLSQLTreeParser.like_expr_return like_expr415 = null;


        Object IS416_tree=null;
        Object NOT417_tree=null;
        Object NULL418_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:5: ( like_expr ( IS ( NOT )? NULL )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_like_expr_in_is_null_expr3624);
            like_expr415=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr415.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:17: ( IS ( NOT )? NULL )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IS) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:19: IS ( NOT )? NULL
                    {
                    IS416=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3628); 
                    IS416_tree = (Object)adaptor.create(IS416);
                    adaptor.addChild(root_0, IS416_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:22: ( NOT )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==NOT) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:518:22: NOT
                            {
                            NOT417=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3630); 
                            NOT417_tree = (Object)adaptor.create(NOT417);
                            adaptor.addChild(root_0, NOT417_tree);


                            }
                            break;

                    }

                    NULL418=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3633); 
                    NULL418_tree = (Object)adaptor.create(NULL418);
                    adaptor.addChild(root_0, NULL418_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:521:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQLTreeParser.like_expr_return like_expr() throws RecognitionException {
        PLSQLTreeParser.like_expr_return retval = new PLSQLTreeParser.like_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT420=null;
        Token LIKE421=null;
        PLSQLTreeParser.between_expr_return between_expr419 = null;

        PLSQLTreeParser.between_expr_return between_expr422 = null;


        Object NOT420_tree=null;
        Object LIKE421_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_between_expr_in_like_expr3652);
            between_expr419=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr419.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:20: ( ( NOT )? LIKE between_expr )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NOT||LA125_0==LIKE) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:22: ( NOT )? LIKE between_expr
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:22: ( NOT )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==NOT) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:522:22: NOT
                            {
                            NOT420=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3656); 
                            NOT420_tree = (Object)adaptor.create(NOT420);
                            adaptor.addChild(root_0, NOT420_tree);


                            }
                            break;

                    }

                    LIKE421=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3659); 
                    LIKE421_tree = (Object)adaptor.create(LIKE421);
                    adaptor.addChild(root_0, LIKE421_tree);

                    pushFollow(FOLLOW_between_expr_in_like_expr3661);
                    between_expr422=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr422.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:525:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQLTreeParser.between_expr_return between_expr() throws RecognitionException {
        PLSQLTreeParser.between_expr_return retval = new PLSQLTreeParser.between_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT424=null;
        Token BETWEEN425=null;
        Token AND427=null;
        PLSQLTreeParser.in_expr_return in_expr423 = null;

        PLSQLTreeParser.in_expr_return in_expr426 = null;

        PLSQLTreeParser.in_expr_return in_expr428 = null;


        Object NOT424_tree=null;
        Object BETWEEN425_tree=null;
        Object AND427_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_between_expr3681);
            in_expr423=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr423.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:17: ( NOT )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NOT) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:526:17: NOT
                            {
                            NOT424=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3685); 
                            NOT424_tree = (Object)adaptor.create(NOT424);
                            adaptor.addChild(root_0, NOT424_tree);


                            }
                            break;

                    }

                    BETWEEN425=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3688); 
                    BETWEEN425_tree = (Object)adaptor.create(BETWEEN425);
                    adaptor.addChild(root_0, BETWEEN425_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3690);
                    in_expr426=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr426.getTree());
                    AND427=(Token)match(input,AND,FOLLOW_AND_in_between_expr3692); 
                    AND427_tree = (Object)adaptor.create(AND427);
                    adaptor.addChild(root_0, AND427_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3694);
                    in_expr428=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr428.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:529:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQLTreeParser.in_expr_return in_expr() throws RecognitionException {
        PLSQLTreeParser.in_expr_return retval = new PLSQLTreeParser.in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT430=null;
        Token IN431=null;
        Token LPAREN432=null;
        Token COMMA434=null;
        Token RPAREN436=null;
        PLSQLTreeParser.add_expr_return add_expr429 = null;

        PLSQLTreeParser.add_expr_return add_expr433 = null;

        PLSQLTreeParser.add_expr_return add_expr435 = null;


        Object NOT430_tree=null;
        Object IN431_tree=null;
        Object LPAREN432_tree=null;
        Object COMMA434_tree=null;
        Object RPAREN436_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_in_expr3714);
            add_expr429=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr429.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:18: ( NOT )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==NOT) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:18: NOT
                            {
                            NOT430=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr3718); 
                            NOT430_tree = (Object)adaptor.create(NOT430);
                            adaptor.addChild(root_0, NOT430_tree);


                            }
                            break;

                    }

                    IN431=(Token)match(input,IN,FOLLOW_IN_in_in_expr3721); 
                    IN431_tree = (Object)adaptor.create(IN431);
                    adaptor.addChild(root_0, IN431_tree);

                    LPAREN432=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr3723); 
                    LPAREN432_tree = (Object)adaptor.create(LPAREN432);
                    adaptor.addChild(root_0, LPAREN432_tree);

                    pushFollow(FOLLOW_add_expr_in_in_expr3725);
                    add_expr433=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr433.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:42: ( COMMA add_expr )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==COMMA) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:530:44: COMMA add_expr
                    	    {
                    	    COMMA434=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr3729); 
                    	    COMMA434_tree = (Object)adaptor.create(COMMA434);
                    	    adaptor.addChild(root_0, COMMA434_tree);

                    	    pushFollow(FOLLOW_add_expr_in_in_expr3731);
                    	    add_expr435=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr435.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);

                    RPAREN436=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr3736); 
                    RPAREN436_tree = (Object)adaptor.create(RPAREN436);
                    adaptor.addChild(root_0, RPAREN436_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:533:1: numeric_expression : add_expr ;
    public final PLSQLTreeParser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQLTreeParser.numeric_expression_return retval = new PLSQLTreeParser.numeric_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.add_expr_return add_expr437 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:534:5: ( add_expr )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:534:7: add_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_numeric_expression3756);
            add_expr437=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr437.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:537:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQLTreeParser.add_expr_return add_expr() throws RecognitionException {
        PLSQLTreeParser.add_expr_return retval = new PLSQLTreeParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set439=null;
        PLSQLTreeParser.mul_expr_return mul_expr438 = null;

        PLSQLTreeParser.mul_expr_return mul_expr440 = null;


        Object set439_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:538:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:538:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_expr_in_add_expr3773);
            mul_expr438=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr438.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:538:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( ((LA131_0>=MINUS && LA131_0<=DOUBLEVERTBAR)) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:538:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    set439=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set439));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_expr_in_add_expr3791);
            	    mul_expr440=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr440.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:541:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQLTreeParser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQLTreeParser.mul_expr_return retval = new PLSQLTreeParser.mul_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK442=null;
        Token DIVIDE443=null;
        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr441 = null;

        PLSQLTreeParser.kMOD_return kMOD444 = null;

        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr445 = null;


        Object ASTERISK442_tree=null;
        Object DIVIDE443_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3811);
            unary_sign_expr441=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr441.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==DIVIDE||LA133_0==ID||LA133_0==ASTERISK) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:25: ( ASTERISK | DIVIDE | kMOD )
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
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:27: ASTERISK
            	            {
            	            ASTERISK442=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr3817); 
            	            ASTERISK442_tree = (Object)adaptor.create(ASTERISK442);
            	            adaptor.addChild(root_0, ASTERISK442_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:38: DIVIDE
            	            {
            	            DIVIDE443=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr3821); 
            	            DIVIDE443_tree = (Object)adaptor.create(DIVIDE443);
            	            adaptor.addChild(root_0, DIVIDE443_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:542:47: kMOD
            	            {
            	            pushFollow(FOLLOW_kMOD_in_mul_expr3825);
            	            kMOD444=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD444.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3829);
            	    unary_sign_expr445=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr445.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:545:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQLTreeParser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQLTreeParser.unary_sign_expr_return retval = new PLSQLTreeParser.unary_sign_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set446=null;
        PLSQLTreeParser.exponent_expr_return exponent_expr447 = null;


        Object set446_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:546:5: ( ( MINUS | PLUS )? exponent_expr )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:546:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:546:7: ( MINUS | PLUS )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=MINUS && LA134_0<=PLUS)) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
                    {
                    set446=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set446));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr3860);
            exponent_expr447=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr447.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:549:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQLTreeParser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQLTreeParser.exponent_expr_return retval = new PLSQLTreeParser.exponent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPONENT449=null;
        PLSQLTreeParser.atom_return atom448 = null;

        PLSQLTreeParser.atom_return atom450 = null;


        Object EXPONENT449_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:5: ( atom ( EXPONENT atom )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:7: atom ( EXPONENT atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_exponent_expr3877);
            atom448=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom448.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:12: ( EXPONENT atom )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EXPONENT) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:14: EXPONENT atom
                    {
                    EXPONENT449=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr3881); 
                    EXPONENT449_tree = (Object)adaptor.create(EXPONENT449);
                    adaptor.addChild(root_0, EXPONENT449_tree);

                    pushFollow(FOLLOW_atom_in_exponent_expr3883);
                    atom450=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom450.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:553:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQLTreeParser.atom_return atom() throws RecognitionException {
        PLSQLTreeParser.atom_return retval = new PLSQLTreeParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PERCENT452=null;
        Token SQL454=null;
        Token PERCENT455=null;
        Token NULL460=null;
        Token LPAREN461=null;
        Token RPAREN463=null;
        PLSQLTreeParser.variable_or_function_call_return variable_or_function_call451 = null;

        PLSQLTreeParser.attribute_return attribute453 = null;

        PLSQLTreeParser.attribute_return attribute456 = null;

        PLSQLTreeParser.string_literal_return string_literal457 = null;

        PLSQLTreeParser.numeric_atom_return numeric_atom458 = null;

        PLSQLTreeParser.boolean_atom_return boolean_atom459 = null;

        PLSQLTreeParser.expression_return expression462 = null;


        Object PERCENT452_tree=null;
        Object SQL454_tree=null;
        Object PERCENT455_tree=null;
        Object NULL460_tree=null;
        Object LPAREN461_tree=null;
        Object RPAREN463_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:554:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt137=7;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:554:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_or_function_call_in_atom3903);
                    variable_or_function_call451=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call451.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:554:33: ( PERCENT attribute )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==PERCENT) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:554:35: PERCENT attribute
                            {
                            PERCENT452=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3907); 
                            PERCENT452_tree = (Object)adaptor.create(PERCENT452);
                            adaptor.addChild(root_0, PERCENT452_tree);

                            pushFollow(FOLLOW_attribute_in_atom3909);
                            attribute453=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute453.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:555:7: SQL PERCENT attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    SQL454=(Token)match(input,SQL,FOLLOW_SQL_in_atom3920); 
                    SQL454_tree = (Object)adaptor.create(SQL454);
                    adaptor.addChild(root_0, SQL454_tree);

                    PERCENT455=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3922); 
                    PERCENT455_tree = (Object)adaptor.create(PERCENT455);
                    adaptor.addChild(root_0, PERCENT455_tree);

                    pushFollow(FOLLOW_attribute_in_atom3924);
                    attribute456=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute456.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:556:7: string_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_literal_in_atom3932);
                    string_literal457=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal457.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:557:7: numeric_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_atom_in_atom3940);
                    numeric_atom458=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom458.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:558:7: boolean_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_atom_in_atom3948);
                    boolean_atom459=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom459.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:559:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL460=(Token)match(input,NULL,FOLLOW_NULL_in_atom3956); 
                    NULL460_tree = (Object)adaptor.create(NULL460);
                    adaptor.addChild(root_0, NULL460_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:560:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN461=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3964); 
                    LPAREN461_tree = (Object)adaptor.create(LPAREN461);
                    adaptor.addChild(root_0, LPAREN461_tree);

                    pushFollow(FOLLOW_expression_in_atom3966);
                    expression462=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression462.getTree());
                    RPAREN463=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3968); 
                    RPAREN463_tree = (Object)adaptor.create(RPAREN463);
                    adaptor.addChild(root_0, RPAREN463_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:563:1: variable_or_function_call : variable_or_function_call_spec -> ^( PROC_CALL variable_or_function_call_spec ) ;
    public final PLSQLTreeParser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQLTreeParser.variable_or_function_call_return retval = new PLSQLTreeParser.variable_or_function_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.variable_or_function_call_spec_return variable_or_function_call_spec464 = null;


        RewriteRuleSubtreeStream stream_variable_or_function_call_spec=new RewriteRuleSubtreeStream(adaptor,"rule variable_or_function_call_spec");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:564:5: ( variable_or_function_call_spec -> ^( PROC_CALL variable_or_function_call_spec ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:564:7: variable_or_function_call_spec
            {
            pushFollow(FOLLOW_variable_or_function_call_spec_in_variable_or_function_call3989);
            variable_or_function_call_spec464=variable_or_function_call_spec();

            state._fsp--;

            stream_variable_or_function_call_spec.add(variable_or_function_call_spec464.getTree());


            // AST REWRITE
            // elements: variable_or_function_call_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 564:38: -> ^( PROC_CALL variable_or_function_call_spec )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:564:41: ^( PROC_CALL variable_or_function_call_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC_CALL, "PROC_CALL"), root_1);

                adaptor.addChild(root_1, stream_variable_or_function_call_spec.nextTree());

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
    // $ANTLR end "variable_or_function_call"

    public static class variable_or_function_call_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_function_call_spec"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:567:1: variable_or_function_call_spec : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQLTreeParser.variable_or_function_call_spec_return variable_or_function_call_spec() throws RecognitionException {
        PLSQLTreeParser.variable_or_function_call_spec_return retval = new PLSQLTreeParser.variable_or_function_call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT466=null;
        Token DOT468=null;
        PLSQLTreeParser.call_return call465 = null;

        PLSQLTreeParser.call_return call467 = null;

        PLSQLTreeParser.delete_call_return delete_call469 = null;


        Object DOT466_tree=null;
        Object DOT468_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:2: ( call ( DOT call )* ( DOT delete_call )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:3: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_variable_or_function_call_spec4014);
            call465=call();

            state._fsp--;

            adaptor.addChild(root_0, call465.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:8: ( DOT call )*
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
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:10: DOT call
            	    {
            	    DOT466=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call_spec4018); 
            	    DOT466_tree = (Object)adaptor.create(DOT466);
            	    adaptor.addChild(root_0, DOT466_tree);

            	    pushFollow(FOLLOW_call_in_variable_or_function_call_spec4020);
            	    call467=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call467.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:22: ( DOT delete_call )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==DOT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:24: DOT delete_call
                    {
                    DOT468=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call_spec4027); 
                    DOT468_tree = (Object)adaptor.create(DOT468);
                    adaptor.addChild(root_0, DOT468_tree);

                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call_spec4029);
                    delete_call469=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call469.getTree());

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
    // $ANTLR end "variable_or_function_call_spec"

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:570:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQLTreeParser.attribute_return attribute() throws RecognitionException {
        PLSQLTreeParser.attribute_return retval = new PLSQLTreeParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK_ROWCOUNT470=null;
        Token LPAREN471=null;
        Token RPAREN473=null;
        Token ISOPEN475=null;
        Token NOTFOUND476=null;
        PLSQLTreeParser.expression_return expression472 = null;

        PLSQLTreeParser.kFOUND_return kFOUND474 = null;

        PLSQLTreeParser.kROWCOUNT_return kROWCOUNT477 = null;


        Object BULK_ROWCOUNT470_tree=null;
        Object LPAREN471_tree=null;
        Object RPAREN473_tree=null;
        Object ISOPEN475_tree=null;
        Object NOTFOUND476_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:571:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:571:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    BULK_ROWCOUNT470=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute4045); 
                    BULK_ROWCOUNT470_tree = (Object)adaptor.create(BULK_ROWCOUNT470);
                    adaptor.addChild(root_0, BULK_ROWCOUNT470_tree);

                    LPAREN471=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute4047); 
                    LPAREN471_tree = (Object)adaptor.create(LPAREN471);
                    adaptor.addChild(root_0, LPAREN471_tree);

                    pushFollow(FOLLOW_expression_in_attribute4049);
                    expression472=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression472.getTree());
                    RPAREN473=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute4051); 
                    RPAREN473_tree = (Object)adaptor.create(RPAREN473);
                    adaptor.addChild(root_0, RPAREN473_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:572:7: kFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kFOUND_in_attribute4059);
                    kFOUND474=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND474.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:7: ISOPEN
                    {
                    root_0 = (Object)adaptor.nil();

                    ISOPEN475=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute4067); 
                    ISOPEN475_tree = (Object)adaptor.create(ISOPEN475);
                    adaptor.addChild(root_0, ISOPEN475_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:574:7: NOTFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTFOUND476=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute4075); 
                    NOTFOUND476_tree = (Object)adaptor.create(NOTFOUND476);
                    adaptor.addChild(root_0, NOTFOUND476_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:575:7: kROWCOUNT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kROWCOUNT_in_attribute4083);
                    kROWCOUNT477=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT477.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:578:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQLTreeParser.call_args_return call_args() throws RecognitionException {
        PLSQLTreeParser.call_args_return retval = new PLSQLTreeParser.call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN478=null;
        Token COMMA480=null;
        Token RPAREN482=null;
        PLSQLTreeParser.parameter_return parameter479 = null;

        PLSQLTreeParser.parameter_return parameter481 = null;


        Object LPAREN478_tree=null;
        Object COMMA480_tree=null;
        Object RPAREN482_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN478=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args4100); 
            LPAREN478_tree = (Object)adaptor.create(LPAREN478);
            adaptor.addChild(root_0, LPAREN478_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:14: ( parameter ( COMMA parameter )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ID||LA142_0==LPAREN||(LA142_0>=NOT && LA142_0<=NULL)||LA142_0==COLON||(LA142_0>=MINUS && LA142_0<=PLUS)||LA142_0==SQL||(LA142_0>=INTEGER && LA142_0<=QUOTED_STRING)||(LA142_0>=INSERTING && LA142_0<=DELETING)) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:16: parameter ( COMMA parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_call_args4104);
                    parameter479=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter479.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:26: ( COMMA parameter )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==COMMA) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:28: COMMA parameter
                    	    {
                    	    COMMA480=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args4108); 
                    	    COMMA480_tree = (Object)adaptor.create(COMMA480);
                    	    adaptor.addChild(root_0, COMMA480_tree);

                    	    pushFollow(FOLLOW_parameter_in_call_args4110);
                    	    parameter481=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter481.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN482=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args4118); 
            RPAREN482_tree = (Object)adaptor.create(RPAREN482);
            adaptor.addChild(root_0, RPAREN482_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:582:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQLTreeParser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQLTreeParser.boolean_atom_return retval = new PLSQLTreeParser.boolean_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.boolean_literal_return boolean_literal483 = null;

        PLSQLTreeParser.collection_exists_return collection_exists484 = null;

        PLSQLTreeParser.conditional_predicate_return conditional_predicate485 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:5: ( boolean_literal | collection_exists | conditional_predicate )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:7: boolean_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom4135);
                    boolean_literal483=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal483.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:584:7: collection_exists
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collection_exists_in_boolean_atom4143);
                    collection_exists484=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists484.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:585:7: conditional_predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom4151);
                    conditional_predicate485=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate485.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:588:1: numeric_atom : numeric_literal ;
    public final PLSQLTreeParser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQLTreeParser.numeric_atom_return retval = new PLSQLTreeParser.numeric_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.numeric_literal_return numeric_literal486 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:5: ( numeric_literal )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:589:7: numeric_literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_numeric_literal_in_numeric_atom4168);
            numeric_literal486=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal486.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:592:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQLTreeParser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQLTreeParser.numeric_literal_return retval = new PLSQLTreeParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set487=null;

        Object set487_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:593:5: ( INTEGER | REAL_NUMBER )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set487=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set487));
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQLTreeParser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQLTreeParser.boolean_literal_return retval = new PLSQLTreeParser.boolean_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set488=null;

        Object set488_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:598:5: ( TRUE | FALSE )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set488=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set488));
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:602:1: string_literal : QUOTED_STRING -> ^( STRING QUOTED_STRING ) ;
    public final PLSQLTreeParser.string_literal_return string_literal() throws RecognitionException {
        PLSQLTreeParser.string_literal_return retval = new PLSQLTreeParser.string_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTED_STRING489=null;

        Object QUOTED_STRING489_tree=null;
        RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:603:5: ( QUOTED_STRING -> ^( STRING QUOTED_STRING ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:603:7: QUOTED_STRING
            {
            QUOTED_STRING489=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal4235);  
            stream_QUOTED_STRING.add(QUOTED_STRING489);



            // AST REWRITE
            // elements: QUOTED_STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 603:21: -> ^( STRING QUOTED_STRING )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:603:24: ^( STRING QUOTED_STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING, "STRING"), root_1);

                adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());

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
    // $ANTLR end "string_literal"

    public static class collection_exists_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_exists"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQLTreeParser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQLTreeParser.collection_exists_return retval = new PLSQLTreeParser.collection_exists_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID490=null;
        Token DOT491=null;
        Token EXISTS492=null;
        Token LPAREN493=null;
        Token RPAREN495=null;
        PLSQLTreeParser.expression_return expression494 = null;


        Object ID490_tree=null;
        Object DOT491_tree=null;
        Object EXISTS492_tree=null;
        Object LPAREN493_tree=null;
        Object RPAREN495_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            ID490=(Token)match(input,ID,FOLLOW_ID_in_collection_exists4260); 
            ID490_tree = (Object)adaptor.create(ID490);
            adaptor.addChild(root_0, ID490_tree);

            DOT491=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists4262); 
            DOT491_tree = (Object)adaptor.create(DOT491);
            adaptor.addChild(root_0, DOT491_tree);

            EXISTS492=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists4264); 
            EXISTS492_tree = (Object)adaptor.create(EXISTS492);
            adaptor.addChild(root_0, EXISTS492_tree);

            LPAREN493=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists4266); 
            LPAREN493_tree = (Object)adaptor.create(LPAREN493);
            adaptor.addChild(root_0, LPAREN493_tree);

            pushFollow(FOLLOW_expression_in_collection_exists4268);
            expression494=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression494.getTree());
            RPAREN495=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists4270); 
            RPAREN495_tree = (Object)adaptor.create(RPAREN495);
            adaptor.addChild(root_0, RPAREN495_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:610:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQLTreeParser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQLTreeParser.conditional_predicate_return retval = new PLSQLTreeParser.conditional_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERTING496=null;
        Token UPDATING497=null;
        Token LPAREN498=null;
        Token QUOTED_STRING499=null;
        Token RPAREN500=null;
        Token DELETING501=null;

        Object INSERTING496_tree=null;
        Object UPDATING497_tree=null;
        Object LPAREN498_tree=null;
        Object QUOTED_STRING499_tree=null;
        Object RPAREN500_tree=null;
        Object DELETING501_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:7: INSERTING
                    {
                    root_0 = (Object)adaptor.nil();

                    INSERTING496=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate4287); 
                    INSERTING496_tree = (Object)adaptor.create(INSERTING496);
                    adaptor.addChild(root_0, INSERTING496_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UPDATING497=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate4295); 
                    UPDATING497_tree = (Object)adaptor.create(UPDATING497);
                    adaptor.addChild(root_0, UPDATING497_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LPAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:612:18: LPAREN QUOTED_STRING RPAREN
                            {
                            LPAREN498=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate4299); 
                            LPAREN498_tree = (Object)adaptor.create(LPAREN498);
                            adaptor.addChild(root_0, LPAREN498_tree);

                            QUOTED_STRING499=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate4301); 
                            QUOTED_STRING499_tree = (Object)adaptor.create(QUOTED_STRING499);
                            adaptor.addChild(root_0, QUOTED_STRING499_tree);

                            RPAREN500=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate4303); 
                            RPAREN500_tree = (Object)adaptor.create(RPAREN500);
                            adaptor.addChild(root_0, RPAREN500_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:613:7: DELETING
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETING501=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate4314); 
                    DELETING501_tree = (Object)adaptor.create(DELETING501);
                    adaptor.addChild(root_0, DELETING501_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:616:1: parameter : ( ID ARROW )? expression ;
    public final PLSQLTreeParser.parameter_return parameter() throws RecognitionException {
        PLSQLTreeParser.parameter_return retval = new PLSQLTreeParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID502=null;
        Token ARROW503=null;
        PLSQLTreeParser.expression_return expression504 = null;


        Object ID502_tree=null;
        Object ARROW503_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:617:5: ( ( ID ARROW )? expression )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:617:7: ( ID ARROW )? expression
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:617:7: ( ID ARROW )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:617:9: ID ARROW
                    {
                    ID502=(Token)match(input,ID,FOLLOW_ID_in_parameter4333); 
                    ID502_tree = (Object)adaptor.create(ID502);
                    adaptor.addChild(root_0, ID502_tree);

                    ARROW503=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter4335); 
                    ARROW503_tree = (Object)adaptor.create(ARROW503);
                    adaptor.addChild(root_0, ARROW503_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_parameter4340);
            expression504=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression504.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:620:1: index : expression ;
    public final PLSQLTreeParser.index_return index() throws RecognitionException {
        PLSQLTreeParser.index_return retval = new PLSQLTreeParser.index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.expression_return expression505 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:5: ( expression )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_index4357);
            expression505=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression505.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:624:1: create_package : CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? is_as ( declare_section )? END ( ID )? SEMI ;
    public final PLSQLTreeParser.create_package_return create_package() throws RecognitionException {
        PLSQLTreeParser.create_package_return retval = new PLSQLTreeParser.create_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token CREATE506=null;
        Token OR507=null;
        Token PACKAGE509=null;
        Token DOT510=null;
        Token END514=null;
        Token ID515=null;
        Token SEMI516=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE508 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause511 = null;

        PLSQLTreeParser.is_as_return is_as512 = null;

        PLSQLTreeParser.declare_section_return declare_section513 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object CREATE506_tree=null;
        Object OR507_tree=null;
        Object PACKAGE509_tree=null;
        Object DOT510_tree=null;
        Object END514_tree=null;
        Object ID515_tree=null;
        Object SEMI516_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:624:16: ( CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? is_as ( declare_section )? END ( ID )? SEMI )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:9: CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? is_as ( declare_section )? END ( ID )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE506=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package4378); 
            CREATE506_tree = (Object)adaptor.create(CREATE506);
            adaptor.addChild(root_0, CREATE506_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:16: ( OR kREPLACE )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==OR) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:18: OR kREPLACE
                    {
                    OR507=(Token)match(input,OR,FOLLOW_OR_in_create_package4382); 
                    OR507_tree = (Object)adaptor.create(OR507);
                    adaptor.addChild(root_0, OR507_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package4384);
                    kREPLACE508=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE508.getTree());

                    }
                    break;

            }

            PACKAGE509=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package4389); 
            PACKAGE509_tree = (Object)adaptor.create(PACKAGE509);
            adaptor.addChild(root_0, PACKAGE509_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:41: (schema_name= ID DOT )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:43: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4395); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT510=(Token)match(input,DOT,FOLLOW_DOT_in_create_package4397); 
                    DOT510_tree = (Object)adaptor.create(DOT510);
                    adaptor.addChild(root_0, DOT510_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4404); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:9: ( invoker_rights_clause )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AUTHID) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:11: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4416);
                    invoker_rights_clause511=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause511.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_is_as_in_create_package4429);
            is_as512=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as512.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:15: ( declare_section )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=PROCEDURE && LA150_0<=FUNCTION)||LA150_0==CURSOR||LA150_0==SUBTYPE||LA150_0==PRAGMA) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:17: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package4433);
                    declare_section513=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section513.getTree());

                    }
                    break;

            }

            END514=(Token)match(input,END,FOLLOW_END_in_create_package4438); 
            END514_tree = (Object)adaptor.create(END514);
            adaptor.addChild(root_0, END514_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:40: ( ID )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:42: ID
                    {
                    ID515=(Token)match(input,ID,FOLLOW_ID_in_create_package4442); 
                    ID515_tree = (Object)adaptor.create(ID515);
                    adaptor.addChild(root_0, ID515_tree);


                    }
                    break;

            }

            SEMI516=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4447); 
            SEMI516_tree = (Object)adaptor.create(SEMI516);
            adaptor.addChild(root_0, SEMI516_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:630:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID is_as ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLTreeParser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQLTreeParser.create_package_body_return retval = new PLSQLTreeParser.create_package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token package_name2=null;
        Token CREATE517=null;
        Token OR518=null;
        Token PACKAGE520=null;
        Token BODY521=null;
        Token DOT522=null;
        Token END525=null;
        Token SEMI526=null;
        PLSQLTreeParser.body_return initialize_section = null;

        PLSQLTreeParser.kREPLACE_return kREPLACE519 = null;

        PLSQLTreeParser.is_as_return is_as523 = null;

        PLSQLTreeParser.declare_section_return declare_section524 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object package_name2_tree=null;
        Object CREATE517_tree=null;
        Object OR518_tree=null;
        Object PACKAGE520_tree=null;
        Object BODY521_tree=null;
        Object DOT522_tree=null;
        Object END525_tree=null;
        Object SEMI526_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:630:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID is_as ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID is_as ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE517=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4468); 
            CREATE517_tree = (Object)adaptor.create(CREATE517);
            adaptor.addChild(root_0, CREATE517_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:16: ( OR kREPLACE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==OR) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:18: OR kREPLACE
                    {
                    OR518=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4472); 
                    OR518_tree = (Object)adaptor.create(OR518);
                    adaptor.addChild(root_0, OR518_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4474);
                    kREPLACE519=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE519.getTree());

                    }
                    break;

            }

            PACKAGE520=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4479); 
            PACKAGE520_tree = (Object)adaptor.create(PACKAGE520);
            adaptor.addChild(root_0, PACKAGE520_tree);

            BODY521=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4481); 
            BODY521_tree = (Object)adaptor.create(BODY521);
            adaptor.addChild(root_0, BODY521_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:46: (schema_name= ID DOT )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:48: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4487); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT522=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4489); 
                    DOT522_tree = (Object)adaptor.create(DOT522);
                    adaptor.addChild(root_0, DOT522_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4496); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            pushFollow(FOLLOW_is_as_in_create_package_body4506);
            is_as523=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as523.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:15: ( declare_section )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=PROCEDURE && LA154_0<=FUNCTION)||LA154_0==CURSOR||LA154_0==SUBTYPE||LA154_0==PRAGMA) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:17: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package_body4510);
                    declare_section524=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section524.getTree());

                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:9: (initialize_section= body | END (package_name2= ID )? )
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:11: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_create_package_body4527);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:37: END (package_name2= ID )?
                    {
                    END525=(Token)match(input,END,FOLLOW_END_in_create_package_body4531); 
                    END525_tree = (Object)adaptor.create(END525);
                    adaptor.addChild(root_0, END525_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:41: (package_name2= ID )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==ID) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:43: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4537); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI526=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4552); 
            SEMI526_tree = (Object)adaptor.create(SEMI526);
            adaptor.addChild(root_0, SEMI526_tree);


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

    public static class package_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_body"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:1: package_body : PACKAGE BODY package_body_spec -> ^( PACK PACKAGE BODY package_body_spec ) ;
    public final PLSQLTreeParser.package_body_return package_body() throws RecognitionException {
        PLSQLTreeParser.package_body_return retval = new PLSQLTreeParser.package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PACKAGE527=null;
        Token BODY528=null;
        PLSQLTreeParser.package_body_spec_return package_body_spec529 = null;


        Object PACKAGE527_tree=null;
        Object BODY528_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_BODY=new RewriteRuleTokenStream(adaptor,"token BODY");
        RewriteRuleSubtreeStream stream_package_body_spec=new RewriteRuleSubtreeStream(adaptor,"rule package_body_spec");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:14: ( PACKAGE BODY package_body_spec -> ^( PACK PACKAGE BODY package_body_spec ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:9: PACKAGE BODY package_body_spec
            {
            PACKAGE527=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_body4573);  
            stream_PACKAGE.add(PACKAGE527);

            BODY528=(Token)match(input,BODY,FOLLOW_BODY_in_package_body4575);  
            stream_BODY.add(BODY528);

            pushFollow(FOLLOW_package_body_spec_in_package_body4577);
            package_body_spec529=package_body_spec();

            state._fsp--;

            stream_package_body_spec.add(package_body_spec529.getTree());


            // AST REWRITE
            // elements: package_body_spec, PACKAGE, BODY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 638:40: -> ^( PACK PACKAGE BODY package_body_spec )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:43: ^( PACK PACKAGE BODY package_body_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACK, "PACK"), root_1);

                adaptor.addChild(root_1, stream_PACKAGE.nextNode());
                adaptor.addChild(root_1, stream_BODY.nextNode());
                adaptor.addChild(root_1, stream_package_body_spec.nextTree());

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
    // $ANTLR end "package_body"

    public static class package_body_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_body_spec"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:641:1: package_body_spec : package_body_name is_as ( declare_section )? package_body_end ;
    public final PLSQLTreeParser.package_body_spec_return package_body_spec() throws RecognitionException {
        PLSQLTreeParser.package_body_spec_return retval = new PLSQLTreeParser.package_body_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.package_body_name_return package_body_name530 = null;

        PLSQLTreeParser.is_as_return is_as531 = null;

        PLSQLTreeParser.declare_section_return declare_section532 = null;

        PLSQLTreeParser.package_body_end_return package_body_end533 = null;



        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:642:2: ( package_body_name is_as ( declare_section )? package_body_end )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:642:4: package_body_name is_as ( declare_section )? package_body_end
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_package_body_name_in_package_body_spec4604);
            package_body_name530=package_body_name();

            state._fsp--;

            adaptor.addChild(root_0, package_body_name530.getTree());
            pushFollow(FOLLOW_is_as_in_package_body_spec4614);
            is_as531=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as531.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:15: ( declare_section )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( ((LA157_0>=PROCEDURE && LA157_0<=FUNCTION)||LA157_0==CURSOR||LA157_0==SUBTYPE||LA157_0==PRAGMA) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:17: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_package_body_spec4618);
                    declare_section532=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section532.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_package_body_end_in_package_body_spec4631);
            package_body_end533=package_body_end();

            state._fsp--;

            adaptor.addChild(root_0, package_body_end533.getTree());

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
    // $ANTLR end "package_body_spec"

    public static class package_body_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_body_name"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:647:1: package_body_name : package_body_name_spec -> ^( PACKNAME package_body_name_spec ) ;
    public final PLSQLTreeParser.package_body_name_return package_body_name() throws RecognitionException {
        PLSQLTreeParser.package_body_name_return retval = new PLSQLTreeParser.package_body_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.package_body_name_spec_return package_body_name_spec534 = null;


        RewriteRuleSubtreeStream stream_package_body_name_spec=new RewriteRuleSubtreeStream(adaptor,"rule package_body_name_spec");
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:2: ( package_body_name_spec -> ^( PACKNAME package_body_name_spec ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:4: package_body_name_spec
            {
            pushFollow(FOLLOW_package_body_name_spec_in_package_body_name4642);
            package_body_name_spec534=package_body_name_spec();

            state._fsp--;

            stream_package_body_name_spec.add(package_body_name_spec534.getTree());


            // AST REWRITE
            // elements: package_body_name_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 648:27: -> ^( PACKNAME package_body_name_spec )
            {
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:30: ^( PACKNAME package_body_name_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKNAME, "PACKNAME"), root_1);

                adaptor.addChild(root_1, stream_package_body_name_spec.nextTree());

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
    // $ANTLR end "package_body_name"

    public static class package_body_name_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_body_name_spec"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:651:1: package_body_name_spec : (schema_name= ID DOT )? package_name= ID ;
    public final PLSQLTreeParser.package_body_name_spec_return package_body_name_spec() throws RecognitionException {
        PLSQLTreeParser.package_body_name_spec_return retval = new PLSQLTreeParser.package_body_name_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token DOT535=null;

        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object DOT535_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:652:2: ( (schema_name= ID DOT )? package_name= ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:652:4: (schema_name= ID DOT )? package_name= ID
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:652:4: (schema_name= ID DOT )?
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
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:652:6: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_package_body_name_spec4665); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT535=(Token)match(input,DOT,FOLLOW_DOT_in_package_body_name_spec4667); 
                    DOT535_tree = (Object)adaptor.create(DOT535);
                    adaptor.addChild(root_0, DOT535_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_package_body_name_spec4674); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);


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
    // $ANTLR end "package_body_name_spec"

    public static class package_body_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_body_end"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:655:1: package_body_end : (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLTreeParser.package_body_end_return package_body_end() throws RecognitionException {
        PLSQLTreeParser.package_body_end_return retval = new PLSQLTreeParser.package_body_end_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token package_name2=null;
        Token END536=null;
        Token SEMI537=null;
        PLSQLTreeParser.body_return initialize_section = null;


        Object package_name2_tree=null;
        Object END536_tree=null;
        Object SEMI537_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:2: ( (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:4: (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:4: (initialize_section= body | END (package_name2= ID )? )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==BEGIN) ) {
                alt160=1;
            }
            else if ( (LA160_0==END) ) {
                alt160=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:6: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_package_body_end4690);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:32: END (package_name2= ID )?
                    {
                    END536=(Token)match(input,END,FOLLOW_END_in_package_body_end4694); 
                    END536_tree = (Object)adaptor.create(END536);
                    adaptor.addChild(root_0, END536_tree);

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:36: (package_name2= ID )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==ID) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:656:38: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_package_body_end4700); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI537=(Token)match(input,SEMI,FOLLOW_SEMI_in_package_body_end4715); 
            SEMI537_tree = (Object)adaptor.create(SEMI537);
            adaptor.addChild(root_0, SEMI537_tree);


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
    // $ANTLR end "package_body_end"

    public static class create_procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_procedure"
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:660:1: create_procedure : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQLTreeParser.create_procedure_return retval = new PLSQLTreeParser.create_procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token procedure_name=null;
        Token CREATE538=null;
        Token OR539=null;
        Token PROCEDURE541=null;
        Token DOT542=null;
        Token LPAREN543=null;
        Token COMMA545=null;
        Token RPAREN547=null;
        Token EXTERNAL553=null;
        Token SEMI554=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE540 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration544 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration546 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause548 = null;

        PLSQLTreeParser.is_as_return is_as549 = null;

        PLSQLTreeParser.declare_section_return declare_section550 = null;

        PLSQLTreeParser.body_return body551 = null;

        PLSQLTreeParser.call_spec_return call_spec552 = null;


        Object schema_name_tree=null;
        Object procedure_name_tree=null;
        Object CREATE538_tree=null;
        Object OR539_tree=null;
        Object PROCEDURE541_tree=null;
        Object DOT542_tree=null;
        Object LPAREN543_tree=null;
        Object COMMA545_tree=null;
        Object RPAREN547_tree=null;
        Object EXTERNAL553_tree=null;
        Object SEMI554_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:660:18: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:661:9: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE538=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4733); 
            CREATE538_tree = (Object)adaptor.create(CREATE538);
            adaptor.addChild(root_0, CREATE538_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:661:16: ( OR kREPLACE )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==OR) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:661:18: OR kREPLACE
                    {
                    OR539=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4737); 
                    OR539_tree = (Object)adaptor.create(OR539);
                    adaptor.addChild(root_0, OR539_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4739);
                    kREPLACE540=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE540.getTree());

                    }
                    break;

            }

            PROCEDURE541=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4744); 
            PROCEDURE541_tree = (Object)adaptor.create(PROCEDURE541);
            adaptor.addChild(root_0, PROCEDURE541_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:661:43: (schema_name= ID DOT )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==ID) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==DOT) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:661:45: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4750); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT542=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4752); 
                    DOT542_tree = (Object)adaptor.create(DOT542);
                    adaptor.addChild(root_0, DOT542_tree);


                    }
                    break;

            }

            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4759); 
            procedure_name_tree = (Object)adaptor.create(procedure_name);
            adaptor.addChild(root_0, procedure_name_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==LPAREN) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN543=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_procedure4771); 
                    LPAREN543_tree = (Object)adaptor.create(LPAREN543);
                    adaptor.addChild(root_0, LPAREN543_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4773);
                    parameter_declaration544=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration544.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:40: ( COMMA parameter_declaration )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==COMMA) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:42: COMMA parameter_declaration
                    	    {
                    	    COMMA545=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_procedure4777); 
                    	    COMMA545_tree = (Object)adaptor.create(COMMA545);
                    	    adaptor.addChild(root_0, COMMA545_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4779);
                    	    parameter_declaration546=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration546.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    RPAREN547=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_procedure4784); 
                    RPAREN547_tree = (Object)adaptor.create(RPAREN547);
                    adaptor.addChild(root_0, RPAREN547_tree);


                    }
                    break;

            }

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:663:9: ( invoker_rights_clause )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==AUTHID) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:663:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4797);
                    invoker_rights_clause548=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause548.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_is_as_in_create_procedure4808);
            is_as549=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as549.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt167=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt167=1;
                }
                break;
            case LANGUAGE:
                {
                alt167=2;
                }
                break;
            case EXTERNAL:
                {
                alt167=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:11: ( declare_section )? body
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:11: ( declare_section )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( ((LA166_0>=PROCEDURE && LA166_0<=FUNCTION)||LA166_0==CURSOR||LA166_0==SUBTYPE||LA166_0==PRAGMA) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_procedure4820);
                            declare_section550=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section550.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_procedure4823);
                    body551=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body551.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:666:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_procedure4835);
                    call_spec552=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec552.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:667:11: EXTERNAL
                    {
                    EXTERNAL553=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure4847); 
                    EXTERNAL553_tree = (Object)adaptor.create(EXTERNAL553);
                    adaptor.addChild(root_0, EXTERNAL553_tree);


                    }
                    break;

            }

            SEMI554=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure4859); 
            SEMI554_tree = (Object)adaptor.create(SEMI554);
            adaptor.addChild(root_0, SEMI554_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:671:1: create_function : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_function_return create_function() throws RecognitionException {
        PLSQLTreeParser.create_function_return retval = new PLSQLTreeParser.create_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token function_name=null;
        Token CREATE555=null;
        Token OR556=null;
        Token FUNCTION558=null;
        Token DOT559=null;
        Token LPAREN560=null;
        Token COMMA562=null;
        Token RPAREN564=null;
        Token RETURN565=null;
        Token EXTERNAL572=null;
        Token SEMI573=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE557 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration561 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration563 = null;

        PLSQLTreeParser.datatype_return datatype566 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause567 = null;

        PLSQLTreeParser.is_as_return is_as568 = null;

        PLSQLTreeParser.declare_section_return declare_section569 = null;

        PLSQLTreeParser.body_return body570 = null;

        PLSQLTreeParser.call_spec_return call_spec571 = null;


        Object schema_name_tree=null;
        Object function_name_tree=null;
        Object CREATE555_tree=null;
        Object OR556_tree=null;
        Object FUNCTION558_tree=null;
        Object DOT559_tree=null;
        Object LPAREN560_tree=null;
        Object COMMA562_tree=null;
        Object RPAREN564_tree=null;
        Object RETURN565_tree=null;
        Object EXTERNAL572_tree=null;
        Object SEMI573_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:671:17: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:9: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? is_as ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE555=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function4880); 
            CREATE555_tree = (Object)adaptor.create(CREATE555);
            adaptor.addChild(root_0, CREATE555_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:16: ( OR kREPLACE )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==OR) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:18: OR kREPLACE
                    {
                    OR556=(Token)match(input,OR,FOLLOW_OR_in_create_function4884); 
                    OR556_tree = (Object)adaptor.create(OR556);
                    adaptor.addChild(root_0, OR556_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_function4886);
                    kREPLACE557=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE557.getTree());

                    }
                    break;

            }

            FUNCTION558=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function4891); 
            FUNCTION558_tree = (Object)adaptor.create(FUNCTION558);
            adaptor.addChild(root_0, FUNCTION558_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:42: (schema_name= ID DOT )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==ID) ) {
                int LA169_1 = input.LA(2);

                if ( (LA169_1==DOT) ) {
                    alt169=1;
                }
            }
            switch (alt169) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:44: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4897); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT559=(Token)match(input,DOT,FOLLOW_DOT_in_create_function4899); 
                    DOT559_tree = (Object)adaptor.create(DOT559);
                    adaptor.addChild(root_0, DOT559_tree);


                    }
                    break;

            }

            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4906); 
            function_name_tree = (Object)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==LPAREN) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN560=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_function4918); 
                    LPAREN560_tree = (Object)adaptor.create(LPAREN560);
                    adaptor.addChild(root_0, LPAREN560_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_function4920);
                    parameter_declaration561=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration561.getTree());
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:40: ( COMMA parameter_declaration )*
                    loop170:
                    do {
                        int alt170=2;
                        int LA170_0 = input.LA(1);

                        if ( (LA170_0==COMMA) ) {
                            alt170=1;
                        }


                        switch (alt170) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:42: COMMA parameter_declaration
                    	    {
                    	    COMMA562=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_function4924); 
                    	    COMMA562_tree = (Object)adaptor.create(COMMA562);
                    	    adaptor.addChild(root_0, COMMA562_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_function4926);
                    	    parameter_declaration563=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration563.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop170;
                        }
                    } while (true);

                    RPAREN564=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_function4931); 
                    RPAREN564_tree = (Object)adaptor.create(RPAREN564);
                    adaptor.addChild(root_0, RPAREN564_tree);


                    }
                    break;

            }

            RETURN565=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function4944); 
            RETURN565_tree = (Object)adaptor.create(RETURN565);
            adaptor.addChild(root_0, RETURN565_tree);

            pushFollow(FOLLOW_datatype_in_create_function4946);
            datatype566=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype566.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:675:9: ( invoker_rights_clause )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==AUTHID) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:675:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function4956);
                    invoker_rights_clause567=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause567.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_is_as_in_create_function4967);
            is_as568=is_as();

            state._fsp--;

            adaptor.addChild(root_0, is_as568.getTree());
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:677:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt174=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt174=1;
                }
                break;
            case LANGUAGE:
                {
                alt174=2;
                }
                break;
            case EXTERNAL:
                {
                alt174=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:677:11: ( declare_section )? body
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:677:11: ( declare_section )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( ((LA173_0>=PROCEDURE && LA173_0<=FUNCTION)||LA173_0==CURSOR||LA173_0==SUBTYPE||LA173_0==PRAGMA) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:677:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_function4979);
                            declare_section569=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section569.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_function4982);
                    body570=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body570.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:678:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_function4994);
                    call_spec571=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec571.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:679:11: EXTERNAL
                    {
                    EXTERNAL572=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function5006); 
                    EXTERNAL572_tree = (Object)adaptor.create(EXTERNAL572);
                    adaptor.addChild(root_0, EXTERNAL572_tree);


                    }
                    break;

            }

            SEMI573=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function5018); 
            SEMI573_tree = (Object)adaptor.create(SEMI573);
            adaptor.addChild(root_0, SEMI573_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:683:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQLTreeParser.invoker_rights_clause_return retval = new PLSQLTreeParser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AUTHID574=null;
        Token set575=null;

        Object AUTHID574_tree=null;
        Object set575_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:683:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:684:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (Object)adaptor.nil();

            AUTHID574=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause5039); 
            AUTHID574_tree = (Object)adaptor.create(AUTHID574);
            adaptor.addChild(root_0, AUTHID574_tree);

            set575=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set575));
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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:687:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQLTreeParser.call_spec_return call_spec() throws RecognitionException {
        PLSQLTreeParser.call_spec_return retval = new PLSQLTreeParser.call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGUAGE576=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi577 = null;


        Object LANGUAGE576_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:688:5: ( LANGUAGE swallow_to_semi )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:688:7: LANGUAGE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LANGUAGE576=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec5066); 
            LANGUAGE576_tree = (Object)adaptor.create(LANGUAGE576);
            adaptor.addChild(root_0, LANGUAGE576_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_call_spec5068);
            swallow_to_semi577=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi577.getTree());

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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:691:1: kERRORS : {...}? ID ;
    public final PLSQLTreeParser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQLTreeParser.kERRORS_return retval = new PLSQLTreeParser.kERRORS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID578=null;

        Object ID578_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:691:9: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:691:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()))) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            ID578=(Token)match(input,ID,FOLLOW_ID_in_kERRORS5083); 
            ID578_tree = (Object)adaptor.create(ID578);
            adaptor.addChild(root_0, ID578_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:692:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQLTreeParser.kEXCEPTIONS_return retval = new PLSQLTreeParser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID579=null;

        Object ID579_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:692:13: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:692:15: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("exceptions"))) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            ID579=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS5092); 
            ID579_tree = (Object)adaptor.create(ID579);
            adaptor.addChild(root_0, ID579_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:693:1: kFOUND : {...}? ID ;
    public final PLSQLTreeParser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQLTreeParser.kFOUND_return retval = new PLSQLTreeParser.kFOUND_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID580=null;

        Object ID580_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:693:8: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:693:10: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            ID580=(Token)match(input,ID,FOLLOW_ID_in_kFOUND5101); 
            ID580_tree = (Object)adaptor.create(ID580);
            adaptor.addChild(root_0, ID580_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:694:1: kINDICES : {...}? ID ;
    public final PLSQLTreeParser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQLTreeParser.kINDICES_return retval = new PLSQLTreeParser.kINDICES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID581=null;

        Object ID581_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:694:10: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:694:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            ID581=(Token)match(input,ID,FOLLOW_ID_in_kINDICES5110); 
            ID581_tree = (Object)adaptor.create(ID581);
            adaptor.addChild(root_0, ID581_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:695:1: kMOD : {...}? ID ;
    public final PLSQLTreeParser.kMOD_return kMOD() throws RecognitionException {
        PLSQLTreeParser.kMOD_return retval = new PLSQLTreeParser.kMOD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID582=null;

        Object ID582_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:695:6: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:695:8: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("mod"))) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            ID582=(Token)match(input,ID,FOLLOW_ID_in_kMOD5119); 
            ID582_tree = (Object)adaptor.create(ID582);
            adaptor.addChild(root_0, ID582_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:696:1: kNAME : {...}? ID ;
    public final PLSQLTreeParser.kNAME_return kNAME() throws RecognitionException {
        PLSQLTreeParser.kNAME_return retval = new PLSQLTreeParser.kNAME_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID583=null;

        Object ID583_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:696:7: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:696:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("name"))) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            ID583=(Token)match(input,ID,FOLLOW_ID_in_kNAME5128); 
            ID583_tree = (Object)adaptor.create(ID583);
            adaptor.addChild(root_0, ID583_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:697:1: kOF : {...}? ID ;
    public final PLSQLTreeParser.kOF_return kOF() throws RecognitionException {
        PLSQLTreeParser.kOF_return retval = new PLSQLTreeParser.kOF_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID584=null;

        Object ID584_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:697:5: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:697:7: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("of"))) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            ID584=(Token)match(input,ID,FOLLOW_ID_in_kOF5137); 
            ID584_tree = (Object)adaptor.create(ID584);
            adaptor.addChild(root_0, ID584_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:698:1: kREPLACE : {...}? ID ;
    public final PLSQLTreeParser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQLTreeParser.kREPLACE_return retval = new PLSQLTreeParser.kREPLACE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID585=null;

        Object ID585_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:698:10: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:698:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("replace"))) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            ID585=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE5146); 
            ID585_tree = (Object)adaptor.create(ID585);
            adaptor.addChild(root_0, ID585_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:699:1: kROWCOUNT : {...}? ID ;
    public final PLSQLTreeParser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQLTreeParser.kROWCOUNT_return retval = new PLSQLTreeParser.kROWCOUNT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID586=null;

        Object ID586_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:699:11: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:699:13: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            ID586=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT5155); 
            ID586_tree = (Object)adaptor.create(ID586);
            adaptor.addChild(root_0, ID586_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:700:1: kSAVE : {...}? ID ;
    public final PLSQLTreeParser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQLTreeParser.kSAVE_return retval = new PLSQLTreeParser.kSAVE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID587=null;

        Object ID587_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:700:7: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:700:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("save"))) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            ID587=(Token)match(input,ID,FOLLOW_ID_in_kSAVE5164); 
            ID587_tree = (Object)adaptor.create(ID587);
            adaptor.addChild(root_0, ID587_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:701:1: kSHOW : {...}? ID ;
    public final PLSQLTreeParser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQLTreeParser.kSHOW_return retval = new PLSQLTreeParser.kSHOW_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID588=null;

        Object ID588_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:701:7: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:701:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("show"))) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            ID588=(Token)match(input,ID,FOLLOW_ID_in_kSHOW5173); 
            ID588_tree = (Object)adaptor.create(ID588);
            adaptor.addChild(root_0, ID588_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:702:1: kTYPE : {...}? ID ;
    public final PLSQLTreeParser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQLTreeParser.kTYPE_return retval = new PLSQLTreeParser.kTYPE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID589=null;

        Object ID589_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:702:7: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:702:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("type"))) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            ID589=(Token)match(input,ID,FOLLOW_ID_in_kTYPE5182); 
            ID589_tree = (Object)adaptor.create(ID589);
            adaptor.addChild(root_0, ID589_tree);


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
    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:703:1: kVALUES : {...}? ID ;
    public final PLSQLTreeParser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQLTreeParser.kVALUES_return retval = new PLSQLTreeParser.kVALUES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID590=null;

        Object ID590_tree=null;

        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:703:9: ({...}? ID )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:703:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("values"))) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            ID590=(Token)match(input,ID,FOLLOW_ID_in_kVALUES5191); 
            ID590_tree = (Object)adaptor.create(ID590);
            adaptor.addChild(root_0, ID590_tree);


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
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\23\1\24\6\uffff\1\22\1\uffff";
    static final String DFA14_maxS =
        "\1\126\1\55\6\uffff\1\57\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\4\1\uffff\1\1";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\1\1\4\11\uffff\1\3\5\uffff\1\2\60\uffff\1\6",
            "\1\10\16\uffff\2\7\10\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\7\4\uffff\1\7\5\uffff\2\7\1\uffff\1\11\1\7\14\uffff\2\7",
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
            return "141:1: declare_section_items : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI );";
        }
    }
    static final String DFA94_eotS =
        "\17\uffff";
    static final String DFA94_eofS =
        "\17\uffff";
    static final String DFA94_minS =
        "\1\24\2\uffff\1\0\13\uffff";
    static final String DFA94_maxS =
        "\1\175\2\uffff\1\0\13\uffff";
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
            return "385:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
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
        "\1\24\1\uffff\1\21\6\uffff\1\24";
    static final String DFA137_maxS =
        "\1\175\1\uffff\1\160\6\uffff\1\172";
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
            return "553:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file162 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file166 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file168 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file173 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors202 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_SEMI_in_show_errors204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_procedure_nam_in_procedure_heading269 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedure_nam289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading316 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_heading318 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading320 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RETURN_in_function_heading323 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_function_heading325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations350 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations353 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations357 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations360 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_spec_in_parameter_declaration419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration_spec449 = new BitSet(new long[]{0x000020000C100000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration_spec453 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration_spec461 = new BitSet(new long[]{0x0000200010100000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration_spec465 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration_spec467 = new BitSet(new long[]{0x0000200010100000L});
    public static final BitSet FOLLOW_NOCOPY_in_parameter_declaration_spec471 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration_spec479 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_parameter_declaration_spec491 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration_spec501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_section_items_in_declare_section524 = new BitSet(new long[]{0x0000002080380002L,0x0000000000400000L});
    public static final BitSet FOLLOW_type_definition_in_declare_section_items563 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section_items574 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section_items585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section_items596 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section_items607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section_items618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_declare_section_items629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition651 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_cursor_definition653 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition655 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition658 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_declaration_items_in_item_declaration699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration_items722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration_items730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration_items738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration756 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration758 = new BitSet(new long[]{0x0000000260000002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration766 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration768 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_variable_declaration773 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration810 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration812 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration814 = new BitSet(new long[]{0x0000000260000000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration818 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration820 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_constant_declaration825 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration860 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_type_definition885 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IS_in_type_definition887 = new BitSet(new long[]{0x000026C000000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition922 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_subtype_definition924 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition926 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition928 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition932 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition955 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition959 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition963 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition965 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration984 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration986 = new BitSet(new long[]{0x0000000260000002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration992 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration994 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration999 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition1044 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition1046 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition1051 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition1055 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition1057 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition1059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition1061 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition1063 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition1067 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition1083 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition1085 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition1087 = new BitSet(new long[]{0x0000080200000002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition1091 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition1093 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition1100 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition1102 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition1129 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition1131 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition1135 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype1156 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_datatype1161 = new BitSet(new long[]{0x0000C00000800002L});
    public static final BitSet FOLLOW_DOT_in_datatype1165 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_datatype1167 = new BitSet(new long[]{0x0000800000800002L});
    public static final BitSet FOLLOW_LPAREN_in_datatype1174 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1176 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_datatype1180 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1182 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_datatype1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype1191 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_kTYPE_in_datatype1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition1225 = new BitSet(new long[]{0x003E000100000002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1235 = new BitSet(new long[]{0x003E000100000002L});
    public static final BitSet FOLLOW_is_as_in_function_declaration_or_definition1264 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1266 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1290 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1300 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1338 = new BitSet(new long[]{0x003E000100000000L});
    public static final BitSet FOLLOW_set_in_function_definition1348 = new BitSet(new long[]{0x003E000100000000L});
    public static final BitSet FOLLOW_is_as_in_function_definition1375 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1377 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_function_definition1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1398 = new BitSet(new long[]{0x0020000100000002L});
    public static final BitSet FOLLOW_is_as_in_procedure_declaration_or_definition1410 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1412 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_is_as1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1489 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_procedure_is_as_in_procedure_definition1492 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1494 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_procedure_definition1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_as_in_procedure_is_as1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1545 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_body_spec_in_body1547 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_body1549 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_body1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body_spec1579 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_body_spec1581 = new BitSet(new long[]{0xF0400034807C0000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_st_pragma_in_body_spec1583 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_EXCEPTION_in_body_spec1588 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body_spec1590 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_statement_in_st_pragma1612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1614 = new BitSet(new long[]{0xF0400024807C0002L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_pragma_in_st_pragma1618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1620 = new BitSet(new long[]{0xF0400024807C0002L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1635 = new BitSet(new long[]{0x1400000000100000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1639 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1643 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1645 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1652 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1658 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_exception_handler1662 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1664 = new BitSet(new long[]{0xF040002480780002L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_label_in_statement1682 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue1858 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue1862 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_call_in_lvalue1864 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement1901 = new BitSet(new long[]{0x0000400020000002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement1905 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement1911 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call1933 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_call1936 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LPAREN_in_call1940 = new BitSet(new long[]{0x1000000602900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_parameter_in_call1944 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_call1948 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_parameter_in_call1950 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_call1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call1979 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call1983 = new BitSet(new long[]{0x1000000602900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call1985 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement2012 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement2016 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement2018 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_END_in_basic_loop_statement2023 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement2025 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement2049 = new BitSet(new long[]{0x1100000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2051 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement2064 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2066 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement2068 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_case_statement2072 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2074 = new BitSet(new long[]{0xF1C0002480780000L,0x0000001BFBEC606FL});
    public static final BitSet FOLLOW_ELSE_in_case_statement2092 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_case_statement2094 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2096 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_case_statement2109 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement2111 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_label_name_in_case_statement2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement2135 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_close_statement2137 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement2141 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_close_statement2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement2167 = new BitSet(new long[]{0x0100000000100002L});
    public static final BitSet FOLLOW_ID_in_continue_statement2173 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement2180 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement2208 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement2210 = new BitSet(new long[]{0x0000000000400002L,0x0000000000001B00L});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement2224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2244 = new BitSet(new long[]{0x0000000000400002L,0x0000000000001000L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement2291 = new BitSet(new long[]{0x0100000000100002L});
    public static final BitSet FOLLOW_ID_in_exit_statement2297 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement2304 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement2330 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement2340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement2344 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2376 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2378 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2382 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2384 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2416 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2418 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2422 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2424 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_USING_in_using_clause2448 = new BitSet(new long[]{0x100000060C900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2450 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2453 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2457 = new BitSet(new long[]{0x100000060C900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2459 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2462 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2479 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2545 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2547 = new BitSet(new long[]{0xBFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2551 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2559 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2563 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2565 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_END_in_for_loop_statement2570 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2572 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2596 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_forall_statement2598 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2600 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2602 = new BitSet(new long[]{0x2000000000000000L,0x0000000BF8000000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2604 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2634 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2644 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2646 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2648 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2652 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2656 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2671 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2717 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2719 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2721 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_if_statement2725 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2727 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBFC606FL});
    public static final BitSet FOLLOW_ELSIF_in_if_statement2742 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2744 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2746 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_if_statement2750 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2752 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBFC606FL});
    public static final BitSet FOLLOW_ELSE_in_if_statement2770 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_if_statement2774 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2776 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_END_in_if_statement2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_IF_in_if_statement2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement2836 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_open_statement2838 = new BitSet(new long[]{0x0000400000800002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_open_statement2842 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_open_statement2844 = new BitSet(new long[]{0x0000400000800002L,0x0000000000002000L});
    public static final BitSet FOLLOW_call_args_in_open_statement2849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_FOR_in_open_statement2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma2880 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement2903 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_raise_statement2907 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement2911 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_raise_statement2913 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement2940 = new BitSet(new long[]{0x1000000600900002L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_return_statement2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block2966 = new BitSet(new long[]{0x0000002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block2968 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_plsql_block2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_label_in_label2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RLABEL_in_label2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id3012 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_qual_id3015 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id3019 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_COLON_in_qual_id3021 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_qual_id3024 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement3129 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF2L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement3153 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement3176 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement3199 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement3201 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement3224 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF2L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement3248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement3271 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement3296 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement3319 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi3342 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF2L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3369 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3371 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3373 = new BitSet(new long[]{0xF040002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3379 = new BitSet(new long[]{0xF0C0002480780000L,0x0000001BFBEC606EL});
    public static final BitSet FOLLOW_END_in_while_loop_statement3384 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3386 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3417 = new BitSet(new long[]{0xFFDFFFFEF17BFFF2L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3457 = new BitSet(new long[]{0xFFDFFFFEF3FBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3459 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3502 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3506 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3508 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_and_expr3532 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_NOT_in_not_expr3554 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3574 = new BitSet(new long[]{0x0000000000000002L,0x000007E000000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3578 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3624 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3628 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3630 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3652 = new BitSet(new long[]{0x0000000200000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3656 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3659 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3681 = new BitSet(new long[]{0x0000000200000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_NOT_in_between_expr3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3688 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_between_expr3692 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3714 = new BitSet(new long[]{0x0000000204000002L});
    public static final BitSet FOLLOW_NOT_in_in_expr3718 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IN_in_in_expr3721 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr3723 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3725 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_in_expr3729 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3731 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3773 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_set_in_add_expr3777 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3791 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3811 = new BitSet(new long[]{0x0000000000120002L,0x0000800000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr3817 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr3821 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr3825 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3829 = new BitSet(new long[]{0x0000000000120002L,0x0000800000000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr3849 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3877 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr3881 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom3903 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom3907 = new BitSet(new long[]{0x0000000000100000L,0x001C000000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom3920 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3922 = new BitSet(new long[]{0x0000000000100000L,0x001C000000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3964 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_atom3966 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_spec_in_variable_or_function_call3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call_spec4014 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call_spec4018 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call_spec4020 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call_spec4027 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call_spec4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute4045 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_attribute4047 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_attribute4049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args4100 = new BitSet(new long[]{0x1000000602900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4104 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_call_args4108 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4110 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_call_args4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists4260 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists4262 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists4264 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists4266 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists4268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate4295 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate4299 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate4301 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter4333 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter4335 = new BitSet(new long[]{0x1000000600900000L,0x3BE2300000000000L});
    public static final BitSet FOLLOW_expression_in_parameter4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package4378 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OR_in_create_package4382 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package4384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package4389 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_package4395 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package4397 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_package4404 = new BitSet(new long[]{0x0020000100000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4416 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_is_as_in_create_package4429 = new BitSet(new long[]{0x0080002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_create_package4433 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_create_package4438 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ID_in_create_package4442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_package4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4468 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OR_in_create_package_body4472 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4479 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4487 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4489 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4496 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_is_as_in_create_package_body4506 = new BitSet(new long[]{0x00C0002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4510 = new BitSet(new long[]{0x00C0002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_create_package_body4527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_create_package_body4531 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_body4573 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BODY_in_package_body4575 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_package_body_spec_in_package_body4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_body_name_in_package_body_spec4604 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_is_as_in_package_body_spec4614 = new BitSet(new long[]{0x00C0002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_declare_section_in_package_body_spec4618 = new BitSet(new long[]{0x00C0002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_package_body_end_in_package_body_spec4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_body_name_spec_in_package_body_name4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_package_body_name_spec4665 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_package_body_name_spec4667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_package_body_name_spec4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_package_body_end4690 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_package_body_end4694 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ID_in_package_body_end4700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_package_body_end4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4733 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_OR_in_create_procedure4737 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4739 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4750 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4752 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4759 = new BitSet(new long[]{0x0020000100800000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LPAREN_in_create_procedure4771 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4773 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_create_procedure4777 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4779 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_procedure4784 = new BitSet(new long[]{0x0020000100000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4797 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_is_as_in_create_procedure4808 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L,0x0000000000000022L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4820 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_create_procedure4823 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure4835 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure4847 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function4880 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_OR_in_create_function4884 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function4886 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function4891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_function4897 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_create_function4899 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_create_function4906 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_LPAREN_in_create_function4918 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4920 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_COMMA_in_create_function4924 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4926 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_function4931 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RETURN_in_create_function4944 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_datatype_in_create_function4946 = new BitSet(new long[]{0x0020000100000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function4956 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_is_as_in_create_function4967 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L,0x0000000000000022L});
    public static final BitSet FOLLOW_declare_section_in_create_function4979 = new BitSet(new long[]{0x0040002080380000L,0x0000000000400000L});
    public static final BitSet FOLLOW_body_in_create_function4982 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_call_spec_in_create_function4994 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function5006 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_function5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause5039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec5066 = new BitSet(new long[]{0xFFFFFFFFFFFBFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES5191 = new BitSet(new long[]{0x0000000000000002L});

}