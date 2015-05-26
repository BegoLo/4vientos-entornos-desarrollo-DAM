package org.cuatrovientos.caesar;

/**
 * Main class for testing my cipher method
 * @author Julius Caesar
 *
 */
public class caesarMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarCypher cc = new CaesarCypher(3);
		System.out.println(cc.encrypter("avecaesar"));
		System.out.println(cc.decrypter("dyhfdhvdu"));
		
	}

}
