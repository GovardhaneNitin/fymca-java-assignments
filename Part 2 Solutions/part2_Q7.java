// Define class Bank with data members as Cust_name, Ac_no and balance. Use constructors and method withdraw and deposit. Print the balance according to operation.

class bank {
    String custName;
    int accNo;
    double balance;

    bank(String custName, int accNo, double balance) {
        this.custName = custName;
        this.accNo = accNo;
        this.balance = balance;
    } 

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited : " + amount);
        } else {
            System.out.println("Invalid Amount Deposited");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdraw : " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance is : " + balance);
    }
}

class part2_Q7 {
    public static void main(String args[]) {
        bank account1 = new bank("Nitin", 1272240332, 100000);

        account1.deposit(20000);
        account1.withdraw(10000);
        account1.displayBalance();
    }
}