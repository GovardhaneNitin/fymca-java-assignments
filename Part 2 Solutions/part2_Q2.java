// Accept a number from the command line argument and print the multiplication table of 
// it.

public class part2_Q2 {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        for(int i=1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}