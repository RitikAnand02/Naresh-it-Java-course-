package com.test4;

//Sort the data by using Comparator interface :

import java.util.TreeSet;

record Product(Integer productId, String productName) 
{
	
}

public class TreeSetDemo3 {

	public static void main(String[] args) 
	{
		TreeSet<Product> ts1 = new TreeSet<>((p1,p2)->p1.productName().compareTo(p2.productName()));
		ts1.add(new Product(333,"Laptop"));
		ts1.add(new Product(222,"Camera"));
		ts1.add(new Product(111,"Mobile"));
		
		System.out.println(ts1);

	}

}
