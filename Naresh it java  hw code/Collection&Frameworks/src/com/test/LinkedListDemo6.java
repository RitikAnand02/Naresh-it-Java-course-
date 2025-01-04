package com.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

record Product1(Integer productId, String productName)
{
	
}

public class LinkedListDemo6 {

	public static void main(String[] args)
	{
		List<Product1> listOfProduct = new LinkedList<Product1>();
		listOfProduct.add(new Product1(1, "ApplePhone"));
		listOfProduct.add(new Product1(2, "MiPhone"));
		listOfProduct.add(new Product1(3, "VivoPhone"));
		
		System.out.println("Is list empty :"+listOfProduct.isEmpty());
		
		Iterator<Product1> iterator = listOfProduct.iterator();
		iterator.forEachRemaining(prod -> System.out.println(prod.productName().toUpperCase()));
		
		
		String productName = listOfProduct.get(1).productName();
		System.out.println("1st position product name is :"+productName);
		
		
		

	}

}