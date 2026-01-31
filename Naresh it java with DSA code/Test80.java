// sum of diagonal elements 

import java.util.*;

class Test80 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter row value:");
        int row = obj.nextInt();

        System.out.println("Enter col value:");
        int col = obj.nextInt();

        int a[][] = new int[row][col];

        int i, j, s;

        System.out.println("Enter matrix elements:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = obj.nextInt();
            }
        }
        s = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j) {
                    s = s + a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}