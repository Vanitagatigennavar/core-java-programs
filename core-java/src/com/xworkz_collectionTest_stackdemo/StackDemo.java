package com.xworkz_collectionTest_stackdemo;

import java.util.Stack;

public class StackDemo {

		StackDemo(){  //creating stack object
			System.out.println("This is the default constructor...");
		}

		public static void main(String[] args) {
			Stack stack=new Stack();//adding elements to stack
			
			stack.push("vanita");
			stack.push("bg");
			stack.push("nayana");
			stack.push("Nadig");
			stack.push("asha");
			stack.push("varsha");
		    stack.push("vasu");
			
			System.out.println(stack);
			stack.pop();//remove element and show preveious element
			System.out.println("the poped element is :"+stack.pop());
			stack.pop();//remove element and show preveious element
			System.out.println("the poped element is :"+stack.pop());
			stack.peek();//remove element and dosent show preveious element
			System.out.println("the peeked element is :"+stack.peek());
			stack.search("vasu");
			System.out.println("the searched element is :"+stack.search("vasu"));
			stack.firstElement();
			System.out.println("the searched element is :"+stack);


	}

}
