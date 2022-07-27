package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetusingcomparemethod {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new Comparatorstring1 ());
		ts.add("vanita");
		ts.add("nayanav");
		ts.add("aru");
		ts.add("vinnu");
		ts.add("xworkz");
		ts.add("vv");
		ts.add("abhishek");
//    System.out.println("return str1 to  str string values in alphabeticalorder:"+ts);
//		System.out.println("return 0 when its the top of the string shows:"+ts);
	    System.out.println("return -str1.compareTo(str):"+ts);
//        System.out.println("return str to str1:"+ts);
	}
	

}
