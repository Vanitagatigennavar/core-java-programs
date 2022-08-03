package com.xworkz.cigarette;

import java.sql.Connection;
import static com.xworkz.cigarette.constants.Dbproperties.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.cigarette.constants.Dbproperties;

public class CigaretteInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection(Dbproperties.URL.getvalue(),Dbproperties.USERNAME.getvalue(),Dbproperties.SECRET.getvalue());
		  String insertSQL2="insert into cigarette.company_cigarette values(29,'itc','arsenic',15,'small','whitematte');";
//		  String insertSQL3="insert into cigarette.company_cigarette values(14,'philips','nicotin',15,'marlboro','silvergold');";
//		  String insertSQL4="insert into cigarette.company_cigarette values(15,'imperial','ammonia',15,'newport','redsilver');";
//		  String insertSQL5="insert into cigarette.company_cigarette values(16,'indian','acetone',15,'camel','whitematte');";
//		  String insertSQL6="insert into cigarette.company_cigarette values(17,'altria','toluene',15,'pallmallbox','goldwhite');";
//		  String insertSQL7="insert into cigarette.company_cigarette values(18,'swedish','methylamine',15,'maverick','silver');";
//		  String insertSQL8="insert into cigarette.company_cigarette values(19,'japantobacco','tar',15,'santafe','gold');";
//		  String insertSQL9="insert into cigarette.company_cigarette values(20,'british','co2',15,'winston','blue');";
//		  String insertSQL10="insert into cigarette.company_cigarette values(21,'american','nicotin2',15,'kool','green');";
	       Statement statement=connection.createStatement();
	       int affected=statement.executeUpdate(insertSQL2);
	       System.out.println("affected:"+affected);
	        
	      }
	 }



