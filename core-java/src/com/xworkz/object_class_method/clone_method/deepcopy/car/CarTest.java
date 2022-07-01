package com.xworkz.object_class_method.clone_method.deepcopy.car;

public class CarTest {

	public static void main(String[] args) throws CloneNotSupportedException{
	MusicSystem ms=new MusicSystem("bosh",10000.00);	
    Car ferari=new Car("ferari","red",100000.00);
    Object copyofferari = ferari.copy();
    System.out.println(ferari);
    System.out.println(copyofferari);
    
    copyofferari.brand="bosh";
	}

}
