package com.xworkz.object_class_method.finalizemethod.biriyani;

public class Biriyani {
	String type;
	double price;
	
	Biriyani(double price, String type){
	this.type=type;
	this.price=price;
}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("i love biriyani");
		super.finalize();
	}

	@Override
	public String toString() {
		return "Biriyani [type=" + type + ", price=" + price + "]";
	}
	
	

	
}
	

	

   
	
	

