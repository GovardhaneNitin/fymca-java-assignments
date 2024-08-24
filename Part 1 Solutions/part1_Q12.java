// Write a Java program to check if a positive number is a palindrome or not

import java.util.*;

public class part1_Q12 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        int reverseNumber = 0;

        System.out.print("Enter the number which you to check : ");
        int num = sn.nextInt();

        int orignalNumber = num;

        while(num > 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num /= 10;
        }

        if(orignalNumber == reverseNumber) {
            System.out.print(reverseNumber + " is Palindrome Number");
        } else {
            System.out.print(reverseNumber + " is Not Palindrome Number");
        }
    }
}