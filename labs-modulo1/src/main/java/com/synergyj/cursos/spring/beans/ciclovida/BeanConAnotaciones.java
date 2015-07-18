/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.ciclovida;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Esta clase muestra como participar en el ciclo de vida del bean usnado anotaciones estandar. El
 * nombre de los metodos no es importante, lo que es importante es que sean void y no reciban
 * parametros
 */
public class BeanConAnotaciones {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(BeanConAnotaciones.class);

	@PostConstruct
	public void start() {
		// E) TODO agregar mensaje

	}

	@PreDestroy
	public void shutdown() {
		// F) TODO agregar mensaje

	}
}
