package com.xworkz.String_methods;

import java.util.stream.IntStream;

public class StringMethod {
public static void main(String[] args) {
		String name=new String(" varsha");
		System.out.println("name:"+name);
		
		String uppercasename=name.toUpperCase();
		System.out.println("uppercasename:"+ uppercasename);
		
		String sirname= " akkkk";
		
		String concatename=name.concat(" vanita");
		String concatename2=sirname.concat(name);
		System.out.println("concatename2:"+  concatename2);
		
		System.out.println("char at in 1 name:"+ name.charAt(6));
		
		System.out.println("repeat the word:"+name.repeat(6));
		
		System.out.println("replace the word:"+name.replace("varsha", "vasu"));
		
		System.out.println("split contains:"+concatename2.split(name,6));
		
		System.out.println("trim word:"+name.trim());
		
		System.out.println("format word:"+name.format(name, concatename2));
		  
	}
}
