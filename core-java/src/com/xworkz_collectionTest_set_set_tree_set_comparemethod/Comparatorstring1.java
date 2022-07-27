package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;

public class Comparatorstring1 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String str1 =o1.toString();
		String str2=o2.toString();
		int l1=str1.length();
		int l2=str2.length();
////		if(l1<l2) {
//			return -1;
//			}
//		else if(l1>l2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
//		
		 return str1.compareTo(str2);// it is decending in alpabetical order
//		 return -str1.compareTo(str2);//it is an descending alphabetical order

		
		}
}
