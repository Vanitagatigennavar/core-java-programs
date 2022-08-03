package com.xworkz_kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		
//		String deleteSQL1="delete from kingfisher.company_kf where brand='kf'";
		String deleteSQL2="delete from kingfisher.company_kf where price=250";
		
		Statement statement=connection.createStatement();
		
		int affected=statement.executeUpdate(deleteSQL2);
		
		System.out.println("affected:"+affected);


	}

}
