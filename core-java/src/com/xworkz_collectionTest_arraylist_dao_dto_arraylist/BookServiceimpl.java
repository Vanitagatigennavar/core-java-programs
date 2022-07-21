package com.xworkz_collectionTest_arraylist_dao_dto_arraylist;

import com.xworkz_collectionTest_arraylist_dao_dto.DaoBookimpl;
import com.xworkz_collectionTest_arraylist_dao_dto.Dao_book;
import com.xworkz_collectionTest_arraylist_dao_dto.Dto;
import com.xworkz_collectionTest_arraylist_dao_dto.DtoBook;

public  class BookServiceimpl implements BookService {
	
	Dao_book db = new DaoBookimpl();

	@Override
	public void addBook(DtoBook dto) {
		db.addbook(dto);

		
	}

	@Override
	public void deleteBook(DtoBook dto) {
	db.deletebook(dto);
		
	
	}

	@Override
	public void updateBook(DtoBook dto) {
		db.updatebook(dto);
		
	}

	@Override
	public DtoBook getbook(double price) {
	db.getbook(price);
		return null;
	}

	@Override
	public String toString() {
		return "BookServiceimpl [db=" + db + "]";
	}
   
}



