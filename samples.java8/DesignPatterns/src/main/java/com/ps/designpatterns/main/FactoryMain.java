package com.ps.designpatterns.main;

import java.util.Calendar;

import com.ps.designpatterns.domain.ViewProductFactory;
import com.ps.designpatterns.domain.ViewProducts;
import com.ps.designpatterns.enums.ProductType;

public class FactoryMain {

	//Doent Exposure instanciation logic
	//Deffer to subclass
	//Common Interface
	//Specified by Architecture Implemented by user
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calendar is a factory
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		//Product view domain factory
		ViewProducts swaps = ViewProductFactory.getViewModel(ProductType.SWAP);
		
		System.out.println(swaps);
		
		ViewProducts forwards = ViewProductFactory.getViewModel(ProductType.FORWARD);
		
		System.out.println(forwards);
		
		ViewProducts def = ViewProductFactory.getViewModel(ProductType.ALL);
		
		System.out.println(def);
	}
	

}
