/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.synergyj.cursos.spring.dao.MiDAO;
import com.synergyj.cursos.spring.servicio.MiServicio;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com) Observar que el
 *         id del Bean corresponde con el nombre de la interface en notacion
 *         camello. Se recomienda esta convenci�n
 */
// TODO Anotar este servicio
// se poene el nombre igual al de la interfaz par que sea unico y solo una
// instancia, y evitar poner el nombre del servicio
@Service("miServicio")
public class MiServicioTotalmenteAnotadoImpl implements MiServicio {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(MiServicioTotalmenteAnotadoImpl.class);

	/**
	 * Nuevamente, Analizar la siguiente pregunta: �Donde est� la definici�n del
	 * bean miDAO?, recordar que @Resource busca un bean con id miDAO como
	 * primer filtro.
	 */
	@Resource
	private MiDAO miDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.synergyj.cursos.spring.servicio.MiServicio#crea(java.lang.String)
	 */
	@Override
	public void crea(String s) {
		logger.debug("invocando a miDAO");
		miDAO.crea(s);
	}
}
