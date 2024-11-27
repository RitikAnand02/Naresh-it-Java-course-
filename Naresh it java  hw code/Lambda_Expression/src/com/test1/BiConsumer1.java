package com.test1;

import java.util.function.BiConsumer;

public class BiConsumer1
{
   public static void main(String[] args) 
   {
     BiConsumer<Integer, String> updateVariables =  (num, str) -> 
		 {
            num = num * 2;
            str = str.toUpperCase();
            System.out.println("Updated values: " + num + ", " + str);
        };

        
        int number = 15;
        String text = "nit";

        updateVariables.accept(number, text);

        // Values after the update (note that the original values are unchanged)
        System.out.println("Original values: " + number + ", " + text);
    }
}
