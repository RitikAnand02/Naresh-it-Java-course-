package com.test3;

import java.util.Scanner;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;

  
    public Product(int productId, String productName, double productPrice, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public static Product getProductObject() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Product Quantity: ");
        int qty = scanner.nextInt();

        return new Product(id, name, price, qty);
    }

   
    public void applyDiscount(double percentage) {
        if (percentage <= 0 || percentage >= 100) {
            System.err.println("Invalid discount percentage. Please provide a value between 0 and 100.");
            return; 
        }

        double discountAmount = (this.productPrice * percentage) / 100;
        double discountedPrice = this.productPrice - discountAmount;

        System.out.println("Original Price: $" + this.productPrice);
        System.out.println("Discount Percentage: " + percentage + "%");
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    
    @Override
    public String toString() {
        return "Product [productId=" + productId + 
               ", productName=" + productName + 
               ", productPrice=" + productPrice + 
               ", productQuantity=" + productQuantity + "]";
    }
}
