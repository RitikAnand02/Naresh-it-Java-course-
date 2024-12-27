package com.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject 
{
	public static void main(String[] args)
	{                   
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");    
		fruits.add("Banana");
		fruits.add("Gauva");  
	
		System.out.println("1) By using toString() Method");
		System.out.println(fruits.toString());
		
		System.out.println("...............................");
		System.out.println("2) By using for loop ");
		
		for(int i=0; i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println("...............................");
		System.out.println("3) By using for-each loop ");
		
		for(String fruit : fruits)
		{
			System.out.println(fruit.toUpperCase());
		}
		
		
		System.out.println("...............................");
		System.out.println("4) By using Enumeration interface : ");
		
		 Enumeration<String> ele = fruits.elements();
		 
		 while(ele.hasMoreElements())
		 {
			 System.out.println(ele.nextElement());
		 }
		
		 System.out.println("...............................");
	     System.out.println("5) By using Iterator interface : ");
		 
      Iterator<String> itr = fruits.iterator();
		
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      System.out.println("...............................");
	  System.out.println("6) By using ListIterator interface : ");
	  
	  
	  ListIterator<String> lstItr = fruits.listIterator();
	  
	  System.out.println("IN FORWARD DIRECTION :");
	  
	  while(lstItr.hasNext())
	  {
		  System.out.println(lstItr.next());
	  }
	  
	  System.out.println("IN BACKWARD DIRECTION :");
	  
	  while(lstItr.hasPrevious())
	  {
		  System.out.println(lstItr.previous());
	  }
	  
	  System.out.println("...............................");
	  System.out.println("7) By using SplIterator interface : ");
	  
	  Spliterator<String> spliterator = fruits.spliterator();
	  spliterator.forEachRemaining(fruit -> System.out.println(fruit));
	  
	  System.out.println("...............................");
	  System.out.println("8) By using forEach() Method : ");
	  fruits.forEach(fruit -> System.out.println(fruit));
	  
	  
	  System.out.println("...............................");
	  System.out.println("9) By using Method Reference : ");
	  fruits.forEach(System.out::println);
		
	}

}
