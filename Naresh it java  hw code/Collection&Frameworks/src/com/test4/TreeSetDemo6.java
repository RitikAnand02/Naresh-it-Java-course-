package com.test4;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo6 {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Orange");
		al.add("Apple");
		
		//ArrayList to TrreSet by using Collection(I)
		TreeSet<String> ts = new TreeSet<>(al);
		System.out.println(ts);
		
		
		//TreeSet to TreeSet by using SortedSet
		TreeSet<String> ts2 = new TreeSet<>(ts);
		System.out.println(ts2);
		

	}

}
