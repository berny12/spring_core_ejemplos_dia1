/**
 * Copyright (c)  SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.servicio.impl.print;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.servicio.PrintService;
import com.synergyj.cursos.spring.servicio.print.DispatcherService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public abstract class DispatcherServiceImpl implements DispatcherService {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(DispatcherServiceImpl.class);

	/**
	 * Nombre del servicio, inyectado por Spring
	 */
	private String serviceName;

	/**
	 * TODO, Una vez que se haya hecho el refactor del método setPrintService,
	 * quitar o comentar esta declaración ya que no será necesaria. Servicio de
	 * impresion
	 */
	// para usar el injeccion de metodos
	// private PrintService printService;

	/**
	 * Este metodo simula el procesamiento de una peticion. Hace uso de la
	 * inyeccion de metodos para obtener la referencia al servicio que atenderá
	 * la peticion.
	 */
	public void procesaPeticion(String message) {

		// se agregaa para poder crear la inyeccion de metodos y crear el proxie
		PrintService printService = getPrintService();

		logger.info("Imprimiendo firma del servicio a emplear: {}",
				printService);
		printService.printMessage("Procesando mensaje en " + serviceName
				+ " mensaje enviado: " + message);

	}

	/**
	 * @return Regresa serviceName.
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            serviceName a actualizar.
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * TODO Modificar este método para que se pueda realizar la inyección de
	 * métodos. Este metodo será sobrescrito por SPring, empleado para
	 * ejemplificar la inyeccion de metodos proporcionando una copia nueva del
	 * bean PrintService cada vez que se invoque.
	 * 
	 * @return Una instancia PrintService creada por el IoC empleando el
	 *         concepto de inyeccion de metodos. Nota, para que el
	 *         comportamiento sea el adecuado, el bean PrintService, deberá
	 *         estar declarado como prototype ( ver XML).
	 */

	/*
	 * para evitar la inyeccion por medio de metodo set public void
	 * setPrintService(PrintService printService) { this.printService =
	 * printService; }
	 */

	// se agrega para poder utilizar la inyeccion de metodos
	public abstract PrintService getPrintService();
}
