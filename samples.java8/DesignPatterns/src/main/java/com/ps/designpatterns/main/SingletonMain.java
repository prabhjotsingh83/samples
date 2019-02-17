package com.ps.designpatterns.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.ps.designpatterns.domain.SingletonEntity;

/**
 * Hello world!
 *
 */
public class SingletonMain 
{
    public static void main( String[] args ) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println( "Singleton Method!" );
        
        SingletonEntity instance = SingletonEntity.getInstance();
        
        System.out.println(instance);
        
        SingletonEntity instance2 = SingletonEntity.getInstance();
        
        System.out.println(instance2);
        
       
        
        if(instance == instance2) {
        	System.out.println("Same objects!");
        }
        
        //Use reflection
        
        SingletonEntity instance3 = null;
        
            
		Method constructorcall2 = instance2.getClass().getMethod("getInstance"); 
        
        constructorcall2.setAccessible(true);
        
        instance3 = (SingletonEntity) constructorcall2.invoke(instance2);
        
        System.out.println(instance3);
        
        if(instance == instance2) {
        	System.out.println("Still same objects after reflection!");
        }
    }
}
