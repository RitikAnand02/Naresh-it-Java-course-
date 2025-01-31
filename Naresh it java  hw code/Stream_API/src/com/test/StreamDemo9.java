package com.test;

//flatMap()
//map + Flattening [Converting Collections of collection into single collection]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo9  
{
	public static void main(String[] args) 
	{
		List<String> list1 = Arrays.asList("A","B","C");
		List<String> list2 = Arrays.asList("D","E","F");
		List<String> list3 = Arrays.asList("G","H","I");
		
		List<List<String>> nestedColl = Arrays.asList(list1, list2, list3);
		System.out.println("Original Nested Collection :"+nestedColl);
		
		List<String> collect = nestedColl.stream().flatMap(list -> list.stream()).collect(Collectors.toList());   
		System.out.println(collect);
		
	}
}
