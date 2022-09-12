package com.xworkz.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UmbrellaDAO {
     private String name;
	public UmbrellaDAO(@Value(value = "vanita") String name) {
		System.out.println("Umbrella Dao is created");
	}
	
	
}
