package com.xworkz.object_class_method.hashcode;

public class Pen 
{
	public int hashcode()
	{
		System.out.println("hash code overriden");
		return 3;
				
	}
	//
	
	public static void main(String[] args) {
		Pen pen=new Pen();
		System.out.println("hash code overriden"+pen.hashcode());
	}

}
