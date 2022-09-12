package com.xworkz.hotel;

public class Hotel 
{
 private String name;
 private int ratings;
 private String dishesAvail;
public void setName(String name) {
	this.name = name;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}
public void setDishesAvail(String dishesAvail) {
	this.dishesAvail = dishesAvail;
}
@Override
public String toString() {
	return "Hotel [name=" + name + ", ratings=" + ratings + ", dishesAvail=" + dishesAvail + "]";
}
 
}
