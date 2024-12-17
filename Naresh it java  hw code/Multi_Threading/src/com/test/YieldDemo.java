package com.test;

class MyThread implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i+" by "+name);
			
			if(name.equals("Child1"))
			{
				Thread.yield();
			}
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) 
	{
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt, "Child1");
		Thread t2 = new Thread(mt, "Child2");
		
		t1.start();  t2.start();
		

	}

}
