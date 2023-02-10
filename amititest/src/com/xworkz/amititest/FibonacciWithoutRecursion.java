package com.xworkz.amititest;

public class FibonacciWithoutRecursion {
	
//	public static void main(String args[]) {
//		
//		int n1=0,n2=1,n3,i,count=100;
//		System.out.println(n1+" "+n2);//printing n1 and n2 
//		for(i=2;i<count;++i) {
//			System.out.println(" ");
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.println(""+n3);
//		}
//		
//	}
//}
//Fibonacci series with using recursion 
	
	static int n1=0,n2=1,n3=0;
	public static void printFibonacci(int count ) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			printFibonacci(count-1);
		}
	}
	public static void main(String ars[]) {
		int count=20;
		System.out.println(n1+""+n2);
		printFibonacci(count-2);
	}
		
	}
	