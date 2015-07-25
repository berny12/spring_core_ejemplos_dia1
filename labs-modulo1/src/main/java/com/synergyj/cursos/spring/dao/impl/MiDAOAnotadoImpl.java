/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.synergyj.cursos.spring.dao.MiDAO;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com) Observar que el
 *         id del Bean corresponde con el nombre de la interface en notacion
 *         camello. Se recomienda esta convención
 */
// TODO Anotar este DAO
// se anota como repository para dar que es un dao
@Repository("miDAO")
public class MiDAOAnotadoImpl implements MiDAO {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(MiDAOAnotadoImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.synergyj.cursos.spring.dao.MiDAO#crea(java.lang.String)
	 */
	@Override
	public void crea(String texto) {
		logger.debug("insertando {}", texto);

	}

}
