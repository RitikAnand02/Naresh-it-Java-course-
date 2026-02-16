// 03. Impl prg to print vowels/consonants present in the given str.  

import java.util.*;

class Test121 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                // if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.println(ch);
        }
    }
}