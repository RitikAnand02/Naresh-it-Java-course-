package com.test1;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Course: ");
		String course = sc.nextLine();
		
		System.out.println("Enter fee: ");
		double fee = sc.nextDouble();
		
		System.out.println("Enter Average: ");
		double average = sc.nextDouble();
		
		Student s1 = new Student(name,id,course,fee,average);
		Student s2 = new Student (s1);
		
		char Grade = s2.calculateGrade();
		System.out.println("Grade for average "+average+":"+Grade);
		sc.close();

	}

}
