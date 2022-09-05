package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvRunner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(container);
		Tv tv = container.getBean(Tv.class);
		System.out.println(tv);

	}

}
