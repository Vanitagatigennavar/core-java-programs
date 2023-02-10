package com.xworkz.PracticeProgramsBasic;

public class StringPalindrome1 {

	public static void main(String[] args) {
		String name="level";
		String reverse="";
		int length=name.length();
		
		for(int i =name.length()-1;i>=0;i--){
			reverse=(reverse+name.charAt(i));
		}
		
		if(name.equals(reverse)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}

}
