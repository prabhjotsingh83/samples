package com.ps.designpatterns.main;

import com.ps.designpatterns.domain.SingletonEntity;

/**
 * Hello world!
 *
 */
public class SingletonMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Singleton Method!" );
        
        SingletonEntity instance = SingletonEntity.getInstance();
        
        System.out.println(instance);
        
        SingletonEntity instance2 = SingletonEntity.getInstance();
        
        System.out.println(instance2);
        
        if(instance == instance2) {
        	System.out.println("Same objects!");
        }
        
    }
}
