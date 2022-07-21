package com.xworkz_dao_dto_test_Dao_employee.xworkz_dao_dto_test;

public class DTO_employee {
	
	private String name;
	private int id;
	
	public DTO_employee() {
		super();
	}

	public DTO_employee(String name,int id) {
		this .name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DTO_employee [name=" + name + ", id=" + id + "]";
	}

}
