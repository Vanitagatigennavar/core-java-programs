package com.xworkz_collectionTest_set_set_hash_set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//underlined datastructure is hashtable
		
		hs.add('S');//it is not index based
		hs.add("vanita");//it is not allowed null vales but allow one single null value
		hs.add('v');//this will not on insertion order stored randomly
        hs.add("null");//doesn't allow duplicates
		hs.add("vanita");
		
		System.out.println(hs);
        System.out.println(hs.remove('v'));//remove v its when its true
        System.out.println(hs);
        System.out.println(hs.add('a'));//add a also added and true 
        System.out.println(hs);
        System.out.println(hs.contains(null));//contains are present so its false
        System.out.println(hs);
        System.out.println(hs.equals('v'));
        System.out.println(hs);
        System.out.println(hs.removeAll(hs));//remove all elements and its true
        System.out.println(hs);
        System.out.println(hs.retainAll(hs));
        System.out.println(hs);
        System.out.println(hs.isEmpty());//because removing values then isempty is true value
        System.out.println(hs.iterator());
        System.out.println(hs.size());//empty so size is 0
        System.out.println(hs.retainAll(hs));
        System.out.println(hs);
        
	}

}
