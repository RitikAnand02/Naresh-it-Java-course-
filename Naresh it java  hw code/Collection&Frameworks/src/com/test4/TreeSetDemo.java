package com.test4;

//program that describes by default TreeSet provides default natural sorting order
import java.util.*;
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> t1 = new TreeSet<>();
		t1.add(4); 
		t1.add(7);  
		t1.add(2);
		t1.add(1);
		t1.add(9);	
		System.out.println(t1);

		NavigableSet<String> t2 = new TreeSet<>();
		t2.add("Orange");  
		t2.add("Mango");
		t2.add("Banana");
		t2.add("Grapes");
		t2.add("Apple");		
		System.out.println(t2);		
	}
}