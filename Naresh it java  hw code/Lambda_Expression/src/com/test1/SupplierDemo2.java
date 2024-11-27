package com.test1;

import java.util.Scanner;
import java.util.function.Supplier;

record Product(int productId, String productName, double productPrice)
{
	
}

public class SupplierDemo2 {

	public static void main(String[] args) 
	{
		Supplier<Product> s2 = () ->
		{
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Product Id :");
		   int id = sc.nextInt();
		   
		   System.out.print("Enter Product Name :");
		   String name = sc.nextLine();
		   name = sc.nextLine();
		   
		   System.out.print("Enter Product Price :");
		   double price = sc.nextDouble();
		   
		   return new Product(id, name, price);		   
		   
		};

		Product obj = s2.get();
		System.out.println(obj);
		
		
	}

}
