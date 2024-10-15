package com.test3;

public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
	private String performance;
	public Employee(String name, int age, String department, double salary, String performance) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	public double updateSalary() {
		if(this.age <=0) {
			System.err.println(" Age must be a positive integer.");
			System.exit(0);
		}
		else if(this.performance=="good") {
			 this.salary = this.salary+10000;
		}
		else if(this.performance=="average") {
			 this.salary = this.salary+5000;
		}
			return this.salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
				+ ", performance=" + performance + "]";
	}
	
	

}
