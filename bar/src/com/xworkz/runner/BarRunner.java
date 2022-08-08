package com.xworkz.runner;

import com.xworkz.constants.Bartyfe;

import com.xworkz.dao.BarDAO;
import com.xworkz.dao.BarDAOImpl;
import com.xworkz.dto.BarDTO;

public class BarRunner {

	public static void main(String[] args) {
	double avgCollectionPerDay=27000.00;
	double avrCollectionPerMonth=avgCollectionPerDay*3;
	
	BarDTO bardto3 =new BarDTO(28,"vanita","hubli",Bartyfe.WINESHOP,20000d,20000*30D);
		BarDTO bardto1 =new BarDTO();
	bardto1.setId(29);
	bardto1.setName("geeta");
	bardto1.setLocation("udupi");
	bardto1.getTyfe().getbar();
	bardto1.setAvgCollectionPerDay(avgCollectionPerDay);
	bardto1.setAvgCollectionPerMonth(avrCollectionPerMonth);
	
	BarDTO bardto2=new BarDTO();
	bardto2.setId(30);
	bardto2.setName("om");
	bardto2.setLocation("manglore");
	bardto2.getTyfe().getbar();
	bardto2.setAvgCollectionPerDay(avgCollectionPerDay);
	bardto2.setAvgCollectionPerMonth(avrCollectionPerMonth);
	BarDAO bardao=new BarDAOImpl();
	bardao.save(bardto1);
	bardao.save(bardto2);
	bardao.save(bardto3);
	}
   
}
