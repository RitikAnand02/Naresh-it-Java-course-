package com.test;

import java.util.Optional;

public class OptionDemo1 {

	public static void main(String[] args) 
	{
		String str = null;  
		
		Optional<String> cont = Optional.ofNullable(str);		
		
		
		//orElse method
	    String val = cont.orElse("No value in the container by orElse");
	    System.out.println(val);
	    
	    System.out.println(".............");
	   
	    if(cont.isPresent())
	    {
	    	  String value = cont.get();
	    	  System.out.println("Value of the container :"+value);
	    }
	    else
	    {
	    	System.err.println("No Value in the container isPresent()");
	    }
	    
	    
	    
	}

}
