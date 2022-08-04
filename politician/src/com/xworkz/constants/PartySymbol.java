package com.xworkz.constants;

public enum PartySymbol {
	BJPSYMBOL("LOTUS"),
	JDSSYMBOL("GROSS"),
	CONGRESSSYMBOL("PALM"),
	AAPSYMBOL("BROOM"),
	TDPSYMBOL("CYCLE"),
	KJPSSYMBOL("COCONUT"),
	PRKYSYMBOL("KITE"),
	PDPSYMBOL("PEN"),
	LDPSYMBOL("UMBRELLA");
	
	private String partySymbol;
	
	private PartySymbol(String partySymbol) {
		this.partySymbol=partySymbol;
	}
    public String getPartySymbol() {
    	return partySymbol;
    }
    public static PartySymbol getbyvalue(String value) {
    	PartySymbol[] symbol=PartySymbol.values();
    	for (PartySymbol symbol1:symbol) {
    		if(symbol1.partySymbol.equals(value)) {
    			return symbol1;
    		}
    	}
    	return null;
    }
}
