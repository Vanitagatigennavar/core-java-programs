package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		System.out.println(connection);
		String updateSQL2="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL3="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL4="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL5="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL6="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL7="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL8="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL10="update grapes.company_grapes set price=2000 where type='concord'";
		String updateSQL9="update grapes.company_grapes set price=2000 where type='concord'";
		Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(updateSQL);
	       System.out.println("affected:"+affected);
	       
	}

}
