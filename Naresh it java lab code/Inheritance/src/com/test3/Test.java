package com.test3;

public class Test {

	public static void main(String[] args) {
      SceinceStudent s1 = new SceinceStudent("Ritik", 101, 85, 90, 80);
      s1.displayDetails();
      double calculatePercentage = s1.calculatePercentage();
      System.out.println("The Percentage of Science Student"+calculatePercentage+"%");
      
      System.out.println();
      
      ArtsStudent a1 = new ArtsStudent("Aman",102, 75, 80, 85);
      a1.displayDetails();
      double calculatePercentage2 = a1.calculatePercentage();
      System.out.println("The Percentage Of Arts Student"+calculatePercentage2+"%");
	}

}
