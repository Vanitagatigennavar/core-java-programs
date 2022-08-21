package com.xworkz.combs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.combs.entity.CombEntity;

public class CombDaoImpl implements CombDAO{
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean validateAndSave(CombEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			manager.close();
		}
		return false;
	

	}

}
