package com.xworkz.array.array_as_DTO_service;

import com.xworkz.array.array_as_DAO.StudentDAOimp;
import com.xworkz.array.array_as_DTO.StudentDTO;

public class StudentServiceimpl implements StudentService {
	StudentDAOimp StudentDAO = new StudentDAOimp();

	@Override
	public void addStudent(StudentDTO dto) {
		long number=dto.getPhNo();
		int length=0;
		while(number>0) {
			number=number/10;
			length++;
		}
     if(length==10) {
    	 StudentDAO.updateStudent(dto);
     }
     else {
			System.out.println("Invalid Phone number");
		}
	}

	@Override
	public StudentDTO getStudentDTO(long phNo) {
		return StudentDAO.getStudentDTO(phNo);
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		long number=dto.getPhNo();
		int length=0;
		while(number>0) {
			number=number/10;
			length++;
		}
     if(length==10) {
    	 StudentDAO.updateStudent(dto);
     }
     else {
			System.out.println("Invalid Phone number");
		}
	}

}
