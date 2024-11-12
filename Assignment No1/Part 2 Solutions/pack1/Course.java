package pack1;

import java.util.*;

public class Course {
    private String courseName;
    private int courseDuration;

    public void readCourseInfo() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        courseName = sn.nextLine();
        System.out.print("Enter Course Duration (in months): ");
        courseDuration = sn.nextInt();
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " months");
    }
}
