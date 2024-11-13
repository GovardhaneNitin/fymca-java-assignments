// Write a java program which stores the username and password in two variables.
// If username and password are not same, then raise exception “Invalid Password
// ” With appropriate message.

import java.util.*;

// Custom exception for invalid password
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String username = sn.nextLine();
            System.out.print("Enter Password: ");
            String password = sn.nextLine();

            validateCredentials(username, password);
            System.out.println("Login successful!");

        } catch (InvalidPasswordException e) {
            System.out.println("Login error: " + e.getMessage());
        }
    }

    // Method to validate username against password
    public static void validateCredentials(String username, String password) throws InvalidPasswordException {
        if (!username.equals(password)) {
            throw new InvalidPasswordException("Username and password must be the same.");
        }
    }
}

// OUTPUT:
// Enter Username: nitin
// Enter Password: 12345
// Login error: Username and password must be the same.

// Enter Username: nitin
// Enter Password: nitin
// Login successful!