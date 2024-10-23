package com.test16;

class Designer extends Employee
{
	public Designer(double salary) 
	{
		super(salary);		
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}	
}
