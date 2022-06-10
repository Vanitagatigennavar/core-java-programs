package com.xworkz.constructor.constructor_chaining;

public class TataMotors extends TataGroups {
	String model;
	String color;
	TataMotors(String chairman) {
		super(chairman);
		System.out.println("constructed TataMotors object");
		this.color="red";
		this.model="nexon";
		} 
	
}
