package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;

public class Comparatorstring1 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String str;
		String str1;
		
		str=o1;
		str1=o2;
		
//		return 0;
		return str1.compareTo(str);
//		return -str1.compareTo(str);
//		return str.compareTo(str1);
	}

}
