package com.test;

class DoStuff extends Thread  
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running Here!!!!");
	}
}
public class ThreadName 
{
	public static void main(String[] args) 
	{
		DoStuff t1 = new DoStuff(); 
		DoStuff t2 = new DoStuff(); 
		
		t1.start();			
		t2.start();	
		
			
	System.out.println(Thread.currentThread().getName()+" thread is running.....");
	}
}

//Note :- If we don't provide our user-defined name for the thread then by default the name would be Thread-0, Thread-1, Thread-2 and so on.
