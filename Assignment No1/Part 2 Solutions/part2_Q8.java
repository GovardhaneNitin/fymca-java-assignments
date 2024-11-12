// Accept 5 numbers from command line argument and print it in the ascending order. (Use array)

public class part2_Q8 {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);

        int numbers[] = {num1, num2, num3, num4, num5};

        System.out.print("Before Sorting Numbers are : ");
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("");

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=0; j<numbers.length-i-1; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.print("After Sorting Numbers are : ");
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}