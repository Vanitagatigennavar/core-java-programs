package com.xworkz.football;

public class Football {

	public String brand;
	public Boolean isAirFilled;
	public Double price;

	public Football() {

		System.out.println(this.getClass().getSimpleName() + " Bean has been Created");

	}

	public Football(String brand) {
		super();
		this.brand = brand;
	}

	public Football(String brand, Boolean isAirFilled) {
		super();
		this.brand = brand;
		this.isAirFilled = isAirFilled;
	}

	public Football(String brand, Boolean isAirFilled, Double price) {
		super();
		this.brand = brand;
		this.isAirFilled = isAirFilled;
		this.price = price;
	}

}