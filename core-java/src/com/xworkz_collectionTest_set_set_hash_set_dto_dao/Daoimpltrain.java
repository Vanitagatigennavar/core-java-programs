package com.xworkz_collectionTest_set_set_hash_set_dto_dao;

import java.util.ArrayList;
import java.util.HashSet;

import com.xworkz_collectionTest_set_set_hash_set_dto.DtoTrain;

public class Daoimpltrain implements Daotrain {
	HashSet<ArrayList>set=new HashSet<ArrayList>();
	ArrayList<DtoTrain>train=new ArrayList<DtoTrain>();
	@Override
	public void save(DtoTrain dto) {
		train.add(dto);
		System.out.println("Train added:"+dto);
		
	}

	@Override
	public DtoTrain getTrain(String destination) {
		for(int i=0;i<train.size();i++) {
			if(train.get(i).getDestination()==destination) {
				return train.get(i);
			}
			}
			return null;
	}

	@Override
	public void updateNameByTime(String nameToUpdate, String time) {
		for(int i=0;i<train.size();i++) {
			DtoTrain dto=train.get(i);
			if(dto.getTime()==time);
			dto.setName(nameToUpdate);
			System.out.println("Updated name :"+train.get(i));
			}

		}
		
	

	@Override
	public void deleteSourceByTime(String sourceToDelete, String time) {
		for(int i=0;i<train.size();i++) {
			DtoTrain dto=train.get(i);
			if(dto.getTime()==time) {
				dto.setSource(sourceToDelete);
				System.out.println("Deleted name :"+ sourceToDelete);
			}
		}

		}
		
}	


