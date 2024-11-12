// Define a class employee having member variable – Emp_No, Emp_Name and Designation. Define another class salary which, has been inherited from class employee,  having  member  variable  Basic_Sal.  Write  appropriate  method  which  will calculate  Basic_Sal.  Depending  on  designation  and  constructor  to  initialize  member variable

class Employee {
    int Emp_No;
    String Emp_Name;
    String Designation;

    public Employee(int empNo, String empName, String designation) {
        this.Emp_No = empNo;
        this.Emp_Name = empName;
        this.Designation = designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Number: " + Emp_No);
        System.out.println("Employee Name: " + Emp_Name);
        System.out.println("Designation: " + Designation);
    }
}

class Salary extends Employee {
    double Basic_Sal;

    public Salary(int empNo, String empName, String designation) {
        super(empNo, empName, designation);

        calculateSalary();
    }

    public void calculateSalary() {
        switch (Designation.toLowerCase()) {
            case "manager":
                Basic_Sal = 80000;
                break;
            case "developer":
                Basic_Sal = 60000;
                break;
            case "analyst":
                Basic_Sal = 50000;
                break;
            case "intern":
                Basic_Sal = 20000;
                break;
            default:
                Basic_Sal = 30000;
        }
    }

    public void displaySalaryDetails() {
        displayEmployeeDetails();
        System.out.println("Basic Salary: " + Basic_Sal);
    }
}

public class part2_Q14 {
    public static void main(String args[]) {
        Salary emp1 = new Salary(101, "Nitin", "Developer");
        emp1.displaySalaryDetails();

        System.out.println();

        Salary emp2 = new Salary(102, "Jitesh", "Intern");
        emp2.displaySalaryDetails();
    }
}
