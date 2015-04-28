/**
 * 
 */
package org.cuatrovientos.ips.junit_generateIps;

import java.util.Random;

/**
 * @author BegoLo
 *
 */
public class GeneradorIp {
	/**
	 * Generate a random number between two numbers
	 * @param min
	 * @param max
	 * @return
	 */
	public int generarNumero (int min, int max){
		Random random = new Random();
		int num = random.nextInt((max - min) + 1) + min;
		return num;
	}
	
	public String generarIp () {
		String cadena="";
		int num1=0;
		int num2=0;
		
		do {
		 num1 = generarNumero(0,255);
		} while (num1 == 0);
		
		cadena += num1 + ".";
		
		for (int i = 0; i < 2; i++) {
			cadena += generarNumero(0,255) + ".";
		}
		
		do {
			 num2 = generarNumero(0,255);
		} while (num2 == 0);
		
		cadena +=num2;
		//System.out.print(cadena);
		return cadena;
	}
	
	
}
