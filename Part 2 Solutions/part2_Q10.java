// Write a java program to print multiplication of Matrix. 

import java.util.*;

public class part2_Q10 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the number of rows in the first matrix: ");
        int rowsA = sn.nextInt();
        System.out.println("Enter the number of columns in the first matrix: ");
        int colsA = sn.nextInt();

        System.out.println("Enter the number of rows in the second matrix: ");
        int rowsB = sn.nextInt();
        System.out.println("Enter the number of columns in the second matrix: ");
        int colsB = sn.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sn.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sn.nextInt();
            }
        }

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("The resulting matrix after multiplication is:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
