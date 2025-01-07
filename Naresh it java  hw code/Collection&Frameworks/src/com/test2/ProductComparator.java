package com.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductComparator 
{
	public static void main(String[] args)
	{
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(444, "Mobile"));
		listOfProduct.add(new Product(333, "Smart Phone"));
		listOfProduct.add(new Product(222, "Laptop"));
		listOfProduct.add(new Product(111, "Camera"));
		
		System.out.println("Original Data :");
		listOfProduct.forEach(System.out::println);
		
		//Anonymous class for Comparator
		Comparator<Product> compId = new Comparator<Product>() 
		{			
			@Override
			public int compare(Product p1, Product p2) 
			{				
				return p1.productId().compareTo(p2.productId());
			}
		};
		
		Collections.sort(listOfProduct, compId);
		System.out.println("Sorting the Product Object using ID :");
		listOfProduct.forEach(System.out::println);
		
		System.out.println("Sorting the Data by using name :");		
		
		Collections.sort(listOfProduct,(p1,p2)-> p1.productName().compareTo(p2.productName()));
		listOfProduct.forEach(System.out::println);
		
		
	}

}
