// Write a Program: Create class voter with attributes votername,
// voteraddress,votercontactNo Voteraddhar, etc. Accept details of 'IO' voters
// in an array of objects and display the accepted details.

import java.util.*;

class Voter {
    private String voterName;
    private String voterAddress;
    private String voterContactNo;
    private String voterAadhar;

    public Voter(String voterName, String voterAddress, String voterContactNo, String voterAadhar) {
        this.voterName = voterName;
        this.voterAddress = voterAddress;
        this.voterContactNo = voterContactNo;
        this.voterAadhar = voterAadhar;
    }

    public void displayDetails() {
        System.out.println("Voter Name: " + voterName);
        System.out.println("Voter Address: " + voterAddress);
        System.out.println("Voter Contact No: " + voterContactNo);
        System.out.println("Voter Aadhar: " + voterAadhar);
        System.out.println("---------------------------");
    }
}

public class part2_Q25 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter number of voters: ");
        int numberOfVoters = sn.nextInt();
        sn.nextLine();

        Voter[] voters = new Voter[numberOfVoters];

        for (int i = 0; i < numberOfVoters; i++) {
            System.out.println("\nEnter details for Voter " + (i + 1) + ":");

            System.out.print("Enter Voter Name: ");
            String voterName = sn.nextLine();

            System.out.print("Enter Voter Address: ");
            String voterAddress = sn.nextLine();

            System.out.print("Enter Voter Contact No: ");
            String voterContactNo = sn.nextLine();

            System.out.print("Enter Voter Aadhar: ");
            String voterAadhar = sn.nextLine();

            voters[i] = new Voter(voterName, voterAddress, voterContactNo, voterAadhar);
        }

        System.out.println("\nVoter Details:");
        for (int i = 0; i < numberOfVoters; i++) {
            voters[i].displayDetails();
        }

    }
}
