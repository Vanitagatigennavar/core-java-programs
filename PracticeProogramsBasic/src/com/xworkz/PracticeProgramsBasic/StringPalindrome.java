
package com.xworkz.PracticeProgramsBasic;

public class StringPalindrome {

	public static void main(String[] args) {
    String name="gadag";
    String reverse="";
    int length=name.length();
    
    for (int i=name.length()-1;i>=0;i--) {
    reverse= (reverse+name.charAt(i));
    }
    if(name.equals(reverse)) {
    	System.out.println("its palindrome");
    }else {
    	System.out.println("it is not palindrome");
    }

	}

}
