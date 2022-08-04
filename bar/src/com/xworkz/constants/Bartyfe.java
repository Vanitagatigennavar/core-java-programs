package com.xworkz.constants;

public enum Bartyfe {
    WINESHOP("wine"),
    MSIL("msil"),
    BARANDRESTAURANT("bar and restaurant"),
    RESORT("resort"),
    DEFAULT("restaurant");
	
	private String name;
	private Bartyfe(String name) {
		this.name=name;
	}
    public String getbar() {
    	return name;
    
    }
    public String gettyfe() {
		return name;
	}
	public static Bartyfe getbyvalue(String value) {
		Bartyfe[] bartyfe=Bartyfe.values();
		for(Bartyfe bartyfe2:bartyfe) {
			System.out.println(bartyfe2.name+"comparing");
			if(bartyfe2.name.equals(value)) {
				return bartyfe2;
			}
		}
		return null;
	}
}


