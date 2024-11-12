// Write a Java program to add two numbers without using any arithmetic 
// operators

public class part1_Q13 {

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
