// Write a Program: Write abstract class staff with abstract method, calculate salary() and instance method Lint - Data ( int no, string name) Write Typist class as sub - class of staff with speed as instance variable, if speed is less than 40, then salary 4000 else 5000. Write main class to implement above classes.

abstract class Staff {
    int no;
    String name;

    public void LintData(int no, String name) {
        this.no = no;
        this.name = name;
    }

    abstract int calculateSalary();
}

class Typist extends Staff {
    int speed;

    public Typist(int no, String name, int speed) {
        LintData(no, name);
        this.speed = speed;
    }

    int calculateSalary() {
        return speed < 40 ? 4000 : 5000;
    }
}

public class part2_Q26 {
    public static void main(String[] args) {
        Typist typist1 = new Typist(1, "Nitin Govardhane", 35);
        Typist typist2 = new Typist(2, "Jitesh Borse", 45);

        System.out.println(typist1.name + " Typist 1 Salary: " + typist1.calculateSalary());
        System.out.println(typist2.name + " Typist 2 Salary: " + typist2.calculateSalary());
    }
}