package com.xworkz_exception_exception_handling;
public class ExceptionHandlingdemo2 {
public static void main(String[] args) {
		try { 
			String name="Vanita";
//			int a,b;
			name=null;
//			System.out.println(3/0);
			System.out.println(name.length());
		} catch (ArithmeticException |NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			char a='A';
			int x=6;int y=0;
			try {
				
				System.out.println(a);
				System.out.println(6/0);
			} catch (ArithmeticException|NullPointerException e2) {
				e2.printStackTrace();
			}
			finally {
				System.out.println("finally executed");
		}
	
		}

	}

}
