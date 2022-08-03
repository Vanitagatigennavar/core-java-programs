package com.xworkz.job.constants;

public enum Designation {
    SOFTWARE ENGINEER("software engineer"),
    ASSOCIATE_SOFTWARE ENGINEER("asso software engineer"),
    FULL_STACK_DEVELOPER("full stack developer"),
    TRAINEE("trainee");
	
	private String name;
	private Job_Designation(String name)
	{
		this.name=name;
	}
	public String getJob() {
		return name;
	}
}
