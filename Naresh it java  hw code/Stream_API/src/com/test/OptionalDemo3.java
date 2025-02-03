package com.test;

//Replcing null by uisng Optional.empty()

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) 
	{
		List<Optional<String>> listOfcity = new ArrayList<>();
		
		listOfcity.add(Optional.of("Hyderabad"));
		listOfcity.add(Optional.of("Chennai"));
		listOfcity.add(Optional.of("Mumbai"));
		listOfcity.add(Optional.of("Nagpur"));
		listOfcity.add(Optional.empty());
		
		for(Optional<String> opt : listOfcity)
		{
			if(opt.isPresent())
			{
				System.out.println(opt.get());
			}
			else
			{
				System.out.println("No Value in the List");
			}		
			
		}

	}

}