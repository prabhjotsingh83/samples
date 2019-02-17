package com.ps.designpatterns.main;

import com.ps.designpatterns.domain.SingletonEntity;
import com.ps.designpatterns.domain.SingletonLazyEntity;

/**
 * Hello world!
 *
 */
public class SingletonLazyMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Singleton Lazy Method!" );
        
        SingletonLazyEntity instance = SingletonLazyEntity.getInstance();
        
        System.out.println(instance);
        
        SingletonLazyEntity instance2 = SingletonLazyEntity.getInstance();
        
        System.out.println(instance2);
        
        if(instance == instance2) {
        	System.out.println("Same objects!");
        }
        
    }
}
