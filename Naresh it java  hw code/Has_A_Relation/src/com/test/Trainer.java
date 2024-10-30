package com.test;

import java.util.Scanner;

public class Trainer 
{
  public static void viewStudentProfile(Student obj)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Student id :");
	  int id = sc.nextInt();
	  
	  if(id == obj.getStudentId())
	  {
		  System.out.println(obj);
	  }
	  else
	  {
		  System.err.println("Sorry! Id is not available");
	  }
	  sc.close();
  }
}
