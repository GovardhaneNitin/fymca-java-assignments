// Write a program to create two threads which will display message ‘n’ number
// of times. While creating thread pass the message and n as parameters. Message
// should appear in alternate order.

class MessageThread extends Thread {
    private String message;
    private int count;
    private static Object lock = new Object();

    public MessageThread(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (lock) {
                System.out.println(message);
                lock.notify();
                try {
                    if (i < count - 1)
                        lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Hello", 5);
        MessageThread thread2 = new MessageThread("World", 5);

        thread1.start();
        thread2.start();
    }
}