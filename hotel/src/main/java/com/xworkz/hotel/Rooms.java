package com.xworkz.hotel;

public class Rooms 
{
 private int doorNo;
 private double price;
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Rooms [doorNo=" + doorNo + ", price=" + price + "]";
}
 
}
