package com.xworkz.array.array_as_DAO;
import com.xworkz.array.array_as_DTO.StudentDTO;
public interface StudentDAO
{
    void addStudent(StudentDTO dto);
	StudentDTO getStudentDTO(long phNo);
	void updateStudent(StudentDTO dto);
	public void deleteName(String name);
}
