package com.test;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{		
	      try  //outer try
	      {
	    	    String x = "null";
	    	    System.out.println("It's length is :"+x.length());
	    	        
		    	  try  //inner try
		    	  {
		    		 String y = "NIT"; 
		    		 int z = Integer.parseInt(y);
		    		 System.out.println("z value is :"+z);	    				    		  
		    	  }
		    	  catch(NumberFormatException e)
		    	  {
		    		System.err.println("Number is not in a proper format");  
		    	  }
	      }
	      catch(NullPointerException e)
	      {
	    	  System.err.println("Null pointer Problem"); 	    	 
	      }	      
	}
}
