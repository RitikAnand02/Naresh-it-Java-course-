package com.test6;
class Employee{
 	private String name;
 	public Employee(String name) {
  		this.name=name;  
 	}
}

public class Test3 {
 	public static void main(String[] Java) {
  		Employee e = new Employee("JavaDeveloper");
  		System.out.println("Emp Name : "+e.name);
 	}

}
