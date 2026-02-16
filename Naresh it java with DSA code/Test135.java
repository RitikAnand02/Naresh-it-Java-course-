
// 17. American keyboard  ---------------------- 
// Given a string, return the true if that can be typed using letters of 
// alphabet on only one row's of American keyboard like the image below. 

// In the American keyboard: 
// => the first row consists of the characters "qwertyuiop", 
// => the second row consists of the characters "asdfghjkl", and 
// => the third row consists of the characters "zxcvbnm". 

import java.util.*;

class Test135 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (r1.contains(s.charAt(i) + ""))
                c1++;
            if (r2.contains(s.charAt(i) + ""))
                c2++;
            if (r3.contains(s.charAt(i) + ""))
                c3++;
        }

        System.out.println(c1 == s.length() || c2 == s.length() || c3 == s.length());
    }
}