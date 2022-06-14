package com.xworkz.abstraction.interface_test.atm;

public class AtmImplementation implements AtmMachineWorks, AtmWithdraw {

	@Override
	public void machineworks() {
		System.out.println(" machine works");
	}

	@Override
	public void withdraw() {
      System.out.println("withdraw money");
	}

}
