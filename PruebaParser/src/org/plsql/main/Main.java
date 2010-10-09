package org.plsql.main;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.DebugEventListener;
import org.antlr.runtime.debug.DebugTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.plsql.PLSQLLexer;
import org.plsql.PLSQLParser;
import org.plsql.PLSQLParser.body_return;
import org.plsql.PLSQLParser.procedure_declaration_or_definition_return;
import org.plsql.PLSQLParser.procedure_declaration_return;
import org.plsql.PLSQLParser.procedure_definition_return;
import org.plsql.PLSQLParser.procedure_heading_return;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		String file = "/home/ojcchar1/Documents/workspaces-eclipse/tesis/PruebaParser/procedimientos/Af_pafdv_saldini.sql";
		CharStream cs = new ANTLRFileStream(file);
		
		PLSQLLexer lexer=new PLSQLLexer(cs);
		
		//comentario prueba
		
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		
		DebugEventListener dbg=null;
		DebugTokenStream tokendbg=new DebugTokenStream(tokens, dbg);
		
		PLSQLParser parser=new PLSQLParser(tokens);
		procedure_definition_return procedimiento = parser.procedure_definition();
		CommonTree arbol = (CommonTree) procedimiento.getTree();
		System.out.println(arbol);
		
		List list = arbol.getChildren();
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}	

}
