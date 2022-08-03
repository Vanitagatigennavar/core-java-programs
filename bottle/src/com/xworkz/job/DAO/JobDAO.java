package com.xworkz.job.DAO;

import com.xworkz.job.DTO.JobDTO;

public interface JobDAO {
	boolean Save();
	JobDTO findbyId();
	JobDTO findbyIDandDesignation();
	JobDTO findIdandDesignationandQualification();
	int gettotal();
	String isFresherById(Integer id);
	Double getMaxpercentage();
	

}
