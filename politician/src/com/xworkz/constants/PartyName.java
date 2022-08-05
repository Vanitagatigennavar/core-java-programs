package com.xworkz.constants;

public enum PartyName {
	
	BJP("BJP"),
	JDS("JDS"),
	CONGRESS("CONGRESS"),
	AAP("Aam Aadmi Party"),
	TDP("Telugu Desham Party"),
	KJP("KJP"),
	PRKY("PRKY"),
	PDP("PDP"),
	LDP("LDP");
	
	private String partyname;
	
	
	private PartyName(String partyname) {
        this.partyname=partyname;
}
	
	public String  getPartyName() {
		return partyname;
	}
	 public static PartyName getvalue(String value) {
		 PartyName[] partyname=PartyName.values();
		 for (PartyName partyname2:partyname) {
			 if(partyname2.partyname.equals(value)) {
				 return partyname2;
		 }
	 }
		 return null;
	
	}
}