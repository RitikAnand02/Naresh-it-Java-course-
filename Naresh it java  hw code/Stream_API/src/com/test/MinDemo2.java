package com.test;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Finding the minimum age of Employee

record Employee7(Integer age, String name)
{
	
}


public class MinDemo2 
{
	public static void main(String[] args)
	{		
		Employee7 e1 = new Employee7(23, "Scott");
		Employee7 e2 = new Employee7(29, "Smith");
		Employee7 e3 = new Employee7(21, "John");
		Employee7 e4 = new Employee7(18, "Martin");
		
		
		
		
		Stream<Employee7> streamOfEmployee = Stream.of(e1,e2,e3,e4);
		
		Optional<Employee7> min = streamOfEmployee.min(Comparator.comparingInt(Employee7::age));
		
		
		
		min.ifPresent(System.out::println);
	}

}
