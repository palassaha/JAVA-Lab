// Write a Java program to calculate a Factorial of a number. (using Scanner)

import java.util.Scanner;

public class Factorial {
    public void calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            Factorial fact = new Factorial();
            fact.calculateFactorial(number);
        }

        scanner.close();
    }
}