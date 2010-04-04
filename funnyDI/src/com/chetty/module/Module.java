package com.chetty.module;

import com.chetty.service.NewService;
import com.chetty.service.NewServiceImpl1;
import com.chetty.service.Service;
import com.chetty.service.ServiceImpl2;

public class Module extends AbstractModule {
	public void configure() {		
		createMapping(Service.class, ServiceImpl2.class);
		createMapping(NewService.class, NewServiceImpl1.class);
	}
}