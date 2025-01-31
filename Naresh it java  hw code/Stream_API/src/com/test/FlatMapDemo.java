package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) 
	{
		List<String> indPlayer = Arrays.asList("Surya", "Tilak", "Akshar","Pandaya");
		
	List<String> engPlayer = Arrays.asList("Salt","Butler","Archer","Rashid");
	
	
	List<List<String>> icc = Arrays.asList(indPlayer , engPlayer);
	
	System.out.println(icc);
	
	//use flatMap for mapping + flattening
	
	List<String> collect = icc.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
	
	System.out.println(collect);

	}

}