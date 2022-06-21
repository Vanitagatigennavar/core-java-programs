package com.xworkz.encapsulation;

public class DogTest {

	public static void main(String[] args) {
      Dog d=new Dog();
      d.setName("zoozy");
      d.setColour("white");
      d.setPrice(5000);
      d.setAge(5);
	
	System.out.println("name: " + d.getName());
	System.out.println("name: " + d.getColour());
	System.out.println("name: " + d.getPrice());
	System.out.println("name: " + d.getAge());
	
	}
}
