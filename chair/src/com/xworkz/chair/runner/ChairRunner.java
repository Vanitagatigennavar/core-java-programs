package com.xworkz.chair.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.chair.dao.ChairDAO;
import com.xworkz.chair.dao.ChairDAOImpl;
import com.xworkz.chair.entity.ChairEntity;

public class ChairRunner {

	public static void main(String[] args) {
//		ChairEntity entity=new ChairEntity();
//		entity.setId(1);
//		entity.setName("NILKAMAL");
//		entity.setLocation("dharwad");
//		entity.setCompanyName("NILKAMAL");
//		entity.setPersonName("vanita");
//		entity.setCratedDate(LocalDate.of(2022,12,3));
//		entity.setUpdateDate(LocalDate.now());
//		entity.setCreatedTime(LocalTime.NOON);
//		entity.setUpdateTime(LocalTime.now());
//		entity.setPrice(75000D);
//		
		ChairDAO dao=new ChairDAOImpl();
//		dao.save(entity);
	
		
		ChairEntity entity1=new ChairEntity(2,"FluideLite","Vijaypur","FluideLite","Arun",LocalDate.of(2019,12,10),LocalDate.of(2020,7,11),LocalTime.of(8, 0),LocalTime.of(9, 0),45000D);
		Boolean save1=dao.save(entity1);
		System.out.println("saved:"+entity1);

//		ChairEntity entity2=dao.findbyid(1);
//       System.out.println(entity2);
//        dao.updateownerAndlocation("aditi", "kanakpur",2);
   
		
		
	}


	}


