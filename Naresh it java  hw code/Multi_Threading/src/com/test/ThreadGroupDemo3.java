package com.test;

class TatkalTicket implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Tatkal ticket booked by :"+name);
		
	}
	
}

class PremiumTatkal implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Premium Tatkal ticket booked by :"+name);
		
	}	
}

public class ThreadGroupDemo3 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg1 = new ThreadGroup("Tatkal Ticket");		
		ThreadGroup tg2 = new ThreadGroup("Premium Tatkal");
		
		Thread t1 = new Thread(tg1,new TatkalTicket(), "Scott");		
		Thread t2 = new Thread(tg2,new PremiumTatkal(), "Smith");
		
		t1.start(); t2.start();		

	}

}
