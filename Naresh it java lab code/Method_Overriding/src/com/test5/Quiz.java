package com.test5;

 class Quiz extends CourseContent{
	 private int numberOfQuestions;

	public Quiz(String title, int numberOfQuestions) {
		super(title);
		if(numberOfQuestions<0 ) {
			System.err.println("Invalid Number Of Questions");
			System.exit(0);
		}
		else {
		this.numberOfQuestions = numberOfQuestions;
		}
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	 
}
