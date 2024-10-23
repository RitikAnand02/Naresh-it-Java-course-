package com.test1;

 class DayScholar extends Student {
	 double transportFee;
	 double totalFee;
	 

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
		this.totalFee= transportFee+examFee;
		
	}

	
	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount){

		return  totalFee -amount;
		
		
	}
	 
	 

}
