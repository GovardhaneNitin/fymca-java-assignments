// Write a Java program that takes five numbers as input to calculate and print the 
// average of the numbers

import java.util.*;

public class part1_Q2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int sum = 0;
        int average;

        System.out.println("Enter five numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sn.nextInt();
            sum += num;
        }

        average = sum / 5;

        System.out.println("The average of the five numbers is: " + average);

    }
}
