package com.xworkz_collectionTest_set_set_tree_set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetwithStringbuffer {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet(new MyComparator());
//	    ts.add(new StringBuffer("3"));
		ts.add(new StringBuffer("2"));
		ts.add(new StringBuffer("5"));
		ts.add(new StringBuffer("8"));
		ts.add(new StringBuffer("6"));
		ts.add(new StringBuffer("9"));
		
		System.out.println(ts);
	}
	}
