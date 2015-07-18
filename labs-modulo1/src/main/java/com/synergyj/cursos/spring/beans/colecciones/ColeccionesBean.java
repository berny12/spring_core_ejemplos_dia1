/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.beans.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ColeccionesBean {
	private String nombre;
	private int annios;
	private boolean esProgramador;
	private String[] telefonos;
	private List<String> lista;
	private SortedMap<String, Object> propiedades;
	private Dummy dummy;

	@Autowired
	private Locale[] idiomas;

	public Locale[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Locale[] idiomas) {
		this.idiomas = idiomas;
	}

	public int getAnnios() {
		return annios;
	}

	public void setAnnios(int annios) {
		this.annios = annios;
	}

	public boolean isEsProgramador() {
		return esProgramador;
	}

	public void setEsProgramador(boolean esProgramador) {
		this.esProgramador = esProgramador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public SortedMap<String, Object> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(SortedMap<String, Object> propiedades) {
		this.propiedades = propiedades;
	}

	public Dummy getDummy() {
		return dummy;
	}

	public void setDummy(Dummy dummy) {
		this.dummy = dummy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColeccionesBean [nombre=");
		builder.append(nombre);
		builder.append(", annios=");
		builder.append(annios);
		builder.append(", esProgramador=");
		builder.append(esProgramador);
		builder.append(", telefonos=");
		builder.append(Arrays.toString(telefonos));
		builder.append(", lista=");
		builder.append(lista);
		builder.append(", propiedades=");
		builder.append(propiedades);
		builder.append(", dummy=");
		builder.append(dummy);
		builder.append(", idiomas=");
		builder.append(Arrays.toString(idiomas));
		builder.append("]");
		return builder.toString();
	}
}
