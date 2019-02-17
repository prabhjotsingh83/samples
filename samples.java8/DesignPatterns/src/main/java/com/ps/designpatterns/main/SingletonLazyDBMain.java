package com.ps.designpatterns.main;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ps.designpatterns.domain.SingletonEntity;
import com.ps.designpatterns.domain.SingletonLazyDBEntity;
import com.ps.designpatterns.domain.SingletonLazyEntity;

/**
 * Hello world!
 *
 */
public class SingletonLazyDBMain 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        System.out.println( "Singleton Lazy DB Connection Method!" );
        
        SingletonLazyDBEntity instance = SingletonLazyDBEntity.getInstance();
        
        Connection conn = instance.getConnection();
        
        System.out.println(conn);
        
        Connection conn2 = instance.getConnection();
        
        System.out.println(conn2);
        
        if(conn == conn2) {
        	System.out.println("Same objects!");
        }
        
        Statement sta;
        
        try {
        sta=(Statement) conn.createStatement();
        
        int count = sta.executeUpdate(" create table test (id int, name varchar(20) )");
        
        System.out.println("table Created!");
        
        } catch(SQLException e) {
        	e.printStackTrace();
        }
        
        
    }
}
