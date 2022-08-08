package com.xworkz.partyrunner;

import com.xworkz.partythread.PartyThread;

public class PartyThreadRunner  {

	public static void main(String[] args) throws InterruptedException {
		PartyThread partythread=new PartyThread();
		
		partythread.sleep(2000);
//		Object partythread1=new Object();
//		partythread.start();
		System.out.println("start the threading");
//		partythread.start();
	}

}
