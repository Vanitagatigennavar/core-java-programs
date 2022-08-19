package com.xworkz.cartoon.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.ParentEntity;

public class CartoonRunner {

	public static void main(String[] args) {

//		CartoonEntity entity1 = new CartoonEntity("ChotaBhim", "India", "Male", "RajivChilaka", "animation",
//				LocalDateTime.of(2022, 1, 1, 2, 00), LocalDateTime.of(2016, 2, 3, 1, 00), "Vanita", "Rajani");
//		CartoonEntity entity2 = new CartoonEntity("Dora", "Englend", "Male", "chriss gifford", "animation",
//				LocalDateTime.of(2021, 1, 1, 2, 00), LocalDateTime.of(2022, 2, 3, 1, 00), "Rajani", "Vanita");
//		CartoonEntity entity3 = new CartoonEntity("micky mouse", "Bangladesh", "Male", "walt Disney", "animation",
//				LocalDateTime.of(2009, 1, 1, 2, 00), LocalDateTime.of(2017, 2, 3, 1, 00), "priya", "yoga");
//		CartoonEntity entity4 = new CartoonEntity("pogo", "westindies", "Male", "daan jippes", "animation",
//				LocalDateTime.of(2011, 1, 1, 2, 00), LocalDateTime.of(2018, 2, 3, 1, 00), "sweta", "sushma");
//        	CartoonEntity entity5 = new CartoonEntity("motu", "astralia", "Male", "harvindar", "animation",
//				LocalDateTime.of(2012, 1, 1, 2, 00), LocalDateTime.of(2019, 2, 3, 1, 00), "Shashi", "Vaishnavi");
//		CartoonEntity entity6 = new CartoonEntity("patlu", "UK", "Male", "Mankar", "animation",
//				LocalDateTime.of(2014, 1, 1, 2, 00), LocalDateTime.of(2030, 2, 3, 1, 00), "Shreya", "Shreyas");
//		CartoonEntity entity7 = new CartoonEntity("elsa", "Bulgaria", "female", "chriss buck", "animation",
//				LocalDateTime.of(2024, 1, 1, 2, 00), LocalDateTime.of(2032, 2, 3, 1, 00), "chinnu", "channu");
//		CartoonEntity entity8 = new CartoonEntity("Minnie", "china", "female", "jill", "animation",
//				LocalDateTime.of(2026, 1, 1, 2, 00), LocalDateTime.of(2035, 2, 3, 1, 00), "Bhumika", "Nayana");
//		CartoonEntity entity9 = new CartoonEntity("Arial", "Belgium", "female", "Alfred", "animation",
//				LocalDateTime.of(2030, 1, 1, 2, 00), LocalDateTime.of(2036, 2, 3, 1, 00), "Nayana", "Bhumika");
//		CartoonEntity entity10 = new CartoonEntity("tiana", "japan", "female", "Idina", "animation",
//				LocalDateTime.of(2020, 1, 1, 2, 00), LocalDateTime.of(2040, 2, 3, 1, 00), "Varsha", "vasu");
//		CartoonEntity entity7=new CartoonEntity("Georgia","geogia","male","Laxmi","animation",LocalDateTime.of(2001,5,3,4,00),LocalDateTime.of(2002, 7, 3, 1, 00),"vandana","vaishnavi");
		
		CartoonDAO dao = new CartoonDAOImpl();
		
//		List<CartoonEntity> list = new ArrayList<CartoonEntity>();
//			list.add(entity1);
//			list.add(entity2);
//			list.add(entity3);
//	     	list.add(entity4);
//			list.add(entity5);
//			list.add(entity6);
//			list.add(entity7);
//			list.add(entity8);
//			list.add(entity9);
//			list.add(entity10);
		
//		boolean saved=dao.save(list);
//		System.out.println(saved);
		
//		CartoonEntity save1=dao.findByName("patlu");//execute
//		System.out.println("saved:"+save1);
		
//		Integer save2=dao.total();  //error
//		System.out.println(save2);
		
//		CartoonEntity save3 =dao.findByMaxCreatedDate();//execute
//		System.out.println(save3);

//		CartoonEntity save4	=dao.findByNameAndCountryAndGenderAndAuthor("ChotaBhim","'India'","Male","RajivChilaka");//error
//	    System.out.println(save4);
		
//		String save5=dao.findAuthorByName("Jerry");   //execute
//		System.out.println(save5);
		
//		LocalDate save6 = dao.findCreatedDateByAuthor("Idina");
//	    System.out.println(save6);
		
		Object[] obj = dao.findNameAndCountryByAuthor("Minnie");
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		
//		dao.updateAuthorByName("chetan bhagath", "ChotaBhim");
//          dao.updateTypeByName("UltraLegend", "patlu");//notExecute
//		dao.deleteByName("motu");//execute
		
//		dao.findAll().forEach(System.out::println);//execute
		
	
//		dao.findAllByAuthor("Idina").forEach(System.out::println);//execute
		

		
//		dao.findAllByAuthorAndGender("Idina", "female").forEach(System.out::println);//execute
		
		
		
//		dao.findAllName().forEach(System.out::println);//execute
		
		
//		dao.findAllCountry().forEach(System.out::println);//execute
		

		
//		dao.findAllNameAndCountry().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]));//execute
		
		
//		dao.findAllNameAndCountryAndAuthor().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]+"::"+obj[2]));//execute
}


	}


	


