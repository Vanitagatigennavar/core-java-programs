package com.xworkz_exception_custom_unchecked;
public class FlipcartTestDemo {
public static void main(String[] args ) {
		Flipcart fc=new Flipcart();
		String dress="womenwear";
		int ammount =40000;
		try {
			fc.Shopping(dress,ammount);;
			
		} 
		catch (ExceptionFlipcart e) 
		{
			if (dress=="girls"||ammount<50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
				}
			}
	}
}
		

	

