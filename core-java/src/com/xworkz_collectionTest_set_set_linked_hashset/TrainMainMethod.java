package com.xworkz_collectionTest_set_set_linked_hashset;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import com.xworkz_collectionTest_set_set_hash_set.TrainHashSet;

public class TrainMainMethod {

	public static void main(String[] args) {
	   
		 TrainLinkedhashset ths=new  TrainLinkedhashset();

		ths.setName("rani chennamma");
		ths.setNoofcompartments(12);
        ths.setNumber(12345);
        ths.setSource("banglore");
        ths.setDestination("dharwad");
        
        TrainLinkedhashset ths1=new TrainLinkedhashset();
        ths1.setName("shatabdi");
        ths1.setNumber(13456);
        ths1.setNoofcompartments(14);
        ths1.setSource("mysore");
        ths1.setDestination("banglore");
        
        TrainLinkedhashset ths2=new TrainLinkedhashset();
        ths2.setName("shatabdi");
        ths2.setNumber(13456);
        ths2.setNoofcompartments(14);
        ths2.setSource("mysore");
        ths2.setDestination("banglore");
	
	     LinkedHashSet lhs=new LinkedHashSet() ;
             lhs.add(ths1);
             lhs.add(ths);
             lhs.add(ths2);
             System.out.println(lhs);
	}

}
