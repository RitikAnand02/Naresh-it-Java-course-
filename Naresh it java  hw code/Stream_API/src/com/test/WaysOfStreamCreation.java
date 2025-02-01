package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class WaysOfStreamCreation {

	public static void main(String[] args) 
	{
		//Case 1:
		List<Integer> list = List.of(1,2,3);
		list.stream().forEach(System.out::println);
		
		//Case 2
		double arr[] = {1.2, 3.6, 8.9};
		DoubleStream stream = Arrays.stream(arr);
	    stream.forEach(System.out::println);
	    
	    //Case 3
	    Stream.of(12,90,78).forEach(System.out::println);
	    
	    
		//Case 4 [How to generate Infinite Stream]
	    //generate(Supplier<T> g)
		Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println); 
	     
		Stream.iterate(1, num -> num+1).limit(10).forEach(System.out::println);

	}

}
