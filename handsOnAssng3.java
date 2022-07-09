/* write a program to accept two integers as cmd line arguments and print the sum of two integers */

import java.util.*;

class handsOnAssng3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}