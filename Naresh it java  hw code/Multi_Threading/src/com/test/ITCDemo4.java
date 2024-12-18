package com.test;

class Customer3
{
	private double balance = 10000;
	
	public synchronized void withdraw(double amount)
	{
		System.out.println("Withdraw is in progress..");
		
		if(amount> this.balance)
		{
			System.out.println("Balance is low, waiting for deposit");
			try
			{
				wait();
				System.out.println("Got Notification");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.balance = this.balance - amount;
		System.out.println("Amount after withdraw is :"+this.balance);
	}
	
	public synchronized void deposit(double amount)
	{
		System.out.println("Deposit is in progress...");
		this.balance = this.balance + amount;
		System.out.println("Balance after deposit is :"+this.balance);
		System.out.println("Sending notification to withdraw amount");
		notify();		
	}
	
}

public class ITCDemo4 {

	public static void main(String[] args)
	{
		Customer3 obj = new Customer3();
		
		Thread son = new Thread()
		{
		   @Override
		   public void run()
		   {
			   obj.withdraw(10000);
		   }
		   
		};
		son.start();
		
		Thread father = new Thread()
		{
			   @Override
			   public void run()
			   {
				   obj.deposit(10000);
			   }
		};
		
		father.start();
				
	}

}
