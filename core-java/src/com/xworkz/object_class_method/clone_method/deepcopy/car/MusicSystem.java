package com.xworkz.object_class_method.clone_method.deepcopy.car;

public class MusicSystem  {
	String brand;
	double price;
        MusicSystem(String brand,double price){
		this. brand = brand;
		this .price=price;
		
	}
	@Override
	public String toString() {
		return "MusicSystem [brand=" + brand + ", price=" + price + "]";
	}
}
