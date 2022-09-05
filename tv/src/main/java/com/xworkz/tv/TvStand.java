package com.xworkz.tv;

public class TvStand extends Object {

	private String type;

	public TvStand() {
		System.out.println(this.getClass().getSimpleName() + "TvStand Bean is Created");
	}

	public TvStand(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TvStand [type=" + type + "]";
	}

}
