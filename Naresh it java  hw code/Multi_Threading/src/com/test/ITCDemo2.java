package com.test;

class Test extends Thread
{
	private int val = 0;
	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)  //i = 
		{
			val = val + i;        //val = 1    3    6   10    15
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
	}
	
	public int getVal()
	{
		return this.val;
	}	
}

public class ITCDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread Started...");
       
       Test t1 = new Test();
       t1.start();
       
       Thread.sleep(200);
       
       System.out.println(t1.getVal());
	}

}

//Note : In the above program, there is no co-ordination between 
//main thread and child thread so the value of val will change based on loop iteration.
