package com.xworkz.chair.dao;

import com.xworkz.chair.entity.ChairEntity;

public interface ChairDAO {

	public boolean save(ChairEntity entity);

	ChairEntity findbyid(int id);
	
	void updateownerAndlocation(String personName,String newlocation,int id);


}
	

