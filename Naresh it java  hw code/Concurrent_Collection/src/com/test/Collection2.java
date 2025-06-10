package com.test;

//Collections.synchronizedList(List list);
import java.util.*;
public class Collection2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arl = new ArrayList<>();   
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");

		List<String> syncCollection = Collections.synchronizedList(arl);

		List<String> upperList = new ArrayList<>(); //New List
  
		Runnable listOperations = () -> 
		{
			synchronized (syncCollection) 
			{
             syncCollection.forEach(str -> upperList.add(str.toUpperCase()));           
         }
     };

	   Thread t1 = new Thread(listOperations);
	   t1.start();

    upperList.forEach(x -> System.out.println(x));
	}
}
