// Write an application to define an interface ‘CalculateResult’ with methods CalculateTotal(), CalculatePercentage() and CalculateGrade(). Write student class with implementation of ‘CalculateResult’. Create student object and display total marks, percentage and grade of student.

import java.util.*;

interface CalculateResult {
    void CalculateTotal();
    void CalculatePercentage();
    void CalculateGrade();
}

class Student implements CalculateResult {
    String name;
    int rollNo;
    int marks1, marks2, marks3;
    int totalMarks;
    double percentage;
    String grade;

    Student(String name, int rollNo, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void CalculateTotal() {
        totalMarks = marks1 + marks2 + marks3;
    }

    public void CalculatePercentage() {
        percentage = (totalMarks / 3.0);
    }

    public void CalculateGrade() {
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class part2_Q22 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sn.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sn.nextInt();
        System.out.print("Enter Marks for Subject 1: ");
        int marks1 = sn.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        int marks2 = sn.nextInt();
        System.out.print("Enter Marks for Subject 3: ");
        int marks3 = sn.nextInt();

        Student student = new Student(name, rollNo, marks1, marks2, marks3);

        student.CalculateTotal();
        student.CalculatePercentage();
        student.CalculateGrade();

        student.displayStudentDetails();
    }
}
