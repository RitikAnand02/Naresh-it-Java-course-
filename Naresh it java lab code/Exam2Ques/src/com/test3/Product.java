package com.test3;

import java.util.Scanner;

public class Product {
  
    private int productId;
    private String productName;
    private double productPrice;


    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

  
    public static Product getProductObject() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        return new Product(id, name, price);
    }


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
    
    




}


