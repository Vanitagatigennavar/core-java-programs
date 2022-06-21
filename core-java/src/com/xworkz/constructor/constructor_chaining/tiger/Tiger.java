package com.xworkz.constructor.constructor_chaining.tiger;

public class Tiger 
{
	String name;
	String color;
	String gender;
	

	Tiger(String name,String clr)
 {
		this.name =name;
		this.color=clr;
		
		System.out.println("Hello tiger had dinner...!");
 }
	Tiger (String name,String clr,String gender)
	{
		this("Rio","orange");
		this.name=name;
		this.gender=gender;
	}
}			
		

			

	
	

