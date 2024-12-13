package com.test;

class MyTest extends Thread 
{	
	
	@Override
	public void run()  
	{		
		System.out.println("Child Thread id is :"+Thread.currentThread().getId());  
		
		for(int i=1; i<=5; i++) 
		{
			System.out.println("i value is :"+i); // 11  22  33  44
			try
			{
				Thread.sleep(1000);				
			}
			catch(InterruptedException e)
			{
				System.err.println("Thread has Interrupted");
			}
		}
	}
}
public class SleepDemo1 
{
	public static void main(String[] args) 
	{		
		System.out.println("Main Thread id is :"+Thread.currentThread().getId());  //1
		
		MyTest m1 = new MyTest();		
		MyTest m2 = new MyTest();
		
		m1.start();
		m2.start();			
	}
}
