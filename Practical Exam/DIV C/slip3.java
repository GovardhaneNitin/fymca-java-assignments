// Write Java Application Program that allows an integer as Decimal number
// Convert it to it's binary equivalent. Display the original number and its
// binary number.

import java.util.*;

public class slip3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sn.nextInt();
        // Convert decimal to binary
        String binary = "";
        int temp = decimal;
        while (temp > 0) {
            int digit = temp % 2;
            binary = digit + binary;
            temp /= 2;
        }

        if (decimal == 0) {
            binary = "0";
        }

        System.out.println("Decimal Number: " + decimal);
        System.out.println("Binary Equivalent: " + binary);

    }
}
