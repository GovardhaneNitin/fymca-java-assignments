// Write a program: Write an interface to define method to calculate compound
// Interest ( ), which takes three arguments, First— amount, second— no. of
// years & three—rate of interest. Implement this interface to demonstrate the
// functionality.

import java.util.*;

interface InterestCalculator {
    double calculateCompoundInterest(double principal, int years, double rate);
}

class CompoundInterestCalculator implements InterestCalculator {
    public double calculateCompoundInterest(double principal, int years, double rate) {
        double amount = principal * Math.pow((1 + rate / 100), years);
        double compoundInterest = amount - principal;
        return compoundInterest;
    }
}

public class part2_Q27 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sn.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = sn.nextInt();

        System.out.print("Enter the rate of interest: ");
        double rate = sn.nextDouble();

        CompoundInterestCalculator ciCalculator = new CompoundInterestCalculator();

        double compoundInterest = ciCalculator.calculateCompoundInterest(principal, years, rate);

        System.out.println("The compound interest after " + years + " years is: " + compoundInterest);

    }
}
