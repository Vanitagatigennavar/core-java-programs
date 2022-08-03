package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
//		String updateSQL1="update perfume.company_perfume set price=600 where timing=15";
//		String updateSQL2="update perfume.company_perfume set timing=15 where price=600";
//		String updateSQL3="update perfume.company_perfume set fragnance='mix' where id_perfume=7";
//		String updateSQL4="update perfume.company_perfume set price=1200 where timing=24";
//	    String updateSQL5="update perfume.company_perfume set price=600 where timing=15";
//		String updateSQL6="update perfume.company_perfume set id_perfume=20 where timing=15";
//         String updateSQL7 ="update perfume.company_perfume set price=600 where timing=15";
//		String updateSQL8="update perfume.company_perfume set timing=2 where companyname='skinine'";
//		String updateSQL9="update perfume.company_perfume set price=600 where timing=15";
		String updateSQL10="update perfume.company_perfume set fragnance='mix' where id_perfume=7";
		Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(updateSQL10);
	       System.out.println("affected:"+affected);
	       
	}

}
