package com.test;

//The following progran explains that once a Stream is closed OR consumer by using terminal method then we can't re-use that 
//Stream, If we try to re-use then at runtime java.lang.IllegalStateException will be generated as shown in the program.

import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) 
	{
		System.out.println("Main");
	  Stream<Integer> of = Stream.of(1,2,3,4,5,6,7,8,9,10);
	  of.filter(num -> num % 2 ==0).forEach(System.out::println); //Stream is closed OR Consumed (final Operation)
	  
	  of.forEach(System.out::println); //java.lang.IllegalStateException
	  
	    

	}

}