package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
//       String insertSQL2="insert into perfume.company_perfume values(2,'skinshine','jasmine',150,'GUESS Eau d',15)";
//       String insertSQL3="insert into perfume.company_perfume values(3,'zaraindia','rolf',950,'carolina',36)";
//       String insertSQL4="insert into perfume.company_perfume values(4,'adivedanatural','orchid',350,'smoke',24)";
//       String insertSQL5="insert into perfume.company_perfume values(5,'blossoms','viktor',50,'bamboo',18)";
//       String insertSQL6="insert into perfume.company_perfume values(6,'varadecor','jo malone',850,'',48)";
//       String insertSQL7="insert into perfume.company_perfume values(7,'f&f','seasalt',450,'axe',20)";
//       String insertSQL8="insert into perfume.company_perfume values(8,'ramsons','maisonfrancies',550,'wildstone',22)";
//       String insertSQL9="insert into perfume.company_perfume values(9,'frangranceindia','jasmine',650,'Mont Blanc',20)";
		 String insertSQL10="insert into perfume.company_perfume values(10,'frangranceindia','jasmine',650,'Mont Blanc',20)";
      
       Statement statement=connection.createStatement();
       int affected=statement.executeUpdate(insertSQL10);
       System.out.println("affected:"+affected);
       

	}

}
