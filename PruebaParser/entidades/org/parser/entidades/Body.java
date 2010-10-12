package org.parser.entidades;

import java.util.List;

public class Body {

	private List<Llamado> llamados;
	private List<String> cadenas;

	public void setLlamados(List<Llamado> llamados) {
		this.llamados = llamados;
	}

	public List<Llamado> getLlamados() {
		return llamados;
	}

	public void setCadenas(List<String> cadenas) {
		this.cadenas = cadenas;
	}

	public List<String> getCadenas() {
		return cadenas;
	}

	@Override
	public String toString() {
		return "Body [llamados=" + llamados + "\ncadenas=" + cadenas + "]";
	}

	
	
}
