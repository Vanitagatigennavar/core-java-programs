package com.xworkz.Numberpalindrome;

import java.util.Scanner;

public class NumberPalindrome4 {

	public static void main(String[] args) {
		
		
		int num=768;
		int reverse=0;
		int remainder;
		int OriginalNum=num;
		
		while(num!=0) {
		remainder=num%10;
		reverse=reverse*10+remainder;
		num/=10;}
		
		if(OriginalNum==reverse) {
			System.out.println(OriginalNum+" :::its palindrome");
		}else {
			System.out.println(OriginalNum+":::its not palindrome");
		}
	}

}
