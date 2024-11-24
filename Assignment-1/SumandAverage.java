// Write a Java Program to calculate sum and average of two numbers (Use any data type). (Command Line Input).

public class SumandAverage {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command-line arguments.");
            return;
        }

        // Parse the command-line arguments to double
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Calculate sum and average
        double sum = num1 + num2;
        double average = sum / 2;

        // Display the results
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
