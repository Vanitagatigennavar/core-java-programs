package com.xworkz.assignmentSwayanDigitalSolutions;

import java.util.*;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbers :::");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();

		int sum = 0;
		int count = 0;
		for (int num : a) {
			if (!isPowerOfTwo(num)) {
				sum += num;
				count++;
			}
		}

		int avg = (int) Math.floor((double) sum / count);
		System.out.println(avg);
	}

	public static boolean isPowerOfTwo(int num) {
		return num != 0 && (num & (num - 1)) == 0;
	}
}
