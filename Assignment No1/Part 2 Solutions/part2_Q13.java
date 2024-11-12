// Define  class student with attribute rollno , name.  Inherit student class in  a class called Marks, with attributes marks of Java Theory and Java Practical. Define method setMark() in  Mark  class  marks  and  set  the  total  of  Java  marks  in  setmark() method, Show he Java Marks in main class called FinalMarks. (Take the Marks from system.)

import java.util.*;

class Student {
    int rollno;
    String name;
}

class Marks extends Student {
    int javaTheoryMarks;
    int javaPracticalMarks;
    int totalMarks;

    void setMark(int theory, int practical) {
        javaTheoryMarks = theory;
        javaPracticalMarks = practical;
        totalMarks = theory + practical;
    }

    void displayMarks() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Java Theory Marks: " + javaTheoryMarks);
        System.out.println("Java Practical Marks: " + javaPracticalMarks);
        System.out.println("Total Java Marks: " + totalMarks);
    }
}

public class part2_Q13 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        Marks studentMarks = new Marks();

        System.out.println("Enter Student Roll Number : ");
        studentMarks.rollno = sn.nextInt();
        sn.nextLine();

        System.out.println("Enter Student Name : ");
        studentMarks.name = sn.nextLine();

        System.out.print("Enter Java Theory Marks: ");
        int theory = sn.nextInt();

        System.out.print("Enter Java Practical Marks: ");
        int practical = sn.nextInt();

        studentMarks.setMark(theory, practical);
        studentMarks.displayMarks();
    }
}