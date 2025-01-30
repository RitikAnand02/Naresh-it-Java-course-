package com.test;

//Sorting the data

import java.util.*;
import java.util.stream.*;
public class StreamDemo5 
{
	public static void main(String[] args) 
	{
	List<String> names = Arrays.asList("Zaheer","Rahul","Aryan","Sailesh","Zaheer");

		List<String> collect = names.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(collect);
	}
}