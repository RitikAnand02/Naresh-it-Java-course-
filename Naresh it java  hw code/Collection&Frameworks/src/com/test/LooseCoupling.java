package com.test;

//How to convert one collection object to another collection 
//object :


import java.util.ArrayList;
import java.util.Vector;

public class LooseCoupling {

	public static void main(String[] args)
	{
		ArrayList<String> cityName = new ArrayList<>();
		cityName.add("Hyd");
		cityName.add("Bglr");
		cityName.add("Kolkata");
		
		//Convert this ArrayList into Vector
		Vector<String> listOfCity = new Vector<>(cityName);
		System.out.println(listOfCity);
		

	}

}

//Note : Vector class has provided a constructor which accepts Collection as a parameter where we can assign any Collection interface implemented class object as shown in the above program.