package com.test;

//Program that describes Exception propagation with Checked Exception

import java.io.IOException;

public class ExceptionPropagationWithChecked 
{
	public static void main(String[] args) 
	{
	 System.out.println("Main method started..."); 
	 try
	 {
		 m1();
	 }
	 catch(IOException e)
	 {
		 System.out.println("Handled in main");
	 }
	 System.out.println("Main method ended...");
  }

	public static void m1() throws IOException
	{
		System.out.println("M1 method started..."); 
		m2();
		System.out.println("M1 method ended...");
	}

	public static void m2() throws IOException
	{
	   throw new IOException();	
	}
}