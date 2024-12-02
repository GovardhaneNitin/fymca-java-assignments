// Write an application that will create following threads:
// - Which will print A to Z 50 times ?
// - And 15 – terms of Fibonacci Series
// - Accept the stirring input and display no of vowels and total no Words
// present in the string

import java.util.*;

class AlphabetThread extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

class FibonacciThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1;
        System.out.println("\nFibonacci Series (15 terms):");
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 15; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

class StringAnalyzerThread extends Thread {
    private String input;

    public StringAnalyzerThread(String input) {
        this.input = input;
    }

    public void run() {
        int vowels = 0, words = 1;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            if (c == ' ') {
                words++;
            }
        }
        System.out.println("\nString Analysis:");
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of words: " + words);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sn.nextLine();

        AlphabetThread t1 = new AlphabetThread();
        FibonacciThread t2 = new FibonacciThread();
        StringAnalyzerThread t3 = new StringAnalyzerThread(input);

        t1.start();
        t2.start();
        t3.start();
    }
}