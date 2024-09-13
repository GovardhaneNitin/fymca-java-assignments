// Define class Staff with data members as name, birth-date, designation and salary Use constructors and method display () –which will display details of Staff. Create two objects of Staff and Print the name of staff having highest salary.

import java.util.*;

class Staff {
    String name;
    String birthDate;
    String designation;
    double salary;

    Staff(String name, String birthDate, String designation, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Birth date : " + birthDate);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }
}

public class part2_Q6 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter details for Staff 1:");
        System.out.print("Name: ");
        String name1 = sn.nextLine();
        System.out.print("Birth Date (dd-mm-yyyy): ");
        String birthDate1 = sn.nextLine();
        System.out.print("Designation: ");
        String designation1 = sn.nextLine();
        System.out.print("Salary: ");
        double salary1 = sn.nextDouble();
        sn.nextLine();

        System.out.println("Enter details for Staff 2:");
        System.out.print("Name: ");
        String name2 = sn.nextLine();
        System.out.print("Birth Date (dd-mm-yyyy): ");
        String birthDate2 = sn.nextLine();
        System.out.print("Designation: ");
        String designation2 = sn.nextLine();
        System.out.print("Salary: ");
        double salary2 = sn.nextDouble();

        Staff staff1 = new Staff(name1, birthDate1, designation1, salary1);
        Staff staff2 = new Staff(name2, birthDate2, designation2, salary2);

        System.out.println("Details of Staff 1:");
        staff1.display();
        System.out.println("Details of Staff 2:");
        staff2.display();

        if (staff1.salary > staff2.salary) {
            System.out.println(staff1.name + " has the Highest Salary");
        } else if (staff1.salary < staff2.salary) {
            System.out.println(staff2.name + " has the Highest Salary");
        } else {
            System.out.println("Both have equal salary.");
        }
    }
}

