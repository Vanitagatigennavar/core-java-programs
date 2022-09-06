package com.xworkz.tv;

public class TvSetupBox {
	private String brand;
	private double price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TvSetupBox [brand=" + brand + ", price=" + price + "]";
	}

}
