// Create student class having data member (roll no, name, percentage) accept values and display details (use command line argument). 

class student {
    String name;
    int roll_no;
    double percentage;

    public void acceptStudentDetails(String args[]) {
        name = args[0];
        roll_no = Integer.parseInt(args[1]);
        percentage = Double.parseDouble(args[2]);
    }

    public void displayStudentDetails() {
        System.out.println("Name of Student is : " + name);
        System.out.println("Roll No of Student is : " + roll_no);
        System.out.println("Percentage of Student is : " + percentage);
    }
}

class part2_Q11 {
    public static void main(String args[]) {
        student std = new student();

        std.acceptStudentDetails(args);
        std.displayStudentDetails();
    }
}