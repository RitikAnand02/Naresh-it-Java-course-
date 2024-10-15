package com.test4;

import java.util.Scanner;

public class InventoryItemDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item name");
		String itemName=sc.nextLine();
		
		System.out.println("Enter the per unit price of item");
		double pricePerUnit=sc.nextDouble();
		
		System.out.println("Enter the quantity in stock");
		int quantityInStock=sc.nextInt();
		
		InventoryItem item =new InventoryItem(itemName, pricePerUnit, quantityInStock);
		
		double result=item.calculateTotalValue();
		System.out.println(item);
		System.out.println("total value is "+result);
		sc.close();
		

	}

}
