package com.xworkz_collectionTest_Linked_list;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz_collectionTest_arraylist.Book;

public class BookRunner {

	public static void main(String[] args) {

		
	       Book classmate=new Book();
	       classmate.setBrand("classmate");
	       classmate.setNoofpages(100);
	       classmate.setPrice(40.00);
	       
	       Book suleka=new Book();
	       suleka.setBrand("suleka");
	       suleka.setNoofpages(200);
	       suleka.setPrice(50.00);
	       
	       LinkedList <Book> al=new LinkedList<Book>();
	       al.add(classmate);
	       al.add(suleka);
	       
	    	   Iterator<Book> itr= al.iterator();
	           while(itr.hasNext()){
	        	   Book book=itr.next();
	           if(book.getBrand()=="classmate") {
	        	   System.out.println(book);
			
		}
	       
	       
//	       for (int i = 0; i <al.size(); i++) {
//			if(al.get(i).getNoofpages() ==100) {
//				System.out.println(al.get(i));
//				
//	         for (Book book : al) {
//				if(book.getNoofpages()==200) {
//					System.out.println(book);
//				}
				
				//}
	       }
	}
}	
		

