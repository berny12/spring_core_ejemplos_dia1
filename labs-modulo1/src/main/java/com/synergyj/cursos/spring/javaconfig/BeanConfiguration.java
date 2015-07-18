/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.synergyj.cursos.spring.dao.MiDAO;
import com.synergyj.cursos.spring.dao.impl.MiDAOSinAnotacionesImpl;
import com.synergyj.cursos.spring.servicio.MiServicio;
import com.synergyj.cursos.spring.servicio.impl.MiServicioParcialAnotadoImpl;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public MiServicio buildMiServicio() {
		return new MiServicioParcialAnotadoImpl();
	}

	@Bean
	public MiDAO buildMiDAO() {
		return new MiDAOSinAnotacionesImpl();

	}
}
