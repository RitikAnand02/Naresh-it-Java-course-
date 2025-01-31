package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record MyEmp(Integer id, String name, Double salary)
{
	
}

public class MapDemo1 
{
	public static void main(String[] args)
	{
		ArrayList<MyEmp> listOfEmp = new ArrayList<>();
		listOfEmp.add(new MyEmp(1, "Scott", 800D));
		listOfEmp.add(new MyEmp(2, "Smith", 1200D));
		listOfEmp.add(new MyEmp(3, "Alen", 1500D));
		listOfEmp.add(new MyEmp(4, "Martin", 1800D));
		listOfEmp.add(new MyEmp(5, "John", 2000D));

		System.out.println("Original Employee Data with Old Salary");
		listOfEmp.forEach(System.out::println);
		
		//add 500D in the salary for all the Employees
		List<Double> collect = listOfEmp.stream().map(emp -> emp.salary()+500).collect(Collectors.toList());
		
		System.out.println("Employee Data after Salary updation");
		collect.forEach(System.out::println);
		
		
	}

}
