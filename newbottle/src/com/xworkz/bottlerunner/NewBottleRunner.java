package com.xworkz.bottlerunner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.bottleDAO.BottleDAO;
import com.xworkz.bottleDAO.BottleDAOImpl;
import com.xworkz.bottleentity.BottleEntity;

public class NewBottleRunner {

	public static void main(String[] args) {
	
//		BottleEntity entity=new BottleEntity();
//		entity.setId(3);
//		entity.setName("mirinda");
//		entity.setLocation("dharwad");
//		entity.setManunufactureTime(LocalTime.of(12,00));
//		entity.setExpiryTime(LocalTime.of(11,00));
//		entity.setBoughtPerson("roopa");
//		entity.setManunufactureDate(LocalDate.now());
//		entity.setExpiryDate(LocalDate.now());
//		entity.setCompanyName("filter");
//		entity.setPrice(20000d);
//		
		BottleDAO dao=new BottleDAOImpl();
//		boolean saved=dao.save(entity);
//		System.out.println(saved);
//	     BottleEntity entity1=dao.findbyId(1);
//         System.out.println(entity1);
		dao.updateboughtPersonAndlocation("pooja", "shivmogga", 3);
		
	}

}
