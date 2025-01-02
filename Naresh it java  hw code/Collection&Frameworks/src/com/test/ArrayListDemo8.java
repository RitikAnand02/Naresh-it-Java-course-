package com.test;

import java.util.ArrayList;

public class ArrayListDemo8
{
    public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");

        @SuppressWarnings("unchecked")
		ArrayList<String> clonedCopy =(ArrayList<String>) original.clone();
        System.out.println(clonedCopy);
        
        
        ArrayList<String> copy = new ArrayList<>(original);
        System.out.println(copy);
        
            
       
    }
}
