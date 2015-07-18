/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.saludo;

/**
 * Bean básico empleado para ilustrar el uso de nombres y alias.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class SaludoBean {

	private String saludo;

	/**
	 * @param saludo
	 */
	public SaludoBean(String saludo) {
		this.saludo = saludo;
	}

	/**
	 * @return
	 */
	public String saluda() {
		return saludo;
	}
}
