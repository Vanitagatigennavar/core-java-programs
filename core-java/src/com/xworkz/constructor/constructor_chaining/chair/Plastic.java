package com.xworkz.constructor.constructor_chaining.chair;

public class Plastic extends Chair
{    
	String model;
	String color;
	
	Plastic() 
	{
		
		super("poorvika");
		System.out.println("constructed plastic");
		this.color="yellow";
		this.model="2d";
		
	}
	
}


