package com.xworkz.bottleDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bottleentity.BottleEntity;

public class BottleDAOImpl implements BottleDAO {
   EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	@Override
	public boolean save(BottleEntity entity) {
		
		try {
			EntityManager manager=factory.createEntityManager();
			manager.getTransaction();
			   EntityTransaction tx=manager.getTransaction();
			   tx.begin();
			   manager.persist(entity);
			    tx.commit();
			   factory.close();
			   manager.close();
			   
			} catch (PersistenceException e) {
				e.printStackTrace();
				
			}
		return true;
			
		}
	@Override
	public BottleEntity findbyId(int id) {
		EntityManager manager=null;
		try {
			 manager=factory.createEntityManager();
			 BottleEntity entity=manager.find(BottleEntity.class,id);
				System.out.println("found by id:"+id);
				if(entity!=null)
				{
					System.out.println("Data is found by id:"+entity);
				}
				else
				{
					System.out.println("Data is not found");
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void updateboughtPersonAndlocation(String newboughtperson, String newlocation, int id) {
		
		
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
