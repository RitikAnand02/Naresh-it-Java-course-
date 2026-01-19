// 16) Implement a program to return a new String, where all the adjacent 
// characters are seperated by a "*". 

import java.util.Scanner;

class Demo {
    static String newS(String s, int index) {
        if (index < 1)
            return s.substring(0, index + 1);// s.charAt(index)+"";
        return newS(s, index - 1) + "*" + s.charAt(index);
    }
}

class Test26 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();
        System.out.println(Demo.newS(s, s.length() - 1));// abc ---> a*b*c
    }
}