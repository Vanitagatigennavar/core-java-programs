package com.xworkz_collectionTest_vectordemo_dao_dto_runner;

import com.xworkz_collectionTest_vectordemo_daodto_flight.Dto_flight;

public class VectorAplication {

	public static void main(String[] args) {
		Dto_flight dtoflight= new Dto_flight();
		dtoflight.setName("indianairlines");
		dtoflight.setSource("indian");
		dtoflight.setType("legacy");
		dtoflight.setPrice(100000.00);
		dtoflight.setDestination("dehli");
		
		Dto_flight dft=new Dto_flight();
		dft.setName("ameriacanairlines");
		
		dft.setSource("america");
		dft.setType("economy class flights");
		dft.setPrice(200000.00);
		dft.setDestination("chicago");
		
		ServiceFlight sf=new Service_flightimpl();
		 sf.addflight(dtoflight);
		 sf.addflight(dft);
		 System.out.println( " " );
		 
		 sf.updateflight(dtoflight);
		System.out.println(" ");
			
		sf.deleteFlight(dtoflight);
          System.out.println(" ");
	}

}
