package com.xworkz_collectionTest_arraylist_dao_dto_arraylist;

import com.xworkz_collectionTest_arraylist_dao_dto.DtoBook;

public class ArrayApplicationbook {

	public static void main(String[] args) {
		DtoBook db=new DtoBook();
        db.setName("classmate");
        db.setColour("green");
        db.setPrice(200.00);
        db.setNoofpages(300.00);
        
        DtoBook yoga=new DtoBook();
        yoga.setName("yoga");
        yoga.setColour("pink");
        yoga.setPrice(200.00);
        yoga.setNoofpages(300.00);
         
        DtoBook aruns =new DtoBook();
        aruns.setName("aruns");
        aruns.setColour("white");
        aruns.setPrice(250.00);
        aruns.setNoofpages(500.00);
        
        DtoBook suleka=new DtoBook();
        suleka.setName("suleka");
        suleka.setColour("red");
        suleka.setPrice(100.00);
        suleka.setNoofpages(200.00);
     
        BookService service1 = new BookServiceimpl();
		service1.addBook(suleka);
		service1.addBook(aruns);
		service1.addBook(yoga);
		service1.addBook(db);
		System.out.println("");
		
		aruns.setPrice(500.00);
		service1.updateBook(aruns);
		System.out.println(" ");
		
		service1.getbook(100.00);
		System.out.println(" ");
		service1.deleteBook(suleka);
  
	}
	}
