package com.xworkz_collectionTest_vectordemo_dao_dto_runner;

import com.xworkz_collectionTest_vectordemo_daodto_flight.Dto_flight;

import com.xworkz_collectionTest_vectordemo_daodto_flight_dao.Dao_flight;
import com.xworkz_collectionTest_vectordemo_daodto_flight_dao.Dao_flightimpl;

public class Service_flightimpl implements ServiceFlight {
	Dao_flight df=new Dao_flightimpl();

	@Override
	public void addflight(Dto_flight dto) {
		df.addflight(dto);
		
	}

	@Override
	public String toString() {
		return "Service_flightimpl [df=" + df + "]";
	}

	@Override
	public void updateflight(Dto_flight dto) {
	df.updateflight(dto);
		
	}

	@Override
	public void deleteFlight(Dto_flight dto) {
		df.deleteFlight(dto);
		
	}
}
