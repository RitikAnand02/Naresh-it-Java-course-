//  Program to calcualte tranpose of the given matrix 

import java.util.*;

class Test76 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter matrix row size:");
        int rsize = obj.nextInt();

        System.out.println("Enter matrix column size:");
        int csize = obj.nextInt();

        int i, j;
        int a[][] = new int[rsize][csize];
        int b[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one-by-one:");
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                a[i][j] = obj.nextInt();
            }
        }
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                b[i][j] = a[j][i];
            }
        }

        System.out.println("Original Matrix Elements:");
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Trnaspose Matrix Elements:");
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}