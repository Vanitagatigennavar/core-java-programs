package com.xworkz.array.array_as_DTO_service;
import com.xworkz.array.array_as_DAO.StudentDAO;
import com.xworkz.array.array_as_DAO.StudentDAOimp;
import com.xworkz.array.array_as_DTO.StudentDTO;
public class ArrayApplication {
public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("123456789", "Darshan", "BTM01", 3698741225l, "70%");
		//StudentService service = new StudentServiceImpl();
		StudentDAO dao=new StudentDAOimp();
		dao.updateStudent(dto);
		System.out.println(dto);
		dao.updateStudent(dto);
		System.out.println(dto);
        StudentDTO student = dao.getStudentDTO(1);
		System.out.println("Student Detail:"+dto);
		System.out.println(student);
	}

}
