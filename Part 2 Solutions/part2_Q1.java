// Write a Java Program to accept two numbers and a character(+,-,*,/) from the command 
// line argument and print the result according to character. (Use switch)

public class part2_Q1 {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char operator = args[2].charAt(0);

        switch(operator) {
            case '+':
                System.out.print("Result : " + (num1 + num2));
                break;
            case '-':
                System.out.print("Result : " + (num1 - num2));
                break;
            case '*':
                System.out.print("Result : " + (num1 * num2));
                break;
            case '/':
                System.out.print("Result : " + (num1 / num2));
                break;
        }
    }
}