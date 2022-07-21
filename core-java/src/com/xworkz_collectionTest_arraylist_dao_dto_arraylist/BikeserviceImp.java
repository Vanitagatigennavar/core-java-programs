package com.xworkz_collectionTest_arraylist_dao_dto_arraylist;

import com.xworkz_collectionTest_arraylist_dao_dto.Dao_bike;
import com.xworkz_collectionTest_arraylist_dao_dto.Dao_impl;
import com.xworkz_collectionTest_arraylist_dao_dto.Dto;

public class BikeserviceImp implements BikeService {
    Dao_bike bikes=new Dao_impl();

	@Override
	public void addBike(Dto dto) {
		bikes.addBike(dto);
		
	}

	@Override
	public Dto getBike(String companyName) {
		bikes.getBike(companyName);
		return null;
	}

	@Override
	public void updateBike(Dto dto) {
		bikes.updateBike(dto);
		
	}

	@Override
	public void deleteBike(Dto dto) {
		bikes.deleteBike(dto);
		
	}

	@Override
	public String toString() {
		return "BikeserviceImp [bikes=" + bikes + "]";
	}
}