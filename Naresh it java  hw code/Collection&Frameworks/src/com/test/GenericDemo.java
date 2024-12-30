package com.test;

import java.util.Vector;

public class GenericDemo 
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector<>();
		v1.add(12);
		v1.add(14);
		v1.add(17);
		v1.add(90);
		
		for(int i=0; i<v1.size(); i++)
		{
		   Integer val = (Integer) v1.get(i);
		   System.out.println(val);
		}
		
		System.out.println("Adding String object in the collection");
		v1.add("Ravi");
		v1.add("Hyd");		
		
		for(int i=0; i<v1.size(); i++)
		{
		   Integer val = (Integer) v1.get(i);
		   System.out.println(val);
		}
	}

}
