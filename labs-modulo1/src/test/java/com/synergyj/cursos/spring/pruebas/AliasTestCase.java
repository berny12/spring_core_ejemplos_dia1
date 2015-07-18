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
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synergyj.cursos.spring.beans.saludo.SaludoBean;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class AliasTestCase {

	private ApplicationContext appContext;

	/**
	 * En Spring existen diversas formas de obtener una referencia al {@link ApplicationContext}, en
	 * la práctica no se recomienda esta estrategia. En este caso se hace de este modo para ilustrar
	 * el proceso de creación de un {@link ApplicationContext} a través de un archivo xml.
	 */
	@Before
	public void init() {
		appContext = new ClassPathXmlApplicationContext("aliasYNombresAppContext.xml");
	}

	@Test
	public void aliasYNombres() {
		SaludoBean bean;

		// invocando por id
		bean = appContext.getBean("saludoBean", SaludoBean.class);
		Assert.assertNotNull(bean);

		// invocando por nombre
		bean = appContext.getBean("holaBean", SaludoBean.class);
		Assert.assertNotNull(bean);

		// invocando por nombre
		bean = appContext.getBean("regardsBean", SaludoBean.class);
		Assert.assertNotNull(bean);

		// invocando por alias
		bean = appContext.getBean("keOndaBean", SaludoBean.class);
		Assert.assertNotNull(bean);

		// invocando por alias
		bean = appContext.getBean("kiuboBean", SaludoBean.class);
		Assert.assertNotNull(bean);

		// validando alias
		for (String s : appContext.getAliases("saludoBean")) {
			Assert.assertTrue(s.equals("holaBean") || s.equals("regardsBean")
					|| s.equals("keOndaBean") || s.equals("kiuboBean"));
		}
	}
}
