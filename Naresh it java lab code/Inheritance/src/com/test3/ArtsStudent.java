package com.test3;

 class ArtsStudent extends Student{
	 private int historyMarks;
	 private int geographyMarks;
	 private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
		if(rollNumber<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(historyMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(geographyMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else if(englishMarks<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
	 
	 public void displayDetails() {
	    	System.out.println("Student Name"+name);
			System.out.println("Student Roll Number"+rollNumber);
			System.out.println("Student History Marks"+historyMarks);
			System.out.println("Student Geography Marks"+geographyMarks);
			System.out.println("Student English Marks"+englishMarks);
			
	    }
	 
	 public double calculatePercentage() {
	    	double percentage = (this.historyMarks+this.geographyMarks+this.englishMarks)/3; 
	    	return percentage;
	    }

}
