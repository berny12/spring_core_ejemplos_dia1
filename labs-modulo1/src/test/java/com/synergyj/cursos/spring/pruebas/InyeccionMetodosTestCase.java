package com.synergyj.cursos.spring.pruebas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.servicio.print.DispatcherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/inyeccionMetodosAppContext.xml")
public class InyeccionMetodosTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(InyeccionMetodosTestCase.class);

	@Autowired
	private DispatcherService service;

	@Test
	public void testEnviaPeticion() {
		logger.info("Imprimiendo la firma del servicio: {}", service);
		logger.info("Ejemplificando el concepto de inyeccion de metodos ..");
		logger.info("Invocando el servicio de impresion ..");
		service.procesaPeticion("Texto Impreso");
		service.procesaPeticion("Texto Impreso 2");

	}
}
