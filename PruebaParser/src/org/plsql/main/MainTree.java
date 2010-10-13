package org.plsql.main;

import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.parser.db.DBObjects;
import org.parser.entidades.Body;
import org.parser.entidades.Declaracion;
import org.parser.entidades.Llamado;
import org.parser.entidades.Parametro;
import org.parser.entidades.Procedimiento;
import org.plsql.PLSQLTreeLexer;
import org.plsql.PLSQLTreeParser;
import org.plsql.PLSQLTreeParser.package_body_return;

public class MainTree {

	/**
	 * @param args
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public static void main(String[] args) throws Exception {

		String paquete="PI_QSIMU";
		String codigo = DBObjects.getInstance().obtenerCodigoPackageBody(paquete);
		
		CharStream cs = new ANTLRReaderStream(new StringReader(codigo));

		PLSQLTreeLexer lexer = new PLSQLTreeLexer(cs);

		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);

		PLSQLTreeParser parser = new PLSQLTreeParser(tokens);
		package_body_return packageBody = parser.package_body();
		
		CommonTree arbol = (CommonTree) packageBody.getTree();

		 printTree(arbol, 1);
	//	pintarProcedimientos();

	}

	private static void pintarProcedimientos() throws SQLException, ClassNotFoundException, IOException, RecognitionException {
		List<String> procedimientos = DBObjects.getInstance().obtenerProcedimientosFunciones();

		for (String pro : procedimientos) {

			String codigo = DBObjects.getInstance().obtenerCodigoProcedimiento(pro);

			CharStream cs = new ANTLRReaderStream(new StringReader(codigo));

			PLSQLTreeLexer lexer = new PLSQLTreeLexer(cs);

			CommonTokenStream tokens = new CommonTokenStream();
			tokens.setTokenSource(lexer);

			PLSQLTreeParser parser = new PLSQLTreeParser(tokens);
			org.plsql.PLSQLTreeParser.procedure_definition_return procedimiento = parser.procedure_definition();
			CommonTree arbol = (CommonTree) procedimiento.getTree();

			// printTree(arbol, 1);
			Procedimiento proc = construirProcedimiento(arbol);

			System.out.println(proc);
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		}
	}

	private static Procedimiento construirProcedimiento(CommonTree arbol) {
		Procedimiento proc = new Procedimiento();

		if (arbol == null) {
			return proc;
		}

		String nombre = obtenerNombreProc(arbol);
		Body body = obtenerBodyProc(arbol);
		Declaracion declaracion = obtenerDeclaracionProc(arbol);
		List<Parametro> parametros = obtenerParametrosProc(arbol);

		proc.setBody(body);
		proc.setDeclaracion(declaracion);
		proc.setNombre(nombre);
		proc.setParametros(parametros);

		return proc;
	}

	private static List<Parametro> obtenerParametrosProc(CommonTree arbol) {
		return null;
	}

	private static Declaracion obtenerDeclaracionProc(CommonTree arbol) {
		return null;
	}

	private static Body obtenerBodyProc(CommonTree arbol) {
		Body body = new Body();

		Tree cuerpo = null;
		if (arbol != null) {
			for (int i = 0; i < arbol.getChildCount(); i++) {
				Tree hijo = arbol.getChild(i);

				if (hijo.getType() == PLSQLTreeLexer.BODY) {
					cuerpo = hijo;
					break;
				}

			}
		}

		List<Llamado> llamados = obtenerLlamadosBody(cuerpo);
		body.setLlamados(llamados);

		// List<String> cadenas = obtenerCadenasBody(cuerpo);
		// body.setCadenas(cadenas);

		return body;
	}

	@SuppressWarnings("unused")
	private static List<String> obtenerCadenasBody(Tree arbol) {
		List<String> cadenas = new LinkedList<String>();

		if (arbol == null) {
			return cadenas;
		}

		for (int i = 0; i < arbol.getChildCount(); i++) {
			Tree hijo = arbol.getChild(i);

			if (hijo.getType() == PLSQLTreeLexer.STRING) {
				cadenas.add(hijo.getChild(0).getText().replaceAll("'", ""));
			} else {
				List<String> cads = obtenerCadenasBody(hijo);
				cadenas.addAll(cads);
			}

		}

		return cadenas;
	}

	private static List<Llamado> obtenerLlamadosBody(Tree arbol) {
		List<Llamado> llamados = new LinkedList<Llamado>();

		if (arbol == null) {
			return llamados;
		}

		for (int i = 0; i < arbol.getChildCount(); i++) {
			Tree hijo = arbol.getChild(i);

			if (hijo.getType() == PLSQLTreeLexer.PROC_CALL || hijo.getType() == PLSQLTreeLexer.PACKCALL) {
				String nombreLlamado = obtenerNombreLlamado(hijo);

				if (nombreLlamado != null) {

					Llamado llamado = new Llamado();
					llamado.setNombreObjeto(nombreLlamado);

					llamados.add(llamado);
				}
			}

		}

		return llamados;
	}

	private static String obtenerNombreLlamado(Tree hijo) {
		String nombre = null;

		if (hijo == null) {
			return nombre;
		}

		int numHijos = hijo.getChildCount();
		if (numHijos > 2 && "(".equals(hijo.getChild(1).getText())) {
			nombre = hijo.getChild(0).getText();
		} else {
			if (numHijos > 4 && ".".equals(hijo.getChild(1).getText()) && "(".equals(hijo.getChild(3).getText())) {
				nombre = hijo.getChild(0).getText() + hijo.getChild(1).getText() + hijo.getChild(2).getText();
			}
		}

		return nombre;
	}

	private static String obtenerNombreProc(CommonTree arbol) {
		String nombre = "";
		if (arbol != null) {
			for (int i = 0; i < arbol.getChildCount(); i++) {
				Tree hijo = arbol.getChild(i);

				if (hijo.getType() == PLSQLTreeLexer.PROCNAME) {
					nombre = hijo.getChild(0).getText();
					break;
				}

			}
		}
		return nombre;
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
