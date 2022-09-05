package com.xworkz.networks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Users {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean xml file loaded");
		Airtel air = context.getBean("user1", Airtel.class);
		air.activateService();

		Airtel air1 = context.getBean("user2", Airtel.class);
		air1.activateService();

		Airtel air2 = context.getBean("user3", Airtel.class);
		air2.activateService();

	}

}



