package com.test7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double radius = sc.nextDouble();
		
		String areaOfCircle = Circle.getAreaOfCircle(radius);
		
		double area = Double.parseDouble(areaOfCircle);
		
		DecimalFormat df = new DecimalFormat("000.000");
		System.out.println("Area of Circle is :"+df.format(area));
		
		sc.close();
	
	}
}
