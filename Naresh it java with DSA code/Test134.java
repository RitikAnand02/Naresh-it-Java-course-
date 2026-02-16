
// 16. Impl prg to convert except first and last chars, remaining into uppercase.  
import java.util.*;

class Test134 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer sb = new StringBuffer();
        System.out.println(s);
        while (st.hasMoreTokens()) {
            String ss = st.nextToken();
            int n = ss.length();
            sb.append(ss.substring(0, 1) + ss.substring(1, n - 1).toUpperCase() + ss.substring(n - 1, n));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}