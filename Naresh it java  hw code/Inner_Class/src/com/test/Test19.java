package com.test;

class Test19 
{
	public static void main(String[] args) 
	{
        //Anonymous class with Runnable
		Runnable r1 = new Runnable()
		{			
			@Override
			public void run()
			{
                System.out.println("Run method implementation inside Runnable");
			}
		};
             Thread obj = new Thread(r1);
			 obj.start();



        //Anonymous Thread class with reference
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
                System.out.println("Anonymous Thread class with reference...");
			}
		};
		t1.start();
		
        //Anonymous Thread class without reference
        new Thread()
		{
			@Override
			public void run()
			{
                System.out.println("Anonymous Thread class without reference...");
			}
		}.start();
	}
}