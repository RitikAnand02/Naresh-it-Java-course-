package com.test;

public class InfinityFloatingPoint 
{	
	public static void main(String[] args) 
	{
	   System.out.println("Main Started");
	   System.out.println(10/0.0); //Infinity
	   System.out.println(-10/0.0); //-Infinity
	   System.out.println(0/0.0);  //NaN
	   System.out.println(10/0); 
	   System.out.println("Main Ended");
	}

}
