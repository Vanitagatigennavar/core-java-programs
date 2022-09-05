package com.xworkz.combs.runner;

import java.time.LocalDate;

import com.xworkz.combs.entity.CombEntity;
import com.xworkz.combs.service.CombService;
import com.xworkz.combs.service.CombServiceImpl;

public class Runner {

	public static void main(String[] args) {
		                                 //validate and save
		CombEntity entity=new CombEntity();      
		entity.setId(1);
		entity.setName("Wide tooth combs");
        entity.setPrice(25000D);
        entity.setLocation("Karnataka");
        entity.setNoofcombs(200);
        entity.setMaxCapacity(50000);
        entity.setCreatedBy("Vanita");
        entity.setUpdatedBy("Vannu");
        entity.setCreatedDate(LocalDate.now());
        entity.setUpdatedDate(LocalDate.of(2000,9, 21));
        
        CombEntity entity1=new CombEntity();
		entity.setId(2);
		entity.setName("Rat tail combs");
        entity.setPrice(20000D);
        entity.setLocation("Mumbai");
        entity.setNoofcombs(400);
        entity.setMaxCapacity(40000);
        entity.setCreatedBy("Preeti");
        entity.setUpdatedBy("Keerti");
        entity.setCreatedDate(LocalDate.now());
        entity.setUpdatedDate(LocalDate.of(2001,9, 21));
        
                                             //invalid details because capacity max 50000,
        CombEntity entity2=new CombEntity();
		entity.setId(3);
		entity.setName("Pickcomb");
        entity.setPrice(15000D);
        entity.setLocation("Chennai");
        entity.setNoofcombs(500);
        entity.setMaxCapacity(60000);
        entity.setCreatedBy("Nayana");
        entity.setUpdatedBy("Naveen");
        entity.setCreatedDate(LocalDate.now());
        entity.setUpdatedDate(LocalDate.of(2002,9, 21));
        
        
        
       CombService service=new CombServiceImpl();
       service.validateAndSave(entity2);
	}

}


