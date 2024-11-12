package student;

public class StudentInfo {
    private int rollNo;
    private String name;
    private String className;
    private double percentage;

    public void setStudentInfo(int rollNo, String name, String className, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage + "%");
    }
}
