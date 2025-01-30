package com.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo1 {

	public static void main(String[] args) 
	{
		 //Retrieve all the names which starts from R and duplicates are allowed
        List<String> filteredName = Stream.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan").filter(str-> str.startsWith("R")).collect(Collectors.toList());
		
      System.out.println(filteredName);
		
		

	}

}