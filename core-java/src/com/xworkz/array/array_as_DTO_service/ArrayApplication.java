package com.xworkz.array.array_as_DTO_service;

import com.xworkz.array.array_as_DAO.StudentDAO;

import com.xworkz.array.array_as_DAO.StudentDAOimp;
import com.xworkz.array.array_as_DTO.StudentDTO;

public class ArrayApplication {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("123456789", "Darshan", "BTM01", 3698741223L, "70%");
		StudentDTO dto1 = new StudentDTO("12345", "Vanita", "BTM02", 1234567899L, "70%");
		StudentDAO dao = new StudentDAOimp();
		dao.updateStudent(dto);
		System.out.println(dto);
		dao.updateStudent(dto1);
		System.out.println(dto1);
//		dao.getStudentDTO(1);
//		System.out.println(1);
		dao.getStudentDTO(3698741223L);
		System.out.println(3698741223L);

		StudentService ss = new StudentServiceimpl();
		ss.addStudent(dto1);
		System.out.println(dto1);
		StudentDTO student = dao.getStudentDTO(1);
		System.out.println("Student Detail:" + dto);
		System.out.println(student);
	}

}
