package com.xworkz_collectionTest_vectordemo_daodto_flight_dao;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import com.xworkz_collectionTest_arraylist_dao_dto.DtoBook;
import com.xworkz_collectionTest_vectordemo_daodto_flight.Dto_flight;

public class Dao_flightimpl implements Dao_flight {
     Vector<Dto_flight> vector1 =new Vector<Dto_flight>();

	@Override
	public void addflight(Dto_flight dto) {
		vector1.add(dto);
		System.out.println(" added flight is:"+dto);
		
	}

	@Override
	public String toString() {
		return "Dao_flightimpl [vector=" + vector1 + "]";
	}

	@Override
	public void updateflight(Dto_flight dto) {
    
		int count=0;
		Enumeration<Dto_flight>enumeration=vector1.elements();
		while(enumeration.hasMoreElements());
		System.out.println(enumeration.nextElement());
		count++;
	}
	@Override
	public void deleteFlight(Dto_flight dto) {
		int count = 0;
		for (int i=0; i< vector1.size(); i++) {
			if( vector1.get(i) != null && vector1.get(i).getName() == dto.getName()) {
				vector1.remove(i);
					count++;
				}
		
			}	
		if(count > 0) {
			System.out.println("The Mentioned Name flight is " +dto.getName() +" " + dto.getDestination() + " being deleted from the vector" );
		}
		
		else {
			System.out.println("input not found");

	}
	}}
		
	
	
	 
	


