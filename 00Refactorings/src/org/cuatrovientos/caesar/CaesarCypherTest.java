package org.cuatrovientos.caesar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaesarCypherTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * 
	 */
	@Test
	public void testEncrypter() {
		CaesarCypher myCaesar = new CaesarCypher(3);
		String target = myCaesar.encrypter("avecaesar");
		String expected = "dyhfdhvdu";
		assertEquals("",target,expected);
	}

	@Test
	public void testDecrypter() {
		CaesarCypher myCaesar = new CaesarCypher(3);
		String target = myCaesar.decrypter("dyhfdhvdu");
		String expected = "avecaesar";
		assertEquals("",target,expected);
	}

}
