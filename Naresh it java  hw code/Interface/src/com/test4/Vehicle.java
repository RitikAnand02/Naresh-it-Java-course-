package com.test4;

public interface Vehicle 
{
    void run();
    void horn();
    
    default void digitalMeter()  //JDK 1.8
    {
    	System.out.println("Digital Meter Facility is coming soon..");
    }  
    
}
