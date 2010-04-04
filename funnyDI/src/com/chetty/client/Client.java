package com.chetty.client;

import com.chetty.service.NewService;
import com.chetty.service.Service;
import com.chetty.shoot.Shoot;

public class Client {
	private Service service;
	private NewService newService;
	
	@Shoot
	public Client(Service service, NewService newService) {
		this.service = service;
		this.newService = newService;
	}
	
	public void doSomething() {
		service.serve();
		newService.doSomethingNew();
	}
}