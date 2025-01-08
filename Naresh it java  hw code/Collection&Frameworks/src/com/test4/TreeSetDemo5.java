package com.test4;

import java.util.*;  

public class TreeSetDemo5 
	{
	public static void main(String[] args)
	{
		Set<Character> t = new TreeSet<>();  
		t.add('A'); 
		t.add('C');
		t.add('B');
		t.add('E');
		t.add('D');	
		Iterator<Character> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x)); 			
	}
}
