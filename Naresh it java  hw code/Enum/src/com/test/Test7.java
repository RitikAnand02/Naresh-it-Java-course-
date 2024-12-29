package com.test;

//values() to get all the values of enum

class Test7 
{
	enum Season   
	{
	SPRING, SUMMER, WINTER, FALL, RAINY
	}

	public static void main(String[] args) 
	{
		Season[] seasons = Season.values();
		
		for(Season season : seasons)
		{
			System.out.println(season);
		}
		
		
		
	}
}

//values() method added by compiler, is used to fetch all the enum constants.