package com.test;

public class AnonymousThreadWithReference 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println("Anonymous Thread name is :"+name);
			}
			
		};
		t1.start();
	}

}

