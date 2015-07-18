package com.synergyj.cursos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HolaMundoTestCase {

	// logger
	private static final Logger logger = LoggerFactory
			.getLogger(HolaMundoTestCase.class);
	// atributo ApplicationContext
	private ApplicationContext appContext;

	@Before
	public void init() {
		appContext = new ClassPathXmlApplicationContext("/appContext.xml");
	}

	@Test
	public void saluda() {
		HolaMundo bean;

		Assert.assertNotNull(appContext);
		bean = appContext.getBean("holaMundo", HolaMundo.class);
		Assert.assertNotNull(bean);
		Assert.assertEquals("Hola mundo con Spring y Synergyj", bean.saluda());
		logger.debug("Saludando: {}", bean.saluda());
	}

}
