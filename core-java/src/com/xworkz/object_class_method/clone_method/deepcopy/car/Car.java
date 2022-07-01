package com.xworkz.object_class_method.clone_method.deepcopy.car;

public class Car {
	
	String name;
	String color;
	double price;
	
	
	Car(String name,String color,double price){
		this.name=name;
 		this.color=color;
		this.price=price;
	}
	
	public Car copy() throws CloneNotSupportedException{
	Object obj =super.clone();
	Car car =(Car) obj;
	return car;
	}

}
