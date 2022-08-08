package com.xworkz.constants;

public enum DBproperties {
	
	 URL("jdbc:mysql://Localhost:3306/politician"),
		USERNAME("root"),
		SECRET("@Vanita123");
		
		private String value;
		  private DBproperties(String value) {
			  this.value=value;
		  }
		  
		  public String getvalue() {
			  return value;
		  }
	
}
     

