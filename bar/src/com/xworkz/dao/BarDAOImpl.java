package com.xworkz.dao;
import com.xworkz.constants.Bartyfe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import static com.xworkz.constants.DBproperties.*;
import com.xworkz.dto.BarDTO;

public class BarDAOImpl implements  BarDAO {

	@Override
	public boolean save(BarDTO bardto) {
		try {
			
			Connection connection= DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRET.getvalue());
				
			System.out.println(connection);
			
			String insert ="insert into bar.bar_info" +" values( "+bardto.getId()+",'"+
			bardto.getName()+"','"+bardto.getLocation()+"','"
					+bardto.getTyfe().getbar()+bardto.getLocation()+"',"
			+bardto.getAvgCollectionPerDay()+","+bardto.getAvgCollectionPerMonth()+")";
		  
			Statement statement =connection.createStatement();
			Integer affected=statement.executeUpdate(insert);
			
			if(affected>0) {
				System.out.println("data found:"+insert);
				return true;
			}
			else {
				System.out.println("Data not found ");
				return false;
			}
			} catch (Exception e) {
		e.printStackTrace();
		}
		return false;
		
	}
}
