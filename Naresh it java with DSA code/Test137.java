// 19. Impl prg to return middle char(s).  
// abc ----> b 
// abcd ---> bc 
// 0123 
// 4 ---> n/2-1 and n/2 
// 3 ---> n/2 

import java.util.*;

class Test137 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int n = s.length();
        if (n % 2 == 0)
            System.out.println(s.charAt(n / 2 - 1) + "" + s.charAt(n / 2));
        else
            System.out.println(s.charAt(n / 2));
    }
}