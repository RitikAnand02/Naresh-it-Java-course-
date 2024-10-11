package com.test5;

import java.util.Scanner;

public class InventoryDemo {

	public static void main(String[] args) {
		Inventory i1 = new Inventory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Game");
		String game = sc.nextLine();
		
		System.out.println("Enter developer");
		String developer = sc.nextLine();
		
		System.out.println("Enter Stock Quantity");
		int stockQuantity = sc.nextInt();
		
		i1.setInventoryDetails(game, developer, stockQuantity);
		
		System.out.println(i1.toString());
		sc.close();

	}

}
