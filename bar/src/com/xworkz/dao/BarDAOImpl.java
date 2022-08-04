package com.xworkz.dao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.constants.DBproperties.*;
import com.xworkz.dto.BarDTO;

public class BarDAOImpl implements  BarDAO {

	@Override
	public boolean save(BarDTO bardto) {
		try {
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://Localhost:3306/","root","@Vanita123");
			System.out.println(connection);
			
			String insert ="insert into bar.bar_info" +" values( "+bardto.getId()+",'"+
			bardto.getName()+"','"+bardto.getLocation()+"','"
					+bardto.getTyfe().getbar()+bardto.getLocation()+"',"
			+bardto.getAvgCollectionPerDay()+","+bardto.getAvgCollectionPerMonth()+")";
		  
			Statement statement =connection.createStatement();
			Integer affected=statement.executeUpdate(insert);
			
			if(affected>0) {
				System.out.println("data found:"+insert);
				return true;
			}
			else {
				System.out.println("Data not found ");
				return false;
			}
			
			
			
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return false;
	}

	
}
			
			
			try {
				Connection connection= DriverManager.getConnection("jdbc:mysql://Localhost:3306/","root","@Vanita123");
				System.out.println(connection);
				
				PreparedStatement ps =connection.prepareStatement();
				
				BarDTO bardto4=new BarDTO();
				bardto4.setId(null);
				bardto4.setName("name");
				bardto4
				bardto4.setAvgCollectionPerDay(avgCollectionPerDay);
				bardto4.setAvgCollectionPerMonth(avgCollectionPerMonth);
			    return bardto4;
				} catch (Exception e) {
			 e.printStackTrace();	 
				
			}
			return null;
				
	}
	}			
