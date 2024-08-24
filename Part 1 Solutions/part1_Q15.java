// Write a java program to Compute the Sum of the Principal and Secondary 
// Diagonals elements of a Matrix

import java.util.*;

public class part1_Q15 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the Size of Matrix : ");
        int n = sn.nextInt();

        int matrix [][] = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sn.nextInt();
            }
        }

        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i=0; i<n; i++) {
            principalDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n-i-1];
        }

        System.out.println("Principal Diagonal Sum is : " + principalDiagonalSum);
        System.out.print("Secondary Diagonal Sum is : " + secondaryDiagonalSum);

    }
}