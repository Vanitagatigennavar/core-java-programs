package com.xworkz.object_class_method.clone_method.deepcopy.car;

import com.xworkz.object_class_method.clone_method.soap.Soap;

public class CarCloneMethodTest {
	public static void main(String[] args) {
	      Car car=new Car("ferari","red",100000.00);
	      Car copyofferari=null;
	      try {
	    	  copyofferari=copyofferari.copy();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	     System.out.println(car == copyofferari);
	     System.out.println(car);
	     System.out.println(copyofferari); 
	     
}
}