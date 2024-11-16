package com.test3;

public class Main {
    public static void main(String[] args) {
      
        Product[] products = new Product[5];

   
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            products[i] = Product.getProductObject();
            System.out.println(); 
        }

     
        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println(product);
        }
        
        
    }
}
