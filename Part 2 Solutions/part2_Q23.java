// Write a program: 
// Define Class Employee. Define another two subclasses:
// (a) Temporary Employee Class (b) Permanent Employee Class
// i) Calculate  salary  for  temporary  employee  depending  upon  no.  of  hours 
// per month and overtime hours.  
// ii) Calculate salary for permanent employee depending upon no. of days per 
// month. 
// iii) Override calcsal() method  
// iv) Write appropriate constructors 

class Employee {
    String name;
    int empID;

    public Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public void calcsal() {
        System.out.println("Salary calculation for Employee.");
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
    }
}

class TemporaryEmployee extends Employee {
    int hoursWorked;
    int overtimeHours;
    int hourlyRate = 100;

    public TemporaryEmployee(String name, int empID, int hoursWorked, int overtimeHours) {
        super(name, empID);
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }
    
    public void calcsal() {
        double salary = (hoursWorked * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        System.out.println("Temporary Employee Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {
    int daysWorked;
    int dailyRate = 500;

    public PermanentEmployee(String name, int empID, int daysWorked) {
        super(name, empID);
        this.daysWorked = daysWorked;
    }

    public void calcsal() {
        int salary = daysWorked * dailyRate;
        System.out.println("Permanent Employee Salary: " + salary);
    }
}

public class part2_Q23 {
    public static void main(String[] args) {
        TemporaryEmployee tempEmp = new TemporaryEmployee("Jitesh Borse", 42, 160, 20);
        tempEmp.displayDetails();
        tempEmp.calcsal();

        System.out.println();

        PermanentEmployee permEmp = new PermanentEmployee("Nitin Govardhane", 37, 22);
        permEmp.displayDetails();
        permEmp.calcsal();
    }
}
