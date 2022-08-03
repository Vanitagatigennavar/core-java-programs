package com.xworkz.cigarette;

import java.sql.Connection;

import static com.xworkz.cigarette.constants.Dbproperties.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection(URL.getvalue(),USERNAME.getvalue(),SECRET.getvalue());
		System.out.println(connection);
//		String updateSQL1="update cigarette.company_cigarette set colour='gold' where containts='nicotin'";
//		String updateSQL2="update cigarette.company_cigarette set containts='nicotin' where colour='gold'";
//		String updateSQL3="update cigarette.company_cigarette set colour='gold' where containts='nicotin'";
//		String updateSQL4="update cigarette.company_cigarette set price='20' where containts='nicotin'";
//		String updateSQL5="update cigarette.company_cigarette set colour='gold' where containts='nicotin'";
//		String updateSQL6="update cigarette.company_cigarette set company_name='gold' where containts='nicotin'";
		String updateSQL7="update cigarette.company_cigarette set colour='mix' where containts='arsenic'";
//		String updateSQL8="update cigarette.company_cigarette set contains='arsenic' where containts='nicotin'";
//		String updateSQL9="update cigarette.company_cigarette set colour='gold' where brand='small'";
//		String updateSQL10="update cigarette.company_cigarette set colour='silver' where brand='small'";
		Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(updateSQL7);
	       System.out.println("affected:"+affected);
	       
	}

}
