package com.test4;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo6 {

	public static void main(String[] args) 
	{
		SortedMap<String, Integer> map1 = new TreeMap<>();
		map1.put("ravi@gmail.com", 1234);
		map1.put("raj@gmail.com", 4566);
		map1.put("scott@gmail.com", 7788);
		map1.put("aryan@gmail.com", 1010);
		
		//TreeMap(SortedMap<K,V>)
		TreeMap<String, Integer> map2 = new TreeMap<>(map1);
		System.out.println(map2);
		
		System.out.println("......................");
		
		//HashMap to TreeMap		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(89, "Ravi");
		hm1.put(71, "Scott");
		hm1.put(17, "Smith");
		hm1.put(13, "Martin");
		
		TreeMap<Integer,String> tm1 = new TreeMap<>(hm1);
		System.out.println(tm1);
		

	}

}
