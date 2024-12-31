package com.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(int productId, String productName)
{
	
}

public class VectorDemo7 
{
	public static void main(String[] args) 
	{
		Vector<Product> listOfProduct = new Vector<>();
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Mobile"));
		listOfProduct.add(new Product(333, "Camera"));
		listOfProduct.add(new Product(444, "Bag"));
		listOfProduct.add(new Product(555, "Watch"));
		
		Enumeration<Product> elements = listOfProduct.elements();
		
		Iterator<Product> itr = elements.asIterator();
		itr.forEachRemaining(System.out::println);		
		
	}

}

//Note : From Java 8V, Iterator interface is also providing 
//       forEachRemaining(Consumer<T> cons).