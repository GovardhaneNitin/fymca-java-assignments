// Write A java program to accept n number of city. Insert into array list collection and display the content of the same array list, remove all this element use (clear ()) method

import java.util.*;

public class part2_Q20 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        ArrayList<String> cityList = new ArrayList<>();

        System.out.print("Enter the number of cities you want to add: ");
        int n = sn.nextInt();
        sn.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            String city = sn.nextLine();
            cityList.add(city);
        }
        
        System.out.println("Cities in the ArrayList:");
        for (String city : cityList) {
            System.out.println(city);
        }
        
        cityList.clear();
        
        System.out.println("Cities in the ArrayList after clear(): " + cityList);
    }
}