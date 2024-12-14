package com.test;

public class AnonymousDemo1 {

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() 
		{			
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Current Thread Name is :"+name);
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		
	}

}
