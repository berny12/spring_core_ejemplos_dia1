/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.dao.MiDAO;
import com.synergyj.cursos.spring.servicio.MiServicio;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class MiServicioSinAnotacionesImpl implements MiServicio {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(MiServicioSinAnotacionesImpl.class);

	private MiDAO miDAO;

	/*
	 * (non-Javadoc)
	 * @see com.synergyj.cursos.spring.servicio.MiServicio#crea(java.lang.String)
	 */
	@Override
	public void crea(String s) {
		logger.debug("invocando a miDAO");
		miDAO.crea(s);
	}

	public void setMiDAO(MiDAO miDAO) {
		this.miDAO = miDAO;
	}

	public MiDAO getMiDAO() {
		return miDAO;
	}

}
