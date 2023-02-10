package com.xworkz.Numberpalindrome;

import java.util.Scanner;

public class NumberPalindrome2 {

	public static void main(String[] args) {
		int num = 3553;
		int reversed = 0;
		int remainder;
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;

		}
		if (originalNum == reversed) {
			System.out.println(originalNum + "::palindrome");

		} else {
			System.out.println(originalNum + "::not palindromne");
		}}}
