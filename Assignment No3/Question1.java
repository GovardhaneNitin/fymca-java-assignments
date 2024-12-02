// What is multithreading? Write a multithreaded program for demonstrating following threads: .

// a) Display all number divisible by 8 from 1 to 100.
// b) Display all even numbers between 51 to 100.
// c) Display the message "Java is Awesome" 10 times.

/*
 * Multithreading is a Java feature that allows concurrent execution of two or
 * more parts
 * of a program for maximum utilization of CPU. Each part of such a program is
 * called a thread,
 * and each thread defines a separate path of execution.
 * 
 * Advantages of Multithreading:
 * 1. Enhanced performance by better resource utilization
 * 2. Concurrent and parallel execution
 * 3. Resource sharing
 * 4. Better responsiveness
 */

class DivisibleByEight extends Thread {
    public void run() {
        System.out.println("\nNumbers divisible by 8 from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class EvenNumbers extends Thread {
    public void run() {
        System.out.println("\n\nEven numbers between 51 to 100:");
        for (int i = 51; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class JavaMessage extends Thread {
    public void run() {
        System.out.println("\n\nDisplaying message 10 times:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Java is Awesome");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        DivisibleByEight t1 = new DivisibleByEight();
        EvenNumbers t2 = new EvenNumbers();
        JavaMessage t3 = new JavaMessage();

        t1.start();
        t2.start();
        t3.start();
    }
}