package com.springMvc.shopping;

public class ProductDetails {

	
	public ProductDetails() {
		super();
	}
	private String productName;
	private double price;
	private String color;
	private int quantity;
	private int stock;
	
	
	public ProductDetails(String productName, double price, String color, int quantity,int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.color = color;
		this.quantity = quantity;
		this.stock=stock;
	}
	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", price=" + price + ", color=" + color + ", quantity="
				+ quantity + ", stock=" + stock + "]";
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	 
}
