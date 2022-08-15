package com.xworkz.computer.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import com.xworkz.computer.dao.ComputerDAO;
import com.xworkz.computer.dao.ComputerDAOImpl;
import com.xworkz.computer.dto.ComputerEntity;
public class ComputerRunner {

	public static void main(String[] args) {
//		ComputerEntity entity=new ComputerEntity();
//		entity.setId(1);
//		entity.setName("hp");
//		entity.setLocation("dharwad");
//		entity.setCompanyName("hp");
//		entity.setPersonName("vanita");
//		entity.setCratedDate(LocalDate.of(2022,12,3));
//		entity.setUpdateDate(LocalDate.now());
//		entity.setCreatedTime(LocalTime.NOON);
//		entity.setUpdateTime(LocalTime.now());
//		entity.setPrice(75000D);
//		
		ComputerDAO dao=new ComputerDAOImpl();
//		ComputerEntity entity1=new ComputerEntity(2,"lenovo","Vijaypur","lenovo","Arun",LocalDate.of(2019,12,10),LocalDate.of(2020,7,11),LocalTime.of(8, 0),LocalTime.of(9, 0),45000D);
		
//		dao.save(entity);
//		Boolean save =dao.save(entity1);
//		System.out.println(entity1);
   	
		ComputerEntity entity=dao.findbyid(1);
		System.out.println(entity);
		
		
//		dao.updateownerAndlocation("shree", "kodachadri", 5);
		
		
		
	}

}
