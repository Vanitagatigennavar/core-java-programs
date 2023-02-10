package com.xworkz.Numberpalindrome;

public class NumberPalindrome6 {

	public static void main(String[] args) {
		int num=989;
		int reverse=0;
		int remainder;
		int OriginalNum=num;
		
		while(num!=0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num/=10;
		}
		if(OriginalNum==reverse) {
			System.out.println(OriginalNum+":::palindrome");
		}
		else {
			System.out.println(OriginalNum+":::not plaindrome");
		}
	}

}
