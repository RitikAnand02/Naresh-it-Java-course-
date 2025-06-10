package com.test;

//Converting HashMap to ConcurrentHashMap
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1
{
 public static void main(String args[])
 {
     
     HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
     hashMap.put(1, "Ravi");
     hashMap.put(2, "Ankit");
     hashMap.put(3, "Prashant");
	 hashMap.put(4, "Pallavi");
     
     ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(hashMap);
     System.out.println("Object from ConcurrentHashMap: "+ concurrentHashMap);

 }

}