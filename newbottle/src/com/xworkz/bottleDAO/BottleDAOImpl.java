package com.xworkz.bottleDAO;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bottleentity.BottleEntity;

public class BottleDAOImpl implements BottleDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
    
	@Override
	public boolean save(BottleEntity entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);// without sql
			tx.commit();
			manager.close();
			factory.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
	
		}
		return true;
			
		}
        

	@Override
	public BottleEntity findbyId(int id) {
		System.out.println("running findById" + id);
		// look for .xml --> parsing --> impl of EMF
		// EMF --> establish ---> connection pool
		EntityManager entityManager = null;
		try {
			entityManager = factory.createEntityManager();
			// create an impl of EM --> assoc a conn from CP
			BottleEntity entity = entityManager.find(BottleEntity.class, id);
			if (entity != null) {
				System.out.println("resort entity is found for id" + id);
				return entity;
			} else {
				System.err.println("resort entity is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}

		return null;
	}

	@Override
	public void updateboughtPersonAndlocation(String newboughtperson, String newlocation, int id) {
	
		EntityManager entityManager = this.factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
		  BottleEntity entity = entityManager.find(BottleEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setBoughtPerson(newboughtperson);
				entity.setLocation(newlocation);
				entityManager.merge(entity);// update sql
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			entityManager.close();
		}

	}


		
	}
	
	
