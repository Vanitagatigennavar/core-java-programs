package com.xworkz.array.multidimensionalarray;
public class MultiDimensionalArray {
public static void main(String[] args) {
		int arr[] [];
		arr=new int [3][3];
		int num=1;
		for( int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num;
				num++;
			}
		}
		for( int i=0;i<arr.length;i++) {
			for( int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		}
}
