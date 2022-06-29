package com.xworkz.object_class_method.clone_method.soap;

public class SoapcloneTestMethod {

	public static void main(String[] args) {
      Soap lux=new Soap("lux","white",25.00);
      Soap copyoflux1=null;
      try {
    	  copyoflux1=lux.copy();
		
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
     System.out.println(lux == copyoflux1);
     System.out.println(lux);
     System.out.println(copyoflux1); 
     
	}

}
