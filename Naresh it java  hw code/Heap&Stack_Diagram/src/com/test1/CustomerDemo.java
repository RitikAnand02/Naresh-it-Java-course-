package com.test1;

class Customer
{
	private String name;
	private int id;

	public Customer(String name , int id) 
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)  //setter  
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return this.id;
	}
}

public class CustomerDemo
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer c = new Customer("Ravi",2);

        m1(c);   
		
		//GC [1 Object i.e 3000x is eligible for GC]
		
		System.out.println(c.getId());
	}

	public static void m1(Customer cust) 
	{
		cust.setId(5);

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());
	}
}  
    
//Output 9 5

//Note : String objects are not eligible for GC.