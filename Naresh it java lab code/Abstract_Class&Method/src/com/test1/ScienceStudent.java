package com.test1;

 class ScienceStudent extends Student{
	 private int physicsMarks;
	 private int chemistryMarks;
	 private int mathsMarks;
	 
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		if(physicsMarks<0) {
			System.err.println("Physics Marks Cannot Be Negative ");
			System.exit(0);
		}
		else if(chemistryMarks<0) {
			System.err.println("Chemistry Marks  Cannot Be Negative ");
			System.exit(0);
		}
		else if(mathsMarks<0) {
			System.err.println("Maths Marks  Cannot Be Negative ");
			System.exit(0);
		}
		else {
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		}
	}

	@Override
	public int getPercentage() {
		 int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
	        return totalMarks / 3;
	}
	 
}
