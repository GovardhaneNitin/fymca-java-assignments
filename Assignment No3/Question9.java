// Write a Java program that creates three threads. First thread displays
// “Hello!” every one second, the second thread displays “Wear Mask!” every two
// seconds and “Use Sanitizer!” every 5 seconds.

public class Question9 {
    static class HelloThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Hello!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    static class MaskThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Wear Mask!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    static class SanitizerThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Use Sanitizer!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        MaskThread t2 = new MaskThread();
        SanitizerThread t3 = new SanitizerThread();

        t1.start();
        t2.start();
        t3.start();
    }
}