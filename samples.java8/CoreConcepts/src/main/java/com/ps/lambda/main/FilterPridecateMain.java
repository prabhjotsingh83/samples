package com.ps.lambda.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterPridecateMain {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("Prabhjot Singh", "Gurvinder Singh", "Benihsa Kaur", "Kabir Singh" ,"Viender Singh");
		System.out.println("********Consumer output");
		
		ls.parallelStream().forEach( System.out::println);

		List<String> result = new ArrayList<String>();
		List<String> result2 = new ArrayList<String>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s-> s.toUpperCase();
		Consumer<String> c3 = result::add;
		
		System.out.println("********Filter Example");
		ls.parallelStream().map(s-> s.toUpperCase()).filter(s -> s.contains("SINGH")).forEach(c2.andThen(c3.andThen(c1)));
		
		
		System.out.println("********Filter with predicate2");
		Predicate<String> p1 = s -> s.toUpperCase().contains("INDER");
		Predicate<String> p2 = s -> s.toUpperCase().contains("SINGH");
		 
		Consumer<String> c4 = result2::add;
		//Note consumer will not change element
		ls.parallelStream().filter(p1.or(p2)).forEach(c1);
		
	}

}

