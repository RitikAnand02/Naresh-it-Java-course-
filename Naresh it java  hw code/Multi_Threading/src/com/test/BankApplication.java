package com.test;

class Customer2
{
	private double availableBalance = 20000;	
	private double withdrawAmount;
	
	public Customer2(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(withdrawAmount<= availableBalance)
		{
			name = Thread.currentThread().getName();
			System.out.println(withdrawAmount+ " Amount, withdraw by :"+name);
			availableBalance = availableBalance - withdrawAmount;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" you have insufficient Balance");
		}		
	}
	
}

public class BankApplication {

	public static void main(String[] args) 
	{
		Customer2 obj = new Customer2(20000);
		
		Runnable r1 = ()-> 
		{
		  obj.withdraw();
		};
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();  
			
		t2.start();
	}

}

//Note : Here both the thread will get the balance.
