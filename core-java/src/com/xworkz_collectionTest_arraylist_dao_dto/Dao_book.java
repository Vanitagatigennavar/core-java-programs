package com.xworkz_collectionTest_arraylist_dao_dto;

public interface Dao_book {
	void addbook(DtoBook dto);
	void updatebook(DtoBook dto);
	void deletebook(DtoBook dto);
//	Dto getBook(Object dto);
	DtoBook getbook(double price) ;
}
