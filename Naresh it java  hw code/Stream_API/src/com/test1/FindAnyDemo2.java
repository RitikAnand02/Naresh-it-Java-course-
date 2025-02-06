package com.test1;

import java.util.List;
import java.util.Optional;

public class FindAnyDemo2 {

	public static void main(String[] args) 
	{
        List<String> listOfName = List.of("Sachin", "Ankit", "Aman", "Rahul", "Ravi");
        
        Optional<String> anyElement = listOfName.parallelStream().filter(s -> s.startsWith("R")).findAny();

        anyElement.ifPresent(System.out::println);
    }

}