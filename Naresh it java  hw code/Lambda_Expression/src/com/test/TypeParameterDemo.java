package com.test;

class Accept<T>   //T is Type Parameter
{	
	private T data;

	//Parameterized Constructor
	public Accept(T data)   //Student data
	{
		super();
		this.data = data;
	}

	//getter
	public T getData() 
	{
		return this.data;
	}	
}


public class TypeParameterDemo 
{
	public static void main(String[] args) 
	{
		Accept<Integer> accInt = new Accept<Integer>(12);
		System.out.println("Integer Object is :"+accInt.getData());
		
		Accept<Double> accDou = new Accept<Double>(23.89);
		System.out.println("Double Object is :"+accDou.getData());
		
		Accept<Boolean> accBool = new Accept<Boolean>(true);
		System.out.println("Boolean Object is :"+accBool.getData());
		
		Accept<Student> accStudent = new Accept<Student>(new Student());
		System.out.println("Student Object is :"+accStudent.getData());
	}

}

class Student
{
	@Override
	public String toString()
	{
		return "Student";
	}
}
