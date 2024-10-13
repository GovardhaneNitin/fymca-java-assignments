// Write a program: Create an interface Manager with methods show details.
// Implement the interface for HRManager class. In main class create the objects
// for the concrete classes HRManager and call the method.

import java.util.*;

interface Manager {
    void showDetails();
}

class HRManager implements Manager {
    private String name;
    private int employeeId;
    private String department;

    public HRManager(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void showDetails() {
        System.out.println("HR Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class part2_Q24 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter HR Manager Name: ");
        String name = sn.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeId = sn.nextInt();

        sn.nextLine();
        System.out.print("Enter Department: ");
        String department = sn.nextLine();

        HRManager hrManager = new HRManager(name, employeeId, department);

        hrManager.showDetails();

    }
}
