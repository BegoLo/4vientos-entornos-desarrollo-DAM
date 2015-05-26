package org.cuatrovientos.caesar;


/**
 * implements caeser cipher system
 * @author Begoña López
 *
 */
public class CaesarCypher {
	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private int shift;
	public CaesarCypher (int shift) {
		this.shift = shift;
	}
	
	/**
	 * encrypts a String using caesar cipher
	 * @param chain
	 * @return
	 */
	public String encrypter (String chain) {
		String result = "";

		chain = chain.toLowerCase();
		int position = 0;
		
		for (int i=0;i<chain.length();i++) {
			position = alphabet.indexOf(chain.charAt(i));
			position = (position + shift) % 26; 
			result += alphabet.charAt(position);
		}
		
		return result;
	}
	
	/**
	 * decrypts a String using caser cipher
	 * @param chain
	 * @return
	 */
	public String decrypter (String chain) {
		String result = "";
		chain = chain.toLowerCase();
		int position = 0;
		
		for (int i=0;i<chain.length();i++) {
			position = alphabet.indexOf(chain.charAt(i));
			position = (26 + (position - shift)) % 26; 
			result += alphabet.charAt(position);
		}
		
		return result;
	}

}
