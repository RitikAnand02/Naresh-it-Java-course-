package com.test1;

public class Student {
	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private double average;
	public Student(String name, int id, String course, double fee,double average) {
		super();
		if(average<0) {
			System.err.println("Error: Average mark must be between 0 and 100.");
			System.exit(0);
		}
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
		this.average = average;
		
	}
	
	public Student(Student obj) {
		super();
		this.name = obj.name;
		this.id = obj.id;
		this.course = obj.course;
		this.fee = obj.fee;
        this.average= obj.average;
        this.grade=obj.grade;
		
	}
	
	public char calculateGrade() {
	
		 if(this.average>=90) {
			return this.grade='A';
		}
		else if(this.average>=80) {
			return this.grade='B';
		}
		else if(this.average>=70) {
			return this.grade='C';
		}
		else if(this.average>=60) {
			return this.grade='D';
		}
		else {
			return this.grade='F';
		}
	}
}
