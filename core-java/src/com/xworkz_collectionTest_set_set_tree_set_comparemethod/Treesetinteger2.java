package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.TreeSet;

public class Treesetinteger2 {

	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>(new ComparatorInteger2());
		ts.add(20);
		ts.add(24);
		ts.add(30);
		ts.add(35);
		ts.add(45);
		ts.add(50);
		
		System.out.println("insertion order:"+ts);
		
  
	}

}
