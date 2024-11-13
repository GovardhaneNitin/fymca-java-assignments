// Write a Java program to accept Username and Password as email-id address of a
// Employee, Validate Password and through User defined exception called
// InvalidEmailException to check whether in email id @ symbol, .com, .co.in is
// present or not also email id doesn’t starts with digit.

// If there is no exception accept the 10 employee information and their
// BasicSalary based on Basic Salary calculate employee gross salary and
// net_salary.

// Display the employee details in descending order according to their
// net_salary

import java.util.*;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class Employee {
    String email;
    String password;
    double basicSalary;
    double grossSalary;
    double netSalary;

    public Employee(String email, String password, double basicSalary) {
        this.email = email;
        this.password = password;
        this.basicSalary = basicSalary;
        calculateSalaries();
    }

    private void calculateSalaries() {
        // Assuming some calculations for gross and net salary (e.g., taxes, benefits)
        this.grossSalary = this.basicSalary + (this.basicSalary * 0.2); // 20% benefits
        this.netSalary = this.grossSalary - (this.grossSalary * 0.1); // 10% tax deduction
    }
}

public class Question2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            try {
                System.out.print("Enter Email: ");
                String email = sn.nextLine();
                validateEmail(email);

                System.out.print("Enter Password: ");
                String password = sn.nextLine();

                System.out.print("Enter Basic Salary: ");
                double basicSalary = sn.nextDouble();
                sn.nextLine();

                employees.add(new Employee(email, password, basicSalary));
                i++;
            } catch (InvalidEmailException e) {
                System.out.println("Invalid email: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number for salary.");
                sn.nextLine();
            }
        }

        employees.sort((e1, e2) -> Double.compare(e2.netSalary, e1.netSalary));

        System.out.println("Employee details sorted by net salary (descending):");
        for (Employee emp : employees) {
            System.out.println(
                    "Email: " + emp.email + ", Gross Salary: " + emp.grossSalary + ", Net Salary: " + emp.netSalary);
        }
    }

    private static void validateEmail(String email) throws InvalidEmailException {
        if (!email.matches("^[^0-9][\\w.-]*@(\\w+\\.)+(com|co\\.in)$")) {
            throw new InvalidEmailException(
                    "Email must contain @ and end with .com or .co.in, and cannot start with a digit.");
        }
    }
}

// OUTPUT:
// Enter Email: nitin@gmail.com
// Enter Password: 1234
// Enter Basic Salary: 100000
// Enter Email: jitesh@gmail.com
// Enter Password: 123
// Enter Basic Salary: 70000
// Enter Email: hemant@gmail.com
// Enter Password: aditya'
// Enter Basic Salary: 20000
// Enter Email: aditya
// Invalid email: Email must contain @ and end with .com or .co.in, and cannot
// start with a digit.
// Enter Email: aditya@gmail.com
// Enter Password: 56432
// Enter Basic Salary: 30000
// Enter Email: gaurav@gmail.com
// Enter Password: 78653
// Enter Basic Salary: 45000
// Enter Email: vipul@gmail.com
// Enter Password: 7865
// Enter Basic Salary: 60000
// Enter Email: aniket@gmail.com
// Enter Password: aniket
// Enter Basic Salary: 50000
// Enter Email: vedant@gmail.com
// Enter Password: vedant
// Enter Basic Salary: 80000
// Enter Email: rakesh@gmail.com
// Enter Password: rakesh12
// Enter Basic Salary: 66000
// Enter Email: lokesh@gmail.com
// Enter Password: 10000
// Enter Basic Salary: 10000
// Employee details sorted by net salary (descending):
// Email: nitin@gmail.com, Gross Salary: 120000.0, Net Salary: 108000.0
// Email: vedant@gmail.com, Gross Salary: 96000.0, Net Salary: 86400.0
// Email: jitesh@gmail.com, Gross Salary: 84000.0, Net Salary: 75600.0
// Email: rakesh@gmail.com, Gross Salary: 79200.0, Net Salary: 71280.0
// Email: vipul@gmail.com, Gross Salary: 72000.0, Net Salary: 64800.0
// Email: aniket@gmail.com, Gross Salary: 60000.0, Net Salary: 54000.0
// Email: gaurav@gmail.com, Gross Salary: 54000.0, Net Salary: 48600.0
// Email: aditya@gmail.com, Gross Salary: 36000.0, Net Salary: 32400.0
// Email: hemant@gmail.com, Gross Salary: 24000.0, Net Salary: 21600.0
// Email: lokesh@gmail.com, Gross Salary: 12000.0, Net Salary: 10800.0