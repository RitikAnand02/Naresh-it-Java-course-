package com.test;

//How to create Array Object using Constructor reference :

import java.util.Arrays;
import java.util.function.Function;

class Person 
{
  private String name;   //Person persons[] = new Person[5];

  public Person(String name) 
  {
      this.name = name;
  }

  public String getName() 
  {
      return name;
  }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
  
  
}

public class ConstructorReferenceDemo3
{
  public static void main(String[] args) 
  {
     Function<Integer,Person[]> fn2 =  Person[]::new;
     
     Person []persons = fn2.apply(3);  //3 is the size of the array
     
     persons[0] = new Person("Scott");
     persons[1] = new Person("Smith");
     persons[2] = new Person("Martin");
  	
     System.out.println(Arrays.toString(persons));
  }
}
