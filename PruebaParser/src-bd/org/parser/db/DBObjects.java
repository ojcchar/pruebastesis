package org.parser.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class DBObjects {

	private static final String USUARIO = "VU_SFI";
	private static final String URL = "jdbc:oracle:thin:@192.168.60.188:1521:sfi23";
	private Connection connection;
	private static DBObjects servicio;

	private DBObjects() {

	}

	public static DBObjects getInstance() {
		if (servicio == null) {
			servicio = new DBObjects();
		}
		return servicio;
	}

	public synchronized void cerrarConexion() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	private synchronized void crearConexion() throws ClassNotFoundException, SQLException {
		if (connection != null) {
			return;
		}

		Class.forName("oracle.jdbc.driver.OracleDriver");

		connection = DriverManager.getConnection(URL, USUARIO, USUARIO);

	}

	public List<String> obtenerProcedimientosFunciones() throws SQLException, ClassNotFoundException {

		crearConexion();

		List<String> procedimientos = new LinkedList<String>();

		Statement sentencia = connection.createStatement();
		String query = "SELECT object_name  FROM user_objects  where object_type in ( 'PROCEDURE' )";
		// String query = "SELECT object_name FROM all_procedures" +
		// " WHERE owner = '" + USUARIO + "'  AND procedure_name IS NULL";
		ResultSet rset = sentencia.executeQuery(query);

		while (rset.next()) {
			procedimientos.add(rset.getString(1).toUpperCase());
		}

		sentencia.close();

		return procedimientos;
	}

	public String obtenerCodigoProcedimiento(String procedimiento) throws SQLException, ClassNotFoundException {

		crearConexion();

		StringBuffer codigo = new StringBuffer();

		String query = "SELECT text FROM all_source WHERE type IN ('PROCEDURE','FUNCTION') AND  name= ?  ORDER BY line";
		PreparedStatement sentencia = connection.prepareStatement(query);
		sentencia.setString(1, procedimiento);

		ResultSet rset = sentencia.executeQuery();

		while (rset.next()) {
			codigo.append(rset.getString(1));
		}

		sentencia.close();

		return codigo.toString();
	}

	public String obtenerCodigoPackageBody(String paquete) throws SQLException, ClassNotFoundException {

		crearConexion();
		StringBuffer codigo = new StringBuffer();

		String query = "SELECT text FROM all_source WHERE type IN ('PACKAGE BODY') AND  name= ?  ORDER BY line";
		PreparedStatement sentencia = connection.prepareStatement(query);
		sentencia.setString(1, paquete);

		ResultSet rset = sentencia.executeQuery();

		while (rset.next()) {
			codigo.append(rset.getString(1));
		}

		sentencia.close();

		return codigo.toString();
	}

}
