/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.dao.GenericDAO;
import com.synergyj.cursos.spring.servicio.ConstructorService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ConstructorServiceImpl implements ConstructorService {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ConstructorServiceImpl.class);

	private String toString;

	/**
	 * @param intValue
	 */
	public ConstructorServiceImpl(int intValue) {
		logger.debug("instanciando constructor(int): {}", intValue);
		this.toString = "intBean";
	}

	/**
	 * @param stringValue
	 */
	public ConstructorServiceImpl(String stringValue) {
		logger.debug("instanciando constructor(String): {}", stringValue);
		this.toString = String.format("stringBean");
	}

	/**
	 * @param stringValue
	 */
	public ConstructorServiceImpl(String stringValue, String stringValue2) {
		logger.debug("instanciando constructor(String,String): {},{}", stringValue, stringValue2);
		this.toString = String.format("stringStringBean:%s,%s", stringValue, stringValue2);
	}

	/**
	 * @param intValue
	 * @param stringValue
	 */
	public ConstructorServiceImpl(int intValue, String stringValue) {

		logger.debug("instanciando constructor(int,String): {},{}", intValue, stringValue);
		this.toString = String.format("intStringBean:%d,%s", intValue, stringValue);
	}

	/**
	 * @param stringValue
	 * @param intValue
	 */
	public ConstructorServiceImpl(String stringValue, int intValue) {
		logger.debug("instanciando constructor(String,int): {},{}", stringValue, intValue);
		this.toString = String.format("stringIntBean:%s,%d", stringValue, intValue);
	}

	public ConstructorServiceImpl(Integer intValue, String stringValue, GenericDAO genericDAO) {
		logger.debug("instanciando constructor(int,String,DAO): {},{},{}", intValue, stringValue,
				genericDAO);
		this.toString = "intStringDaoBean";

	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return toString;
	}

}
