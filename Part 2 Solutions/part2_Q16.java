// Write a program: Create two packages, pack1 contains two classes as student & course. Both classes have method to read corresponding Information. Pack2 contains class college with method accept( ). Write a java program to display all information.

import pack2.College;

public class part2_Q16 {
    public static void main(String args[]) {
        College college = new College();
        college.accept();
        college.displayAllInfo();
    }
}