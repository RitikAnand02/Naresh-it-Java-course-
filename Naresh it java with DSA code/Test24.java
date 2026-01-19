
// 14) Implement a program to find reverse of the given string using 
// recursion? 

import java.util.*;

class Demo {
    static String strrev(String s) {
        if (s == null || s.length() <= 1)// BC
            return s;
        return strrev(s.substring(1)) + s.charAt(0);
    }
}

class Test24 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s = obj.nextLine();
        System.out.println(Demo.strrev(s));
    }
}
