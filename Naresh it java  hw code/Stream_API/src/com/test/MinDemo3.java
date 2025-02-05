package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Finding the Cheapest Product

record Product2(Integer productId, String productName, Double productPrice)
{
	
}


public class MinDemo3 {

	public static void main(String[] args)
	{
		var p1 = new Product2(111, "Camera", 45000D);
		var p2 = new Product2(222, "Watch", 23000D);
		var p3 = new Product2(333, "HeadPhone", 2000D);
		var p4 = new Product2(444, "Keyboard", 500D);
		
		List<Product2> listOfProduct = List.of(p1,p2,p3,p4);
	
		Optional<Product2> min = listOfProduct.stream().
		        min(Comparator.comparingDouble(Product2::productPrice));
	
	
		min.ifPresent(System.out::println);
	
	}

}