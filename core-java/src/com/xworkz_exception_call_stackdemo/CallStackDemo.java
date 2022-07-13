package com.xworkz_exception_call_stackdemo;

public class CallStackDemo {

	public static void main(String[] args) {
		try {
			int result=computeDivision(4,2);
			System.out.println("result of division:"+result);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	static int divide(int a,int b) {
    return a/b;
    }
	static int computeDivision(int a,int b) {
		return divide(a,b);
		}
	}
