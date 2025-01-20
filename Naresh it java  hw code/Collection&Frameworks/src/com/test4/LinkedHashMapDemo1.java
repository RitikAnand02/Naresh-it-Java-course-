package com.test4;

import java.util.*;

public class LinkedHashMapDemo1 
{
      public static void main(String[] a) 
      {
           Map<String,String> map = new LinkedHashMap<>();
           map.put("Ravi", "1234");
		   map.put("Rahul", "1234");
		   map.put("Aswin", null);
		   map.put("Samir", null);
           
		   map.forEach((k,v)->System.out.println(k+" : "+v));
      }
}

//Note : To maintain order we should use LinkedHashMap.

