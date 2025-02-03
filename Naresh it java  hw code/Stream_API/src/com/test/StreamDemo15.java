package com.test;

import java.util.stream.Stream;

public class StreamDemo15 {

	public static void main(String[] args) 
	{
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.dropWhile(num -> num < 7).forEach(System.out::println);
		
		System.out.println("..................................");
		
		numbers = Stream.of(15, 8, 7, 9, 5, 6, 7, 8, 9, 10);

		numbers.dropWhile(num -> num > 5).forEach(System.out::println); 
		      
		
	}

}
