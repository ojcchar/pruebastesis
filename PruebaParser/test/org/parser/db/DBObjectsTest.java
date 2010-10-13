package org.parser.db;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class DBObjectsTest {

	@Test
	public void testObtenerProcedimientos() throws SQLException, ClassNotFoundException {
		List<String> procedimientos = DBObjects.getInstance().obtenerProcedimientosFunciones();

		assertNotNull(procedimientos);

		System.out.println(procedimientos);
	}

	@Test
	public void obtenerCodigoProcedimiento() throws SQLException, ClassNotFoundException {
		String procedimiento = "IN_CTOC_ACT_FECHA_TERMINACION";
		String codigo = DBObjects.getInstance().obtenerCodigoProcedimiento(procedimiento);

		assertNotNull(codigo);

		System.out.println(codigo);
	}

}
