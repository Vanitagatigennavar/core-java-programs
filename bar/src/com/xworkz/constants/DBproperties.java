package com.xworkz.constants;

public enum DBproperties {
	URL("jdbc:mysql://Localhost:3306/bar"),
    USERNAME("root"),
    SECRET("@Vanita123");

  private String Value;
   DBproperties(String value){ 
   	this.Value=value;
   	}
   public String getvalue(){
   	return "Value";
   }	
}
