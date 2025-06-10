package com.test;

//Collections.synchronizedSet(Set set);
import java.util.*;  
public class Collection3
{  
  public static void main(String[] args) 
		{  
      Set<String> set = Collections.synchronizedSet(new HashSet<>());  
      set.add("Apple");   
		set.add("Orange");
		set.add("Grapes");
		set.add("Mango");
		set.add("Guava");
		set.add("Mango");           
      System.out.println("Set after Synchronization :");  
      synchronized (set) 
		{  
         Spliterator<String> itr = set.spliterator();
		   itr.forEachRemaining(str -> System.out.println(str));  
       }       
   }  
}  