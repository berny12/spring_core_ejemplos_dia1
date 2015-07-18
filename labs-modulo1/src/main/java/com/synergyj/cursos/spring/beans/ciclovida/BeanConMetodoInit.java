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

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class BeanConMetodoInit {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(BeanConMetodoInit.class);

	private String nombre;

	private int edad;

	/**
	 * Configurado en XML para ser invocado
	 */
	public void init() {
		// TODO A) Agregar un mensaje a la consola

	}

	/**
	 * Configurado en XML para ser invocado
	 */
	public void destroy() {
		// TODO B) Agregar un mensaje a la consola
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
		builder.append("BeanConMetodoInit [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}

}
