package com.xworkz.job.constants;

public enum Jobqualification {
   BE("be"),
   BCA("bca"),
   BTECH("btech"),
   MTECH("mtech");
	
	private String name;
	
	private Jobqualification(String name) {
	this.name=name;
	}
	public String getJob() {
		return name;
	}
}
