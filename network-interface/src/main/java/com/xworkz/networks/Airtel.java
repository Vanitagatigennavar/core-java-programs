package com.xworkz.networks;

public class Airtel {
	
	private ServiceNetwork service;

	public void setService(ServiceNetwork service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}


}
