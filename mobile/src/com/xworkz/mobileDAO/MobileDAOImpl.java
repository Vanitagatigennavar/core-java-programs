package com.xworkz.mobileDAO;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.mobileEntity.MobileEntity;

public class MobileDAOImpl implements MobileDAO{
   EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
	@Override
	public boolean save(MobileEntity entity) {
		try {
//			EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
			   EntityManager manager=factory.createEntityManager();
			   EntityTransaction tx=manager.getTransaction();
			   tx.begin();
			   manager.persist(entity);
			    tx.commit();
			   factory.close();
			   manager.close();
			   } catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public MobileEntity findbyid(int id) {
		   EntityManager manager=null;
		try {
	           manager=factory.createEntityManager();
	           MobileEntity entity=manager.find(MobileEntity.class,id);
	           System.out.println("found by id:"+entity);
	           
	           if(entity!=null) 
	           {
	        	   System.out.println("data found:"+id);
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
		return null;
		
		
	}

	@Override
	public void updateownerAndlocation(String personName, String newlocation, int id) {
		EntityManager entityManager = this.factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			MobileEntity entity = entityManager.find(MobileEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setPersonName(personName);
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

