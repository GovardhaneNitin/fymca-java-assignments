// Write a Java program to convert a binary number to decimal number

import java.util.*;

public class part1_Q4 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the Binary Number : ");
        int num = sn.nextInt();

        int binary = num;
        int decimal = 0;
        int pow = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            decimal = decimal + lastDigit * (int)Math.pow(2, pow);
            pow++;
            num /= 10;
        }

        System.out.println("Decimal of " + binary + " is " + decimal);
    }
}