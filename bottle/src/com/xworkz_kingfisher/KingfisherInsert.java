package com.xworkz_kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
		System.out.println(connection);
//	String insertSQL="insert into kingfisher.company_kf values (50,'indiankingfisher',250.00,'kf','kingfisherstrong',4.8)";
//		String insertSQL1="insert into kingfisher.company_kf values (51,'indiankingfisher',850.00,'kingfisher','kingfisherultra',5.8)";
//		String insertSQL2="insert into kingfisher.company_kf values (52,'indiankingfisher',750.00,'kfisher','kingfisherlager',6.0)";
//		String insertSQL3="insert into kingfisher.company_kf values (53,'indiankingfisher',450.00,'kingf','kingfisherstorm',5.0)";
//		String insertSQL4="insert into kingfisher.company_kf values (54,'indiankingfisher',550.00,'fisherking','kingfisherdraught',4.8)";
//		String insertSQL5="insert into kingfisher.company_kf values (55,'indiankingfisher',650.00,'kfbeer','kingfisherpremium',6.8)";
//		String insertSQL6="insert into kingfisher.company_kf values (57,'indiankingf',950.00,'kfbeer','lowcool',2.8)";
//		String insertSQL7="insert into kingfisher.company_kf values (58,'indiankingfisher',500.00,'kfbeer','highstrong',6.8)";
//		String insertSQL8="insert into kingfisher.company_kf values (62,'ikingf',600.00,'kingfisherbeer','sweetcool',10.8)";
//		String insertSQL9="insert into kingfisher.company_kf values (66,'ik',700.00,'kingfbeer','coolstrong',9.9)";
		String insertSQL10="insert into kingfisher.company_kf values (69,'ikf',200.00,'kfisherbeer','sourhot',6.7)";
		
		Statement statement=connection.createStatement();
	     int affected=statement.executeUpdate(insertSQL10);
		System.out.println("affected:"+affected);
}

}
