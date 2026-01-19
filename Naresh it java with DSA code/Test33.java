// Towers of Hanoi 
// It is a problem, where we have to move the disks from source to 
// destination. by following the rules 
// R1----> at a time only one disk we have to move 
// R2----> place smaller disk on the top of larger disk

import java.util.*;

class Demo {
    static void towersOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move The Disk " + n + " from " + src + " to " + dest);
            return;
        }
        towersOfHanoi(n - 1, src, dest, helper);
        System.out.println("Move The Disk " + n + " from " + src + " to " + dest);
        towersOfHanoi(n - 1, helper, src, dest);
    }
}

class Test33 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of disks:");
        int n = obj.nextInt();

        Demo.towersOfHanoi(n, "S", "H", "D");
    }
}