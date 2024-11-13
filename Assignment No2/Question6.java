// Accept a string from command line, if the string is in uppercase then throw
// user defined exception.

class UpperCaseException extends Exception {
    public UpperCaseException(String message) {
        super(message);
    }
}

public class Question6 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException(
                        "No input provided. Please enter a string as a command line argument.");
            }

            String input = args[0];
            checkUpperCase(input);

            System.out.println("The input string is not in uppercase: " + input);

        } catch (UpperCaseException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkUpperCase(String input) throws UpperCaseException {
        if (input.equals(input.toUpperCase())) {
            throw new UpperCaseException("The input string should not be in uppercase.");
        }
    }
}

// OUTPUT:
// java Question6 NITIN
// Error: The input string should not be in uppercase.