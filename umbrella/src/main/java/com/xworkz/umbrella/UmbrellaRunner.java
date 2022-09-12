package com.xworkz.umbrella;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UmbrellaRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");
		System.out.println("bean created");
		Umbrella umbrella = context.getBean(Umbrella.class);
		System.out.println(umbrella.toString());
		

	}

}
