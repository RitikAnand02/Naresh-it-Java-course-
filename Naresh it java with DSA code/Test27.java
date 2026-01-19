
// 17) Implement a program to return new string where identical adjcent 
// chars are sep by * 

import java.util.*;

class Demo {
    static String newS(String s, int index) {
        if (index < 1)
            return s.substring(0, index + 1);
        if (s.charAt(index - 1) == s.charAt(index))
            return newS(s, index - 1) + "*" + s.charAt(index);
        else
            return newS(s, index - 1) + s.charAt(index);
    }
}

class Test27 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();
        System.out.println(Demo.newS(s, s.length() - 1));// abc ---> a*b*c
    }
}