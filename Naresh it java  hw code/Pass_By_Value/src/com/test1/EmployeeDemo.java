package com.test1;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		modifySalary(e1);
		System.out.println(e1.getEmployeeSalary());
	}
	

	public static void modifySalary(Employee emp)
	{
		emp.setEmployeeSalary(90000);
	}

}

//Note : Same object is refered by multiple reference variable so it is a shallow copy concept hence we will get the output 90000
