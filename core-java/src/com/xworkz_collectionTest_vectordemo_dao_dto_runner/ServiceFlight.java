package com.xworkz_collectionTest_vectordemo_dao_dto_runner;

import com.xworkz_collectionTest_arraylist_dao_dto.Dto;
import com.xworkz_collectionTest_vectordemo_daodto_flight.Dto_flight;
import com.xworkz_collectionTest_vectordemo_daodto_flight_dao.Dao_flight;

public interface ServiceFlight {
       void addflight (Dto_flight dto);
       void updateflight(Dto_flight dto);
       void deleteFlight(Dto_flight dto);
       
}
