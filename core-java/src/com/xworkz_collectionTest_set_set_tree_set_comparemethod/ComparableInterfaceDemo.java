package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.TreeSet;

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		TreeSet students=new TreeSet();
		ClassStudent vanita=new ClassStudent();
		vanita.setId(19);
		vanita.setCombination("pmcs");
		vanita.setName("vanita");
		
		ClassStudent nayana=new ClassStudent();
		nayana.setName("nayana");
		nayana.setId(15);
		nayana.setCombination("pcm");
		
		ClassStudent arpita=new ClassStudent();
		arpita.setName("arpita");
		arpita.setId(13);
		arpita.setCombination("cbz");
		 
		ClassStudent varsha=new ClassStudent();
		varsha.setName("varsha");
		varsha.setId(12);
		varsha.setCombination("pbc");
		
		ClassStudent navin=new ClassStudent();
		navin.setName("navin");
		navin.setId(16);
		navin.setCombination("pcm");
		
		students.add(navin);
		students.add(varsha);
		students.add(arpita);
		students.add(vanita);
		students.add(nayana);
	    students.add(varsha);
		
		System.out.println(students);
	}

}
