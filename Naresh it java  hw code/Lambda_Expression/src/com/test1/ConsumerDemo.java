package com.test1;

import java.util.function.Consumer;

record Employee()
{
	
}

public class ConsumerDemo {

	public static void main(String[] args) 
	{
		Consumer<Integer> c1 =  num -> System.out.println("Integer Object : "+num);
		c1.accept(12);
		
		Consumer<Double>  c2 = num -> System.out.println("Double Object :"+num);
		c2.accept(23.89);
		
	   Consumer<Employee> c3 = emp -> System.out.println("Employee Object :"+emp);	
		c3.accept(new Employee());
		

	}

}
