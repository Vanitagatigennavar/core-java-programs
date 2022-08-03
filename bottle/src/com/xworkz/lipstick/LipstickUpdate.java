package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");

//		String updateSQL1="update lipstick.company_lipstick set brand='pinkystrawberry' where color='red'";
		String updateSQL2="update lipstick.company_lipstick set brand='pinkystrawberry' where color='red'";
//		String updateSQL3="update lipstick.company_lipstick set brand='choco' where color='red'";
//		String updateSQL4="update lipstick.company_lipstick set brand='sugar' where color='red'";
//		String updateSQL5="update lipstick.company_lipstick set brand='pinkystrawberry' where color='red'";
//		String updateSQL6="update lipstick.company_lipstick set brand='creamy' where color='red'";
//		String updateSQL7="update lipstick.company_lipstick set brand='pinkystrawberry' where color='red'";
//		String updateSQL8="update lipstick.company_lipstick set brand='watersalt' where color='red'";
//		String updateSQL9="update lipstick.company_lipstick set brand='sugarsour' where color='red'";
 
		Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(updateSQL2);
	       System.out.println("affected:"+affected);
	       
	}

}
