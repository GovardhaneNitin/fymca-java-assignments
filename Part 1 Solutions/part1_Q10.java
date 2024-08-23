// Write a Java program to swap the first and last elements of an array and create a 
// new array

import java.util.*;

public class part1_Q10 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.print("Before Swapping the Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.print("After Swapping the Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}