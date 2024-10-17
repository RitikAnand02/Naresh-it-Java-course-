package com.test2;

public class ProductCopyConstructor {
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Laptop");
		System.out.println(p1);

		Product p2 = new Product(p1);
		System.out.println(p2);
	}

}
