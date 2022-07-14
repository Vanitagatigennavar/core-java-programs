package com.xworkz_exception_custom_unchecked_product_Flipcart;
public class Product {
	private String productname;
	private double price;
	
	Product(String productname,double price) {
		this.productname=productname;
		this.price=price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", price=" + price + "]";
	}
	
}
