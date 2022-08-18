package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface CartoonDAO {
	
	boolean save(List<CartoonEntity> entities);

}
