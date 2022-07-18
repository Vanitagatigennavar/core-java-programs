package com.xworkz.array.arraysimpleprogram;

public class ArraycharacterAlphabet {

	public static void main(String[] args) {
		
         char [] arr =new char[26];
         char alphabet='A';
         for(int i=0;i<arr.length;i++) {
        	 arr[i]=alphabet;
        	 alphabet++;
        	 System.out.println(arr[i]);
         }
	}

}
