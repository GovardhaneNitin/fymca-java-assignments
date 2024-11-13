// Write a java program to create own exception for Negative Value Exception if
// the user enter negative value.

import java.util.*;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        try {
            System.out.print("Enter a value: ");
            int value = sn.nextInt();

            if (value < 0) {
                throw new NegativeValueException("Negative values are not allowed.");
            }

            System.out.println("You entered: " + value);

        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}

// OUTPUT:
// java Question7
// Enter a value: -5
// Error: Negative values are not allowed.