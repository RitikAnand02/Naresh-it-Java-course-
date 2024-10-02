package com.test4;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the length of the Rect :");
	  double length = sc.nextDouble();
	  
	  System.out.print("Enter the breadth of the Rect :");
	  double breadth = sc.nextDouble();
	  
	  
	  double areaOfRectangle = Rectangle.getAreaOfRectangle(length, breadth);
	  
	  System.out.println("Area of Rectangle is :"+areaOfRectangle);
	  sc.close();
	  
	}
}
