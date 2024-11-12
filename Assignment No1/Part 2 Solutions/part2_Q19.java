// Write a java program to create a package named student. Define class studentlnfo with method to display information about student such as rollno, name, class and percentage. Create another class studentPer with method to find percentage of the student. Accept student details like rollno, name, class and marks of three subject from user.

import student.StudentInfo;
import student.StudentPer;

public class part2_Q19 {
    public static void main(String args[]) {
        StudentPer studentPer = new StudentPer();
        studentPer.acceptStudentDetails();
        double percentage = studentPer.calculatePercentage();

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStudentInfo(studentPer.getRollNo(), studentPer.getName(), studentPer.getClassName(), percentage);

        System.out.println("Student Information:");
        studentInfo.displayStudentInfo();
    }
}
