package com.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo3 
{
    public static void main(String[] args)
    {
        ZoneId ausTimeZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime aus = ZonedDateTime.now(ausTimeZone);        
        System.out.println("Current Date and Time in Australia Time Zone: " + aus);
        
              
        
        ZoneId canadaTimeZone = ZoneId.of("Canada/Atlantic");
        ZonedDateTime canada = ZonedDateTime.now(canadaTimeZone);        
        System.out.println("Current Date and Time in Canada Time Zone: " + canada);
        
        
    }
}

//Note : The abstract class ZoneId provides a static method of() which accept String ZoneId as a parameter and returns ZoneId class.