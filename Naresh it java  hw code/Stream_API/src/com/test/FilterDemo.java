package com.test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan","Ajinkya","Ankit");
		
		//Retrieve all the names which starts from character A and it should not 
		//contain duplicate
		
		Set<String> filteredName = listOfName.stream().filter(str -> str.startsWith("A")).collect(Collectors.toSet());
		
		System.out.println(filteredName);
	}

}
