// Write a program Create an abstract class order having members id and description. Create two subclasses PurchaseOrder and SalesOrder with member customer name and vendor name respectively. Define methods accept and display in all classes. Create 5 objects each of PurchaseOrder and SalesOrder. Accept and display details.

import java.util.*;

abstract class Order {
    int id;
    String description;

    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    void accept() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.print("Enter Purchase Order Description: ");
        description = sn.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = sn.nextLine();
    }

    void display() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void accept() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.print("Enter Sales Order Description: ");
        description = sn.nextLine();
        System.out.print("Enter Vendor Name: ");
        vendorName = sn.nextLine();
    }

    void display() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class part2_Q18 {
    public static void main(String args[]) {
        PurchaseOrder purchaseOrders[] = new PurchaseOrder[5];
        SalesOrder salesOrders[] = new SalesOrder[5];

        System.out.println("Enter details of Purchase Orders:");
        for (int i = 0; i < 5; i++) {
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].accept();
        }

        System.out.println("Purchase Order Details:");
        for (int i = 0; i < 5; i++) {
            purchaseOrders[i].display();
        }

        System.out.println("Enter details of Sales Orders:");
        for (int i = 0; i < 5; i++) {
            salesOrders[i] = new SalesOrder();
            salesOrders[i].accept();
        }

        System.out.println("Sales Order Details:");
        for (int i = 0; i < 5; i++) {
            salesOrders[i].display();
        }
    }
}
