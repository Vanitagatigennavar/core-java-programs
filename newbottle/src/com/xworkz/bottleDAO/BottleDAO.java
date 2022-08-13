package com.xworkz.bottleDAO;

import com.xworkz.bottleentity.BottleEntity;

public interface BottleDAO {
	
	public boolean save (BottleEntity entity);
	
	BottleEntity findbyId(int id);
	
	void updateboughtPersonAndlocation(String newboughtperson ,String newlocation,int id);
	
	public boolean deleteById(int id);	
	
}


