package com.test2;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Employee employeeObject = Employee.getEmployeeObject();
			System.out.println(employeeObject);
		}
		sc.close();
	}

}
