package com.xworkz.tv;

public class TvRemote extends Object {
	private String type;

	public TvRemote() {
		System.out.println(this.getClass().getSimpleName() + "TvRemote Bean is Created");
	}

	public TvRemote(String type) {
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
		return "TvRemote [type=" + type + "]";
	}

}


