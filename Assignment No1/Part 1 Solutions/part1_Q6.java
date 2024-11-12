// Write a Java program to compare two numbers

import java.util.*;

public class part1_Q6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sn.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sn.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
