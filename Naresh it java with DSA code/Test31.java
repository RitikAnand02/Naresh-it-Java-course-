
// 20) IMP to count the number of times given string appeared in the 
// original string? 
import java.util.*;

class Demo {
    static int count(String s, int index) {
        // base condition
        if (index < 3)
            return 0;
        if (s.substring(index - 3, index + 1).equals("very")) // RC1==> if 'very' word is existed
            return 1 + count(s, index - 3);
        else //// RC2==> if 'very' word is not existed
            return count(s, index - 1);
    }
}

class Test31 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();// very,3
        System.out.println(Demo.count(s, s.length() - 1));
    }
}