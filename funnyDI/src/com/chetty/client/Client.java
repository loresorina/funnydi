package com.chetty.client;

import com.chetty.service.Service;
import com.chetty.shoot.Shoot;

public class Client {
	private Service service;
	
	@Shoot
	public Client(Service service) {
		this.service = service;
	}
	
	public void doSomething() {
		service.serve();
	}
}