package com.test4;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

record Customer(Integer custId, String customerName) implements Comparable<Customer>
{

	@Override
	public int compareTo(Customer c2) 
	{
		return this.custId().compareTo(c2.custId());
	}
	
}

public class TreeSetDemo2 {

	public static void main(String[] args) 
	{
		TreeSet<Customer> ts1 = new TreeSet<>();
		ts1.add(new Customer(222, "Zuber"));
		ts1.add(new Customer(111, "Vaibhav"));
		ts1.add(new Customer(333, "Aryan"));
		ts1.add(new Customer(444, "Raj"));
		System.out.println("Sorted Based on the ID :");
		ts1.forEach(System.out::println);
		
		System.out.println("Retrieve Based on the Spliterator :");
		 Spliterator<Customer> spl = ts1.spliterator();
		 spl.forEachRemaining(System.out::println);
		
		 System.out.println("Retrieve by using descendingIterator in reverse order :"); 
		Iterator<Customer> itr = ts1.descendingIterator();
		itr.forEachRemaining(System.out::println); 
		 
		
	}

}

//Note :- descendingIterator() is a predefined method of TreeSet class which will traverse in the descending order and return type of this method is Iterator interface available from JDK 1.6

//public Iterator descendingIterator()