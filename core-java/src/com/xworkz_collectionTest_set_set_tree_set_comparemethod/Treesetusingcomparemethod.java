package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetusingcomparemethod {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new Comparatorstring1 ());
		ts.add("a");
		ts.add("gf");
		ts.add("sir");
		ts.add("utyu");
		ts.add("qia");
		ts.add("4");
		ts.add("abb");
//    System.out.println("return str1 to  str string values in alphabeticalorder:"+ts);
//		System.out.println("return 0 when its the top of the string shows:"+ts);
	    System.out.println("return -str1.compareTo(str):"+ts);
//        System.out.println("return str to str1:"+ts);
	}
	

}
