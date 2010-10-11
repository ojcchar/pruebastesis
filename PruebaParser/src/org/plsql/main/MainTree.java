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
import org.antlr.runtime.tree.Tree;
import org.plsql.PLSQLParser.procedure_definition_return;
import org.plsql.PLSQLTreeLexer;
import org.plsql.PLSQLTreeParser;

public class MainTree {

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

		PLSQLTreeLexer lexer = new PLSQLTreeLexer(cs);

		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);

		DebugEventListener dbg = null;
		DebugTokenStream tokendbg = new DebugTokenStream(tokens, dbg);

		PLSQLTreeParser parser = new PLSQLTreeParser(tokens);
		org.plsql.PLSQLTreeParser.procedure_definition_return procedimiento = parser
				.procedure_definition();
		CommonTree arbol = (CommonTree) procedimiento.getTree();

		List list = arbol.getChildren();

//		for (Object object : list) {
//			System.out.print(object);
//		}
//		Tree arbol2 = (Tree) arbol;
//		System.out.println("\ntree=" + ((Tree) arbol).toStringTree());
		
		printTree(arbol, 1);

		// System.out.println(parser.ex);

		// CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree) arbol);
		// nodes.setTokenStream(tokens);
		//
		// System.out.println(nodes);
	}

	public static void printTree(CommonTree tree, int indent) {
		if (tree != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++)
				sb = sb.append("____  ");
			for (int i = 0; i < tree.getChildCount(); i++) {
				System.out.println(sb.toString() + tree.getChild(i).toString());
				printTree((CommonTree) tree.getChild(i), indent + 1);
			}
		}
	}

}
