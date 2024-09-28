
/*program to calculate telephone bill
For 100 free call rental = 360
For 101 - 250, 1 Rs per call
For 251 - unlimited , 1.2 Rs per call
*/
import java.util.*;

public class Test15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current Reading :");
        int curr_read = sc.nextInt();

        System.out.print("Enter Previous Reading :");
        int prev_read = sc.nextInt();

        int nc = curr_read - prev_read; // [curr_read > prev_read]
        System.out.println("Your Number of call for this month is :" + nc);

        double bill = 0.0;
        if (nc <= 100) {
            bill = 360;
        } else if (nc <= 250) {
            bill = 360 + (nc - 100) * 1.0;
        } else if (nc > 250) {
            bill = 360 + 150 + (nc - 250) * 1.2;
        }
        System.out.println("The bill is :" + bill);
        sc.close();
    }
}