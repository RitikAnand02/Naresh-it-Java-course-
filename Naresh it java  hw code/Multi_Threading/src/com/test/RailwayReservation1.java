package com.test;

class Customer1 implements Runnable
{
   private int availableSeat = 1;   
   private int wantedSeat;  //1
   
	public Customer1(int wantedSeat) 
	{
	  super();
	  this.wantedSeat = wantedSeat;
    }
	
	@Override
	public synchronized void run() 
	{
		String name = null;	
		
		if(availableSeat >= wantedSeat)
		{
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat+" seat is reserved for "+name);
			availableSeat = availableSeat - wantedSeat;			
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" seat is not available");
		}
		
		
	}
	
}

public class RailwayReservation1 {

	public static void main(String[] args) throws InterruptedException 
	{
	   Customer1 c1 = new Customer1(1);
	   
	   Thread t1 = new Thread(c1,"Scott");
	   Thread t2 = new Thread(c1,"Smith");
	   
	   t1.start();
	   
	  	   
	   t2.start();

	}

}
