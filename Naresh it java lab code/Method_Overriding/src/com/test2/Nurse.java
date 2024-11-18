package com.test2;

 class Nurse  extends HospitalStaff{
	 
	 private int yearsOfExperience;

	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}
	 
	@Override
	public void Work(){
     System.out.println(getRole()+" "+getName()+" with "+this.yearsOfExperience+ " years of experience is taking care of patients.");
		
	}

}
