// Write a Java Program to accept three numbers from the command line argument and 
// print the smallest number.

public class part2_Q3 {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if(num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + " is the Smallest Number");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + " is the Smallest Number");
        } else {
            System.out.print(num3 + " is the Smallest Number");
        }
        
    }
}