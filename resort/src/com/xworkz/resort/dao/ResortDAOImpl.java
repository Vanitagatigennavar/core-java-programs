package com.xworkz.resort.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
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
		
		
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
      
//			tx.commit();
//			manager.persist(tx);
			ResortEntity entity=manager.find(ResortEntity.class,id);
			entity.setName("rajani");
			entity.setLocation("kanakpur");
			tx.commit();
			if(entity!=null)
			{
				System.out.println("data found by id:"+entity);
			}
			else
			{
				System.out.println("data not found");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			manager.close();
			
		}
		
	}

	@Override
	public boolean deleteById(int id) {
       EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			   tx.begin();
			   manager.find(ResortEntity.class,id);
			   manager.remove(manager);
			   tx.commit();
			} catch (Exception e) {
		
		}
		finally {
			manager.close();
		}
		return true;
	
	}
	}
//	   EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
//	   EntityManager manager=factory.createEntityManager();
//	   EntityTransaction tx=manager.getTransaction();
//	   tx.begin();
//	   manager.persist(entity);
//	   
//	   tx.commit();
//	   factory.close();
//	   manager.close();
//	   
//		return true;
//	}
//
//	
//}

