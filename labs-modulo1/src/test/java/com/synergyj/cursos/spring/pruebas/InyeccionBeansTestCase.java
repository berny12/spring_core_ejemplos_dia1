/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.servicio.MiServicio;
import com.synergyj.cursos.spring.servicio.impl.MiServicioSinAnotacionesImpl;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/inyeccionBeansXMLAppContext.xml")
 //@ContextConfiguration(locations = "/inyeccionBeansAnotadoAppContext.xml")
 //@ContextConfiguration(locations = "/inyeccionBeansTotalmenteAnotadoAppContext.xml")
 //@ContextConfiguration(locations = "/inyeccionBeansJavaAppContext.xml")
public class InyeccionBeansTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(InyeccionBeansTestCase.class);

	/**
	 * Observar el nombre del atributo, corresponde con el id del bean
	 */
	@Resource
	MiServicio miServicio;

	@Test
	public void validaConfiguracion() {
		Assert.assertNotNull(miServicio);
		// invoca al servicio para validar que el DAO este inyectado correctamente.
		miServicio.crea("Texto de prueba");

		logger.debug("{}", miServicio);
		Assert.assertTrue(miServicio instanceof MiServicioSinAnotacionesImpl);
		// Assert.assertTrue(miServicio instanceof MiServicioParcialAnotadoImpl);
		// Assert.assertTrue(miServicio instanceof MiServicioTotalmenteAnotadoImpl);
		 //Assert.assertTrue(miServicio instanceof MiServicioParcialAnotadoImpl);
	}
}
