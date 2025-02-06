package com.test1;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Finding the Employee with the Highest Salary

record Employee(Integer employeeId, String employeeName, Double employeeSalary)
{	
}

public class MaxDemo2 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(111, "Aman", 23000D);
		Employee e2 = new Employee(222, "Ramesh", 24000D);
		Employee e3 = new Employee(333, "Suraj", 25000D);
		Employee e4 = new Employee(444, "Raj", 26000D);
		Employee e5 = new Employee(555, "Scott", 46000D);
		
		Stream<Employee> streamOfEmployees = Stream.of(e1,e2,e3,e4,e5);
		
		Optional<Employee> max = streamOfEmployees.max(Comparator.comparingDouble(Employee::employeeSalary));
		
		if(max.isPresent())
		{
			System.out.println("Employee Having Maximum Salary is :"+max.get());
		}
		else
		{
			System.out.println("No record Available");
		}		
		
	}

}
