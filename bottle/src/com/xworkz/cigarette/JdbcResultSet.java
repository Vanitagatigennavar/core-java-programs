package com.xworkz.cigarette;

import static com.xworkz.cigarette.constants.Dbproperties.SECRET;
import static com.xworkz.cigarette.constants.Dbproperties.URL;
import static com.xworkz.cigarette.constants.Dbproperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.cigarette.constants.Dbproperties;

public class JdbcResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(Dbproperties.URL.getvalue(), Dbproperties.USERNAME.getvalue(), Dbproperties.SECRET.getvalue());
		
		System.out.println(connection);

		String select = "SELECT * FROM cigarette.tea;";
		   
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println(resultset);
		
//		fetch single row in a db 
//		boolean rowexists=resultset.next();
//		System.out.println(rowexists);
//		
//		if (rowexists==true) {
//			int id=resultset.getInt(1);
//			System.out.println(id);
//			
//		}
//		else {
//			System.out.println("data not found");
//		}
//			
//		}

//	      using while loop fetch the all data in that table 
		AtomicInteger atomic1 = new AtomicInteger(0);
		while (resultset.next()) {
			atomic1.incrementAndGet();
			int teaid =resultset.getInt(1) ;
			String teaname =resultset.getString(2);
			int companyname =resultset.getInt(3); 
			System.out.println(" " + teaid + " " + teaname + " " + companyname);

		}
  System.out.println(atomic1);
	}

}
