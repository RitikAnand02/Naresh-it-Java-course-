package com.test;

enum Month 
{
	JANUARY,FEBRUARY,MARCH 
} 
public class Test2
{
	enum Color { RED,BLUE,BLACK }   

    public static void main(String[] args) 
	{
		enum Week {SUNDAY, MONDAY, TUESDAY }
		
		System.out.println(Month.FEBRUARY);
		System.out.println(Color.RED);
		System.out.println(Week.SUNDAY);
	}
}

//We can write an enum inside a class, outside of the class and inside of the method.