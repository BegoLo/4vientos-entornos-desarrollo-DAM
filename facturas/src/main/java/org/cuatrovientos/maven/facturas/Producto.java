/**
 * 
 */
package org.cuatrovientos.maven.facturas;

/**
 * @author BegoLo
 *
 */
public class Producto {
	
	private String name;
	private Float price;
	private int quantity;
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Producto(String name, Float price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * 
	 * @return
	 */
	public float totalPrice(){
		return price * quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
}
