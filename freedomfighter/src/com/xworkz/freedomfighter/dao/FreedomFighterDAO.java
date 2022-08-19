package com.xworkz.freedomfighter.dao;

import java.util.List;

import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

public interface FreedomFighterDAO {

	boolean save(FreedomFighterEntity entity);

	List<FreedomFighterEntity> findAll();
	
	
	List<FreedomFighterEntity>findAllByAuthor(String author);
	
	List<FreedomFighterEntity>findAllByAuthorAndGender(String author,String gender);
	
	List<String>findAllName();
	
	List<String>findAllCountry();
	
	List<Object>findAllNameAndCountry();
	
	List<Object>findAllNameAndCountryAndAuthor();

}
