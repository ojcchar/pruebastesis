package org.parser.entidades;

import java.util.List;

public class Procedimiento {

	private String nombre;
	private List<Parametro> parametros;
	private Declaracion declaracion;
	private Body body;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Parametro> getParametros() {
		return parametros;
	}

	public void setParametros(List<Parametro> parametros) {
		this.parametros = parametros;
	}

	public Declaracion getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Procedimiento [nombre=" + nombre + ", body=" + body + "]";
	}

}
