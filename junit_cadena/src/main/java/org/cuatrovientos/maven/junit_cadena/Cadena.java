/**
 * 
 */
package org.cuatrovientos.maven.junit_cadena;

/**
 * @author BegoLo
 *
 */
public class Cadena {
	private String texto;

	/**
	 * @param texto
	 */
	public Cadena() {
		
	}
	
	public int lenString(String texto){
		return texto.length();
	}
	
	public int vowels(String texto){
		int cont = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++){
			if ((texto.charAt(i)=='a') || (texto.charAt(i)=='e') || (texto.charAt(i)=='i') || (texto.charAt(i)=='o') || (texto.charAt(i)=='u')){
				cont++;
			}
		}
		return cont;
	}
	
	public String stringReverse(String texto){
		String invertido = "";
		for (int i = texto.length()-1; i>=0;i--){
			invertido += texto.charAt(i);
		}
		return invertido;
	}
	
	public int countLetter(String texto, char letra){
		int cont=0;
		for (int i = 0; i < texto.length(); i++){
			if (texto.charAt(i) == letra){
				cont++;
			}
		}
		return cont;
	}
	
}
