package org.cuatrovientos.maven.facturas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacturaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalFactura() {
		Factura myBill = new Factura();
		myBill.addProduct(new Producto("pan",0.5f,1));
		myBill.addProduct(new Producto("leche",1f,2));
		float target = myBill.totalBill();
		float expected = 2.5f;
		
		assertTrue("La factura es correcta", target == expected);
		
	}

	@Test
	public void testAplicarIva() {
		Factura myBill = new Factura();
		myBill.addProduct(new Producto("pan",1f,1));
		myBill.addProduct(new Producto("leche",1f,2));
		float target = myBill.iva();
		float expected = 3.63f;
		
		assertTrue("La factura es correcta", target == expected);
	}
}
