package com.xworkz.DAO;

import java.net.URL;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.DTO.PoliticianDTO;
import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

import static com.xworkz.constants.DBProperties.*;

public class PoliticianDAOImpl implements PoliticianDAO {

	@Override
	public boolean save(PoliticianDTO politiciandto) {
		try { 
		Connection connection=DriverManager.getConnection(URL.getvalue()
				,USERNAME.getvalue(),SECRET.getvalue());
	String quary="insert into politician.politician_info values(?,?,?,?,?,?,?,?,?)";
	PreparedStatement statement =connection.prepareStatement(quary);
    statement.setInt(1,politiciandto.getId() );
    statement.setString(2,politiciandto.getPartyName().getPartyName());
	statement.setString(3, politiciandto.getPresident());
	statement.setDouble(4,politiciandto.getTotalMembers());
    statement.setString(5,politiciandto.getPartySymbol().getPartySymbol());
	statement.setString(6,politiciandto.getPartylocation());
    statement.setString(7,politiciandto.getPartycolour() );
	statement.setString(8, politiciandto.getPartystate());
	statement.setDouble(9,politiciandto.getPartybudget());
			
			int rowsAffected=statement.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("data saved:"+rowsAffected);
				return true;
			}else {
				System.out.println("data not saved");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		
			
		}
		return false;
	}

	@Override
	public PoliticianDTO findById(int id) {
		try {
			Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select*from politician.politician_info where id=?";
			PreparedStatement statement=connection.prepareStatement(quary);
			statement.setInt(1, id);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				Integer id1=rs.getInt(1);
//				String name=rs.getString(2);
				String partyname=rs.getString(2);
				String president=rs.getString(3);
				double tm=rs.getDouble(4);
				String psymbol=rs.getString(5);
				String pc=rs.getString(6);
				String pl=rs.getString(7);
				String pstate=rs.getString(8);
				double pb=rs.getDouble(9);
				System.out.println(id1+" "+partyname);
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(partyname));
			    pdto.setPresident(president);
				pdto.setTotalMembers(tm);
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartySymbol(PartySymbol.getbyvalue(psymbol));
                pdto.setPartystate(pstate);
				pdto.setPartybudget(pb);
				return pdto;
		
			}
			
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresident(int id, String president) {
		try {
			Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select*from politician.politician_info where id=? And President=?";
			PreparedStatement statement=connection.prepareStatement(quary);
			statement.setInt(1, id);
			statement.setString(2, president);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				Integer id1=rs.getInt(1);
				String partyname=rs.getString(2);
				String president1=rs.getString(3);
				double totalmembers=rs.getDouble(4);
				String partsymbol=rs.getString(5);
				String pc=rs.getString(6);
				String pl=rs.getString(7);
				
				String ps1=rs.getString(8);
				double pb=rs.getDouble(9);
				System.out.println(id1+" "+partyname);
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(partyname));
			    pdto.setPresident(president1);
				pdto.setTotalMembers(totalmembers);
				pdto.setPartySymbol(PartySymbol.getbyvalue(partsymbol));
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartystate(ps1);
				pdto.setPartybudget(pb);
				return pdto;
		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresidentAndName(int id, String president, String name) 
	{
		try {
		Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select*from politician.politician_info where id=? And President=? And Name=?";
			PreparedStatement statement=connection.prepareStatement(quary);
			statement.setInt(1, id);
			statement.setString(2, president);
			statement.setString(3, name);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				Integer id1=rs.getInt(1);
				String partyname1=rs.getString(2);
				String president1=rs.getString(3);
				double tm=rs.getDouble(4);
				String partysymbol=rs.getString(5);
				String pc=rs.getString(6);
				String pl=rs.getString(7);
				String ps1=rs.getString(8);
				double pb=rs.getDouble(9);
				System.out.println(id1+" "+partyname1);
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(partyname1));
			    pdto.setPresident(president1);
				pdto.setTotalMembers(tm);
				pdto.setPartySymbol(PartySymbol.getbyvalue(partysymbol));				
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartystate(ps1);
				pdto.setPartybudget(pb);
				return pdto;
				}
			
			
			} catch (Exception e) {
		e.printStackTrace();
		}

