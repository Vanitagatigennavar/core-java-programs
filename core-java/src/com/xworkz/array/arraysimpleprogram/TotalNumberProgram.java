package com.xworkz.array.arraysimpleprogram;

public class TotalNumberProgram {

	public static void main(String[] args) {
		int [] arr =new int[100];
        int num=1;
        for(int i=0;i<arr.length;i++) {
       	 arr[i]=num;
       	 num++;
       	 System.out.println(arr[i]);
        } 

	}

}
