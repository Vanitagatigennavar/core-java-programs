package com.xworkz.runner;
import java.time.LocalDate;
import java.time.LocalTime;
import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
//	ResortEntity entity=new ResortEntity();
//	entity.setId(1);
//	entity.setName("Devbag");
//	entity.setLocation("Banglore");
//	entity.setCheckInTime(LocalTime.of(12,00));
//	entity.setCheckOutTime(LocalTime.of(11,00));
//	entity.setCreatedBy("Vanita");
//	entity.setCreateDate(LocalDate.now());
//	entity.setUpdateDate(LocalDate.now());
//	entity.setOwner("Bhumika");
//	entity.setPrice(20000d);
//	
//	ResortEntity entity1= new ResortEntity();
//	entity1.setId(2);
//	entity1.setName("upavana");
//	entity1.setLocation("Dharwad");
//	entity1.setCheckInTime(LocalTime.of(5,00));
//	entity1.setCheckOutTime(LocalTime.of(4,00));
//	entity1.setCreatedBy("om");
//	entity1.setCreateDate(LocalDate.of(2022,8,26));
//	entity1.setUpdateDate(LocalDate.of(2000,9,21));
//	entity1.setOwner("sudip");
//	entity1.setPrice(5000D);
//	
//	
//	ResortEntity entity3=new ResortEntity();
//	entity3.setId(3);
//	entity3.setName("Pruthvi");
//	entity3.setLocation("Manglore");
//	entity3.setCheckInTime(LocalTime.of(3, 0));
//	entity3.setCheckOutTime(LocalTime.of(2, 0));
//	entity3.setCreatedBy("Vinay");
//	entity3.setCreateDate(LocalDate.of(2011,3,3));
//	entity3.setUpdateDate(LocalDate.of(2022,8,6));
//	entity3.setOwner("Arpita");
//	entity3.setPrice(6000D);
	
//	ResortEntity entity4=new ResortEntity(4,"sai","Hubli",LocalTime.of(3, 0),LocalTime.of(7, 0),"Priya",LocalDate.now(),LocalDate.of(2022,5,6),"Akshara",70000D);
  ResortEntity entity6=new ResortEntity(0,"kabbanpark","sakaleshpur",LocalTime.of(6, 0),LocalTime.of(8, 0),"pooja",LocalDate.now(),LocalDate.of(2022,1,2),"Shravani",25000D);
  
	
	ResortDAO dao=new ResortDAOImpl();
//	Boolean save = dao.save(entity);
//	Boolean save1=dao.save(entity1);
//	Boolean save3=dao.save(entity3);
//	Boolean save4=dao.save(entity4);
	Boolean save5=dao.save(entity6);
	System.out.println("saved:"+entity6);

	}

}
