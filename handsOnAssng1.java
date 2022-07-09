/* Write a program that accepts two strings as command line arguments and generates the output in the required format */

import java.util.*;

class handsOnAssng1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a + " Technologies " +b);
        sc.close();
    }
}