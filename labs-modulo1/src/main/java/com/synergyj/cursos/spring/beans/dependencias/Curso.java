/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.dependencias;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
// el bean debe estar creado como Prototype y solo se debe crear hasta que se requiera.
public class Curso {

	// inyectar por constructor
	private Profesor profesor;

	// inyectar el valor de la clave de la asignatura 'Algebra' (compound property name)
	private Asignatura asignatura = new Asignatura();

	// inyectar como inner bean
	private Curso cursoSiguiente;

	// inyectar asegurando que el bean salon haya sido inicializado previamente (depends-on)
	private Salon salon;

	public Curso(Profesor profesor) {
		this.profesor = profesor;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Curso getCursoSiguiente() {
		return cursoSiguiente;
	}

	public void setCursoSiguiente(Curso cursoSiguiente) {
		this.cursoSiguiente = cursoSiguiente;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [profesor=");
		builder.append(profesor);
		builder.append(", asignatura=");
		builder.append(asignatura);
		builder.append(", cursoSiguiente=");
		builder.append(cursoSiguiente);
		builder.append(", salon=");
		builder.append(salon);
		builder.append("]");
		return builder.toString();
	}

}
