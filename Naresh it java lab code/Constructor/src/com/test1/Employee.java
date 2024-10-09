package com.test1;

public class Employee {
	private String firstName;
	private String secondName;
	private int employeeId;
	private double Salary;
	private int noOfProject;
	public Employee(String firstName, String secondName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.employeeId = employeeId;
		this.Salary = salary;
		this.noOfProject = noOfProject;
	}
	 public void calculateSalary(){
		 if(this.noOfProject>5 && noOfProject<10)
		 {
			 this.Salary=this.Salary+5000;
		 }
		 else if(this.noOfProject>10 && noOfProject<20)
		 {
			 this.Salary=this.Salary+10000;
		 }
		 else {
			 this.Salary=this.Salary+15000;
		 }
		 
	 }
	
	
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", employeeId=" + employeeId
				+ ", Salary=" + Salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
	

}

