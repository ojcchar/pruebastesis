package org.parser.entidades;

import java.util.List;

public class Paquete {

	private List<Procedimiento> procedimientos;
	private String nombre;

	public void setProcedimientos(List<Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}

	public List<Procedimiento> getProcedimientos() {
		return procedimientos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		StringBuffer bufer = new StringBuffer();
		String nuevaLinea = "\n";

		bufer.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
				+ nuevaLinea);
		bufer.append("Paquete" + nombre + ":" + nuevaLinea);
		bufer.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
				+ nuevaLinea);
		bufer.append("Procedimientos:" + nuevaLinea);

		for (Procedimiento proc : procedimientos) {
			bufer.append(proc + nuevaLinea);
			bufer.append("- - - - - - - - - - - - - - - - - - - - " + nuevaLinea);
		}
		bufer.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
				+ nuevaLinea);

		return bufer.toString();
	}

}
