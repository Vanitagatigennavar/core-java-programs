package com.xworkz_exception_custom_unchecked_product_Flipcart;
public class Flipcartproduct {
	Product [] products=new Product[10] ;
		void addProduct(Product product) {
			for (int i = 0; i < Flipcartproduct.this.products.length; i++) {
				if(products[i]==null) {
					products[i]=product;
					System.out.println("product added:"+products[i]);
					break;}
				}
}
		Product getProduct(String productname) {
		Product product=null;
		for (int i = 0; i < products.length; i++) {
			if(products[i]!=null&& products[i].getProductname().equals(productname)) {
				product=products[i];
			}}
		if(product !=null) {
			return product;
		}
		else {
			FlipcartException fe=new FlipcartException();
			throw fe;
		}
	}
}
			
	

	
	
	


