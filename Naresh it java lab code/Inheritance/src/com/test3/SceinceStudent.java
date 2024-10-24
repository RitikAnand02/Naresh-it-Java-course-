package com.test3;

 class SceinceStudent extends Student{
	 private int physicsMarks;
	 private int chemistryMarks;
	 private int mathMarks;
	public SceinceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
		if(rollNumber<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(physicsMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(chemistryMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(mathMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
	 
    public void displayDetails() {
    	System.out.println("Student Name"+name);
		System.out.println("Student Roll Number"+rollNumber);
		System.out.println("Student Physics Marks"+physicsMarks);
		System.out.println("Student Chemistry Marks"+chemistryMarks);
		System.out.println("Student Math Marks"+mathMarks);
		
    }
    
    public double calculatePercentage() {
    	double percentage = (this.physicsMarks+this.chemistryMarks+this.mathMarks)/3; 
    	return percentage;
    }

}
