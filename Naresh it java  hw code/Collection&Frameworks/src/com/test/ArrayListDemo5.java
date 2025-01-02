package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5
{
    public static void main(String[] args)
    {        
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Banglore");
        cities.add("Chennai");
        
        System.out.println("Before sorting: " + cities);

        Collections.sort(cities);
        System.out.println("After sorting (Ascending): " + cities);
        
        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("After sorting (Descending): " + cities);

    }
}
