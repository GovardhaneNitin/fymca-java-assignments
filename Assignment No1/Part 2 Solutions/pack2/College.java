package pack2;

import pack1.Student;
import pack1.Course;

public class College {
    private Student student;
    private Course course;

    public void accept() {
        student = new Student();
        course = new Course();

        System.out.println("Enter Student Information:");
        student.readStudentInfo();

        System.out.println("Enter Course Information:");
        course.readCourseInfo();
    }

    public void displayAllInfo() {
        System.out.println(" ");
        System.out.println("--- College Information ---");
        student.displayStudentInfo();
        course.displayCourseInfo();
    }
}
