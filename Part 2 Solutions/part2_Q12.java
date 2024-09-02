// Write a java program to create abstract class person derived two classes Employee and Worker from it. Use proper method to accept and display for the same. Employee(eno, ename, address), similar fields are worker.

import java.util.*;

abstract class Person {
    String name;
    String address;

    abstract void acceptDetails();

    abstract void displayDetails();
}

class Employee extends Person {
    int eno;

    void acceptDetails() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter th Employee Number : ");
        eno = sn.nextInt();
        sn.nextLine();
        System.out.println("Enter th Employee Name : ");
        name = sn.nextLine();
        System.out.println("Enter th Employee Address : ");
        address = sn.nextLine();
    }

    void displayDetails() {
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee Number is : " + eno);
        System.out.println("Employee Address is : " + address);
    }
}

class Worker extends Person {
    int wno;

    void acceptDetails() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter th Worker Number : ");
        wno = sn.nextInt();
        sn.nextLine();
        System.out.println("Enter th Worker Name : ");
        name = sn.nextLine();
        System.out.println("Enter th Worker Address : ");
        address = sn.nextLine();
    }

    void displayDetails() {
        System.out.println("Worker Number is : " + wno);
        System.out.println("Worker Name is : " + name);
        System.out.println("Worker Address is : " + address);
    }
}

public class part2_Q12 {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.displayDetails();

        System.out.println("");

        Worker wrk = new Worker();
        wrk.acceptDetails();
        wrk.displayDetails();
    }
}