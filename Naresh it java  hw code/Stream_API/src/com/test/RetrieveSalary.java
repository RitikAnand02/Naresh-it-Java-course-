package com.test;

//Retrieve the employee salary from employee object

import java.util.ArrayList;

record Employee1(Integer empId, String empName, Double empSalary, Integer age)
{
	
}

public class RetrieveSalary {

	public static void main(String[] args) 
	{
		ArrayList<Employee1> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee1(111, "A", 70000D,24));
		listOfEmployees.add(new Employee1(222, "B", 60000D,26));
		listOfEmployees.add(new Employee1(333, "C", 45000D,23));
		listOfEmployees.add(new Employee1(444, "D", 65000D,28));
		listOfEmployees.add(new Employee1(555, "E", 55000D,29));
		
		System.out.println("Salary of all the employees :");
		listOfEmployees.stream().map(emp -> emp.empSalary()).forEach(System.out::println);
				
	}

}
