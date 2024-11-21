package com.test5;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Food Item And Food Method: ");
	        int n = Integer.parseInt(scanner.nextLine()); 

	        for (int i = 0; i < n; i++) {
	            String foodName = scanner.nextLine(); 
	            Food food;

	           
	            if (foodName.equalsIgnoreCase("Egg")) {
	                food = new Egg(6.0, 5.0, 0.5); 
	            } else if (foodName.equalsIgnoreCase("Bread")) {
	                food = new Bread(4.0, 1.1, 13.8); 
	            } else {
	                System.out.println("Unknown food item.");
	                continue;
	            }

	            
	            String method1 = scanner.nextLine();
	            if (method1.equalsIgnoreCase("getType")) {
	                System.out.println(foodName + " is " + food.getType());
	            }

	            String method2 = scanner.nextLine();
	            if (method2.equalsIgnoreCase("getMacros")) {
	                food.getMacroNutrients();
	            }

	            String method3 = scanner.nextLine();
	            if (method3.equalsIgnoreCase("getTaste")) {
	                System.out.println("Taste: " + food.getTaste());
	            }
	        }

	        scanner.close();

	}

}
