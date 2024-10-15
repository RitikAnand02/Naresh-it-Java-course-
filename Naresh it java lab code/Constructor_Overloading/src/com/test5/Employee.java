package com.test5;

public class Employee {
	private String tittle;
	private String desc;
	private String priority;
	public Employee(String tittle, String desc, String priority) {
		  if(tittle.length()==0 && priority.length()==0 && desc.length()==0) {
			  System.err.println("Fill the varaible first");
			  System.exit(1);
			  
		  }
		
		  else if(tittle.length()==0)
		{
			System.out.println("--------------------- 1");
			System.out.println("invalid tittle");
			System.err.println("Fill the title variables properly");
			System.exit(1);
		}
		else if(desc.length()==0)
		{
			System.out.println("--------------------- 2");
			System.out.println("invalid desc");
			System.err.println("Fill the desc variables properly");
			System.exit(1);
		}
		
		else {
		this.tittle = tittle;
		this.desc = desc;
		this.priority = priority;
		}
	}
	public String getTittle() {
		return tittle;
	}
	public String getDesc() {
		return desc;
	}
	public String getPriority() {
		return priority;
	}

	public void marksAsCompleted()
	{
		boolean task=isCompleted();
		if(task)
		{
			
			
			
		}
		else {
					System.out.println("Title ="+tittle);
					System.out.println("description ="+desc);
					System.out.println("priority ="+priority);
					System.out.println("is completed ="+task);
		}
		
	}

	public boolean isCompleted()
	{
		  boolean result=true;

		if(this.priority.equalsIgnoreCase("high"))
		{
			result=false;
		}
		else {
			System.err.println("Task is invalid");
		}
		  
		  return result;
	}
	@Override
	public String toString() {
		return "Employee [tittle=" + tittle + ", desc=" + desc + ", priority=" + priority + "]";
	}
}
