package com.xworkz_String;

public class StringDemo 
{
    public static void main(String[] args) 
	{
       String name="shankar";//literal
       String name1="shankar";
       System.out.println(name==name1);
       
       String vanita=new String ("vanita");//new keyword
       String internVanita=vanita.intern();
       System.out.println(vanita==internVanita);
      
       String nayana="vanita";
       System.out.println(internVanita==nayana);
      
       name1="bhoomika";
       System.out.println(name==name1);
      
       String vanita1=new String("vanita");
       String intern1=vanita1.intern();
       System.out.println(intern1==vanita1);
       }
}
