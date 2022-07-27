package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;

public class ComparatorInteger2 implements Comparator<Integer> {

	@Override
	public int compare(Integer int1, Integer int2) {
	Integer integer1 =int1;
	Integer integer2=int2;
	
//	return -integer1.compareTo(integer2);//reverse insertion order
	return integer1.compareTo(integer2);// integer in insertin order 
//	return 0;
	}
	}


