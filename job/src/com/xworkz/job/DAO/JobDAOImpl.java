package com.xworkz.job.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.job.DTO.JobDTO;
import com.xworkz.job.constants.DBproperties;

public class JobDAOImpl implements JobDAO {

	@Override
	public boolean save(JobDTO jobdto) {
		try {
			Connection connection= DriverManager.getConnection("jdbc:mysql://Localhost:3306/","root","@Vanita123");
			String insert ="SELECT * FROM job.job_imfo values(?,?,?,?,?,?);";

			PreparedStatement statement=connection.prepareStatement(insert);
			
			System.out.println(insert);
			statement.setInt(1,jobdto.getJon_id());
			statement.setString(1,jobdto.getTyfe().getjob());
			statement.setDouble(3, jobdto.getPackages());
			statement.setString(4, jobdto.getName().getjob());
			statement.setDouble(5, jobdto.getPercentage());
			statement.setString(6, jobdto.getFresher());
			int rowsaffected=statement.executeUpdate();
			if(rowsaffected>0) {
				System.out.println("data saved:"+rowsaffected);
			}
			else {
				System.out.println("data not saved");
			}
			
			
		} catch (Exception e) {
			   e.printStackTrace();
			
		}
		
		return false;
	}

	@Override
	public JobDTO findbyId(int id) {
		try {
			Connection connection= DriverManager.getConnection(DBproperties.URL.getvalue(),DBproperties.USERNAME.getvalue(),DBproperties.SECRET.getvalue());
			String search ="SELECT * FROM job.job_imfo where jon_id=?";

			PreparedStatement statement=connection.prepareStatement(search);
			System.out.println(search);
			statement.setInt(1, id);
			ResultSet resultset=statement.executeQuery();
			
			while(resultset.next()) {
				int id1=resultset.getInt(1);
				String designation=resultset.getString(2);
				double package1=resultset.getDouble(3);
				String qualification=resultset.getString(4);
				double percentage=resultset.getDouble(5);
				String fresher=resultset.getNString(6);
				
				JobDTO jobdto1=new JobDTO();
				jobdto1.setJon_id(id1);
				jobdto1.setTyfe(null);
				jobdto1.setPackages(package1);
				jobdto1.setName(null);
				jobdto1.setPercentage(percentage);
				jobdto1.setFresher(fresher);
				return jobdto1;
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public JobDTO findbyIdAndDesignation(int id, String designation) {
	
		return null;
	}

	@Override
	public JobDTO findbyIdAndDesignationAndQualification(int id, String designation, String qualification) {
		
		return null;
	}

	@Override
	public int getTotal() {
		
		return 0;
	}

	@Override
	public String isFresherbyId(int id) {
		
		return null;
	}

	@Override
	public Double getmaxPercentage() {
	
		return null;
	}

}
