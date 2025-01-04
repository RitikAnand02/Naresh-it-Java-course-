package com.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo5 {

	public static void main(String[] args) 
	{	
		
		
		List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit", "Rahul");
		
		LinkedList<String> list = new LinkedList<>(listOfName); 
		list.forEach(System.out::println);
		            
		
		
		
	}

}
