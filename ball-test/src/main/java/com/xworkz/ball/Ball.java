package com.xworkz.ball;

public class Ball {
	String shape;
	boolean isAirFilled;

	public Ball(String shape) {
		this.shape = shape;
		System.out.println(shape);
	}

	public Ball(String shape, boolean isAirFilled) {
		this.shape = shape;
		this.isAirFilled = isAirFilled;
		System.out.println("Football shape and airfilled:" + shape + " " + isAirFilled);

	}
}
