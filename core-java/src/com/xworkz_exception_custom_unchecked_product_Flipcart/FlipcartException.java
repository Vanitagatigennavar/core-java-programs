package com.xworkz_exception_custom_unchecked_product_Flipcart;

public class FlipcartException  extends RuntimeException{
	@Override
	public String toString() {
		return "product not found";
	}

}
