
//  Program to find col wise sum values 
import java.util.*;

class Test75 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter matrix row size:");
        int rsize = obj.nextInt();

        System.out.println("Enter matrix column size:");
        int csize = obj.nextInt();

        int i, j, sum;
        int a[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one-by-one:");
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        for (i = 0; i < rsize; i++) {
            sum = 0;
            for (j = 0; j < csize; j++) {
                sum = sum + a[j][i];
            }
            System.out.println((i + 1) + " Col Sum= " + sum);
        }
    }
}