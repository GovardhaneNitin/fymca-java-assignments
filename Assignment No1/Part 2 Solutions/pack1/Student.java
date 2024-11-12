package pack1;

import java.util.*;

public class Student {
    private String name;
    private int rollNo;

    public void readStudentInfo() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sn.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sn.nextInt();
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
