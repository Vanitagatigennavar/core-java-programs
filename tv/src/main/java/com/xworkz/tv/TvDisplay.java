package com.xworkz.tv;

public class TvDisplay extends Object {

	private String type;

	public TvDisplay() {
		System.out.println(this.getClass().getSimpleName() + " Tvdisplay Bean Created");
	}

	public TvDisplay(String type) {
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
		return "TvDisplay [type=" + type + "]";
	}

}


