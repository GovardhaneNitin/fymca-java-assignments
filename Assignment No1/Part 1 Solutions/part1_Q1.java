// Write a Java program to print the sum, multiply, subtract, divide and remainder 
// of two numbers

import java.util.*;

public class part1_Q1 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        int num1 = sn.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = sn.nextInt();

        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum of two Number is : " + sum);
        System.out.println("Multiplication of two Number is : " + multiply);
        System.out.println("Subtraction of two Number is : " + subtract);
        System.out.println("divide of two Number is : " + divide);
        System.out.println("remainder of two Number is : " + remainder);
    }
}