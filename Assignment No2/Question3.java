// Write an application that will accept details of items such as items such as
// itemcode, description, quantity and rate. Accept details of 4 different items
// in an array of objects. Fire user defined exception if quantity or price is
// less than or equal to zero. Display the accepted 4 different items details on
// console.

import java.util.*;

class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

class Item {
    String itemCode;
    String description;
    int quantity;
    double rate;

    public Item(String itemCode, String description, int quantity, double rate) {
        this.itemCode = itemCode;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
    }

    public String toString() {
        return "Item Code: " + itemCode + ", Description: " + description + ", Quantity: " + quantity + ", Rate: "
                + rate;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Item[] items = new Item[4];

        int i = 0;
        while (i < items.length) {
            try {
                System.out.print("Enter Item Code: ");
                String itemCode = sn.nextLine();
                System.out.print("Enter Description: ");
                String description = sn.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = Integer.parseInt(sn.nextLine());
                if (quantity <= 0) {
                    throw new InvalidValueException("Quantity must be greater than zero.");
                }
                System.out.print("Enter Rate: ");
                double rate = Double.parseDouble(sn.nextLine());
                if (rate <= 0) {
                    throw new InvalidValueException("Rate must be greater than zero.");
                }

                items[i] = new Item(itemCode, description, quantity, rate);
                i++; // Increment to accept next item
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter numeric values for quantity and rate.");
            } catch (InvalidValueException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nAccepted Items Details:");
        for (Item item : items) {
            System.out.println(item);
        }

    }
}

// OUTPUT:
// Enter Item Code: 1
// Enter Description: It's too cold
// Enter Quantity: 10
// Enter Rate: 35
// Enter Item Code: 2
// Enter Description: It's too hot
// Enter Quantity: 5
// Enter Rate: 100
// Enter Item Code: 3
// Enter Description: Metal Plated
// Enter Quantity: 50
// Enter Rate: 200
// Enter Item Code: 4
// Enter Description: Solid body'
// Enter Quantity: 70
// Enter Rate: 150

// Accepted Items Details:
// Item Code: 1, Description: It's too cold, Quantity: 10, Rate: 35.0
// Item Code: 2, Description: It's too hot, Quantity: 5, Rate: 100.0
// Item Code: 3, Description: Metal Plated, Quantity: 50, Rate: 200.0
// Item Code: 4, Description: Solid body', Quantity: 70, Rate: 150.0