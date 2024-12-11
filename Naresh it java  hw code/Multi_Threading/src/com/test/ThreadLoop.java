package com.test;

class Sample extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name+" thread");
		}
		
		
	}
	
}

public class ThreadLoop 
{	
	public static void main(String[] args) 
	{	
	    Sample s1 = new Sample();
	    s1.start();
	   
        String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name+" Thread");
		}
		
		int x = 1;
		do
		{
			System.out.println("Enjoy Multithreading by "+name+ " Thread");
			
			x++;
		}
		while(x<=10);
		
	}
}

//Note : Here processor is frequently switching from main thread to Thread-0 thread so output is un-predicatable
