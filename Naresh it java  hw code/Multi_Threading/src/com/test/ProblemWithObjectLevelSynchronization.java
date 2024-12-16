package com.test;

class PrintTable
{
	    public synchronized void printTable(int n)
	    {
	       for(int i=1; i<=10; i++)
	       {
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	    	   try
	    	   {
	    		   Thread.sleep(500);
	    	   }
	    	   catch(Exception e)
	    	   {	    		   
	    	   }
	       }
	       System.out.println(".......................");
	    }	
}

public class ProblemWithObjectLevelSynchronization
{
	public static void main(String[] args) 
	{
		
		PrintTable pt1 = new PrintTable(); //lock1		
		PrintTable pt2 = new PrintTable(); //lock2	
				
		Thread t1 = new Thread()  //Anonymous inner class concept
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(2);	//lock1
			       }			   
				};
		       	        
		        Thread t2 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(3);	//lock1
			       }			   
				};
		                
		        Thread t3 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(8);	//lock2
			       }			   
				};
		               
		        Thread t4 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(9); //lock2
			       }			   
				};
				 t1.start();	t2.start();	 t3.start();  t4.start(); 
	}
}

//Note : So, It is clear that synchronization logic will not work with multiple Objects.
