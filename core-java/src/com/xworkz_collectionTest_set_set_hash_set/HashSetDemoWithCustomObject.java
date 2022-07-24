package com.xworkz_collectionTest_set_set_hash_set;

import java.util.HashSet;

public class HashSetDemoWithCustomObject {

	public static void main(String[] args) {
		TrainHashSet ths=new  TrainHashSet();
		ths.setName("rani chennamma");
		ths.setNoofcompartments(12);
        ths.setNumber(12345);
        ths.setSource("banglore");
        ths.setDestination("dharwad");
        
        TrainHashSet ths1=new TrainHashSet();
        ths1.setName("shatabdi");
        ths1.setNumber(13456);
        ths1.setNoofcompartments(14);
        ths1.setSource("mysore");
        ths1.setDestination("banglore");
        
        TrainHashSet ths2=new TrainHashSet();
        ths2.setName("shatabdi");
        ths2.setNumber(13456);
        ths2.setNoofcompartments(14);
        ths2.setSource("mysore");
        ths2.setDestination("banglore");
	
	
        HashSet hs=new HashSet();
        hs.add(ths1);
        hs.add(ths);
        hs.add(ths2);
        
        System.out.println(hs);
	}

}
