package com.test;

class Foo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thread is running...");
		System.out.println("It is running with separate stack");		
	}	
}
public class IsAlive 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread started...");
		
		Foo f1 = new Foo();
		System.out.println("Is Thread alive : "+f1.isAlive());
		f1.start();
		System.out.println("Thread is alive or not : "+f1.isAlive());
		
		f1.start();  //java.lang.IllegralThreadStateException
		
		System.out.println("Main Thread ended...");
		
		
	}
}
