package com.test;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

record Employee6(String name, Integer experience)
{
	
}

public class Lambda17 
{
   public static void main(String[] args) 
   {
	  ArrayList<Employee6> listOfEmployee = new ArrayList<>();
	  listOfEmployee.add(new Employee6("Virat",12));
	  listOfEmployee.add(new Employee6("Rohit",12));
	  listOfEmployee.add(new Employee6("Bumrah",6));
	  listOfEmployee.add(new Employee6("Akshar",5));
	  listOfEmployee.add(new Employee6("Abhishek",4));
	  
	 
                                        
      ToIntFunction<Employee6> playerExp = employee -> employee.experience();

      int totalYearsOfExperience = listOfEmployee.stream()
                                              .mapToInt(playerExp)
                                              .sum();

        
       System.out.println("Total years of experience: " + totalYearsOfExperience);
   
       
      
   }
}

//Note : IntStream interface has provided a predfined abstract method
//       sum()
//
//        int sum();  //Available IntStream interface
