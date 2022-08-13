package com.xworkz.resort.dao;

import com.xworkz.resort.entity.ResortEntity;

public interface ResortDAO {
     
	public boolean save (ResortEntity entity);
	
	ResortEntity findbyId(int id);
	
	void updateownerAndlocation(String newowner,String newlocation,int id);
	
	public boolean deleteById(int id);	
	
}
