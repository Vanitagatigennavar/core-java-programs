package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;

public class ComparatorInteger2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
	Integer integer1 ;
	Integer integer2;
	
	integer1=o1;
	integer2=o2;
	
//		return 0;
//	return integer2.compareTo(integer1);
     return -integer2.compareTo(integer1);	
	}

}
