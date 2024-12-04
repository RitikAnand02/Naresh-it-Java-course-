package com.test;

//According to our application requirement we can provide multiple try-catch in my application to work with multiple execptions.

public class MultipleTryCatch 
{
	public static void main(String[] args) 
	{
	  System.out.println("Main method started!!!!");
	  
	  try
	  {
		  int arr[] = {10,20,30};
		  System.out.println(arr[3]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.err.println("Array index is out of limit!!!");
	  }
	  
	  try
	  {
		 String str = null;
		 System.out.println(str.length());
	  }
	  catch(NullPointerException e)
	  {
		  System.err.println("ref variable is pointing to null");
	  } 
	  
	  System.out.println("Main method ended!!!!");	
	}
}

//Note : Here we are getting all the execptions messages through catch blocks at a time so it is not a better approach from client point of view, We should always provide only one error message to our client