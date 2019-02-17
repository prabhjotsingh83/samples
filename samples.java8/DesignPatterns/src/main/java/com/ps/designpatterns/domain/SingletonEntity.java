package com.ps.designpatterns.domain;

public class SingletonEntity {

	private static SingletonEntity instance = new SingletonEntity ();
	
	//Do not make public!
	private SingletonEntity() {};
	
	public static SingletonEntity getInstance() {
		return instance;
	}
	
}
