
// 20. Impl prg to remove duplicate characters from the given str.  
// "welcome" ----> "welcom" 
// "abcaba" -----> "abc" 

import java.util.*;

class Test138 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if (ss.indexOf(s.charAt(i)) < 0)
                ss = ss + s.charAt(i);
        }
        System.out.println(ss);
    }
}
