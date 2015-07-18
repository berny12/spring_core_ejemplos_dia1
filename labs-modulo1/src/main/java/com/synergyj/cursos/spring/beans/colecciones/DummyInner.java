/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.colecciones;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 */
public class DummyInner {
	private String algo;

	public String getAlgo() {
		return algo;
	}

	public void setAlgo(String algo) {
		this.algo = algo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DummyInner [algo=");
		builder.append(algo);
		builder.append("]");
		return builder.toString();
	}

}
