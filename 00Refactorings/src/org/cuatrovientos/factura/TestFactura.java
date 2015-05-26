/**
 * 
 */
package org.cuatrovientos.factura;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BegoLo
 *
 */
public class TestFactura {

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

	/**
	 * Test method for {@link org.cuatrovientos.factura.Factura#ivaReducido()}.
	 */
	@Test
	public void testIvaReducido() {
		Factura target = new Factura(100);
		double expected = 121d;
		target.ivaReducido();
		double actual = target.getTotal();
		assertEquals("Iva reducido", expected, actual, 0.1d);
	}

	/**
	 * Test method for {@link org.cuatrovientos.factura.Factura#iva()}.
	 */
	@Test
	public void testIva() {
		Factura target = new Factura(100);
		double expected = 104d;
		target.iva();
		double actual = target.getTotal();
		assertEquals("Iva", expected, actual, 0.1d);
	}

	/**
	 * Test method for {@link org.cuatrovientos.factura.Factura#descuentoEspecial()}.
	 */
	@Test
	public void testDescuentoEspecial() {
		Factura target = new Factura(100);
		double expected = 90d;
		target.descuentoEspecial();
		double actual = target.getTotal();
		assertEquals("Iva", expected, actual, 0.1d);
	}

}
