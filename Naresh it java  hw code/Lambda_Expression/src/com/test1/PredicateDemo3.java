package com.test1;

//Using Predicate verify whether you are pass or fail in exam
//based on the marks input

import java.util.function.Predicate;

record Exam()
{
	public boolean passExam(int marks)
	{
		if(marks > 62)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class PredicateDemo3 {

	public static void main(String[] args) 
	{
		Predicate<Exam> p3 = exam -> exam.passExam(40);		
		System.out.println(p3.test(new Exam()));
	}

}
