/**
 * 
 */
package org.cuatrovientos.maven.junit_cadena;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BegoLo
 *
 */
public class CadenaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLenCadena() {
		Cadena myCadena = new Cadena();
		int expected = 4;
		int actual = myCadena.lenString("hola");
		assertEquals("Are equals", expected,actual);
	}
	
	@Test
	public void testVowels() {
		Cadena myCadena = new Cadena();
		int expected = 2;
		int actual = myCadena.vowels("hola");
		assertEquals("Are equals", expected,actual);
		
		int expVoid = 0;
		int actualVoid = myCadena.vowels("");
		assertEquals("Are equals void", expVoid,actualVoid);
	}
	
	@Test
	public void testStringReverse() {
		Cadena myCadena = new Cadena();
		
		String expected = "aloh";
		String actual = myCadena.stringReverse("hola");
		assertEquals("Are equals", expected,actual);
		
		String expVOid = "";
		String actualVoid = myCadena.stringReverse("");
		assertEquals("Are equals void", expVOid,actualVoid);
	}
	
	@Test
	public void testCountLetters() {
		Cadena myCadena = new Cadena();
		int expected = 1;
		int actual = myCadena.countLetter("hola", 'a');
		assertEquals("Are equals", expected,actual);
		
		int expVoid = 0;
		int actualVoid = myCadena.countLetter("", 'a');
		assertEquals("Are equals void", expVoid,actualVoid);
	}
}
