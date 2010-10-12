// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g 2010-10-12 10:30:20

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PLSQLTreeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROC", "DECL", "PROC_CALL", "DEFCURSOR", "PARAMS", "PARAM", "BODY", "VARDECL", "PROCNAME", "PACKCALL", "STRING", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "IN", "OUT", "NOCOPY", "ASSIGN", "DEFAULT", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "SUBTYPE", "RECORD", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "AS", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "A", "N", "D", "R", "Y", "S", "U", "T", "H", "I", "B", "E", "W", "O", "L", "K", "C", "M", "F", "X", "G", "P", "V", "Q", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "NUM", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT", "J", "Z"
    };
    public static final int PACKAGE=126;
    public static final int FUNCTION=19;
    public static final int EXTERNAL=127;
    public static final int EXPONENT=110;
    public static final int WHILE=98;
    public static final int DETERMINISTIC=47;
    public static final int VARYING=37;
    public static final int CASE=61;
    public static final int DEFCURSOR=7;
    public static final int PARAM=9;
    public static final int DOUBLEDOT=77;
    public static final int NOT=31;
    public static final int SUBTYPE=35;
    public static final int EOF=-1;
    public static final int SQL=111;
    public static final int RPAREN=23;
    public static final int CREATE=125;
    public static final int INSERT=90;
    public static final int USING=73;
    public static final int RETURNING=74;
    public static final int BEGIN=52;
    public static final int LOOP=60;
    public static final int SAVEPOINT=93;
    public static final int RETURN=20;
    public static final int BODY=10;
    public static final int RAISE=85;
    public static final int GEQ=104;
    public static final int EQ=99;
    public static final int GOTO=80;
    public static final int SELECT=94;
    public static final int ISOPEN=113;
    public static final int INTO=70;
    public static final int ARRAY=38;
    public static final int DIVIDE=15;
    public static final int EXCEPTION=34;
    public static final int RBRACK=159;
    public static final int D=134;
    public static final int EXIT=67;
    public static final int E=143;
    public static final int F=150;
    public static final int G=152;
    public static final int RECORD=36;
    public static final int A=132;
    public static final int B=142;
    public static final int C=148;
    public static final int L=146;
    public static final int M=149;
    public static final int N=133;
    public static final int O=145;
    public static final int TRANSACTION=96;
    public static final int H=140;
    public static final int I=141;
    public static final int NULL=32;
    public static final int J=167;
    public static final int ELSE=62;
    public static final int K=147;
    public static final int U=138;
    public static final int T=139;
    public static final int AT_SIGN=158;
    public static final int W=144;
    public static final int V=154;
    public static final int DEFINER=130;
    public static final int Q=155;
    public static final int P=153;
    public static final int DELETE=59;
    public static final int S=137;
    public static final int DOUBLEVERTBAR=108;
    public static final int R=135;
    public static final int ROLLBACK=92;
    public static final int Y=136;
    public static final int X=151;
    public static final int AUTHID=128;
    public static final int Z=168;
    public static final int NOCOPY=26;
    public static final int WS=164;
    public static final int LANGUAGE=131;
    public static final int FETCH=68;
    public static final int OUT=25;
    public static final int REAL_NUMBER=116;
    public static final int PIPELINED=48;
    public static final int SL_COMMENT=165;
    public static final int OR=55;
    public static final int CONSTANT=33;
    public static final int PROCNAME=12;
    public static final int ELSIF=82;
    public static final int END=53;
    public static final int FALSE=118;
    public static final int COLLECT=72;
    public static final int CURSOR=29;
    public static final int OTHERS=56;
    public static final int LBRACK=160;
    public static final int PROC_CALL=6;
    public static final int POINT=157;
    public static final int CURRENT_USER=129;
    public static final int LIMIT=69;
    public static final int EXECUTE=65;
    public static final int INSERTING=121;
    public static final int GTH=103;
    public static final int NOTFOUND=114;
    public static final int PRAGMA=84;
    public static final int RESULT_CACHE=50;
    public static final int UPDATE=97;
    public static final int TABLE=40;
    public static final int LLABEL=87;
    public static final int FOR=75;
    public static final int VARDECL=11;
    public static final int ID=18;
    public static final int AND=79;
    public static final int ASTERISK=109;
    public static final int LPAREN=21;
    public static final int LOCK=91;
    public static final int UPDATING=122;
    public static final int IF=81;
    public static final int RLABEL=88;
    public static final int ML_COMMENT=166;
    public static final int INDEX=41;
    public static final int AS=51;
    public static final int ROWTYPE=46;
    public static final int IN=24;
    public static final int THEN=57;
    public static final int CONTINUE=64;
    public static final int COMMA=22;
    public static final int IS=30;
    public static final int PROC=4;
    public static final int QUOTED_STRING=119;
    public static final int PLUS=107;
    public static final int EXISTS=120;
    public static final int DOT=44;
    public static final int LIKE=105;
    public static final int PARAMS=8;
    public static final int INTEGER=115;
    public static final int BY=42;
    public static final int VARRAY=39;
    public static final int PACKCALL=13;
    public static final int PERCENT=45;
    public static final int PARALLEL_ENABLE=49;
    public static final int DOUBLEQUOTED_STRING=156;
    public static final int DEFAULT=28;
    public static final int FORALL=76;
    public static final int SET=95;
    public static final int MINUS=106;
    public static final int TRUE=117;
    public static final int SEMI=16;
    public static final int PROCEDURE=17;
    public static final int NUM=162;
    public static final int NOT_EQ=100;
    public static final int REF=43;
    public static final int VERTBAR=161;
    public static final int LTH=101;
    public static final int COLON=58;
    public static final int OPEN=83;
    public static final int BULK_ROWCOUNT=112;
    public static final int COMMIT=89;
    public static final int CLOSE=63;
    public static final int WHEN=54;
    public static final int DECL=5;
    public static final int ASSIGN=27;
    public static final int NUMBER_VALUE=163;
    public static final int IMMEDIATE=66;
    public static final int ARROW=124;
    public static final int DECLARE=86;
    public static final int DELETING=123;
    public static final int BULK=71;
    public static final int BETWEEN=78;
    public static final int STRING=14;
    public static final int LEQ=102;

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:92:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file148);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:23: ( DIVIDE show_errors )?
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
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:25: DIVIDE show_errors
            	            {
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file152); 
            	            DIVIDE2_tree = (Object)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file154);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:47: ( DIVIDE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:93:47: DIVIDE
            	            {
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file159); 
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

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file165); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:96:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQLTreeParser.show_errors_return show_errors() throws RecognitionException {
        PLSQLTreeParser.show_errors_return retval = new PLSQLTreeParser.show_errors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI8=null;
        PLSQLTreeParser.kSHOW_return kSHOW6 = null;

        PLSQLTreeParser.kERRORS_return kERRORS7 = null;


        Object SEMI8_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:5: ( kSHOW kERRORS ( SEMI )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kSHOW_in_show_errors186);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            pushFollow(FOLLOW_kERRORS_in_show_errors188);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:21: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:97:21: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors190); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:100:1: create_object : ( create_package | create_package_body | create_function | create_procedure );
    public final PLSQLTreeParser.create_object_return create_object() throws RecognitionException {
        PLSQLTreeParser.create_object_return retval = new PLSQLTreeParser.create_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.create_package_return create_package9 = null;

        PLSQLTreeParser.create_package_body_return create_package_body10 = null;

        PLSQLTreeParser.create_function_return create_function11 = null;

        PLSQLTreeParser.create_procedure_return create_procedure12 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:101:5: ( create_package | create_package_body | create_function | create_procedure )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case OR:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case FUNCTION:
                            {
                            alt5=3;
                            }
                            break;
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
                case PROCEDURE:
                    {
                    alt5=4;
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:101:7: create_package
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_in_create_object208);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:102:7: create_package_body
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_body_in_create_object216);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:103:7: create_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_function_in_create_object224);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:104:7: create_procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_procedure_in_create_object232);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:107:1: procedure_heading : PROCEDURE procedure_nam ( parameter_declarations )? ;
    public final PLSQLTreeParser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQLTreeParser.procedure_heading_return retval = new PLSQLTreeParser.procedure_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE13=null;
        PLSQLTreeParser.procedure_nam_return procedure_nam14 = null;

        PLSQLTreeParser.parameter_declarations_return parameter_declarations15 = null;


        Object PROCEDURE13_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:107:19: ( PROCEDURE procedure_nam ( parameter_declarations )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:9: PROCEDURE procedure_nam ( parameter_declarations )?
            {
            root_0 = (Object)adaptor.nil();

            PROCEDURE13=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading253); 
            PROCEDURE13_tree = (Object)adaptor.create(PROCEDURE13);
            adaptor.addChild(root_0, PROCEDURE13_tree);

            pushFollow(FOLLOW_procedure_nam_in_procedure_heading255);
            procedure_nam14=procedure_nam();

            state._fsp--;

            adaptor.addChild(root_0, procedure_nam14.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:33: ( parameter_declarations )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:108:33: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading257);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:111:1: procedure_nam : ID -> ^( PROCNAME ID ) ;
    public final PLSQLTreeParser.procedure_nam_return procedure_nam() throws RecognitionException {
        PLSQLTreeParser.procedure_nam_return retval = new PLSQLTreeParser.procedure_nam_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID16=null;

        Object ID16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:112:2: ( ID -> ^( PROCNAME ID ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:113:2: ID
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_procedure_nam275);  
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
            // 113:5: -> ^( PROCNAME ID )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:113:8: ^( PROCNAME ID )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:116:1: function_heading : FUNCTION ID ( parameter_declarations )? RETURN datatype ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:116:18: ( FUNCTION ID ( parameter_declarations )? RETURN datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:9: FUNCTION ID ( parameter_declarations )? RETURN datatype
            {
            root_0 = (Object)adaptor.nil();

            FUNCTION17=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading302); 
            FUNCTION17_tree = (Object)adaptor.create(FUNCTION17);
            adaptor.addChild(root_0, FUNCTION17_tree);

            ID18=(Token)match(input,ID,FOLLOW_ID_in_function_heading304); 
            ID18_tree = (Object)adaptor.create(ID18);
            adaptor.addChild(root_0, ID18_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:21: ( parameter_declarations )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:117:21: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading306);
                    parameter_declarations19=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations19.getTree());

                    }
                    break;

            }

            RETURN20=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading309); 
            RETURN20_tree = (Object)adaptor.create(RETURN20);
            adaptor.addChild(root_0, RETURN20_tree);

            pushFollow(FOLLOW_datatype_in_function_heading311);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:120:1: parameter_declarations : ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:120:24: ( ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:13: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
            {
            LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations336);  
            stream_LPAREN.add(LPAREN22);

            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations339);
            parameter_declaration23=parameter_declaration();

            state._fsp--;

            stream_parameter_declaration.add(parameter_declaration23.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:43: ( COMMA parameter_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:121:45: COMMA parameter_declaration
            	    {
            	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations343);  
            	    stream_COMMA.add(COMMA24);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations346);
            	    parameter_declaration25=parameter_declaration();

            	    state._fsp--;

            	    stream_parameter_declaration.add(parameter_declaration25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations351);  
            stream_RPAREN.add(RPAREN26);


            }



            // AST REWRITE
            // elements: LPAREN, parameter_declaration, COMMA, parameter_declaration, RPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:9: -> ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:12: ^( PARAMS LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                adaptor.addChild(root_1, stream_LPAREN.nextNode());
                adaptor.addChild(root_1, stream_parameter_declaration.nextTree());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:122:51: ( COMMA parameter_declaration )*
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:125:1: parameter_declaration : parameter_declaration_spec -> ^( PARAM parameter_declaration_spec ) ;
    public final PLSQLTreeParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQLTreeParser.parameter_declaration_return retval = new PLSQLTreeParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.parameter_declaration_spec_return parameter_declaration_spec27 = null;


        RewriteRuleSubtreeStream stream_parameter_declaration_spec=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration_spec");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:125:23: ( parameter_declaration_spec -> ^( PARAM parameter_declaration_spec ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:126:8: parameter_declaration_spec
            {
            pushFollow(FOLLOW_parameter_declaration_spec_in_parameter_declaration405);
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
            // 126:35: -> ^( PARAM parameter_declaration_spec )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:126:38: ^( PARAM parameter_declaration_spec )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:129:1: parameter_declaration_spec : ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:2: ( ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:5: ID ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID28=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration_spec435); 
            ID28_tree = (Object)adaptor.create(ID28);
            adaptor.addChild(root_0, ID28_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:8: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:10: IN
                    {
                    IN29=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration_spec439); 
                    IN29_tree = (Object)adaptor.create(IN29);
                    adaptor.addChild(root_0, IN29_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:15: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:15: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:17: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:17: ( OUT | IN OUT )
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
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:19: OUT
                            {
                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration_spec447); 
                            OUT30_tree = (Object)adaptor.create(OUT30);
                            adaptor.addChild(root_0, OUT30_tree);


                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:25: IN OUT
                            {
                            IN31=(Token)match(input,IN,FOLLOW_IN_in_parameter_declaration_spec451); 
                            IN31_tree = (Object)adaptor.create(IN31);
                            adaptor.addChild(root_0, IN31_tree);

                            OUT32=(Token)match(input,OUT,FOLLOW_OUT_in_parameter_declaration_spec453); 
                            OUT32_tree = (Object)adaptor.create(OUT32);
                            adaptor.addChild(root_0, OUT32_tree);


                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:34: ( NOCOPY )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOCOPY) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:130:34: NOCOPY
                            {
                            NOCOPY33=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_parameter_declaration_spec457); 
                            NOCOPY33_tree = (Object)adaptor.create(NOCOPY33);
                            adaptor.addChild(root_0, NOCOPY33_tree);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_parameter_declaration_spec465);
            datatype34=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype34.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:131:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ASSIGN && LA12_0<=DEFAULT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:131:11: ( ASSIGN | DEFAULT ) expression
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

                    pushFollow(FOLLOW_expression_in_parameter_declaration_spec487);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:1: declare_section : ( declare_section_items )+ -> ^( DECL ( declare_section_items )+ ) ;
    public final PLSQLTreeParser.declare_section_return declare_section() throws RecognitionException {
        PLSQLTreeParser.declare_section_return retval = new PLSQLTreeParser.declare_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.declare_section_items_return declare_section_items37 = null;


        RewriteRuleSubtreeStream stream_declare_section_items=new RewriteRuleSubtreeStream(adaptor,"rule declare_section_items");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:133:17: ( ( declare_section_items )+ -> ^( DECL ( declare_section_items )+ ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:134:5: ( declare_section_items )+
            {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:134:5: ( declare_section_items )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:135:5: declare_section_items
            	    {
            	    pushFollow(FOLLOW_declare_section_items_in_declare_section510);
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
            // 136:8: -> ^( DECL ( declare_section_items )+ )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:136:11: ^( DECL ( declare_section_items )+ )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:139:1: declare_section_items : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI );
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:139:23: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:140:5: type_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_definition_in_declare_section_items549);
                    type_definition38=type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, type_definition38.getTree());
                    SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items551); 
                    SEMI39_tree = (Object)adaptor.create(SEMI39);
                    adaptor.addChild(root_0, SEMI39_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:141:7: subtype_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subtype_definition_in_declare_section_items560);
                    subtype_definition40=subtype_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, subtype_definition40.getTree());
                    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items562); 
                    SEMI41_tree = (Object)adaptor.create(SEMI41);
                    adaptor.addChild(root_0, SEMI41_tree);


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:142:7: cursor_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cursor_definition_in_declare_section_items571);
                    cursor_definition42=cursor_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, cursor_definition42.getTree());
                    SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items573); 
                    SEMI43_tree = (Object)adaptor.create(SEMI43);
                    adaptor.addChild(root_0, SEMI43_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:143:7: item_declaration SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_item_declaration_in_declare_section_items582);
                    item_declaration44=item_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, item_declaration44.getTree());
                    SEMI45=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items584); 
                    SEMI45_tree = (Object)adaptor.create(SEMI45);
                    adaptor.addChild(root_0, SEMI45_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:144:7: function_declaration_or_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section_items593);
                    function_declaration_or_definition46=function_declaration_or_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_or_definition46.getTree());
                    SEMI47=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items595); 
                    SEMI47_tree = (Object)adaptor.create(SEMI47);
                    adaptor.addChild(root_0, SEMI47_tree);


                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:145:7: procedure_declaration_or_definition SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section_items604);
                    procedure_declaration_or_definition48=procedure_declaration_or_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, procedure_declaration_or_definition48.getTree());
                    SEMI49=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items606); 
                    SEMI49_tree = (Object)adaptor.create(SEMI49);
                    adaptor.addChild(root_0, SEMI49_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:146:7: pragma SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_in_declare_section_items615);
                    pragma50=pragma();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma50.getTree());
                    SEMI51=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section_items617); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:149:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:149:19: ( CURSOR ID ( parameter_declarations )? IS select_statement -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            CURSOR52=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition637);  
            stream_CURSOR.add(CURSOR52);

            ID53=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition639);  
            stream_ID.add(ID53);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:19: ( parameter_declarations )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LPAREN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:19: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition641);
                    parameter_declarations54=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(parameter_declarations54.getTree());

                    }
                    break;

            }

            IS55=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition644);  
            stream_IS.add(IS55);

            pushFollow(FOLLOW_select_statement_in_cursor_definition646);
            select_statement56=select_statement();

            state._fsp--;

            stream_select_statement.add(select_statement56.getTree());


            // AST REWRITE
            // elements: ID, parameter_declarations, IS, CURSOR, select_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:63: -> ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:66: ^( DEFCURSOR CURSOR ID ( parameter_declarations )? IS select_statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFCURSOR, "DEFCURSOR"), root_1);

                adaptor.addChild(root_1, stream_CURSOR.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:150:88: ( parameter_declarations )?
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:153:1: item_declaration : item_declaration_items -> ^( VARDECL item_declaration_items ) ;
    public final PLSQLTreeParser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQLTreeParser.item_declaration_return retval = new PLSQLTreeParser.item_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.item_declaration_items_return item_declaration_items57 = null;


        RewriteRuleSubtreeStream stream_item_declaration_items=new RewriteRuleSubtreeStream(adaptor,"rule item_declaration_items");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:154:5: ( item_declaration_items -> ^( VARDECL item_declaration_items ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:5: item_declaration_items
            {
            pushFollow(FOLLOW_item_declaration_items_in_item_declaration685);
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
            // 155:28: -> ^( VARDECL item_declaration_items )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:155:30: ^( VARDECL item_declaration_items )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:158:1: item_declaration_items : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQLTreeParser.item_declaration_items_return item_declaration_items() throws RecognitionException {
        PLSQLTreeParser.item_declaration_items_return retval = new PLSQLTreeParser.item_declaration_items_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.variable_declaration_return variable_declaration58 = null;

        PLSQLTreeParser.constant_declaration_return constant_declaration59 = null;

        PLSQLTreeParser.exception_declaration_return exception_declaration60 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:159:2: ( variable_declaration | constant_declaration | exception_declaration )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:160:2: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_item_declaration_items708);
                    variable_declaration58=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration58.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:161:7: constant_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_declaration_in_item_declaration_items716);
                    constant_declaration59=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration59.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:162:7: exception_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exception_declaration_in_item_declaration_items724);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:165:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:165:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID61=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration742); 
            ID61_tree = (Object)adaptor.create(ID61);
            adaptor.addChild(root_0, ID61_tree);

            pushFollow(FOLLOW_datatype_in_variable_declaration744);
            datatype62=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype62.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ASSIGN && LA18_0<=DEFAULT)||LA18_0==NOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:24: ( NOT NULL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:166:27: NOT NULL
                            {
                            NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration752); 
                            NOT63_tree = (Object)adaptor.create(NOT63);
                            adaptor.addChild(root_0, NOT63_tree);

                            NULL64=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration754); 
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

                    pushFollow(FOLLOW_expression_in_variable_declaration771);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:169:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:169:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:170:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (Object)adaptor.nil();

            ID67=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration796); 
            ID67_tree = (Object)adaptor.create(ID67);
            adaptor.addChild(root_0, ID67_tree);

            CONSTANT68=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration798); 
            CONSTANT68_tree = (Object)adaptor.create(CONSTANT68);
            adaptor.addChild(root_0, CONSTANT68_tree);

            pushFollow(FOLLOW_datatype_in_constant_declaration800);
            datatype69=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype69.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:170:30: ( NOT NULL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:170:32: NOT NULL
                    {
                    NOT70=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration804); 
                    NOT70_tree = (Object)adaptor.create(NOT70);
                    adaptor.addChild(root_0, NOT70_tree);

                    NULL71=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration806); 
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

            pushFollow(FOLLOW_expression_in_constant_declaration825);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:173:1: exception_declaration : ID EXCEPTION ;
    public final PLSQLTreeParser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQLTreeParser.exception_declaration_return retval = new PLSQLTreeParser.exception_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID74=null;
        Token EXCEPTION75=null;

        Object ID74_tree=null;
        Object EXCEPTION75_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:173:23: ( ID EXCEPTION )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:174:9: ID EXCEPTION
            {
            root_0 = (Object)adaptor.nil();

            ID74=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration846); 
            ID74_tree = (Object)adaptor.create(ID74);
            adaptor.addChild(root_0, ID74_tree);

            EXCEPTION75=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration848); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:177:1: type_definition : kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:177:17: ( kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:178:9: kTYPE ID IS ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kTYPE_in_type_definition869);
            kTYPE76=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE76.getTree());
            ID77=(Token)match(input,ID,FOLLOW_ID_in_type_definition871); 
            ID77_tree = (Object)adaptor.create(ID77);
            adaptor.addChild(root_0, ID77_tree);

            IS78=(Token)match(input,IS,FOLLOW_IS_in_type_definition873); 
            IS78_tree = (Object)adaptor.create(IS78);
            adaptor.addChild(root_0, IS78_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:178:21: ( record_type_definition | collection_type_definition | ref_cursor_type_definition )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:178:23: record_type_definition
                    {
                    pushFollow(FOLLOW_record_type_definition_in_type_definition877);
                    record_type_definition79=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition79.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:178:48: collection_type_definition
                    {
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition881);
                    collection_type_definition80=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition80.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:178:77: ref_cursor_type_definition
                    {
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition885);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:181:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:181:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:182:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            SUBTYPE82=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition908); 
            SUBTYPE82_tree = (Object)adaptor.create(SUBTYPE82);
            adaptor.addChild(root_0, SUBTYPE82_tree);

            ID83=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition910); 
            ID83_tree = (Object)adaptor.create(ID83);
            adaptor.addChild(root_0, ID83_tree);

            IS84=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition912); 
            IS84_tree = (Object)adaptor.create(IS84);
            adaptor.addChild(root_0, IS84_tree);

            pushFollow(FOLLOW_datatype_in_subtype_definition914);
            datatype85=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype85.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:182:32: ( NOT NULL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:182:34: NOT NULL
                    {
                    NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition918); 
                    NOT86_tree = (Object)adaptor.create(NOT86);
                    adaptor.addChild(root_0, NOT86_tree);

                    NULL87=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition920); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:185:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:185:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:186:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RECORD88=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition941); 
            RECORD88_tree = (Object)adaptor.create(RECORD88);
            adaptor.addChild(root_0, RECORD88_tree);

            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition943); 
            LPAREN89_tree = (Object)adaptor.create(LPAREN89);
            adaptor.addChild(root_0, LPAREN89_tree);

            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition945);
            record_field_declaration90=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration90.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:186:41: ( COMMA record_field_declaration )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:186:43: COMMA record_field_declaration
            	    {
            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition949); 
            	    COMMA91_tree = (Object)adaptor.create(COMMA91);
            	    adaptor.addChild(root_0, COMMA91_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition951);
            	    record_field_declaration92=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration92.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition956); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:189:1: record_field_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:189:26: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:190:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID94=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration970); 
            ID94_tree = (Object)adaptor.create(ID94);
            adaptor.addChild(root_0, ID94_tree);

            pushFollow(FOLLOW_datatype_in_record_field_declaration972);
            datatype95=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype95.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:190:14: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ASSIGN && LA24_0<=DEFAULT)||LA24_0==NOT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:190:16: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:190:16: ( NOT NULL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NOT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:190:18: NOT NULL
                            {
                            NOT96=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration978); 
                            NOT96_tree = (Object)adaptor.create(NOT96);
                            adaptor.addChild(root_0, NOT96_tree);

                            NULL97=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration980); 
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

                    pushFollow(FOLLOW_expression_in_record_field_declaration995);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:193:1: collection_type_definition : ( varray_type_definition | nested_table_type_definition );
    public final PLSQLTreeParser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQLTreeParser.collection_type_definition_return retval = new PLSQLTreeParser.collection_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.varray_type_definition_return varray_type_definition100 = null;

        PLSQLTreeParser.nested_table_type_definition_return nested_table_type_definition101 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:194:2: ( varray_type_definition | nested_table_type_definition )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:194:4: varray_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition1012);
                    varray_type_definition100=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition100.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:195:4: nested_table_type_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition1017);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:198:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:4: ( VARYING ( ARRAY )? | VARRAY )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:6: VARYING ( ARRAY )?
                    {
                    VARYING102=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition1030); 
                    VARYING102_tree = (Object)adaptor.create(VARYING102);
                    adaptor.addChild(root_0, VARYING102_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:14: ( ARRAY )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ARRAY) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:14: ARRAY
                            {
                            ARRAY103=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition1032); 
                            ARRAY103_tree = (Object)adaptor.create(ARRAY103);
                            adaptor.addChild(root_0, ARRAY103_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:23: VARRAY
                    {
                    VARRAY104=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition1037); 
                    VARRAY104_tree = (Object)adaptor.create(VARRAY104);
                    adaptor.addChild(root_0, VARRAY104_tree);


                    }
                    break;

            }

            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition1041); 
            LPAREN105_tree = (Object)adaptor.create(LPAREN105);
            adaptor.addChild(root_0, LPAREN105_tree);

            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition1043);
            numeric_literal106=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal106.getTree());
            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition1045); 
            RPAREN107_tree = (Object)adaptor.create(RPAREN107);
            adaptor.addChild(root_0, RPAREN107_tree);

            pushFollow(FOLLOW_kOF_in_varray_type_definition1047);
            kOF108=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF108.getTree());
            pushFollow(FOLLOW_datatype_in_varray_type_definition1049);
            datatype109=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype109.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:75: ( NOT NULL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:199:77: NOT NULL
                    {
                    NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition1053); 
                    NOT110_tree = (Object)adaptor.create(NOT110);
                    adaptor.addChild(root_0, NOT110_tree);

                    NULL111=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition1055); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:202:1: nested_table_type_definition : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:2: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:4: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (Object)adaptor.nil();

            TABLE112=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition1069); 
            TABLE112_tree = (Object)adaptor.create(TABLE112);
            adaptor.addChild(root_0, TABLE112_tree);

            pushFollow(FOLLOW_kOF_in_nested_table_type_definition1071);
            kOF113=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF113.getTree());
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition1073);
            datatype114=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype114.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:23: ( NOT NULL )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:25: NOT NULL
                    {
                    NOT115=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition1077); 
                    NOT115_tree = (Object)adaptor.create(NOT115);
                    adaptor.addChild(root_0, NOT115_tree);

                    NULL116=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition1079); 
                    NULL116_tree = (Object)adaptor.create(NULL116);
                    adaptor.addChild(root_0, NULL116_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:37: ( INDEX BY associative_index_type )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INDEX) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:203:39: INDEX BY associative_index_type
                    {
                    INDEX117=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition1086); 
                    INDEX117_tree = (Object)adaptor.create(INDEX117);
                    adaptor.addChild(root_0, INDEX117_tree);

                    BY118=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition1088); 
                    BY118_tree = (Object)adaptor.create(BY118);
                    adaptor.addChild(root_0, BY118_tree);

                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition1090);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:206:1: associative_index_type : datatype ;
    public final PLSQLTreeParser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQLTreeParser.associative_index_type_return retval = new PLSQLTreeParser.associative_index_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.datatype_return datatype120 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:207:2: ( datatype )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:207:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_associative_index_type1104);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:210:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:211:2: ( REF CURSOR ( RETURN datatype )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:211:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (Object)adaptor.nil();

            REF121=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition1115); 
            REF121_tree = (Object)adaptor.create(REF121);
            adaptor.addChild(root_0, REF121_tree);

            CURSOR122=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition1117); 
            CURSOR122_tree = (Object)adaptor.create(CURSOR122);
            adaptor.addChild(root_0, CURSOR122_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:211:15: ( RETURN datatype )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RETURN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:211:17: RETURN datatype
                    {
                    RETURN123=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition1121); 
                    RETURN123_tree = (Object)adaptor.create(RETURN123);
                    adaptor.addChild(root_0, RETURN123_tree);

                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition1123);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:214:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
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
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:7: ( REF )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==REF) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:9: REF
                    {
                    REF125=(Token)match(input,REF,FOLLOW_REF_in_datatype1142); 
                    REF125_tree = (Object)adaptor.create(REF125);
                    adaptor.addChild(root_0, REF125_tree);


                    }
                    break;

            }

            ID126=(Token)match(input,ID,FOLLOW_ID_in_datatype1147); 
            ID126_tree = (Object)adaptor.create(ID126);
            adaptor.addChild(root_0, ID126_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:19: ( DOT ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DOT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:21: DOT ID
                    {
                    DOT127=(Token)match(input,DOT,FOLLOW_DOT_in_datatype1151); 
                    DOT127_tree = (Object)adaptor.create(DOT127);
                    adaptor.addChild(root_0, DOT127_tree);

                    ID128=(Token)match(input,ID,FOLLOW_ID_in_datatype1153); 
                    ID128_tree = (Object)adaptor.create(ID128);
                    adaptor.addChild(root_0, ID128_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype1160); 
                    LPAREN129_tree = (Object)adaptor.create(LPAREN129);
                    adaptor.addChild(root_0, LPAREN129_tree);

                    pushFollow(FOLLOW_numeric_literal_in_datatype1162);
                    numeric_literal130=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal130.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:56: ( COMMA numeric_literal )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:58: COMMA numeric_literal
                    	    {
                    	    COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype1166); 
                    	    COMMA131_tree = (Object)adaptor.create(COMMA131);
                    	    adaptor.addChild(root_0, COMMA131_tree);

                    	    pushFollow(FOLLOW_numeric_literal_in_datatype1168);
                    	    numeric_literal132=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype1173); 
                    RPAREN133_tree = (Object)adaptor.create(RPAREN133);
                    adaptor.addChild(root_0, RPAREN133_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    PERCENT134=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype1177); 
                    PERCENT134_tree = (Object)adaptor.create(PERCENT134);
                    adaptor.addChild(root_0, PERCENT134_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:100: ( kTYPE | ROWTYPE )
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
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:102: kTYPE
                            {
                            pushFollow(FOLLOW_kTYPE_in_datatype1181);
                            kTYPE135=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE135.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:215:110: ROWTYPE
                            {
                            ROWTYPE136=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype1185); 
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:218:1: function_declaration_or_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLTreeParser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.function_declaration_or_definition_return retval = new PLSQLTreeParser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set138=null;
        Token set139=null;
        PLSQLTreeParser.function_heading_return function_heading137 = null;

        PLSQLTreeParser.declare_section_return declare_section140 = null;

        PLSQLTreeParser.body_return body141 = null;


        Object set138_tree=null;
        Object set139_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:218:36: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:219:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition1211);
            function_heading137=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading137.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:220:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
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

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IS||LA39_0==AS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:11: ( IS | AS ) ( declare_section )? body
                    {
                    set139=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set139));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:23: ( declare_section )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=PROCEDURE && LA38_0<=FUNCTION)||LA38_0==CURSOR||LA38_0==SUBTYPE||LA38_0==PRAGMA) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:221:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1260);
                            declare_section140=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section140.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1263);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:224:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQLTreeParser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQLTreeParser.function_declaration_return retval = new PLSQLTreeParser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set143=null;
        PLSQLTreeParser.function_heading_return function_heading142 = null;


        Object set143_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:224:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:225:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration1284);
            function_heading142=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading142.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:226:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body ;
    public final PLSQLTreeParser.function_definition_return function_definition() throws RecognitionException {
        PLSQLTreeParser.function_definition_return retval = new PLSQLTreeParser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        Token set146=null;
        PLSQLTreeParser.function_heading_return function_heading144 = null;

        PLSQLTreeParser.declare_section_return declare_section147 = null;

        PLSQLTreeParser.body_return body148 = null;


        Object set145_tree=null;
        Object set146_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:229:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:230:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_definition1332);
            function_heading144=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading144.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:231:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
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

            set146=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set146));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:232:21: ( declare_section )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PROCEDURE && LA42_0<=FUNCTION)||LA42_0==CURSOR||LA42_0==SUBTYPE||LA42_0==PRAGMA) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:232:21: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_function_definition1379);
                    declare_section147=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section147.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_function_definition1382);
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:1: procedure_declaration_or_definition : procedure_heading ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQLTreeParser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_or_definition_return retval = new PLSQLTreeParser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set150=null;
        PLSQLTreeParser.procedure_heading_return procedure_heading149 = null;

        PLSQLTreeParser.declare_section_return declare_section151 = null;

        PLSQLTreeParser.body_return body152 = null;


        Object set150_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:235:37: ( procedure_heading ( ( IS | AS ) ( declare_section )? body )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:236:9: procedure_heading ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1400);
            procedure_heading149=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading149.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IS||LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:11: ( IS | AS ) ( declare_section )? body
                    {
                    set150=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set150));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:23: ( declare_section )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=PROCEDURE && LA43_0<=FUNCTION)||LA43_0==CURSOR||LA43_0==SUBTYPE||LA43_0==PRAGMA) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:237:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1422);
                            declare_section151=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section151.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1425);
                    body152=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body152.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:1: procedure_declaration : procedure_heading ;
    public final PLSQLTreeParser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQLTreeParser.procedure_declaration_return retval = new PLSQLTreeParser.procedure_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading153 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:240:23: ( procedure_heading )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:241:2: procedure_heading
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1442);
            procedure_heading153=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading153.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:244:1: procedure_definition : procedure_heading procedure_is_as ( declare_section )? body -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body ) ;
    public final PLSQLTreeParser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQLTreeParser.procedure_definition_return retval = new PLSQLTreeParser.procedure_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.procedure_heading_return procedure_heading154 = null;

        PLSQLTreeParser.procedure_is_as_return procedure_is_as155 = null;

        PLSQLTreeParser.declare_section_return declare_section156 = null;

        PLSQLTreeParser.body_return body157 = null;


        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_procedure_is_as=new RewriteRuleSubtreeStream(adaptor,"rule procedure_is_as");
        RewriteRuleSubtreeStream stream_declare_section=new RewriteRuleSubtreeStream(adaptor,"rule declare_section");
        RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:244:22: ( procedure_heading procedure_is_as ( declare_section )? body -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:245:2: procedure_heading procedure_is_as ( declare_section )? body
            {
            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1453);
            procedure_heading154=procedure_heading();

            state._fsp--;

            stream_procedure_heading.add(procedure_heading154.getTree());
            pushFollow(FOLLOW_procedure_is_as_in_procedure_definition1456);
            procedure_is_as155=procedure_is_as();

            state._fsp--;

            stream_procedure_is_as.add(procedure_is_as155.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:246:18: ( declare_section )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=PROCEDURE && LA45_0<=FUNCTION)||LA45_0==CURSOR||LA45_0==SUBTYPE||LA45_0==PRAGMA) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:246:18: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1458);
                    declare_section156=declare_section();

                    state._fsp--;

                    stream_declare_section.add(declare_section156.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_procedure_definition1463);
            body157=body();

            state._fsp--;

            stream_body.add(body157.getTree());


            // AST REWRITE
            // elements: declare_section, procedure_heading, body, procedure_is_as
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 247:9: -> ^( PROC procedure_heading procedure_is_as ( declare_section )? body )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:247:12: ^( PROC procedure_heading procedure_is_as ( declare_section )? body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROC, "PROC"), root_1);

                adaptor.addChild(root_1, stream_procedure_heading.nextTree());
                adaptor.addChild(root_1, stream_procedure_is_as.nextTree());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:248:18: ( declare_section )?
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:252:1: procedure_is_as : ( IS | AS ) ;
    public final PLSQLTreeParser.procedure_is_as_return procedure_is_as() throws RecognitionException {
        PLSQLTreeParser.procedure_is_as_return retval = new PLSQLTreeParser.procedure_is_as_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set158=null;

        Object set158_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:253:2: ( ( IS | AS ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:254:2: ( IS | AS )
            {
            root_0 = (Object)adaptor.nil();

            set158=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set158));
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
    // $ANTLR end "procedure_is_as"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:257:1: body : BEGIN body_spec END ( ID )? -> ^( BODY BEGIN body_spec END ( ID )? ) ;
    public final PLSQLTreeParser.body_return body() throws RecognitionException {
        PLSQLTreeParser.body_return retval = new PLSQLTreeParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN159=null;
        Token END161=null;
        Token ID162=null;
        PLSQLTreeParser.body_spec_return body_spec160 = null;


        Object BEGIN159_tree=null;
        Object END161_tree=null;
        Object ID162_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_body_spec=new RewriteRuleSubtreeStream(adaptor,"rule body_spec");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:257:7: ( BEGIN body_spec END ( ID )? -> ^( BODY BEGIN body_spec END ( ID )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:2: BEGIN body_spec END ( ID )?
            {
            BEGIN159=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1517);  
            stream_BEGIN.add(BEGIN159);

            pushFollow(FOLLOW_body_spec_in_body1519);
            body_spec160=body_spec();

            state._fsp--;

            stream_body_spec.add(body_spec160.getTree());
            END161=(Token)match(input,END,FOLLOW_END_in_body1521);  
            stream_END.add(END161);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:22: ( ID )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:22: ID
                    {
                    ID162=(Token)match(input,ID,FOLLOW_ID_in_body1523);  
                    stream_ID.add(ID162);


                    }
                    break;

            }



            // AST REWRITE
            // elements: END, BEGIN, ID, body_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:26: -> ^( BODY BEGIN body_spec END ( ID )? )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:29: ^( BODY BEGIN body_spec END ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_BEGIN.nextNode());
                adaptor.addChild(root_1, stream_body_spec.nextTree());
                adaptor.addChild(root_1, stream_END.nextNode());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:258:56: ( ID )?
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:260:1: body_spec : statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? ;
    public final PLSQLTreeParser.body_spec_return body_spec() throws RecognitionException {
        PLSQLTreeParser.body_spec_return retval = new PLSQLTreeParser.body_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI164=null;
        Token EXCEPTION166=null;
        PLSQLTreeParser.statement_return statement163 = null;

        PLSQLTreeParser.st_pragma_return st_pragma165 = null;

        PLSQLTreeParser.exception_handler_return exception_handler167 = null;


        Object SEMI164_tree=null;
        Object EXCEPTION166_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:261:2: ( statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:262:2: statement SEMI st_pragma ( EXCEPTION ( exception_handler )+ )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_body_spec1551);
            statement163=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement163.getTree());
            SEMI164=(Token)match(input,SEMI,FOLLOW_SEMI_in_body_spec1553); 
            SEMI164_tree = (Object)adaptor.create(SEMI164);
            adaptor.addChild(root_0, SEMI164_tree);

            pushFollow(FOLLOW_st_pragma_in_body_spec1555);
            st_pragma165=st_pragma();

            state._fsp--;

            adaptor.addChild(root_0, st_pragma165.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:2: ( EXCEPTION ( exception_handler )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==EXCEPTION) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:4: EXCEPTION ( exception_handler )+
                    {
                    EXCEPTION166=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body_spec1560); 
                    EXCEPTION166_tree = (Object)adaptor.create(EXCEPTION166);
                    adaptor.addChild(root_0, EXCEPTION166_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:14: ( exception_handler )+
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
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:263:14: exception_handler
                    	    {
                    	    pushFollow(FOLLOW_exception_handler_in_body_spec1562);
                    	    exception_handler167=exception_handler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exception_handler167.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:266:1: st_pragma : ( statement SEMI | pragma SEMI )* ;
    public final PLSQLTreeParser.st_pragma_return st_pragma() throws RecognitionException {
        PLSQLTreeParser.st_pragma_return retval = new PLSQLTreeParser.st_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI169=null;
        Token SEMI171=null;
        PLSQLTreeParser.statement_return statement168 = null;

        PLSQLTreeParser.pragma_return pragma170 = null;


        Object SEMI169_tree=null;
        Object SEMI171_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:267:2: ( ( statement SEMI | pragma SEMI )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:2: ( statement SEMI | pragma SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:2: ( statement SEMI | pragma SEMI )*
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:4: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_st_pragma1584);
            	    statement168=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement168.getTree());
            	    SEMI169=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1586); 
            	    SEMI169_tree = (Object)adaptor.create(SEMI169);
            	    adaptor.addChild(root_0, SEMI169_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:268:21: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_st_pragma1590);
            	    pragma170=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma170.getTree());
            	    SEMI171=(Token)match(input,SEMI,FOLLOW_SEMI_in_st_pragma1592); 
            	    SEMI171_tree = (Object)adaptor.create(SEMI171);
            	    adaptor.addChild(root_0, SEMI171_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:271:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQLTreeParser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQLTreeParser.exception_handler_return retval = new PLSQLTreeParser.exception_handler_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN172=null;
        Token OR174=null;
        Token OTHERS176=null;
        Token THEN177=null;
        Token SEMI179=null;
        PLSQLTreeParser.qual_id_return qual_id173 = null;

        PLSQLTreeParser.qual_id_return qual_id175 = null;

        PLSQLTreeParser.statement_return statement178 = null;


        Object WHEN172_tree=null;
        Object OR174_tree=null;
        Object OTHERS176_tree=null;
        Object THEN177_tree=null;
        Object SEMI179_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            WHEN172=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1607); 
            WHEN172_tree = (Object)adaptor.create(WHEN172);
            adaptor.addChild(root_0, WHEN172_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:9: ( qual_id ( OR qual_id )* | OTHERS )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:11: qual_id ( OR qual_id )*
                    {
                    pushFollow(FOLLOW_qual_id_in_exception_handler1611);
                    qual_id173=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id173.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:19: ( OR qual_id )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==OR) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:21: OR qual_id
                    	    {
                    	    OR174=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1615); 
                    	    OR174_tree = (Object)adaptor.create(OR174);
                    	    adaptor.addChild(root_0, OR174_tree);

                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1617);
                    	    qual_id175=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:272:37: OTHERS
                    {
                    OTHERS176=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1624); 
                    OTHERS176_tree = (Object)adaptor.create(OTHERS176);
                    adaptor.addChild(root_0, OTHERS176_tree);


                    }
                    break;

            }

            THEN177=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1630); 
            THEN177_tree = (Object)adaptor.create(THEN177);
            adaptor.addChild(root_0, THEN177_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:273:8: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:273:10: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_exception_handler1634);
            	    statement178=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement178.getTree());
            	    SEMI179=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1636); 
            	    SEMI179_tree = (Object)adaptor.create(SEMI179);
            	    adaptor.addChild(root_0, SEMI179_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQLTreeParser.statement_return statement() throws RecognitionException {
        PLSQLTreeParser.statement_return retval = new PLSQLTreeParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.label_return label180 = null;

        PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement181 = null;

        PLSQLTreeParser.case_statement_return case_statement182 = null;

        PLSQLTreeParser.close_statement_return close_statement183 = null;

        PLSQLTreeParser.continue_statement_return continue_statement184 = null;

        PLSQLTreeParser.basic_loop_statement_return basic_loop_statement185 = null;

        PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement186 = null;

        PLSQLTreeParser.exit_statement_return exit_statement187 = null;

        PLSQLTreeParser.fetch_statement_return fetch_statement188 = null;

        PLSQLTreeParser.for_loop_statement_return for_loop_statement189 = null;

        PLSQLTreeParser.forall_statement_return forall_statement190 = null;

        PLSQLTreeParser.goto_statement_return goto_statement191 = null;

        PLSQLTreeParser.if_statement_return if_statement192 = null;

        PLSQLTreeParser.null_statement_return null_statement193 = null;

        PLSQLTreeParser.open_statement_return open_statement194 = null;

        PLSQLTreeParser.plsql_block_return plsql_block195 = null;

        PLSQLTreeParser.raise_statement_return raise_statement196 = null;

        PLSQLTreeParser.return_statement_return return_statement197 = null;

        PLSQLTreeParser.sql_statement_return sql_statement198 = null;

        PLSQLTreeParser.while_loop_statement_return while_loop_statement199 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:276:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:277:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:277:5: ( label )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LLABEL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:277:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statement1654);
            	    label180=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label180.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:278:7: assign_or_call_statement
                    {
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1663);
                    assign_or_call_statement181=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement181.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:279:7: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_statement1671);
                    case_statement182=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement182.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:280:7: close_statement
                    {
                    pushFollow(FOLLOW_close_statement_in_statement1679);
                    close_statement183=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement183.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:281:7: continue_statement
                    {
                    pushFollow(FOLLOW_continue_statement_in_statement1687);
                    continue_statement184=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement184.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:282:7: basic_loop_statement
                    {
                    pushFollow(FOLLOW_basic_loop_statement_in_statement1695);
                    basic_loop_statement185=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement185.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:283:7: execute_immediate_statement
                    {
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement1703);
                    execute_immediate_statement186=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement186.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:284:7: exit_statement
                    {
                    pushFollow(FOLLOW_exit_statement_in_statement1711);
                    exit_statement187=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement187.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:285:7: fetch_statement
                    {
                    pushFollow(FOLLOW_fetch_statement_in_statement1719);
                    fetch_statement188=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement188.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:286:7: for_loop_statement
                    {
                    pushFollow(FOLLOW_for_loop_statement_in_statement1727);
                    for_loop_statement189=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement189.getTree());

                    }
                    break;
                case 10 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:287:7: forall_statement
                    {
                    pushFollow(FOLLOW_forall_statement_in_statement1735);
                    forall_statement190=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement190.getTree());

                    }
                    break;
                case 11 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:288:7: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_statement1743);
                    goto_statement191=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement191.getTree());

                    }
                    break;
                case 12 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:289:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement1751);
                    if_statement192=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement192.getTree());

                    }
                    break;
                case 13 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:290:7: null_statement
                    {
                    pushFollow(FOLLOW_null_statement_in_statement1759);
                    null_statement193=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement193.getTree());

                    }
                    break;
                case 14 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:291:7: open_statement
                    {
                    pushFollow(FOLLOW_open_statement_in_statement1767);
                    open_statement194=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement194.getTree());

                    }
                    break;
                case 15 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:292:7: plsql_block
                    {
                    pushFollow(FOLLOW_plsql_block_in_statement1775);
                    plsql_block195=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block195.getTree());

                    }
                    break;
                case 16 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:293:7: raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_statement1783);
                    raise_statement196=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement196.getTree());

                    }
                    break;
                case 17 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:294:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1791);
                    return_statement197=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement197.getTree());

                    }
                    break;
                case 18 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:295:7: sql_statement
                    {
                    pushFollow(FOLLOW_sql_statement_in_statement1799);
                    sql_statement198=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement198.getTree());

                    }
                    break;
                case 19 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:296:7: while_loop_statement
                    {
                    pushFollow(FOLLOW_while_loop_statement_in_statement1807);
                    while_loop_statement199=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement199.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:300:1: lvalue : call ( DOT call )* -> ^( PACKCALL call ( DOT call )* ) ;
    public final PLSQLTreeParser.lvalue_return lvalue() throws RecognitionException {
        PLSQLTreeParser.lvalue_return retval = new PLSQLTreeParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT201=null;
        PLSQLTreeParser.call_return call200 = null;

        PLSQLTreeParser.call_return call202 = null;


        Object DOT201_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:5: ( call ( DOT call )* -> ^( PACKCALL call ( DOT call )* ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:7: call ( DOT call )*
            {
            pushFollow(FOLLOW_call_in_lvalue1830);
            call200=call();

            state._fsp--;

            stream_call.add(call200.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:12: ( DOT call )*
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:14: DOT call
            	    {
            	    DOT201=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1834);  
            	    stream_DOT.add(DOT201);

            	    pushFollow(FOLLOW_call_in_lvalue1836);
            	    call202=call();

            	    state._fsp--;

            	    stream_call.add(call202.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);



            // AST REWRITE
            // elements: call, DOT, call
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 301:26: -> ^( PACKCALL call ( DOT call )* )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:29: ^( PACKCALL call ( DOT call )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKCALL, "PACKCALL"), root_1);

                adaptor.addChild(root_1, stream_call.nextTree());
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:301:45: ( DOT call )*
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:304:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQLTreeParser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQLTreeParser.assign_or_call_statement_return retval = new PLSQLTreeParser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT204=null;
        Token ASSIGN206=null;
        PLSQLTreeParser.lvalue_return lvalue203 = null;

        PLSQLTreeParser.delete_call_return delete_call205 = null;

        PLSQLTreeParser.expression_return expression207 = null;


        Object DOT204_tree=null;
        Object ASSIGN206_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement1873);
            lvalue203=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue203.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:14: ( DOT delete_call | ASSIGN expression )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:16: DOT delete_call
                    {
                    DOT204=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement1877); 
                    DOT204_tree = (Object)adaptor.create(DOT204);
                    adaptor.addChild(root_0, DOT204_tree);

                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement1879);
                    delete_call205=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call205.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:305:34: ASSIGN expression
                    {
                    ASSIGN206=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement1883); 
                    ASSIGN206_tree = (Object)adaptor.create(ASSIGN206);
                    adaptor.addChild(root_0, ASSIGN206_tree);

                    pushFollow(FOLLOW_expression_in_assign_or_call_statement1885);
                    expression207=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression207.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:308:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ;
    public final PLSQLTreeParser.call_return call() throws RecognitionException {
        PLSQLTreeParser.call_return retval = new PLSQLTreeParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON208=null;
        Token ID209=null;
        Token LPAREN210=null;
        Token COMMA212=null;
        Token RPAREN214=null;
        PLSQLTreeParser.parameter_return parameter211 = null;

        PLSQLTreeParser.parameter_return parameter213 = null;


        Object COLON208_tree=null;
        Object ID209_tree=null;
        Object LPAREN210_tree=null;
        Object COMMA212_tree=null;
        Object RPAREN214_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:7: ( COLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:7: COLON
                    {
                    COLON208=(Token)match(input,COLON,FOLLOW_COLON_in_call1905); 
                    COLON208_tree = (Object)adaptor.create(COLON208);
                    adaptor.addChild(root_0, COLON208_tree);


                    }
                    break;

            }

            ID209=(Token)match(input,ID,FOLLOW_ID_in_call1908); 
            ID209_tree = (Object)adaptor.create(ID209);
            adaptor.addChild(root_0, ID209_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call1912); 
                    LPAREN210_tree = (Object)adaptor.create(LPAREN210);
                    adaptor.addChild(root_0, LPAREN210_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:26: ( parameter ( COMMA parameter )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ID||LA59_0==LPAREN||(LA59_0>=NOT && LA59_0<=NULL)||LA59_0==COLON||(LA59_0>=MINUS && LA59_0<=PLUS)||LA59_0==SQL||(LA59_0>=INTEGER && LA59_0<=QUOTED_STRING)||(LA59_0>=INSERTING && LA59_0<=DELETING)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:28: parameter ( COMMA parameter )*
                            {
                            pushFollow(FOLLOW_parameter_in_call1916);
                            parameter211=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter211.getTree());
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:38: ( COMMA parameter )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==COMMA) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:309:40: COMMA parameter
                            	    {
                            	    COMMA212=(Token)match(input,COMMA,FOLLOW_COMMA_in_call1920); 
                            	    COMMA212_tree = (Object)adaptor.create(COMMA212);
                            	    adaptor.addChild(root_0, COMMA212_tree);

                            	    pushFollow(FOLLOW_parameter_in_call1922);
                            	    parameter213=parameter();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, parameter213.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN214=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call1930); 
                    RPAREN214_tree = (Object)adaptor.create(RPAREN214);
                    adaptor.addChild(root_0, RPAREN214_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:312:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQLTreeParser.delete_call_return delete_call() throws RecognitionException {
        PLSQLTreeParser.delete_call_return retval = new PLSQLTreeParser.delete_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE215=null;
        Token LPAREN216=null;
        Token RPAREN218=null;
        PLSQLTreeParser.parameter_return parameter217 = null;


        Object DELETE215_tree=null;
        Object LPAREN216_tree=null;
        Object RPAREN218_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE215=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call1951); 
            DELETE215_tree = (Object)adaptor.create(DELETE215);
            adaptor.addChild(root_0, DELETE215_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:14: ( LPAREN ( parameter )? RPAREN )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:16: LPAREN ( parameter )? RPAREN
                    {
                    LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call1955); 
                    LPAREN216_tree = (Object)adaptor.create(LPAREN216);
                    adaptor.addChild(root_0, LPAREN216_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:23: ( parameter )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ID||LA61_0==LPAREN||(LA61_0>=NOT && LA61_0<=NULL)||LA61_0==COLON||(LA61_0>=MINUS && LA61_0<=PLUS)||LA61_0==SQL||(LA61_0>=INTEGER && LA61_0<=QUOTED_STRING)||(LA61_0>=INSERTING && LA61_0<=DELETING)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:313:23: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_delete_call1957);
                            parameter217=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter217.getTree());

                            }
                            break;

                    }

                    RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call1960); 
                    RPAREN218_tree = (Object)adaptor.create(RPAREN218);
                    adaptor.addChild(root_0, RPAREN218_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:316:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQLTreeParser.basic_loop_statement_return retval = new PLSQLTreeParser.basic_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP219=null;
        Token SEMI221=null;
        Token END222=null;
        Token LOOP223=null;
        PLSQLTreeParser.statement_return statement220 = null;

        PLSQLTreeParser.label_name_return label_name224 = null;


        Object LOOP219_tree=null;
        Object SEMI221_tree=null;
        Object END222_tree=null;
        Object LOOP223_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:316:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:317:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            LOOP219=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1984); 
            LOOP219_tree = (Object)adaptor.create(LOOP219);
            adaptor.addChild(root_0, LOOP219_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:317:14: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:317:16: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement1988);
            	    statement220=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement220.getTree());
            	    SEMI221=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement1990); 
            	    SEMI221_tree = (Object)adaptor.create(SEMI221);
            	    adaptor.addChild(root_0, SEMI221_tree);


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

            END222=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement1995); 
            END222_tree = (Object)adaptor.create(END222);
            adaptor.addChild(root_0, END222_tree);

            LOOP223=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement1997); 
            LOOP223_tree = (Object)adaptor.create(LOOP223);
            adaptor.addChild(root_0, LOOP223_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:317:43: ( label_name )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:317:43: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement1999);
                    label_name224=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name224.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:320:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQLTreeParser.case_statement_return case_statement() throws RecognitionException {
        PLSQLTreeParser.case_statement_return retval = new PLSQLTreeParser.case_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE225=null;
        Token WHEN227=null;
        Token THEN229=null;
        Token SEMI231=null;
        Token ELSE232=null;
        Token SEMI234=null;
        Token END235=null;
        Token CASE236=null;
        PLSQLTreeParser.expression_return expression226 = null;

        PLSQLTreeParser.expression_return expression228 = null;

        PLSQLTreeParser.statement_return statement230 = null;

        PLSQLTreeParser.statement_return statement233 = null;

        PLSQLTreeParser.label_name_return label_name237 = null;


        Object CASE225_tree=null;
        Object WHEN227_tree=null;
        Object THEN229_tree=null;
        Object SEMI231_tree=null;
        Object ELSE232_tree=null;
        Object SEMI234_tree=null;
        Object END235_tree=null;
        Object CASE236_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:320:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:321:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            CASE225=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2021); 
            CASE225_tree = (Object)adaptor.create(CASE225);
            adaptor.addChild(root_0, CASE225_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:321:14: ( expression )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID||LA65_0==LPAREN||(LA65_0>=NOT && LA65_0<=NULL)||LA65_0==COLON||(LA65_0>=MINUS && LA65_0<=PLUS)||LA65_0==SQL||(LA65_0>=INTEGER && LA65_0<=QUOTED_STRING)||(LA65_0>=INSERTING && LA65_0<=DELETING)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:321:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_case_statement2023);
                    expression226=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression226.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:9: ( WHEN expression THEN ( statement SEMI )+ )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    WHEN227=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement2036); 
            	    WHEN227_tree = (Object)adaptor.create(WHEN227);
            	    adaptor.addChild(root_0, WHEN227_tree);

            	    pushFollow(FOLLOW_expression_in_case_statement2038);
            	    expression228=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression228.getTree());
            	    THEN229=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement2040); 
            	    THEN229_tree = (Object)adaptor.create(THEN229);
            	    adaptor.addChild(root_0, THEN229_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:32: ( statement SEMI )+
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
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:322:34: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_case_statement2044);
            	    	    statement230=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement230.getTree());
            	    	    SEMI231=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2046); 
            	    	    SEMI231_tree = (Object)adaptor.create(SEMI231);
            	    	    adaptor.addChild(root_0, SEMI231_tree);


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

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:9: ( ELSE statement SEMI )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ELSE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:323:11: ELSE statement SEMI
                    {
                    ELSE232=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement2064); 
                    ELSE232_tree = (Object)adaptor.create(ELSE232);
                    adaptor.addChild(root_0, ELSE232_tree);

                    pushFollow(FOLLOW_statement_in_case_statement2066);
                    statement233=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement233.getTree());
                    SEMI234=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2068); 
                    SEMI234_tree = (Object)adaptor.create(SEMI234);
                    adaptor.addChild(root_0, SEMI234_tree);


                    }
                    break;

            }

            END235=(Token)match(input,END,FOLLOW_END_in_case_statement2081); 
            END235_tree = (Object)adaptor.create(END235);
            adaptor.addChild(root_0, END235_tree);

            CASE236=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2083); 
            CASE236_tree = (Object)adaptor.create(CASE236);
            adaptor.addChild(root_0, CASE236_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:324:18: ( label_name )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:324:18: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_case_statement2085);
                    label_name237=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name237.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQLTreeParser.close_statement_return close_statement() throws RecognitionException {
        PLSQLTreeParser.close_statement_return retval = new PLSQLTreeParser.close_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE238=null;
        Token ID239=null;
        Token DOT240=null;
        Token ID241=null;

        Object CLOSE238_tree=null;
        Object ID239_tree=null;
        Object DOT240_tree=null;
        Object ID241_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:327:17: ( CLOSE ID ( DOT ID )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (Object)adaptor.nil();

            CLOSE238=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement2107); 
            CLOSE238_tree = (Object)adaptor.create(CLOSE238);
            adaptor.addChild(root_0, CLOSE238_tree);

            ID239=(Token)match(input,ID,FOLLOW_ID_in_close_statement2109); 
            ID239_tree = (Object)adaptor.create(ID239);
            adaptor.addChild(root_0, ID239_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:18: ( DOT ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==DOT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:328:20: DOT ID
                    {
                    DOT240=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement2113); 
                    DOT240_tree = (Object)adaptor.create(DOT240);
                    adaptor.addChild(root_0, DOT240_tree);

                    ID241=(Token)match(input,ID,FOLLOW_ID_in_close_statement2115); 
                    ID241_tree = (Object)adaptor.create(ID241);
                    adaptor.addChild(root_0, ID241_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQLTreeParser.continue_statement_return retval = new PLSQLTreeParser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token CONTINUE242=null;
        Token WHEN243=null;
        PLSQLTreeParser.expression_return expression244 = null;


        Object lbl_tree=null;
        Object CONTINUE242_tree=null;
        Object WHEN243_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:331:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:332:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE242=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement2139); 
            CONTINUE242_tree = (Object)adaptor.create(CONTINUE242);
            adaptor.addChild(root_0, CONTINUE242_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:332:18: (lbl= ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:332:20: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement2145); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:332:30: ( WHEN expression )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WHEN) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:332:32: WHEN expression
                    {
                    WHEN243=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement2152); 
                    WHEN243_tree = (Object)adaptor.create(WHEN243);
                    adaptor.addChild(root_0, WHEN243_tree);

                    pushFollow(FOLLOW_expression_in_continue_statement2154);
                    expression244=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression244.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQLTreeParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQLTreeParser.execute_immediate_statement_return retval = new PLSQLTreeParser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXECUTE245=null;
        Token IMMEDIATE246=null;
        PLSQLTreeParser.expression_return expression247 = null;

        PLSQLTreeParser.into_clause_return into_clause248 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause249 = null;

        PLSQLTreeParser.using_clause_return using_clause250 = null;

        PLSQLTreeParser.using_clause_return using_clause251 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause252 = null;

        PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause253 = null;


        Object EXECUTE245_tree=null;
        Object IMMEDIATE246_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:335:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:336:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (Object)adaptor.nil();

            EXECUTE245=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement2178); 
            EXECUTE245_tree = (Object)adaptor.create(EXECUTE245);
            adaptor.addChild(root_0, EXECUTE245_tree);

            IMMEDIATE246=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement2180); 
            IMMEDIATE246_tree = (Object)adaptor.create(IMMEDIATE246);
            adaptor.addChild(root_0, IMMEDIATE246_tree);

            pushFollow(FOLLOW_expression_in_execute_immediate_statement2182);
            expression247=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression247.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:336:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:9: ( into_clause | bulk_collect_into_clause )
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
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:11: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement2196);
                            into_clause248=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause248.getTree());

                            }
                            break;
                        case 2 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:25: bulk_collect_into_clause
                            {
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2200);
                            bulk_collect_into_clause249=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause249.getTree());

                            }
                            break;

                    }

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:51: ( using_clause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==USING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:337:51: using_clause
                            {
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2203);
                            using_clause250=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause250.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:11: using_clause ( dynamic_returning_clause )?
                    {
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2216);
                    using_clause251=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause251.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:24: ( dynamic_returning_clause )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RETURN||LA75_0==RETURNING) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:338:24: dynamic_returning_clause
                            {
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2218);
                            dynamic_returning_clause252=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause252.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:339:11: dynamic_returning_clause
                    {
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2231);
                    dynamic_returning_clause253=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause253.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQLTreeParser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQLTreeParser.exit_statement_return retval = new PLSQLTreeParser.exit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token EXIT254=null;
        Token WHEN255=null;
        PLSQLTreeParser.expression_return expression256 = null;


        Object lbl_tree=null;
        Object EXIT254_tree=null;
        Object WHEN255_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:343:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            EXIT254=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement2263); 
            EXIT254_tree = (Object)adaptor.create(EXIT254);
            adaptor.addChild(root_0, EXIT254_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:14: (lbl= ID )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:16: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement2269); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:26: ( WHEN expression )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==WHEN) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:344:28: WHEN expression
                    {
                    WHEN255=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement2276); 
                    WHEN255_tree = (Object)adaptor.create(WHEN255);
                    adaptor.addChild(root_0, WHEN255_tree);

                    pushFollow(FOLLOW_expression_in_exit_statement2278);
                    expression256=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression256.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:347:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQLTreeParser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQLTreeParser.fetch_statement_return retval = new PLSQLTreeParser.fetch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FETCH257=null;
        Token LIMIT261=null;
        PLSQLTreeParser.qual_id_return qual_id258 = null;

        PLSQLTreeParser.into_clause_return into_clause259 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause260 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression262 = null;


        Object FETCH257_tree=null;
        Object LIMIT261_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:347:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (Object)adaptor.nil();

            FETCH257=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement2302); 
            FETCH257_tree = (Object)adaptor.create(FETCH257);
            adaptor.addChild(root_0, FETCH257_tree);

            pushFollow(FOLLOW_qual_id_in_fetch_statement2304);
            qual_id258=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id258.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:25: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_fetch_statement2308);
                    into_clause259=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause259.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement2312);
                    bulk_collect_into_clause260=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause260.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:64: ( LIMIT numeric_expression )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==LIMIT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:348:66: LIMIT numeric_expression
                            {
                            LIMIT261=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement2316); 
                            LIMIT261_tree = (Object)adaptor.create(LIMIT261);
                            adaptor.addChild(root_0, LIMIT261_tree);

                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement2318);
                            numeric_expression262=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression262.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:351:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.into_clause_return into_clause() throws RecognitionException {
        PLSQLTreeParser.into_clause_return retval = new PLSQLTreeParser.into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTO263=null;
        Token COMMA265=null;
        PLSQLTreeParser.lvalue_return lvalue264 = null;

        PLSQLTreeParser.lvalue_return lvalue266 = null;


        Object INTO263_tree=null;
        Object COMMA265_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:351:13: ( INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:352:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            INTO263=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2348); 
            INTO263_tree = (Object)adaptor.create(INTO263);
            adaptor.addChild(root_0, INTO263_tree);

            pushFollow(FOLLOW_lvalue_in_into_clause2350);
            lvalue264=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue264.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:352:21: ( COMMA lvalue )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:352:23: COMMA lvalue
            	    {
            	    COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2354); 
            	    COMMA265_tree = (Object)adaptor.create(COMMA265);
            	    adaptor.addChild(root_0, COMMA265_tree);

            	    pushFollow(FOLLOW_lvalue_in_into_clause2356);
            	    lvalue266=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue266.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:355:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQLTreeParser.bulk_collect_into_clause_return retval = new PLSQLTreeParser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK267=null;
        Token COLLECT268=null;
        Token INTO269=null;
        Token COMMA271=null;
        PLSQLTreeParser.lvalue_return lvalue270 = null;

        PLSQLTreeParser.lvalue_return lvalue272 = null;


        Object BULK267_tree=null;
        Object COLLECT268_tree=null;
        Object INTO269_tree=null;
        Object COMMA271_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:355:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:356:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            BULK267=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2384); 
            BULK267_tree = (Object)adaptor.create(BULK267);
            adaptor.addChild(root_0, BULK267_tree);

            COLLECT268=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2386); 
            COLLECT268_tree = (Object)adaptor.create(COLLECT268);
            adaptor.addChild(root_0, COLLECT268_tree);

            INTO269=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2388); 
            INTO269_tree = (Object)adaptor.create(INTO269);
            adaptor.addChild(root_0, INTO269_tree);

            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2390);
            lvalue270=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue270.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:356:34: ( COMMA lvalue )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:356:36: COMMA lvalue
            	    {
            	    COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2394); 
            	    COMMA271_tree = (Object)adaptor.create(COMMA271);
            	    adaptor.addChild(root_0, COMMA271_tree);

            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2396);
            	    lvalue272=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue272.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQLTreeParser.using_clause_return using_clause() throws RecognitionException {
        PLSQLTreeParser.using_clause_return retval = new PLSQLTreeParser.using_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING273=null;
        Token COMMA276=null;
        PLSQLTreeParser.param_modifiers_return param_modifiers274 = null;

        PLSQLTreeParser.expression_return expression275 = null;

        PLSQLTreeParser.param_modifiers_return param_modifiers277 = null;

        PLSQLTreeParser.expression_return expression278 = null;


        Object USING273_tree=null;
        Object COMMA276_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:359:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (Object)adaptor.nil();

            USING273=(Token)match(input,USING,FOLLOW_USING_in_using_clause2420); 
            USING273_tree = (Object)adaptor.create(USING273);
            adaptor.addChild(root_0, USING273_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:15: ( param_modifiers )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=IN && LA83_0<=OUT)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:15: param_modifiers
                    {
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2422);
                    param_modifiers274=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers274.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_using_clause2425);
            expression275=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression275.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:43: ( COMMA ( param_modifiers )? expression )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:45: COMMA ( param_modifiers )? expression
            	    {
            	    COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2429); 
            	    COMMA276_tree = (Object)adaptor.create(COMMA276);
            	    adaptor.addChild(root_0, COMMA276_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:51: ( param_modifiers )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( ((LA84_0>=IN && LA84_0<=OUT)) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:360:51: param_modifiers
            	            {
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2431);
            	            param_modifiers277=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers277.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_using_clause2434);
            	    expression278=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression278.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:363:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQLTreeParser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQLTreeParser.param_modifiers_return retval = new PLSQLTreeParser.param_modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN279=null;
        Token OUT280=null;
        Token OUT281=null;

        Object IN279_tree=null;
        Object OUT280_tree=null;
        Object OUT281_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:2: ( IN ( OUT )? | OUT )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:4: IN ( OUT )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IN279=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2451); 
                    IN279_tree = (Object)adaptor.create(IN279);
                    adaptor.addChild(root_0, IN279_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:7: ( OUT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==OUT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:7: OUT
                            {
                            OUT280=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2453); 
                            OUT280_tree = (Object)adaptor.create(OUT280);
                            adaptor.addChild(root_0, OUT280_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:364:14: OUT
                    {
                    root_0 = (Object)adaptor.nil();

                    OUT281=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2458); 
                    OUT281_tree = (Object)adaptor.create(OUT281);
                    adaptor.addChild(root_0, OUT281_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:367:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQLTreeParser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQLTreeParser.dynamic_returning_clause_return retval = new PLSQLTreeParser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set282=null;
        PLSQLTreeParser.into_clause_return into_clause283 = null;

        PLSQLTreeParser.bulk_collect_into_clause_return bulk_collect_into_clause284 = null;


        Object set282_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:367:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (Object)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set282));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:32: ( into_clause | bulk_collect_into_clause )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:34: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2488);
                    into_clause283=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause283.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:368:48: bulk_collect_into_clause
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2492);
                    bulk_collect_into_clause284=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause284.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:371:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQLTreeParser.for_loop_statement_return retval = new PLSQLTreeParser.for_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR285=null;
        Token ID286=null;
        Token IN287=null;
        Token set288=null;
        Token LOOP289=null;
        Token SEMI291=null;
        Token END292=null;
        Token LOOP293=null;
        PLSQLTreeParser.statement_return statement290 = null;

        PLSQLTreeParser.label_name_return label_name294 = null;


        Object FOR285_tree=null;
        Object ID286_tree=null;
        Object IN287_tree=null;
        Object set288_tree=null;
        Object LOOP289_tree=null;
        Object SEMI291_tree=null;
        Object END292_tree=null;
        Object LOOP293_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:371:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            FOR285=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2515); 
            FOR285_tree = (Object)adaptor.create(FOR285);
            adaptor.addChild(root_0, FOR285_tree);

            ID286=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2517); 
            ID286_tree = (Object)adaptor.create(ID286);
            adaptor.addChild(root_0, ID286_tree);

            IN287=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2519); 
            IN287_tree = (Object)adaptor.create(IN287);
            adaptor.addChild(root_0, IN287_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:19: (~ ( LOOP ) )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:21: ~ ( LOOP )
            	    {
            	    set288=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=Z) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set288));
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

            LOOP289=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2531); 
            LOOP289_tree = (Object)adaptor.create(LOOP289);
            adaptor.addChild(root_0, LOOP289_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:37: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:39: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2535);
            	    statement290=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement290.getTree());
            	    SEMI291=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2537); 
            	    SEMI291_tree = (Object)adaptor.create(SEMI291);
            	    adaptor.addChild(root_0, SEMI291_tree);


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

            END292=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2542); 
            END292_tree = (Object)adaptor.create(END292);
            adaptor.addChild(root_0, END292_tree);

            LOOP293=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2544); 
            LOOP293_tree = (Object)adaptor.create(LOOP293);
            adaptor.addChild(root_0, LOOP293_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:66: ( label_name )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:372:66: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2546);
                    label_name294=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name294.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:375:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQLTreeParser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQLTreeParser.forall_statement_return retval = new PLSQLTreeParser.forall_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORALL295=null;
        Token ID296=null;
        Token IN297=null;
        PLSQLTreeParser.bounds_clause_return bounds_clause298 = null;

        PLSQLTreeParser.sql_statement_return sql_statement299 = null;

        PLSQLTreeParser.kSAVE_return kSAVE300 = null;

        PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS301 = null;


        Object FORALL295_tree=null;
        Object ID296_tree=null;
        Object IN297_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:375:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (Object)adaptor.nil();

            FORALL295=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2568); 
            FORALL295_tree = (Object)adaptor.create(FORALL295);
            adaptor.addChild(root_0, FORALL295_tree);

            ID296=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2570); 
            ID296_tree = (Object)adaptor.create(ID296);
            adaptor.addChild(root_0, ID296_tree);

            IN297=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2572); 
            IN297_tree = (Object)adaptor.create(IN297);
            adaptor.addChild(root_0, IN297_tree);

            pushFollow(FOLLOW_bounds_clause_in_forall_statement2574);
            bounds_clause298=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause298.getTree());
            pushFollow(FOLLOW_sql_statement_in_forall_statement2576);
            sql_statement299=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement299.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:50: ( kSAVE kEXCEPTIONS )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:376:52: kSAVE kEXCEPTIONS
                    {
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2580);
                    kSAVE300=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE300.getTree());
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2582);
                    kEXCEPTIONS301=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS301.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:379:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQLTreeParser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQLTreeParser.bounds_clause_return retval = new PLSQLTreeParser.bounds_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLEDOT303=null;
        Token BETWEEN308=null;
        Token AND310=null;
        PLSQLTreeParser.numeric_expression_return numeric_expression302 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression304 = null;

        PLSQLTreeParser.kINDICES_return kINDICES305 = null;

        PLSQLTreeParser.kOF_return kOF306 = null;

        PLSQLTreeParser.atom_return atom307 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression309 = null;

        PLSQLTreeParser.numeric_expression_return numeric_expression311 = null;

        PLSQLTreeParser.kVALUES_return kVALUES312 = null;

        PLSQLTreeParser.kOF_return kOF313 = null;

        PLSQLTreeParser.atom_return atom314 = null;


        Object DOUBLEDOT303_tree=null;
        Object BETWEEN308_tree=null;
        Object AND310_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:380:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt94=3;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:380:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2604);
                    numeric_expression302=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression302.getTree());
                    DOUBLEDOT303=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2606); 
                    DOUBLEDOT303_tree = (Object)adaptor.create(DOUBLEDOT303);
                    adaptor.addChild(root_0, DOUBLEDOT303_tree);

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2608);
                    numeric_expression304=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression304.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:381:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2616);
                    kINDICES305=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES305.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2618);
                    kOF306=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF306.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2620);
                    atom307=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom307.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:381:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==BETWEEN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:381:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            BETWEEN308=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2624); 
                            BETWEEN308_tree = (Object)adaptor.create(BETWEEN308);
                            adaptor.addChild(root_0, BETWEEN308_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2626);
                            numeric_expression309=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression309.getTree());
                            AND310=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2628); 
                            AND310_tree = (Object)adaptor.create(AND310);
                            adaptor.addChild(root_0, AND310_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2630);
                            numeric_expression311=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression311.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:382:7: kVALUES kOF atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2641);
                    kVALUES312=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES312.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2643);
                    kOF313=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF313.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2645);
                    atom314=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom314.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:385:1: goto_statement : GOTO label_name ;
    public final PLSQLTreeParser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQLTreeParser.goto_statement_return retval = new PLSQLTreeParser.goto_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GOTO315=null;
        PLSQLTreeParser.label_name_return label_name316 = null;


        Object GOTO315_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:385:16: ( GOTO label_name )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:386:9: GOTO label_name
            {
            root_0 = (Object)adaptor.nil();

            GOTO315=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2666); 
            GOTO315_tree = (Object)adaptor.create(GOTO315);
            adaptor.addChild(root_0, GOTO315_tree);

            pushFollow(FOLLOW_label_name_in_goto_statement2668);
            label_name316=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name316.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:389:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQLTreeParser.if_statement_return if_statement() throws RecognitionException {
        PLSQLTreeParser.if_statement_return retval = new PLSQLTreeParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF317=null;
        Token THEN319=null;
        Token SEMI321=null;
        Token ELSIF322=null;
        Token THEN324=null;
        Token SEMI326=null;
        Token ELSE327=null;
        Token SEMI329=null;
        Token END330=null;
        Token IF331=null;
        PLSQLTreeParser.expression_return expression318 = null;

        PLSQLTreeParser.statement_return statement320 = null;

        PLSQLTreeParser.expression_return expression323 = null;

        PLSQLTreeParser.statement_return statement325 = null;

        PLSQLTreeParser.statement_return statement328 = null;


        Object IF317_tree=null;
        Object THEN319_tree=null;
        Object SEMI321_tree=null;
        Object ELSIF322_tree=null;
        Object THEN324_tree=null;
        Object SEMI326_tree=null;
        Object ELSE327_tree=null;
        Object SEMI329_tree=null;
        Object END330_tree=null;
        Object IF331_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:389:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:390:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (Object)adaptor.nil();

            IF317=(Token)match(input,IF,FOLLOW_IF_in_if_statement2689); 
            IF317_tree = (Object)adaptor.create(IF317);
            adaptor.addChild(root_0, IF317_tree);

            pushFollow(FOLLOW_expression_in_if_statement2691);
            expression318=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression318.getTree());
            THEN319=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2693); 
            THEN319_tree = (Object)adaptor.create(THEN319);
            adaptor.addChild(root_0, THEN319_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:390:28: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:390:30: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement2697);
            	    statement320=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement320.getTree());
            	    SEMI321=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2699); 
            	    SEMI321_tree = (Object)adaptor.create(SEMI321);
            	    adaptor.addChild(root_0, SEMI321_tree);


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

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ELSIF) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    ELSIF322=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement2714); 
            	    ELSIF322_tree = (Object)adaptor.create(ELSIF322);
            	    adaptor.addChild(root_0, ELSIF322_tree);

            	    pushFollow(FOLLOW_expression_in_if_statement2716);
            	    expression323=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression323.getTree());
            	    THEN324=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement2718); 
            	    THEN324_tree = (Object)adaptor.create(THEN324);
            	    adaptor.addChild(root_0, THEN324_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:33: ( statement SEMI )+
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
            	    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:391:35: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement2722);
            	    	    statement325=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement325.getTree());
            	    	    SEMI326=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2724); 
            	    	    SEMI326_tree = (Object)adaptor.create(SEMI326);
            	    	    adaptor.addChild(root_0, SEMI326_tree);


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

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:9: ( ELSE ( statement SEMI )+ )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ELSE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:11: ELSE ( statement SEMI )+
                    {
                    ELSE327=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement2742); 
                    ELSE327_tree = (Object)adaptor.create(ELSE327);
                    adaptor.addChild(root_0, ELSE327_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:16: ( statement SEMI )+
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
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:392:18: statement SEMI
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement2746);
                    	    statement328=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement328.getTree());
                    	    SEMI329=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement2748); 
                    	    SEMI329_tree = (Object)adaptor.create(SEMI329);
                    	    adaptor.addChild(root_0, SEMI329_tree);


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

            END330=(Token)match(input,END,FOLLOW_END_in_if_statement2764); 
            END330_tree = (Object)adaptor.create(END330);
            adaptor.addChild(root_0, END330_tree);

            IF331=(Token)match(input,IF,FOLLOW_IF_in_if_statement2766); 
            IF331_tree = (Object)adaptor.create(IF331);
            adaptor.addChild(root_0, IF331_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:1: null_statement : NULL ;
    public final PLSQLTreeParser.null_statement_return null_statement() throws RecognitionException {
        PLSQLTreeParser.null_statement_return retval = new PLSQLTreeParser.null_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL332=null;

        Object NULL332_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:396:16: ( NULL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:397:9: NULL
            {
            root_0 = (Object)adaptor.nil();

            NULL332=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement2787); 
            NULL332_tree = (Object)adaptor.create(NULL332);
            adaptor.addChild(root_0, NULL332_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:400:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQLTreeParser.open_statement_return open_statement() throws RecognitionException {
        PLSQLTreeParser.open_statement_return retval = new PLSQLTreeParser.open_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN333=null;
        Token ID334=null;
        Token DOT335=null;
        Token ID336=null;
        Token FOR338=null;
        PLSQLTreeParser.call_args_return call_args337 = null;

        PLSQLTreeParser.select_statement_return select_statement339 = null;


        Object OPEN333_tree=null;
        Object ID334_tree=null;
        Object DOT335_tree=null;
        Object ID336_tree=null;
        Object FOR338_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:400:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (Object)adaptor.nil();

            OPEN333=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement2808); 
            OPEN333_tree = (Object)adaptor.create(OPEN333);
            adaptor.addChild(root_0, OPEN333_tree);

            ID334=(Token)match(input,ID,FOLLOW_ID_in_open_statement2810); 
            ID334_tree = (Object)adaptor.create(ID334);
            adaptor.addChild(root_0, ID334_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:17: ( DOT ID )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==DOT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:19: DOT ID
            	    {
            	    DOT335=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement2814); 
            	    DOT335_tree = (Object)adaptor.create(DOT335);
            	    adaptor.addChild(root_0, DOT335_tree);

            	    ID336=(Token)match(input,ID,FOLLOW_ID_in_open_statement2816); 
            	    ID336_tree = (Object)adaptor.create(ID336);
            	    adaptor.addChild(root_0, ID336_tree);


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:29: ( call_args )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LPAREN) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:29: call_args
                    {
                    pushFollow(FOLLOW_call_args_in_open_statement2821);
                    call_args337=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args337.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:40: ( FOR select_statement )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FOR) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:401:42: FOR select_statement
                    {
                    FOR338=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement2826); 
                    FOR338_tree = (Object)adaptor.create(FOR338);
                    adaptor.addChild(root_0, FOR338_tree);

                    pushFollow(FOLLOW_select_statement_in_open_statement2828);
                    select_statement339=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement339.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:404:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQLTreeParser.pragma_return pragma() throws RecognitionException {
        PLSQLTreeParser.pragma_return retval = new PLSQLTreeParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA340=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi341 = null;


        Object PRAGMA340_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:404:8: ( PRAGMA swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:405:9: PRAGMA swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA340=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma2852); 
            PRAGMA340_tree = (Object)adaptor.create(PRAGMA340);
            adaptor.addChild(root_0, PRAGMA340_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_pragma2854);
            swallow_to_semi341=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi341.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:408:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQLTreeParser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQLTreeParser.raise_statement_return retval = new PLSQLTreeParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RAISE342=null;
        Token ID343=null;
        Token DOT344=null;
        Token ID345=null;

        Object RAISE342_tree=null;
        Object ID343_tree=null;
        Object DOT344_tree=null;
        Object ID345_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:408:17: ( RAISE ( ID ( DOT ID )* )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:409:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (Object)adaptor.nil();

            RAISE342=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement2875); 
            RAISE342_tree = (Object)adaptor.create(RAISE342);
            adaptor.addChild(root_0, RAISE342_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:409:15: ( ID ( DOT ID )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:409:17: ID ( DOT ID )*
                    {
                    ID343=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2879); 
                    ID343_tree = (Object)adaptor.create(ID343);
                    adaptor.addChild(root_0, ID343_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:409:20: ( DOT ID )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==DOT) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:409:22: DOT ID
                    	    {
                    	    DOT344=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement2883); 
                    	    DOT344_tree = (Object)adaptor.create(DOT344);
                    	    adaptor.addChild(root_0, DOT344_tree);

                    	    ID345=(Token)match(input,ID,FOLLOW_ID_in_raise_statement2885); 
                    	    ID345_tree = (Object)adaptor.create(ID345);
                    	    adaptor.addChild(root_0, ID345_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:412:1: return_statement : RETURN ( expression )? ;
    public final PLSQLTreeParser.return_statement_return return_statement() throws RecognitionException {
        PLSQLTreeParser.return_statement_return retval = new PLSQLTreeParser.return_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN346=null;
        PLSQLTreeParser.expression_return expression347 = null;


        Object RETURN346_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:412:18: ( RETURN ( expression )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:413:9: RETURN ( expression )?
            {
            root_0 = (Object)adaptor.nil();

            RETURN346=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement2912); 
            RETURN346_tree = (Object)adaptor.create(RETURN346);
            adaptor.addChild(root_0, RETURN346_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:413:16: ( expression )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ID||LA105_0==LPAREN||(LA105_0>=NOT && LA105_0<=NULL)||LA105_0==COLON||(LA105_0>=MINUS && LA105_0<=PLUS)||LA105_0==SQL||(LA105_0>=INTEGER && LA105_0<=QUOTED_STRING)||(LA105_0>=INSERTING && LA105_0<=DELETING)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:413:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement2914);
                    expression347=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression347.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:416:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQLTreeParser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQLTreeParser.plsql_block_return retval = new PLSQLTreeParser.plsql_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DECLARE348=null;
        PLSQLTreeParser.declare_section_return declare_section349 = null;

        PLSQLTreeParser.body_return body350 = null;


        Object DECLARE348_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:416:13: ( ( DECLARE declare_section )? body )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:417:9: ( DECLARE declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:417:9: ( DECLARE declare_section )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==DECLARE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:417:11: DECLARE declare_section
                    {
                    DECLARE348=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block2938); 
                    DECLARE348_tree = (Object)adaptor.create(DECLARE348);
                    adaptor.addChild(root_0, DECLARE348_tree);

                    pushFollow(FOLLOW_declare_section_in_plsql_block2940);
                    declare_section349=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section349.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_plsql_block2945);
            body350=body();

            state._fsp--;

            adaptor.addChild(root_0, body350.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:420:1: label : LLABEL label RLABEL ;
    public final PLSQLTreeParser.label_return label() throws RecognitionException {
        PLSQLTreeParser.label_return retval = new PLSQLTreeParser.label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LLABEL351=null;
        Token RLABEL353=null;
        PLSQLTreeParser.label_return label352 = null;


        Object LLABEL351_tree=null;
        Object RLABEL353_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:420:7: ( LLABEL label RLABEL )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:421:9: LLABEL label RLABEL
            {
            root_0 = (Object)adaptor.nil();

            LLABEL351=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label2966); 
            LLABEL351_tree = (Object)adaptor.create(LLABEL351);
            adaptor.addChild(root_0, LLABEL351_tree);

            pushFollow(FOLLOW_label_in_label2968);
            label352=label();

            state._fsp--;

            adaptor.addChild(root_0, label352.getTree());
            RLABEL353=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label2970); 
            RLABEL353_tree = (Object)adaptor.create(RLABEL353);
            adaptor.addChild(root_0, RLABEL353_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:424:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQLTreeParser.qual_id_return qual_id() throws RecognitionException {
        PLSQLTreeParser.qual_id_return retval = new PLSQLTreeParser.qual_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON354=null;
        Token ID355=null;
        Token DOT356=null;
        Token COLON357=null;
        Token ID358=null;

        Object COLON354_tree=null;
        Object ID355_tree=null;
        Object DOT356_tree=null;
        Object COLON357_tree=null;
        Object ID358_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:424:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:2: ( COLON )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==COLON) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:2: COLON
                    {
                    COLON354=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2984); 
                    COLON354_tree = (Object)adaptor.create(COLON354);
                    adaptor.addChild(root_0, COLON354_tree);


                    }
                    break;

            }

            ID355=(Token)match(input,ID,FOLLOW_ID_in_qual_id2987); 
            ID355_tree = (Object)adaptor.create(ID355);
            adaptor.addChild(root_0, ID355_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:12: ( DOT ( COLON )? ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==DOT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:14: DOT ( COLON )? ID
            	    {
            	    DOT356=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id2991); 
            	    DOT356_tree = (Object)adaptor.create(DOT356);
            	    adaptor.addChild(root_0, DOT356_tree);

            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:18: ( COLON )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==COLON) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:425:18: COLON
            	            {
            	            COLON357=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id2993); 
            	            COLON357_tree = (Object)adaptor.create(COLON357);
            	            adaptor.addChild(root_0, COLON357_tree);


            	            }
            	            break;

            	    }

            	    ID358=(Token)match(input,ID,FOLLOW_ID_in_qual_id2996); 
            	    ID358_tree = (Object)adaptor.create(ID358);
            	    adaptor.addChild(root_0, ID358_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:428:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQLTreeParser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQLTreeParser.sql_statement_return retval = new PLSQLTreeParser.sql_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.commit_statement_return commit_statement359 = null;

        PLSQLTreeParser.delete_statement_return delete_statement360 = null;

        PLSQLTreeParser.insert_statement_return insert_statement361 = null;

        PLSQLTreeParser.lock_table_statement_return lock_table_statement362 = null;

        PLSQLTreeParser.rollback_statement_return rollback_statement363 = null;

        PLSQLTreeParser.savepoint_statement_return savepoint_statement364 = null;

        PLSQLTreeParser.select_statement_return select_statement365 = null;

        PLSQLTreeParser.set_transaction_statement_return set_transaction_statement366 = null;

        PLSQLTreeParser.update_statement_return update_statement367 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:429:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:429:7: commit_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_statement_in_sql_statement3016);
                    commit_statement359=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement359.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:430:7: delete_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_statement_in_sql_statement3024);
                    delete_statement360=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement360.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:431:7: insert_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_statement_in_sql_statement3032);
                    insert_statement361=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement361.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:432:7: lock_table_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement3040);
                    lock_table_statement362=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement362.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:433:7: rollback_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_statement_in_sql_statement3048);
                    rollback_statement363=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement363.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:434:7: savepoint_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement3056);
                    savepoint_statement364=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement364.getTree());

                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:435:7: select_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_statement_in_sql_statement3064);
                    select_statement365=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement365.getTree());

                    }
                    break;
                case 8 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:436:7: set_transaction_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement3072);
                    set_transaction_statement366=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement366.getTree());

                    }
                    break;
                case 9 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:437:7: update_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_statement_in_sql_statement3080);
                    update_statement367=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement367.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:440:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQLTreeParser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQLTreeParser.commit_statement_return retval = new PLSQLTreeParser.commit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT368=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi369 = null;


        Object COMMIT368_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:440:18: ( COMMIT ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:441:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            COMMIT368=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement3101); 
            COMMIT368_tree = (Object)adaptor.create(COMMIT368);
            adaptor.addChild(root_0, COMMIT368_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:441:16: ( swallow_to_semi )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==ID) ) {
                    int LA111_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt111=1;
                    }
                }
                else if ( ((LA111_1>=PROC && LA111_1<=PROCEDURE)||(LA111_1>=FUNCTION && LA111_1<=Z)) ) {
                    alt111=1;
                }
            }
            else if ( ((LA111_0>=PROC && LA111_0<=DIVIDE)||LA111_0==PROCEDURE||(LA111_0>=FUNCTION && LA111_0<=Z)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:441:16: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement3103);
                    swallow_to_semi369=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi369.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:444:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQLTreeParser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQLTreeParser.delete_statement_return retval = new PLSQLTreeParser.delete_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE370=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi371 = null;


        Object DELETE370_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:444:18: ( DELETE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:445:9: DELETE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            DELETE370=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement3125); 
            DELETE370_tree = (Object)adaptor.create(DELETE370);
            adaptor.addChild(root_0, DELETE370_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement3127);
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
    // $ANTLR end "delete_statement"

    public static class insert_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQLTreeParser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQLTreeParser.insert_statement_return retval = new PLSQLTreeParser.insert_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT372=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi373 = null;


        Object INSERT372_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:448:18: ( INSERT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:449:9: INSERT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            INSERT372=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement3148); 
            INSERT372_tree = (Object)adaptor.create(INSERT372);
            adaptor.addChild(root_0, INSERT372_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement3150);
            swallow_to_semi373=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi373.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQLTreeParser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQLTreeParser.lock_table_statement_return retval = new PLSQLTreeParser.lock_table_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOCK374=null;
        Token TABLE375=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi376 = null;


        Object LOCK374_tree=null;
        Object TABLE375_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:452:22: ( LOCK TABLE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:453:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LOCK374=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement3171); 
            LOCK374_tree = (Object)adaptor.create(LOCK374);
            adaptor.addChild(root_0, LOCK374_tree);

            TABLE375=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement3173); 
            TABLE375_tree = (Object)adaptor.create(TABLE375);
            adaptor.addChild(root_0, TABLE375_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement3175);
            swallow_to_semi376=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi376.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:456:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQLTreeParser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQLTreeParser.rollback_statement_return retval = new PLSQLTreeParser.rollback_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK377=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi378 = null;


        Object ROLLBACK377_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:456:20: ( ROLLBACK ( swallow_to_semi )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:457:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK377=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement3196); 
            ROLLBACK377_tree = (Object)adaptor.create(ROLLBACK377);
            adaptor.addChild(root_0, ROLLBACK377_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:457:18: ( swallow_to_semi )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:457:18: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement3198);
                    swallow_to_semi378=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi378.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:460:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQLTreeParser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQLTreeParser.savepoint_statement_return retval = new PLSQLTreeParser.savepoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT379=null;
        Token ID380=null;

        Object SAVEPOINT379_tree=null;
        Object ID380_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:460:21: ( SAVEPOINT ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:461:9: SAVEPOINT ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT379=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement3220); 
            SAVEPOINT379_tree = (Object)adaptor.create(SAVEPOINT379);
            adaptor.addChild(root_0, SAVEPOINT379_tree);

            ID380=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement3222); 
            ID380_tree = (Object)adaptor.create(ID380);
            adaptor.addChild(root_0, ID380_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:464:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQLTreeParser.select_statement_return select_statement() throws RecognitionException {
        PLSQLTreeParser.select_statement_return retval = new PLSQLTreeParser.select_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT381=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi382 = null;


        Object SELECT381_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:464:18: ( SELECT swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:465:9: SELECT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SELECT381=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement3243); 
            SELECT381_tree = (Object)adaptor.create(SELECT381);
            adaptor.addChild(root_0, SELECT381_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_select_statement3245);
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
    // $ANTLR end "select_statement"

    public static class set_transaction_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_transaction_statement"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:468:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQLTreeParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQLTreeParser.set_transaction_statement_return retval = new PLSQLTreeParser.set_transaction_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET383=null;
        Token TRANSACTION384=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi385 = null;


        Object SET383_tree=null;
        Object TRANSACTION384_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:468:27: ( SET TRANSACTION swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:469:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SET383=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement3266); 
            SET383_tree = (Object)adaptor.create(SET383);
            adaptor.addChild(root_0, SET383_tree);

            TRANSACTION384=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement3268); 
            TRANSACTION384_tree = (Object)adaptor.create(TRANSACTION384);
            adaptor.addChild(root_0, TRANSACTION384_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement3270);
            swallow_to_semi385=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi385.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:472:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQLTreeParser.update_statement_return update_statement() throws RecognitionException {
        PLSQLTreeParser.update_statement_return retval = new PLSQLTreeParser.update_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE386=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi387 = null;


        Object UPDATE386_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:472:18: ( UPDATE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:473:9: UPDATE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            UPDATE386=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement3291); 
            UPDATE386_tree = (Object)adaptor.create(UPDATE386);
            adaptor.addChild(root_0, UPDATE386_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_update_statement3293);
            swallow_to_semi387=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi387.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:476:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQLTreeParser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQLTreeParser.swallow_to_semi_return retval = new PLSQLTreeParser.swallow_to_semi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set388=null;

        Object set388_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:476:17: ( (~ ( SEMI ) )+ )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:477:9: (~ ( SEMI ) )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:477:9: (~ ( SEMI ) )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:477:9: ~ ( SEMI )
            	    {
            	    set388=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=Z) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set388));
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:480:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQLTreeParser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQLTreeParser.while_loop_statement_return retval = new PLSQLTreeParser.while_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE389=null;
        Token LOOP391=null;
        Token SEMI393=null;
        Token END394=null;
        Token LOOP395=null;
        PLSQLTreeParser.expression_return expression390 = null;

        PLSQLTreeParser.statement_return statement392 = null;

        PLSQLTreeParser.label_name_return label_name396 = null;


        Object WHILE389_tree=null;
        Object LOOP391_tree=null;
        Object SEMI393_tree=null;
        Object END394_tree=null;
        Object LOOP395_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:480:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:481:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            WHILE389=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3341); 
            WHILE389_tree = (Object)adaptor.create(WHILE389);
            adaptor.addChild(root_0, WHILE389_tree);

            pushFollow(FOLLOW_expression_in_while_loop_statement3343);
            expression390=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression390.getTree());
            LOOP391=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3345); 
            LOOP391_tree = (Object)adaptor.create(LOOP391);
            adaptor.addChild(root_0, LOOP391_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:481:31: ( statement SEMI )+
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:481:33: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3349);
            	    statement392=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement392.getTree());
            	    SEMI393=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3351); 
            	    SEMI393_tree = (Object)adaptor.create(SEMI393);
            	    adaptor.addChild(root_0, SEMI393_tree);


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

            END394=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3356); 
            END394_tree = (Object)adaptor.create(END394);
            adaptor.addChild(root_0, END394_tree);

            LOOP395=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3358); 
            LOOP395_tree = (Object)adaptor.create(LOOP395);
            adaptor.addChild(root_0, LOOP395_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:481:60: ( label_name )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ID) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:481:60: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3360);
                    label_name396=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name396.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:484:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQLTreeParser.match_parens_return match_parens() throws RecognitionException {
        PLSQLTreeParser.match_parens_return retval = new PLSQLTreeParser.match_parens_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set397=null;
        Token RPAREN398=null;
        Token LPAREN400=null;
        PLSQLTreeParser.match_parens_return match_parens399 = null;


        Object set397_tree=null;
        Object RPAREN398_tree=null;
        Object LPAREN400_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:485:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:485:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:485:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
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
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:485:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    set397=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=PROC && input.LA(1)<=DIVIDE)||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=RESULT_CACHE)||(input.LA(1)>=BEGIN && input.LA(1)<=Z) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set397));
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:486:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    RPAREN398=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3429); 
                    RPAREN398_tree = (Object)adaptor.create(RPAREN398);
                    adaptor.addChild(root_0, RPAREN398_tree);

                    pushFollow(FOLLOW_match_parens_in_match_parens3431);
                    match_parens399=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens399.getTree());
                    LPAREN400=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3433); 
                    LPAREN400_tree = (Object)adaptor.create(LPAREN400);
                    adaptor.addChild(root_0, LPAREN400_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:489:1: label_name : ID ;
    public final PLSQLTreeParser.label_name_return label_name() throws RecognitionException {
        PLSQLTreeParser.label_name_return retval = new PLSQLTreeParser.label_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID401=null;

        Object ID401_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:489:11: ( ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:489:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID401=(Token)match(input,ID,FOLLOW_ID_in_label_name3445); 
            ID401_tree = (Object)adaptor.create(ID401);
            adaptor.addChild(root_0, ID401_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:491:1: expression : or_expr ;
    public final PLSQLTreeParser.expression_return expression() throws RecognitionException {
        PLSQLTreeParser.expression_return retval = new PLSQLTreeParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.or_expr_return or_expr402 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:492:5: ( or_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:492:7: or_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_expression3457);
            or_expr402=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr402.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:495:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQLTreeParser.or_expr_return or_expr() throws RecognitionException {
        PLSQLTreeParser.or_expr_return retval = new PLSQLTreeParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR404=null;
        PLSQLTreeParser.and_expr_return and_expr403 = null;

        PLSQLTreeParser.and_expr_return and_expr405 = null;


        Object OR404_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:496:5: ( and_expr ( OR and_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:496:7: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr3474);
            and_expr403=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr403.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:496:16: ( OR and_expr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==OR) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:496:18: OR and_expr
            	    {
            	    OR404=(Token)match(input,OR,FOLLOW_OR_in_or_expr3478); 
            	    OR404_tree = (Object)adaptor.create(OR404);
            	    adaptor.addChild(root_0, OR404_tree);

            	    pushFollow(FOLLOW_and_expr_in_or_expr3480);
            	    and_expr405=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr405.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:499:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQLTreeParser.and_expr_return and_expr() throws RecognitionException {
        PLSQLTreeParser.and_expr_return retval = new PLSQLTreeParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND407=null;
        PLSQLTreeParser.not_expr_return not_expr406 = null;

        PLSQLTreeParser.not_expr_return not_expr408 = null;


        Object AND407_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:500:5: ( not_expr ( AND not_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:500:7: not_expr ( AND not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr3500);
            not_expr406=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr406.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:500:16: ( AND not_expr )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==AND) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:500:18: AND not_expr
            	    {
            	    AND407=(Token)match(input,AND,FOLLOW_AND_in_and_expr3504); 
            	    AND407_tree = (Object)adaptor.create(AND407);
            	    adaptor.addChild(root_0, AND407_tree);

            	    pushFollow(FOLLOW_not_expr_in_and_expr3506);
            	    not_expr408=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr408.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:503:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQLTreeParser.not_expr_return not_expr() throws RecognitionException {
        PLSQLTreeParser.not_expr_return retval = new PLSQLTreeParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT409=null;
        PLSQLTreeParser.compare_expr_return compare_expr410 = null;


        Object NOT409_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:504:5: ( ( NOT )? compare_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:504:7: ( NOT )? compare_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:504:7: ( NOT )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==NOT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:504:7: NOT
                    {
                    NOT409=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3526); 
                    NOT409_tree = (Object)adaptor.create(NOT409);
                    adaptor.addChild(root_0, NOT409_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_compare_expr_in_not_expr3529);
            compare_expr410=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr410.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:507:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQLTreeParser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQLTreeParser.compare_expr_return retval = new PLSQLTreeParser.compare_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set412=null;
        PLSQLTreeParser.is_null_expr_return is_null_expr411 = null;

        PLSQLTreeParser.is_null_expr_return is_null_expr413 = null;


        Object set412_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:508:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:508:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_is_null_expr_in_compare_expr3546);
            is_null_expr411=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr411.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:508:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=EQ && LA121_0<=GEQ)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:508:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    set412=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set412));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3576);
                    is_null_expr413=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr413.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:511:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQLTreeParser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQLTreeParser.is_null_expr_return retval = new PLSQLTreeParser.is_null_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IS415=null;
        Token NOT416=null;
        Token NULL417=null;
        PLSQLTreeParser.like_expr_return like_expr414 = null;


        Object IS415_tree=null;
        Object NOT416_tree=null;
        Object NULL417_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:5: ( like_expr ( IS ( NOT )? NULL )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_like_expr_in_is_null_expr3596);
            like_expr414=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr414.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:17: ( IS ( NOT )? NULL )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IS) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:19: IS ( NOT )? NULL
                    {
                    IS415=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3600); 
                    IS415_tree = (Object)adaptor.create(IS415);
                    adaptor.addChild(root_0, IS415_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:22: ( NOT )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==NOT) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:512:22: NOT
                            {
                            NOT416=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3602); 
                            NOT416_tree = (Object)adaptor.create(NOT416);
                            adaptor.addChild(root_0, NOT416_tree);


                            }
                            break;

                    }

                    NULL417=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3605); 
                    NULL417_tree = (Object)adaptor.create(NULL417);
                    adaptor.addChild(root_0, NULL417_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:515:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQLTreeParser.like_expr_return like_expr() throws RecognitionException {
        PLSQLTreeParser.like_expr_return retval = new PLSQLTreeParser.like_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT419=null;
        Token LIKE420=null;
        PLSQLTreeParser.between_expr_return between_expr418 = null;

        PLSQLTreeParser.between_expr_return between_expr421 = null;


        Object NOT419_tree=null;
        Object LIKE420_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_between_expr_in_like_expr3624);
            between_expr418=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr418.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:20: ( ( NOT )? LIKE between_expr )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NOT||LA125_0==LIKE) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:22: ( NOT )? LIKE between_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:22: ( NOT )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==NOT) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:516:22: NOT
                            {
                            NOT419=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3628); 
                            NOT419_tree = (Object)adaptor.create(NOT419);
                            adaptor.addChild(root_0, NOT419_tree);


                            }
                            break;

                    }

                    LIKE420=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3631); 
                    LIKE420_tree = (Object)adaptor.create(LIKE420);
                    adaptor.addChild(root_0, LIKE420_tree);

                    pushFollow(FOLLOW_between_expr_in_like_expr3633);
                    between_expr421=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr421.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:519:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQLTreeParser.between_expr_return between_expr() throws RecognitionException {
        PLSQLTreeParser.between_expr_return retval = new PLSQLTreeParser.between_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT423=null;
        Token BETWEEN424=null;
        Token AND426=null;
        PLSQLTreeParser.in_expr_return in_expr422 = null;

        PLSQLTreeParser.in_expr_return in_expr425 = null;

        PLSQLTreeParser.in_expr_return in_expr427 = null;


        Object NOT423_tree=null;
        Object BETWEEN424_tree=null;
        Object AND426_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_between_expr3653);
            in_expr422=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr422.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:17: ( NOT )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NOT) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:520:17: NOT
                            {
                            NOT423=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3657); 
                            NOT423_tree = (Object)adaptor.create(NOT423);
                            adaptor.addChild(root_0, NOT423_tree);


                            }
                            break;

                    }

                    BETWEEN424=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3660); 
                    BETWEEN424_tree = (Object)adaptor.create(BETWEEN424);
                    adaptor.addChild(root_0, BETWEEN424_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3662);
                    in_expr425=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr425.getTree());
                    AND426=(Token)match(input,AND,FOLLOW_AND_in_between_expr3664); 
                    AND426_tree = (Object)adaptor.create(AND426);
                    adaptor.addChild(root_0, AND426_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3666);
                    in_expr427=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr427.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:523:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQLTreeParser.in_expr_return in_expr() throws RecognitionException {
        PLSQLTreeParser.in_expr_return retval = new PLSQLTreeParser.in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT429=null;
        Token IN430=null;
        Token LPAREN431=null;
        Token COMMA433=null;
        Token RPAREN435=null;
        PLSQLTreeParser.add_expr_return add_expr428 = null;

        PLSQLTreeParser.add_expr_return add_expr432 = null;

        PLSQLTreeParser.add_expr_return add_expr434 = null;


        Object NOT429_tree=null;
        Object IN430_tree=null;
        Object LPAREN431_tree=null;
        Object COMMA433_tree=null;
        Object RPAREN435_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_in_expr3686);
            add_expr428=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr428.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:18: ( NOT )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==NOT) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:18: NOT
                            {
                            NOT429=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr3690); 
                            NOT429_tree = (Object)adaptor.create(NOT429);
                            adaptor.addChild(root_0, NOT429_tree);


                            }
                            break;

                    }

                    IN430=(Token)match(input,IN,FOLLOW_IN_in_in_expr3693); 
                    IN430_tree = (Object)adaptor.create(IN430);
                    adaptor.addChild(root_0, IN430_tree);

                    LPAREN431=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr3695); 
                    LPAREN431_tree = (Object)adaptor.create(LPAREN431);
                    adaptor.addChild(root_0, LPAREN431_tree);

                    pushFollow(FOLLOW_add_expr_in_in_expr3697);
                    add_expr432=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr432.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:42: ( COMMA add_expr )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==COMMA) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:524:44: COMMA add_expr
                    	    {
                    	    COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr3701); 
                    	    COMMA433_tree = (Object)adaptor.create(COMMA433);
                    	    adaptor.addChild(root_0, COMMA433_tree);

                    	    pushFollow(FOLLOW_add_expr_in_in_expr3703);
                    	    add_expr434=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr434.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);

                    RPAREN435=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr3708); 
                    RPAREN435_tree = (Object)adaptor.create(RPAREN435);
                    adaptor.addChild(root_0, RPAREN435_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:527:1: numeric_expression : add_expr ;
    public final PLSQLTreeParser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQLTreeParser.numeric_expression_return retval = new PLSQLTreeParser.numeric_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.add_expr_return add_expr436 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:528:5: ( add_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:528:7: add_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_numeric_expression3728);
            add_expr436=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr436.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:531:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQLTreeParser.add_expr_return add_expr() throws RecognitionException {
        PLSQLTreeParser.add_expr_return retval = new PLSQLTreeParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set438=null;
        PLSQLTreeParser.mul_expr_return mul_expr437 = null;

        PLSQLTreeParser.mul_expr_return mul_expr439 = null;


        Object set438_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:532:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:532:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_expr_in_add_expr3745);
            mul_expr437=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr437.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:532:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( ((LA131_0>=MINUS && LA131_0<=DOUBLEVERTBAR)) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:532:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    set438=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set438));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_expr_in_add_expr3763);
            	    mul_expr439=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr439.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:535:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQLTreeParser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQLTreeParser.mul_expr_return retval = new PLSQLTreeParser.mul_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK441=null;
        Token DIVIDE442=null;
        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr440 = null;

        PLSQLTreeParser.kMOD_return kMOD443 = null;

        PLSQLTreeParser.unary_sign_expr_return unary_sign_expr444 = null;


        Object ASTERISK441_tree=null;
        Object DIVIDE442_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3783);
            unary_sign_expr440=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr440.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==DIVIDE||LA133_0==ID||LA133_0==ASTERISK) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:25: ( ASTERISK | DIVIDE | kMOD )
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
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:27: ASTERISK
            	            {
            	            ASTERISK441=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr3789); 
            	            ASTERISK441_tree = (Object)adaptor.create(ASTERISK441);
            	            adaptor.addChild(root_0, ASTERISK441_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:38: DIVIDE
            	            {
            	            DIVIDE442=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr3793); 
            	            DIVIDE442_tree = (Object)adaptor.create(DIVIDE442);
            	            adaptor.addChild(root_0, DIVIDE442_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:536:47: kMOD
            	            {
            	            pushFollow(FOLLOW_kMOD_in_mul_expr3797);
            	            kMOD443=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD443.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr3801);
            	    unary_sign_expr444=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr444.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:539:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQLTreeParser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQLTreeParser.unary_sign_expr_return retval = new PLSQLTreeParser.unary_sign_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set445=null;
        PLSQLTreeParser.exponent_expr_return exponent_expr446 = null;


        Object set445_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:540:5: ( ( MINUS | PLUS )? exponent_expr )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:540:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:540:7: ( MINUS | PLUS )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=MINUS && LA134_0<=PLUS)) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
                    {
                    set445=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set445));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr3832);
            exponent_expr446=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr446.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:543:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQLTreeParser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQLTreeParser.exponent_expr_return retval = new PLSQLTreeParser.exponent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPONENT448=null;
        PLSQLTreeParser.atom_return atom447 = null;

        PLSQLTreeParser.atom_return atom449 = null;


        Object EXPONENT448_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:544:5: ( atom ( EXPONENT atom )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:544:7: atom ( EXPONENT atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_exponent_expr3849);
            atom447=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom447.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:544:12: ( EXPONENT atom )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EXPONENT) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:544:14: EXPONENT atom
                    {
                    EXPONENT448=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr3853); 
                    EXPONENT448_tree = (Object)adaptor.create(EXPONENT448);
                    adaptor.addChild(root_0, EXPONENT448_tree);

                    pushFollow(FOLLOW_atom_in_exponent_expr3855);
                    atom449=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom449.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:547:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQLTreeParser.atom_return atom() throws RecognitionException {
        PLSQLTreeParser.atom_return retval = new PLSQLTreeParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PERCENT451=null;
        Token SQL453=null;
        Token PERCENT454=null;
        Token NULL459=null;
        Token LPAREN460=null;
        Token RPAREN462=null;
        PLSQLTreeParser.variable_or_function_call_return variable_or_function_call450 = null;

        PLSQLTreeParser.attribute_return attribute452 = null;

        PLSQLTreeParser.attribute_return attribute455 = null;

        PLSQLTreeParser.string_literal_return string_literal456 = null;

        PLSQLTreeParser.numeric_atom_return numeric_atom457 = null;

        PLSQLTreeParser.boolean_atom_return boolean_atom458 = null;

        PLSQLTreeParser.expression_return expression461 = null;


        Object PERCENT451_tree=null;
        Object SQL453_tree=null;
        Object PERCENT454_tree=null;
        Object NULL459_tree=null;
        Object LPAREN460_tree=null;
        Object RPAREN462_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:548:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt137=7;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:548:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_or_function_call_in_atom3875);
                    variable_or_function_call450=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call450.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:548:33: ( PERCENT attribute )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==PERCENT) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:548:35: PERCENT attribute
                            {
                            PERCENT451=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3879); 
                            PERCENT451_tree = (Object)adaptor.create(PERCENT451);
                            adaptor.addChild(root_0, PERCENT451_tree);

                            pushFollow(FOLLOW_attribute_in_atom3881);
                            attribute452=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute452.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:549:7: SQL PERCENT attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    SQL453=(Token)match(input,SQL,FOLLOW_SQL_in_atom3892); 
                    SQL453_tree = (Object)adaptor.create(SQL453);
                    adaptor.addChild(root_0, SQL453_tree);

                    PERCENT454=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3894); 
                    PERCENT454_tree = (Object)adaptor.create(PERCENT454);
                    adaptor.addChild(root_0, PERCENT454_tree);

                    pushFollow(FOLLOW_attribute_in_atom3896);
                    attribute455=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute455.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:550:7: string_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_literal_in_atom3904);
                    string_literal456=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal456.getTree());

                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:551:7: numeric_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_atom_in_atom3912);
                    numeric_atom457=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom457.getTree());

                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:552:7: boolean_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_atom_in_atom3920);
                    boolean_atom458=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom458.getTree());

                    }
                    break;
                case 6 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:553:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL459=(Token)match(input,NULL,FOLLOW_NULL_in_atom3928); 
                    NULL459_tree = (Object)adaptor.create(NULL459);
                    adaptor.addChild(root_0, NULL459_tree);


                    }
                    break;
                case 7 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:554:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN460=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3936); 
                    LPAREN460_tree = (Object)adaptor.create(LPAREN460);
                    adaptor.addChild(root_0, LPAREN460_tree);

                    pushFollow(FOLLOW_expression_in_atom3938);
                    expression461=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression461.getTree());
                    RPAREN462=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3940); 
                    RPAREN462_tree = (Object)adaptor.create(RPAREN462);
                    adaptor.addChild(root_0, RPAREN462_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:557:1: variable_or_function_call : variable_or_function_call_spec -> ^( PROC_CALL variable_or_function_call_spec ) ;
    public final PLSQLTreeParser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQLTreeParser.variable_or_function_call_return retval = new PLSQLTreeParser.variable_or_function_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.variable_or_function_call_spec_return variable_or_function_call_spec463 = null;


        RewriteRuleSubtreeStream stream_variable_or_function_call_spec=new RewriteRuleSubtreeStream(adaptor,"rule variable_or_function_call_spec");
        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:558:5: ( variable_or_function_call_spec -> ^( PROC_CALL variable_or_function_call_spec ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:558:7: variable_or_function_call_spec
            {
            pushFollow(FOLLOW_variable_or_function_call_spec_in_variable_or_function_call3961);
            variable_or_function_call_spec463=variable_or_function_call_spec();

            state._fsp--;

            stream_variable_or_function_call_spec.add(variable_or_function_call_spec463.getTree());


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
            // 558:38: -> ^( PROC_CALL variable_or_function_call_spec )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:558:41: ^( PROC_CALL variable_or_function_call_spec )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:561:1: variable_or_function_call_spec : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQLTreeParser.variable_or_function_call_spec_return variable_or_function_call_spec() throws RecognitionException {
        PLSQLTreeParser.variable_or_function_call_spec_return retval = new PLSQLTreeParser.variable_or_function_call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT465=null;
        Token DOT467=null;
        PLSQLTreeParser.call_return call464 = null;

        PLSQLTreeParser.call_return call466 = null;

        PLSQLTreeParser.delete_call_return delete_call468 = null;


        Object DOT465_tree=null;
        Object DOT467_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:2: ( call ( DOT call )* ( DOT delete_call )? )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:3: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_variable_or_function_call_spec3986);
            call464=call();

            state._fsp--;

            adaptor.addChild(root_0, call464.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:8: ( DOT call )*
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
            	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:10: DOT call
            	    {
            	    DOT465=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call_spec3990); 
            	    DOT465_tree = (Object)adaptor.create(DOT465);
            	    adaptor.addChild(root_0, DOT465_tree);

            	    pushFollow(FOLLOW_call_in_variable_or_function_call_spec3992);
            	    call466=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call466.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:22: ( DOT delete_call )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==DOT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:562:24: DOT delete_call
                    {
                    DOT467=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call_spec3999); 
                    DOT467_tree = (Object)adaptor.create(DOT467);
                    adaptor.addChild(root_0, DOT467_tree);

                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call_spec4001);
                    delete_call468=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call468.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:564:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQLTreeParser.attribute_return attribute() throws RecognitionException {
        PLSQLTreeParser.attribute_return retval = new PLSQLTreeParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK_ROWCOUNT469=null;
        Token LPAREN470=null;
        Token RPAREN472=null;
        Token ISOPEN474=null;
        Token NOTFOUND475=null;
        PLSQLTreeParser.expression_return expression471 = null;

        PLSQLTreeParser.kFOUND_return kFOUND473 = null;

        PLSQLTreeParser.kROWCOUNT_return kROWCOUNT476 = null;


        Object BULK_ROWCOUNT469_tree=null;
        Object LPAREN470_tree=null;
        Object RPAREN472_tree=null;
        Object ISOPEN474_tree=null;
        Object NOTFOUND475_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:565:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:565:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    BULK_ROWCOUNT469=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute4017); 
                    BULK_ROWCOUNT469_tree = (Object)adaptor.create(BULK_ROWCOUNT469);
                    adaptor.addChild(root_0, BULK_ROWCOUNT469_tree);

                    LPAREN470=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute4019); 
                    LPAREN470_tree = (Object)adaptor.create(LPAREN470);
                    adaptor.addChild(root_0, LPAREN470_tree);

                    pushFollow(FOLLOW_expression_in_attribute4021);
                    expression471=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression471.getTree());
                    RPAREN472=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute4023); 
                    RPAREN472_tree = (Object)adaptor.create(RPAREN472);
                    adaptor.addChild(root_0, RPAREN472_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:566:7: kFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kFOUND_in_attribute4031);
                    kFOUND473=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND473.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:567:7: ISOPEN
                    {
                    root_0 = (Object)adaptor.nil();

                    ISOPEN474=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute4039); 
                    ISOPEN474_tree = (Object)adaptor.create(ISOPEN474);
                    adaptor.addChild(root_0, ISOPEN474_tree);


                    }
                    break;
                case 4 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:568:7: NOTFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTFOUND475=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute4047); 
                    NOTFOUND475_tree = (Object)adaptor.create(NOTFOUND475);
                    adaptor.addChild(root_0, NOTFOUND475_tree);


                    }
                    break;
                case 5 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:569:7: kROWCOUNT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kROWCOUNT_in_attribute4055);
                    kROWCOUNT476=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT476.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:572:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQLTreeParser.call_args_return call_args() throws RecognitionException {
        PLSQLTreeParser.call_args_return retval = new PLSQLTreeParser.call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN477=null;
        Token COMMA479=null;
        Token RPAREN481=null;
        PLSQLTreeParser.parameter_return parameter478 = null;

        PLSQLTreeParser.parameter_return parameter480 = null;


        Object LPAREN477_tree=null;
        Object COMMA479_tree=null;
        Object RPAREN481_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN477=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args4072); 
            LPAREN477_tree = (Object)adaptor.create(LPAREN477);
            adaptor.addChild(root_0, LPAREN477_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:14: ( parameter ( COMMA parameter )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ID||LA142_0==LPAREN||(LA142_0>=NOT && LA142_0<=NULL)||LA142_0==COLON||(LA142_0>=MINUS && LA142_0<=PLUS)||LA142_0==SQL||(LA142_0>=INTEGER && LA142_0<=QUOTED_STRING)||(LA142_0>=INSERTING && LA142_0<=DELETING)) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:16: parameter ( COMMA parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_call_args4076);
                    parameter478=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter478.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:26: ( COMMA parameter )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==COMMA) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:573:28: COMMA parameter
                    	    {
                    	    COMMA479=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args4080); 
                    	    COMMA479_tree = (Object)adaptor.create(COMMA479);
                    	    adaptor.addChild(root_0, COMMA479_tree);

                    	    pushFollow(FOLLOW_parameter_in_call_args4082);
                    	    parameter480=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter480.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN481=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args4090); 
            RPAREN481_tree = (Object)adaptor.create(RPAREN481);
            adaptor.addChild(root_0, RPAREN481_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:576:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQLTreeParser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQLTreeParser.boolean_atom_return retval = new PLSQLTreeParser.boolean_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.boolean_literal_return boolean_literal482 = null;

        PLSQLTreeParser.collection_exists_return collection_exists483 = null;

        PLSQLTreeParser.conditional_predicate_return conditional_predicate484 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:577:5: ( boolean_literal | collection_exists | conditional_predicate )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:577:7: boolean_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom4107);
                    boolean_literal482=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal482.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:578:7: collection_exists
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collection_exists_in_boolean_atom4115);
                    collection_exists483=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists483.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:579:7: conditional_predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom4123);
                    conditional_predicate484=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate484.getTree());

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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:582:1: numeric_atom : numeric_literal ;
    public final PLSQLTreeParser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQLTreeParser.numeric_atom_return retval = new PLSQLTreeParser.numeric_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.numeric_literal_return numeric_literal485 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:5: ( numeric_literal )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:583:7: numeric_literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_numeric_literal_in_numeric_atom4140);
            numeric_literal485=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal485.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:586:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQLTreeParser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQLTreeParser.numeric_literal_return retval = new PLSQLTreeParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set486=null;

        Object set486_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:587:5: ( INTEGER | REAL_NUMBER )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set486=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set486));
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:591:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQLTreeParser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQLTreeParser.boolean_literal_return retval = new PLSQLTreeParser.boolean_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set487=null;

        Object set487_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:592:5: ( TRUE | FALSE )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
            {
            root_0 = (Object)adaptor.nil();

            set487=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
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
    // $ANTLR end "boolean_literal"

    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string_literal"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:596:1: string_literal : QUOTED_STRING -> ^( STRING QUOTED_STRING ) ;
    public final PLSQLTreeParser.string_literal_return string_literal() throws RecognitionException {
        PLSQLTreeParser.string_literal_return retval = new PLSQLTreeParser.string_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTED_STRING488=null;

        Object QUOTED_STRING488_tree=null;
        RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:5: ( QUOTED_STRING -> ^( STRING QUOTED_STRING ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:7: QUOTED_STRING
            {
            QUOTED_STRING488=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal4207);  
            stream_QUOTED_STRING.add(QUOTED_STRING488);



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
            // 597:21: -> ^( STRING QUOTED_STRING )
            {
                // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:597:24: ^( STRING QUOTED_STRING )
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:600:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQLTreeParser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQLTreeParser.collection_exists_return retval = new PLSQLTreeParser.collection_exists_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID489=null;
        Token DOT490=null;
        Token EXISTS491=null;
        Token LPAREN492=null;
        Token RPAREN494=null;
        PLSQLTreeParser.expression_return expression493 = null;


        Object ID489_tree=null;
        Object DOT490_tree=null;
        Object EXISTS491_tree=null;
        Object LPAREN492_tree=null;
        Object RPAREN494_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:601:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:601:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            ID489=(Token)match(input,ID,FOLLOW_ID_in_collection_exists4232); 
            ID489_tree = (Object)adaptor.create(ID489);
            adaptor.addChild(root_0, ID489_tree);

            DOT490=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists4234); 
            DOT490_tree = (Object)adaptor.create(DOT490);
            adaptor.addChild(root_0, DOT490_tree);

            EXISTS491=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists4236); 
            EXISTS491_tree = (Object)adaptor.create(EXISTS491);
            adaptor.addChild(root_0, EXISTS491_tree);

            LPAREN492=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists4238); 
            LPAREN492_tree = (Object)adaptor.create(LPAREN492);
            adaptor.addChild(root_0, LPAREN492_tree);

            pushFollow(FOLLOW_expression_in_collection_exists4240);
            expression493=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression493.getTree());
            RPAREN494=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists4242); 
            RPAREN494_tree = (Object)adaptor.create(RPAREN494);
            adaptor.addChild(root_0, RPAREN494_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:604:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQLTreeParser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQLTreeParser.conditional_predicate_return retval = new PLSQLTreeParser.conditional_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERTING495=null;
        Token UPDATING496=null;
        Token LPAREN497=null;
        Token QUOTED_STRING498=null;
        Token RPAREN499=null;
        Token DELETING500=null;

        Object INSERTING495_tree=null;
        Object UPDATING496_tree=null;
        Object LPAREN497_tree=null;
        Object QUOTED_STRING498_tree=null;
        Object RPAREN499_tree=null;
        Object DELETING500_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:605:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:605:7: INSERTING
                    {
                    root_0 = (Object)adaptor.nil();

                    INSERTING495=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate4259); 
                    INSERTING495_tree = (Object)adaptor.create(INSERTING495);
                    adaptor.addChild(root_0, INSERTING495_tree);


                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UPDATING496=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate4267); 
                    UPDATING496_tree = (Object)adaptor.create(UPDATING496);
                    adaptor.addChild(root_0, UPDATING496_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LPAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:606:18: LPAREN QUOTED_STRING RPAREN
                            {
                            LPAREN497=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate4271); 
                            LPAREN497_tree = (Object)adaptor.create(LPAREN497);
                            adaptor.addChild(root_0, LPAREN497_tree);

                            QUOTED_STRING498=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate4273); 
                            QUOTED_STRING498_tree = (Object)adaptor.create(QUOTED_STRING498);
                            adaptor.addChild(root_0, QUOTED_STRING498_tree);

                            RPAREN499=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate4275); 
                            RPAREN499_tree = (Object)adaptor.create(RPAREN499);
                            adaptor.addChild(root_0, RPAREN499_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:607:7: DELETING
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETING500=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate4286); 
                    DELETING500_tree = (Object)adaptor.create(DELETING500);
                    adaptor.addChild(root_0, DELETING500_tree);


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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:610:1: parameter : ( ID ARROW )? expression ;
    public final PLSQLTreeParser.parameter_return parameter() throws RecognitionException {
        PLSQLTreeParser.parameter_return retval = new PLSQLTreeParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID501=null;
        Token ARROW502=null;
        PLSQLTreeParser.expression_return expression503 = null;


        Object ID501_tree=null;
        Object ARROW502_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:5: ( ( ID ARROW )? expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:7: ( ID ARROW )? expression
            {
            root_0 = (Object)adaptor.nil();

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:7: ( ID ARROW )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:611:9: ID ARROW
                    {
                    ID501=(Token)match(input,ID,FOLLOW_ID_in_parameter4305); 
                    ID501_tree = (Object)adaptor.create(ID501);
                    adaptor.addChild(root_0, ID501_tree);

                    ARROW502=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter4307); 
                    ARROW502_tree = (Object)adaptor.create(ARROW502);
                    adaptor.addChild(root_0, ARROW502_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_parameter4312);
            expression503=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression503.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:614:1: index : expression ;
    public final PLSQLTreeParser.index_return index() throws RecognitionException {
        PLSQLTreeParser.index_return retval = new PLSQLTreeParser.index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQLTreeParser.expression_return expression504 = null;



        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:615:5: ( expression )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:615:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_index4329);
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
    // $ANTLR end "index"

    public static class create_package_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:618:1: create_package : CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI ;
    public final PLSQLTreeParser.create_package_return create_package() throws RecognitionException {
        PLSQLTreeParser.create_package_return retval = new PLSQLTreeParser.create_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token CREATE505=null;
        Token OR506=null;
        Token PACKAGE508=null;
        Token DOT509=null;
        Token set511=null;
        Token END513=null;
        Token ID514=null;
        Token SEMI515=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE507 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause510 = null;

        PLSQLTreeParser.declare_section_return declare_section512 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object CREATE505_tree=null;
        Object OR506_tree=null;
        Object PACKAGE508_tree=null;
        Object DOT509_tree=null;
        Object set511_tree=null;
        Object END513_tree=null;
        Object ID514_tree=null;
        Object SEMI515_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:618:16: ( CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:9: CREATE ( OR kREPLACE )? PACKAGE (schema_name= ID DOT )? package_name= ID ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE505=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package4350); 
            CREATE505_tree = (Object)adaptor.create(CREATE505);
            adaptor.addChild(root_0, CREATE505_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:16: ( OR kREPLACE )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==OR) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:18: OR kREPLACE
                    {
                    OR506=(Token)match(input,OR,FOLLOW_OR_in_create_package4354); 
                    OR506_tree = (Object)adaptor.create(OR506);
                    adaptor.addChild(root_0, OR506_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package4356);
                    kREPLACE507=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE507.getTree());

                    }
                    break;

            }

            PACKAGE508=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package4361); 
            PACKAGE508_tree = (Object)adaptor.create(PACKAGE508);
            adaptor.addChild(root_0, PACKAGE508_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:41: (schema_name= ID DOT )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:619:43: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4367); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT509=(Token)match(input,DOT,FOLLOW_DOT_in_create_package4369); 
                    DOT509_tree = (Object)adaptor.create(DOT509);
                    adaptor.addChild(root_0, DOT509_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package4376); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:620:9: ( invoker_rights_clause )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AUTHID) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:620:11: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4388);
                    invoker_rights_clause510=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause510.getTree());

                    }
                    break;

            }

            set511=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set511));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:21: ( declare_section )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=PROCEDURE && LA150_0<=FUNCTION)||LA150_0==CURSOR||LA150_0==SUBTYPE||LA150_0==PRAGMA) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package4413);
                    declare_section512=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section512.getTree());

                    }
                    break;

            }

            END513=(Token)match(input,END,FOLLOW_END_in_create_package4418); 
            END513_tree = (Object)adaptor.create(END513);
            adaptor.addChild(root_0, END513_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:46: ( ID )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:621:48: ID
                    {
                    ID514=(Token)match(input,ID,FOLLOW_ID_in_create_package4422); 
                    ID514_tree = (Object)adaptor.create(ID514);
                    adaptor.addChild(root_0, ID514_tree);


                    }
                    break;

            }

            SEMI515=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4427); 
            SEMI515_tree = (Object)adaptor.create(SEMI515);
            adaptor.addChild(root_0, SEMI515_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:624:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQLTreeParser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQLTreeParser.create_package_body_return retval = new PLSQLTreeParser.create_package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token package_name2=null;
        Token CREATE516=null;
        Token OR517=null;
        Token PACKAGE519=null;
        Token BODY520=null;
        Token DOT521=null;
        Token set522=null;
        Token END524=null;
        Token SEMI525=null;
        PLSQLTreeParser.body_return initialize_section = null;

        PLSQLTreeParser.kREPLACE_return kREPLACE518 = null;

        PLSQLTreeParser.declare_section_return declare_section523 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object package_name2_tree=null;
        Object CREATE516_tree=null;
        Object OR517_tree=null;
        Object PACKAGE519_tree=null;
        Object BODY520_tree=null;
        Object DOT521_tree=null;
        Object set522_tree=null;
        Object END524_tree=null;
        Object SEMI525_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:624:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE516=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4448); 
            CREATE516_tree = (Object)adaptor.create(CREATE516);
            adaptor.addChild(root_0, CREATE516_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:16: ( OR kREPLACE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==OR) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:18: OR kREPLACE
                    {
                    OR517=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4452); 
                    OR517_tree = (Object)adaptor.create(OR517);
                    adaptor.addChild(root_0, OR517_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4454);
                    kREPLACE518=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE518.getTree());

                    }
                    break;

            }

            PACKAGE519=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4459); 
            PACKAGE519_tree = (Object)adaptor.create(PACKAGE519);
            adaptor.addChild(root_0, PACKAGE519_tree);

            BODY520=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4461); 
            BODY520_tree = (Object)adaptor.create(BODY520);
            adaptor.addChild(root_0, BODY520_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:46: (schema_name= ID DOT )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:625:48: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4467); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT521=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4469); 
                    DOT521_tree = (Object)adaptor.create(DOT521);
                    adaptor.addChild(root_0, DOT521_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4476); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            set522=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set522));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:21: ( declare_section )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=PROCEDURE && LA154_0<=FUNCTION)||LA154_0==CURSOR||LA154_0==SUBTYPE||LA154_0==PRAGMA) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:626:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package_body4498);
                    declare_section523=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section523.getTree());

                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:9: (initialize_section= body | END (package_name2= ID )? )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:11: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_create_package_body4515);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:37: END (package_name2= ID )?
                    {
                    END524=(Token)match(input,END,FOLLOW_END_in_create_package_body4519); 
                    END524_tree = (Object)adaptor.create(END524);
                    adaptor.addChild(root_0, END524_tree);

                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:41: (package_name2= ID )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==ID) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:627:43: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4525); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI525=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4540); 
            SEMI525_tree = (Object)adaptor.create(SEMI525);
            adaptor.addChild(root_0, SEMI525_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:1: create_procedure : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQLTreeParser.create_procedure_return retval = new PLSQLTreeParser.create_procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token procedure_name=null;
        Token CREATE526=null;
        Token OR527=null;
        Token PROCEDURE529=null;
        Token DOT530=null;
        Token LPAREN531=null;
        Token COMMA533=null;
        Token RPAREN535=null;
        Token set537=null;
        Token EXTERNAL541=null;
        Token SEMI542=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE528 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration532 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration534 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause536 = null;

        PLSQLTreeParser.declare_section_return declare_section538 = null;

        PLSQLTreeParser.body_return body539 = null;

        PLSQLTreeParser.call_spec_return call_spec540 = null;


        Object schema_name_tree=null;
        Object procedure_name_tree=null;
        Object CREATE526_tree=null;
        Object OR527_tree=null;
        Object PROCEDURE529_tree=null;
        Object DOT530_tree=null;
        Object LPAREN531_tree=null;
        Object COMMA533_tree=null;
        Object RPAREN535_tree=null;
        Object set537_tree=null;
        Object EXTERNAL541_tree=null;
        Object SEMI542_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:631:18: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:9: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE526=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4561); 
            CREATE526_tree = (Object)adaptor.create(CREATE526);
            adaptor.addChild(root_0, CREATE526_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:16: ( OR kREPLACE )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==OR) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:18: OR kREPLACE
                    {
                    OR527=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4565); 
                    OR527_tree = (Object)adaptor.create(OR527);
                    adaptor.addChild(root_0, OR527_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4567);
                    kREPLACE528=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE528.getTree());

                    }
                    break;

            }

            PROCEDURE529=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4572); 
            PROCEDURE529_tree = (Object)adaptor.create(PROCEDURE529);
            adaptor.addChild(root_0, PROCEDURE529_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:43: (schema_name= ID DOT )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:632:45: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4578); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT530=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4580); 
                    DOT530_tree = (Object)adaptor.create(DOT530);
                    adaptor.addChild(root_0, DOT530_tree);


                    }
                    break;

            }

            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4587); 
            procedure_name_tree = (Object)adaptor.create(procedure_name);
            adaptor.addChild(root_0, procedure_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==LPAREN) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN531=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_procedure4599); 
                    LPAREN531_tree = (Object)adaptor.create(LPAREN531);
                    adaptor.addChild(root_0, LPAREN531_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4601);
                    parameter_declaration532=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration532.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:40: ( COMMA parameter_declaration )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==COMMA) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:633:42: COMMA parameter_declaration
                    	    {
                    	    COMMA533=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_procedure4605); 
                    	    COMMA533_tree = (Object)adaptor.create(COMMA533);
                    	    adaptor.addChild(root_0, COMMA533_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_procedure4607);
                    	    parameter_declaration534=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration534.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);

                    RPAREN535=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_procedure4612); 
                    RPAREN535_tree = (Object)adaptor.create(RPAREN535);
                    adaptor.addChild(root_0, RPAREN535_tree);


                    }
                    break;

            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:634:9: ( invoker_rights_clause )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==AUTHID) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:634:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4625);
                    invoker_rights_clause536=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause536.getTree());

                    }
                    break;

            }

            set537=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set537));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:9: ( ( declare_section )? body | call_spec | EXTERNAL )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:11: ( declare_section )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( ((LA162_0>=PROCEDURE && LA162_0<=FUNCTION)||LA162_0==CURSOR||LA162_0==SUBTYPE||LA162_0==PRAGMA) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:636:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_procedure4656);
                            declare_section538=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section538.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_procedure4659);
                    body539=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body539.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:637:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_procedure4671);
                    call_spec540=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec540.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:638:11: EXTERNAL
                    {
                    EXTERNAL541=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure4683); 
                    EXTERNAL541_tree = (Object)adaptor.create(EXTERNAL541);
                    adaptor.addChild(root_0, EXTERNAL541_tree);


                    }
                    break;

            }

            SEMI542=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure4695); 
            SEMI542_tree = (Object)adaptor.create(SEMI542);
            adaptor.addChild(root_0, SEMI542_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:642:1: create_function : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQLTreeParser.create_function_return create_function() throws RecognitionException {
        PLSQLTreeParser.create_function_return retval = new PLSQLTreeParser.create_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token function_name=null;
        Token CREATE543=null;
        Token OR544=null;
        Token FUNCTION546=null;
        Token DOT547=null;
        Token LPAREN548=null;
        Token COMMA550=null;
        Token RPAREN552=null;
        Token RETURN553=null;
        Token set556=null;
        Token EXTERNAL560=null;
        Token SEMI561=null;
        PLSQLTreeParser.kREPLACE_return kREPLACE545 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration549 = null;

        PLSQLTreeParser.parameter_declaration_return parameter_declaration551 = null;

        PLSQLTreeParser.datatype_return datatype554 = null;

        PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause555 = null;

        PLSQLTreeParser.declare_section_return declare_section557 = null;

        PLSQLTreeParser.body_return body558 = null;

        PLSQLTreeParser.call_spec_return call_spec559 = null;


        Object schema_name_tree=null;
        Object function_name_tree=null;
        Object CREATE543_tree=null;
        Object OR544_tree=null;
        Object FUNCTION546_tree=null;
        Object DOT547_tree=null;
        Object LPAREN548_tree=null;
        Object COMMA550_tree=null;
        Object RPAREN552_tree=null;
        Object RETURN553_tree=null;
        Object set556_tree=null;
        Object EXTERNAL560_tree=null;
        Object SEMI561_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:642:17: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:9: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE543=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function4716); 
            CREATE543_tree = (Object)adaptor.create(CREATE543);
            adaptor.addChild(root_0, CREATE543_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:16: ( OR kREPLACE )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==OR) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:18: OR kREPLACE
                    {
                    OR544=(Token)match(input,OR,FOLLOW_OR_in_create_function4720); 
                    OR544_tree = (Object)adaptor.create(OR544);
                    adaptor.addChild(root_0, OR544_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_function4722);
                    kREPLACE545=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE545.getTree());

                    }
                    break;

            }

            FUNCTION546=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function4727); 
            FUNCTION546_tree = (Object)adaptor.create(FUNCTION546);
            adaptor.addChild(root_0, FUNCTION546_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:42: (schema_name= ID DOT )?
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:643:44: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4733); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT547=(Token)match(input,DOT,FOLLOW_DOT_in_create_function4735); 
                    DOT547_tree = (Object)adaptor.create(DOT547);
                    adaptor.addChild(root_0, DOT547_tree);


                    }
                    break;

            }

            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function4742); 
            function_name_tree = (Object)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:644:9: ( LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==LPAREN) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:644:11: LPAREN parameter_declaration ( COMMA parameter_declaration )* RPAREN
                    {
                    LPAREN548=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_function4754); 
                    LPAREN548_tree = (Object)adaptor.create(LPAREN548);
                    adaptor.addChild(root_0, LPAREN548_tree);

                    pushFollow(FOLLOW_parameter_declaration_in_create_function4756);
                    parameter_declaration549=parameter_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declaration549.getTree());
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:644:40: ( COMMA parameter_declaration )*
                    loop166:
                    do {
                        int alt166=2;
                        int LA166_0 = input.LA(1);

                        if ( (LA166_0==COMMA) ) {
                            alt166=1;
                        }


                        switch (alt166) {
                    	case 1 :
                    	    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:644:42: COMMA parameter_declaration
                    	    {
                    	    COMMA550=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_function4760); 
                    	    COMMA550_tree = (Object)adaptor.create(COMMA550);
                    	    adaptor.addChild(root_0, COMMA550_tree);

                    	    pushFollow(FOLLOW_parameter_declaration_in_create_function4762);
                    	    parameter_declaration551=parameter_declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter_declaration551.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop166;
                        }
                    } while (true);

                    RPAREN552=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_function4767); 
                    RPAREN552_tree = (Object)adaptor.create(RPAREN552);
                    adaptor.addChild(root_0, RPAREN552_tree);


                    }
                    break;

            }

            RETURN553=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function4780); 
            RETURN553_tree = (Object)adaptor.create(RETURN553);
            adaptor.addChild(root_0, RETURN553_tree);

            pushFollow(FOLLOW_datatype_in_create_function4782);
            datatype554=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype554.getTree());
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:646:9: ( invoker_rights_clause )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==AUTHID) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:646:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function4792);
                    invoker_rights_clause555=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause555.getTree());

                    }
                    break;

            }

            set556=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set556));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:9: ( ( declare_section )? body | call_spec | EXTERNAL )
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
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:11: ( declare_section )? body
                    {
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:11: ( declare_section )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( ((LA169_0>=PROCEDURE && LA169_0<=FUNCTION)||LA169_0==CURSOR||LA169_0==SUBTYPE||LA169_0==PRAGMA) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:648:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_function4823);
                            declare_section557=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section557.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_function4826);
                    body558=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body558.getTree());

                    }
                    break;
                case 2 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:649:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_function4838);
                    call_spec559=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec559.getTree());

                    }
                    break;
                case 3 :
                    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:650:11: EXTERNAL
                    {
                    EXTERNAL560=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function4850); 
                    EXTERNAL560_tree = (Object)adaptor.create(EXTERNAL560);
                    adaptor.addChild(root_0, EXTERNAL560_tree);


                    }
                    break;

            }

            SEMI561=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function4862); 
            SEMI561_tree = (Object)adaptor.create(SEMI561);
            adaptor.addChild(root_0, SEMI561_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:654:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQLTreeParser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQLTreeParser.invoker_rights_clause_return retval = new PLSQLTreeParser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AUTHID562=null;
        Token set563=null;

        Object AUTHID562_tree=null;
        Object set563_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:654:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:655:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (Object)adaptor.nil();

            AUTHID562=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause4883); 
            AUTHID562_tree = (Object)adaptor.create(AUTHID562);
            adaptor.addChild(root_0, AUTHID562_tree);

            set563=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set563));
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:658:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQLTreeParser.call_spec_return call_spec() throws RecognitionException {
        PLSQLTreeParser.call_spec_return retval = new PLSQLTreeParser.call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGUAGE564=null;
        PLSQLTreeParser.swallow_to_semi_return swallow_to_semi565 = null;


        Object LANGUAGE564_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:659:5: ( LANGUAGE swallow_to_semi )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:659:7: LANGUAGE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LANGUAGE564=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec4910); 
            LANGUAGE564_tree = (Object)adaptor.create(LANGUAGE564);
            adaptor.addChild(root_0, LANGUAGE564_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_call_spec4912);
            swallow_to_semi565=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi565.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:1: kERRORS : {...}? ID ;
    public final PLSQLTreeParser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQLTreeParser.kERRORS_return retval = new PLSQLTreeParser.kERRORS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID566=null;

        Object ID566_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:662:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()))) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            ID566=(Token)match(input,ID,FOLLOW_ID_in_kERRORS4927); 
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
    // $ANTLR end "kERRORS"

    public static class kEXCEPTIONS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kEXCEPTIONS"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:663:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQLTreeParser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQLTreeParser.kEXCEPTIONS_return retval = new PLSQLTreeParser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID567=null;

        Object ID567_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:663:13: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:663:15: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("exceptions"))) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            ID567=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS4936); 
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
    // $ANTLR end "kEXCEPTIONS"

    public static class kFOUND_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kFOUND"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:664:1: kFOUND : {...}? ID ;
    public final PLSQLTreeParser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQLTreeParser.kFOUND_return retval = new PLSQLTreeParser.kFOUND_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID568=null;

        Object ID568_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:664:8: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:664:10: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            ID568=(Token)match(input,ID,FOLLOW_ID_in_kFOUND4945); 
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
    // $ANTLR end "kFOUND"

    public static class kINDICES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kINDICES"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:1: kINDICES : {...}? ID ;
    public final PLSQLTreeParser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQLTreeParser.kINDICES_return retval = new PLSQLTreeParser.kINDICES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID569=null;

        Object ID569_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:665:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            ID569=(Token)match(input,ID,FOLLOW_ID_in_kINDICES4954); 
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
    // $ANTLR end "kINDICES"

    public static class kMOD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kMOD"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:666:1: kMOD : {...}? ID ;
    public final PLSQLTreeParser.kMOD_return kMOD() throws RecognitionException {
        PLSQLTreeParser.kMOD_return retval = new PLSQLTreeParser.kMOD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID570=null;

        Object ID570_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:666:6: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:666:8: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("mod"))) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            ID570=(Token)match(input,ID,FOLLOW_ID_in_kMOD4963); 
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
    // $ANTLR end "kMOD"

    public static class kNAME_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kNAME"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:667:1: kNAME : {...}? ID ;
    public final PLSQLTreeParser.kNAME_return kNAME() throws RecognitionException {
        PLSQLTreeParser.kNAME_return retval = new PLSQLTreeParser.kNAME_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID571=null;

        Object ID571_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:667:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:667:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("name"))) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            ID571=(Token)match(input,ID,FOLLOW_ID_in_kNAME4972); 
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
    // $ANTLR end "kNAME"

    public static class kOF_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kOF"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:668:1: kOF : {...}? ID ;
    public final PLSQLTreeParser.kOF_return kOF() throws RecognitionException {
        PLSQLTreeParser.kOF_return retval = new PLSQLTreeParser.kOF_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID572=null;

        Object ID572_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:668:5: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:668:7: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("of"))) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            ID572=(Token)match(input,ID,FOLLOW_ID_in_kOF4981); 
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
    // $ANTLR end "kOF"

    public static class kREPLACE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kREPLACE"
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:669:1: kREPLACE : {...}? ID ;
    public final PLSQLTreeParser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQLTreeParser.kREPLACE_return retval = new PLSQLTreeParser.kREPLACE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID573=null;

        Object ID573_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:669:10: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:669:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("replace"))) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            ID573=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE4990); 
            ID573_tree = (Object)adaptor.create(ID573);
            adaptor.addChild(root_0, ID573_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:670:1: kROWCOUNT : {...}? ID ;
    public final PLSQLTreeParser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQLTreeParser.kROWCOUNT_return retval = new PLSQLTreeParser.kROWCOUNT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID574=null;

        Object ID574_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:670:11: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:670:13: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            ID574=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT4999); 
            ID574_tree = (Object)adaptor.create(ID574);
            adaptor.addChild(root_0, ID574_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:671:1: kSAVE : {...}? ID ;
    public final PLSQLTreeParser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQLTreeParser.kSAVE_return retval = new PLSQLTreeParser.kSAVE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID575=null;

        Object ID575_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:671:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:671:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("save"))) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            ID575=(Token)match(input,ID,FOLLOW_ID_in_kSAVE5008); 
            ID575_tree = (Object)adaptor.create(ID575);
            adaptor.addChild(root_0, ID575_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:1: kSHOW : {...}? ID ;
    public final PLSQLTreeParser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQLTreeParser.kSHOW_return retval = new PLSQLTreeParser.kSHOW_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID576=null;

        Object ID576_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:672:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("show"))) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            ID576=(Token)match(input,ID,FOLLOW_ID_in_kSHOW5017); 
            ID576_tree = (Object)adaptor.create(ID576);
            adaptor.addChild(root_0, ID576_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:1: kTYPE : {...}? ID ;
    public final PLSQLTreeParser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQLTreeParser.kTYPE_return retval = new PLSQLTreeParser.kTYPE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID577=null;

        Object ID577_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:7: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:673:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("type"))) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            ID577=(Token)match(input,ID,FOLLOW_ID_in_kTYPE5026); 
            ID577_tree = (Object)adaptor.create(ID577);
            adaptor.addChild(root_0, ID577_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:674:1: kVALUES : {...}? ID ;
    public final PLSQLTreeParser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQLTreeParser.kVALUES_return retval = new PLSQLTreeParser.kVALUES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID578=null;

        Object ID578_tree=null;

        try {
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:674:9: ({...}? ID )
            // /home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:674:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("values"))) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            ID578=(Token)match(input,ID,FOLLOW_ID_in_kVALUES5035); 
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
        "\1\21\1\22\6\uffff\1\20\1\uffff";
    static final String DFA14_maxS =
        "\1\124\1\53\6\uffff\1\55\1\uffff";
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
            return "139:1: declare_section_items : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI );";
        }
    }
    static final String DFA94_eotS =
        "\17\uffff";
    static final String DFA94_eofS =
        "\17\uffff";
    static final String DFA94_minS =
        "\1\22\2\uffff\1\0\13\uffff";
    static final String DFA94_maxS =
        "\1\173\2\uffff\1\0\13\uffff";
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
            return "379:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
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
        "\1\22\1\uffff\1\17\6\uffff\1\22";
    static final String DFA137_maxS =
        "\1\173\1\uffff\1\156\6\uffff\1\170";
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
            return "547:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file148 = new BitSet(new long[]{0x0000000000008000L,0x2000000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file154 = new BitSet(new long[]{0x0000000000008000L,0x2000000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file159 = new BitSet(new long[]{0x0000000000008000L,0x2000000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors186 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors188 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_SEMI_in_show_errors190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_procedure_nam_in_procedure_heading255 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedure_nam275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_function_heading304 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading306 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RETURN_in_function_heading309 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_function_heading311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations339 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations343 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations346 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_spec_in_parameter_declaration405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration_spec435 = new BitSet(new long[]{0x0000080003040000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration_spec439 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration_spec447 = new BitSet(new long[]{0x0000080004040000L});
    public static final BitSet FOLLOW_IN_in_parameter_declaration_spec451 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_OUT_in_parameter_declaration_spec453 = new BitSet(new long[]{0x0000080004040000L});
    public static final BitSet FOLLOW_NOCOPY_in_parameter_declaration_spec457 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration_spec465 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_parameter_declaration_spec477 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration_spec487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_section_items_in_declare_section510 = new BitSet(new long[]{0x00000008200E0002L,0x0000000000100000L});
    public static final BitSet FOLLOW_type_definition_in_declare_section_items549 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section_items560 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section_items571 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section_items582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section_items593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section_items604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_declare_section_items615 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_declare_section_items617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition637 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_cursor_definition639 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition641 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition644 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_declaration_items_in_item_declaration685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration_items708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration_items716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration_items724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration742 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration744 = new BitSet(new long[]{0x0000000098000002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration752 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration754 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_variable_declaration759 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration798 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration800 = new BitSet(new long[]{0x0000000098000000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration804 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration806 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_constant_declaration811 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration846 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition869 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_type_definition871 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IS_in_type_definition873 = new BitSet(new long[]{0x000009B000000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_subtype_definition910 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition912 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition914 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition918 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition941 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition943 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition945 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition949 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition951 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration970 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration972 = new BitSet(new long[]{0x0000000098000002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration978 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration980 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration985 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition1030 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition1032 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition1037 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition1041 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition1043 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition1045 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition1047 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition1049 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition1053 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition1069 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition1071 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition1073 = new BitSet(new long[]{0x0000020080000002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition1077 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition1079 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition1086 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition1088 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition1115 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition1117 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition1121 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype1142 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_datatype1147 = new BitSet(new long[]{0x0000300000200002L});
    public static final BitSet FOLLOW_DOT_in_datatype1151 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_datatype1153 = new BitSet(new long[]{0x0000200000200002L});
    public static final BitSet FOLLOW_LPAREN_in_datatype1160 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1162 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_datatype1166 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1168 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_datatype1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype1177 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_kTYPE_in_datatype1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition1211 = new BitSet(new long[]{0x000F800040000002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1221 = new BitSet(new long[]{0x000F800040000002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1250 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1260 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1284 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1294 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1332 = new BitSet(new long[]{0x000F800040000000L});
    public static final BitSet FOLLOW_set_in_function_definition1342 = new BitSet(new long[]{0x000F800040000000L});
    public static final BitSet FOLLOW_set_in_function_definition1369 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1379 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_function_definition1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1400 = new BitSet(new long[]{0x0008000040000002L});
    public static final BitSet FOLLOW_set_in_procedure_declaration_or_definition1412 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1422 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1453 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_procedure_is_as_in_procedure_definition1456 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1458 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_procedure_definition1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_procedure_is_as1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1517 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_body_spec_in_body1519 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_END_in_body1521 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_body1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body_spec1551 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_body_spec1553 = new BitSet(new long[]{0xBC10000D201F0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_st_pragma_in_body_spec1555 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_EXCEPTION_in_body_spec1560 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body_spec1562 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_statement_in_st_pragma1584 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1586 = new BitSet(new long[]{0xBC100009201F0002L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_pragma_in_st_pragma1590 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_st_pragma1592 = new BitSet(new long[]{0xBC100009201F0002L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1607 = new BitSet(new long[]{0x0500000000040000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1611 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1615 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1617 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1624 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1630 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_exception_handler1634 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1636 = new BitSet(new long[]{0xBC100009201E0002L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_label_in_statement1654 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue1830 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue1834 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_call_in_lvalue1836 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement1873 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement1877 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement1883 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call1905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_call1908 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LPAREN_in_call1912 = new BitSet(new long[]{0x0400000180A40000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_parameter_in_call1916 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_call1920 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_parameter_in_call1922 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_call1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call1951 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call1955 = new BitSet(new long[]{0x0400000180A40000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call1957 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1984 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement1988 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement1990 = new BitSet(new long[]{0xBC300009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_END_in_basic_loop_statement1995 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement1997 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement2021 = new BitSet(new long[]{0x0440000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2023 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement2036 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2038 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement2040 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_case_statement2044 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2046 = new BitSet(new long[]{0xFC700009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_ELSE_in_case_statement2064 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_case_statement2066 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2068 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_END_in_case_statement2081 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement2083 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_label_name_in_case_statement2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement2107 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_close_statement2109 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement2113 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_close_statement2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement2139 = new BitSet(new long[]{0x0040000000040002L});
    public static final BitSet FOLLOW_ID_in_continue_statement2145 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement2152 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement2180 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement2182 = new BitSet(new long[]{0x0000000000100002L,0x00000000000006C0L});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement2196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2216 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000400L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement2263 = new BitSet(new long[]{0x0040000000040002L});
    public static final BitSet FOLLOW_ID_in_exit_statement2269 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement2276 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement2302 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement2304 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement2312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement2316 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2348 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2350 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2354 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2356 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2388 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2390 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2394 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2396 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_USING_in_using_clause2420 = new BitSet(new long[]{0x0400000183240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2422 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2425 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2429 = new BitSet(new long[]{0x0400000183240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2431 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2434 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2451 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2476 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2515 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2517 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2519 = new BitSet(new long[]{0xEFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2523 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2531 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2537 = new BitSet(new long[]{0xBC300009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_END_in_for_loop_statement2542 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2544 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_forall_statement2570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2572 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2574 = new BitSet(new long[]{0x0800000000000000L,0x00000002FE000000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2576 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2580 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2606 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2616 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2618 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2624 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2628 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2641 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2643 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2666 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2689 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2691 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2693 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_if_statement2697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2699 = new BitSet(new long[]{0xFC300009201E0000L,0x00000006FEFF181BL});
    public static final BitSet FOLLOW_ELSIF_in_if_statement2714 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_if_statement2716 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement2718 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_if_statement2722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2724 = new BitSet(new long[]{0xFC300009201E0000L,0x00000006FEFF181BL});
    public static final BitSet FOLLOW_ELSE_in_if_statement2742 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_if_statement2746 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_if_statement2748 = new BitSet(new long[]{0xBC300009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_END_in_if_statement2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_IF_in_if_statement2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement2808 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_open_statement2810 = new BitSet(new long[]{0x0000100000200002L,0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_open_statement2814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_open_statement2816 = new BitSet(new long[]{0x0000100000200002L,0x0000000000000800L});
    public static final BitSet FOLLOW_call_args_in_open_statement2821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_FOR_in_open_statement2826 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma2852 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement2875 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_raise_statement2879 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement2883 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_raise_statement2885 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement2912 = new BitSet(new long[]{0x0400000180240002L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_return_statement2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block2938 = new BitSet(new long[]{0x00000008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block2940 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_plsql_block2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_label_in_label2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RLABEL_in_label2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id2984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_qual_id2987 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id2991 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_COLON_in_qual_id2993 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_qual_id2996 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement3101 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF2L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement3125 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement3148 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement3171 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement3173 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement3196 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF2L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement3220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement3243 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement3268 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement3291 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi3314 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF2L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3341 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3343 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3345 = new BitSet(new long[]{0xBC100009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3349 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3351 = new BitSet(new long[]{0xBC300009201E0000L,0x00000006FEFB181BL});
    public static final BitSet FOLLOW_END_in_while_loop_statement3356 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3358 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3389 = new BitSet(new long[]{0xFFF7FFFFBC5EFFF2L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3429 = new BitSet(new long[]{0xFFF7FFFFBCFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3431 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3474 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3478 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3480 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_AND_in_and_expr3504 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_NOT_in_not_expr3526 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3546 = new BitSet(new long[]{0x0000000000000002L,0x000001F800000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3550 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3596 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3600 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3602 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3624 = new BitSet(new long[]{0x0000000080000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3628 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3631 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3653 = new BitSet(new long[]{0x0000000080000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_NOT_in_between_expr3657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3660 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_AND_in_between_expr3664 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3686 = new BitSet(new long[]{0x0000000081000002L});
    public static final BitSet FOLLOW_NOT_in_in_expr3690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_in_in_expr3693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr3695 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3697 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_in_expr3701 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr3703 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3745 = new BitSet(new long[]{0x0000000000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_set_in_add_expr3749 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr3763 = new BitSet(new long[]{0x0000000000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3783 = new BitSet(new long[]{0x0000000000048002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr3789 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr3793 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr3797 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr3801 = new BitSet(new long[]{0x0000000000048002L,0x0000200000000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr3821 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3849 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr3853 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom3875 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom3879 = new BitSet(new long[]{0x0000000000040000L,0x0007000000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom3892 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3894 = new BitSet(new long[]{0x0000000000040000L,0x0007000000000000L});
    public static final BitSet FOLLOW_attribute_in_atom3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3936 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_atom3938 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_spec_in_variable_or_function_call3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call_spec3986 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call_spec3990 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call_spec3992 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call_spec3999 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call_spec4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute4017 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_attribute4019 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_attribute4021 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args4072 = new BitSet(new long[]{0x0400000180A40000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4076 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_call_args4080 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4082 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_call_args4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists4232 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists4234 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists4236 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists4238 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists4240 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate4267 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate4271 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate4273 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter4305 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter4307 = new BitSet(new long[]{0x0400000180240000L,0x0EF88C0000000000L});
    public static final BitSet FOLLOW_expression_in_parameter4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package4350 = new BitSet(new long[]{0x0080000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package4354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package4356 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package4361 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_package4367 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package4369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_package4376 = new BitSet(new long[]{0x0008000040000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4388 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_set_in_create_package4401 = new BitSet(new long[]{0x00200008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_create_package4413 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_END_in_create_package4418 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ID_in_create_package4422 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_create_package4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4448 = new BitSet(new long[]{0x0080000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package_body4452 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4454 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4459 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4461 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4467 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4469 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4476 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_set_in_create_package_body4486 = new BitSet(new long[]{0x00300008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4498 = new BitSet(new long[]{0x00300008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_create_package_body4515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_create_package_body4519 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ID_in_create_package_body4525 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4561 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_OR_in_create_procedure4565 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4567 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4578 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4580 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_procedure4587 = new BitSet(new long[]{0x0008000040200000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_create_procedure4599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4601 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_create_procedure4605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_procedure4607 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_create_procedure4612 = new BitSet(new long[]{0x0008000040000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4625 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_set_in_create_procedure4636 = new BitSet(new long[]{0x00100008200E0000L,0x8000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4656 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_create_procedure4659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure4671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure4683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function4716 = new BitSet(new long[]{0x0080000000080000L});
    public static final BitSet FOLLOW_OR_in_create_function4720 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function4722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function4727 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_function4733 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOT_in_create_function4735 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_create_function4742 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_LPAREN_in_create_function4754 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4756 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_create_function4760 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_declaration_in_create_function4762 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RPAREN_in_create_function4767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RETURN_in_create_function4780 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_datatype_in_create_function4782 = new BitSet(new long[]{0x0008000040000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function4792 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_set_in_create_function4803 = new BitSet(new long[]{0x00100008200E0000L,0x8000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_declare_section_in_create_function4823 = new BitSet(new long[]{0x00100008200E0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_body_in_create_function4826 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_call_spec_in_create_function4838 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function4850 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_create_function4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause4883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec4910 = new BitSet(new long[]{0xFFFFFFFFFFFEFFF0L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES5035 = new BitSet(new long[]{0x0000000000000002L});

}