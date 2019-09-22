package com.ps.lambda.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumerMain {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("Prabhjot", "Gurvinder", "Benihsa", "Kabir" );
		System.out.println("Consumer output");
		
		ls.parallelStream().forEach( System.out::println);

		List<String> result = new ArrayList<String>();
		List<String> result2 = new ArrayList<String>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s-> s.toUpperCase();
		Consumer<String> c3 = result::add;
		
		System.out.println("Chaned Consumer 1");
		ls.parallelStream().map(s-> s.toUpperCase()).forEach(c2.andThen(c3.andThen(c1)));
		
		
		System.out.println("Chaned Consumer 2");
		
		Consumer<String> c4 = result2::add;
		ls.parallelStream().forEach(c2.andThen(c4.andThen(c1)));
		
	}

}

