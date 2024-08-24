// Write a Java program to add all the digits of a given positive integer

import java.util.*;

public class part1_Q14 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the Positive Integer : ");
        int num = sn.nextInt();

        int allDigitSum = 0;

        while(num > 0) {
            int reminder = num % 10;
            allDigitSum = allDigitSum + reminder;
            num /= 10;
        }

        System.out.print("Sum of All Digits is : " + allDigitSum);
    }
}