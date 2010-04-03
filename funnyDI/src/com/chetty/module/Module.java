package com.chetty.module;

import java.util.HashMap;

import com.chetty.service.Service;
import com.chetty.service.ServiceImpl2;

public class Module<T> implements IModule<T> {
	public HashMap<Class, Class> configure() {
		HashMap<Class, Class> classMap = new HashMap<Class, Class>();
		
		classMap.put(Service.class, ServiceImpl2.class);
		
		return classMap;
	}
}
