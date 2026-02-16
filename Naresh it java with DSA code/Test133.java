
// 15. Impl prg to convert every word first and last char into caps.  
import java.util.*;

class Test133 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer sb = new StringBuffer();
        System.out.println(s);
        while (st.hasMoreTokens()) {
            String ss = st.nextToken();
            int n = ss.length();

            sb.append(ss.substring(0, 1).toUpperCase() + ss.substring(1, n - 1) + ss.substring(n - 1, n).toUpperCase());
            sb.append(" ");
        }
        System.out.println(sb);
    }
}