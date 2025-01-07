package com.test1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee(333, "Aryan"));
		listOfEmployee.add(new Employee(444, "Raj"));
		listOfEmployee.add(new Employee(222, "Zuber"));
		listOfEmployee.add(new Employee(111, "Satish"));
		
		Collections.sort(listOfEmployee);
		System.out.println("Sorting based on the Name :");
		listOfEmployee.forEach(System.out::println);
	}

}
