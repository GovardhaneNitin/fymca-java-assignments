// Write a Java program to print the even and odd numbers from 1 to 20 by using 
// call to two different methods belongs same super class

class numberPrinter {
    public void printEvenNumbers() {
        System.out.print("Even Numbers : ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public void printOddNumbers() {
        System.out.print("Odd Numbers : ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}

class numberCategory extends numberPrinter {

}

public class part1_Q8 {
    public static void main(String args[]) {
        numberCategory number = new numberCategory();

        number.printEvenNumbers();
        number.printOddNumbers();
    }
}