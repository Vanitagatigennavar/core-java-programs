package com.xworkz_String;
public class StringDemo2 {
public static void main(String[] args) {
          String name="nayana";
          String namen="nayana";
          System.out.println(name==namen);
	
	String name1="shreya";
	String name2="shreya";
    System.out.println(name==name2);
    
    String nayana=new String("vannu");
    String internnayana= nayana.intern();
    System.out.println(nayana==internnayana);
    
    String name4=new String("vasu");
    String name42=name4.intern();
    System.out.println(name4==name42);
    
}}
