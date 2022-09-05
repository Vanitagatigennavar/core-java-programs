package com.xworkz.ball;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BallRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("certify.xml");
		System.out.println(context);
		Ball ball = context.getBean(Ball.class);
		System.out.println(ball);
		System.out.println("===================");
		Integer integer = context.getBean(Integer.class);
		System.out.println("Integer value is:" + integer);
		System.out.println("===================");
		Double double1 = context.getBean(Double.class);
		System.out.println("Double value is:" + double1);
		System.out.println("===================");
		Boolean boolean1 = context.getBean(Boolean.class);
		System.out.println("Boolean value is:" + boolean1);
		System.out.println("===================");
		Float float1 = context.getBean(Float.class);
		System.out.println("Float value is:" + float1);
		System.out.println("===================");
		Character character = context.getBean(Character.class);
		System.out.println("Character value is:" + character);
		System.out.println("===================");
		String string = context.getBean(String.class);
		System.out.println("String value is:" + string);
		System.out.println("===================");
		Short short1 = context.getBean(Short.class);
		System.out.println("Short value is:" + short1);

	}




	}

}
