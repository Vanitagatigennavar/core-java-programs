package com.xworkz.umbrella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Umbrella {
 
	private String brand;
	private String color;
	private double price;
	private int noOfStretcher;
	private String usedClothMaterials;
	private Rain rain;
	
	
	@Autowired
   public Umbrella(Rain rain) {
		super();
		this.rain=rain;
	}
@Value("nayana")
	public void setBrand(String brand) {
		this.brand = brand;
	}
@Value("pink")
	public void setColor(String color) {
		this.color = color;
	}
@Value("250")
	public void setPrice(double price) {
		this.price = price;
	}
@Value("9")
	public void setNoOfStretcher(int noOfStretcher) {
		this.noOfStretcher = noOfStretcher;
	}
@Value("Nylon")
	public void setUsedClothMaterials(String usedClothMaterials) {
		this.usedClothMaterials = usedClothMaterials;
	
}

public void setRain(Rain rain) {
	this.rain = rain;
}
	@Override
	public String toString() {
		return "Umbrella [brand=" + brand + ", color=" + color + ", price=" + price + ", noOfStretcher=" + noOfStretcher
				+ ", usedClothMaterials=" + usedClothMaterials + "]";
	}
	
		
	}

