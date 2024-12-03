// Write a multithreaded Box Office Movie Total amount collection according to
// the Total No of Booking, Use Interthread Collection methods
// wait(),notify(),notifyAll() and yeid() method.

class BoxOffice {
    private int totalAmount = 0;
    private boolean bookingComplete = false;

    synchronized void addBooking(int amount) {
        while (bookingComplete) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        totalAmount += amount;
        System.out.println("Booking added: Rs." + amount + " | Total: Rs." + totalAmount);
        bookingComplete = true;
        notify();
    }

    synchronized int getTotal() {
        while (!bookingComplete) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        bookingComplete = false;
        notify();
        return totalAmount;
    }
}

class BookingThread extends Thread {
    private BoxOffice boxOffice;
    private int amount;

    BookingThread(BoxOffice boxOffice, int amount) {
        this.boxOffice = boxOffice;
        this.amount = amount;
    }

    public void run() {
        Thread.yield();
        boxOffice.addBooking(amount);
    }
}

class TotalThread extends Thread {
    private BoxOffice boxOffice;

    TotalThread(BoxOffice boxOffice) {
        this.boxOffice = boxOffice;
    }

    public void run() {
        System.out.println("Final Collection: Rs." + boxOffice.getTotal());
    }
}

public class Question8 {
    public static void main(String[] args) {
        BoxOffice boxOffice = new BoxOffice();

        new BookingThread(boxOffice, 200).start();
        new BookingThread(boxOffice, 300).start();
        new BookingThread(boxOffice, 500).start();
        new TotalThread(boxOffice).start();
    }
}