package com.test1;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Objects: ");
         int noOfObject = sc.nextInt();	
		for(int i=1 ; i<=noOfObject ; i++)
		{
			Employee Object = Employee.getEmployeeObject();
			System.out.println(Object);
		}
		sc.close();

	}

}
