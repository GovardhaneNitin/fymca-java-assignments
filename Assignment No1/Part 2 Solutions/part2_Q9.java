// Write a Java program which will accept 3 X 4 matrix and print the row wise and column-wise addition of numbers. 

import java.util.*;

public class part2_Q9 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        int matrix[][] = new int[3][4];

        System.out.println("Enter the Matrix : ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                matrix[i][j] = sn.nextInt();
            }
        }

        for(int i=0; i<3; i++) {
            int rowSum=0;
            for(int j=0; j<4; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }

         for(int j=0; j<4; j++) {
            int colSum=0;
            for(int i=0; i<3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Col " + (j + 1) + ": " + colSum);
        }
    }
}