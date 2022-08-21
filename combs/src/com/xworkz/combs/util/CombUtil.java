package com.xworkz.combs.util;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

public class CombUtil {
	
	 private static ValidatorFactory factory;
	   
	   public static ValidatorFactory getFactory() {
		return factory;
	}
	   static {
		   factory=Validation.buildDefaultValidatorFactory();
	   }

	}


