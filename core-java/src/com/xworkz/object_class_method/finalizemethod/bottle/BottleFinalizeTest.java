package com.xworkz.object_class_method.finalizemethod.bottle;

public class BottleFinalizeTest {

	public static void main(String[] args) {
      Bottle bottle=new Bottle("aquires", "white", 20.00, "juicebottle");
      bottle=null;
      System.gc();
      System.out.println(bottle);
	}

}
