package com.xworkz.bottlerunner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.bottleDAO.BottleDAO;
import com.xworkz.bottleDAO.BottleDAOImpl;
import com.xworkz.bottleentity.BottleEntity;

public class NewBottleRunner {

	public static void main(String[] args) {
	
		BottleEntity entity=new BottleEntity();
		entity.setId(1);
		entity.setName("tupperwear");
		entity.setLocation("Banglore");
		entity.setManunufactureTime(LocalTime.of(12,00));
		entity.setExpiryTime(LocalTime.of(11,00));
		entity.setBoughtPerson("Vanita");
		entity.setManunufactureDate(LocalDate.now());
		entity.setExpiryDate(LocalDate.now());
		entity.setCompanyName("Aquafina");
		entity.setPrice(20000d);
		
		BottleDAO dao=new BottleDAOImpl();
		boolean saved=dao.save(entity);
		System.out.println(saved);
		

	}

}
