package com.xworkz.cartoon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import static com.xworkz.util.CartoonUtil.getFactory;

import java.time.LocalDate;
import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public class CartoonDAOImpl implements CartoonDAO {
	private EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(List<CartoonEntity> entities) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonEntity CartoonEntity : entities) {
				manager.persist(CartoonEntity);
				manager.flush();
			}
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return true;

	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nme", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity entity = (CartoonEntity) obj;
				return entity;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("gettotal");

			Object count = query.getSingleResult();
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object obj = query.getSingleResult();
			System.out.println("findByMaxCreatedDate :-" + obj);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			query.setParameter("nm", name);
			query.setParameter("c", country);
			query.setParameter("gd", gender);
			query.setParameter("aut", author);

			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity cartoon = (CartoonEntity) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAuthor");
			query.setParameter("nme", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				String cartoon = (String) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findnameAndcountry");
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
			Object[] cartoon = (Object[]) obj;
			return cartoon;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDate findCreatedDateByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findcreatedDate");
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
			if (obj != null) {
				LocalDate cartoon = (LocalDate) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String author, String name) {

		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("at", author);
			query.setParameter("nm", name);
			query.executeUpdate();
			System.out.println("The Updated Values of Author are:" + author);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void updateTypeByName(String newType, String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("ty", newType);
			query.setParameter("nm", name);

			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
	}

	@Override
	public List<CartoonEntity> findAll() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByList");
			List<CartoonEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAll();
	}

	@Override
public List<CartoonEntity> findAllByAuthor(String author) {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllByAuthor");
		query.setParameter("aut", author);
		List<CartoonEntity> entity = query.getResultList();
		if (entity != null) {
			return entity;
		}
	} catch (PersistenceException p) {
		p.printStackTrace();
	} finally {
		manager.close();
	}
	return CartoonDAO.super.findAllByAuthor(author);
}

@Override
public List<CartoonEntity> findAllByAuthorAndGender(String author, String gender) {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllByAuthorAndGender");
		query.setParameter("atu", author);
		query.setParameter("gen", gender);
		List<CartoonEntity> entity = query.getResultList();
		if (entity != null) {
			return entity;
		}
	} catch (PersistenceException p) {
		p.printStackTrace();
	} finally {

		manager.close();
	}
	return CartoonDAO.super.findAllByAuthorAndGender(author, gender);
}
@Override
public List<String> findAllName() {
	EntityManager manager = null;
	try {

		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllName");
		List<String> entity = query.getResultList();
		if(entity != null) {
			return entity;
		}
	} catch (PersistenceException p) {
		p.printStackTrace();
	} finally {

		manager.close();
	}
	return null;

}

@Override
public List<String> findAllCountry() {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllCountry");
		List<String> entity = query.getResultList();
		if(entity != null) {
			return entity;
		}
	}
	catch(PersistenceException p) {
		p.printStackTrace();
	}
	finally {
		manager.close();
	}
	return CartoonDAO.super.findAllCountry();
}

@Override
public List<Object[]> findAllNameAndCountry() {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllNameAndCountry");
		@SuppressWarnings("unchecked")
		List<Object[]> list = query.getResultList();
		if(list != null) {
			return list;
		}
	}
	catch(PersistenceException p) {
		p.printStackTrace();
	}
	finally {
		manager.close();
	}
	return CartoonDAO.super.findAllNameAndCountry();
}

@SuppressWarnings("unchecked")
@Override
public List<Object[]> findAllNameAndCountryAndAuthor() {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
		List<Object[]> list = query.getResultList();
		if(list != null) {
			return list;
		}
	}
	catch(PersistenceException p) {
		p.printStackTrace();
	}
	finally {
		manager.close();
	}
	return CartoonDAO.super.findAllNameAndCountryAndAuthor();
}
}