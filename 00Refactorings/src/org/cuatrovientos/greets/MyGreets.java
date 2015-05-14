package org.cuatrovientos.greets;
/**
 * 
 */

/**
 * @author Bego Lopez
 * greets in different languages
 */
public class MyGreets {

	/**
	 * Greets 
	 * @param lenguage chosen language
	 * @param repeat how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet (int lenguage, int repeat) {
		String result = "";
		String currentGreet = "";
		
		switch (lenguage) {
			case 0 : currentGreet = "hola";
					 break;
			case 1 : currentGreet = "hello";
					 break;
			case 2 : currentGreet = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<repeat;i++) {
			result += currentGreet;
		}
		
		return result;
	}
}
