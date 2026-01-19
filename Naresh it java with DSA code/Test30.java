
// 19) IMP to replace the given old character with new character in the 
// original string?

import java.util.*;

class Demo {
    static String replace(String s, int index) {
        // Base condition
        if (index < 0)
            return "";
        if (s.charAt(index) == 'x')
            return replace(s, index - 1) + "y";
        else
            return replace(s, index - 1) + s.charAt(index);
    }
}

class Test30 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();
        System.out.println(Demo.replace(s, s.length() - 1));
    }
}