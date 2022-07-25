package com.xworkz_collectionTest_set_set_hash_set_dto_dao_runner;

import com.xworkz_collectionTest_set_set_hash_set_dto.DtoTrain;
import com.xworkz_collectionTest_set_set_hash_set_dto_dao.Daoimpltrain;
import com.xworkz_collectionTest_set_set_hash_set_dto_dao.Daotrain;

public class Hashmainmethodtrain {

	public static void main(String[] args) {
		DtoTrain channamma=new DtoTrain();
		channamma.setName("Rani Channamma");
		channamma.setSource("Hubli");
		channamma.setDestination("Benglore");
		channamma.setTrainNumber(013456);
		channamma.setTime("8:10:00 AM");

		DtoTrain hampi=new DtoTrain();
		hampi.setName("Hampi Express");
		hampi.setSource("VijayPur");
		hampi.setDestination("Hubli");
		hampi.setTrainNumber(013431);
		hampi.setTime("6:10:00 PM");

		Daotrain dao=new Daoimpltrain();
		ServiceTrain service=new Serviceimpltrain();
		service.save(channamma);
		service.save(hampi);
		service.updateNameByTime("Rajadani Express","8:10:00 AM");
		service.deleteSourceByTime("VijayPur","6:10:00 PM");
        DtoTrain train =service.getTrain("Benglore");
        System.out.println(train);

	}
}


