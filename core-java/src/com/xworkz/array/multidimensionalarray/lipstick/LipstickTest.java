package com.xworkz.array.multidimensionalarray.lipstick;

public class LipstickTest {
public static void main(String[] args) {
       Lipstick lipsticks0=new Lipstick("myblame",220);
       Lipstick lipsticks1=new Lipstick("streetwear",100);
       Lipstick lipsticks2=new Lipstick("lakme",200);
       Lipstick lipsticks3=new Lipstick("sugar",600);
       Lipstick lipsticks4=new Lipstick("huda",500);
       
       Lipstick[] Lipsticks= {lipsticks0,lipsticks1,lipsticks2,lipsticks3,lipsticks4};
       for (int i = 0; i < Lipsticks.length; i++) {
    	   System.out.println(Lipsticks[i]);
		}
       }
}
