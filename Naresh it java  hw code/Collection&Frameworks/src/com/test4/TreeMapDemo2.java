package com.test4;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;                        
public class TreeMapDemo2 
{
      public static void main(String args[]) 
      {
            TreeMap map = new TreeMap();
            map.put("one","1");
            map.put("two",null);
            map.put("three","3");
			map.put("four",4);

            displayMap(map);  

	map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	 	       
      }
      static void displayMap(TreeMap map) 
      {
           Collection c = map.entrySet();   //Set<Map.Entry>

           Iterator i = c.iterator();
           i.forEachRemaining(x -> System.out.println(x));
      }
}
