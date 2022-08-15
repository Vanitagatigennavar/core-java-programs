package com.xworkz.resort.dao;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import static com.xworkz.resort.util.ResortUtil.*;
import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {
//	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	private  EntityManagerFactory factory = getFactory();
	@Override
	public boolean save(ResortEntity entity) {
		try {
//			EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
			   EntityManager manager=factory.createEntityManager();
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
	public ResortEntity findbyId(int id) {
		
		EntityManager manager=null;
		
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		try {
			 manager=factory.createEntityManager();
//			EntityTransaction tx=manager.getTransaction();//transaction use only in write method
//			tx.begin();
			ResortEntity entity=manager.find(ResortEntity.class,id);
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
		finally {
			
			manager.close();
			
		}
		return null;
}

	@Override
	public void updateownerAndlocation(String newowner, String newlocation, int id) {
		
		
		EntityManager entityManager = this.factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			ResortEntity entity = entityManager.find(ResortEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setOwner(newowner);
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


