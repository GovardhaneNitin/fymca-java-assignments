// Accept a number from the command line argument and check whether it is prime or 
// not.

public class part2_Q4 {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        if (num <= 1) {
            System.out.print(num + " is Not a Prime Number");
            return;
        }

        if (num == 2) {
            System.out.print(num + " is a Prime Number");
            return;
        }

        boolean isPrimeNum = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrimeNum = false;
                break;
            }
        }

        if (isPrimeNum) {
            System.out.print(num + " is a Prime Number");
        } else {
            System.out.print(num + " is Not a Prime Number");
        }
    }
}
