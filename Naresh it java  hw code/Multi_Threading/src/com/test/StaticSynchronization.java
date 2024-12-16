package com.test;

//Program on static synchronization :

class MyTable     
{
	 public static synchronized void printTable(int n)  //static synchronization
	    {
	       for(int i=1; i<=10; i++)
	       {
	    	   try
	    	   {
	    		   Thread.sleep(100);
	    	   }
	    	   catch(InterruptedException e)
	    	   {
	    		  System.err.println("Thread is Interrupted...");
	    	   }
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	       }
	       System.out.println("------------------------");
	    }
}
public class StaticSynchronization 
{
	public static void main(String[] args)
	{
			        Thread t1 = new Thread()
					{
				      @Override
				      public void run()
				      {
				    	 MyTable.printTable(5); 
				      }
					};		
					
					Thread t2 = new Thread()
					{
				      @Override
				      public void run()
				      {
				    	  MyTable.printTable(10);
				      }
					};										

					Runnable r3 = ()-> MyTable.printTable(15);
					Thread t3 = new Thread(r3);
					
					t1.start();
					t2.start();	
					t3.start();
					
		}
}
