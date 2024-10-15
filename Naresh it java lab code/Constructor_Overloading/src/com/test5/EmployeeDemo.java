package com.test5;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Title");
		String title = sc.nextLine();
		
		System.out.println("Enter Employee Description");
		String desc = sc.nextLine();
		
		System.out.println("Enter Employee Priority");
		String priority = sc.nextLine();
		
		Employee e1= new Employee(title,desc, priority);
		e1.marksAsCompleted();
		sc.close();


	}

}
