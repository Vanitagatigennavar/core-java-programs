package com.xworkz.encapsulation.pen;

public class Fusiontest {

	public static void main(String[] args) 
	{
		Fusion f=new Fusion();
	   f.setName("Fusionmax");
       f.setColour("red");
       f.setModel("max");
       f.setPrice(5);
       f.setNumberofpens(10);
       
       
   	System.out.println("pen :"+f.getName());
   	System.out.println("pen :"+f.getColour());
   	System.out.println("pen :"+f.getModel());
   	System.out.println("pen :"+f.price);
   	System.out.println("pen :"+f.numberofpens);
    
	}

}
