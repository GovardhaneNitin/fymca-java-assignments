// Write a Java program to count the number of even and odd elements in a given 
// array

public class part1_Q11 {
    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count : " + evenCount);
        System.out.print("Odd Count : " + oddCount);
    }
}