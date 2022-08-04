package com.xworkz.job.constants;

public enum Designation {
        SOFTWAREDEVELOPER("softwaredevoloper"),
        TESTENGINEER("testengineer"),
        TRAINEEENGINEER("traineeengineer"),
        NETWORKINGROLE("networkingrole");
        
        private String name;
	private Designation(String name)
	{
		this.name=name;
	}
	public String getjob() {
		return name;
	}
}
