/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.beans.dependencias.Curso;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
// Observar la forma correcta en la que se carga el appContext para pruebas unitarias.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/inyeccionDependenciasBasicoAppContext.xml")
public class InyeccionBasicaTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(InyeccionBasicaTestCase.class);

	@Autowired // observar que se inyecta al appContext.
	private ApplicationContext appContext;

	@Test
	public void creaCurso() {
		Curso curso, otroCurso;
		curso = appContext.getBean("curso", Curso.class);
		logger.debug("curso creado: {}", curso);
		Assert.assertNotNull(curso);
		Assert.assertNotNull(curso.getAsignatura());
		Assert.assertNotNull(curso.getAsignatura().getClave());
		Assert.assertNotNull(curso.getCursoSiguiente());
		Assert.assertNotNull(curso.getProfesor());
		Assert.assertNotNull(curso.getSalon());
		otroCurso = appContext.getBean("curso", Curso.class);

		Assert.assertTrue("El bean no es prototype", curso != otroCurso);

	}
}
