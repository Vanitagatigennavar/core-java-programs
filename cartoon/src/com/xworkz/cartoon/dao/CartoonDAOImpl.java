package com.xworkz.cartoon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import static com.xworkz.util.CartoonUtil.getFactory;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public class CartoonDAOImpl implements CartoonDAO {
	 private EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(List<CartoonEntity> entities) {
		EntityManager manager=null;
			try {
				manager = factory.createEntityManager();
				Query query=manager.createNamedQuery(null);
				}
				tx.commit();
			}
			catch(PersistenceException p) {
				p.printStackTrace();
			}
			finally {
				manager.close();
			}
			return true;

}
}
	