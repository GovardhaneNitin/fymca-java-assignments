// Define class Staff with data members as name, birth-date, designation and salary Use constructors and method display () –which will display details of Staff. Create two objects of Staff and Print the name of staff having highest salary.

class staff {
    String name;
    String birthDate;
    String designation;
    double salary;

    staff(String name, String birthDate, String designation, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Birth date : " + birthDate);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }
}

class part2_Q6 {
    public static void main(String args[]) {
        staff staff1 = new staff("Nitin", "30-10-2000", "Manager", 80000);
        staff staff2 = new staff("Hemant", "31-12-2002", "Developer", 70000);

        staff1.display();
        System.out.println("");
        staff2.display();

        if(staff1.salary > staff2.salary) {
            System.out.println(staff1.name + " has the Highest Salary");
        } else {
            System.out.println(staff2.name + " has the Highest Salary");
        }
    }
}
