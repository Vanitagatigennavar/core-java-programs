package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
	
//		String insertSQL1="insert into lipstick.company_lipstick values(33,'sugar','indian',200,'choco','red')";
//		String insertSQL2="insert into lipstick.company_lipstick values(44,'myglamm','indian',256,'clipstick','mattered')";
//		String insertSQL3="insert into lipstick.company_lipstick values(55,'maybelline','indian',209,'cherry','blue')";
//		String insertSQL4="insert into lipstick.company_lipstick values(66,'newyark','indian',211,'sweet','purple')";
//		String insertSQL5="insert into lipstick.company_lipstick values(77,'revlon','indian',235,'choco','green')";
//		String insertSQL6="insert into lipstick.company_lipstick values(69,'wild','indian',133,'sugar','black')";
//		String insertSQL7="insert into lipstick.company_lipstick values(99,'wet','indian',799,'kplay','yellow')";
//		String insertSQL8="insert into lipstick.company_lipstick values(23,'lakme','indian',299,'cacao','white')";
		String insertSQL9="insert into lipstick.company_lipstick values(46,'lakme9','indian',289,'choco','red')";
	       Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(insertSQL9);
	       System.out.println("affected:"+affected);
	       
	}

}
