package com.xworkz.job.constants;

public enum Qualification {
    BE("be"),
    BSC("bsc"),
    BA("ba"),
    BCOM("bcom");
	
	 private String name; 
	 private Qualification(String name) {
		 this.name=name;
	 }
	 public String getjob() {
		 return name;
	 }
}
