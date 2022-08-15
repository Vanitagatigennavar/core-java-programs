package com.xworkz.refrigerator.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import com.xworkz.refrigerator.dao.RefrigeratorDAO;
import com.xworkz.refrigerator.dao.RefrigeratorDAOImpl;
import com.xworkz.refrigerator.entity.RefrigeratorEntity;

public class RefrigeratorRunner {

	public static void main(String[] args) {
		RefrigeratorEntity entity =new RefrigeratorEntity();
		entity.setId(1);
		entity.setName("LG");
		entity.setLocation("Dharwad");
		entity.setCompanyName("LG");
		entity.setPersonName("vanita");
		entity.setCratedDate(LocalDate.of(2022,12,3));
		entity.setUpdateDate(LocalDate.now());
		entity.setCreatedTime(LocalTime.NOON);
		entity.setUpdateTime(LocalTime.now());
		entity.setPrice(75000D);
		
		RefrigeratorDAO dao=new RefrigeratorDAOImpl();
		dao.save(entity);
	
//		
//		RefrigeratorEntity entity1=new RefrigeratorEntity(2,"videocon","Vijaypur","videocon","Arun",LocalDate.of(2019,12,10),LocalDate.of(2020,7,11),LocalTime.of(8, 0),LocalTime.of(9, 0),45000D);
//		Boolean save1=dao.save(entity1);
		System.out.println("saved:"+entity);

//		WallClockEntity entity2=dao.findbyid(1);
//       System.out.println(entity2);
//        dao.updateownerAndlocation("aditi", "kanakpur",2);
   

	}

}
