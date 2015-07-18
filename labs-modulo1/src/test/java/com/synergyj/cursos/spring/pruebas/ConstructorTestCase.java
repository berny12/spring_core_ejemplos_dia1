/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.servicio.ConstructorService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
// A) TODO, Cargar el application context con las 2 anotaciones vistas en el lab. anterior.
// emplear el archivo /constructorAppContext.xml
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/constructorAppContext.xml")
public class ConstructorTestCase {

	@Autowired
	// observar el uso de esta anotacion aqui. Es posible inyectar el propio ApplicationContext.
	private ApplicationContext appContext;

	@Autowired
	private ConstructorService stringIntBean;

	@Autowired
	private ConstructorService intStringBean;

	@Autowired
	private ConstructorService intBean;

	@Autowired
	private ConstructorService intStringDaoBean;

	@Test
	public void validaAppContext() {
		assertNotNull(appContext);
	}

	@Test
	public void constructorSringIntBean() {
		// B) TODO corregir el archivo xml para que funcione.
		assertEquals("stringIntBean:20,10", stringIntBean.toString());
	}

	@Test
	public void constructorIntStringBean() {
		// C) TODO corregir el problema para que esta prueba funcione.
		assertEquals("intStringBean:10,20", intStringBean.toString());

	}

	@Test
	public void constructorIntBean() {
		// D TODO corregir el problema para que esta prueba funcione
		assertEquals("intBean", intBean.toString());

	}

	@Test
	public void constructorIntStringDAOBean() {
		// E) TODO ¿Por qué este test case no falla sin requerir cambio alguno?
		assertEquals("intStringDaoBean", intStringDaoBean.toString());
	}

}
