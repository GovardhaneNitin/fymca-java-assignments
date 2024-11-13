// Write an application which will accept a number from command line. If number
// is not divisible by 7, then throw “notDivisibleBy7” user defined Exception.

// Custom exception class for divisibility check
class NotDivisibleBy7Exception extends Exception {
    public NotDivisibleBy7Exception(String message) {
        super(message);
    }
}

public class Question5 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException(
                        "No input provided. Please enter a number as a command line argument.");
            }

            int number = Integer.parseInt(args[0]);
            checkDivisibility(number);

            System.out.println(number + " is divisible by 7.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure you enter a numeric value.");
        } catch (NotDivisibleBy7Exception e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check divisibility by 7
    public static void checkDivisibility(int number) throws NotDivisibleBy7Exception {
        if (number % 7 != 0) {
            throw new NotDivisibleBy7Exception(number + " is not divisible by 7.");
        }
    }
}

// OUTPUT:
// java Question5 17
// Error: 17 is not divisible by 7.
// java Question5 49
// 49 is divisible by 7.