package com.xworkz_dao_dto_test_Dao_employee;

import com.xworkz_dao_dto_test.DTO_employee;

public class Main_employeedemo {

	public static void main(String[] args) {
		DTO_employee dto1=new DTO_employee("vanita",12);
		Employee_dao  dao=new Employee_dao_test ();
		
		dao.save(dto1);
		System.out.println(dto1);
		
	}

}
