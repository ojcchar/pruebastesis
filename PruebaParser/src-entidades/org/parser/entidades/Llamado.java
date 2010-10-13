package org.parser.entidades;

public class Llamado {

	private String nombreObjeto;

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	@Override
	public String toString() {
		return "Llamado [nombreObjeto=" + nombreObjeto + "]";
	}

	

}
