package com.xworkz_collectionTest_arraylist;

import java.util.ArrayList;

public class ArraylistDemoWithTypesafe {

	public static void main(String[] args) {
       Book classmate=new Book();
       classmate.setBrand("classmate");
       classmate.setNoofpages(100);
       classmate.setPrice(40.00);
       
       Book suleka=new Book();
       suleka.setBrand("suleka");
       suleka.setNoofpages(200);
       suleka.setPrice(50.00);
       
       ArrayList <Book> al=new ArrayList<Book>();
       al.add(classmate);
       al.add(suleka);
       for (int i = 0; i <al.size(); i++) {
		if(al.get(i).getNoofpages() ==100) {
			System.out.println(al.get(i));
			
         for (Book book : al) {
			if(book.getNoofpages()==200) {
				System.out.println(book);
			}
			
         }
         
		}
		}
	}}
		
		
	
	


