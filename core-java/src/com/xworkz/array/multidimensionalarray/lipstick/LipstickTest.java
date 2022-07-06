package com.xworkz.array.multidimensionalarray.lipstick;
public class LipstickTest {
public static void main(String[] args) {
	Lipstick vanita=new Lipstick("vanita",505);
       Lipstick myglame=new Lipstick("myglamme",220);
       Lipstick streetwear=new Lipstick("streetwear",100);
       Lipstick lakme=new Lipstick("lakme",200);
       Lipstick sugar=new Lipstick("sugar",600);
       Lipstick huda=new Lipstick("huda",500);
     Lipstick[] Lipsticks= {myglame,streetwear,lakme,sugar,huda,vanita};
       for (int i = 0; i < Lipsticks.length; i++) {
    	   if(Lipsticks[i].price<=500)
    	    
    	   System.out.println(Lipsticks[i]);
		}
    	   
    	   }
       }

