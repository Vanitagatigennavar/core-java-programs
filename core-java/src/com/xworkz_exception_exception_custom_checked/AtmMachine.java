package com.xworkz_exception_exception_custom_checked;

public class AtmMachine
  {
	void draw (int amount) throws ExceptionAtm 
     { 
	if(amount<100 || amount>50000 || amount%100 != 0) 
	{
		ExceptionAtm atmExp=new ExceptionAtm();
//		throw new ExceptionAtm("invalid amount entered", "daily limit crossed");
		throw atmExp;
	}
   else  {
		System.out.println("please collect cash....");
	  }
 }
}	
	


