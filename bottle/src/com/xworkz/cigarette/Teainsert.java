package com.xworkz.cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teainsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
//		String insert=("insert into cigarette.tea values(2,'tiscoon','tiscon');");
//		String update=("update cigarette.tea set idtea=3 where teaname='tiscoon' ");
//		Statement statement=connection.createStatement();
//	     int affected=statement.executeUpdate(update);
//	     System.out.println("affected:"+affected);
	}
	 String select="SELECT * FROM cigarette.tea";
	 Statement statement=connection.createStatement();
	 ResultSet resultset=statement.executeQuery(select);
     System.out.println(resultset);
     
     boolean rowexists=resultset.next();
		System.out.println(rowexists);
		
		if (rowexists==true) {
			int id=resultset.getInt(1);
			System.out.println(id);
			
		}
		else {
			System.out.println("data not found");
		}
			
		}
     
}
