package com.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class Demo4 
{	
  public static void main(String[] args) 
  {
	LocalDateTime now = LocalDateTime.now();
	System.out.println(now);
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
	
	String formattedDateTime = now.format(formatter);
	System.out.println("Formatted DateTime: " + formattedDateTime);
  }
}