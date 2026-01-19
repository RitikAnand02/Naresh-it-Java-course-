
// 18) Implement a program to return true if a string nesting of zero or 
// more pairs of ()

import java.util.Scanner;

class Demo {
    static boolean newS(String s, int i, int j) {
        if (i > j)
            return true;
        if (s.charAt(i) == '(' && s.charAt(j) == ')')
            return newS(s, i + 1, j - 1);
        else
            return false;
    }
}

class Test28 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();
        System.out.println(Demo.newS(s, 0, s.length() - 1));
    }
}