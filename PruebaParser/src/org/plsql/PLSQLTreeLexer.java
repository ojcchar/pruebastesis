// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g 2010-10-25 11:48:02

package org.plsql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PLSQLTreeLexer extends Lexer {
    public static final int FUNCTION=21;
    public static final int PACKAGE=128;
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
    public static final int LOOP=62;
    public static final int BEGIN=54;
    public static final int SAVEPOINT=95;
    public static final int RETURN=22;
    public static final int RAISE=87;
    public static final int BODY=10;
    public static final int GEQ=106;
    public static final int GOTO=82;
    public static final int EQ=101;
    public static final int SELECT=96;
    public static final int INTO=72;
    public static final int ISOPEN=115;
    public static final int ARRAY=40;
    public static final int DIVIDE=17;
    public static final int EXCEPTION=36;
    public static final int EXIT=69;
    public static final int D=136;
    public static final int RBRACK=161;
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
    public static final int PACK=16;
    public static final int CURSOR=31;
    public static final int OTHERS=58;
    public static final int LBRACK=162;
    public static final int PROC_CALL=6;
    public static final int CURRENT_USER=131;
    public static final int POINT=159;
    public static final int LIMIT=71;
    public static final int EXECUTE=67;
    public static final int INSERTING=123;
    public static final int GTH=105;
    public static final int PRAGMA=86;
    public static final int NOTFOUND=116;
    public static final int RESULT_CACHE=52;
    public static final int LLABEL=89;
    public static final int TABLE=42;
    public static final int UPDATE=99;
    public static final int FOR=77;
    public static final int VARDECL=11;
    public static final int AND=81;
    public static final int ID=20;
    public static final int LPAREN=23;
    public static final int LOCK=93;
    public static final int ASTERISK=111;
    public static final int IF=83;
    public static final int UPDATING=124;
    public static final int RLABEL=90;
    public static final int AS=53;
    public static final int PACKNAME=15;
    public static final int INDEX=43;
    public static final int ML_COMMENT=168;
    public static final int ROWTYPE=48;
    public static final int THEN=59;
    public static final int IN=26;
    public static final int CONTINUE=66;
    public static final int COMMA=24;
    public static final int IS=32;
    public static final int PROC=4;
    public static final int PLUS=109;
    public static final int QUOTED_STRING=121;
    public static final int EXISTS=122;
    public static final int DOT=46;
    public static final int LIKE=107;
    public static final int PARAMS=8;
    public static final int INTEGER=117;
    public static final int BY=44;
    public static final int VARRAY=41;
    public static final int PACKCALL=13;
    public static final int PARALLEL_ENABLE=51;
    public static final int PERCENT=47;
    public static final int DOUBLEQUOTED_STRING=158;
    public static final int DEFAULT=30;
    public static final int FORALL=78;
    public static final int SET=97;
    public static final int MINUS=108;
    public static final int SEMI=18;
    public static final int TRUE=119;
    public static final int PROCEDURE=19;
    public static final int NOT_EQ=102;
    public static final int NUM=164;
    public static final int REF=45;
    public static final int VERTBAR=163;
    public static final int OPEN=85;
    public static final int COLON=60;
    public static final int LTH=103;
    public static final int COMMIT=91;
    public static final int BULK_ROWCOUNT=114;
    public static final int CLOSE=65;
    public static final int WHEN=56;
    public static final int DECL=5;
    public static final int ASSIGN=29;
    public static final int IMMEDIATE=68;
    public static final int NUMBER_VALUE=165;
    public static final int DECLARE=88;
    public static final int ARROW=126;
    public static final int DELETING=125;
    public static final int BULK=73;
    public static final int BETWEEN=80;
    public static final int STRING=14;
    public static final int LEQ=104;

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


    // delegates
    // delegators

    public PLSQLTreeLexer() {;} 
    public PLSQLTreeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PLSQLTreeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:706:5: ( A N D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:706:7: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:707:7: ( A R R A Y )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:707:9: A R R A Y
            {
            mA(); 
            mR(); 
            mR(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:708:4: ( A S )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:708:6: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "AUTHID"
    public final void mAUTHID() throws RecognitionException {
        try {
            int _type = AUTHID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:709:7: ( A U T H I D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:709:9: A U T H I D
            {
            mA(); 
            mU(); 
            mT(); 
            mH(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTHID"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:710:9: ( B E T W E E N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:710:11: B E T W E E N
            {
            mB(); 
            mE(); 
            mT(); 
            mW(); 
            mE(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BODY"
    public final void mBODY() throws RecognitionException {
        try {
            int _type = BODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:711:6: ( B O D Y )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:711:8: B O D Y
            {
            mB(); 
            mO(); 
            mD(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BODY"

    // $ANTLR start "BULK"
    public final void mBULK() throws RecognitionException {
        try {
            int _type = BULK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:712:5: ( B U L K )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:712:7: B U L K
            {
            mB(); 
            mU(); 
            mL(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK"

    // $ANTLR start "BULK_ROWCOUNT"
    public final void mBULK_ROWCOUNT() throws RecognitionException {
        try {
            int _type = BULK_ROWCOUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:713:14: ( 'bulk_rowcount' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:713:17: 'bulk_rowcount'
            {
            match("bulk_rowcount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK_ROWCOUNT"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:714:4: ( B Y )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:714:6: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:715:5: ( C A S E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:715:7: C A S E
            {
            mC(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:716:7: ( C R E A T E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:716:9: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "COLLECT"
    public final void mCOLLECT() throws RecognitionException {
        try {
            int _type = COLLECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:717:8: ( C O L L E C T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:717:10: C O L L E C T
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECT"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:718:8: ( C O M M I T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:718:10: C O M M I T
            {
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CURRENT_USER"
    public final void mCURRENT_USER() throws RecognitionException {
        try {
            int _type = CURRENT_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:719:13: ( 'current_user' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:719:16: 'current_user'
            {
            match("current_user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_USER"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:720:9: ( D E F A U L T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:720:11: D E F A U L T
            {
            mD(); 
            mE(); 
            mF(); 
            mA(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFINER"
    public final void mDEFINER() throws RecognitionException {
        try {
            int _type = DEFINER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:721:8: ( D E F I N E R )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:721:10: D E F I N E R
            {
            mD(); 
            mE(); 
            mF(); 
            mI(); 
            mN(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINER"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:722:8: ( D E L E T E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:722:10: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:723:6: ( E L S E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:723:8: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:724:7: ( E L S I F )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:724:9: E L S I F
            {
            mE(); 
            mL(); 
            mS(); 
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:725:9: ( E X T E R N A L )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:725:11: E X T E R N A L
            {
            mE(); 
            mX(); 
            mT(); 
            mE(); 
            mR(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:726:7: ( F A L S E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:726:9: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FETCH"
    public final void mFETCH() throws RecognitionException {
        try {
            int _type = FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:727:7: ( F E T C H )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:727:9: F E T C H
            {
            mF(); 
            mE(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FETCH"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:728:5: ( F O R )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:728:7: F O R
            {
            mF(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FORALL"
    public final void mFORALL() throws RecognitionException {
        try {
            int _type = FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:729:8: ( F O R A L L )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:729:10: F O R A L L
            {
            mF(); 
            mO(); 
            mR(); 
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORALL"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:730:6: ( G O T O )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:730:8: G O T O
            {
            mG(); 
            mO(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:731:4: ( I F )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:731:6: I F
            {
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:732:4: ( I N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:732:6: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:733:7: ( I N D E X )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:733:9: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:734:8: ( I N S E R T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:734:10: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:735:6: ( I N T O )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:735:8: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:736:4: ( I S )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:736:6: I S
            {
            mI(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LANGUAGE"
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:737:9: ( L A N G U A G E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:737:11: L A N G U A G E
            {
            mL(); 
            mA(); 
            mN(); 
            mG(); 
            mU(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGUAGE"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:738:6: ( L I K E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:738:8: L I K E
            {
            mL(); 
            mI(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:739:7: ( L I M I T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:739:9: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "LOCK"
    public final void mLOCK() throws RecognitionException {
        try {
            int _type = LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:740:6: ( L O C K )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:740:8: L O C K
            {
            mL(); 
            mO(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCK"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:741:5: ( N O T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:741:7: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTFOUND"
    public final void mNOTFOUND() throws RecognitionException {
        try {
            int _type = NOTFOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:742:9: ( N O T F O U N D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:742:11: N O T F O U N D
            {
            mN(); 
            mO(); 
            mT(); 
            mF(); 
            mO(); 
            mU(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTFOUND"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:743:6: ( N U L L )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:743:8: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:744:6: ( O P E N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:744:8: O P E N
            {
            mO(); 
            mP(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:745:4: ( O R )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:745:6: O R
            {
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:746:8: ( P A C K A G E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:746:10: P A C K A G E
            {
            mP(); 
            mA(); 
            mC(); 
            mK(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:747:7: ( R A I S E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:747:9: R A I S E
            {
            mR(); 
            mA(); 
            mI(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:748:9: ( R O L L B A C K )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:748:11: R O L L B A C K
            {
            mR(); 
            mO(); 
            mL(); 
            mL(); 
            mB(); 
            mA(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "SAVEPOINT"
    public final void mSAVEPOINT() throws RecognitionException {
        try {
            int _type = SAVEPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:749:11: ( S A V E P O I N T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:749:13: S A V E P O I N T
            {
            mS(); 
            mA(); 
            mV(); 
            mE(); 
            mP(); 
            mO(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVEPOINT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:750:8: ( S E L E C T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:750:10: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:751:5: ( S E T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:751:7: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SQL"
    public final void mSQL() throws RecognitionException {
        try {
            int _type = SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:752:5: ( S Q L )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:752:7: S Q L
            {
            mS(); 
            mQ(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:753:7: ( T A B L E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:753:9: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "TRANSACTION"
    public final void mTRANSACTION() throws RecognitionException {
        try {
            int _type = TRANSACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:754:13: ( T R A N S A C T I O N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:754:15: T R A N S A C T I O N
            {
            mT(); 
            mR(); 
            mA(); 
            mN(); 
            mS(); 
            mA(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSACTION"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:755:6: ( T R U E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:755:8: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:756:6: ( T H E N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:756:8: T H E N
            {
            mT(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:757:8: ( U P D A T E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:757:10: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:758:7: ( W H I L E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:758:9: W H I L E
            {
            mW(); 
            mH(); 
            mI(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "INSERTING"
    public final void mINSERTING() throws RecognitionException {
        try {
            int _type = INSERTING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:760:2: ( I N S E R T I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:760:4: I N S E R T I N G
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERTING"

    // $ANTLR start "UPDATING"
    public final void mUPDATING() throws RecognitionException {
        try {
            int _type = UPDATING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:761:9: ( U P D A T I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:761:11: U P D A T I N G
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATING"

    // $ANTLR start "DELETING"
    public final void mDELETING() throws RecognitionException {
        try {
            int _type = DELETING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:762:9: ( D E L E T I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:762:11: D E L E T I N G
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETING"

    // $ANTLR start "ISOPEN"
    public final void mISOPEN() throws RecognitionException {
        try {
            int _type = ISOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:763:8: ( I S O P E N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:763:10: I S O P E N
            {
            mI(); 
            mS(); 
            mO(); 
            mP(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOPEN"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:764:8: ( E X I S T S )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:764:10: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:766:7: ( B E G I N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:766:9: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:767:7: ( C L O S E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:767:9: C L O S E
            {
            mC(); 
            mL(); 
            mO(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:768:10: ( C O N S T A N T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:768:12: C O N S T A N T
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mA(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:769:9: ( C O N T I N U E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:769:11: C O N T I N U E
            {
            mC(); 
            mO(); 
            mN(); 
            mT(); 
            mI(); 
            mN(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "CURSOR"
    public final void mCURSOR() throws RecognitionException {
        try {
            int _type = CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:770:8: ( C U R S O R )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:770:10: C U R S O R
            {
            mC(); 
            mU(); 
            mR(); 
            mS(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURSOR"

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:771:9: ( D E C L A R E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:771:11: D E C L A R E
            {
            mD(); 
            mE(); 
            mC(); 
            mL(); 
            mA(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "DETERMINISTIC"
    public final void mDETERMINISTIC() throws RecognitionException {
        try {
            int _type = DETERMINISTIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:772:15: ( D E T E R M I N I S T I C )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:772:17: D E T E R M I N I S T I C
            {
            mD(); 
            mE(); 
            mT(); 
            mE(); 
            mR(); 
            mM(); 
            mI(); 
            mN(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETERMINISTIC"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:773:5: ( E N D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:773:7: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EXCEPTION"
    public final void mEXCEPTION() throws RecognitionException {
        try {
            int _type = EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:774:11: ( E X C E P T I O N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:774:13: E X C E P T I O N
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION"

    // $ANTLR start "EXECUTE"
    public final void mEXECUTE() throws RecognitionException {
        try {
            int _type = EXECUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:775:9: ( E X E C U T E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:775:11: E X E C U T E
            {
            mE(); 
            mX(); 
            mE(); 
            mC(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXECUTE"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:776:6: ( E X I T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:776:8: E X I T
            {
            mE(); 
            mX(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:777:10: ( F U N C T I O N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:777:12: F U N C T I O N
            {
            mF(); 
            mU(); 
            mN(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "IMMEDIATE"
    public final void mIMMEDIATE() throws RecognitionException {
        try {
            int _type = IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:778:11: ( I M M E D I A T E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:778:13: I M M E D I A T E
            {
            mI(); 
            mM(); 
            mM(); 
            mE(); 
            mD(); 
            mI(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMEDIATE"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:779:6: ( L O O P )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:779:8: L O O P
            {
            mL(); 
            mO(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "NOCOPY"
    public final void mNOCOPY() throws RecognitionException {
        try {
            int _type = NOCOPY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:780:8: ( N O C O P Y )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:780:10: N O C O P Y
            {
            mN(); 
            mO(); 
            mC(); 
            mO(); 
            mP(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOCOPY"

    // $ANTLR start "OTHERS"
    public final void mOTHERS() throws RecognitionException {
        try {
            int _type = OTHERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:781:8: ( O T H E R S )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:781:10: O T H E R S
            {
            mO(); 
            mT(); 
            mH(); 
            mE(); 
            mR(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OTHERS"

    // $ANTLR start "OUT"
    public final void mOUT() throws RecognitionException {
        try {
            int _type = OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:782:5: ( O U T )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:782:7: O U T
            {
            mO(); 
            mU(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUT"

    // $ANTLR start "PARALLEL_ENABLE"
    public final void mPARALLEL_ENABLE() throws RecognitionException {
        try {
            int _type = PARALLEL_ENABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:783:17: ( 'parallel_enable' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:783:19: 'parallel_enable'
            {
            match("parallel_enable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARALLEL_ENABLE"

    // $ANTLR start "PIPELINED"
    public final void mPIPELINED() throws RecognitionException {
        try {
            int _type = PIPELINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:784:11: ( P I P E L I N E D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:784:13: P I P E L I N E D
            {
            mP(); 
            mI(); 
            mP(); 
            mE(); 
            mL(); 
            mI(); 
            mN(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPELINED"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:785:8: ( P R A G M A )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:785:10: P R A G M A
            {
            mP(); 
            mR(); 
            mA(); 
            mG(); 
            mM(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:786:11: ( P R O C E D U R E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:786:13: P R O C E D U R E
            {
            mP(); 
            mR(); 
            mO(); 
            mC(); 
            mE(); 
            mD(); 
            mU(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:787:8: ( R E C O R D )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:787:10: R E C O R D
            {
            mR(); 
            mE(); 
            mC(); 
            mO(); 
            mR(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "REF"
    public final void mREF() throws RecognitionException {
        try {
            int _type = REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:788:5: ( R E F )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:788:7: R E F
            {
            mR(); 
            mE(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REF"

    // $ANTLR start "RESULT_CACHE"
    public final void mRESULT_CACHE() throws RecognitionException {
        try {
            int _type = RESULT_CACHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:789:14: ( 'result_cache' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:789:16: 'result_cache'
            {
            match("result_cache"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESULT_CACHE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:790:8: ( R E T U R N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:790:10: R E T U R N
            {
            mR(); 
            mE(); 
            mT(); 
            mU(); 
            mR(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RETURNING"
    public final void mRETURNING() throws RecognitionException {
        try {
            int _type = RETURNING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:791:11: ( R E T U R N I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:791:13: R E T U R N I N G
            {
            mR(); 
            mE(); 
            mT(); 
            mU(); 
            mR(); 
            mN(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNING"

    // $ANTLR start "ROWTYPE"
    public final void mROWTYPE() throws RecognitionException {
        try {
            int _type = ROWTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:792:9: ( R O W T Y P E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:792:11: R O W T Y P E
            {
            mR(); 
            mO(); 
            mW(); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWTYPE"

    // $ANTLR start "SUBTYPE"
    public final void mSUBTYPE() throws RecognitionException {
        try {
            int _type = SUBTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:793:9: ( S U B T Y P E )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:793:11: S U B T Y P E
            {
            mS(); 
            mU(); 
            mB(); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBTYPE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:794:6: ( U S I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:794:8: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VARRAY"
    public final void mVARRAY() throws RecognitionException {
        try {
            int _type = VARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:795:8: ( V A R R A Y )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:795:10: V A R R A Y
            {
            mV(); 
            mA(); 
            mR(); 
            mR(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARRAY"

    // $ANTLR start "VARYING"
    public final void mVARYING() throws RecognitionException {
        try {
            int _type = VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:796:9: ( V A R Y I N G )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:796:11: V A R Y I N G
            {
            mV(); 
            mA(); 
            mR(); 
            mY(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARYING"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:797:6: ( W H E N )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:797:8: W H E N
            {
            mW(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:2: ( ( 'N ' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:4: ( 'N ' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:4: ( 'N ' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:6: 'N '
                    {
                    match("N "); 


                    }
                    break;

            }

            match('\''); 
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:19: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:21: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;
            	case 2 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:800:30: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* | DOUBLEQUOTED_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='\"') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    {
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:5: ( 'a' .. 'z' )
                            {
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:5: ( 'a' .. 'z' )
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:7: 'a' .. 'z'
                            {
                            matchRange('a','z'); 

                            }


                            }
                            break;
                        case 2 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:23: ( 'A' .. 'Z' )
                            {
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:23: ( 'A' .. 'Z' )
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:804:24: 'A' .. 'Z'
                            {
                            matchRange('A','Z'); 

                            }


                            }
                            break;

                    }

                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:805:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='#' && LA4_0<='$')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:806:4: DOUBLEQUOTED_STRING
                    {
                    mDOUBLEQUOTED_STRING(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:809:2: ( ';' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:809:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:812:2: ( ':' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:812:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOUBLEDOT"
    public final void mDOUBLEDOT() throws RecognitionException {
        try {
            int _type = DOUBLEDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:815:2: ( POINT POINT )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:815:4: POINT POINT
            {
            mPOINT(); 
            mPOINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEDOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:818:2: ( POINT )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:818:4: POINT
            {
            mPOINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:823:2: ( '.' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:823:4: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:826:2: ( ',' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:826:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:829:2: ( '**' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:829:4: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:832:2: ( '*' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:832:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "AT_SIGN"
    public final void mAT_SIGN() throws RecognitionException {
        try {
            int _type = AT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:835:2: ( '@' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:835:4: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_SIGN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:838:2: ( ')' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:838:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:841:2: ( '(' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:841:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:844:2: ( ']' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:844:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:847:2: ( '[' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:847:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:850:2: ( '+' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:850:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:853:2: ( '-' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:853:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:856:2: ( '/' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:856:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:859:2: ( '=' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:859:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:862:2: ( '%' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:862:4: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "LLABEL"
    public final void mLLABEL() throws RecognitionException {
        try {
            int _type = LLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:865:2: ( '<<' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:865:4: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LLABEL"

    // $ANTLR start "RLABEL"
    public final void mRLABEL() throws RecognitionException {
        try {
            int _type = RLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:868:2: ( '>>' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:868:4: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RLABEL"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:871:2: ( ':=' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:871:4: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:874:2: ( '=>' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:874:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "VERTBAR"
    public final void mVERTBAR() throws RecognitionException {
        try {
            int _type = VERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:877:2: ( '|' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:877:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTBAR"

    // $ANTLR start "DOUBLEVERTBAR"
    public final void mDOUBLEVERTBAR() throws RecognitionException {
        try {
            int _type = DOUBLEVERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:880:2: ( '||' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:880:4: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEVERTBAR"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:883:2: ( '<>' | '!=' | '~=' | '^=' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt6=1;
                }
                break;
            case '!':
                {
                alt6=2;
                }
                break;
            case '~':
                {
                alt6=3;
                }
                break;
            case '^':
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:883:4: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:883:11: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:883:18: '~='
                    {
                    match("~="); 


                    }
                    break;
                case 4 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:883:24: '^='
                    {
                    match("^="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LTH"
    public final void mLTH() throws RecognitionException {
        try {
            int _type = LTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:886:2: ( '<' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:886:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTH"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:889:2: ( '<=' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:889:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GTH"
    public final void mGTH() throws RecognitionException {
        try {
            int _type = GTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:892:2: ( '>' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:892:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTH"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:895:2: ( '>=' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:895:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:898:5: ( NUM )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:898:9: NUM
            {
            mNUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL_NUMBER"
    public final void mREAL_NUMBER() throws RecognitionException {
        try {
            int _type = REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:901:2: ( NUMBER_VALUE ( 'e' ( PLUS | MINUS )? NUM )? )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:901:4: NUMBER_VALUE ( 'e' ( PLUS | MINUS )? NUM )?
            {
            mNUMBER_VALUE(); 
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:901:17: ( 'e' ( PLUS | MINUS )? NUM )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:901:19: 'e' ( PLUS | MINUS )? NUM
                    {
                    match('e'); 
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:901:23: ( PLUS | MINUS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mNUM(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL_NUMBER"

    // $ANTLR start "NUMBER_VALUE"
    public final void mNUMBER_VALUE() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:905:2: ({...}? => NUM POINT ( NUM )? | POINT NUM | NUM )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:905:4: {...}? => NUM POINT ( NUM )?
                    {
                    if ( !((numberDotValid())) ) {
                        throw new FailedPredicateException(input, "NUMBER_VALUE", "numberDotValid()");
                    }
                    mNUM(); 
                    mPOINT(); 
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:905:36: ( NUM )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:905:36: NUM
                            {
                            mNUM(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:906:4: POINT NUM
                    {
                    mPOINT(); 
                    mNUM(); 

                    }
                    break;
                case 3 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:907:4: NUM
                    {
                    mNUM(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER_VALUE"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:911:2: ( '0' .. '9' ( '0' .. '9' )* )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:911:4: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:911:15: ( '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:911:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "DOUBLEQUOTED_STRING"
    public final void mDOUBLEQUOTED_STRING() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:915:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:915:4: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:915:8: (~ ( '\"' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:915:10: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTED_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:917:4: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:917:6: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:2: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:9: (~ ( '\\n' | '\\r' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:23: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:920:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:923:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:923:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:923:9: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:923:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:926:11: ( ( 'a' | 'A' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:926:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:927:11: ( ( 'b' | 'B' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:927:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:928:11: ( ( 'c' | 'C' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:928:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:929:11: ( ( 'd' | 'D' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:929:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:930:11: ( ( 'e' | 'E' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:930:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:931:11: ( ( 'f' | 'F' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:931:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:932:11: ( ( 'g' | 'G' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:932:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:933:11: ( ( 'h' | 'H' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:933:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:934:11: ( ( 'i' | 'I' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:934:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:935:11: ( ( 'j' | 'J' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:935:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:936:11: ( ( 'k' | 'K' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:936:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:937:11: ( ( 'l' | 'L' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:937:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:938:11: ( ( 'm' | 'M' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:938:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:939:11: ( ( 'n' | 'N' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:939:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:940:11: ( ( 'o' | 'O' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:940:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:941:11: ( ( 'p' | 'P' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:941:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:942:11: ( ( 'q' | 'Q' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:942:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:943:11: ( ( 'r' | 'R' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:943:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:944:11: ( ( 's' | 'S' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:944:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:945:11: ( ( 't' | 'T' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:945:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:946:11: ( ( 'u' | 'U' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:946:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:947:11: ( ( 'v' | 'V' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:947:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:948:11: ( ( 'w' | 'W' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:948:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:949:11: ( ( 'x' | 'X' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:949:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:950:11: ( ( 'y' | 'Y' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:950:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:951:11: ( ( 'z' | 'Z' ) )
            // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:951:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:8: ( AND | ARRAY | AS | AUTHID | BETWEEN | BODY | BULK | BULK_ROWCOUNT | BY | CASE | CREATE | COLLECT | COMMIT | CURRENT_USER | DEFAULT | DEFINER | DELETE | ELSE | ELSIF | EXTERNAL | FALSE | FETCH | FOR | FORALL | GOTO | IF | IN | INDEX | INSERT | INTO | IS | LANGUAGE | LIKE | LIMIT | LOCK | NOT | NOTFOUND | NULL | OPEN | OR | PACKAGE | RAISE | ROLLBACK | SAVEPOINT | SELECT | SET | SQL | TABLE | TRANSACTION | TRUE | THEN | UPDATE | WHILE | INSERTING | UPDATING | DELETING | ISOPEN | EXISTS | BEGIN | CLOSE | CONSTANT | CONTINUE | CURSOR | DECLARE | DETERMINISTIC | END | EXCEPTION | EXECUTE | EXIT | FUNCTION | IMMEDIATE | LOOP | NOCOPY | OTHERS | OUT | PARALLEL_ENABLE | PIPELINED | PRAGMA | PROCEDURE | RECORD | REF | RESULT_CACHE | RETURN | RETURNING | ROWTYPE | SUBTYPE | USING | VARRAY | VARYING | WHEN | QUOTED_STRING | ID | SEMI | COLON | DOUBLEDOT | DOT | COMMA | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | DIVIDE | EQ | PERCENT | LLABEL | RLABEL | ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | LTH | LEQ | GTH | GEQ | INTEGER | REAL_NUMBER | WS | SL_COMMENT | ML_COMMENT )
        int alt16=125;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:10: AND
                {
                mAND(); 

                }
                break;
            case 2 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:14: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 3 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:20: AS
                {
                mAS(); 

                }
                break;
            case 4 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:23: AUTHID
                {
                mAUTHID(); 

                }
                break;
            case 5 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:30: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 6 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:38: BODY
                {
                mBODY(); 

                }
                break;
            case 7 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:43: BULK
                {
                mBULK(); 

                }
                break;
            case 8 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:48: BULK_ROWCOUNT
                {
                mBULK_ROWCOUNT(); 

                }
                break;
            case 9 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:62: BY
                {
                mBY(); 

                }
                break;
            case 10 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:65: CASE
                {
                mCASE(); 

                }
                break;
            case 11 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:70: CREATE
                {
                mCREATE(); 

                }
                break;
            case 12 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:77: COLLECT
                {
                mCOLLECT(); 

                }
                break;
            case 13 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:85: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 14 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:92: CURRENT_USER
                {
                mCURRENT_USER(); 

                }
                break;
            case 15 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:105: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 16 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:113: DEFINER
                {
                mDEFINER(); 

                }
                break;
            case 17 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:121: DELETE
                {
                mDELETE(); 

                }
                break;
            case 18 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:128: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:133: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 20 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:139: EXTERNAL
                {
                mEXTERNAL(); 

                }
                break;
            case 21 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:148: FALSE
                {
                mFALSE(); 

                }
                break;
            case 22 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:154: FETCH
                {
                mFETCH(); 

                }
                break;
            case 23 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:160: FOR
                {
                mFOR(); 

                }
                break;
            case 24 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:164: FORALL
                {
                mFORALL(); 

                }
                break;
            case 25 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:171: GOTO
                {
                mGOTO(); 

                }
                break;
            case 26 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:176: IF
                {
                mIF(); 

                }
                break;
            case 27 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:179: IN
                {
                mIN(); 

                }
                break;
            case 28 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:182: INDEX
                {
                mINDEX(); 

                }
                break;
            case 29 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:188: INSERT
                {
                mINSERT(); 

                }
                break;
            case 30 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:195: INTO
                {
                mINTO(); 

                }
                break;
            case 31 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:200: IS
                {
                mIS(); 

                }
                break;
            case 32 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:203: LANGUAGE
                {
                mLANGUAGE(); 

                }
                break;
            case 33 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:212: LIKE
                {
                mLIKE(); 

                }
                break;
            case 34 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:217: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 35 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:223: LOCK
                {
                mLOCK(); 

                }
                break;
            case 36 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:228: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:232: NOTFOUND
                {
                mNOTFOUND(); 

                }
                break;
            case 38 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:241: NULL
                {
                mNULL(); 

                }
                break;
            case 39 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:246: OPEN
                {
                mOPEN(); 

                }
                break;
            case 40 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:251: OR
                {
                mOR(); 

                }
                break;
            case 41 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:254: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 42 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:262: RAISE
                {
                mRAISE(); 

                }
                break;
            case 43 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:268: ROLLBACK
                {
                mROLLBACK(); 

                }
                break;
            case 44 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:277: SAVEPOINT
                {
                mSAVEPOINT(); 

                }
                break;
            case 45 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:287: SELECT
                {
                mSELECT(); 

                }
                break;
            case 46 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:294: SET
                {
                mSET(); 

                }
                break;
            case 47 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:298: SQL
                {
                mSQL(); 

                }
                break;
            case 48 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:302: TABLE
                {
                mTABLE(); 

                }
                break;
            case 49 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:308: TRANSACTION
                {
                mTRANSACTION(); 

                }
                break;
            case 50 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:320: TRUE
                {
                mTRUE(); 

                }
                break;
            case 51 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:325: THEN
                {
                mTHEN(); 

                }
                break;
            case 52 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:330: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 53 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:337: WHILE
                {
                mWHILE(); 

                }
                break;
            case 54 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:343: INSERTING
                {
                mINSERTING(); 

                }
                break;
            case 55 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:353: UPDATING
                {
                mUPDATING(); 

                }
                break;
            case 56 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:362: DELETING
                {
                mDELETING(); 

                }
                break;
            case 57 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:371: ISOPEN
                {
                mISOPEN(); 

                }
                break;
            case 58 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:378: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 59 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:385: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 60 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:391: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 61 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:397: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 62 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:406: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 63 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:415: CURSOR
                {
                mCURSOR(); 

                }
                break;
            case 64 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:422: DECLARE
                {
                mDECLARE(); 

                }
                break;
            case 65 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:430: DETERMINISTIC
                {
                mDETERMINISTIC(); 

                }
                break;
            case 66 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:444: END
                {
                mEND(); 

                }
                break;
            case 67 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:448: EXCEPTION
                {
                mEXCEPTION(); 

                }
                break;
            case 68 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:458: EXECUTE
                {
                mEXECUTE(); 

                }
                break;
            case 69 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:466: EXIT
                {
                mEXIT(); 

                }
                break;
            case 70 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:471: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 71 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:480: IMMEDIATE
                {
                mIMMEDIATE(); 

                }
                break;
            case 72 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:490: LOOP
                {
                mLOOP(); 

                }
                break;
            case 73 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:495: NOCOPY
                {
                mNOCOPY(); 

                }
                break;
            case 74 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:502: OTHERS
                {
                mOTHERS(); 

                }
                break;
            case 75 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:509: OUT
                {
                mOUT(); 

                }
                break;
            case 76 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:513: PARALLEL_ENABLE
                {
                mPARALLEL_ENABLE(); 

                }
                break;
            case 77 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:529: PIPELINED
                {
                mPIPELINED(); 

                }
                break;
            case 78 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:539: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 79 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:546: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 80 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:556: RECORD
                {
                mRECORD(); 

                }
                break;
            case 81 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:563: REF
                {
                mREF(); 

                }
                break;
            case 82 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:567: RESULT_CACHE
                {
                mRESULT_CACHE(); 

                }
                break;
            case 83 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:580: RETURN
                {
                mRETURN(); 

                }
                break;
            case 84 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:587: RETURNING
                {
                mRETURNING(); 

                }
                break;
            case 85 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:597: ROWTYPE
                {
                mROWTYPE(); 

                }
                break;
            case 86 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:605: SUBTYPE
                {
                mSUBTYPE(); 

                }
                break;
            case 87 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:613: USING
                {
                mUSING(); 

                }
                break;
            case 88 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:619: VARRAY
                {
                mVARRAY(); 

                }
                break;
            case 89 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:626: VARYING
                {
                mVARYING(); 

                }
                break;
            case 90 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:634: WHEN
                {
                mWHEN(); 

                }
                break;
            case 91 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:639: QUOTED_STRING
                {
                mQUOTED_STRING(); 

                }
                break;
            case 92 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:653: ID
                {
                mID(); 

                }
                break;
            case 93 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:656: SEMI
                {
                mSEMI(); 

                }
                break;
            case 94 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:661: COLON
                {
                mCOLON(); 

                }
                break;
            case 95 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:667: DOUBLEDOT
                {
                mDOUBLEDOT(); 

                }
                break;
            case 96 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:677: DOT
                {
                mDOT(); 

                }
                break;
            case 97 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:681: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 98 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:687: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 99 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:696: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 100 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:705: AT_SIGN
                {
                mAT_SIGN(); 

                }
                break;
            case 101 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:713: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 102 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:720: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 103 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:727: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 104 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:734: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 105 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:741: PLUS
                {
                mPLUS(); 

                }
                break;
            case 106 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:746: MINUS
                {
                mMINUS(); 

                }
                break;
            case 107 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:752: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 108 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:759: EQ
                {
                mEQ(); 

                }
                break;
            case 109 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:762: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 110 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:770: LLABEL
                {
                mLLABEL(); 

                }
                break;
            case 111 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:777: RLABEL
                {
                mRLABEL(); 

                }
                break;
            case 112 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:784: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 113 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:791: ARROW
                {
                mARROW(); 

                }
                break;
            case 114 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:797: VERTBAR
                {
                mVERTBAR(); 

                }
                break;
            case 115 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:805: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); 

                }
                break;
            case 116 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:819: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 117 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:826: LTH
                {
                mLTH(); 

                }
                break;
            case 118 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:830: LEQ
                {
                mLEQ(); 

                }
                break;
            case 119 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:834: GTH
                {
                mGTH(); 

                }
                break;
            case 120 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:838: GEQ
                {
                mGEQ(); 

                }
                break;
            case 121 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:842: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 122 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:850: REAL_NUMBER
                {
                mREAL_NUMBER(); 

                }
                break;
            case 123 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:862: WS
                {
                mWS(); 

                }
                break;
            case 124 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:865: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 125 :
                // /home/ojcchar/Documents/workspaces/pruebastesis/pruebastesis/PruebaParser/gramaticas/PLSQLTree.g:1:876: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA10_eotS =
        "\1\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA10_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\uffff\1\1\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\3",
            "",
            "\1\5\1\uffff\12\3",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "903:1: fragment NUMBER_VALUE : ({...}? => NUM POINT ( NUM )? | POINT NUM | NUM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA10_1>='0' && LA10_1<='9')) ) {s = 3;}

                        else if ( (LA10_1=='.') && ((numberDotValid()))) {s = 5;}

                        else s = 4;

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA10_3>='0' && LA10_3<='9')) ) {s = 3;}

                        else if ( (LA10_3=='.') && ((numberDotValid()))) {s = 5;}

                        else s = 4;

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\27\46\1\uffff\15\46\2\uffff\1\165\1\166\1\uffff\1\172\6"+
        "\uffff\1\174\1\176\1\u0080\1\uffff\1\u0083\1\u0086\1\u0088\1\uffff"+
        "\1\u008a\1\uffff\1\u008c\4\46\1\u0092\22\46\1\u00ad\1\u00af\1\46"+
        "\1\u00b4\5\46\1\u00bd\26\46\25\uffff\1\u008a\3\uffff\2\46\1\u00de"+
        "\2\46\1\uffff\23\46\1\u00f7\1\46\1\u00fa\4\46\1\uffff\1\46\1\uffff"+
        "\4\46\1\uffff\5\46\1\u010a\2\46\1\uffff\1\46\1\u010f\11\46\1\u0119"+
        "\3\46\1\u011d\3\46\1\u0121\11\46\1\uffff\2\46\1\uffff\2\u012f\2"+
        "\46\1\u0132\6\46\1\u0139\13\46\1\u0145\1\uffff\1\46\1\u0147\1\uffff"+
        "\4\46\1\u014c\2\46\1\u014f\3\46\1\u0153\1\u0154\1\u0155\1\46\1\uffff"+
        "\2\46\1\u0159\1\46\1\uffff\1\u015b\10\46\1\uffff\3\46\1\uffff\3"+
        "\46\1\uffff\1\46\1\u016b\1\46\1\u016d\3\46\1\u0171\2\46\1\u0174"+
        "\2\46\1\uffff\1\46\1\u0178\1\uffff\6\46\1\uffff\1\46\1\u0180\11"+
        "\46\1\uffff\1\u018b\1\uffff\1\46\1\u018d\1\46\1\u018f\1\uffff\2"+
        "\46\1\uffff\1\u0192\1\46\1\u0194\3\uffff\3\46\1\uffff\1\46\1\uffff"+
        "\10\46\1\u01a1\6\46\1\uffff\1\u01a8\1\uffff\1\u01a9\1\46\1\u01ac"+
        "\1\uffff\2\46\1\uffff\1\u01af\2\46\1\uffff\1\46\1\u01b3\1\u01b4"+
        "\3\46\1\u01b8\1\uffff\1\u01b9\10\46\1\u01c2\1\uffff\1\u01c3\1\uffff"+
        "\1\46\1\uffff\1\u01c5\1\u01c6\1\uffff\1\46\1\uffff\2\46\1\u01cb"+
        "\1\u01cc\3\46\1\u01d0\2\46\1\u01d3\1\u01d5\1\uffff\4\46\1\u01da"+
        "\1\46\2\uffff\1\46\1\u01dd\1\uffff\1\u01de\1\46\1\uffff\1\46\1\u01e1"+
        "\1\46\2\uffff\2\46\1\u01e5\2\uffff\1\46\1\u01e7\1\u01e8\1\u01e9"+
        "\3\46\1\u01ed\2\uffff\1\46\2\uffff\4\46\2\uffff\1\46\1\u01f4\1\46"+
        "\1\uffff\2\46\1\uffff\1\46\1\uffff\1\46\1\u01fa\1\46\1\u01fc\1\uffff"+
        "\2\46\2\uffff\1\u01ff\1\46\1\uffff\1\46\1\u0202\1\u0203\1\uffff"+
        "\1\u0204\3\uffff\2\46\1\u0207\1\uffff\1\u0208\2\46\1\u020b\1\u020c"+
        "\1\46\1\uffff\4\46\1\u0212\1\uffff\1\46\1\uffff\1\46\1\u0215\1\uffff"+
        "\2\46\3\uffff\1\46\1\u0219\2\uffff\1\u021a\1\u021b\2\uffff\1\46"+
        "\1\u021d\1\u021e\1\46\1\u0220\1\uffff\1\u0221\1\46\1\uffff\3\46"+
        "\3\uffff\1\46\2\uffff\1\46\2\uffff\6\46\1\u022e\1\46\1\u0230\2\46"+
        "\1\u0233\1\uffff\1\u0234\1\uffff\1\u0235\1\46\3\uffff\1\46\1\u0238"+
        "\1\uffff";
    static final String DFA16_eofS =
        "\u0239\uffff";
    static final String DFA16_minS =
        "\1\11\1\116\2\105\2\101\1\105\1\114\1\101\1\117\1\106\1\101\1\40"+
        "\1\120\4\101\1\120\1\110\3\101\1\117\1\uffff\1\116\1\105\1\114\1"+
        "\101\1\117\1\106\1\101\1\120\2\101\1\120\1\110\1\101\2\uffff\1\75"+
        "\1\56\1\uffff\1\52\6\uffff\1\55\1\52\1\76\1\uffff\1\74\1\75\1\174"+
        "\1\uffff\1\56\1\uffff\1\43\1\122\1\124\1\104\1\114\1\43\1\114\1"+
        "\107\1\104\1\122\1\114\1\123\1\105\1\117\1\122\2\103\1\104\1\123"+
        "\1\122\1\124\1\116\1\114\1\124\2\43\1\115\1\43\1\113\1\103\1\116"+
        "\1\103\1\114\1\43\1\110\1\124\1\105\1\103\1\101\1\120\2\103\1\111"+
        "\1\114\1\103\1\114\1\126\1\102\1\114\1\101\1\102\1\105\1\111\1\104"+
        "\1\105\1\122\25\uffff\1\56\3\uffff\1\101\1\110\1\43\2\113\1\uffff"+
        "\1\127\1\111\1\131\2\123\1\115\1\123\1\114\1\105\1\101\1\123\1\105"+
        "\1\114\1\101\3\105\1\103\1\123\1\43\1\105\1\43\2\103\1\123\1\117"+
        "\1\uffff\1\120\1\uffff\1\105\1\117\2\105\1\uffff\1\111\1\105\1\113"+
        "\1\120\1\107\1\43\1\117\1\114\1\uffff\1\105\1\43\1\116\1\141\1\113"+
        "\1\103\1\107\1\105\1\165\1\125\1\117\1\43\1\123\1\114\1\124\1\43"+
        "\1\105\1\124\1\105\1\43\1\116\1\105\1\114\2\116\1\101\1\114\1\116"+
        "\1\122\1\uffff\1\131\1\111\1\uffff\2\43\1\105\1\116\1\43\1\145\1"+
        "\117\1\111\1\124\1\111\1\105\1\43\1\124\1\105\1\124\1\101\1\116"+
        "\1\125\1\122\1\120\1\122\1\125\1\124\1\43\1\uffff\1\106\1\43\1\uffff"+
        "\1\114\1\110\1\124\1\105\1\43\1\105\1\122\1\43\1\130\1\104\1\124"+
        "\3\43\1\125\1\uffff\1\117\1\120\1\43\1\122\1\uffff\1\43\1\154\1"+
        "\101\1\105\1\115\1\114\1\154\2\122\1\uffff\1\105\1\102\1\131\1\uffff"+
        "\1\120\1\131\1\103\1\uffff\1\123\1\43\1\105\1\43\1\107\1\124\1\105"+
        "\1\43\1\101\1\111\1\43\1\104\1\162\1\uffff\1\105\1\43\1\uffff\1"+
        "\156\1\122\1\124\1\101\1\116\1\103\1\uffff\1\105\1\43\1\105\1\122"+
        "\1\105\1\114\1\115\1\124\1\116\1\124\1\123\1\uffff\1\43\1\uffff"+
        "\1\114\1\43\1\111\1\43\1\uffff\1\116\1\124\1\uffff\1\43\1\111\1"+
        "\43\3\uffff\1\101\1\125\1\131\1\uffff\1\123\1\uffff\1\154\1\107"+
        "\1\104\1\101\1\111\1\164\1\116\1\104\1\43\1\101\1\120\1\117\1\120"+
        "\1\124\1\101\1\uffff\1\43\1\uffff\1\43\1\105\1\43\1\uffff\1\131"+
        "\1\116\1\uffff\1\43\1\157\1\116\1\uffff\1\164\2\43\1\116\1\125\1"+
        "\124\1\43\1\uffff\1\43\1\116\1\105\1\122\1\124\2\111\1\101\1\105"+
        "\1\43\1\uffff\1\43\1\uffff\1\117\1\uffff\2\43\1\uffff\1\101\1\uffff"+
        "\1\107\1\116\2\43\1\145\1\105\1\125\1\43\1\116\1\137\2\43\1\uffff"+
        "\1\103\1\105\1\111\1\105\1\43\1\103\2\uffff\1\116\1\43\1\uffff\1"+
        "\43\1\107\1\uffff\1\167\1\43\1\137\2\uffff\1\124\1\105\1\43\2\uffff"+
        "\1\107\3\43\1\116\1\117\1\114\1\43\2\uffff\1\116\2\uffff\1\116\1"+
        "\124\1\105\1\104\2\uffff\1\154\1\43\1\122\1\uffff\1\105\1\143\1"+
        "\uffff\1\116\1\uffff\1\113\1\43\1\116\1\43\1\uffff\1\124\1\107\2"+
        "\uffff\1\43\1\143\1\uffff\1\165\2\43\1\uffff\1\43\3\uffff\1\111"+
        "\1\116\1\43\1\uffff\1\43\1\107\1\105\2\43\1\137\1\uffff\1\105\1"+
        "\104\1\141\1\107\1\43\1\uffff\1\124\1\uffff\1\111\1\43\1\uffff\1"+
        "\157\1\163\3\uffff\1\123\1\43\2\uffff\2\43\2\uffff\1\145\2\43\1"+
        "\143\1\43\1\uffff\1\43\1\117\1\uffff\1\165\1\145\1\124\3\uffff\1"+
        "\156\2\uffff\1\150\2\uffff\1\116\1\156\1\162\1\111\1\141\1\145\1"+
        "\43\1\164\1\43\1\103\1\142\1\43\1\uffff\1\43\1\uffff\1\43\1\154"+
        "\3\uffff\1\145\1\43\1\uffff";
    static final String DFA16_maxS =
        "\1\176\1\165\2\171\2\165\1\145\1\170\1\165\1\157\1\163\1\157\2\165"+
        "\1\162\1\157\1\165\1\162\1\163\1\150\1\162\1\157\1\141\1\165\1\uffff"+
        "\1\165\1\145\1\170\1\165\1\157\1\163\1\157\2\165\1\162\1\163\1\150"+
        "\1\141\2\uffff\1\75\1\71\1\uffff\1\52\6\uffff\1\55\1\52\1\76\1\uffff"+
        "\2\76\1\174\1\uffff\1\145\1\uffff\1\172\1\162\1\164\1\144\1\154"+
        "\1\172\1\154\1\164\1\144\1\162\1\156\1\163\1\145\1\157\1\162\2\164"+
        "\1\144\1\163\1\162\1\164\1\156\1\154\1\164\2\172\1\155\1\172\1\155"+
        "\1\157\1\156\1\164\1\154\1\172\1\150\1\164\1\145\1\162\1\157\1\160"+
        "\1\143\1\164\1\151\1\167\1\164\1\154\1\166\1\142\1\164\1\165\1\142"+
        "\1\145\1\151\1\144\1\151\1\162\25\uffff\1\145\3\uffff\1\141\1\150"+
        "\1\172\2\153\1\uffff\1\167\1\151\1\171\2\163\1\155\1\164\1\154\1"+
        "\145\1\141\1\163\1\145\1\154\1\151\3\145\1\143\1\164\1\172\1\151"+
        "\1\172\2\143\1\163\1\157\1\uffff\1\160\1\uffff\1\145\1\157\2\145"+
        "\1\uffff\1\151\1\145\1\153\1\160\1\147\1\172\1\157\1\154\1\uffff"+
        "\1\145\1\172\1\156\1\141\1\153\1\143\1\147\1\145\2\165\1\157\1\172"+
        "\1\163\1\154\1\164\1\172\1\145\1\164\1\145\1\172\1\156\1\145\1\154"+
        "\2\156\1\141\1\154\1\156\1\171\1\uffff\1\171\1\151\1\uffff\2\172"+
        "\1\145\1\156\1\172\1\145\1\157\1\151\1\164\1\151\1\145\1\172\1\164"+
        "\1\145\1\164\1\141\1\156\1\165\1\162\1\160\1\162\1\165\1\164\1\172"+
        "\1\uffff\1\146\1\172\1\uffff\1\154\1\150\1\164\1\145\1\172\1\145"+
        "\1\162\1\172\1\170\1\144\1\164\3\172\1\165\1\uffff\1\157\1\160\1"+
        "\172\1\162\1\uffff\1\172\1\154\1\141\1\145\1\155\2\154\2\162\1\uffff"+
        "\1\145\1\142\1\171\1\uffff\1\160\1\171\1\143\1\uffff\1\163\1\172"+
        "\1\145\1\172\1\147\1\164\1\145\1\172\1\141\1\151\1\172\1\144\1\162"+
        "\1\uffff\1\145\1\172\1\uffff\1\156\1\162\1\164\1\141\1\156\1\143"+
        "\1\uffff\1\145\1\172\1\151\1\162\1\145\1\154\1\155\1\164\1\156\1"+
        "\164\1\163\1\uffff\1\172\1\uffff\1\154\1\172\1\151\1\172\1\uffff"+
        "\1\156\1\164\1\uffff\1\172\1\151\1\172\3\uffff\1\141\1\165\1\171"+
        "\1\uffff\1\163\1\uffff\1\154\1\147\1\144\1\141\1\151\1\164\1\156"+
        "\1\144\1\172\1\141\1\160\1\157\1\160\1\164\1\141\1\uffff\1\172\1"+
        "\uffff\1\172\1\151\1\172\1\uffff\1\171\1\156\1\uffff\1\172\1\157"+
        "\1\156\1\uffff\1\164\2\172\1\156\1\165\1\164\1\172\1\uffff\1\172"+
        "\1\156\1\145\1\162\1\164\2\151\1\141\1\145\1\172\1\uffff\1\172\1"+
        "\uffff\1\157\1\uffff\2\172\1\uffff\1\141\1\uffff\1\147\1\156\2\172"+
        "\2\145\1\165\1\172\1\156\1\137\2\172\1\uffff\1\143\1\145\1\151\1"+
        "\145\1\172\1\143\2\uffff\1\156\1\172\1\uffff\1\172\1\147\1\uffff"+
        "\1\167\1\172\1\137\2\uffff\1\164\1\145\1\172\2\uffff\1\147\3\172"+
        "\1\156\1\157\1\154\1\172\2\uffff\1\156\2\uffff\1\156\1\164\1\145"+
        "\1\144\2\uffff\1\154\1\172\1\162\1\uffff\1\145\1\143\1\uffff\1\156"+
        "\1\uffff\1\153\1\172\1\156\1\172\1\uffff\1\164\1\147\2\uffff\1\172"+
        "\1\143\1\uffff\1\165\2\172\1\uffff\1\172\3\uffff\1\151\1\156\1\172"+
        "\1\uffff\1\172\1\147\1\145\2\172\1\137\1\uffff\1\145\1\144\1\141"+
        "\1\147\1\172\1\uffff\1\164\1\uffff\1\151\1\172\1\uffff\1\157\1\163"+
        "\3\uffff\1\163\1\172\2\uffff\2\172\2\uffff\1\145\2\172\1\143\1\172"+
        "\1\uffff\1\172\1\157\1\uffff\1\165\1\145\1\164\3\uffff\1\156\2\uffff"+
        "\1\150\2\uffff\2\156\1\162\1\151\1\141\1\145\1\172\1\164\1\172\1"+
        "\143\1\142\1\172\1\uffff\1\172\1\uffff\1\172\1\154\3\uffff\1\145"+
        "\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\30\uffff\1\133\15\uffff\1\134\1\135\2\uffff\1\141\1\uffff\1\144"+
        "\1\145\1\146\1\147\1\150\1\151\3\uffff\1\155\3\uffff\1\164\1\uffff"+
        "\1\173\70\uffff\1\160\1\136\1\140\1\137\1\172\1\142\1\143\1\174"+
        "\1\152\1\175\1\153\1\161\1\154\1\156\1\166\1\165\1\157\1\170\1\167"+
        "\1\163\1\162\1\uffff\1\171\1\172\1\3\5\uffff\1\11\32\uffff\1\37"+
        "\1\uffff\1\33\4\uffff\1\32\10\uffff\1\50\35\uffff\1\172\2\uffff"+
        "\1\1\30\uffff\1\102\2\uffff\1\27\17\uffff\1\44\4\uffff\1\113\11"+
        "\uffff\1\121\3\uffff\1\57\3\uffff\1\56\15\uffff\1\7\2\uffff\1\6"+
        "\6\uffff\1\12\13\uffff\1\105\1\uffff\1\22\4\uffff\1\31\2\uffff\1"+
        "\36\3\uffff\1\41\1\43\1\110\3\uffff\1\46\1\uffff\1\47\17\uffff\1"+
        "\62\1\uffff\1\63\3\uffff\1\132\2\uffff\1\2\3\uffff\1\73\7\uffff"+
        "\1\74\12\uffff\1\23\1\uffff\1\26\1\uffff\1\25\2\uffff\1\34\1\uffff"+
        "\1\42\14\uffff\1\52\6\uffff\1\60\1\127\2\uffff\1\65\2\uffff\1\4"+
        "\3\uffff\1\77\1\15\3\uffff\1\13\1\21\10\uffff\1\72\1\30\1\uffff"+
        "\1\71\1\35\4\uffff\1\111\1\112\3\uffff\1\116\2\uffff\1\123\1\uffff"+
        "\1\120\4\uffff\1\55\2\uffff\1\64\1\130\2\uffff\1\5\3\uffff\1\14"+
        "\1\uffff\1\100\1\20\1\17\3\uffff\1\104\6\uffff\1\51\5\uffff\1\125"+
        "\1\uffff\1\126\2\uffff\1\131\2\uffff\1\75\1\76\1\70\2\uffff\1\24"+
        "\1\106\2\uffff\1\40\1\45\5\uffff\1\53\2\uffff\1\67\3\uffff\1\103"+
        "\1\66\1\107\1\uffff\1\117\1\115\1\uffff\1\124\1\54\14\uffff\1\61"+
        "\1\uffff\1\16\2\uffff\1\122\1\10\1\101\2\uffff\1\114";
    static final String DFA16_specialS =
        "\72\uffff\1\1\116\uffff\1\0\u01af\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\73\2\uffff\1\73\22\uffff\1\73\1\71\1\46\2\uffff\1\65\1\uffff"+
            "\1\30\1\56\1\55\1\53\1\61\1\52\1\62\1\51\1\63\12\72\1\50\1\47"+
            "\1\66\1\64\1\67\1\uffff\1\54\1\31\1\3\1\5\1\32\1\33\1\34\1\35"+
            "\1\46\1\36\2\46\1\37\1\46\1\14\1\40\1\24\1\46\1\25\1\41\1\42"+
            "\1\43\1\45\1\44\3\46\1\60\1\uffff\1\57\1\71\2\uffff\1\1\1\2"+
            "\1\4\1\6\1\7\1\10\1\11\1\46\1\12\2\46\1\13\1\46\1\27\1\15\1"+
            "\16\1\46\1\17\1\20\1\21\1\22\1\26\1\23\3\46\1\uffff\1\70\1\uffff"+
            "\1\71",
            "\1\77\3\uffff\1\75\1\74\1\uffff\1\76\30\uffff\1\77\3\uffff"+
            "\1\75\1\74\1\uffff\1\76",
            "\1\103\11\uffff\1\104\5\uffff\1\102\3\uffff\1\101\13\uffff"+
            "\1\103\11\uffff\1\104\5\uffff\1\100\3\uffff\1\101",
            "\1\103\11\uffff\1\104\5\uffff\1\102\3\uffff\1\101\13\uffff"+
            "\1\103\11\uffff\1\104\5\uffff\1\102\3\uffff\1\101",
            "\1\107\12\uffff\1\111\2\uffff\1\106\2\uffff\1\110\2\uffff\1"+
            "\112\13\uffff\1\107\12\uffff\1\111\2\uffff\1\106\2\uffff\1\110"+
            "\2\uffff\1\105",
            "\1\107\12\uffff\1\111\2\uffff\1\106\2\uffff\1\110\2\uffff\1"+
            "\112\13\uffff\1\107\12\uffff\1\111\2\uffff\1\106\2\uffff\1\110"+
            "\2\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\116\1\uffff\1\115\11\uffff\1\114\23\uffff\1\116\1\uffff"+
            "\1\115\11\uffff\1\114",
            "\1\122\3\uffff\1\120\11\uffff\1\117\5\uffff\1\121\13\uffff"+
            "\1\122\3\uffff\1\120\11\uffff\1\117\5\uffff\1\121",
            "\1\123\37\uffff\1\123",
            "\1\127\6\uffff\1\126\1\125\4\uffff\1\124\22\uffff\1\127\6\uffff"+
            "\1\126\1\125\4\uffff\1\124",
            "\1\132\7\uffff\1\130\5\uffff\1\131\21\uffff\1\132\7\uffff\1"+
            "\130\5\uffff\1\131",
            "\1\30\56\uffff\1\133\5\uffff\1\134\31\uffff\1\133\5\uffff\1"+
            "\134",
            "\1\140\1\uffff\1\135\1\uffff\1\136\1\137\32\uffff\1\140\1\uffff"+
            "\1\135\1\uffff\1\136\1\137",
            "\1\144\7\uffff\1\143\10\uffff\1\142\16\uffff\1\141\7\uffff"+
            "\1\143\10\uffff\1\142",
            "\1\146\3\uffff\1\150\11\uffff\1\147\21\uffff\1\146\3\uffff"+
            "\1\145\11\uffff\1\147",
            "\1\152\3\uffff\1\154\13\uffff\1\151\3\uffff\1\153\13\uffff"+
            "\1\152\3\uffff\1\154\13\uffff\1\151\3\uffff\1\153",
            "\1\156\6\uffff\1\157\11\uffff\1\155\16\uffff\1\156\6\uffff"+
            "\1\157\11\uffff\1\155",
            "\1\161\2\uffff\1\160\34\uffff\1\161\2\uffff\1\160",
            "\1\162\37\uffff\1\162",
            "\1\144\7\uffff\1\143\10\uffff\1\142\16\uffff\1\144\7\uffff"+
            "\1\143\10\uffff\1\142",
            "\1\146\3\uffff\1\150\11\uffff\1\147\21\uffff\1\146\3\uffff"+
            "\1\150\11\uffff\1\147",
            "\1\163\37\uffff\1\163",
            "\1\133\5\uffff\1\134\31\uffff\1\133\5\uffff\1\134",
            "",
            "\1\77\3\uffff\1\75\1\74\1\uffff\1\76\30\uffff\1\77\3\uffff"+
            "\1\75\1\74\1\uffff\1\76",
            "\1\113\37\uffff\1\113",
            "\1\116\1\uffff\1\115\11\uffff\1\114\23\uffff\1\116\1\uffff"+
            "\1\115\11\uffff\1\114",
            "\1\122\3\uffff\1\120\11\uffff\1\117\5\uffff\1\121\13\uffff"+
            "\1\122\3\uffff\1\120\11\uffff\1\117\5\uffff\1\121",
            "\1\123\37\uffff\1\123",
            "\1\127\6\uffff\1\126\1\125\4\uffff\1\124\22\uffff\1\127\6\uffff"+
            "\1\126\1\125\4\uffff\1\124",
            "\1\132\7\uffff\1\130\5\uffff\1\131\21\uffff\1\132\7\uffff\1"+
            "\130\5\uffff\1\131",
            "\1\140\1\uffff\1\135\1\uffff\1\136\1\137\32\uffff\1\140\1\uffff"+
            "\1\135\1\uffff\1\136\1\137",
            "\1\152\3\uffff\1\154\13\uffff\1\151\3\uffff\1\153\13\uffff"+
            "\1\152\3\uffff\1\154\13\uffff\1\151\3\uffff\1\153",
            "\1\156\6\uffff\1\157\11\uffff\1\155\16\uffff\1\156\6\uffff"+
            "\1\157\11\uffff\1\155",
            "\1\161\2\uffff\1\160\34\uffff\1\161\2\uffff\1\160",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "",
            "",
            "\1\164",
            "\1\167\1\uffff\12\170",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\175",
            "\1\177",
            "",
            "\1\u0081\1\u0082\1\71",
            "\1\u0085\1\u0084",
            "\1\u0087",
            "",
            "\1\u008b\1\uffff\12\u0089\53\uffff\1\170",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0091\37\uffff\1\u0090",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0094\14\uffff\1\u0093\22\uffff\1\u0094\14\uffff\1\u0093",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0097\37\uffff\1\u0096",
            "\1\u009a\1\u0098\1\u0099\35\uffff\1\u009a\1\u0098\1\u0099",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u009f\2\uffff\1\u00a0\5\uffff\1\u009e\7\uffff\1\u00a1\16"+
            "\uffff\1\u009f\2\uffff\1\u00a0\5\uffff\1\u009e\7\uffff\1\u00a1",
            "\1\u00a2\1\uffff\1\u00a4\3\uffff\1\u00a5\12\uffff\1\u00a3\16"+
            "\uffff\1\u00a2\1\uffff\1\u00a4\3\uffff\1\u00a5\12\uffff\1\u00a3",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\2\46\13\uffff\12\46\7\uffff\16\46\1\u00ae\13\46\4\uffff\1"+
            "\46\1\uffff\16\46\1\u00ae\13\46",
            "\2\46\13\uffff\12\46\7\uffff\3\46\1\u00b2\16\46\1\u00b0\1\u00b1"+
            "\6\46\4\uffff\1\46\1\uffff\3\46\1\u00b2\16\46\1\u00b0\1\u00b1"+
            "\6\46",
            "\1\u00b3\37\uffff\1\u00b3",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00b6\1\uffff\1\u00b5\35\uffff\1\u00b6\1\uffff\1\u00b5",
            "\1\u00b7\13\uffff\1\u00b8\23\uffff\1\u00b7\13\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00bb\20\uffff\1\u00ba\16\uffff\1\u00bb\20\uffff\1\u00ba",
            "\1\u00bc\37\uffff\1\u00bc",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c2\37\uffff\1\u00c2\16\uffff\1\u00c1",
            "\1\u00c4\15\uffff\1\u00c3\21\uffff\1\u00c4\15\uffff\1\u00c3",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c8\2\uffff\1\u00c9\15\uffff\1\u00c7\16\uffff\1\u00c8"+
            "\2\uffff\1\u00c9\14\uffff\1\u00c6\1\u00c7",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\12\uffff\1\u00cc\24\uffff\1\u00cb\12\uffff\1\u00cc",
            "\1\u00c8\2\uffff\1\u00c9\15\uffff\1\u00c7\16\uffff\1\u00c8"+
            "\2\uffff\1\u00c9\15\uffff\1\u00c7",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\7\uffff\1\u00d1\27\uffff\1\u00d0\7\uffff\1\u00d1",
            "\1\u00d2\23\uffff\1\u00d3\13\uffff\1\u00d2\23\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d9\3\uffff\1\u00d8\33\uffff\1\u00d9\3\uffff\1\u00d8",
            "\1\u00da\37\uffff\1\u00da",
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
            "",
            "\1\u008b\1\uffff\12\u0089\53\uffff\1\u00db",
            "",
            "",
            "",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00e0\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e5\36\uffff\1\u00e4\1\u00e5",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\1\u00e8\36\uffff\1\u00e7\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00f0\7\uffff\1\u00ef\27\uffff\1\u00f0\7\uffff\1\u00ef",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\1\u00f6\36\uffff\1\u00f5\1\u00f6",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00f9\3\uffff\1\u00f8\33\uffff\1\u00f9\3\uffff\1\u00f8",
            "\2\46\13\uffff\12\46\7\uffff\1\u00fb\31\46\4\uffff\1\46\1\uffff"+
            "\1\u00fb\31\46",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "",
            "\1\u0100\37\uffff\1\u0100",
            "",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\2\46\13\uffff\12\46\7\uffff\5\46\1\u010b\24\46\4\uffff\1\46"+
            "\1\uffff\5\46\1\u010b\24\46",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "",
            "\1\u010e\37\uffff\1\u010e",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\6\uffff\1\u012b\30\uffff\1\u012a\6\uffff\1\u012b",
            "",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\u012e\1\uffff"+
            "\32\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0146\37\uffff\1\u0146",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0156\37\uffff\1\u0156",
            "",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u015a\37\uffff\1\u015a",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "",
            "\1\u016a\37\uffff\1\u016a",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u016c\37\uffff\1\u016c",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177\37\uffff\1\u0177",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "",
            "\1\u017f\37\uffff\1\u017f",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0181\3\uffff\1\u0182\33\uffff\1\u0181\3\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0186\37\uffff\1\u0186",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018a\37\uffff\1\u018a",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u018c\37\uffff\1\u018c",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u018e\37\uffff\1\u018e",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0193\37\uffff\1\u0193",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0196\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "",
            "\1\u0198\37\uffff\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\u019c\37\uffff\1\u019c",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01ab\3\uffff\1\u01aa\33\uffff\1\u01ab\3\uffff\1\u01aa",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u01ad\37\uffff\1\u01ad",
            "\1\u01ae\37\uffff\1\u01ae",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01b0",
            "\1\u01b1\37\uffff\1\u01b1",
            "",
            "\1\u01b2",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\u01b6\37\uffff\1\u01b6",
            "\1\u01b7\37\uffff\1\u01b7",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\u01bc\37\uffff\1\u01bc",
            "\1\u01bd\37\uffff\1\u01bd",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\1\u01c0\37\uffff\1\u01c0",
            "\1\u01c1\37\uffff\1\u01c1",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u01c4\37\uffff\1\u01c4",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\10\46\1\u01c7\21\46\4\uffff\1"+
            "\46\1\uffff\10\46\1\u01c7\21\46",
            "",
            "\1\u01c8\37\uffff\1\u01c8",
            "",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01d1\37\uffff\1\u01d1",
            "\1\u01d2",
            "\2\46\13\uffff\12\46\7\uffff\10\46\1\u01d4\21\46\4\uffff\1"+
            "\46\1\uffff\10\46\1\u01d4\21\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "\1\u01d8\37\uffff\1\u01d8",
            "\1\u01d9\37\uffff\1\u01d9",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01db\37\uffff\1\u01db",
            "",
            "",
            "\1\u01dc\37\uffff\1\u01dc",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01df\37\uffff\1\u01df",
            "",
            "\1\u01e0",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01e2",
            "",
            "",
            "\1\u01e3\37\uffff\1\u01e3",
            "\1\u01e4\37\uffff\1\u01e4",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "\1\u01e6\37\uffff\1\u01e6",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01ea\37\uffff\1\u01ea",
            "\1\u01eb\37\uffff\1\u01eb",
            "\1\u01ec\37\uffff\1\u01ec",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "\1\u01ee\37\uffff\1\u01ee",
            "",
            "",
            "\1\u01ef\37\uffff\1\u01ef",
            "\1\u01f0\37\uffff\1\u01f0",
            "\1\u01f1\37\uffff\1\u01f1",
            "\1\u01f2\37\uffff\1\u01f2",
            "",
            "",
            "\1\u01f3",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01f5\37\uffff\1\u01f5",
            "",
            "\1\u01f6\37\uffff\1\u01f6",
            "\1\u01f7",
            "",
            "\1\u01f8\37\uffff\1\u01f8",
            "",
            "\1\u01f9\37\uffff\1\u01f9",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u01fb\37\uffff\1\u01fb",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u01fd\37\uffff\1\u01fd",
            "\1\u01fe\37\uffff\1\u01fe",
            "",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0200",
            "",
            "\1\u0201",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "",
            "\1\u0205\37\uffff\1\u0205",
            "\1\u0206\37\uffff\1\u0206",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0209\37\uffff\1\u0209",
            "\1\u020a\37\uffff\1\u020a",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u020d",
            "",
            "\1\u020e\37\uffff\1\u020e",
            "\1\u020f\37\uffff\1\u020f",
            "\1\u0210",
            "\1\u0211\37\uffff\1\u0211",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0213\37\uffff\1\u0213",
            "",
            "\1\u0214\37\uffff\1\u0214",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u0216",
            "\1\u0217",
            "",
            "",
            "",
            "\1\u0218\37\uffff\1\u0218",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "\1\u021c",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u021f",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0222\37\uffff\1\u0222",
            "",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225\37\uffff\1\u0225",
            "",
            "",
            "",
            "\1\u0226",
            "",
            "",
            "\1\u0227",
            "",
            "",
            "\1\u0228\37\uffff\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b\37\uffff\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u022f",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0231\37\uffff\1\u0231",
            "\1\u0232",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0236",
            "",
            "",
            "",
            "\1\u0237",
            "\2\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ARRAY | AS | AUTHID | BETWEEN | BODY | BULK | BULK_ROWCOUNT | BY | CASE | CREATE | COLLECT | COMMIT | CURRENT_USER | DEFAULT | DEFINER | DELETE | ELSE | ELSIF | EXTERNAL | FALSE | FETCH | FOR | FORALL | GOTO | IF | IN | INDEX | INSERT | INTO | IS | LANGUAGE | LIKE | LIMIT | LOCK | NOT | NOTFOUND | NULL | OPEN | OR | PACKAGE | RAISE | ROLLBACK | SAVEPOINT | SELECT | SET | SQL | TABLE | TRANSACTION | TRUE | THEN | UPDATE | WHILE | INSERTING | UPDATING | DELETING | ISOPEN | EXISTS | BEGIN | CLOSE | CONSTANT | CONTINUE | CURSOR | DECLARE | DETERMINISTIC | END | EXCEPTION | EXECUTE | EXIT | FUNCTION | IMMEDIATE | LOOP | NOCOPY | OTHERS | OUT | PARALLEL_ENABLE | PIPELINED | PRAGMA | PROCEDURE | RECORD | REF | RESULT_CACHE | RETURN | RETURNING | ROWTYPE | SUBTYPE | USING | VARRAY | VARYING | WHEN | QUOTED_STRING | ID | SEMI | COLON | DOUBLEDOT | DOT | COMMA | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | DIVIDE | EQ | PERCENT | LLABEL | RLABEL | ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | LTH | LEQ | GTH | GEQ | INTEGER | REAL_NUMBER | WS | SL_COMMENT | ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_137 = input.LA(1);

                         
                        int index16_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA16_137>='0' && LA16_137<='9')) ) {s = 137;}

                        else if ( (LA16_137=='.') && ((numberDotValid()))) {s = 139;}

                        else if ( (LA16_137=='e') ) {s = 219;}

                        else s = 138;

                         
                        input.seek(index16_137);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_58 = input.LA(1);

                         
                        int index16_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA16_58>='0' && LA16_58<='9')) ) {s = 137;}

                        else if ( (LA16_58=='e') ) {s = 120;}

                        else if ( (LA16_58=='.') && ((numberDotValid()))) {s = 139;}

                        else s = 138;

                         
                        input.seek(index16_58);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}