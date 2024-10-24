package com.test3;

 class Student {
	 protected String name;
	 protected int rollNumber;
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		if(rollNumber<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
	 
	public void displayDetails() {
		System.out.println("Student Name"+name);
		System.out.println("Student Roll Number"+rollNumber);
	}
	
	public double calculatePercentage() {
		return 0.0;
	}

}
