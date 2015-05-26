package org.cuatrovientos.factura;

/**
 * Clase para hacer facturas y aplicar iva
 * @author Bego Lopez
 *
 */
public class Factura {
	private static final double IVA_10 = 0.10d;
	private static final double IVA_4 = 0.04d;
	private static final double IVA_21 = 0.21d;
	private double total;
	private double subtotal;
	
	public Factura (double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}



	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}



	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}



	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}



	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivaReducido () {
		total = subtotal + (subtotal * IVA_21);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {
		total = subtotal + (subtotal * IVA_4);		
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoEspecial () {
		total = subtotal - (subtotal * IVA_10);
	}

}
