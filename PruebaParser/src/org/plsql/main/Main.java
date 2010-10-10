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
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.plsql.PLSQLLexer;
import org.plsql.PLSQLParser;
import org.plsql.PLSQLParser.procedure_definition_return;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws RecognitionException
	 */
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws IOException,
			RecognitionException {
		String file = "/home/ojcchar1/Documents/workspaces-eclipse/pruebastesis/PruebaParser/procedimientos/Af_pafdv_saldini.sql";
		CharStream cs = new ANTLRFileStream(file);

		PLSQLLexer lexer = new PLSQLLexer(cs);

		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);

		DebugEventListener dbg = null;
		DebugTokenStream tokendbg = new DebugTokenStream(tokens, dbg);

		PLSQLParser parser = new PLSQLParser(tokens);
		procedure_definition_return procedimiento = parser
				.procedure_definition();
		CommonTree arbol = (CommonTree) procedimiento.getTree();

		List list = arbol.getChildren();

		for (Object object : list) {
			System.out.print(object);
		}

		System.out.println("tree=" + ((Tree) arbol).toStringTree());

		CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree) arbol);
		nodes.setTokenStream(tokens);

		System.out.println(nodes);
	}

}
