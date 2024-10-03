package com.test1;

public class StudentDemo {
	public static void main(String[] args) {
		Student raj = new Student();

		// Initialize the Object properties through Object reference
		raj.name = "Raj Gourav";
		raj.age = 19;
		raj.rollNumber = 111;

		// Calling the behavior through Object reference
		raj.talk();
		raj.writeExam();

		System.out.println(".................");

		Student priya = new Student();
		// Initialize the Object properties through Object reference
		priya.rollNumber = 222;
		priya.name = "Priya";
		priya.age = 19;

		// Calling the behavior through Object reference
		priya.talk();
		priya.writeExam();

	}

}
