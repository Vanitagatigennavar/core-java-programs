package com.xworkz.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		String updateSQL1="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL2="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL3="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL4="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL5="update rolex.company_rolex set specialfeature='good' where price=7777 ";
		String updateSQL6="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL7="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL8="update rolex.company_rolex set companyname='kf' where price=550 ";
		String updateSQL9="update rolex.company_rolex set price=550 where companyname='kf' ";
		String updateSQL10="update rolex.company_rolex set companyname='kf' where price=550 ";
	    Statement statement= connection.createStatement();
	    int affected=statement.executeUpdate(updateSQL10);
       System.out.println("affected:"+affected);
	}

}
