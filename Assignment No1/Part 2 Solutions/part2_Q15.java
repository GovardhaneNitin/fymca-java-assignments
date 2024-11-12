// Write a program to calculate Simple Interest To be Paid based on given schedule.

// | Principal      | Period of Deposit | Interest Rate |
// |----------------|-------------------|---------------|
// | ≤ 10000        | ≤ 2 years         | 9%            |
// | ≤ 10000        | ≥ 2 years         | 10%           |
// | > 10000        | --                | 11%           |

import java.util.*;

public class part2_Q15 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the Principal Amount : ");
        int principal = sn.nextInt();

        System.out.print("Enter the Period of Deposit : ");
        int periodOfDeposit = sn.nextInt();

        int interestRate = 0;

        if(principal <= 10000 && periodOfDeposit <= 2) {
            interestRate = 9;
        } else if(principal <= 10000 && periodOfDeposit > 2) {
            interestRate = 10;
        } else if(principal > 10000) {
            interestRate = 11;
        }

        int simpleInterest = (principal * interestRate * periodOfDeposit) / 100;

        System.out.print("Simple Interest to be paid is : " + simpleInterest);
    }
}