package com.test2;

public class HospitalStaff {
	private String name;
	private int age;
	private String role;
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getRole() {
		return role;
	}



	public void Work(){
		System.out.println(this.role+" "+this.name+" is working massage");
	}

}
