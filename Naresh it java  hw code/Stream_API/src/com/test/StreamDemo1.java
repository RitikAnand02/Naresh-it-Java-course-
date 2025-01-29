package com.test;

import java.util.*;  //Base package
import java.util.stream.*; //Sub package
public class StreamDemo1 
{
	public static void main(String[] args) 
	{
		List<String> items = new ArrayList<>();
		items.add("Apple");
		items.add("Orange");
		items.add("Mango");

        //Collections Object to Stream
		Stream<String> strm = items.stream();
		strm.forEach(p -> System.out.println(p));
	}
}