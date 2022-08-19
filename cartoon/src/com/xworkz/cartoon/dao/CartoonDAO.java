package com.xworkz.cartoon.dao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;


public interface CartoonDAO {

	boolean save(List<CartoonEntity> entities);

	CartoonEntity findByName(String name);

	Integer total();

	CartoonEntity findByMaxCreatedDate();

	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender, String author);

	String findAuthorByName(String name);

	Object[] findNameAndCountryByAuthor(String author);

	LocalDate findCreatedDateByAuthor(String author);

	void updateAuthorByName(String newAuthor, String name);

	void updateTypeByName(String newType, String name);

	void deleteByName(String name);
	
	//yesterday programs

	default List<CartoonEntity> findAll() {
		return Collections.emptyList();
	}

	default List<CartoonEntity> findAllByAuthor(String author) {
		return Collections.emptyList();
	}

	default List<CartoonEntity> findAllByAuthorAndGender(String author, String gender) {
		return Collections.emptyList();
	}

	default List<String> findAllName() {
		return Collections.emptyList();
	}

	default List<String> findAllCountry() {
		return Collections.emptyList();
	}

	default List<Object[]> findAllNameAndCountry() {
		return Collections.emptyList();
	}

	default List<Object[]> findAllNameAndCountryAndAuthor() {
		return Collections.emptyList();
	}

	

}
