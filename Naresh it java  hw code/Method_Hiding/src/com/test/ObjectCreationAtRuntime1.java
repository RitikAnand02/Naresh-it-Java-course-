package com.test;

class Employee
{
  public void mySalary()
  {
	 System.out.println("Employee Salary is 20K");
  }
}

class Developer
{
  public void mySalary()
  {
	 System.out.println("Developer Salary is 70K");
  }
}
class Designer
{
  public void mySalary()
  {
	 System.out.println("Designer Salary is 40K");
  }
}
public class ObjectCreationAtRuntime1 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance();
		
		if(obj instanceof Employee)
		{
			Employee emp = (Employee) obj;
		    emp.mySalary();
		}
		else if(obj instanceof Developer)
		{
			Developer dev = (Developer) obj;
		    dev.mySalary();
		}
		else if(obj instanceof Designer)
		{
			Designer des = (Designer) obj;
		    des.mySalary();
		}
		
	}
}

//Note : Creating the object by using newInstance() method and calling the non static method of the corresponding class.
