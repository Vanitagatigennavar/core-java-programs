package com.xworkz_collectionTest_arraylist_dao_dto_arraylist;

import com.xworkz_collectionTest_arraylist_dao_dto.Dto;

public interface BikeService {
	void addBike(Dto dto);
	Dto getBike(String companyName);
	void updateBike(Dto dto);
	void deleteBike(Dto dto);
	
}

