package com.xworkz.array.multidimensionalarray.watch;

public class Watch {
	String brand;
	double price;
	String color;
	
	Watch(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	}
