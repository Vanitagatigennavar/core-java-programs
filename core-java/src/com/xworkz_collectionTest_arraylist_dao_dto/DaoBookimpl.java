package com.xworkz_collectionTest_arraylist_dao_dto;

import java.util.ArrayList;

public class DaoBookimpl implements Dao_book {
	ArrayList<DtoBook> books = new ArrayList<DtoBook>();

	@Override
	public void addbook(DtoBook dto) {
		books.add(dto);
		System.out.println("AddBook is :"+dto);
		
	}

	@Override
	public DtoBook getbook(double price) {
		for(int i = 0; i<books.size();i++) {
			if(books.get(i).getPrice()==price) {
			System.out.println("The Book Details are: " + books.get(i));
			return books.get(i);
			}
		}
		return null;
	
	}

	@Override
	public void updatebook(DtoBook dto) {
		int count = 0;
		for(int i = 0; i<books.size();i++) {
		if(books.get(i).getNoofpages() == dto.getNoofpages()) {
			count++;
			books.get(i).setNoofpages(dto.getNoofpages());
			System.out.println("Updated pages is:" + books.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Invalid book  Details Entered");
		}
}
		
	@Override
	public void deletebook(DtoBook dto) {
		int count = 0;
		for (int i=0; i< books.size(); i++) {
			if( books.get(i) != null && books.get(i).getName() == dto.getName()) {
				books.remove(i);
					count++;
				}
		
			}	
		if(count > 0) {
			System.out.println("The Mentioned Name andcolour Book is " +dto.getName() +" " + dto.getColour() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("input not found");

	}
		
	}


}