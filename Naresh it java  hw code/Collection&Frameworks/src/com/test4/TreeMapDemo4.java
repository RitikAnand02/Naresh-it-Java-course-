package com.test4;

import java.util.TreeMap;

record Product3(Integer productId, String productName)
{
	
}


public class TreeMapDemo4 {

	public static void main(String[] args) 
	{
	  TreeMap<Product3,String> map = new TreeMap<>((p1, p2)-> p1.productId().compareTo(p2.productId()));
	  map.put(new Product3(333, "Camera"), "Hyderabad");
	  map.put(new Product3(111, "Mobile"), "Indore");
	  map.put(new Product3(222, "Laptop"), "Kolkata");
	  map.put(new Product3(444, "Headphone"), "Mumbai");
	  
	  map.forEach((k,v)-> System.out.println("Key is :"+k+" value is :"+v));

	}

}
