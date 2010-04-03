package com.chetty.module;

import java.util.HashMap;

public interface IModule<T> {
	abstract HashMap<Class, Class> configure();
}
