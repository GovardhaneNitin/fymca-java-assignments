// Write an application that reads a series of strings & output only those
// strings beginning with the letter 'J'

import java.util.*;

public class slip2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter strings, one per line (type 'stop' to finish):");

        // Read strings from the user until 'stop' is entered
        while (true) {
            String input = sn.nextLine();
            if ("stop".equalsIgnoreCase(input)) {
                break;
            }
            // Check if the string starts with 'J' and output it
            if (input.startsWith("J")) {
                System.out.println(input);
            }
        }
    }
}
