package com.test;

import java.util.Arrays;

class Person1
{
    String name;
    
    public Person1(String name)
    {
        this.name = name;
    }

    public int personInstanceMethod1(Person1 person)  
    {
        return  this.name.compareTo(person.name); 
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}  
    
    
}

public class ArbitraryRefDemo2 
{
    public static void main (String[] args) throws Exception
    {
    	
        Person1[] personArray = {new Person1("Zuber"),new Person1("Raj"), new Person1("Ankit"), new Person1("Abhishek")}; 
        
        Arrays.sort(personArray, Person1::personInstanceMethod1);
    
        System.out.println(Arrays.toString(personArray));
             
    }

}
