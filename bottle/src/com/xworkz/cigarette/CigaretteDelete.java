package com.xworkz.cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		String deleteSQL="delete from cigarette.company_cigarette where company_name='british'";
		Statement statement=connection.createStatement();
	     int affected=statement.executeUpdate(deleteSQL);
	     System.out.println("affected:"+affected);
	       

	}

}
