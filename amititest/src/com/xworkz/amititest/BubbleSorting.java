package com.xworkz.amititest;
	import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

	public class BubbleSorting {

		static void bubblesort(int[] arr) {
			int n = arr.length;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (arr[j - 1] > arr[j]) {
						temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;

					}
				}
			}
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			int arr[] = { 12, 36, 64, 66, 74, 48, 5 };
			System.out.println("array before ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
			System.out.println();
			bubblesort(arr);
			System.out.println("array after");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>5)
				System.out.println(arr[i] + " ");
			}
		}

	}


	
		
		
		