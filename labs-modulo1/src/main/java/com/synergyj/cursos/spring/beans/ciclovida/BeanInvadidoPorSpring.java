/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.ciclovida;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInvadidoPorSpring implements InitializingBean, DisposableBean {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(BeanInvadidoPorSpring.class);

	private String nombre;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {

		// TODO C) Agregar mensaje
		logger.debug("Clase {} esta ejecutando destroy", this.getClass());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO D) Agregar mensaje
		logger.debug("Clase {} esta ejecutando afterPropertiesSet",
				this.getClass());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanInvadidoPorSpring [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

}
