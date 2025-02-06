package com.test1;

import java.util.List;
import java.util.Optional;

public class FindAnyDemo1 
{
	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Raj", "Rahul", "Ankit");
        
		Optional<String> findAny = listOfNames.parallelStream().findAny();
	
		findAny.ifPresent(System.out::println);
        	
	}

}
