package com.test;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo7
{
    public static void main(String[] args) 
		{
        // Create a LinkedList and treat it as a Deque
        Deque<String> deque = new LinkedList<>();

        
        deque.addFirst("Ravi");  // Ravi  Pallavi  
        deque.addFirst("Raj");   

        
        deque.addLast("Pallavi");   
        deque.addLast("Sweta");

        
        System.out.println("Deque: " + deque);   

       
        String first = deque.removeFirst();
        String last = deque.removeLast();

       
        System.out.println("Removed first element: " + first);
        System.out.println("Removed last element: " + last);
        System.out.println("Updated Deque: " + deque);
    }
}