package com.xworkz.job.DAO;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.job.DTO.JobDTO;

public class JobDAOimpl implements JobDAO {

	@Override
	public boolean Save() {
		Connection connection =DriverManager.getConnection(URL.getvalue(),username.getvalue(),secret.getvalue());
		String insert ="insert  job.job_imfo values(?,?,?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(insert);
		System.out.println(insert);
		statement.setInt(1, JobDTO.get.Job_id());
		statement.setString(2, JobDTO.Job_Designation.getJob);
		
		
	}

	@Override
	public JobDTO findbyId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDTO findbyIDandDesignation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDTO findIdandDesignationandQualification() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int gettotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String isFresherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMaxpercentage() {
		// TODO Auto-generated method stub
		return null;
	}

}
