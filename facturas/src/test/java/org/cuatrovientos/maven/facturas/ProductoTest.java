/**
 * 
 */
package org.cuatrovientos.maven.facturas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BegoLo
 *
 */
public class ProductoTest {

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
	public void newProd() {
		Producto nuevo = new Producto("pan",0.50f,1);
		
		assertTrue("Nombre correcto", nuevo.getName().equals("pan"));
	}
	
	@Test
	public void totalPriceTest() {
		Producto nuevo = new Producto("pan",0.50f,2);
		
		assertTrue("Precio correcto", nuevo.totalPrice() == 1f);
	}

	
}
