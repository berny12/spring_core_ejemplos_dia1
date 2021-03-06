/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.servicio.SaludaService;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/inyeccionDependenciasAppContext.xml")
public class InyeccionDependenciasTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(InyeccionDependenciasTestCase.class);

	// TODO Probar las 3 anotaciones y uso de qualifiers para probar diferencias
	// de tal forma que la
	// prueba sea exitosa.

	// @Autowired -> falla porque primero hay ambiguedad 3 beans del mismo tipo
	// y segundo no hay una
	// nombre saluda service

	// asi funciona autowired par este ejemplo
	// @Autowired
	// @Qualifier("saludaServiceC")
	// private SaludaService saludaService;

	// no funciona porque no encuentra un nombre saludaService, y segundo
	// encuentra tres del mismo tipo
	// @Resource(name="saludaServiceB")

	// asi funciona para esta anotacion
	// @Resource
	// @Qualifier("saludaServiceC")
	// private SaludaService saludaService;

	// @Inject
	// @Qualifier("saludaServiceC")
	// private SaludaService saludaService;

	// el mas recomendado es el siguiente
	@Resource
	private SaludaService saludaService;

	@Test
	public void testSaluda() {
		assertNotNull(saludaService);
		logger.debug(saludaService.saluda("Curso Spring"));
		assertEquals("�Que onda! Curso Spring",
				saludaService.saluda("Curso Spring"));
	}
}
