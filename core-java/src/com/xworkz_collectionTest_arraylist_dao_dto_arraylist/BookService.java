package com.xworkz_collectionTest_arraylist_dao_dto_arraylist;

import com.xworkz_collectionTest_arraylist_dao_dto.Dto;
import com.xworkz_collectionTest_arraylist_dao_dto.DtoBook;

public interface BookService {
   void addBook(DtoBook dto);
//	Dto getBook(Object dto);
	void updateBook(DtoBook dto);
	void deleteBook(DtoBook dto);
	DtoBook getbook(double price) ;
	}
