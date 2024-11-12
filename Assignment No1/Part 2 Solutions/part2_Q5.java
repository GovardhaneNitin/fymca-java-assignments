// Write a Java program which will accept a number from the command line argument and 
// check whether it is palindrome or not.

public class part2_Q5 {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        int reverseNumber = 0;

        int orignalNumber = num;

        while(num > 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num /= 10;
        }

        if(orignalNumber == reverseNumber) {
            System.out.print(orignalNumber + " is Palindrome Number");
        } else {
            System.out.print(orignalNumber + " is Not Palindrome Number");
        }
    }
}