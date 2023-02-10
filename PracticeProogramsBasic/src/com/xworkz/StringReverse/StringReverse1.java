package com.xworkz.StringReverse;

public class StringReverse1 {

	public static void main(String[] args) {
		String str="chinnu alias bagya from bijapur";
		String[] split = str.split("");//value hold
		for(int i=split.length-1;i>0;i--) {
			System.out.print(split[i]);
		}
	}

}
