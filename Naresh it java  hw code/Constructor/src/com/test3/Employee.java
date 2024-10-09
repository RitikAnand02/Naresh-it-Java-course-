package com.test3;

public class Employee {
	 private String employeeName;
		private double employeeSalary;
		
		public Employee(String employeeName, double employeeSalary) {
			super();
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}

		public String getEmployeeName() //getter
		{
			return employeeName;
		}

		public void setEmployeeName(String employeeName) //setter
		{
			this.employeeName = employeeName;
		}

		public double getEmployeeSalary() //getter
		{
			return employeeSalary;
		}

		public void setEmployeeSalary(double employeeSalary) //setter
		{
			this.employeeSalary = employeeSalary;
		}

		@Override
		public String toString() 
		{
			return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + "]";
		}

}
