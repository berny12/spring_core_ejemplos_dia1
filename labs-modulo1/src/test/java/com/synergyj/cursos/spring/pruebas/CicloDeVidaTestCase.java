/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.beans.ciclovida.BeanConMetodoInit;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/cicloVidaAppContext.xml")
public class CicloDeVidaTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(CicloDeVidaTestCase.class);

	@Autowired
	BeanConMetodoInit beanConMetodoInit;

	@Test
	public void cicloDeVida() throws IOException {
		logger.debug("Revisar la salida de la consola, Presionar cualquier tecla al terminar");
		System.in.read();
		logger.debug("Terminando IoC");

	}
}
