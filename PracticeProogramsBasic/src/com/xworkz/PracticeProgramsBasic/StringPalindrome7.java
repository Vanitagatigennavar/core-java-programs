package com.xworkz.PracticeProgramsBasic;

public class StringPalindrome7 {

	public static void main(String[] args) {
		String name="deed";
		String reverse="";
		int length=name.length();
		for(int i=name.length()-1;i>=0;i--) {
			reverse=(reverse+name.charAt(i));
			
		}
		
if(name.equals(reverse)) {
	System.out.println("its a palindrome");
}else {
	System.out.println("not palindrome");
}
	}
}
