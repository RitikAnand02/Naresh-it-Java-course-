package com.test;

//Working with Custom object

import java.util.Vector;

record MobileProduct(Integer productId, String productName)
{	
}

public class VectorDemo3
{
public static void main(String[] args) 
{
		Vector<MobileProduct> listOfProducts = new Vector<>();
		listOfProducts.add(new MobileProduct(444, "Apple"));
		listOfProducts.add(new MobileProduct(111, "Redmi"));
		listOfProducts.add(new MobileProduct(222, "Vivo"));
		listOfProducts.add(new MobileProduct(333, "Oppo"));
		
		listOfProducts.forEach(prod -> System.out.println(prod));
	
}
}