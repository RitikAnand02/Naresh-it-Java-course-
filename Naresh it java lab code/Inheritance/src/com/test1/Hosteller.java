package com.test1;

 class Hosteller extends Student {
	 double hostelFee;
	 double totalFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
		this.totalFee= hostelFee+examFee;
	}


	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount) {

		return  totalFee-amount;

	}
	
	 
	

}
