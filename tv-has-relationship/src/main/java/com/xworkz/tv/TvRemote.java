package com.xworkz.tv;

public class TvRemote {
	private String type;
	private int noOfButtons;

	public void setType(String type) {
		this.type = type;
	}

	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}

	@Override
	public String toString() {
		return "TvRemote [type=" + type + ", noOfButtons=" + noOfButtons + "]";
	}

}
