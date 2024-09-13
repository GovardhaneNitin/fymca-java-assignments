// Define class Bank with data members as Cust_name, Ac_no and balance. Use constructors and method withdraw and deposit. Print the balance according to operation.

import java.util.*;

class Bank {
    String custName;
    int accNo;
    double balance;

    Bank(String custName, int accNo, double balance) {
        this.custName = custName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class part2_Q7 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter Customer Name: ");
        String custName = sn.nextLine();
        
        System.out.print("Enter Account Number: ");
        int accNo = sn.nextInt();
        
        System.out.print("Enter Initial Balance: ");
        double balance = sn.nextDouble();
        
        Bank account = new Bank(custName, accNo, balance);
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sn.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sn.nextDouble();
        
        account.withdraw(withdrawAmount);
        
        account.displayBalance();
    }
}
