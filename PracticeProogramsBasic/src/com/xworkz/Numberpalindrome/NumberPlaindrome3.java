package com.xworkz.Numberpalindrome;

public class NumberPlaindrome3 {

	public static void main(String[] args) {
		//first we have to declare  variabels
		int num=464;
		int reverse=0;
		int remainder;
		int originalNum=num;
		
		while(num!=0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num/=10;
					
		}
		if(originalNum==reverse) {
			System.out.println(originalNum +":number is palindrome");
		}else {
			System.out.println(originalNum +"::not palondrome");
		}
	}

}
