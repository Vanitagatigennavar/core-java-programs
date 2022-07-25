package com.xworkz_collectionTest_set_set_hash_set_dto_dao_runner;

import com.xworkz_collectionTest_set_set_hash_set_dto.DtoTrain;
import com.xworkz_collectionTest_set_set_hash_set_dto_dao.Daoimpltrain;
import com.xworkz_collectionTest_set_set_hash_set_dto_dao.Daotrain;

public class Serviceimpltrain  implements ServiceTrain{
	Daotrain dao=new Daoimpltrain ();
	@Override
	public void save(DtoTrain dto) {
		if(dto!=null) {
			long trainNumber=dto.getTrainNumber();
			if(trainNumber>0) {
				this.dao.save(dto);

			}
			else {
				System.out.println("Train details not saved");
			}
		}

	}
		@Override
	public DtoTrain getTrain(String destination) {
		return dao .getTrain(destination);
		
	}

	@Override
	public void updateNameByTime(String nameToUpdate, String time) {
		if(nameToUpdate!=null && nameToUpdate.length()>3 && nameToUpdate.length()<30) {
			this.dao.updateNameByTime(nameToUpdate, time);
		}
		else {
			System.out.println("Entered invalid upated name");
		}
}

	@Override
	public void deleteSourceByTime(String sourceToDelete, String time) {
		if(sourceToDelete!=null && sourceToDelete.length() >3&& sourceToDelete.length()<30) {
			this.dao.deleteSourceByTime(sourceToDelete, time);
		}
		else {
			System.out.println("Entered invalid upated name");
		}


	}

}	
		
	


