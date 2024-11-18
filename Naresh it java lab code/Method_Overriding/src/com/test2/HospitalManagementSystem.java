package com.test2;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		HospitalStaff h1 = new HospitalStaff("Ritik", 30, "Compounder");
		h1.Work();
		System.out.println();
		
		Doctor d1 = new Doctor("Jatin", 50, "Genric", "Vetnary");
		d1.Work();
		System.out.println();
		
		Nurse n1 = new Nurse("Mia",30,"Junior Nurse",2);
		n1.Work();
	}

}
