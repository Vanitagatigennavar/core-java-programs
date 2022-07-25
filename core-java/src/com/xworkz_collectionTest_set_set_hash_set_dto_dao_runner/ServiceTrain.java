package com.xworkz_collectionTest_set_set_hash_set_dto_dao_runner;

import com.xworkz_collectionTest_set_set_hash_set_dto.DtoTrain;

public interface ServiceTrain{
	public void save(DtoTrain dto);
	DtoTrain getTrain(String destination );
	public void updateNameByTime(String nameToUpdate,String time);
	public void deleteSourceByTime(String sourceToDelete,String time);
}

	


