package com.test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of products you want to add: ");
        int numOfProducts = scanner.nextInt();

     
        Product[] products = new Product[numOfProducts];

        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            products[i] = Product.getProductObject();
        }

      
        System.out.println("\nProduct Details:");
        for (Product product : products) {
            System.out.println(product);
        }

  
        System.out.print("\nEnter a discount percentage to apply to all products: ");
        double discountPercentage = scanner.nextDouble();

        System.out.println("\nApplying discount of " + discountPercentage + "% to all products:");
        for (Product product : products) {
            product.applyDiscount(discountPercentage);
        }

       
        scanner.close();
    }
}
