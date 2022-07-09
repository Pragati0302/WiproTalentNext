/* Write a program to accept a String as a command line argument and print a Welcome message */
import java.util.*;

class handsOnAssng2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        String str = sc.nextLine();
        int dob= sc.nextInt();
        //System.out.println("Welcome "+str);
        System.out.println(str+ " bday is on "+dob);
        sc.close();
    }
}