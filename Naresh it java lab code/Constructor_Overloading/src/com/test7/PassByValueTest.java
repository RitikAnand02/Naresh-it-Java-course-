package com.test7;

 class Example_1{
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


public class PassByValueTest 
{
	public static void main(String[] args) 
	{
		Example_1 c1 = new Example_1();	
	  
	  updateCustomerBill(c1);
	  System.out.println(c1.getBill());
	}
	
	public static void updateCustomerBill(Example_1 cust)
	{
		cust.setBill(1800);
	}

}
