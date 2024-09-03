// Write a Program: Create an abstract class Employee. Derive two classes manager and worker from it. Use proper method to accept and display the details for the same. The fields of manager are mid, mname and phno. Similarly, fields for worker are name and working hours.

import java.util.*;

abstract class Employee {
    abstract void acceptDetails();
    abstract void displayDetails();
}

class Manager extends Employee {
    private int mid;
    private String mname;
    private String phno;

    
    void acceptDetails() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Manager ID: ");
        mid = sn.nextInt();
        sn.nextLine();
        System.out.print("Enter Manager Name: ");
        mname = sn.nextLine();
        System.out.print("Enter Manager Phone Number: ");
        phno = sn.nextLine();
    }

    
    void displayDetails() {
        System.out.println("Manager ID: " + mid);
        System.out.println("Manager Name: " + mname);
        System.out.println("Manager Phone Number: " + phno);
    }
}

class Worker extends Employee {
    private String name;
    private int workingHours;

    
    void acceptDetails() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Worker Name: ");
        name = sn.nextLine();
        System.out.print("Enter Working Hours: ");
        workingHours = sn.nextInt();
    }

    
    void displayDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Working Hours: " + workingHours);
    }
}

public class part2_Q17 {
    public static void main(String args[]) {
        Employee manager = new Manager();
        Employee worker = new Worker();

        System.out.println("Enter Manager Details:");
        manager.acceptDetails();
        System.out.println("Enter Worker Details:");
        worker.acceptDetails();

        System.out.println("--- Manager Details ---");
        manager.displayDetails();

        System.out.println("--- Worker Details ---");
        worker.displayDetails();
    }
}
