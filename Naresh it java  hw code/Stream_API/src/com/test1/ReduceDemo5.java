package com.test1;

//Finding the total sale amount 

import java.util.stream.Stream;

record Sale(String item, Double amount)
{
	
}

public class ReduceDemo5 
{
	public static void main(String[] args) 
	{
		Stream<Sale> sales = Stream.of(
	            new Sale("Camera", 10000.0),
	            new Sale("Mobile", 50000.0),
	            new Sale("Laptop", 80000.0),
	            new Sale("LED", 20000.0)
	        );
		
		Double totalSale = sales.reduce(0.0, (sum , sale)-> sum + sale.amount(),Double::sum);
		
		System.out.println("Total Sale for today is :"+totalSale);
		
		
		
	}

}