		return null;
	}

	@Override
	public PoliticianDTO findByIdAndName(int id, String name) {
		try {
			
			Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select*from politician.politician_info where id=? And Name=?";
			PreparedStatement statement=connection.prepareStatement(quary);
			statement.setInt(1, id);
			statement.setString(2, name);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				Integer id1=rs.getInt(1);
				String name1=rs.getString(2);
				String president=rs.getString(3);
				double tm=rs.getDouble(4);
				String ps=rs.getString(5);
				String pc=rs.getString(6);
				String pl=rs.getString(7);
				String pstate=rs.getString(8);
				double pb=rs.getDouble(9);
				System.out.println(id1+" "+name1+" ");
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(name1));
			    pdto.setPresident(president);
				pdto.setTotalMembers(tm);
				pdto.setPartySymbol(PartySymbol.getbyvalue(ps));	
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartystate(pstate);
				pdto.setPartybudget(pb);
				return pdto;
		
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return null;
			
		}
			
	@Override
	public  String findNamebyId(int id) {
		try (Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());)
		{
			String quary="select Name from politician.politician_info where "+" id ="+id;
			Statement statement =connection.createStatement();
//			PreparedStatement statement=connection.prepareStatement(quary);
//			statement.setInt(1,id);
			ResultSet rs = statement.executeQuery(quary);
// pending
			while (rs.next()) {
				String name=rs.getString(1);
//				System.out.println(name);
//				PoliticianDTO pdto=new PoliticianDTO();
//				pdto.setPartyName(PartyName.getvalue(name));
				return name;
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findPresidentByIdAndName( int id, String name) {
		try {
			Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select President from politician.politician_info where "+" id ="+id +"Name ="+ name;
			Statement statement =connection.createStatement();
//			PreparedStatement statement=connection.prepareStatement(quary);
//			statement.setInt(1, id);
//			statement.setString(2, "Name");                             PENDING
			ResultSet rs=statement.executeQuery(quary);
			while(rs.next()) {
//				Integer id1=rs.getInt(1);
				String Name=rs.getString(2);
				return Name;
				}
		} catch (Exception e) {
           e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
     try {
    	 Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select*from politician.politician_info";
			PreparedStatement statement=connection.prepareStatement(quary);
//			statement.setInt(1, 1);
			ResultSet rs=statement.executeQuery();
			AtomicInteger auto=new AtomicInteger();
			while(rs.next()) {
//				Integer id=rs.getInt(getTotal());
				auto.incrementAndGet();
			}
			System.out.println(auto);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return 0;
	}

	@Override
	public PoliticianDTO findPartyByMaxMembers() 
	{
		try {
			Connection connection=DriverManager.getConnection(URL.getvalue()
					,USERNAME.getvalue(),SECRET.getvalue());
			String quary="select max(TotalMembers) as maximumnumbers from politician.politician_info";
			PreparedStatement statement=connection.prepareStatement(quary);
//			statement.setInt(1, 1);
			ResultSet rs=statement.executeQuery();
			while (rs.next()) {
				Integer id1=rs.getInt(1);
				String name1=rs.getString(1);
				String president=rs.getString(1);
				double tm=rs.getDouble(1);
				String ps=rs.getString(1);
				String pc=rs.getString(1);
				String pl=rs.getString(1);
				String pstate=rs.getString(1);
				double pb=rs.getDouble(1);
				System.out.println(id1+" "+name1+" ");
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(name1));
			    pdto.setPresident(president);
				pdto.setTotalMembers(tm);
				pdto.setPartySymbol(PartySymbol.getbyvalue(ps));	
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartystate(pstate);
				pdto.setPartybudget(pb);
       			return pdto;
			    
			}
		}
		catch (SQLException e) 
		{
		e.printStackTrace();
		}
		return null;
	}
	
	@Override

	     public List<PoliticianDTO>findAll(){
		try {
			Connection connection =DriverManager.getConnection(URL.getvalue(),USERNAME.getvalue(),SECRET.getvalue());
			String sql="select*from politician.politician_info";
			PreparedStatement statement=connection.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			List<PoliticianDTO>dtos=new ArrayList<PoliticianDTO>();
			while(rs.next()) {
				Integer id1=rs.getInt(1);
				String name1=rs.getString(2);
				String president=rs.getString(3);
				double tm=rs.getDouble(4);
				String ps=rs.getString(5);
				String pc=rs.getString(6);
				String pl=rs.getString(7);
				String pstate=rs.getString(8);
				double pb=rs.getDouble(9);
				System.out.println(id1+" "+name1+" ");
				
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				pdto.setPartyName(PartyName.getvalue(name1));
			    pdto.setPresident(president);
				pdto.setTotalMembers(tm);
				pdto.setPartySymbol(PartySymbol.getbyvalue(ps));	
				pdto.setPartycolour(pc);
				pdto.setPartylocation(pl);
				pdto.setPartystate(pstate);
				pdto.setPartybudget(pb);
       			dtos.add(pdto);
				
			}
			System.out.println("Total politician found"+dtos.size());
			return dtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PoliticianDAO.super.findAll();
	}
	
	

}


































