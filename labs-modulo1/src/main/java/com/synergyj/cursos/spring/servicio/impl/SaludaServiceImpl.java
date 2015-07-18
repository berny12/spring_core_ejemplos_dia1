/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.impl;

import com.synergyj.cursos.spring.servicio.SaludaService;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 */
public class SaludaServiceImpl implements SaludaService {

	private String saludo;

	/*
	 * (non-Javadoc)
	 * @see com.synergyj.cursos.spring.servicio.SaludaService#saluda(java.lang.String)
	 */
	public String saluda(String nombre) {
		return this.getSaludo() + " " + nombre;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
