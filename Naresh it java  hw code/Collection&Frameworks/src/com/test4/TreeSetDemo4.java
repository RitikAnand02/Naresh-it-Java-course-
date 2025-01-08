package com.test4;

import java.util.*;
public class TreeSetDemo4
{
	public static void main(String[] args) 
	{
		Set<String> t = new TreeSet<>((s1,s2)-> s2.compareTo(s1));  
		t.add("6");   
		t.add("5");
		t.add("4");
		t.add("2");
		t.add("9");	
		Iterator<String> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x));

		
	}
}
