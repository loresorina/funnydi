package com.chetty.shoot;

import java.lang.reflect.Constructor;
import java.util.HashMap;

import com.chetty.module.IModule;

public class Shooter<T> {
	private IModule<T> module;
	
	public Shooter(IModule<T> module) {
		this.module = module;		
	}
	
	@SuppressWarnings("unchecked")
	public Object fireShot(Class klass) throws Exception {		
		if(klass != null) {			
			boolean flag = true;
			int index = 0;
			
			for(Constructor constructor: klass.getConstructors()) {				
				if(constructor.isAnnotationPresent(Shoot.class)) {
					if(flag && index == 0) { //To restrict to only one constructor injection
						flag = false;
						index++;
						
						HashMap<Class, Class> classMap = module.configure();
						Class[] parameterTypes = constructor.getParameterTypes();
						Object[] objArr = new Object[parameterTypes.length];
						
						int i = 0;
						
						for(Class c : parameterTypes) {
							Class dependency = classMap.get(c);
																				
							if(c.isAssignableFrom(dependency)) {
								objArr[i] = dependency.getConstructor().newInstance();						
							}
						}
						
						Object resObj = klass.getConstructor(parameterTypes).newInstance(objArr);						
						
						return resObj;
					}					
				}
			}
		}
		
		return null;		
	}
}
