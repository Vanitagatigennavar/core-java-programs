package com.xworkz.job.runner;

import com.xworkz.job.DAO.JobDAO;
import com.xworkz.job.DAO.JobDAOImpl;
import com.xworkz.job.DTO.JobDTO;
import com.xworkz.job.constants.Designation;
import com.xworkz.job.constants.Qualification;

public class JobRunner {

	public static void main(String[] args) {
		JobDTO jobdto=new JobDTO(11,Designation.SOFTWAREDEVELOPER,50000.00D,Qualification.BSC,80000D,"yes");
		JobDAO jobdao=new JobDAOImpl();
		jobdao.save(jobdto);
	JobDTO	jobdto1=jobdao.findbyId(1);
	System.out.println(jobdto1);

	}

}
