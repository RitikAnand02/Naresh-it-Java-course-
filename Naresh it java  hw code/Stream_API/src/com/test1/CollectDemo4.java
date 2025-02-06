package com.test1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Department(Integer deptId, String deptName)
{	
}



record Employee1(Integer empId, String empName, double salary, Department dept)
{
	//111 , "A", 23890.89, new Department(1,"IT");
}



public class CollectDemo4 
{
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(111, "Raj", 23789.89, new Department(1, "IT"));
		Employee1 e2 = new Employee1(222, "Rahul", 23789.89, new Department(1, "IT"));
		Employee1 e3 = new Employee1(333, "Scott", 23789.89, new Department(2, "Sales"));
		Employee1 e4 = new Employee1(444, "Smith", 23789.89, new Department(2, "Sales"));
		Employee1 e5 = new Employee1(333, "Virat", 23789.89, new Department(3, "HR"));
		Employee1 e6 = new Employee1(444, "Rohit", 23789.89, new Department(3, "HR"));
			
		
		Stream<Employee1> streamOfEmp = Stream.of(e1,e2,e3,e4,e5,e6);		
		
		Map<Department, List<Employee1>> deptWiseEmp = streamOfEmp.collect(Collectors.groupingBy(Employee1::dept));
		
		deptWiseEmp.forEach((dep, emps)-> System.out.println(dep+" : "+emps));
		
	}

}
