package com.xworkz_exception_exception_checked;

public class ExceptionAtm extends Exception {

//	public ExceptionAtm(String message) {
//		super(message);
//		
	// TODO Auto-generated constructor stub
	@Override
	public String toString() {

		return "you crossed daily limit:";
	}

	@Override
	public String getMessage() {
		return "invalid amount entered:";
	}
}
