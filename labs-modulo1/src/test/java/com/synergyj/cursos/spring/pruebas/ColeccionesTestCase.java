/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.beans.colecciones.ColeccionesBean;
import com.synergyj.cursos.spring.beans.colecciones.Dummy;
import com.synergyj.cursos.spring.beans.colecciones.DummyInner;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/coleccionesAppContext.xml")
public class ColeccionesTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ColeccionesTestCase.class);

	@Autowired
	private ColeccionesBean coleccionesBean;

	private ColeccionesBean bean;

	@Before
	public void getColeccion() {
		Dummy dummy;
		DummyInner dummyInner;
		List<String> lista;
		SortedMap<String, Object> propiedades;
		bean = new ColeccionesBean();
		bean.setAnnios(100);
		dummy = new Dummy();
		dummy.setNombre("Hola");
		dummyInner = new DummyInner();
		dummyInner.setAlgo("algo mas");
		dummy.setInner(dummyInner);
		bean.setDummy(dummy);
		bean.setEsProgramador(true);
		bean.setIdiomas(new Locale[] { new Locale("es"), new Locale("fr"), new Locale("ja") });
		lista = new ArrayList<>();
		lista.add("elemento 1 de la lista");
		lista.add("377378383");
		lista.add("elemento 3 de la lista");
		lista.add("377378383");
		bean.setLista(lista);
		bean.setNombre("El innombrable");
		propiedades = new TreeMap<>();
		propiedades.put("cadena", new Long(377378383));
		propiedades.put("key", "value");
		bean.setPropiedades(propiedades);
		bean.setTelefonos(new String[] { "5555-8887", "5555-8887-6544" });
	}

	/**
	 * TODO, crear un archivo coleccionesAppContext.xml y definir un bean que tenga contenido
	 * identico al bean instanciado en el metodo anterior.
	 */
	@Test
	public void testContenidoLista() {
		assertNotNull(coleccionesBean);
		logger.debug("{}", coleccionesBean.toString());
		logger.debug("{}", bean);
		Assert.assertEquals(bean.toString(), coleccionesBean.toString());

	}
}
