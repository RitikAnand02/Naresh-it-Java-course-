package com.test1;

public class StudentTester {

	public static void main(String[] args) {
		    ScienceStudent scienceStudent = new ScienceStudent("Ritik", "12A", 85, 90, 80);
	        System.out.println("Science Student Details:");
	        System.out.println("Name: " + scienceStudent.studentName);
	        System.out.println("Class: " + scienceStudent.studentClass);
	        System.out.println("Percentage: " + scienceStudent.getPercentage() + "%");

	       
	        HistoryStudent historyStudent = new HistoryStudent("Aman", "11B", 78, 82);
	        System.out.println("\nHistory Student Details:");
	        System.out.println("Name: " + historyStudent.studentName);
	        System.out.println("Class: " + historyStudent.studentClass);
	        System.out.println("Percentage: " + historyStudent.getPercentage() + "%");

	   
	        System.out.println("\nTotal Number of Students: " + Student.getTotalNoStudents());
	    }

	}


