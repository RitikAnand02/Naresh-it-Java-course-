
// interchanging of diagonal elements
import java.util.*;

class Test82 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter row value:");
        int row = obj.nextInt();

        System.out.println("Enter col value:");
        int col = obj.nextInt();

        int a[][] = new int[row][col];

        int i, j, t;

        System.out.println("Enter matrix elements:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        System.out.println("Before swaping...");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < row; i++) {
            t = a[i][i];
            a[i][i] = a[i][row - i - 1];
            a[i][row - i - 1] = t;
        }
        System.out.println("After swaping...");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}