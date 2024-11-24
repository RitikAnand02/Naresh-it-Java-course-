package com.test;

public class HashCodeDemo2 {

	public static void main(String[] args) 
	{
		String s1 = "A";
		Integer i1 = 65;
		
		System.out.println(s1.equals(i1));
		
		System.out.println(s1.hashCode());
		System.out.println(i1.hashCode());

	}

}
