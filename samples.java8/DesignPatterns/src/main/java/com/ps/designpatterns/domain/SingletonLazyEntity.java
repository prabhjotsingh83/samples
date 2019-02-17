package com.ps.designpatterns.domain;

public class SingletonLazyEntity {

	private static SingletonLazyEntity instance = null;
	
	//Do not make public!
	private SingletonLazyEntity() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create!");
		}
	};
	
	public static SingletonLazyEntity getInstance() {
		if(null == instance) {
			synchronized (SingletonLazyEntity.class) {
				if (null == instance) {
					instance = new SingletonLazyEntity();
				}
			}
			
		}
		return instance;
	}
	
}
