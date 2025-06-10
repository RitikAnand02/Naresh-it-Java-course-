package com.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample1
{
    public static void main(String[] args) 
    {
        List<String> list = Arrays.asList("Apple", "Orange", "Mango","Kiwi", "Grapes");

		
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<String>(list);
         
        System.out.println("Without modification = "+copyOnWriteList); 
        
		 //Iterator1
        Iterator<String> iterator1 = copyOnWriteList.iterator();
         
        //Add one element and verify list is updated
        copyOnWriteList.add("Guava");
         
        System.out.println("After modification = "+copyOnWriteList);   
         
        //Iterator2
        Iterator<String> iterator2 = copyOnWriteList.iterator();
         
        System.out.println("Element from first Iterator:");
        iterator1.forEachRemaining(System.out::println);

        System.out.println("Element from Second Iterator:");
        iterator2.forEachRemaining(System.out::println);   
    }
}
