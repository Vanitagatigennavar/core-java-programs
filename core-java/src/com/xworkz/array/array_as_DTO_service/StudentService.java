package com.xworkz.array.array_as_DTO_service;

import com.xworkz.array.array_as_DTO.StudentDTO;

public interface StudentService {
	void addStudent(StudentDTO dto);

	StudentDTO getStudentDTO(long phNo);

	void updateStudent(StudentDTO dto);

	

}
