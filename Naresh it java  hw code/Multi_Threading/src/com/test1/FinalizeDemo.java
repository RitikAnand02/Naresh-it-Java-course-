package com.test1;

class Student
{
	private Integer studentId;
	private String studentName;
	public Student(Integer studentId, String studentName)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	@Override
	public void finalize()
	{
	  System.out.println("Finalize method is invoked");	
	}	
}
public class FinalizeDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Student s1 = new Student(111, "Raj");		
		System.out.println(s1);
		
		s1 = null;
		
		System.gc();  //calling garbage collector explicitly
		
		Thread.sleep(4000);
		
		System.out.println(s1);
		

	}

}

//Note : If Student object is eligible for GC then JVM will defnetly call finalize() method of Student class.
