
// 18) Implement a program to count number of times, the give char occurred.
import java.util.*;

class Demo {
    static int count(String s, char ch, int index) // x
    {
        if (index < 0)
            return 0;
        // if(s.charAt(index)=='x')
        // if(s.charAt(index)=='a'||s.charAt(index)=='e'||s.charAt(index)=='i'||s.charAt(index)=='o'||s.charAt(index)=='u')
        if (s.charAt(index) == ch)
            return 1 + count(s, ch, index - 1);
        else
            return count(s, ch, index - 1);
    }
}

class Test29 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();
        System.out.println(Demo.count(s, 'a', s.length() - 1));
    }
}