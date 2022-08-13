package com.xworkz.mobilerunner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.mobileDAO.MobileDAO;
import com.xworkz.mobileDAO.MobileDAOImpl;
import com.xworkz.mobileEntity.MobileEntity;

public class MobileRunner {

	public static void main(String[] args) {
//		MobileEntity entity=new MobileEntity();
//		entity.setId(1);
//		entity.setName("oppo");
//		entity.setLocation("dharwad");
//		entity.setCompanyName("oppoandroid");
//		entity.setPersonName("vanita");
//		entity.setCratedDate(LocalDate.of(2022,12,3));
//		entity.setUpdateDate(LocalDate.now());
//		entity.setCreatedTime(LocalTime.NOON);
//		entity.setUpdateTime(LocalTime.now());
//		entity.setPrice(75000D);
//		
//		
//		MobileEntity entity1=new MobileEntity(6,"moto","Vijaypur","MotoAndroid","Arun",LocalDate.of(2019,12,10),LocalDate.of(2020,7,11),LocalTime.of(8, 0),LocalTime.of(9, 0),45000D);
		MobileDAO dao=new MobileDAOImpl();
//		dao.save(entity1);
//		System.out.println(entity1);
//  	Boolean save =dao.save(entity);
		
//		MobileEntity entity=dao.findbyid(4);
//		System.out.println(entity);
		
		boolean entity=dao.deleteById(2);
		System.out.println(entity);

	}

}
