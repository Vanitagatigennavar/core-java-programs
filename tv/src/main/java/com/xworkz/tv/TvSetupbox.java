package com.xworkz.tv;

public class TvSetupbox extends Object{

	private String companyName;

	public TvSetupbox() {
		System.out.println(this.getClass().getSimpleName());
	}

	public TvSetupbox(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "TvSetupbox [companyName=" + companyName + "]";
	}

}
