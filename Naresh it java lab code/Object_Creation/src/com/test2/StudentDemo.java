package com.test2;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Student Id:");
		int studentId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Your Student Name:");
		String studentName = sc.nextLine();

		System.out.println("Enter Your Marks:");
		int marks = sc.nextInt();

		s1.setStudentData(studentId, studentName, marks);
		s1.calculateMarks();
		System.out.println(s1);
		sc.close();

	}

}
