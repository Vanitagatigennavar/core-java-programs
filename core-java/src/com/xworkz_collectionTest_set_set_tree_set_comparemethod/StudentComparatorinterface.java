package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.TreeSet;

public class StudentComparatorinterface {

	public static void main(String[] args) {
		TreeSet students=new TreeSet();
		StudentComparator vanita=new StudentComparator();
		vanita.setId(19);
		vanita.setCombination("pmcs");
		vanita.setName("vanita");
		
		StudentComparator nayana=new StudentComparator();
		nayana.setName("nayana");
		nayana.setId(15);
		nayana.setCombination("pcm");
		
		StudentComparator arpita=new StudentComparator();
		arpita.setName("arpita");
		arpita.setId(13);
		arpita.setCombination("cbz");
		 
		StudentComparator varsha=new StudentComparator();
		varsha.setName("varsha");
		varsha.setId(12);
		varsha.setCombination("pbc");
		
		StudentComparator navin=new StudentComparator();
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


