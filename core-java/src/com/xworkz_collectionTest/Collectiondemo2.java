package com.xworkz_collectionTest;

import java.util.ArrayList;

public class Collectiondemo2 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add('A');
	al.add('B');
	al.add('C');
	al.add('D');
	al.add("vanita");
	System.out.println(al);
	
	ArrayList al2=new ArrayList();
	  al2.add("asha");
	  al2.addAll(al);

	  System.out.println(al2);

	  boolean check=al2.contains("asha:");
	  System.out.println("al2 is empty:" +al2.isEmpty());
	  System.out.println("search asha:" +check);
	  al2.remove("asha");
	  al2.retainAll(al);

	}

}
