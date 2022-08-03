package com.xworkz.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		
        String deleteSQL="delete from rolex.company_rolex where id_number=106";
        Statement statement=connection.createStatement();
        int affected =statement.executeUpdate(deleteSQL);
        System.out.println("affected:"+affected);

	}

}
