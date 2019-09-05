package com.ps.lambda.main;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employees = Arrays.asList("Prabhjot","Gurvinder");
		
		employees.forEach(System.out::println);
	}

}
