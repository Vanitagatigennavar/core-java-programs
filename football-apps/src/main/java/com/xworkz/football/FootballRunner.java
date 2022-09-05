package com.xworkz.football;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FootballRunner {
public static void main(String[] args) {
	//step a container or start the Applicationcontext	
    ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");
    Football demo=context.getBean(Football.class);
    Byte byte1 = context.getBean(Byte.class);
	System.out.println("size of the byte in terms of bit : " + byte1);
	Short short1 = context.getBean(Short.class);
	System.out.println("size of the short in terms of bit : " + short1);
	Integer integer = context.getBean(Integer.class);
	System.out.println("size of the int in terms of bit : " + integer);
	Long long1 = context.getBean(Long.class);
	System.out.println("size of the long in terms of bit : " + long1);
	Float float1 = context.getBean(Float.class);
	System.out.println("size of the float in terms of bit : " + float1);
	Double double1 = context.getBean(Double.class);
	System.out.println("size of the double in terms of bit : " + double1);
	Character character = context.getBean(Character.class);
	System.out.println("char represents single character : " + character);
	Boolean boolean1 = context.getBean(Boolean.class);
	System.out.println("default value of boolean is : " + boolean1);

	System.out.println(demo.brand);
	System.out.println(demo.price);
	System.out.println(demo.isAirFilled);
	}

}
