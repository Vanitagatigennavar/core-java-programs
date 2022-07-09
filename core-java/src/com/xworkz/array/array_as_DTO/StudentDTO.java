package com.xworkz.array.array_as_DTO;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private String id;
	private String name;
	private String batchname;
	private long phNo;
	private String percentage;

	public StudentDTO() {
		System.out.println("invoked default constructor");
	}
	public StudentDTO(String id, String name, String batchname, long phNo, String percentage) {

		this.id = id;
		this.name = name;
		this.batchname = batchname;
		this.phNo = phNo;
		this.percentage = percentage;
		System.out.println("invoked parameters constructor");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", batchname=" + batchname + ", phNo=" + phNo
				+ ", percentage=" + percentage + "]";
	}
	
}
