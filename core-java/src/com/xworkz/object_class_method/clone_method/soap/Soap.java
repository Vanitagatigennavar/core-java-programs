package com.xworkz.object_class_method.clone_method.soap;

public class Soap implements Cloneable
{
	String type;
	String color;
	double price;

	public Soap(String type, String color, double price) {
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public Soap copy() throws CloneNotSupportedException {
		Object obj = super.clone();
		Soap soap = (Soap) obj;
		return soap;
	}

	@Override
	public String toString() {
		return "Soap [type=" + type + ", color=" + color + ", price=" + price + "]";
	}

}
