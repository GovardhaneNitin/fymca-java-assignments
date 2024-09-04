package student;

import java.util.*;

public class StudentPer {
    private int rollNo;
    private String name;
    private String className;
    private int marks1, marks2, marks3;

    public void acceptStudentDetails() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sn.nextInt();
        sn.nextLine();
        System.out.print("Enter Name: ");
        name = sn.nextLine();
        System.out.print("Enter Class: ");
        className = sn.nextLine();
        System.out.print("Enter Marks of Subject 1: ");
        marks1 = sn.nextInt();
        System.out.print("Enter Marks of Subject 2: ");
        marks2 = sn.nextInt();
        System.out.print("Enter Marks of Subject 3: ");
        marks3 = sn.nextInt();
    }

    public double calculatePercentage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
