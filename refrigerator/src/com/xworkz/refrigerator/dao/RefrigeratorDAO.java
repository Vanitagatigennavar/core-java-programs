package com.xworkz.refrigerator.dao;

import com.xworkz.refrigerator.entity.RefrigeratorEntity;

public interface RefrigeratorDAO {
	public boolean save (RefrigeratorEntity entity);

	RefrigeratorEntity findbyid(int id);
	
	void updateownerAndlocation(String personName,String newlocation,int id);

}
