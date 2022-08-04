package com.xworkz.job.DTO;

import com.xworkz.job.constants.Qualification;
import com.xworkz.job.constants.Designation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Setter;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JobDTO {
   private  int jon_id; 
   private Designation tyfe = Designation.SOFTWAREDEVELOPER;
	private double packages;
   private Qualification name=Qualification.BE;
   private double percentage;
   private String fresher;

	
}

