package com.xworkz.freedomfighter.runner;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighter.dao.FreedomFighterDAO;
import com.xworkz.freedomfighter.dao.FreedomFighterDAOImpl;
import com.xworkz.freedomfighter.entity.FreedomFighterEntity;


public class Runner {

	public static void main(String[] args) {
		FreedomFighterEntity entity = new FreedomFighterEntity("BhagatSingh",LocalDateTime.now(),"Mumbai","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
//		FreedomFighterEntity entity1 = new FreedomFighterEntity(2,"Lal Bhadhur Shastri",LocalDateTime.now(),"Bihar","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
//		FreedomFighterEntity entity2 = new FreedomFighterEntity(3,"Rani-Chanamma",LocalDateTime.now(),"Kittur","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		
		FreedomFighterDAO dao = new FreedomFighterDAOImpl();
		
//		List<FreedomFighterEntity> list = new ArrayList<FreedomFighterEntity>();
//		for (int i = 50; i > 0; i--) {
//			list.add(entity);
//			list.add(entity1);
			Boolean save = dao.save(entity);
		    System.out.println(save);
	}

	}

