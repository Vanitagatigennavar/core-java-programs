package com.xworkz.array.array_as_DTO_service;
import com.xworkz.array.array_as_DAO.StudentDAOimp;
import com.xworkz.array.array_as_DTO.StudentDTO;
public class StudentServiceimpl implements StudentService {
StudentDAOimp StudentDAO = new StudentDAOimp();
	@Override
	public void addStudent(StudentDTO dto) {
		long number = dto.getPhNo();
		int length = 0;
		int revnum = 0;
		while(number>0) {
			}
		if(dto.getPhNo()==10) {
			StudentDAOimp.addStudent(dto);
		}
		else {
			System.out.println("Invaid Phone number");
		}
	}

	@Override
	public StudentDTO gStudentDTO(long phNo) {
		return StudentDAO.getStudentDTO(phNo);
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentDTO getStudentDTO(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
