// Write a Java Program to Demonstrate use of anonymous inner class. The outer
// class has the employee name, basic salary, and grand salary. where

// grand salary = basic salary + HRA + DA

// The inner class keeps the DA amount calculated for last three years with
// percentage of DA on basic salary is as 50%, 75% and 100% for these
// consecutive years. show the employees grand salary of three years in
// appropriate format.

import java.util.*;

interface SalaryCalculator {
    void calculateAndDisplay();
}

public class Employee {
    private String employeeName;
    private double basicSalary;

    public Employee(String name, double salary) {
        this.employeeName = name;
        this.basicSalary = salary;
    }

    public void displayGrandSalaries() {
        SalaryCalculator calculator = new SalaryCalculator() {
            @Override
            public void calculateAndDisplay() {
                double[] daPercentages = { 50, 75, 100 }; // DA rates for three consecutive years
                System.out.println("Grand Salaries for " + employeeName + ":");

                for (double daPercentage : daPercentages) {
                    double da = basicSalary * daPercentage / 100;
                    double hra = basicSalary * 0.10; // Assume HRA is 10% of the basic
                    double grandSalary = basicSalary + hra + da; // Calculate grand salary

                    System.out.printf("Year with DA at %.0f%%: Grand Salary = %.2f\n", daPercentage, grandSalary);
                }
            }
        };
        calculator.calculateAndDisplay();
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = sn.nextLine();
        System.out.print("Enter the employee's basic salary: ");
        double salary = sn.nextDouble();

        Employee employee = new Employee(name, salary);
        employee.displayGrandSalaries();
    }
}
