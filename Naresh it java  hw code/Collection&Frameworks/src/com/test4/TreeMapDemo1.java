package com.test4;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm1 = new TreeMap<>((i1,i2)-> i2.compareTo(i1));
		tm1.put(3, "Scott"); //compare
		tm1.put(9, "Smith");
		tm1.put(1, "Martin");
		tm1.put(2, "John");
		tm1.put(4, "Alen");
		
		tm1.forEach((k,v)-> System.out.println(k+" : "+v));
		
	}

}
