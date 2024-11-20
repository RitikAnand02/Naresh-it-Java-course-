package com.test1;

 class HistoryStudent extends Student {
	 private int historyMarks;
	 private int civicsMarks;
	 
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		if(historyMarks<0) {
			System.err.println("History Marks Cannot Be Negative ");
			System.exit(0);
		}
		else if(civicsMarks<0) {
			System.err.println("Civics Marks  Cannot Be Negative ");
			System.exit(0);
		}
		else {
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		}
	}

	@Override
	public int getPercentage() {
		 int totalMarks = historyMarks + civicsMarks;
	        return totalMarks / 2;
	}

}
