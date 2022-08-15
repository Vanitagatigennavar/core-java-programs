package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ComputerUtil {

private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		return factory;
		}
		static {
			factory=Persistence.createEntityManagerFactory("com.xworkz");
			System.out.println("Init EMF in static block of EMFUtil");
		}
	}
	
