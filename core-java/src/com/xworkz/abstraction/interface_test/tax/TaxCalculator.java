package com.xworkz.abstraction.interface_test.tax;

public class TaxCalculator implements CentralTax, StateTax {

	@Override
	public void State() {

		System.out.println("state tax is 100Rs");

	}

	@Override
	public void central() {
		System.out.println("central tax is 200Rs");
	}
}
