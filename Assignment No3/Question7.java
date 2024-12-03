// Write a multithreaded application bus / railway ticket reservation system

import java.util.*;

class ReservationSystem {
    private int availableSeats;

    public ReservationSystem(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean bookTicket(String passengerName, int seatsRequired) {
        if (availableSeats >= seatsRequired) {
            System.out.println("Processing reservation for " + passengerName);
            try {
                Thread.sleep(1000); // Simulating processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableSeats -= seatsRequired;
            System.out.println("Booking successful for " + passengerName + ". Seats remaining: " + availableSeats);
            return true;
        } else {
            System.out.println("Sorry " + passengerName + ", no seats available!");
            return false;
        }
    }
}

class BookingThread extends Thread {
    private ReservationSystem rs;
    private String passengerName;
    private int seatsRequired;

    public BookingThread(ReservationSystem rs, String passengerName, int seatsRequired) {
        this.rs = rs;
        this.passengerName = passengerName;
        this.seatsRequired = seatsRequired;
    }

    public void run() {
        rs.bookTicket(passengerName, seatsRequired);
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter total number of seats: ");
        int totalSeats = sn.nextInt();

        ReservationSystem rs = new ReservationSystem(totalSeats);

        while (true) {
            System.out.print("Enter passenger name (or 'exit' to stop): ");
            String name = sn.next();
            if (name.equalsIgnoreCase("exit"))
                break;

            System.out.print("Enter number of seats required: ");
            int seats = sn.nextInt();

            new BookingThread(rs, name, seats).start();
        }
    }
}