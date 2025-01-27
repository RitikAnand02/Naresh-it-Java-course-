package com.test5;

//Mixing generic to non-generic
import java.util.*; 
public class Test7 
{
	public static void main(String[] args) 
	{ 
		List<Integer> myList = new ArrayList<>();	

		myList.add(4); 
		myList.add(6); 
		UnknownClass1 u = new UnknownClass1(); 
		int total = u.addValues(myList); 
		System.out.println(total); 
	} 
}  
class UnknownClass1 
{ 
  public int addValues(List list)  
	{ 
		list.add(5);	//adding object to raw type
		Iterator it = list.iterator(); 
		int total = 0; 
		while (it.hasNext()) 
		{
		int i = ((Integer)it.next()); 
		total += i; 
		} 
		return total; 
	} 
} 

