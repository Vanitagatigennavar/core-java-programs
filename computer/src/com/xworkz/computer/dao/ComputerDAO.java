package com.xworkz.computer.dao;

import com.xworkz.computer.dto.ComputerEntity;

public interface ComputerDAO {
	public boolean save (ComputerEntity entity);

	ComputerEntity findbyid(int id);
	
	void updateownerAndlocation(String personName,String newlocation,int id);

	

}
