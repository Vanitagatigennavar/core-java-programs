package com.xworkz.runner;

import com.xworkz.DAO.PoliticianDAO;
import com.xworkz.DAO.PoliticianDAOImpl;
import com.xworkz.DTO.PoliticianDTO;
import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO pdto=new PoliticianDTO(5,PartyName.TDP,"Chandrababu Naydu",500.0D
				,PartySymbol.TDPSYMBOL,"greenred","Vijaywada","Andrapradesh",300000.00D);
//		PoliticianDTO pdto=new PoliticianDTO(6,PartyName.KJP,"B S yadiyurappa",600.0D,
//				PartySymbol.KJPSSYMBOL,"Saffron","Haveri","Karnataka",350000.00D);
		PoliticianDAO pdao=new PoliticianDAOImpl();
//		PoliticianDTO pdto=new PoliticianDTO(7,PartyName.PRKY,"vanita",500.0D
//				,PartySymbol.PRKYSYMBOL,"Red","Bihar","Bihar",320000.00D);
//		PoliticianDTO pdto=new PoliticianDTO(8,PartyName.PDP,"Nayana",600.0D
//				,PartySymbol.PDPSYMBOL,"White","Dispur","Assam",340000.00D);
//		PoliticianDTO pdto=new PoliticianDTO(9,PartyName.LDP,"Prashanth",550.0D
//				,PartySymbol.LDPSYMBOL,"Pink","Odissa","Bhuvaneshwar",360000.00D);
		

		
//		pdao.save(pdto);
		 
//		PoliticianDTO pda1=pdao.findById(5);
//		System.out.println(pda1);
		
//		PoliticianDTO pda2=pdao.findByIdAndPresident(5, "Chandrababu Naydu");
//		System.out.println(pda2);
		
//		PoliticianDTO pda3=pdao.findByIdAndPresidentAndName(6,"B S yadiyurappa","KJP");
//		System.out.println(pda3);
		
//		PoliticianDTO pda4=pdao.findByIdAndName(7, "PRKY");
//		System.out.println(pda4);
        
//		String pda5=pdao.findNamebyId(1);
//		System.out.println(pda5);
		
		String pda6 =pdao.findPresidentByIdAndName(3, "JDS");
		System.out.println(pda6);
		
		
}
}