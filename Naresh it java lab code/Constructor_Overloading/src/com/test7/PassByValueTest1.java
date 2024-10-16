package com.test7;

class Customer
{
	private double bill = 1200;

	public void setBill(double bill) 
	{
		this.bill = bill;
	}
	
	public double getBill()
	{
		return this.bill;
	}
	
}


public class PassByValueTest1 
{
	public static void main(String[] args) 
	{
	  Customer c1 = new Customer();	
	  
	  updateCustomerBill(c1);
	  System.out.println(c1.getBill());
	}
	
	public static void updateCustomerBill(Customer cust)
	{
		cust = new Customer(); //Another Object
		cust.setBill(1800);
	}
	
}
