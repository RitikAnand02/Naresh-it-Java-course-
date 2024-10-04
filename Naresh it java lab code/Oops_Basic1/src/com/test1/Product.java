package com.test1;

import java.util.Scanner;

public class Product {
	int productid;
	String productname;
	double productprice;

	public void setProductData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product Id is: ");

		productid = sc.nextInt();

		System.out.print("Enter Product Name is: ");

		productname = sc.next();

		System.out.print("Enter Product Price is: ");

		productprice = sc.nextDouble();
		sc.close();
	}

	public void getProductInfo() {
		System.out.println("The Product is: " + productid);
		System.out.println("The Name is: " + productname);

		System.out.println("The Price is: " + productprice);

	}
}
