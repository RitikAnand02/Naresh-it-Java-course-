package com.test;

//Retrieve the name whose length is > 3 and convert those 
//names in uppercase

import java.util.Arrays;
import java.util.List;

public class FilterNameAndUpperCase {

	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Rahul","Scott","Raj","Elina","Ram","Puja");
		
		listOfName.stream().filter(str -> str.length()>3).map(name -> name.toUpperCase()).forEach(System.out::println);
		
		

	}

}
