package com.xworkz.object_class_method.stringtostring.laptop;

public class Laptop {
	String model;
	String color;
	double price;
	
	Laptop(String model,String color,double price)
	{
		this.model=model;
		this.color=color;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
}
