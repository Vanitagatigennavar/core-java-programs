package com.xworkz_collectionTest_set_set_sorted_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetdemo{
	public static void main(String[] args) {
		
		SortedSet ss=new TreeSet();
		
		ss.add("vanita");
		ss.add("aa");
		ss.add("bb");
		ss.add("bb");
		ss.add("tt");
		ss.add("rr");
		System.out.println(ss);
		System.out.println("first element: "+ss.first());
		System.out.println("last element:"+ss.last());
		System.out.println("headset:"+ss.headSet("rr"));
		System.out.println("taleset:"+ss.tailSet("tt"));
		System.out.println(ss.subSet("aa","tt"));
		System.out.println(ss.comparator());
	}
}
			