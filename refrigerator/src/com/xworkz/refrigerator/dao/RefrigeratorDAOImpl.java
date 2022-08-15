package com.xworkz.refrigerator.dao;
import static com.xworkz.util.RefrigeratorUtil.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.xworkz.refrigerator.entity.RefrigeratorEntity;
public class RefrigeratorDAOImpl implements RefrigeratorDAO {
	private  EntityManagerFactory factory = getFactory();
	@Override
	public boolean save(RefrigeratorEntity entity) {
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
	
		return false;
	}

	@Override
	public RefrigeratorEntity findbyid(int id) {
		 EntityManager manager=null;
			try {
		           manager=factory.createEntityManager();
		           RefrigeratorEntity entity=manager.find(RefrigeratorEntity.class,id);
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
			RefrigeratorEntity entity = entityManager.find(RefrigeratorEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setPersonName(personName);
				entity.setLocation(newlocation);
				entityManager.merge(entity);// update sql
			}
			tx.commit();
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}	
		
	}


