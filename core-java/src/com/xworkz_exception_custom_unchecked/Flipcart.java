package com.xworkz_exception_custom_unchecked;
public class Flipcart {
	void Shopping(String dress,int ammount) throws ExceptionFlipcart  {
		
		if( dress=="girls"||dress=="womenwear"||ammount<50000 ) {
	    ExceptionFlipcart exceptionFlipcart=new ExceptionFlipcart();
        throw  exceptionFlipcart;
      }
      else 
      {
	       System.out.println("customer will not get dress");
         }
      }
  }


