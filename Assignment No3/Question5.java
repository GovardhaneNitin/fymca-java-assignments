// Write a program which demonstrate Thread Synchronization by using
// Synchronized statement and Synchronized Methods.
// (Write short note on Thread Synchronization and explain with example)

class SharedData {
    private int counter = 0;

    synchronized void incrementCounter() {
        counter++;
        System.out.println(Thread.currentThread().getName() + ": Counter = " + counter);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void incrementWithBlock() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ": Counter = " + counter);
        }
    }
}

class MyThread extends Thread {
    SharedData data;

    MyThread(String name, SharedData data) {
        super(name);
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            data.incrementCounter();
            data.incrementWithBlock();
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        MyThread t1 = new MyThread("Thread-1", data);
        MyThread t2 = new MyThread("Thread-2", data);

        t1.start();
        t2.start();
    }
}

/*
 * Thread Synchronization:
 * - It's a mechanism to ensure that only one thread can access a shared
 * resource at a time
 * - Prevents data inconsistency caused by multiple threads accessing shared
 * data
 * - Achieved using 'synchronized' keyword in Java
 * - Can be applied to methods or blocks of code
 * - Types:
 * 1. Method Synchronization: Entire method is synchronized
 * 2. Block Synchronization: Only critical section is synchronized
 * - Helps maintain thread safety but may impact performance due to thread
 * waiting
 */