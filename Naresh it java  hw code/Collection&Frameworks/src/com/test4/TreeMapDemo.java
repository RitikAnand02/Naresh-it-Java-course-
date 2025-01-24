package com.test4;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm1 = new TreeMap<>();
		tm1.put(3, "Scott"); //compareTo
		tm1.put(9, "Smith");
		tm1.put(1, "Martin");
		tm1.put(2, "John");
		tm1.put(4, "Alen");
		
		tm1.forEach((k,v)-> System.out.println(k+" : "+v));
		
	}

}

//Note : put() method, internally uses compareTo() method of Integer class to sort the key object in ascending order
