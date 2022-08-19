package com.xworkz.freedomfighter.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

import static com.xworkz.util.FreedomFighterUtil.getFactory;

public class FreedomFighterDAOImpl implements FreedomFighterDAO {
	EntityManagerFactory factory = getFactory();
	@Override
	public boolean save(FreedomFighterEntity entity) {
		EntityManager  manager = null;
		Integer count = 0;
		try {
			 manager = factory.createEntityManager();
			 EntityTransaction tx = manager.getTransaction();
			 tx.begin();
				manager.persist(entity);
				count++;
				if(count > 20) {
					manager.flush();
				}
				tx.commit();
			}
			catch (PersistenceException p) {
				p.printStackTrace();
				manager.getTransaction().rollback();
			}
			finally {
				manager.close();
			}
		return false;
	}

	@Override
	public List<FreedomFighterEntity> findAll() {
		
		return null;
	}

	@Override
	public List<FreedomFighterEntity> findAllByAuthor(String author) {
	
		return null;
	}

	@Override
	public List<FreedomFighterEntity> findAllByAuthorAndGender(String author, String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAllName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAllCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findAllNameAndCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findAllNameAndCountryAndAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}