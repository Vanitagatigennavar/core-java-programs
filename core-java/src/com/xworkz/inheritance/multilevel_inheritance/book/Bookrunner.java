package com.xworkz.inheritance.multilevel_inheritance.book;

public class Bookrunner {

	public static void main(String[] args) {
		Book b=new Book();
		Ramayan ramayan=new Ramayan();
		Hinduism h=new Hinduism();
	
		b.Read();
		ramayan.story();
		h.religion();
		}

}
