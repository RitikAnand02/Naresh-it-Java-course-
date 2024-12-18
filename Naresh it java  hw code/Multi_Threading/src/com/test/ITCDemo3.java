package com.test;

class Demo1 extends Thread
{
	private int val = 0;
	
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=1; i<=10; i++)
			{
				val = val + i;
			}
			System.out.println("Completed My task, Sending u notification");
			notify();		
		}
	}
	
	public int getVal()
	{
		return this.val;
	}
	
	
	
	
}

public class ITCDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{		
		Demo1 d1 = new Demo1();
		d1.start();
						
		synchronized(d1)
		{			
			System.out.println("main thread is waiting Here :");
			d1.wait();
			System.out.println("Main thread got notification :");
			System.out.println(d1.getVal());
		}
		
		
	}

}

//Note : Here we have co-ordination between main thread and child thread so we will get predicatable output.
