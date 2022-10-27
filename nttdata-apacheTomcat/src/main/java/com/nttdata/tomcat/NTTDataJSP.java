package com.nttdata.tomcat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Formacion - Apache Tomcat - JSP - Taller
 * 
 * Primer JSP
 * 
 * @author Jose Munoz Munoz
 *
 */
public class NTTDataJSP {

	
	/**
	 * Constructor privado
	 */
	private NTTDataJSP(){
		
	}
	
	/**
	 * Saludo mediante JSP
	 * @param name nombre
	 * @return String;
	 */
	public static String helloNTTData(String name) {
		
		return "Bienvenid@s al proyecto FP DUAL " + name;
	}
	
}
