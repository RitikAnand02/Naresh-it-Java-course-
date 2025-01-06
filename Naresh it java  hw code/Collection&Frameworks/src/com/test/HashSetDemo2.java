package com.test;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) 
	{
		Boolean bool[] = new Boolean[5];
		
		HashSet<String> hs = new HashSet<>();
		
		bool[0] = hs.add(new String("nit")); 
		bool[1] = hs.add("nit");
		bool[2] = hs.add("Haryana");
		bool[3] = hs.add("Jaipur");
		bool[4] = hs.add("Hyderabad");
		
		System.out.println(Arrays.toString(bool));
		
		hs.forEach(System.out::println);
		
		System.out.println("Verify nit object is available or not ");
		
		if(hs.contains("nit"))
		{
			System.out.println("nit object is available");
		}
		else
		{
			System.out.println("nit object is not available");			
		}
		
		//Remove an object if it starts from character 'H'

		hs.removeIf(str -> str.charAt(0) =='H');
		System.out.println(hs);
		
		
	}

}
