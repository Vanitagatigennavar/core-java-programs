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
		//CartoonEntity entity=new CartoonEntity(1,"ChotaBhim","India","Male","RajivChilaka","animation",LocalDate.now(),LocalDate.of(2000,07,09),"Vanita","vanita");

		CartoonEntity entity1 = new CartoonEntity("ChotaBhim", "India", "Male", "RajivChilaka", "animation",
				LocalDateTime.of(2022, 1, 1, 2, 00), LocalDateTime.of(2016, 2, 3, 1, 00), "Vanita", "Vanita");
		
		CartoonDAO dao = new CartoonDAOImpl();
		
		List<CartoonEntity> list = new ArrayList<CartoonEntity>();
		list.add(entity1);
		boolean b=dao.save(list);
		System.out.println(b);
	}

}
