package com.test1;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	static String collegeName = "NIT";
	static String courseName = "Java";

	public void setStudentData(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress+", College Name is :"+Student.collegeName+", Course Name is "+Student.courseName
				+ "]";
	}
}
