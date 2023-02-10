package com.xworkz.PracticeProgramsBasic;

public class StringPalindrome5 {

	public static void main(String[] args) {
		String name = "rotator";
		String reverse = "";
		int length = name.length();
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = (reverse + name.charAt(i));
		}
		if (name.equals(reverse)) {
			System.out.println("palindrome");
		} else
			System.out.println("not palindrome");
	}

}
