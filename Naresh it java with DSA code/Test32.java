
// 21) IMP to replace the given string with new string? 
import java.util.*;

class Demo {
    static String replacestr(String s, int index) {
        // base condition Eg:a
        if (index < 1)
            return s.substring(0, index + 1);// to return original str
        if (s.substring(index - 1, index + 1).equals("pi")) // RC1==> if 'pi' word is existed
            return replacestr(s, index - 2) + "3.147";
        else //// RC2==> if 'pi' word is not existed, Eg: pix
            return replacestr(s, index - 1) + s.charAt(index);
    }
}

class Test32 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = obj.nextLine();// very,3
        System.out.println(Demo.replacestr(s, s.length() - 1));
    }
}