// Write a Java program to convert a decimal number to binary numbers

import java.util.*;

public class part1_Q3 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the decimal Number : ");
        int decimal = sn.nextInt();

        String binary = "";

        while(decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary Representation : " + binary);
    }
}