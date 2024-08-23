// Write a Java program and compute the sum of the digits of an integer

import java.util.*;

public class part1_Q5 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sn.nextInt();
        int sum = 0;

        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}