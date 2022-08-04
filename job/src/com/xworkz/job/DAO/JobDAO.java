package com.xworkz.job.DAO;

import com.xworkz.job.DTO.JobDTO;

public interface JobDAO {
   boolean save(JobDTO jobdto);
   JobDTO findbyId(int id);
   JobDTO findbyIdAndDesignation(int id,String designation);
   JobDTO findbyIdAndDesignationAndQualification(int id,String designation,String qualification);
   int getTotal();
   String isFresherbyId(int id);
   Double getmaxPercentage();
}
