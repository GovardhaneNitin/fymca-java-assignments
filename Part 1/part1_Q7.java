// Write a Java program to count the letters, spaces, numbers, and other characters of an input string

import java.util.*;

public class part1_Q7 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sn.nextLine();

        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {
                letters++;
            } else if(Character.isWhitespace(ch)) {
                spaces++;
            } else if(Character.isDigit(ch)) {
                numbers++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);

    }
}