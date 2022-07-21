package com.xworkz_collectionTest_arraylist_dao_dto;

import java.util.ArrayList;

public class Dao_impl implements Dao_bike {
	ArrayList<Dto> bikes = new ArrayList<Dto>();

	@Override
	public void addBike(Dto dto) {
		bikes.add(dto);
		System.out.println("Added Bike is:" + dto);
		
	}
	@Override
	public Dto getBike(String companyName) {
		for(int i = 0; i<bikes.size();i++) {
			if(bikes.get(i).getCompanyName() == companyName) {
				System.out.println("The Bike Details are: " + bikes.get(i));
				return bikes.get(i);
			}
		}
		return null;
	}

	@Override
	public void updateBike(Dto dto) {
		int count = 0;
		for(int i = 0; i<bikes.size();i++) {
		if(bikes.get(i).getCompanyName() == dto.getCompanyName()) {
			count++;
			bikes.get(i).setCompanyName(dto.getCompanyName());
			System.out.println("Updated CompanyName is:" + bikes.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Invalid Search Details Entered");
		}
}

	@Override
	public void deleteBike(Dto dto) {
		
		int count = 0;
		for (int i=0; i< bikes.size(); i++) {
			if( bikes.get(i) != null && bikes.get(i).getCompanyName() == dto.getCompanyName()) {
				bikes.remove(i);
					count++;
				}
		
			}	
		if(count > 0) {
			System.out.println("The Mentioned CompanyName and Model Number Bike is " +dto.getCompanyName() +" " + dto.getModelNo() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("Invalid Input");
		}
		
	}

}