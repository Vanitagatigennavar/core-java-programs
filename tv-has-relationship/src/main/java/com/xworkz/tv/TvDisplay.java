package com.xworkz.tv;

public class TvDisplay {

	private String type;
	private String madeIn;

	public void setType(String type) {
		this.type = type;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		return "TvDisplay [type=" + type + ", madeIn=" + madeIn + "]";
	}

}
