/**
 * 
 */
package org.cuatrovientos.maven.facturas;

import java.util.Vector;


/**
 * @author BegoLo
 *
 */
public class Factura {
	private Vector<Producto> productos;
	
	public Factura() {
		productos = new Vector<Producto>();
	}
	
	public void addProduct (Producto p){
		productos.add(p);
	}
	
	public float totalBill(){
		float total = 0f;
		for (int i = 0; i < productos.size(); i++) {
			total += productos.elementAt(i).totalPrice();
		}
		return total;
	}
	
	public float iva() {
		return totalBill() * 1.21f;
	}
}
