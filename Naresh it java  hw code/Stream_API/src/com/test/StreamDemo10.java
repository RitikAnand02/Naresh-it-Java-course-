package com.test;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo10
{
	public static void main(String[] args)
	{
		 //Print the numbers in ascending order
		 List<Integer> listOfNum = List.of(89,67,56,45,23,15); 
		 listOfNum.stream().
		    sorted((i1,i2)-> i1.
				 compareTo(i2)).
		              forEach(System.out::println);
		 System.out.println("===============================");
		 
		 //Print the numbers in descending order
		 List<Integer> listOfNumber = List.of(89,67,56,45,23,15); 
		 listOfNumber.stream().
		    sorted((i1,i2)-> i2.compareTo(i1)).
		       forEach(System.out::println);
		 System.out.println("===============================");
		 
		 //Print the names in Ascending order
		 Stream<String> strOfName = Stream.of("Ankit","Scott","Smith","James");
		 strOfName.sorted((s1,s2)-> s1.compareTo(s2)).forEach(System.out::println);
		 
		 System.out.println("===============================");
		 
		 //Print the names in Descending order
		 Stream<String> strmOfName = Stream.of("Ankit","Scott","Smith","James");
		 strmOfName.sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println);
		 
		 System.out.println("......................");
		 Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Virat", "Rohit","Aswin","Bumrah");
			s.distinct().
			sorted((s1,s2)-> s2.compareTo(s1)).
			forEach(System.out::println);
		
	}

}
