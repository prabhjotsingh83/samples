package com.ps.designpatterns.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonLazyDBEntity {

	private static volatile SingletonLazyDBEntity instance = null;
	private static volatile Connection conn = null;
	
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Registered driver");
	}
	
	//Do not make public!
	private SingletonLazyDBEntity() {
		
		if ( null != conn ) {
			throw new RuntimeException("Use getConnection() method to create!");
		}
		
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create!");
		}
	};
	
	public static SingletonLazyDBEntity getInstance() {
		if(null == instance) {
			synchronized (SingletonLazyDBEntity.class) {
				if (null == instance) {
					instance = new SingletonLazyDBEntity();
				}
			}
			
		}
		return instance;
	}
	
	public Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if(null == conn) {
			synchronized (SingletonLazyDBEntity.class) {
				if (null == conn) {
					try {
						//To do WIP create DB
						String dbUrl = "jdbc:derby:psDB;create=true";
						System.out.println("creating new DB");
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
			
		}
		return conn;
	}
}
