import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.plsql.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        PLSQLTreeLexer lex = new PLSQLTreeLexer(new ANTLRFileStream("/home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/gramaticas/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        PLSQLTreeParser g = new PLSQLTreeParser(tokens, 49100, null);
        try {
            g.package_body();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}