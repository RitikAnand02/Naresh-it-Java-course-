package com.test16;

class Developer extends Employee
{
	public Developer(double salary) 
	{		
		super(salary);		
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + "]";
	}	
}
