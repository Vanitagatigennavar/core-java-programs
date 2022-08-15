package com.xworkz.wallclock.dao;

import com.xworkz.wallclock.entity.WallClockEntity;

public interface WallClockDAO {
	
	public boolean save(WallClockEntity entity);

	WallClockEntity findbyid(int id);
	
	void updateownerAndlocation(String personName,String newlocation,int id);


}
