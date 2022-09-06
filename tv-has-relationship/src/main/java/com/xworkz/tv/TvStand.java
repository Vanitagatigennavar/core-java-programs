package com.xworkz.tv;

public class TvStand {
	private String color;
	private int noOfLegs;

	public void setColor(String color) {
		this.color = color;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public String toString() {
		return "TvStand [color=" + color + ", noOfLegs=" + noOfLegs + "]";
	}

}
