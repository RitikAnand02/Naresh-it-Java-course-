package com.test;

import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<>(String::compareTo);
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		System.out.println(ts);

	}

}
