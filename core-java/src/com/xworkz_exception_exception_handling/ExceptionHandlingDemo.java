package com.xworkz_exception_exception_handling;
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("main is started");
		try {
		String s= "Xworkz";
     	s=null;
      	System.out.println(s.length());	
      	}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally is executed");	
			}
		System.out.println("main endend");
			
      	}
	}
