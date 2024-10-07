package com.test2;

public class Student {
	int studentId;
	String studentName;
	int marks;
	char grade;

	public void setStudentData(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	public void calculateMarks() {

		if (this.marks >= 90) {
			this.grade = 'A';

		} else if ((this.marks < 90) && (this.marks >= 81)) {
			this.grade = 'B';
		}

		else if ((this.marks < 80) && (this.marks >= 71)) {
			this.grade = 'C';
		}

		else if ((this.marks < 70) && (this.marks >= 61)) {
			this.grade = 'D';
		} else {
			this.grade = 'E';
		}
	}

}
