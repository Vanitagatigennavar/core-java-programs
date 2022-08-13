package com.xworkz.mobileDAO;

import com.xworkz.mobileEntity.MobileEntity;


public interface MobileDAO {
	public boolean save (MobileEntity entity);

	MobileEntity findbyid(int id);
	
	public boolean deleteById(int id);

}
