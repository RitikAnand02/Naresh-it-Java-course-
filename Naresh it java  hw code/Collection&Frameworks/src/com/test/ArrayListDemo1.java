package com.test;

import java.util.ArrayList;

record Customer(Integer custId, String custName, Double custSal)
{	
}

public class ArrayListDemo1
{
	public static void main(String[] args) 
	{
		var listofCustomers = new ArrayList<Customer>();
		listofCustomers.add(new Customer(111, "Scott", 123456D));
		listofCustomers.add(new Customer(222, "Smith", 123456D));
		listofCustomers.add(new Customer(333, "Martin", 123456D));
		listofCustomers.add(new Customer(444, "John", 123456D));
	   
		listofCustomers.forEach(System.out::println);
	   
	}
}
