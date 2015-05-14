package org.cuatrovientos.greets;
/**
 * 
 */

/**
 * @author Bad Taste
 * greetz in different languages
 */
public class MyGreets {

	/**
	 * Greets 
	 * @param lng chosen language
	 * @param rep how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int lng, int rep) {
		String strRepeat = "";
		String greet = "";
		
		switch (lng) {
			case 0 : greet = "hola";
					 break;
			case 1 : greet = "hello";
					 break;
			case 2 : greet = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<rep;i++) {
			strRepeat += greet;
		}
		
		return strRepeat;
	}
}
