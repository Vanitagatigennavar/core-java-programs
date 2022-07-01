package com.xworkz.object_class_method.finalizemethod.biriyani;

public class FinalizeTest {

	public static void main(String[] args) {
      Biriyani b =new Biriyani(10.00,"sahana");
       b=null;
       System.gc();
      
      System.out.println(b);
	}

}
