package com.xworkz.wallclock.runner;

import com.xworkz.wallclock.dao.WallClockDAO;
import com.xworkz.wallclock.dao.WallClockDAOImpl;
public class WallClockRunner {

	public static void main(String[] args) {
//		WallClockEntity entity=new WallClockEntity();
//		entity.setId(1);
//		entity.setName("solimo");
//		entity.setLocation("dharwad");
//		entity.setCompanyName("hp");
//		entity.setBoughtPerson("vanita");
//		entity.setCratedDate(LocalDate.of(2022,12,3));
//		entity.setUpdateDate(LocalDate.now());
//		entity.setCreatedTime(LocalTime.NOON);
//		entity.setUpdateTime(LocalTime.now());
//		entity.setPrice(75000D);
//		
		WallClockDAO dao=new WallClockDAOImpl();
//		dao.save(entity);
	
//		
//		WallClockEntity entity1=new WallClockEntity(2,"titan","Vijaypur","titan","Arun",LocalDate.of(2019,12,10),LocalDate.of(2020,7,11),LocalTime.of(8, 0),LocalTime.of(9, 0),45000D);
//		Boolean save1=dao.save(entity1);
//		System.out.println("saved:"+entity1);

//		WallClockEntity entity2=dao.findbyid(1);
//       System.out.println(entity2);
        dao.updateownerAndlocation("aditi", "kanakpur",2);
   
		
		
	}

}
