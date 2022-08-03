package com.xworkz.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
//	String insertSQL1="insert into rolex.company_rolex values (101,'rolexchina','blue','oyster',7999,'fancy')";
//	String insertSQL2="insert into rolex.company_rolex values (105,'rolexindia','black','daytona',9999,'rainbow')";
//	String insertSQL3="insert into rolex.company_rolex values (106,'rolexdaytona','white','metalbelt',8888,'metal')";
//	String insertSQL4="insert into rolex.company_rolex values (119,'rolexethos','red','chronograph',7777,'chronographwork')";
//	String insertSQL5="insert into rolex.company_rolex values (108,'rolexoyster','white','oystercosmograph',6666,'cosmograph')";
//	String insertSQL6="insert into rolex.company_rolex values (109,'rolexmoon','blue','dialanalog',5555,'quartzleather')";
//	String insertSQL7="insert into rolex.company_rolex values (111,'rolexgrayindia','pink','oystersteel',3349,'anlog')";
//	String insertSQL8="insert into rolex.company_rolex values (112,'rolexindia','lightblue','raingold',4444,'digital')";
	String insertSQL9="insert into rolex.company_rolex values (122,'skydweller','matte','hulksteel',5557,'leather')";
	Statement statement=connection.createStatement();
	int affected=statement.executeUpdate(insertSQL9);
	
	System.out.println("affected:"+affected);
	

	}

}
