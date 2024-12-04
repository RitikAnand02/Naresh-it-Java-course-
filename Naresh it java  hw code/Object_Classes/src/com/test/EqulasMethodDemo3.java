package com.test;

class Employee
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}	
	
	@Override
	public int hashCode()
	{
		return this.employeeId;
	}
	
	
	@Override
	public boolean equals(Object obj)  //obj =  m1
	{
		if(obj instanceof Employee)
		{
			Employee e2 = (Employee) obj;
			
			if(this.employeeId == e2.employeeId && this.employeeName.equals(e2.employeeName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.err.println("Comparison is not possible");
			return false;
		}
	}	
}
public class EqulasMethodDemo3 {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(111, "Smith");
		Manager m1 = new Manager(111, "Smith");
		
		System.out.println(emp1.equals(m1));
		System.out.println(emp1.equals(null));

	}

}

class Manager
{
	private int managerId;
	private String managerName;
	
	public Manager(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}
	
}

//Note : Here we are comparing Employee and Manager object so, comparison is not possible, to avoid this we can use instanceof operator.
