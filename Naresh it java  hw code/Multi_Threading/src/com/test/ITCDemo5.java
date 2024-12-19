package com.test;

class TicketSystem 
{
    private int availableTickets = 5;   //availableTickets = 3
    
    public synchronized void bookTicket(int numberOfTickets) //numberOfTickets 4 
    {
        while (availableTickets < numberOfTickets) //5 < 4
        {
           System.out.println("Not enough tickets available, Waiting for cancellation...");
            try 
            {
                wait(); 
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        availableTickets = availableTickets - numberOfTickets;  
        
        System.out.println("Booked " + numberOfTickets + " ticket(s). Remaining tickets: " + availableTickets);
        notify(); 
              
    }

    
  public synchronized void cancelTicket(int numberOfTickets)//numberOfTickets 3 
    {
        availableTickets = availableTickets + numberOfTickets;
        System.out.println("Canceled " + numberOfTickets + " ticket(s). Available tickets: " + availableTickets);
        notify(); 
    }
}


public class ITCDemo5 
{
    public static void main(String[] args) 
    {
        TicketSystem ticketSystem = new TicketSystem(); //lock is available

        Thread bookingThread = new Thread()
        {
        	@Override
            public void run() 
        	{
                int[] ticketsToBook = {2, 4, 4};  
                
                for (int ticket : ticketsToBook) //ticket = 1
                {
                    ticketSystem.bookTicket(ticket);
                    try 
                    {
                        Thread.sleep(1000); // give some time b/w booking
                    } 
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
        	 }        	
        };
        bookingThread.start();
        
        Thread cancellationThread = new Thread()
       	{
        	@Override
            public void run() 
        	{
                int[] ticketsToCancel = {1, 3, 2};
                for (int ticket : ticketsToCancel) //ticket = 3
                {
                    ticketSystem.cancelTicket(ticket);
                    try 
                    {
                        Thread.sleep(1500);  // give some time b/w cancellation
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        cancellationThread.start();
        
        
        
        
    }
}
