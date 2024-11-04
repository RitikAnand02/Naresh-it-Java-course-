package com.test2;

public class Shoping {
    public static void main(String[] args) {
    	  Order order = new Order("100", "Laptop");
          Customer customer = new Customer("James", "James@example.com", order);
          System.out.println(customer);
	}
}
