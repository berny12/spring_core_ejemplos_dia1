/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.print;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.servicio.PrintService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ConsolePrintServiceImpl implements PrintService {

	private static final Logger logger = LoggerFactory.getLogger(ConsolePrintServiceImpl.class);

	private String messageToPrint;
	
	private int recursoEnviar=0;

	public ConsolePrintServiceImpl() {
		recursoEnviar = (int) (100 * Math.random()); 
	}

	/**
	 * @see com.synergyj.curso.spring.old.inyeccion.metodos.ejemplo7.PrintService#printMessage(java.lang.String)
	 */
	public void printMessage(String message) {
		setMessageToPrint(message);
		logger.debug("Imprimiendo mensaje {} en el recurso {}",message,recursoEnviar);
	}

	/**
	 * @return Regresa messageToPrint.
	 */
	public String getMessageToPrint() {
		return messageToPrint;
	}

	/**
	 * @param messageToPrint messageToPrint a actualizar.
	 */
	public void setMessageToPrint(String messageToPrint) {
		this.messageToPrint = messageToPrint;
	}

}
