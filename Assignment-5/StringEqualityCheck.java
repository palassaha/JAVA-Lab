// Write a Java program to compare two Strings and find if they are equal or not.

import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the two strings are equal
        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}
