package com.test4;

import java.util.TreeMap;

record Product2(Integer productId, String productName) implements Comparable<Product2>
{

	@Override
	public int compareTo(Product2 p2) 
	{
		return this.productId().compareTo(p2.productId());
	}
	
}


public class TreeMapDemo3 {

	public static void main(String[] args) 
	{
	  TreeMap<Product2,String> map = new TreeMap<>();
	  map.put(new Product2(333, "Camera"), "Hyderabad");
	  map.put(new Product2(111, "Mobile"), "Indore");
	  map.put(new Product2(222, "Laptop"), "Kolkata");
	  map.put(new Product2(444, "Headphone"), "Mumbai");
	  
	  map.forEach((k,v)-> System.out.println("Key is :"+k+" value is :"+v));

	}

}
