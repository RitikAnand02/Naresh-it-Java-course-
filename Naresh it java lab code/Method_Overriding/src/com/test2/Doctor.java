package com.test2;

 class Doctor extends HospitalStaff{
	private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
	@Override
	public void Work(){
     System.out.println(getRole()+" And "+getName()+" with specialization in " + specialization + " is treating patients.");
		
	}

}
