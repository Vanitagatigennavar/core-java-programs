package com.xworkz_collectionTest_arraylist_dao_dto;

public class DtoBook {
	
	String name;
	double price;
	String colour;
	double noofpages;
	
	public DtoBook(){
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(double noofpages) {
		this.noofpages = noofpages;
	}

	@Override
	public String toString() {
		return "DtoBook [name=" + name + ", price=" + price + ", colour=" + colour + ", noofpages=" + noofpages + "]";
	}

}
