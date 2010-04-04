package com.chetty.module;

public interface IModule {
	void configure();
	<T> Class<? extends T> getMapping(Class<T> type);
}