package com.test5;

import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); //raw type
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
							
		for(int i=0; i<al.size(); i++)
		{
		String name =  (String) al.get(i); //type casting is required
		System.out.println(name.toUpperCase());
		}	
		
	}
}
