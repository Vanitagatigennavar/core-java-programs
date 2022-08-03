package com.xworkz.job.DAO;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.job.DTO.JobDTO;

public class JobDAOimpl implements JobDAO {

	@Override
	public boolean Save(JobDTO jobdto) {
		try {
		Connection connection =DriverManager.getConnection(URL.getvalue(),username.getvalue(),secret.getvalue());
		String insert ="insert  job.job_imfo values(?,?,?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(insert);
		System.out.println(insert);
		statement.setInt(1, JobDTO.get.Job_id());
		statement.setString(2, JobDTO.Job_Designation.getJob());
		statement.setdouble(3, JobDTO.getpackages());
		statement.setString(4,JobDTO.getJobqualification());
		statement.setString(5,JobDTO.getpercentage());
		statement.setString(6,JobDTO.getfresher());
		int rowsaffected=statement.executeupdate();
		if(rowsaffected>0) {
			System.out.println("data saved:"+ rowsaffected);
		}
		else {
			System.out.println("data not saved");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false
		
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
