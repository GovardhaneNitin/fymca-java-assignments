// Write a Program: Create class passenger. Accept details '10' passengers in an
// array of objects and display the accepted details [assume suitable attribute
// fields].

import java.util.*;

class Passenger {
    private String passengerName;
    private int age;
    private String contactNo;
    private String ticketNo;

    public Passenger(String passengerName, int age, String contactNo, String ticketNo) {
        this.passengerName = passengerName;
        this.age = age;
        this.contactNo = contactNo;
        this.ticketNo = ticketNo;
    }

    public void displayDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Ticket No: " + ticketNo);
        System.out.println("---------------------------");
    }
}

public class part2_Q28 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Passenger[] passengers = new Passenger[10];

        for (int i = 0; i < passengers.length; i++) {
            System.out.println("\nEnter details for Passenger " + (i + 1) + ":");

            System.out.print("Enter Passenger Name: ");
            String passengerName = sn.nextLine();

            System.out.print("Enter Age: ");
            int age = sn.nextInt();

            sn.nextLine();

            System.out.print("Enter Contact No: ");
            String contactNo = sn.nextLine();

            System.out.print("Enter Ticket No: ");
            String ticketNo = sn.nextLine();

            passengers[i] = new Passenger(passengerName, age, contactNo, ticketNo);
        }

        System.out.println("\nPassenger Details:");
        for (int i = 0; i < passengers.length; i++) {
            passengers[i].displayDetails();
        }

    }
}
