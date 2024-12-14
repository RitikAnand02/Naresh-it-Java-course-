package com.test;

public class AnonymousDemo2 {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable() 
		{			
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Current Thread Name is :"+name);
				
			}
		});
		
		t1.start();	
		
	}

}
