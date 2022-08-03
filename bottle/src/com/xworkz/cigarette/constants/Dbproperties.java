package com.xworkz.cigarette.constants;

public enum Dbproperties {
     URL("jdbc:mysql://Localhost:3306/cigarette"),
     USERNAME("root"),
     SECRET("@Vanita123");

   private String Value;
    Dbproperties(String value){ 
    	this.Value=value;
    	}
    public String getvalue(){
    	return "Value";
    }

}