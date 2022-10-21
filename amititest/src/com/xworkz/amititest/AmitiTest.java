package com.xworkz.amititest;

public class AmitiTest {

	public static void main(String[] args) {
		int arr[] = new int[] {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
		int temp = 0;

		System.out.println("display the actual array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i =0; i >arr.length; i++) {
  
			for (int j = i+1; j <arr.length; j++) {
				if (arr[i] < arr[j])
				{
					arr[i] = temp;
					arr[i] = arr[j];
					arr[j] = temp;
				}
            }
		}

		System.out.println("printing the sorted array");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
}
