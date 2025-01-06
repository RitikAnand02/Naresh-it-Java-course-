package com.test;

//Programs on HashSet

//Unsorted, Unordered and no duplicates
import java.util.*;
public class HashSetDemo 
{
public static void main(String args[])
{ 
	    HashSet<Integer> hs = new HashSet<>();
		hs.add(67); 
		hs.add(89);		
		hs.add(33);
		hs.add(null);
		hs.add(45);
		hs.add(12);
		hs.add(35);	
		
		
		hs.forEach(num-> System.out.println(num));
	}
}

//Note : At the time of adding element, we call the hashCode() method on the element object, the by default hashcode value of null is 0.