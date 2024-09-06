// Write a Java program to read the lines from console until the given line is “good bye”. Display those lines which contain the word “India” or “Hello”. Also count the number of lines in which pattern is found.

import java.util.*;

public class part2_Q21 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter lines of text (type 'good bye' to end):");

        while (true) {
            String line = sn.nextLine();
            
            if (line.equalsIgnoreCase("good bye")) {
                break;
            }
            
            if (line.contains("India") || line.contains("Hello")) {
                System.out.println(line);
                count++;
            }
        }

        System.out.println("Number of lines containing 'India' or 'Hello': " + count);
    }
}
