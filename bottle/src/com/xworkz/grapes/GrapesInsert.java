package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		String insertSQL2="insert into grapes.company_grapes values(2,'purple','concord',100,'mix','varsha');";
//		String insertSQL3="insert into grapes.company_grapes values(3,'pureblack','pinot_noir',1900,'sweet','roopa');";
//		String insertSQL4="insert into grapes.company_grapes values(4,'greenishwhite','lemberger',1700,'sweet&firm','vandana');";
//		String insertSQL5="insert into grapes.company_grapes values(5,'largeblack','sweet_jubilee',1400,'firm','shreya');";
//		String insertSQL6="insert into grapes.company_grapes values(6,'green','valiant',1200,'sugary','shahsi');";
//		String insertSQL7="insert into grapes.company_grapes values(9,'black','champagane',1010,'pleasingcrunch','bhumi');";
//		String insertSQL8="insert into grapes.company_grapes values(4,'red','crimsonseedles',105,'tartness','nayana');";
//		String insertSQL9="insert into grapes.company_grapes values(7,'darkblackpurple','kyoho',1000,'sour','vannu');";
//		String insertSQL10="insert into grapes.company_grapes values(8,'greenishwhite','cottoncandy',500,'cottoncandy','vasu');";
//		
	       Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(insertSQL2);
	       System.out.println("affected:"+affected);
	       

	}

}
