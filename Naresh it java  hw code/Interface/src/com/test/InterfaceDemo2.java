package com.test;

interface Bank
{
	void deposit(double deposit);
	void withdraw(double withdraw);
	double getBalance();
}
class Customer implements Bank
{
	private double balance;

	public Customer(double balance) 
	{
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double deposit) 
	{
		if(deposit <=0)
		{
		 System.err.println("Amount can't be deposited");
		}
		else
		{
			this.balance = this.balance + deposit;
			System.out.println("Amount after deposit is :"+this.getBalance());
		}
	}

	@Override
	public void withdraw(double withdraw)
	{
	  if(this.balance < withdraw)
	  {
		  System.err.println("Insufficient Balance..");
	  }
	  else
	  {
		  this.balance = this.balance - withdraw;
		  System.out.println("Amount after withdraw is :"+this.getBalance());
	  }		
	}

	@Override
	public double getBalance() 
	{
		return this.balance;
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) 
	{
	  Customer raj = new Customer(10000);
	  raj.deposit(1000);
	  raj.withdraw(3000);
	  
	}

}