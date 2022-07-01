package com.xworkz.object_class_method.finalizemethod.bottle;

public class Bottle {
	
	String name;
	String color;
	double price;
	String type;
	
	
	Bottle(String name,String color,double price,String type){
		this.name=name;
		this.color=color;
		this.price=price;
		this.type=type;
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
		super.finalize();
	}


	@Override
	public String toString() {
		return "Bottle [name=" + name + ", color=" + color + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	

}
