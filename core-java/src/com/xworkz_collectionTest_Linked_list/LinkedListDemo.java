package com.xworkz_collectionTest_Linked_list;

//import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("bottle");
		ll.add(25);
		ll.add(null);
		ll.add("bottle");
		ll.add("vanita");
		System.out.println(ll);
		
	    ll.addFirst("nayana");
		System.out.println(ll);
		
		
		ll.addLast("bhoomika");
		System.out.println(ll);
		System.out.println(ll.get(5));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.remove("nayana"));
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);	
	}
}
