package com.test;

//Collections.synchronizedMap(Map map);
import java.util.*;  
public class Collection4
{  
  public static void main(String[] args) 
	{  
      Map<String, String> map = new HashMap<String, String>();  
      map.put("1", "Ravi");  
      map.put("4", "Elina");  
      map.put("3", "Aryan");  
      Map<String, String> synmap = Collections.synchronizedMap(map);  
      System.out.println("Synchronized map is :" + synmap);                 
   }  
}  
