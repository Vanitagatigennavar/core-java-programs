package com.xworkz.Numberpalindrome;

public class NumberPalindrome5 {

	public static void main(String[] args) {
		int num=898;
		
		int reverse=0;
		
		int remainder;
		int OriginalNum=num;
		
		while(num!=0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
		num/=0;
			
		}
		if(OriginalNum==reverse) {
			
			System.out.println(OriginalNum+"number plaindrome");
			
			
		}else {
			System.out.println(OriginalNum+"not palindrome");
		}
		
	}

}
