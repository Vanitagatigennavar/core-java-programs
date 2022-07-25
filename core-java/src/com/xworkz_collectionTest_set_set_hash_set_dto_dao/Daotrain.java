package com.xworkz_collectionTest_set_set_hash_set_dto_dao;

import com.xworkz_collectionTest_set_set_hash_set_dto.DtoTrain;

public interface Daotrain {
	public void save(DtoTrain dto);
	DtoTrain getTrain(String destination );
	public void updateNameByTime(String nameToUpdate,String time);
	public void deleteSourceByTime(String sourceToDelete,String time);
}
