package com.test;

//ordinal() to find out the order position

class Test8
{
	static enum Season   
	{
	SPRING, SUMMER, WINTER, FALL, RAINY
	}


	public static void main(String[] args) 
	{
		Season seasons[] = Season.values();
		
		for(Season season : seasons)
		{
			System.out.println(season.name()+" order position is :"+season.ordinal());
		}		
	}
}

//ordinal() is used to retirn the order position of enum constants.