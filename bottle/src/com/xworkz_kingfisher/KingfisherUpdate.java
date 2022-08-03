package com.xworkz_kingfisher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","@Vanita123");
//        String updateSQL1="update kingfisher.company_kf set price=950, where id_kf=45.00";
//		String updateSQL2="update kingfisher.company_kf set companyname='beer' where id_kf=53.00";
//		String updateSQL3="update kingfisher.company_kf set price=1000 where id_kf=55.00";
//		String updateSQL4="update kingfisher.company_kf set id_kf=59.00 where price=1000";
//		String updateSQL5="update kingfisher.company_kf set companyname='wine' where id_kf=45.00";
//		String updateSQL6="update kingfisher.company_kf set varients='cool' where companyname='wine'";
//		String updateSQL7="update kingfisher.company_kf set companyname='kingfisher' where brand='kingfisher'";
//		String updateSQL8="update kingfisher.company_kf set brand='kfisher' where companyname='indiankingfisher'";
//		String updateSQL9="update kingfisher.company_kf set companyname='indiankingfisher' where brand='kfisher'";
		String updateSQL10="update kingfisher.company_kf set companyname='kf' where price=550 ";
	       
         Statement statement=connection.createStatement();
	     int affected=statement.executeUpdate(updateSQL10);
		System.out.println("affected:"+affected);
}
	}


