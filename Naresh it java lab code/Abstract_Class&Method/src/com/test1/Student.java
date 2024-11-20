package com.test1;

public abstract class Student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	
	abstract public int getPercentage();
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}
	public Student() {
		super();
	}
	public Student(String studentName, String studentClass) {
		super();
		if(totalNoOfStudents<0) {
			System.err.println("Total No Of Students Cannot Be Negative ");
			System.exit(0);
		}
		else {
		this.studentName = studentName;
		this.studentClass = studentClass;
		 totalNoOfStudents++;
		}
	}

}
