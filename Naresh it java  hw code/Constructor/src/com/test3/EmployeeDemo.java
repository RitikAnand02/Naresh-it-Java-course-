package com.test3;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee scott = new Employee("Scott", 50000);
		System.out.println(scott);
		
		
		
		scott.setEmployeeSalary(scott.getEmployeeSalary()+30000);
		System.out.println(scott);
		
		/*Based on following salary criteria we will decide whether 
		scott is a developer OR Designer OR Tester
		salary >= 75000  [Developer]
		salary >= 40000  [Designer]
		salary >=250000  [Tester]
        */
		
		double empSal = scott.getEmployeeSalary();
		String empName = scott.getEmployeeName();
		
		if(empSal >=75000)
		{
			System.out.println(empName+" is a Developer");
		}
		else if(empSal >=40000)
		{
			System.out.println(empName+" is a Designer");			
		}
		else
		{
			System.out.println(empName+" is a Tester");			
		}
	}

}
