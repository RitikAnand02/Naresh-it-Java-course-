package com.test;

import java.util.stream.Stream;

public class CountDemo1 
{
	public static void main(String[] args) 
	{
		long count = Stream.of("Ravi","Raj","Elina","Aryan","Sachin").count();
		System.out.println(count);

	}

}

