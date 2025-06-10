package com.test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample1
{
  public static void main(String[] args) 
   {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
		set.add("Java");

        Iterator itr = set.iterator();
		

        // Adding a new element
        set.add("JavaScript");
       
        for (String language : set) 
		{
            System.out.println(language);
        }
		
		System.out.println("............");
		while(itr.hasNext())
	    {
			System.out.println(itr.next());
	    }
    }
}
