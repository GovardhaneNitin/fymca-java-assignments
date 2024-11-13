// Write a java program to accept the details of product as productcode, productname and weight. If weight > 100 then throw an exception as InvalidProduct Exception and give the  proper  message.  Otherwise  display  the  product  details.  Define  required  exception class.

import java.util.*;

class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}

public class Question1 {

    public static void checkProduct(int productCode, String productName, double weight) throws InvalidProductException {
        if (weight > 100) {
            throw new InvalidProductException("Invalid Weight: " + weight + " is too heavy!");
        } else {
            System.out.println("Product Details:");
            System.out.println("Product Code: " + productCode);
            System.out.println("Product Name: " + productName);
            System.out.println("Weight: " + weight);
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        try {
            System.out.print("Enter Product Code: ");
            int productCode = sn.nextInt();
            sn.nextLine();
            System.out.print("Enter Product Name: ");
            String productName = sn.nextLine();
            System.out.print("Enter Product Weight: ");
            double weight = sn.nextDouble();

            checkProduct(productCode, productName, weight);
        } catch (InvalidProductException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

// OUTPUT:
// Enter Product Code: 1
// Enter Product Name: Sugar
// Enter Product Weight: 101
// Exception caught: Invalid Weight: 101.0 is too heavy!